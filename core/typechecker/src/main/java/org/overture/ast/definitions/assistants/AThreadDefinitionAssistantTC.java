package org.overture.ast.definitions.assistants;

import java.util.List;
import java.util.Vector;

import org.overture.ast.definitions.AExplicitOperationDefinition;
import org.overture.ast.definitions.AThreadDefinition;
import org.overture.ast.definitions.PDefinition;
import org.overture.ast.factory.AstFactory;
import org.overture.ast.patterns.PPattern;
import org.overture.ast.types.AOperationType;
import org.overture.typecheck.Environment;
import org.overturetool.vdmj.lex.LexNameList;
import org.overturetool.vdmj.lex.LexNameToken;
import org.overturetool.vdmj.typechecker.NameScope;

public class AThreadDefinitionAssistantTC {

	public static PDefinition findName(AThreadDefinition definition,
			LexNameToken sought, NameScope scope) {
		
		return PDefinitionAssistantTC.findName(definition.getOperationDef(),sought, scope);
	}

	public static List<PDefinition> getDefinitions(AThreadDefinition d) {
		List<PDefinition> result = new Vector<PDefinition>();
		result.add(d.getOperationDef());
		return result;
	}

	public static LexNameList getVariableNames(AThreadDefinition d) {
		return d.getOperationDef()== null ? null : new LexNameList(d.getOperationDef().getName());
	}

	public static void implicitDefinitions(AThreadDefinition d, Environment env) {
		d.setOperationDef(getThreadDefinition(d));
		
	}

	private static AExplicitOperationDefinition getThreadDefinition(AThreadDefinition d) {

		AOperationType type = AstFactory.newAOperationType(d.getLocation());	// () ==> ()

		AExplicitOperationDefinition def = 
				AstFactory.newAExplicitOperationDefinition(
						d.getOperationName(), type, new Vector<PPattern>(), null,null, d.getStatement().clone());

		def.setAccess(d.getAccess());
		def.setClassDefinition(d.getClassDefinition());
		return def;
	}

	public static boolean equals(AThreadDefinition def, Object other) {
		if (other instanceof AThreadDefinition)
		{
			AThreadDefinition tho = (AThreadDefinition)other;
			return tho.getOperationName().equals(def.getOperationName());
		}
		
		return false;
	}

}
