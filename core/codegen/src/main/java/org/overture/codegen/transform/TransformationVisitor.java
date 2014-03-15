package org.overture.codegen.transform;

import java.util.LinkedList;

import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.analysis.DepthFirstAnalysisAdaptor;
import org.overture.codegen.cgast.declarations.ALocalVarDeclCG;
import org.overture.codegen.cgast.expressions.ACompMapExpCG;
import org.overture.codegen.cgast.expressions.ACompSeqExpCG;
import org.overture.codegen.cgast.expressions.ACompSetExpCG;
import org.overture.codegen.cgast.expressions.AExistsTraditionalQuantifierExpCG;
import org.overture.codegen.cgast.expressions.AForAllTraditionalQuantifierExpCG;
import org.overture.codegen.cgast.expressions.ALetBeStExpCG;
import org.overture.codegen.cgast.expressions.PExpCG;
import org.overture.codegen.cgast.expressions.STraditionalQuantifierExpCG;
import org.overture.codegen.cgast.pattern.AIdentifierPatternCG;
import org.overture.codegen.cgast.patterns.ASetMultipleBindCG;
import org.overture.codegen.cgast.statements.ABlockStmCG;
import org.overture.codegen.cgast.statements.ALetBeStStmCG;
import org.overture.codegen.cgast.statements.PStmCG;
import org.overture.codegen.cgast.utils.AHeaderLetBeStCG;
import org.overture.codegen.ooast.OoAstInfo;

public class TransformationVisitor extends DepthFirstAnalysisAdaptor
{
	private OoAstInfo info;
	
	private TransformationAssistantCG transformationAssistant;
	
	public TransformationVisitor(OoAstInfo info)
	{
		this.info = info;
		this.transformationAssistant = new TransformationAssistantCG(info);
	}
	
	@Override
	public void caseALetBeStStmCG(ALetBeStStmCG node) throws AnalysisException
	{
		AHeaderLetBeStCG header = node.getHeader();
		
		LetBeStStrategy strategy = new LetBeStStrategy(info.getTempVarNameGen(), transformationAssistant, header.getSuchThat(), transformationAssistant.getSetTypeCloned(header.getBinding().getSet()));
		
		ASetMultipleBindCG binding = header.getBinding();
		
		if (transformationAssistant.hasEmptySet(binding))
		{
			transformationAssistant.cleanUpBinding(binding);
			node.setStatement(new ABlockStmCG());
		}
		
		ABlockStmCG outerBlock = transformationAssistant.consIterationBlock(binding.getPatterns(), header.getBinding().getSet(), info.getTempVarNameGen(), strategy);
		
		outerBlock.getStatements().add(node.getStatement());
		
		transformationAssistant.replaceNodeWith(node, outerBlock);
	}

	@Override
	public void caseALetBeStExpCG(ALetBeStExpCG node) throws AnalysisException
	{
		PStmCG enclosingStm = getEnclosingStm(node, "let be st expressions");

		AHeaderLetBeStCG header = node.getHeader();
		ASetMultipleBindCG binding = header.getBinding();
		LetBeStStrategy strategy = new LetBeStStrategy(info.getTempVarNameGen(), transformationAssistant, header.getSuchThat(), transformationAssistant.getSetTypeCloned(binding.getSet()));

		ABlockStmCG outerBlock = new ABlockStmCG();

		if (transformationAssistant.hasEmptySet(binding))
		{
			transformationAssistant.cleanUpBinding(binding);
		}
		else
		{
			ALocalVarDeclCG resultDecl = transformationAssistant.consDecl(node.getVar(), node.getValue());
			info.getStmAssistant().injectDeclAsStm(outerBlock, resultDecl);
		}
		
		outerBlock.getStatements().addFirst(transformationAssistant.consIterationBlock(binding.getPatterns(), binding.getSet(), info.getTempVarNameGen(), strategy));

		transformationAssistant.replaceNodeWith(enclosingStm, outerBlock);
		outerBlock.getStatements().add(enclosingStm);
	}

