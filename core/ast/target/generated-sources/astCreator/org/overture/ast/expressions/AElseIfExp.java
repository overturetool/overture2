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


import java.util.HashMap;
import org.overture.ast.expressions.PExp;
import org.overture.ast.expressions.AElseIfExp;
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


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AElseIfExp extends PExpBase
{
	private static final long serialVersionUID = 1L;

	private PExp _elseIf;
	private PExp _then;

	/**
	* Creates a new {@code AElseIfExp TAG=elseIf} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param elseIf_ the {@link PExp} node for the {@code elseIf} child of this {@link AElseIfExp} node
	* @param then_ the {@link PExp} node for the {@code then} child of this {@link AElseIfExp} node
	*/
	public AElseIfExp(ILexLocation location_, PExp elseIf_, PExp then_)
	{
		super(null,location_);
		this.setElseIf(elseIf_);
		this.setThen(then_);

	}


	/**
	* Creates a new {@code AElseIfExp} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param elseIf_ the {@link PExp} node for the {@code elseIf} child of this {@link AElseIfExp} node
	* @param then_ the {@link PExp} node for the {@code then} child of this {@link AElseIfExp} node
	*/
	public AElseIfExp(PType type_, ILexLocation location_, PExp elseIf_, PExp then_)
	{
		super(type_,location_);
		this.setElseIf(elseIf_);
		this.setThen(then_);

	}


	/**
	 * Creates a new {@link AElseIfExp} node with no children.
	 */
	public AElseIfExp()
	{

	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AElseIfExp)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link AElseIfExp} node.
	 * @return a deep clone of this {@link AElseIfExp} node
	 */
	public AElseIfExp clone()
	{
		return new AElseIfExp(
			_type,
			_location,
			cloneNode(_elseIf),
			cloneNode(_then)
		);
	}


	/**
	 * Creates a deep clone of this {@link AElseIfExp} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AElseIfExp} node
	 */
	public AElseIfExp clone(Map<INode,INode> oldToNewMap)
	{
		AElseIfExp node = new AElseIfExp(
			_type,
			_location,
			cloneNode(_elseIf, oldToNewMap),
			cloneNode(_then, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AElseIfExp} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AElseIfExp} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AElseIfExp} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._elseIf == child) {
			this._elseIf = null;
			return;
		}

		if (this._then == child) {
			this._then = null;
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



	public String toString()
	{
		return "" + "elseif "+_elseIf+"\nthen "+_then;
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
		fields.put("_elseIf",this._elseIf);
		fields.put("_then",this._then);
		return fields;
	}


	/**
	 * Sets the {@code _elseIf} child of this {@link AElseIfExp} node.
	 * @param value the new {@code _elseIf} child of this {@link AElseIfExp} node
	*/
	public void setElseIf(PExp value)
	{
		if (this._elseIf != null) {
			this._elseIf.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._elseIf = value;

	}


	/**
	 * @return the {@link PExp} node which is the {@code _elseIf} child of this {@link AElseIfExp} node
	*/
	public PExp getElseIf()
	{
		return this._elseIf;
	}


	/**
	 * Sets the {@code _then} child of this {@link AElseIfExp} node.
	 * @param value the new {@code _then} child of this {@link AElseIfExp} node
	*/
	public void setThen(PExp value)
	{
		if (this._then != null) {
			this._then.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._then = value;

	}


	/**
	 * @return the {@link PExp} node which is the {@code _then} child of this {@link AElseIfExp} node
	*/
	public PExp getThen()
	{
		return this._then;
	}


	/**
	* Calls the {@link IAnalysis#caseAElseIfExp(AElseIfExp)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AElseIfExp} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAElseIfExp(this);
	}


	/**
	* Calls the {@link IAnswer#caseAElseIfExp(AElseIfExp)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AElseIfExp} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAElseIfExp(this);
	}


	/**
	* Calls the {@link IQuestion#caseAElseIfExp(AElseIfExp, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AElseIfExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAElseIfExp(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAElseIfExp(AElseIfExp, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AElseIfExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAElseIfExp(this,question);
	}



}
