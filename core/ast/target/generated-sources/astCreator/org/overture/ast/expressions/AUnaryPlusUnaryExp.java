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


import org.overture.ast.expressions.AUnaryPlusUnaryExp;
import java.util.HashMap;
import org.overture.ast.expressions.PExp;
import org.overture.ast.expressions.SUnaryExpBase;
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
public class AUnaryPlusUnaryExp extends SUnaryExpBase
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code AUnaryPlusUnaryExp} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public AUnaryPlusUnaryExp(PType type_, ILexLocation location_, PExp exp_)
	{
		super(type_,location_,exp_);

	}


	/**
	 * Creates a new {@link AUnaryPlusUnaryExp} node with no children.
	 */
	public AUnaryPlusUnaryExp()
	{

	}


	/**
	* Creates a new {@code AUnaryPlusUnaryExp TAG=unaryPlus} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public AUnaryPlusUnaryExp(ILexLocation location_, PExp exp_)
	{
		super(null,location_,exp_);

	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AUnaryPlusUnaryExp)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Creates a deep clone of this {@link AUnaryPlusUnaryExp} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AUnaryPlusUnaryExp} node
	 */
	public AUnaryPlusUnaryExp clone(Map<INode,INode> oldToNewMap)
	{
		AUnaryPlusUnaryExp node = new AUnaryPlusUnaryExp(
			_type,
			_location,
			cloneNode(_exp, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	 * Returns a deep clone of this {@link AUnaryPlusUnaryExp} node.
	 * @return a deep clone of this {@link AUnaryPlusUnaryExp} node
	 */
	public AUnaryPlusUnaryExp clone()
	{
		return new AUnaryPlusUnaryExp(
			_type,
			_location,
			cloneNode(_exp)
		);
	}



	public String toString()
	{
		return "" + "(+ "+_exp+")";
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
	 * Removes the {@link INode} {@code child} as a child of this {@link AUnaryPlusUnaryExp} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AUnaryPlusUnaryExp} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AUnaryPlusUnaryExp} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._exp == child) {
			this._exp = null;
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
		return fields;
	}


	/**
	* Calls the {@link IAnalysis#caseAUnaryPlusUnaryExp(AUnaryPlusUnaryExp)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AUnaryPlusUnaryExp} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAUnaryPlusUnaryExp(this);
	}


	/**
	* Calls the {@link IAnswer#caseAUnaryPlusUnaryExp(AUnaryPlusUnaryExp)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AUnaryPlusUnaryExp} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAUnaryPlusUnaryExp(this);
	}


	/**
	* Calls the {@link IQuestion#caseAUnaryPlusUnaryExp(AUnaryPlusUnaryExp, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AUnaryPlusUnaryExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAUnaryPlusUnaryExp(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAUnaryPlusUnaryExp(AUnaryPlusUnaryExp, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AUnaryPlusUnaryExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAUnaryPlusUnaryExp(this,question);
	}



}
