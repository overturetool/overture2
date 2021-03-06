/*
 * #%~
 * The VDM Type Checker
 * %%
 * Copyright (C) 2008 - 2014 Overture
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
package org.overture.typechecker.utilities;

import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.analysis.QuestionAdaptor;
import org.overture.ast.assistant.pattern.PTypeList;
import org.overture.ast.definitions.*;
import org.overture.ast.definitions.relations.AOrdRelation;
import org.overture.ast.definitions.relations.PRelation;
import org.overture.ast.expressions.*;
import org.overture.ast.factory.AstFactory;
import org.overture.ast.factory.AstFactoryTC;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.intf.lex.ILexNameToken;
import org.overture.ast.lex.LexNameToken;
import org.overture.ast.lex.LexToken;
import org.overture.ast.lex.VDMToken;
import org.overture.ast.node.INode;
import org.overture.ast.patterns.PPattern;
import org.overture.ast.typechecker.NameScope;
import org.overture.ast.types.*;
import org.overture.typechecker.Environment;
import org.overture.typechecker.TypeCheckerErrors;
import org.overture.typechecker.assistant.ITypeCheckerAssistantFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * This class implements a way to find ImplicitDefinitions from nodes from the AST.
 * 
 * @author kel
 */
public class ImplicitDefinitionFinder extends QuestionAdaptor<Environment>
{

	protected ITypeCheckerAssistantFactory af;

	public ImplicitDefinitionFinder(ITypeCheckerAssistantFactory af)
	{
		this.af = af;
	}

	protected AStateDefinition findStateDefinition(Environment question,
			INode node)
	{
		return question.findStateDefinition();
	}

	@Override
	public void defaultSClassDefinition(SClassDefinition node,
			Environment question) throws AnalysisException
	{
		// TODO: should I expand this even more?
		if (node instanceof ASystemClassDefinition)
		{
			// af.createASystemClassDefinitionAssistant().implicitDefinitions((ASystemClassDefinition)node, question);

			af.createSClassDefinitionAssistant().implicitDefinitionsBase(node, question);

			for (PDefinition d : node.getDefinitions())
			{
				if (d instanceof AInstanceVariableDefinition)
				{
					AInstanceVariableDefinition iv = (AInstanceVariableDefinition) d;

					PType ivType = af.createPDefinitionAssistant().getType(iv);
					if (ivType instanceof AUnresolvedType
							&& iv.getExpression() instanceof AUndefinedExp)
					{
						AUnresolvedType ut = (AUnresolvedType) ivType;

						if (ut.getName().getFullName().equals("BUS"))
						{
							TypeCheckerErrors.warning(5014, "Uninitialized BUS ignored", d.getLocation(), d);
						}
					} else if (ivType instanceof AUnresolvedType
							&& iv.getExpression() instanceof ANewExp)
					{
						AUnresolvedType ut = (AUnresolvedType) ivType;

						if (ut.getName().getFullName().equals("CPU"))
						{
							ANewExp newExp = (ANewExp) iv.getExpression();
							PExp exp = newExp.getArgs().size() > 1 ? newExp.getArgs().get(1) : null;
							double speed = 0;
							if (exp instanceof AIntLiteralExp)
							{
								AIntLiteralExp frequencyExp = (AIntLiteralExp) newExp.getArgs().get(1);
								speed = frequencyExp.getValue().getValue();
							} else if (exp instanceof ARealLiteralExp)
							{
								ARealLiteralExp frequencyExp = (ARealLiteralExp) newExp.getArgs().get(1);
								speed = frequencyExp.getValue().getValue();
							}

							if (speed == 0)
							{
								TypeCheckerErrors.report(3305, "CPU frequency to slow: "
										+ speed + " Hz", d.getLocation(), d);
							} else if (speed > AstFactoryTC.CPU_MAX_FREQUENCY)
							{
								TypeCheckerErrors.report(3306, "CPU frequency to fast: "
										+ speed + " Hz", d.getLocation(), d);
							}
						}
					}
				} else if (d instanceof AExplicitOperationDefinition)
				{
					AExplicitOperationDefinition edef = (AExplicitOperationDefinition) d;

					if (!edef.getName().getName().equals(node.getName().getName())
							|| !edef.getParameterPatterns().isEmpty())
					{
						TypeCheckerErrors.report(3285, "System class can only define a default constructor", d.getLocation(), d);
					}
				} else if (d instanceof AImplicitOperationDefinition)
				{
					AImplicitOperationDefinition idef = (AImplicitOperationDefinition) d;

					if (!d.getName().getName().equals(node.getName().getName()))
					{
						TypeCheckerErrors.report(3285, "System class can only define a default constructor", d.getLocation(), d);
					}

					if (idef.getBody() == null)
					{
						TypeCheckerErrors.report(3283, "System class constructor cannot be implicit", d.getLocation(), d);
					}
				} else
				{
					TypeCheckerErrors.report(3284, "System class can only define instance variables and a constructor", d.getLocation(), d);
				}
			}
		}
		{
			af.createSClassDefinitionAssistant().implicitDefinitionsBase(node, question);
		}
	}

