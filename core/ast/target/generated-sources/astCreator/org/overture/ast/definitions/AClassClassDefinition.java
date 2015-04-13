/*******************************************************************************
* Copyright (c) 2009, 2011 Overture Team and others.
*
* Overture is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* Overture is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with Overture.  If not, see <http://www.gnu.org/licenses/>.
*
* The Overture Tool web-site: http://overturetool.org/
*******************************************************************************/

/* This file was generated by ASTcreator (http://www.lausdahl.com/). */

package org.overture.ast.definitions;


import org.overture.ast.definitions.PDefinition;
import org.overture.ast.definitions.AExplicitOperationDefinition;
import org.overture.ast.typechecker.ClassDefinitionSettings;
import org.overture.ast.definitions.SClassDefinitionBase;
import java.util.HashMap;
import org.overture.ast.definitions.SClassDefinition;
import org.overture.ast.util.ToStringUtil;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.typechecker.Pass;
import java.util.List;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.intf.lex.ILexNameToken;
import org.overture.ast.types.AAccessSpecifierAccessSpecifier;
import org.overture.ast.typechecker.NameScope;
import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import java.lang.String;
import org.overture.ast.types.PType;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.definitions.AClassClassDefinition;
import org.overture.ast.analysis.intf.IAnalysis;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AClassClassDefinition extends SClassDefinitionBase
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code AClassClassDefinition TAG=class} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public AClassClassDefinition(ILexLocation location_, NameScope nameScope_, Boolean used_, AAccessSpecifierAccessSpecifier access_, Pass pass_, Boolean hasContructors_, ClassDefinitionSettings settingHierarchy_, Boolean gettingInheritable_, Boolean gettingInvDefs_, Boolean isAbstract_, Boolean isUndefined_)
	{
		super(location_,null,nameScope_,used_,null,access_,null,pass_,null,null,null,null,null,hasContructors_,settingHierarchy_,null,gettingInheritable_,null,gettingInvDefs_,isAbstract_,isUndefined_,null,false,null);

	}


	/**
	 * Creates a new {@link AClassClassDefinition} node with no children.
	 */
	public AClassClassDefinition()
	{

	}


	/**
	* Creates a new {@code AClassClassDefinition} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public AClassClassDefinition(ILexLocation location_, ILexNameToken name_, NameScope nameScope_, Boolean used_, SClassDefinition classDefinition_, AAccessSpecifierAccessSpecifier access_, PType type_, Pass pass_, List<? extends PType> supertypes_, List<? extends ILexNameToken> supernames_, List<? extends PDefinition> definitions_, List<? extends PDefinition> allInheritedDefinitions_, List<? extends PDefinition> localInheritedDefinitions_, Boolean hasContructors_, ClassDefinitionSettings settingHierarchy_, List<? extends SClassDefinition> superDefs_, Boolean gettingInheritable_, List<? extends PDefinition> superInheritedDefinitions_, Boolean gettingInvDefs_, Boolean isAbstract_, Boolean isUndefined_, PType classtype_, Boolean typeChecked_, AExplicitOperationDefinition invariant_)
	{
		super(location_,name_,nameScope_,used_,classDefinition_,access_,type_,pass_,supertypes_,supernames_,definitions_,allInheritedDefinitions_,localInheritedDefinitions_,hasContructors_,settingHierarchy_,superDefs_,gettingInheritable_,superInheritedDefinitions_,gettingInvDefs_,isAbstract_,isUndefined_,classtype_,typeChecked_,invariant_);

	}



	public String toString()
	{
		return "" + "class "+_name.getFullName()+ (_supernames.isEmpty() ? "" : " is subclass of " +_supernames) + "\n" + ToStringUtil.getDefinitionListString(_definitions)+"end "+_name.getFullName()+"\n";
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AClassClassDefinition} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AClassClassDefinition} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AClassClassDefinition} node
	 */
	public void removeChild(INode child)
	{
		if (this._name == child) {
			return;
		}

		if (this._classDefinition == child) {
			return;
		}

		if (this._access == child) {
			this._access = null;
			return;
		}

		if (this._type == child) {
			return;
		}

		if (this._supertypes.contains(child)) {
			return;
		}

		if (this._supernames.contains(child)) {
			return;
		}

		if (this._definitions.contains(child)) {
			return;
		}

		if (this._allInheritedDefinitions.contains(child)) {
			return;
		}

		if (this._localInheritedDefinitions.contains(child)) {
			return;
		}

		if (this._superDefs.contains(child)) {
			return;
		}

		if (this._superInheritedDefinitions.contains(child)) {
			return;
		}

		if (this._classtype == child) {
			return;
		}

		if (this._invariant == child) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	* Forwarding hashCode call to {@link Object#hashCode()}.
	**/
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}


	/**
	 * Creates a map of all field names and their value
	 * @param includeInheritedFields if true all inherited fields are included
	 * @return a a map of names to values of all fields
	 */
	@Override
	public Map<String,Object> getChildren(Boolean includeInheritedFields)
	{
		Map<String,Object> fields = new HashMap<String,Object>();
		if(includeInheritedFields)
		{
			fields.putAll(super.getChildren(includeInheritedFields));
		}
		return fields;
	}


	/**
	 * Creates a deep clone of this {@link AClassClassDefinition} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AClassClassDefinition} node
	 */
	public AClassClassDefinition clone(Map<INode,INode> oldToNewMap)
	{
		AClassClassDefinition node = new AClassClassDefinition(
			_location,
			_name,
			_nameScope,
			_used,
			_classDefinition,
			cloneNode(_access, oldToNewMap),
			_type,
			_pass,
			_supertypes,
			_supernames,
			_definitions,
			_allInheritedDefinitions,
			_localInheritedDefinitions,
			_hasContructors,
			_settingHierarchy,
			_superDefs,
			_gettingInheritable,
			_superInheritedDefinitions,
			_gettingInvDefs,
			_isAbstract,
			_isUndefined,
			_classtype,
			_typeChecked,
			_invariant
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	 * Returns a deep clone of this {@link AClassClassDefinition} node.
	 * @return a deep clone of this {@link AClassClassDefinition} node
	 */
	public AClassClassDefinition clone()
	{
		return new AClassClassDefinition(
			_location,
			_name,
			_nameScope,
			_used,
			_classDefinition,
			cloneNode(_access),
			_type,
			_pass,
			_supertypes,
			_supernames,
			_definitions,
			_allInheritedDefinitions,
			_localInheritedDefinitions,
			_hasContructors,
			_settingHierarchy,
			_superDefs,
			_gettingInheritable,
			_superInheritedDefinitions,
			_gettingInvDefs,
			_isAbstract,
			_isUndefined,
			_classtype,
			_typeChecked,
			_invariant
		);
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AClassClassDefinition)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	* Calls the {@link IAnalysis#caseAClassClassDefinition(AClassClassDefinition)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AClassClassDefinition} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAClassClassDefinition(this);
	}


	/**
	* Calls the {@link IAnswer#caseAClassClassDefinition(AClassClassDefinition)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AClassClassDefinition} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAClassClassDefinition(this);
	}


	/**
	* Calls the {@link IQuestion#caseAClassClassDefinition(AClassClassDefinition, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AClassClassDefinition} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAClassClassDefinition(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAClassClassDefinition(AClassClassDefinition, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AClassClassDefinition} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAClassClassDefinition(this,question);
	}



}
