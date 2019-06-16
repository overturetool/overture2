/*
 * #%~
 * VDM to Isabelle Translation
 * %%
 * Copyright (C) 2008 - 2015 Overture
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #~%
 */
package org.overturetool.cgisa;

import java.io.StringWriter;
import java.util.*;

import org.overture.ast.definitions.AImplicitFunctionDefinition;
import org.overture.codegen.ir.INode;
import org.overture.codegen.ir.SDeclIR;
import org.overture.codegen.ir.SExpIR;
import org.overture.codegen.ir.SMultipleBindIR;
import org.overture.codegen.ir.STypeIR;
import org.overture.codegen.ir.analysis.AnalysisException;
import org.overture.codegen.ir.declarations.AFieldDeclIR;
import org.overture.codegen.ir.declarations.AFormalParamLocalParamIR;
import org.overture.codegen.ir.declarations.AFuncDeclIR;
import org.overture.codegen.ir.declarations.ANamedTypeDeclIR;
import org.overture.codegen.ir.declarations.ARecordDeclIR;
import org.overture.codegen.ir.declarations.AStateDeclIR;
import org.overture.codegen.ir.declarations.ATypeDeclIR;
import org.overture.codegen.ir.expressions.AApplyExpIR;
import org.overture.codegen.ir.expressions.AIdentifierVarExpIR;
import org.overture.codegen.ir.expressions.ANewExpIR;
import org.overture.codegen.ir.types.*;
import org.overture.codegen.ir.SourceNode;
import org.overture.codegen.merging.MergeVisitor;
import org.overture.codegen.merging.TemplateCallable;
import org.overture.codegen.merging.TemplateManager;
import org.overturetool.cgisa.utils.IsMethodTypeVisitor;
import org.overturetool.cgisa.utils.IsSeqOfCharTypeVisitor;
import org.overturetool.cgisa.utils.IsaSymbolFinder;

public class IsaTranslations {

    private static final String TEMPLATE_CALLABLE_NAME = "Isa";
    private static final String TYPE_PARAM_SEP = " \\<Rightarrow> ";
    private static final String LIST_SEP = ",";
    private static final String TUPLE_TYPE_SEPARATOR = "*";
    private static final String ISA_TEMPLATE_ROOT = "IsaTemplates";
    private MergeVisitor mergeVisitor;

    protected IsaChecks isaUtils;

    public IsaTranslations() {
        TemplateCallable[] templateCallables = new TemplateCallable[]{new TemplateCallable(TEMPLATE_CALLABLE_NAME, this)};
        this.mergeVisitor = new MergeVisitor(new TemplateManager(ISA_TEMPLATE_ROOT, this.getClass()),templateCallables);
        this.isaUtils = new IsaChecks();
    }

    public MergeVisitor getMergeVisitor() {
        return mergeVisitor;
    }

    // Translations

    public String trans(INode node) throws AnalysisException {
        StringWriter writer = new StringWriter();
        node.apply(mergeVisitor, writer);
        return writer.toString().replace("true", "True");//hack around lower cased trues;
    }

   
    public String transUnion(STypeIR node) throws AnalysisException {
        return trans(node).replace("<", "").replace(">", "");//hack around lower cased trues;
    }
    
    
    
    public String transState(AStateDeclIR node) throws AnalysisException {
    	StringBuilder sb = new StringBuilder();
    	sb.append(" ");
    	if (node != null) {
	    	if (node.getInitDecl() != null) {
	    		sb.append(trans(node.getInitDecl()) + "\n");
	    	}
	    	if (node.getInvDecl() != null) {
	    		sb.append(trans(node.getInvDecl()) + "\n");
	    	}
    	}
    	return sb.toString();
    }
    
	public String transApplyParams(List<SExpIR> params)
            throws AnalysisException {
        return transNodeList(params, " ");
    }