	@Override
	public void caseAClassInvariantDefinition(AClassInvariantDefinition node,
			Environment question) throws AnalysisException
	{

	}

	@Override
	public void caseAEqualsDefinition(AEqualsDefinition node,
			Environment question) throws AnalysisException
	{

	}

	@Override
	public void caseAExplicitFunctionDefinition(
			AExplicitFunctionDefinition node, Environment question)
			throws AnalysisException
	{
		if (node.getPrecondition() != null)
		{
			node.setPredef(af.createAExplicitFunctionDefinitionAssistant().getPreDefinition(node));
			// PDefinitionAssistantTC.markUsed(d.getPredef());//ORIGINAL CODE
			af.getUsedMarker().caseAExplicitFunctionDefinition(node.getPredef());
		} else
		{
			node.setPredef(null);
		}

		if (node.getPostcondition() != null)
		{
			node.setPostdef(af.createAExplicitFunctionDefinitionAssistant().getPostDefinition(node));
			// PDefinitionAssistantTC.markUsed(d.getPostdef());//ORIGINAL CODE
			af.getUsedMarker().caseAExplicitFunctionDefinition(node.getPostdef());
		} else
		{
			node.setPostdef(null);
		}
	}

	@Override
	public void caseAExplicitOperationDefinition(
			AExplicitOperationDefinition node, Environment question)
			throws AnalysisException
	{
		node.setState(findStateDefinition(question, node));

		if (node.getPrecondition() != null)
		{
			node.setPredef(af.createAExplicitOperationDefinitionAssistant(node.getLocation().getModule()).getPreDefinition(node, question));
			af.createPDefinitionAssistant().markUsed(node.getPredef()); // ORIGINAL CODE
		}

		if (node.getPostcondition() != null)
		{
			node.setPostdef(af.createAExplicitOperationDefinitionAssistant(node.getLocation().getModule()).getPostDefinition(node, question));
			af.createPDefinitionAssistant().markUsed(node.getPostdef());
		}
	}

	@Override
	public void caseAImplicitFunctionDefinition(
			AImplicitFunctionDefinition node, Environment question)
			throws AnalysisException
	{

		if (node.getPrecondition() != null)
		{
			node.setPredef(af.createAImplicitFunctionDefinitionAssistant().getPreDefinition(node));
			af.createPDefinitionAssistant().markUsed(node.getPredef());
			// af.createPDefinitionAssistant().markUsed(node.getPredef());
		} else
		{
			node.setPredef(null);
		}

		if (node.getPostcondition() != null)
		{
			node.setPostdef(af.createAImplicitFunctionDefinitionAssistant().getPostDefinition(node));
			af.createPDefinitionAssistant().markUsed(node.getPostdef());
		} else
		{
			node.setPostdef(null);
		}
	}

