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


import org.overture.ast.intf.lex.ILexRealToken;
import org.overture.ast.expressions.ARealLiteralExp;
import java.util.HashMap;
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
public class ARealLiteralExp extends PExpBase
{
	private static final long serialVersionUID = 1L;

	private ILexRealToken _value;

	/**
	 * Creates a new {@link ARealLiteralExp} node with no children.
	 */
	public ARealLiteralExp()
	{

	}


	/**
	* Creates a new {@code ARealLiteralExp TAG=realLiteral} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param value_ the {@link ILexRealToken} node for the {@code value} child of this {@link ARealLiteralExp} node
	*/
	public ARealLiteralExp(ILexLocation location_, ILexRealToken value_)
	{
		super(null,location_);
		this.setValue(value_);

	}


	/**
	* Creates a new {@code ARealLiteralExp} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param value_ the {@link ILexRealToken} node for the {@code value} child of this {@link ARealLiteralExp} node
	*/
	public ARealLiteralExp(PType type_, ILexLocation location_, ILexRealToken value_)
	{
		super(type_,location_);
		this.setValue(value_);

	}


	/**
	 * Returns a deep clone of this {@link ARealLiteralExp} node.
	 * @return a deep clone of this {@link ARealLiteralExp} node
	 */
	public ARealLiteralExp clone()
	{
		return new ARealLiteralExp(
			_type,
			_location,
			cloneNode(_value)
		);
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof ARealLiteralExp)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ARealLiteralExp} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ARealLiteralExp} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ARealLiteralExp} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._value == child) {
			this._value = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	 * Creates a deep clone of this {@link ARealLiteralExp} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ARealLiteralExp} node
	 */
	public ARealLiteralExp clone(Map<INode,INode> oldToNewMap)
	{
		ARealLiteralExp node = new ARealLiteralExp(
			_type,
			_location,
			cloneNode(_value, oldToNewMap)
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



	public String toString()
	{
		return "" + _value;
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
		fields.put("_value",this._value);
		return fields;
	}


	/**
	 * Sets the {@code _value} child of this {@link ARealLiteralExp} node.
	 * @param value the new {@code _value} child of this {@link ARealLiteralExp} node
	*/
	public void setValue(ILexRealToken value)
	{
		if (this._value != null) {
			this._value.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._value = value;

	}


	/**
	 * @return the {@link ILexRealToken} node which is the {@code _value} child of this {@link ARealLiteralExp} node
	*/
	public ILexRealToken getValue()
	{
		return this._value;
	}


	/**
	* Calls the {@link IAnalysis#caseARealLiteralExp(ARealLiteralExp)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ARealLiteralExp} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseARealLiteralExp(this);
	}


	/**
	* Calls the {@link IAnswer#caseARealLiteralExp(ARealLiteralExp)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ARealLiteralExp} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseARealLiteralExp(this);
	}


	/**
	* Calls the {@link IQuestion#caseARealLiteralExp(ARealLiteralExp, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ARealLiteralExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseARealLiteralExp(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseARealLiteralExp(ARealLiteralExp, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ARealLiteralExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseARealLiteralExp(this,question);
	}



}
