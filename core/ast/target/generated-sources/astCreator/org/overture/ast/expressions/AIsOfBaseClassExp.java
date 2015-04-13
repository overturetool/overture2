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
import org.overture.ast.expressions.AIsOfBaseClassExp;
import org.overture.ast.expressions.PExp;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.expressions.PExpBase;
import org.overture.ast.intf.lex.ILexNameToken;
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
public class AIsOfBaseClassExp extends PExpBase
{
	private static final long serialVersionUID = 1L;

	private ILexNameToken _baseClass;
	private PExp _exp;

	/**
	 * Creates a new {@link AIsOfBaseClassExp} node with no children.
	 */
	public AIsOfBaseClassExp()
	{

	}


	/**
	* Creates a new {@code AIsOfBaseClassExp TAG=isOfBaseClass} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param baseClass_ the {@link ILexNameToken} node for the {@code baseClass} child of this {@link AIsOfBaseClassExp} node
	* @param exp_ the {@link PExp} node for the {@code exp} child of this {@link AIsOfBaseClassExp} node
	*/
	public AIsOfBaseClassExp(ILexLocation location_, ILexNameToken baseClass_, PExp exp_)
	{
		super(null,location_);
		this.setBaseClass(baseClass_);
		this.setExp(exp_);

	}


	/**
	* Creates a new {@code AIsOfBaseClassExp} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param baseClass_ the {@link ILexNameToken} node for the {@code baseClass} child of this {@link AIsOfBaseClassExp} node
	* @param exp_ the {@link PExp} node for the {@code exp} child of this {@link AIsOfBaseClassExp} node
	*/
	public AIsOfBaseClassExp(PType type_, ILexLocation location_, ILexNameToken baseClass_, PExp exp_)
	{
		super(type_,location_);
		this.setBaseClass(baseClass_);
		this.setExp(exp_);

	}


	/**
	 * Creates a deep clone of this {@link AIsOfBaseClassExp} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AIsOfBaseClassExp} node
	 */
	public AIsOfBaseClassExp clone(Map<INode,INode> oldToNewMap)
	{
		AIsOfBaseClassExp node = new AIsOfBaseClassExp(
			_type,
			_location,
			cloneNode(_baseClass, oldToNewMap),
			cloneNode(_exp, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AIsOfBaseClassExp)		{
			 return toString().equals(o.toString());
		}
		return false;
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
		fields.put("_baseClass",this._baseClass);
		fields.put("_exp",this._exp);
		return fields;
	}



	public String toString()
	{
		return "" + "isofbaseclass("+_baseClass+","+_exp+")";
	}


	/**
	 * Returns a deep clone of this {@link AIsOfBaseClassExp} node.
	 * @return a deep clone of this {@link AIsOfBaseClassExp} node
	 */
	public AIsOfBaseClassExp clone()
	{
		return new AIsOfBaseClassExp(
			_type,
			_location,
			cloneNode(_baseClass),
			cloneNode(_exp)
		);
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
	 * Removes the {@link INode} {@code child} as a child of this {@link AIsOfBaseClassExp} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AIsOfBaseClassExp} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AIsOfBaseClassExp} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._baseClass == child) {
			this._baseClass = null;
			return;
		}

		if (this._exp == child) {
			this._exp = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	 * Sets the {@code _baseClass} child of this {@link AIsOfBaseClassExp} node.
	 * @param value the new {@code _baseClass} child of this {@link AIsOfBaseClassExp} node
	*/
	public void setBaseClass(ILexNameToken value)
	{
		if (this._baseClass != null) {
			this._baseClass.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._baseClass = value;

	}


	/**
	 * @return the {@link ILexNameToken} node which is the {@code _baseClass} child of this {@link AIsOfBaseClassExp} node
	*/
	public ILexNameToken getBaseClass()
	{
		return this._baseClass;
	}


	/**
	 * Sets the {@code _exp} child of this {@link AIsOfBaseClassExp} node.
	 * @param value the new {@code _exp} child of this {@link AIsOfBaseClassExp} node
	*/
	public void setExp(PExp value)
	{
		if (this._exp != null) {
			this._exp.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._exp = value;

	}


	/**
	 * @return the {@link PExp} node which is the {@code _exp} child of this {@link AIsOfBaseClassExp} node
	*/
	public PExp getExp()
	{
		return this._exp;
	}


	/**
	* Calls the {@link IAnalysis#caseAIsOfBaseClassExp(AIsOfBaseClassExp)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AIsOfBaseClassExp} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAIsOfBaseClassExp(this);
	}


	/**
	* Calls the {@link IAnswer#caseAIsOfBaseClassExp(AIsOfBaseClassExp)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AIsOfBaseClassExp} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAIsOfBaseClassExp(this);
	}


	/**
	* Calls the {@link IQuestion#caseAIsOfBaseClassExp(AIsOfBaseClassExp, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AIsOfBaseClassExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAIsOfBaseClassExp(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAIsOfBaseClassExp(AIsOfBaseClassExp, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AIsOfBaseClassExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAIsOfBaseClassExp(this,question);
	}



}
