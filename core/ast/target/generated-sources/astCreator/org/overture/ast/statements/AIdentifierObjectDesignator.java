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

package org.overture.ast.statements;


import org.overture.ast.statements.AIdentifierObjectDesignator;
import java.util.HashMap;
import org.overture.ast.statements.PObjectDesignatorBase;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.intf.lex.ILexNameToken;
import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import java.lang.String;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.expressions.AVariableExp;
import org.overture.ast.analysis.intf.IAnalysis;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AIdentifierObjectDesignator extends PObjectDesignatorBase
{
	private static final long serialVersionUID = 1L;

	private ILexNameToken _name;
	private AVariableExp _expression;

	/**
	 * Creates a new {@link AIdentifierObjectDesignator} node with no children.
	 */
	public AIdentifierObjectDesignator()
	{

	}



	/**
	* Creates a new {@code AIdentifierObjectDesignator} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param name_ the {@link ILexNameToken} node for the {@code name} child of this {@link AIdentifierObjectDesignator} node
	* @param expression_ the {@link AVariableExp} node for the {@code expression} child of this {@link AIdentifierObjectDesignator} node
	*/
	public AIdentifierObjectDesignator(ILexLocation location_, ILexNameToken name_, AVariableExp expression_)
	{
		super(location_);
		this.setName(name_);
		this.setExpression(expression_);

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
		return "" + _name;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AIdentifierObjectDesignator} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AIdentifierObjectDesignator} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AIdentifierObjectDesignator} node
	 */
	public void removeChild(INode child)
	{
		if (this._name == child) {
			this._name = null;
			return;
		}

		if (this._expression == child) {
			this._expression = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	 * Creates a deep clone of this {@link AIdentifierObjectDesignator} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AIdentifierObjectDesignator} node
	 */
	public AIdentifierObjectDesignator clone(Map<INode,INode> oldToNewMap)
	{
		AIdentifierObjectDesignator node = new AIdentifierObjectDesignator(
			_location,
			cloneNode(_name, oldToNewMap),
			cloneNode(_expression, oldToNewMap)
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
		fields.put("_name",this._name);
		fields.put("_expression",this._expression);
		return fields;
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AIdentifierObjectDesignator)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link AIdentifierObjectDesignator} node.
	 * @return a deep clone of this {@link AIdentifierObjectDesignator} node
	 */
	public AIdentifierObjectDesignator clone()
	{
		return new AIdentifierObjectDesignator(
			_location,
			cloneNode(_name),
			cloneNode(_expression)
		);
	}


	/**
	 * Sets the {@code _name} child of this {@link AIdentifierObjectDesignator} node.
	 * @param value the new {@code _name} child of this {@link AIdentifierObjectDesignator} node
	*/
	public void setName(ILexNameToken value)
	{
		if (this._name != null) {
			this._name.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._name = value;

	}


	/**
	 * @return the {@link ILexNameToken} node which is the {@code _name} child of this {@link AIdentifierObjectDesignator} node
	*/
	public ILexNameToken getName()
	{
		return this._name;
	}


	/**
	 * Sets the {@code _expression} child of this {@link AIdentifierObjectDesignator} node.
	 * @param value the new {@code _expression} child of this {@link AIdentifierObjectDesignator} node
	*/
	public void setExpression(AVariableExp value)
	{
		if (this._expression != null) {
			this._expression.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._expression = value;

	}


	/**
	 * @return the {@link AVariableExp} node which is the {@code _expression} child of this {@link AIdentifierObjectDesignator} node
	*/
	public AVariableExp getExpression()
	{
		return this._expression;
	}


	/**
	* Calls the {@link IAnalysis#caseAIdentifierObjectDesignator(AIdentifierObjectDesignator)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AIdentifierObjectDesignator} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAIdentifierObjectDesignator(this);
	}


	/**
	* Calls the {@link IAnswer#caseAIdentifierObjectDesignator(AIdentifierObjectDesignator)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AIdentifierObjectDesignator} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAIdentifierObjectDesignator(this);
	}


	/**
	* Calls the {@link IQuestion#caseAIdentifierObjectDesignator(AIdentifierObjectDesignator, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AIdentifierObjectDesignator} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAIdentifierObjectDesignator(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAIdentifierObjectDesignator(AIdentifierObjectDesignator, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AIdentifierObjectDesignator} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAIdentifierObjectDesignator(this,question);
	}



}
