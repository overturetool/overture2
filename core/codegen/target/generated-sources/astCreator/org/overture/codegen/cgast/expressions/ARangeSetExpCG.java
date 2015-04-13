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
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import org.overture.codegen.cgast.INode;
import java.util.HashMap;
import org.overture.codegen.cgast.SExpCG;
import org.overture.codegen.cgast.expressions.SSetExpBase;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import org.overture.codegen.cgast.STypeCG;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;
import org.overture.codegen.cgast.expressions.ARangeSetExpCG;
import org.overture.codegen.cgast.analysis.intf.IAnswer;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class ARangeSetExpCG extends SSetExpBase
{
	private static final long serialVersionUID = 1L;

	private SExpCG _first;
	private SExpCG _last;

	/**
	* Creates a new {@code ARangeSetExpCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param first_ the {@link SExpCG} node for the {@code first} child of this {@link ARangeSetExpCG} node
	* @param last_ the {@link SExpCG} node for the {@code last} child of this {@link ARangeSetExpCG} node
	*/
	public ARangeSetExpCG(SourceNode sourceNode_, Object tag_, STypeCG type_, SExpCG first_, SExpCG last_)
	{
		super(sourceNode_,tag_,type_);
		this.setFirst(first_);
		this.setLast(last_);

	}


	/**
	* Creates a new {@code ARangeSetExpCG TAG=range} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param first_ the {@link SExpCG} node for the {@code first} child of this {@link ARangeSetExpCG} node
	* @param last_ the {@link SExpCG} node for the {@code last} child of this {@link ARangeSetExpCG} node
	*/
	public ARangeSetExpCG(SourceNode sourceNode_, STypeCG type_, SExpCG first_, SExpCG last_)
	{
		super(sourceNode_,null,type_);
		this.setFirst(first_);
		this.setLast(last_);

	}


	/**
	 * Creates a new {@link ARangeSetExpCG} node with no children.
	 */
	public ARangeSetExpCG()
	{

	}


	/**
	 * Creates a deep clone of this {@link ARangeSetExpCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ARangeSetExpCG} node
	 */
	public ARangeSetExpCG clone(Map<INode,INode> oldToNewMap)
	{
		ARangeSetExpCG node = new ARangeSetExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type, oldToNewMap),
			cloneNode(_first, oldToNewMap),
			cloneNode(_last, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
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
		fields.put("_last",this._last);
		return fields;
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof ARangeSetExpCG)		{
			 return toString().equals(o.toString());
		}
		return false;
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
	 * Removes the {@link INode} {@code child} as a child of this {@link ARangeSetExpCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ARangeSetExpCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ARangeSetExpCG} node
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

		if (this._last == child) {
			this._last = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}



	public String toString()
	{
		return (_first!=null?_first.toString():this.getClass().getSimpleName())+ (_last!=null?_last.toString():this.getClass().getSimpleName());
	}


	/**
	 * Returns a deep clone of this {@link ARangeSetExpCG} node.
	 * @return a deep clone of this {@link ARangeSetExpCG} node
	 */
	public ARangeSetExpCG clone()
	{
		return new ARangeSetExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type),
			cloneNode(_first),
			cloneNode(_last)
		);
	}


	/**
	 * Sets the {@code _first} child of this {@link ARangeSetExpCG} node.
	 * @param value the new {@code _first} child of this {@link ARangeSetExpCG} node
	*/
	public void setFirst(SExpCG value)
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
	 * @return the {@link SExpCG} node which is the {@code _first} child of this {@link ARangeSetExpCG} node
	*/
	public SExpCG getFirst()
	{
		return this._first;
	}


	/**
	 * Sets the {@code _last} child of this {@link ARangeSetExpCG} node.
	 * @param value the new {@code _last} child of this {@link ARangeSetExpCG} node
	*/
	public void setLast(SExpCG value)
	{
		if (this._last != null) {
			this._last.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._last = value;

	}


	/**
	 * @return the {@link SExpCG} node which is the {@code _last} child of this {@link ARangeSetExpCG} node
	*/
	public SExpCG getLast()
	{
		return this._last;
	}


	/**
	* Calls the {@link IAnalysis#caseARangeSetExpCG(ARangeSetExpCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ARangeSetExpCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseARangeSetExpCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseARangeSetExpCG(ARangeSetExpCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ARangeSetExpCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseARangeSetExpCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseARangeSetExpCG(ARangeSetExpCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ARangeSetExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseARangeSetExpCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseARangeSetExpCG(ARangeSetExpCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ARangeSetExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseARangeSetExpCG(this,question);
	}



}