	@Override
	public void caseAImplicitOperationDefinition(
			AImplicitOperationDefinition node, Environment question)
			throws AnalysisException
	{
		node.setState(findStateDefinition(question, node));

		if (node.getPrecondition() != null)
		{
			node.setPredef(af.createAImplicitOperationDefinitionAssistant().getPreDefinition(node, question));
			af.createPDefinitionAssistant().markUsed(node.getPredef());
		}

		if (node.getPostcondition() != null)
		{
			node.setPostdef(af.createAImplicitOperationDefinitionAssistant().getPostDefinition(node, question));
			af.createPDefinitionAssistant().markUsed(node.getPostdef());
		}
	}

	@Override
	public void caseAStateDefinition(AStateDefinition node, Environment question)
			throws AnalysisException
	{
		if (node.getInvPattern() != null)
		{
			node.setInvdef(getInvDefinition(node));
		}

		if (node.getInitPattern() != null)
		{
			node.setInitdef(getInitDefinition(node));
		}
	}

	@Override
	public void caseAThreadDefinition(AThreadDefinition node,
			Environment question) throws AnalysisException
	{
		// ORIGINAL CODE FROM ASSISTANT
		// node.setOperationDef(AThreadDefinitionAssistantTC.getThreadDefinition(node));
		// Mine non static call of the code.
		node.setOperationDef(getThreadDefinition(node));
	}

	@Override
	public void caseATypeDefinition(ATypeDefinition node, Environment question)
			throws AnalysisException
	{
		if (node.getInvPattern() != null)
		{
			// node.setInvdef(getInvDefinition(d)); //Original code from Assistant.
			node.setInvdef(getInvDefinition(node));
			node.getInvType().setInvDef(node.getInvdef());
		} else
		{
			node.setInvdef(null);
		}

		if (node.getOrdRelation() != null) {
			node.getOrdRelation().setRelDef(getRelDef(node.getOrdRelation(),node,node.getName().getOrdName(node.getLocation().clone())));
			node.getInvType().setOrdDef(node.getOrdRelation().getRelDef());
			setMinMax(node.getOrdRelation(),node);
		}

		if (node.getEqRelation() != null) {
			node.getEqRelation().setRelDef(getRelDef(node.getEqRelation(),node,node.getName().getEqName(node.getLocation().clone())));
			node.getInvType().setEqDef(node.getEqRelation().getRelDef());
		}

		if (node.getInvType() instanceof ANamedInvariantType)
		{
			ANamedInvariantType ntype = (ANamedInvariantType) node.getInvType();
			node.getComposeDefinitions().clear();

			for (PType compose : af.createPTypeAssistant().getComposeTypes(ntype.getType()))
			{
				ARecordInvariantType rtype = (ARecordInvariantType) compose;
				node.getComposeDefinitions().add(AstFactory.newATypeDefinition(rtype.getName(), rtype, null, null));
			}
		}
	}

	@Override
	public void defaultPDefinition(PDefinition node, Environment question)
			throws AnalysisException
	{
		return;
	}
	
	public AExplicitFunctionDefinition getInitDefinition(AStateDefinition d)
	{
		ILexLocation loc = d.getInitPattern().getLocation();
		List<PPattern> params = new Vector<PPattern>();
		params.add(d.getInitPattern().clone());

		List<List<PPattern>> parameters = new Vector<List<PPattern>>();
		parameters.add(params);

		PTypeList ptypes = new PTypeList();
		ptypes.add(AstFactory.newAUnresolvedType(d.getName()));
		AFunctionType ftype = AstFactory.newAFunctionType(loc, false, ptypes, AstFactory.newABooleanBasicType(loc));

		PExp body = AstFactory.newAStateInitExp(d);

		AExplicitFunctionDefinition def = AstFactory.newAExplicitFunctionDefinition(d.getName().getInitName(loc), NameScope.GLOBAL, null, ftype, parameters, body, null, null, false, null);

		return def;
	}

