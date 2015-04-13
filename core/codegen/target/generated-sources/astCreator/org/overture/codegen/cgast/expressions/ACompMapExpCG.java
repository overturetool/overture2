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

package org.overture.codegen.cgast.expressions;


import org.overture.codegen.cgast.analysis.intf.IQuestion;
import org.overture.codegen.cgast.expressions.AMapletExpCG;
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import org.overture.codegen.cgast.NodeList;
import org.overture.codegen.cgast.expressions.ACompMapExpCG;
import org.overture.codegen.cgast.INode;
import java.util.HashMap;
import org.overture.codegen.cgast.SExpCG;
import org.overture.codegen.cgast.expressions.SMapExpBase;
import org.overture.codegen.cgast.patterns.ASetMultipleBindCG;
import java.util.List;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import org.overture.codegen.cgast.STypeCG;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;
import java.util.LinkedList;
import org.overture.codegen.cgast.analysis.intf.IAnswer;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class ACompMapExpCG extends SMapExpBase
{
	private static final long serialVersionUID = 1L;

	private AMapletExpCG _first;
	private NodeList<ASetMultipleBindCG> _bindings = new NodeList<ASetMultipleBindCG>(this);
	private SExpCG _predicate;

	/**
	* Creates a new {@code ACompMapExpCG TAG=comp} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param first_ the {@link AMapletExpCG} node for the {@code first} child of this {@link ACompMapExpCG} node
	* @param bindings_ the {@link NodeList} node for the {@code bindings} child of this {@link ACompMapExpCG} node
	* @param predicate_ the {@link SExpCG} node for the {@code predicate} child of this {@link ACompMapExpCG} node
	*/
	public ACompMapExpCG(SourceNode sourceNode_, STypeCG type_, AMapletExpCG first_, List<? extends ASetMultipleBindCG> bindings_, SExpCG predicate_)
	{
		super(sourceNode_,null,type_);
		this.setFirst(first_);
		this.setBindings(bindings_);
		this.setPredicate(predicate_);

	}


	/**
	 * Creates a new {@link ACompMapExpCG} node with no children.
	 */
	public ACompMapExpCG()
	{

	}


	/**
	* Creates a new {@code ACompMapExpCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param first_ the {@link AMapletExpCG} node for the {@code first} child of this {@link ACompMapExpCG} node
	* @param bindings_ the {@link NodeList} node for the {@code bindings} child of this {@link ACompMapExpCG} node
	* @param predicate_ the {@link SExpCG} node for the {@code predicate} child of this {@link ACompMapExpCG} node
	*/
	public ACompMapExpCG(SourceNode sourceNode_, Object tag_, STypeCG type_, AMapletExpCG first_, List<? extends ASetMultipleBindCG> bindings_, SExpCG predicate_)
	{
		super(sourceNode_,tag_,type_);
		this.setFirst(first_);
		this.setBindings(bindings_);
		this.setPredicate(predicate_);

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
	 * Creates a deep clone of this {@link ACompMapExpCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ACompMapExpCG} node
	 */
	public ACompMapExpCG clone(Map<INode,INode> oldToNewMap)
	{
		ACompMapExpCG node = new ACompMapExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type, oldToNewMap),
			cloneNode(_first, oldToNewMap),
			cloneList(_bindings, oldToNewMap),
			cloneNode(_predicate, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
	}



	public String toString()
	{
		return (_first!=null?_first.toString():this.getClass().getSimpleName())+ (_bindings!=null?_bindings.toString():this.getClass().getSimpleName())+ (_predicate!=null?_predicate.toString():this.getClass().getSimpleName());
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
		fields.put("_first",this._first);
		fields.put("_bindings",this._bindings);
		fields.put("_predicate",this._predicate);
		return fields;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ACompMapExpCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ACompMapExpCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ACompMapExpCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			this._type = null;
			return;
		}

		if (this._first == child) {
			this._first = null;
			return;
		}

		if (this._bindings.remove(child)) {
				return;
		}
		if (this._predicate == child) {
			this._predicate = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	 * Returns a deep clone of this {@link ACompMapExpCG} node.
	 * @return a deep clone of this {@link ACompMapExpCG} node
	 */
	public ACompMapExpCG clone()
	{
		return new ACompMapExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type),
			cloneNode(_first),
			cloneList(_bindings),
			cloneNode(_predicate)
		);
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof ACompMapExpCG)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Sets the {@code _first} child of this {@link ACompMapExpCG} node.
	 * @param value the new {@code _first} child of this {@link ACompMapExpCG} node
	*/
	public void setFirst(AMapletExpCG value)
	{
		if (this._first != null) {
			this._first.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._first = value;

	}


	/**
	 * @return the {@link AMapletExpCG} node which is the {@code _first} child of this {@link ACompMapExpCG} node
	*/
	public AMapletExpCG getFirst()
	{
		return this._first;
	}


	/**
	 * Sets the {@code _bindings} child of this {@link ACompMapExpCG} node.
	 * @param value the new {@code _bindings} child of this {@link ACompMapExpCG} node
	*/
	public void setBindings(List<? extends ASetMultipleBindCG> value)
	{
		if (this._bindings.equals(value)) {
			return;
		}
		this._bindings.clear();
		if (value != null) {
			this._bindings.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _bindings} child of this {@link ACompMapExpCG} node
	*/
	public LinkedList<ASetMultipleBindCG> getBindings()
	{
		return this._bindings;
	}


	/**
	 * Sets the {@code _predicate} child of this {@link ACompMapExpCG} node.
	 * @param value the new {@code _predicate} child of this {@link ACompMapExpCG} node
	*/
	public void setPredicate(SExpCG value)
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
	 * @return the {@link SExpCG} node which is the {@code _predicate} child of this {@link ACompMapExpCG} node
	*/
	public SExpCG getPredicate()
	{
		return this._predicate;
	}


	/**
	* Calls the {@link IAnalysis#caseACompMapExpCG(ACompMapExpCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ACompMapExpCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseACompMapExpCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseACompMapExpCG(ACompMapExpCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ACompMapExpCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseACompMapExpCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseACompMapExpCG(ACompMapExpCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ACompMapExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseACompMapExpCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseACompMapExpCG(ACompMapExpCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ACompMapExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseACompMapExpCG(this,question);
	}



}