	@Override
	public void caseACompMapExpCG(ACompMapExpCG node) throws AnalysisException
	{
		PStmCG enclosingStm = getEnclosingStm(node, "map comprehension");
		
		ComplexCompStrategy strategy = new MapCompStrategy(transformationAssistant, node.getFirst(), node.getPredicate(), node.getVar(), node.getType());
		
		ABlockStmCG block = transformationAssistant.consComplexCompIterationBlock(node.getBindings(), info.getTempVarNameGen(), strategy);
		
		transformationAssistant.replaceNodeWith(enclosingStm, block);
		
		block.getStatements().add(enclosingStm);
	}
	
	@Override
	public void caseACompSetExpCG(ACompSetExpCG node) throws AnalysisException
	{
		PStmCG enclosingStm = getEnclosingStm(node, "set comprehension");
		
		ComplexCompStrategy strategy = new SetCompStrategy(transformationAssistant, node.getFirst(), node.getPredicate(), node.getVar(), node.getType());
		
		ABlockStmCG block = transformationAssistant.consComplexCompIterationBlock(node.getBindings(), info.getTempVarNameGen(), strategy);
		
		transformationAssistant.replaceNodeWith(enclosingStm, block);
		
		block.getStatements().add(enclosingStm);
	}
	
	@Override
	public void caseACompSeqExpCG(ACompSeqExpCG node) throws AnalysisException
	{
		PStmCG enclosingStm = getEnclosingStm(node, "sequence comprehension");

		SeqCompStrategy strategy = new SeqCompStrategy(transformationAssistant, node.getFirst(), node.getPredicate(), node.getVar(), node.getType());

		if (transformationAssistant.isEmptySet(node.getSet()))
		{
			node.setSet(null);
		}
		else
		{
			LinkedList<AIdentifierPatternCG> ids = new LinkedList<AIdentifierPatternCG>();
			ids.add(node.getId());

			ABlockStmCG block = transformationAssistant.consIterationBlock(ids, node.getSet(), info.getTempVarNameGen(), strategy);

			transformationAssistant.replaceNodeWith(enclosingStm, block);

			block.getStatements().add(enclosingStm);
		}
	}
	
	@Override
	public void caseAForAllTraditionalQuantifierExpCG(AForAllTraditionalQuantifierExpCG node) throws AnalysisException
	{
		handleTraditionalQuantifier(node, "forall expression", TraditionalQuantifier.FORALL);
	}
	
	@Override
	public void caseAExistsTraditionalQuantifierExpCG(
			AExistsTraditionalQuantifierExpCG node) throws AnalysisException
	{
		handleTraditionalQuantifier(node, "exists expression", TraditionalQuantifier.EXISTS);
	}

	private void handleTraditionalQuantifier(STraditionalQuantifierExpCG node, String nodeStr, TraditionalQuantifier quantifierType) throws AnalysisException
	{
		PStmCG enclosingStm = getEnclosingStm(node, nodeStr);
		
		QuantifierStrategy strategy = new QuantifierStrategy(transformationAssistant, node.getPredicate(), node.getVar(), quantifierType);
		
		ABlockStmCG block = transformationAssistant.consComplexCompIterationBlock(node.getBindList(), info.getTempVarNameGen(), strategy);
		
		transformationAssistant.replaceNodeWith(enclosingStm, block);
		block.getStatements().add(enclosingStm);
	}
	
	private PStmCG getEnclosingStm(PExpCG node, String nodeStr) throws AnalysisException
	{
		PStmCG enclosingStm = node.getAncestor(PStmCG.class);

		//This case should never occur as it must be checked for during the construction of the OO AST
		if (enclosingStm == null)
			throw new AnalysisException(String.format("Generation of a %s is only supported within operations/functions", node));
			
		return enclosingStm;
	}
}