	public AExplicitFunctionDefinition getInvDefinition(AStateDefinition d)
	{

		ILexLocation loc = d.getInvPattern().getLocation();
		List<PPattern> params = new Vector<PPattern>();
		params.add(d.getInvPattern().clone());

		List<List<PPattern>> parameters = new Vector<List<PPattern>>();
		parameters.add(params);

		PTypeList ptypes = new PTypeList();
		ptypes.add(AstFactory.newAUnresolvedType(d.getName()));
		AFunctionType ftype = AstFactory.newAFunctionType(loc, false, ptypes, AstFactory.newABooleanBasicType(loc));

		return AstFactory.newAExplicitFunctionDefinition(d.getName().getInvName(loc), NameScope.GLOBAL, null, ftype, parameters, d.getInvExpression(), null, null, true, null);
	}

	private AExplicitFunctionDefinition getRelDef(PRelation node, ATypeDefinition typedef, ILexNameToken fname) {
		ILexLocation loc = node.getLhsPattern().getLocation();

		List<PPattern> params = new Vector<PPattern>();
		params.add(node.getLhsPattern().clone());
		params.add(node.getRhsPattern().clone());
		List<List<PPattern>> parameters = new Vector<List<PPattern>>();
		parameters.add(params);

		PTypeList ptypes = getPTypes(typedef);

		AFunctionType ftype = AstFactory.newAFunctionType(loc, false, ptypes, AstFactory.newABooleanBasicType(loc));
		AExplicitFunctionDefinition def = AstFactory.newAExplicitFunctionDefinition(fname, NameScope.GLOBAL, null, ftype, parameters,
				node.getRelExp(), null, null, false, null);

		def.setAccess(typedef.getAccess().clone()); // Same as type's
		def.setClassDefinition(typedef.getClassDefinition());

		return def;
	}

	private PTypeList getPTypes(ATypeDefinition typedef) {
		PTypeList ptypes = new PTypeList();
		if (typedef.getInvType() instanceof ARecordInvariantType)
		{
			// Records are inv_R: R +> bool
			AUnresolvedType uType= AstFactory.newAUnresolvedType(typedef.getName().clone());
			ptypes.add(uType.clone());
			ptypes.add(uType.clone());
		} else
		{
			// Named types are inv_T: x +> bool, for T = x
			ANamedInvariantType nt = (ANamedInvariantType) typedef.getInvType();
			ptypes.add(nt.getType().clone());
			ptypes.add(nt.getType().clone());
		}
		return ptypes;
	}

