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

package org.overture.ast.expressions;


import org.overture.ast.definitions.PDefinition;
import org.overture.ast.expressions.AExists1Exp;
import java.util.HashMap;
import org.overture.ast.expressions.PExp;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.expressions.PExpBase;
import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import java.lang.String;
import org.overture.ast.types.PType;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.analysis.intf.IAnalysis;
import org.overture.ast.patterns.PBind;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AExists1Exp extends PExpBase
{
	private static final long serialVersionUID = 1L;

	private PBind _bind;
	private PExp _predicate;
	private PDefinition _def;

	/**
	* Creates a new {@code AExists1Exp TAG=exists1} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param bind_ the {@link PBind} node for the {@code bind} child of this {@link AExists1Exp} node
	* @param predicate_ the {@link PExp} node for the {@code predicate} child of this {@link AExists1Exp} node
	* @param def_ the {@link PDefinition} node for the {@code def} child of this {@link AExists1Exp} node
	*/
	public AExists1Exp(ILexLocation location_, PBind bind_, PExp predicate_, PDefinition def_)
	{
		super(null,location_);
		this.setBind(bind_);
		this.setPredicate(predicate_);
		this.setDef(def_);

	}


	/**
	* Creates a new {@code AExists1Exp} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param bind_ the {@link PBind} node for the {@code bind} child of this {@link AExists1Exp} node
	* @param predicate_ the {@link PExp} node for the {@code predicate} child of this {@link AExists1Exp} node
	* @param def_ the {@link PDefinition} node for the {@code def} child of this {@link AExists1Exp} node
	*/
	public AExists1Exp(PType type_, ILexLocation location_, PBind bind_, PExp predicate_, PDefinition def_)
	{
		super(type_,location_);
		this.setBind(bind_);
		this.setPredicate(predicate_);
		this.setDef(def_);

	}


	/**
	 * Creates a new {@link AExists1Exp} node with no children.
	 */
	public AExists1Exp()
	{

	}



	public String toString()
	{
		return "" + "(exists1 "+_bind+" & "+_predicate+")";
	}


	/**
	 * Returns a deep clone of this {@link AExists1Exp} node.
	 * @return a deep clone of this {@link AExists1Exp} node
	 */
	public AExists1Exp clone()
	{
		return new AExists1Exp(
			_type,
			_location,
			cloneNode(_bind),
			cloneNode(_predicate),
			cloneNode(_def)
		);
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AExists1Exp)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AExists1Exp} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AExists1Exp} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AExists1Exp} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._bind == child) {
			this._bind = null;
			return;
		}

		if (this._predicate == child) {
			this._predicate = null;
			return;
		}

		if (this._def == child) {
			this._def = null;
			return;
		}

		throw new RuntimeException("Not a child.");
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
		fields.put("_bind",this._bind);
		fields.put("_predicate",this._predicate);
		fields.put("_def",this._def);
		return fields;
	}


	/**
	 * Creates a deep clone of this {@link AExists1Exp} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AExists1Exp} node
	 */
	public AExists1Exp clone(Map<INode,INode> oldToNewMap)
	{
		AExists1Exp node = new AExists1Exp(
			_type,
			_location,
			cloneNode(_bind, oldToNewMap),
			cloneNode(_predicate, oldToNewMap),
			cloneNode(_def, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
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
	 * Sets the {@code _bind} child of this {@link AExists1Exp} node.
	 * @param value the new {@code _bind} child of this {@link AExists1Exp} node
	*/
	public void setBind(PBind value)
	{
		if (this._bind != null) {
			this._bind.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._bind = value;

	}


	/**
	 * @return the {@link PBind} node which is the {@code _bind} child of this {@link AExists1Exp} node
	*/
	public PBind getBind()
	{
		return this._bind;
	}


	/**
	 * Sets the {@code _predicate} child of this {@link AExists1Exp} node.
	 * @param value the new {@code _predicate} child of this {@link AExists1Exp} node
	*/
	public void setPredicate(PExp value)
	{
		if (this._predicate != null) {
			this._predicate.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._predicate = value;

	}


	/**
	 * @return the {@link PExp} node which is the {@code _predicate} child of this {@link AExists1Exp} node
	*/
	public PExp getPredicate()
	{
		return this._predicate;
	}


	/**
	 * Sets the {@code _def} child of this {@link AExists1Exp} node.
	 * @param value the new {@code _def} child of this {@link AExists1Exp} node
	*/
	public void setDef(PDefinition value)
	{
		if (this._def != null) {
			this._def.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._def = value;

	}


	/**
	 * @return the {@link PDefinition} node which is the {@code _def} child of this {@link AExists1Exp} node
	*/
	public PDefinition getDef()
	{
		return this._def;
	}


	/**
	* Calls the {@link IAnalysis#caseAExists1Exp(AExists1Exp)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AExists1Exp} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAExists1Exp(this);
	}


	/**
	* Calls the {@link IAnswer#caseAExists1Exp(AExists1Exp)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AExists1Exp} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAExists1Exp(this);
	}


	/**
	* Calls the {@link IQuestion#caseAExists1Exp(AExists1Exp, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AExists1Exp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAExists1Exp(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAExists1Exp(AExists1Exp, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AExists1Exp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAExists1Exp(this,question);
	}



}