	public String transMkArgs(ANewExpIR node) {
		String str = new String();
		List<SExpIR> args = new ArrayList<SExpIR>();
		args = node.getArgs();
		List<AFieldDeclIR> f = new ArrayList<AFieldDeclIR>();
		SDeclIR rs = IsaGen.declGenHistoryMap.get(((ARecordTypeIR) 
					node.getType().clone()).getName().toString());
		
		
		if (rs instanceof AStateDeclIR) 
		{
			AStateDeclIR state = (AStateDeclIR) rs.clone();
			f = state.getFields();
			for (int i = 0; i < f.size(); i++)
			{
				str = str + state.getName().toString().substring(0,1).toLowerCase() 
						+ state.getName().toString().substring(1) + "_"
						+ (f.get(i).getName() + " = " + args.get(i).toString());
				if (i < f.size()-1) str = str + (", ");
			}
		}
		else
		{
			ARecordDeclIR rec = (ARecordDeclIR) rs.clone();
			f = rec.getFields();
			for (int i = 0; i < f.size(); i++)
			{
				str = str + rec.getName().toString().substring(0,1).toLowerCase() 
						+ rec.getName().toString().substring(1) + "_"
						+ (f.get(i).getName() + " = " + args.get(i).toString());
				if (i < f.size()-1) str = str + (", ");
			}
		}
			
		
		
		return str;
	}
	
    public String transTypeParams(List<AFormalParamLocalParamIR> params)
            throws AnalysisException {
        String result = transNodeList(params, TYPE_PARAM_SEP);
        return result;
    }

    public String transBinds(List<? extends SMultipleBindIR> binds)
            throws AnalysisException {
        return transNodeList(binds, LIST_SEP);
    }

    public String mkFirstCharLowerCase(String x)
    {
        char c[] = x.toCharArray();
        c[0] = Character.toLowerCase(c[0]);
        return new String(c);
    }