	private void setMinMax(AOrdRelation ordRelation, ATypeDefinition typeDef) {
		ILexLocation loc = ordRelation.getRelDef().getLocation().clone();
		String module = typeDef.getName().getModule();

		PExp left = AstFactoryTC.newAVariableExp(new LexNameToken(module, "x", loc.clone()));
		PExp right = AstFactoryTC.newAVariableExp(new LexNameToken(module, "y", loc.clone()));

		List<PPattern> params = new LinkedList<>();
		params.add(AstFactory.newAIdentifierPattern(new LexNameToken(module, "x", loc.clone())));
		params.add(AstFactory.newAIdentifierPattern(new LexNameToken(module, "y", loc.clone())));
		List<List<PPattern>> parameters = new Vector<List<PPattern>>();
		parameters.add(params);

		AIfExp maxBody = AstFactoryTC.newAIfExp(loc.clone(),
				AstFactoryTC.newALessEqualNumericBinaryExp(left.clone(), new LexToken(loc.clone(), VDMToken.LE), right.clone()),
				right.clone(),
				new LinkedList<>(),
				left.clone());

		// PTypeList ptypes = getPTypes(typeDef);
		PTypeList ptypes = new PTypeList();
		ptypes.add(AstFactory.newAUnresolvedType(typeDef.getName()));
		ptypes.add(AstFactory.newAUnresolvedType(typeDef.getName()));


		AFunctionType ftype = AstFactory.newAFunctionType(loc.clone(), false, ptypes, AstFactory.newAUnresolvedType(typeDef.getName()));
		AExplicitFunctionDefinition maxD = AstFactory.newAExplicitFunctionDefinition(typeDef.getName().getMaxName(loc), NameScope.GLOBAL, null, ftype, parameters,
				maxBody, null, null, true, null);
		maxD.setAccess(typeDef.getAccess().clone()); // Same as type's
		maxD.setClassDefinition(typeDef.getClassDefinition());
		ordRelation.setMaxDef(maxD);

		AIfExp minBody = AstFactoryTC.newAIfExp(loc.clone(),
				AstFactoryTC.newALessEqualNumericBinaryExp(left.clone(), new LexToken(loc.clone(), VDMToken.LE), right.clone()),
				left.clone(),
				new LinkedList<>(),
				right.clone());

		// ptypes = getPTypes(typeDef);
		ptypes = new PTypeList();
		ptypes.add(AstFactory.newAUnresolvedType(typeDef.getName()));
		ptypes.add(AstFactory.newAUnresolvedType(typeDef.getName()));

		List<PPattern> temp = new LinkedList<>();
		for (PPattern a : parameters.get(0)) {
			temp.add(a.clone());
		}
		List<List<PPattern>> parameters2 = new LinkedList<>();
		parameters2.add((temp));
		ftype = AstFactory.newAFunctionType(loc.clone(), false, ptypes, AstFactory.newAUnresolvedType(typeDef.getName()));

		AExplicitFunctionDefinition minD = AstFactory.newAExplicitFunctionDefinition(typeDef.getName().getMinName(loc), NameScope.GLOBAL, null, ftype, parameters2,
				minBody, null, null, true, null);
		minD.setAccess(typeDef.getAccess().clone()); // Same as type's
		minD.setClassDefinition(typeDef.getClassDefinition());
		ordRelation.setMinDef(minD);
	}

	public AExplicitFunctionDefinition getInvDefinition(ATypeDefinition d)
	{

		ILexLocation loc = d.getInvPattern().getLocation();
		List<PPattern> params = new Vector<PPattern>();
		params.add(d.getInvPattern().clone());

		List<List<PPattern>> parameters = new Vector<List<PPattern>>();
		parameters.add(params);

		PTypeList ptypes = new PTypeList();

		if (d.getInvType() instanceof ARecordInvariantType)
		{
			// Records are inv_R: R +> bool
			ptypes.add(AstFactory.newAUnresolvedType(d.getName().clone()));
		} else
		{
			// Named types are inv_T: x +> bool, for T = x
			ANamedInvariantType nt = (ANamedInvariantType) d.getInvType();
			ptypes.add(nt.getType().clone());
		}

		AFunctionType ftype = AstFactory.newAFunctionType(loc, false, ptypes, AstFactory.newABooleanBasicType(loc));

		AExplicitFunctionDefinition def = AstFactory.newAExplicitFunctionDefinition(d.getName().getInvName(loc), NameScope.GLOBAL, null, ftype, parameters, d.getInvExpression(), null, null, true, null);

		def.setAccess(d.getAccess().clone()); // Same as type's
		def.setClassDefinition(d.getClassDefinition());

		return def;
	}

	public AExplicitOperationDefinition getThreadDefinition(AThreadDefinition d)
	{

		AOperationType type = AstFactory.newAOperationType(d.getLocation()); // () ==> ()

		AExplicitOperationDefinition def = AstFactory.newAExplicitOperationDefinition(d.getOperationName(), type, new Vector<PPattern>(), null, null, d.getStatement().clone());

		def.setAccess(d.getAccess().clone());
		def.setClassDefinition(d.getClassDefinition());
		return def;
	}

}
