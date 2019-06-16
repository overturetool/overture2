package org.overturetool.cgisa.transformations;

import org.overture.cgisa.isair.analysis.DepthFirstAnalysisIsaAdaptor;
import org.overture.codegen.ir.*;
import org.overture.codegen.ir.analysis.AnalysisException;
import org.overture.codegen.ir.declarations.*;
import org.overture.codegen.ir.expressions.AAndBoolBinaryExpIR;
import org.overture.codegen.ir.expressions.AApplyExpIR;
import org.overture.codegen.ir.expressions.AEqualsBinaryExpIR;
import org.overture.codegen.ir.expressions.AIdentifierVarExpIR;
import org.overture.codegen.ir.expressions.ANewExpIR;
import org.overture.codegen.ir.expressions.ANotImplementedExpIR;
import org.overture.codegen.ir.expressions.SVarExpBase;
import org.overture.codegen.ir.patterns.AIdentifierPatternIR;
import org.overture.codegen.ir.types.ABoolBasicTypeIR;
import org.overture.codegen.ir.types.AMethodTypeIR;
import org.overture.codegen.trans.assistants.TransAssistantIR;
import org.overturetool.cgisa.IsaGen;
import org.overturetool.cgisa.utils.IsaInvNameFinder;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IsaFuncDeclConv extends DepthFirstAnalysisIsaAdaptor {


    private final AModuleDeclIR vdmToolkitModuleIR;
    private final Map<String, AFuncDeclIR> isaFuncDeclIRMap;
    
    public IsaFuncDeclConv(IRInfo info, TransAssistantIR t, AModuleDeclIR vdmToolkitModuleIR) {
        this.vdmToolkitModuleIR = vdmToolkitModuleIR;

        this.vdmToolkitModuleIR.getDecls()
                .stream()
                .filter(d -> {
                    if (d instanceof ATypeDeclIR)
                        return true;
                    else
                        return false;
                }).map(d -> (ATypeDeclIR) d)
                .collect(Collectors.toMap(x -> ((ANamedTypeDeclIR) x.getDecl()).getName().getName(), x -> x));
        
        this.isaFuncDeclIRMap = this.vdmToolkitModuleIR.getDecls().stream().filter(d ->
        {
            if (d instanceof AFuncDeclIR)
                return true;
            else
                return false;
        }).map(d -> (AFuncDeclIR) d).collect(Collectors.toMap(x -> x.getName(), x -> x));

        
    }
    
   
    // Transform AFuncDeclIR
    @Override
    public void caseAFuncDeclIR(AFuncDeclIR x) throws AnalysisException {
    	super.caseAFuncDeclIR(x);
    	//we need to stop post conditions of postconditions of post conditions... being formed
    	if (!x.getName().contains("inv") && 
    			!x.getName().contains("post") && !x.getName().contains("pre"))
    	{
	    	
	    	if (x.parent() instanceof AStateDeclIR)
	    	{
	    		transStateInit(x);
	    		
	    	}
	    	else 
	    	{
	    		transformPreConditions(x);
		    	
		    	transformPostConditions(x);
		    	
		    	// If no parameter function set params to null to make this more concrete for velocity
		    	if (x.getFormalParams().size() == 0) 
		    	{
		    		x.getMethodType().setParams(null);
		    	}
		    	
		    	formatIdentifierPatternVars(x);
		    	if (x.getImplicit()) removeFromAST(x);
	    	}
    	
    	
    	
    	}
    }
    
    private void transStateInit(AFuncDeclIR node) {
    	AStateDeclIR st = node.getAncestor(AStateDeclIR.class);
    	
    	AMethodTypeIR methodType = new AMethodTypeIR();
    	
    	
    	st.getFields().forEach(f -> methodType.getParams().add(f.getType().clone()));
    	methodType.setResult(new ABoolBasicTypeIR());
    	
    	AFuncDeclIR postInit = new AFuncDeclIR();
    	postInit.setMethodType(methodType.clone());    	
    	postInit.setName("post_"+node.getName());
    	
    	AApplyExpIR app = new AApplyExpIR();
    	AIdentifierVarExpIR root = new AIdentifierVarExpIR();
    	root.setName("inv_"+st.getName());
    	root.setType(IsaGen.funcGenHistoryMap.get("inv_"+st.getName()).getMethodType().clone());
    	app.setRoot(root);
    	
    	AIdentifierVarExpIR arg = new AIdentifierVarExpIR();
    	arg.setName(node.getName());
    	arg.setType(node.getMethodType().clone());
    	app.getArgs().add(arg.clone());
    	
    	postInit.setBody(app.clone());
        addToAST(postInit.clone(), node.clone());
		
	}


	private void removeFromAST(AFuncDeclIR x) {
    	// Insert into AST
        AModuleDeclIR encModule = x.getAncestor(AModuleDeclIR.class);
        if(encModule != null)
        {
            encModule.getDecls().remove(x);
        }
		
	}

    private void addToAST(INode node, INode parent) {
    	// Insert into AST
        AModuleDeclIR encModule = parent.getAncestor(AModuleDeclIR.class);
        if(encModule != null)
        {
            encModule.getDecls().add((SDeclIR) node);
        }

		
	}
    

	private void transformPreConditions (AFuncDeclIR node) throws AnalysisException {
    	AMethodTypeIR mt = node.getMethodType().clone();
    	
    	/*The final pre condition that will be populated with a generated pre condition,
    	a modeller written pre condition or both or neither.*/
    	AFuncDeclIR finalPreCondition = null;
    	
    	//Generated pre condition will be populated if one can be generated
    	AFuncDeclIR generatedPre = null;
    	
        // If there are parameters with which to build a pre condition then build one
    	if (!mt.getParams().isEmpty())
    	{
	    	generatedPre = createPre(node.clone());	    
	    	//Copy across all generated properties into final pre condition.
	    	finalPreCondition = generatedPre;
	    	
    	}
	    	
	    	// If there are pre written pre conditions and one was generated add them both
	    if (node.getPreCond() != null && generatedPre != null)
	    {
	    	AFuncDeclIR preCond_ = (AFuncDeclIR) node.getPreCond();
	    	
	    	AAndBoolBinaryExpIR andExisting = new AAndBoolBinaryExpIR();
	    	andExisting.setLeft(generatedPre.getBody());
	    	andExisting.setRight(preCond_.getBody());
	    	finalPreCondition.setBody(andExisting);
	    }
	    
	    //If there is only a pre written pre condition add that
	    else if (node.getPreCond() != null && generatedPre == null)
	    {
	    	//Copy across all pre written properties into final pre condition.
	    	finalPreCondition = new AFuncDeclIR();
	    	
	    	//No need to add formal params again they're all already put there above
	    	AFuncDeclIR preCond_ = (AFuncDeclIR) node.getPreCond();
	    	finalPreCondition.setBody(preCond_.getBody());
	    	finalPreCondition.setFormalParams(preCond_.getFormalParams());
	    	finalPreCondition.setMethodType(preCond_.getMethodType());
	    	finalPreCondition.setName(preCond_.getName());
	    }
       /* If no pre condition is written, none has been generated then
        there are no parameter types to use as invariant checks and no relevant checks provided
        by modeller, so pre condition is added but left empty as a reminder to the modeller to add one 			later.*/
	    else if (node.getPreCond() == null && generatedPre == null)
	    {
	    	//Copy across all pre written properties into final pre condition.
	    	finalPreCondition = new AFuncDeclIR();
	    	ANotImplementedExpIR n = new ANotImplementedExpIR();
	    	n.setTag("TODO");
	    	finalPreCondition.setBody(n);
	    	// Set up method type for post condition
	        AMethodTypeIR mty = new AMethodTypeIR();
	        mty.setResult(new ABoolBasicTypeIR());
			mty.setParams(null);
	        finalPreCondition.setMethodType(mty);
	    	finalPreCondition.setName("unimplemented_pre_"+node.getName());
	    }
	 	
	    formatIdentifierPatternVars(finalPreCondition);
	    node.setPreCond(finalPreCondition);
	    IsaGen.funcGenHistoryMap.put(finalPreCondition.getName(), finalPreCondition.clone());
	    addToAST(finalPreCondition, node);
	    
    }
    
    

    
    private void transformPostConditions (AFuncDeclIR node) throws AnalysisException {
    	AMethodTypeIR mt = node.getMethodType().clone();
    	
    	/*The final post condition that will be populated with a generated post condition,
    	a modeller written post condition or both or neither.*/
    	AFuncDeclIR finalPostCondition = null;
    	
    	//Generated post condition will be populated if one can be generated
    	AFuncDeclIR generatedPost = null;
    	
        // If there are parameters and results with which to build a post condition then build one
    	if (!mt.getParams().isEmpty() && mt.getResult() != null)
    	{
	    	generatedPost = createPost(node.clone());	
	    	//Copy across all generated properties into final post condition.
        	finalPostCondition = generatedPost;
        	
    	}
    	
    	// If there are pre written post conditions and one was generated add them both
        if (node.getPostCond() != null && generatedPost != null)
        {
        	AFuncDeclIR postCond_ = (AFuncDeclIR) node.getPostCond();   
        	
        	
        	AAndBoolBinaryExpIR andExisting = new AAndBoolBinaryExpIR();
        	andExisting.setLeft(generatedPost.getBody());
        	andExisting.setRight(postCond_.getBody());
        	finalPostCondition.setBody(andExisting);
        	
        }
        
        //If there is only a pre written post condition add that
        else if (node.getPostCond() != null && generatedPost == null)
        {
        	//Copy across all pre written properties into final post condition.
        	finalPostCondition = new AFuncDeclIR();
        	
        	//No need to add formal params again they're all already put there above
        	AFuncDeclIR postCond_ = (AFuncDeclIR) node.getPostCond().clone();
        	finalPostCondition.setBody(postCond_.getBody().clone());
        	finalPostCondition.setFormalParams(postCond_.getFormalParams());
        	finalPostCondition.setMethodType(postCond_.getMethodType().clone());
        	finalPostCondition.setName(postCond_.getName());
        }
       /* If no post condition is written, none has been generated then
        there are no parameter types to use as invariant checks and no relevant checks provided
        by modeller, so post condition is added but left empty as a reminder to the modeller to add one later.*/
        else if (node.getPostCond() == null && generatedPost == null)
        {
        	//Copy across all pre written properties into final post condition.
        	finalPostCondition = new AFuncDeclIR();
        	ANotImplementedExpIR n = new ANotImplementedExpIR();
        	n.setTag("TODO");
        	finalPostCondition.setBody(n.clone());
       
	        AMethodTypeIR mty = new AMethodTypeIR();
	        mty.setResult(new ABoolBasicTypeIR());
			mty.getParams().add(mt.getResult());
	        finalPostCondition.setMethodType(mty.clone());
        	finalPostCondition.setName("unimplemented_post_"+node.getName());
        }
     	
        formatIdentifierPatternVars(finalPostCondition);
        node.setPostCond(finalPostCondition.clone());
	    IsaGen.funcGenHistoryMap.put(finalPostCondition.getName(), finalPostCondition.clone());
        addToAST(finalPostCondition, node);
    }
    
  
    


    private AFuncDeclIR createPre(AFuncDeclIR node) throws AnalysisException {
    	// Post condition function
        AFuncDeclIR preCond = new AFuncDeclIR();
    	AMethodTypeIR mt = node.getMethodType();
        SExpIR expr;
        
    	 // Set post_[function name] as post function name
    	preCond.setName("pre_" + node.getName()); 
        
    	// Set up method type for post condition
        AMethodTypeIR type = new AMethodTypeIR();
        type.setResult(new ABoolBasicTypeIR());
		type.setParams(mt.getParams());
        preCond.setMethodType(type);
        
        
        
        AIdentifierPatternIR identifierPattern = new AIdentifierPatternIR();
        identifierPattern.setName("");
        if (node.getFormalParams() != null && !node.getFormalParams().isEmpty())
        {
        	// Loop through all but result type
        	for (int i = 0; i < preCond.getMethodType().getParams().size(); i++)
        	{
        		identifierPattern = new AIdentifierPatternIR();
    	        identifierPattern.setName(node.getFormalParams().get(i).getPattern().toString());
		        AFormalParamLocalParamIR afp = new AFormalParamLocalParamIR();
		        afp.setPattern(identifierPattern);
		        afp.setType(preCond.getMethodType().getParams().get(i).clone()); 
		        preCond.getFormalParams().add(afp);
        	}
        }
		expr = IsaInvExpGen.apply(preCond.clone(), identifierPattern, preCond.getMethodType().clone(), isaFuncDeclIRMap);
	    preCond.setBody(expr);
        return preCond;
    }
    
    
	private AFuncDeclIR createPost(AFuncDeclIR node) throws AnalysisException {
    	// Post condition function
        AFuncDeclIR postCond = new AFuncDeclIR();
    	AMethodTypeIR mt = node.getMethodType();
        SExpIR expr;
        
    	 // Set post_[function name] as post function name
    	postCond.setName("post_" + node.getName()); 
        
    	// Set up method type for post condition
        AMethodTypeIR type = new AMethodTypeIR();
        type.setResult(new ABoolBasicTypeIR());
        List<STypeIR> params = mt.getParams();
        params.add(mt.getResult().clone());
		type.setParams(params);
        postCond.setMethodType(type);
        
        
        
        AIdentifierPatternIR identifierPattern = new AIdentifierPatternIR();
        identifierPattern.setName("");
        if (node.getFormalParams() != null && !node.getFormalParams().isEmpty())
        {
        	// Loop through all but result type
        	for (int i = 0; i < postCond.getMethodType().getParams().size() -1; i++)
        	{
        		identifierPattern = new AIdentifierPatternIR();
    	        identifierPattern.setName(node.getFormalParams().get(i).getPattern().toString());
		        AFormalParamLocalParamIR afp = new AFormalParamLocalParamIR();
		        afp.setPattern(identifierPattern);
		        afp.setType(postCond.getMethodType().getParams().get(i).clone()); 
		        postCond.getFormalParams().add(afp);
        	}
        }
        
        // Add RESULT pattern if the function has a result
        if (mt.getResult() != null)
        {
	        identifierPattern = new AIdentifierPatternIR();
	        if (node.getPostCond() != null)
	        	identifierPattern.setName(((AFuncDeclIR) 
	        			node.getPostCond()).getFormalParams().getLast().getPattern().toString());
	        else
	        	identifierPattern.setName("RESULT");
	        AFormalParamLocalParamIR afp = new AFormalParamLocalParamIR();
	        afp.setPattern(identifierPattern);
	        afp.setType(mt.getResult()); 
	        postCond.getFormalParams().add(afp);
        }
		//an and expression of all of the parameter invariants do nothing if the body is not implemented
        expr = IsaInvExpGen.apply(postCond.clone(), identifierPattern, postCond.getMethodType().clone(), isaFuncDeclIRMap);
        postCond.setBody(expr);
        
        
        return postCond;
	}
    
    
   /*space out identifier variables, e.g. for two variable t and x we should have t x not tx. 
	    "inv_t t x \<equiv> isa_invTrue t \<and> isa_invTrue x"*/
    private AFuncDeclIR formatIdentifierPatternVars (AFuncDeclIR node) {
    	/*	This puts a space between different parameters in the Isabelle function body
    	, xy is misinterpreted as one variable whereas x y is correctly interpreted as two
    	*/
    	node.getFormalParams().forEach
    	(		
    			p -> { 
    				
    				AIdentifierPatternIR ip = new AIdentifierPatternIR();
    				ip.setName(p.getPattern().toString() + " ");
    				p.setPattern(ip);
    				
    			}
    	);
    	
    	return node;
    }
    
    
    
    
    
}
