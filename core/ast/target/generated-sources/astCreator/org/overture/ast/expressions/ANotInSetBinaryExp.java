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


import org.overture.ast.expressions.SBinaryExpBase;
import org.overture.ast.expressions.ANotInSetBinaryExp;
import org.overture.ast.intf.lex.ILexToken;
import java.util.HashMap;
import org.overture.ast.expressions.PExp;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.analysis.intf.IAnswer;
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
public class ANotInSetBinaryExp extends SBinaryExpBase
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code ANotInSetBinaryExp} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public ANotInSetBinaryExp(PType type_, ILexLocation location_, PExp left_, ILexToken op_, PExp right_)
	{
		super(type_,location_,left_,op_,right_);

	}


	/**
	* Creates a new {@code ANotInSetBinaryExp TAG=notInSet} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public ANotInSetBinaryExp(ILexLocation location_, PExp left_, ILexToken op_, PExp right_)
	{
		super(null,location_,left_,op_,right_);

	}


	/**
	 * Creates a new {@link ANotInSetBinaryExp} node with no children.
	 */
	public ANotInSetBinaryExp()
	{

	}



	public String toString()
	{
		return super.toString();
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof ANotInSetBinaryExp)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ANotInSetBinaryExp} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ANotInSetBinaryExp} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ANotInSetBinaryExp} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._left == child) {
			this._left = null;
			return;
		}

		if (this._op == child) {
			this._op = null;
			return;
		}

		if (this._right == child) {
			this._right = null;
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
	 * Creates a deep clone of this {@link ANotInSetBinaryExp} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ANotInSetBinaryExp} node
	 */
	public ANotInSetBinaryExp clone(Map<INode,INode> oldToNewMap)
	{
		ANotInSetBinaryExp node = new ANotInSetBinaryExp(
			_type,
			_location,
			cloneNode(_left, oldToNewMap),
			cloneNode(_op, oldToNewMap),
			cloneNode(_right, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	 * Returns a deep clone of this {@link ANotInSetBinaryExp} node.
	 * @return a deep clone of this {@link ANotInSetBinaryExp} node
	 */
	public ANotInSetBinaryExp clone()
	{
		return new ANotInSetBinaryExp(
			_type,
			_location,
			cloneNode(_left),
			cloneNode(_op),
			cloneNode(_right)
		);
	}


	/**
	* Calls the {@link IAnalysis#caseANotInSetBinaryExp(ANotInSetBinaryExp)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ANotInSetBinaryExp} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseANotInSetBinaryExp(this);
	}


	/**
	* Calls the {@link IAnswer#caseANotInSetBinaryExp(ANotInSetBinaryExp)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ANotInSetBinaryExp} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseANotInSetBinaryExp(this);
	}


	/**
	* Calls the {@link IQuestion#caseANotInSetBinaryExp(ANotInSetBinaryExp, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ANotInSetBinaryExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseANotInSetBinaryExp(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseANotInSetBinaryExp(ANotInSetBinaryExp, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ANotInSetBinaryExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseANotInSetBinaryExp(this,question);
	}



}