    public String transNodeList(List<? extends INode> params, String sep)
            throws AnalysisException {
        StringBuilder sb = new StringBuilder();

        Iterator<? extends INode> it = params.iterator();

        while (it.hasNext()) {
            StringWriter writer = new StringWriter();
            it.next().apply(mergeVisitor, writer);
            sb.append(writer.toString());
            if (it.hasNext()) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public String transString(List<SExpIR> args) throws AnalysisException {
        StringBuilder sb = new StringBuilder();
        sb.append("''");
        for (SExpIR arg : args) {
            sb.append(trans(arg));
        }
        sb.append("''");
        return sb.toString();
    }

    public String transSeq(List<SExpIR> args) throws AnalysisException {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(transNodeList(args, LIST_SEP));
        sb.append("]");
        return sb.toString();
    }

    public String rec2Tuple(ARecordDeclIR record) throws AnalysisException {
        StringBuilder sb = new StringBuilder();

        Iterator<AFieldDeclIR> it = record.getFields().iterator();

        while (it.hasNext()) {
            AFieldDeclIR n = it.next();

            sb.append(trans(n.getType()));
            if (it.hasNext()) {
                sb.append(TUPLE_TYPE_SEPARATOR);
            }
        }

        return sb.toString();
    }

    // Hacks - translations that manipulate the tree in grostesque way due to
    // issues with the IR
    // FIXME Unhack result name extraction for implicit functions
    public String hackResultName(AFuncDeclIR func) throws AnalysisException {
        SourceNode x = func.getSourceNode();
        if (x.getVdmNode() instanceof AImplicitFunctionDefinition) {
            AImplicitFunctionDefinition iFunc = (AImplicitFunctionDefinition) x.getVdmNode();
            return iFunc.getResult().getPattern().toString();
        }
        throw new AnalysisException("Expected AFuncDeclIR in implicit function source. Got: "
                + x.getVdmNode().getClass().toString());
    }

    // FIXME Unhack invariant extraction for named types
    public String hackInv(ANamedTypeDeclIR type) {
        ATypeDeclIR tDecl = (ATypeDeclIR) type.parent();

        if (tDecl.getInv() != null) {
            AFuncDeclIR invFunc = (AFuncDeclIR) tDecl.getInv();
            StringBuilder sb = new StringBuilder();
            sb.append("inv ");
            sb.append(invFunc.getFormalParams().get(0).getPattern().toString());
            sb.append(" == ");
            sb.append(invFunc.getName());
            sb.append("(");
            sb.append("&");
            sb.append(invFunc.getFormalParams().get(0).getPattern().toString());
            sb.append(")");
            return sb.toString();
        }
        return "";
    }

    // FIXME Unhack invariant extraction for namedt ypes
    public String hackInv(ARecordDeclIR type) {

        if (type.getInvariant() != null) {
            AFuncDeclIR invFunc = (AFuncDeclIR) type.getInvariant();
            StringBuilder sb = new StringBuilder();
            sb.append("inv ");
            sb.append(invFunc.getFormalParams().get(0).getPattern().toString());
            sb.append(" == ");
            sb.append(invFunc.getName());
            sb.append("(");
            sb.append("&");
            sb.append(invFunc.getFormalParams().get(0).getPattern().toString());
            sb.append(")");
            return sb.toString();
        }
        return "";
    }

    public String hackInvDecl(ARecordDeclIR type) throws AnalysisException {
        if (type.getInvariant() != null) {
            return trans(type.getInvariant());
        }
        return "";
    }

    // Renamings

    public String norm(String name) {
        return name.replaceAll("-", "_");
    }

    public String varWrap(String v) {
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        sb.append(v);
        sb.append('>');
        return sb.toString();
    }

    // Control flow

    public String filter(AFieldDeclIR field) throws AnalysisException {
        if (field.getFinal() && field.getStatic()) {
            return trans(field);
        }

        return "";
    }

    // Checks
    public boolean hasReturn(AMethodTypeIR node) {
        return !(node.getResult() instanceof AVoidTypeIR);
    }

    public boolean isRoot(INode node) {
        return isaUtils.isRoot(node);
    }

    public boolean isRootRec(AApplyExpIR node) {
        return isaUtils.isRootRec(node);
    }

    public String initial(SExpIR node) throws AnalysisException {
    	if (node.getClass() != AIdentifierVarExpIR.class && 
    			(node.getType() instanceof ASetSetTypeIR || node.getType() instanceof ASeqSeqTypeIR))
    	{
    		// Translate the collection symbols of the actual value in the abbreviation field
    		String initial = shift( Arrays.asList(transInit(node.getType(), node.toString().replace("[", "").replace("]", "")).split("")) );
    		return initial;
    	}
    	else 
    	{
    		return trans(node);
    	}
    	
    }
    
    // Hack around reverse recurion making VDMNat1 VDMSeq VDMSet appear as [{1}]
	private String shift(List<String> s) throws AnalysisException {
		
	    for (int i = 0; i < (s.size()/2)-1; i++)
	    {
	    	Collections.swap(s, i, i + 1);
	    	
	    }
	    
	    for (int i = s.size()-1; i > (s.size()/2)+1; i--)
	    {
	    	Collections.swap(s, i, i - 1);
	    	
	    }
	    
	    return s.toString().replace(", ", "").substring(1, s.size()+1);
	}
    
    private String transInit(STypeIR type, String val) throws AnalysisException {
    	
    	if (type instanceof ASetSetTypeIR)
    	{
    		val = transInit( ((ASetSetTypeIR) type).getSetOf(), IsaSymbolFinder.findSymbol(type, val));
    	}
    	else if (type instanceof ASeqSeqTypeIR)
    	{
    		val = transInit( ((ASeqSeqTypeIR) type).getSeqOf(), IsaSymbolFinder.findSymbol(type, val));
    	}
    	
		return val;
	}

	public boolean isString(STypeIR node) throws AnalysisException {
        return node.apply(new IsSeqOfCharTypeVisitor());
    }

    public boolean isFunc(STypeIR node) throws AnalysisException {
        return node.apply(new IsMethodTypeVisitor());
    }

    public boolean isRecordDecl(ATypeDeclIR node) {
        return (node.getDecl() instanceof ARecordDeclIR);
    }

    public boolean isTokenType(ANamedTypeDeclIR node){
        return (node.getType() instanceof ATokenBasicTypeIR);
    }

    public boolean isUnionType(ANamedTypeDeclIR node){
        return (node.getType() instanceof AUnionTypeIR);
    }

    public boolean hasInvariant(ATypeDeclIR node) {
        return (node.getInv() != null);
    }
    
    public String transTypeName(STypeIR node) {
    	if (node instanceof ASetSetTypeIR) 
    	{
    		ASetSetTypeIR set = (ASetSetTypeIR) node;
    		return IsaGen.typeGenHistoryMap.get(set);
    	}
    	if (node instanceof ASeqSeqTypeIR)
    	{
    		ASetSetTypeIR seq = (ASetSetTypeIR) node;
    		return IsaGen.typeGenHistoryMap.get(seq);
    	}
    	else 
    	{
    		return "collectionName";
    	}
    }

    public String genUnaryTypeConstructorInv(Object node, String name)
    {
        if(node instanceof ASeqSeqTypeIR ||
            node instanceof ASetSetTypeIR)
        {
            String inv = "";
            if(node instanceof ASeqSeqTypeIR)
            {
                ASeqSeqTypeIR node_ = (ASeqSeqTypeIR) node;
                if(node_.getSeqOf() instanceof SBasicTypeBase)
                {
                    // In this case it is a seq of a basic type.
                    inv= "inv_SeqElems inv_True";
                }
            }

            return String.join(" ", inv, name);
        }
        else {
            return "";
        }
    }

    public boolean isInvariant(AFuncDeclIR node)
    {
        if (node.parent() != null) {
            if(node.parent() instanceof ATypeDeclIR) {
                ATypeDeclIR p = (ATypeDeclIR) node.parent();
                return p.getInv() == node;
            }
        }
        return false;
    }

    public boolean isUnaryTypeConstructor(Object node)
    {
        return node instanceof ASeqSeqTypeIR ||
                node instanceof ASetSetTypeIR;
    }

    public boolean isAppliedToBasicType(ASeqSeqTypeIR node)
    {
        return node.getSeqOf() instanceof SBasicTypeIR;
    }

    public boolean isAppliedToBasicType(ASetSetTypeIR node)
    {
        return node.getSetOf() instanceof SBasicTypeIR;
    }

    public String concreteTypeInvariantForUnaryTypeConstructorInvariant(STypeIR t, String prefix)
    {
        if (t instanceof SBasicTypeIR)
        {
            SBasicTypeIR t_ = (SBasicTypeIR) t;
            return prefix+"inv_True";
        }
        else {
            return prefix+"inv_" + t.getNamedInvType().getName();
        }
    }

    public String genInvariantsForUnaryTypeConstructor(Object node)
    {
       
    	if(node instanceof ASeqSeqTypeIR){
            ASeqSeqTypeIR node_ = (ASeqSeqTypeIR) node;
            return concreteTypeInvariantForUnaryTypeConstructorInvariant(node_.getSeqOf(),"inv_SeqElems ");
        }
        if(node instanceof ASetSetTypeIR)
        {
            ASetSetTypeIR node_ = (ASetSetTypeIR) node;
            return concreteTypeInvariantForUnaryTypeConstructorInvariant(node_.getSetOf(), "inv_SetElems");
        }
        return "genInvariantsForUnaryTypeConstructor found no match for node: " + node;
    }

    public String genInvariantsForRecordDecl(ARecordDeclIR node)
    {
        List<String> invs = new ArrayList<>();
        for (AFieldDeclIR f : node.getFields())
        {
            Object type = f.getType();
            if(isUnaryTypeConstructor(type))
            {
                invs.add(genInvariantsForUnaryTypeConstructor(type));
            }
        }
        return String.join("\\<and>", invs);
    }

//    public String invTrue(ATypeDefinition node){
//        StringBuilder sb = new StringBuilder();
//
//    }
}
