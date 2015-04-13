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
import java.util.HashMap;
import org.overture.ast.expressions.PExp;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.expressions.PExpBase;
import org.overture.ast.intf.lex.ILexNameToken;
import org.overture.ast.expressions.AIsExp;
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
public class AIsExp extends PExpBase
{
	private static final long serialVersionUID = 1L;

	private ILexNameToken _typeName;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private PType _basicType;
	private PExp _test;
	private PDefinition _typedef;

	/**
	* Creates a new {@code AIsExp} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param typeName_ the {@link ILexNameToken} node for the {@code typeName} child of this {@link AIsExp} node
	* @param basicType_ the {@link PType} <b>graph</a> node for the {@code basicType} child of this {@link AIsExp} node.
	*  <i>The parent of this {@code basicType } will not be changed by adding it to this node.</i>
	* @param test_ the {@link PExp} node for the {@code test} child of this {@link AIsExp} node
	* @param typedef_ the {@link PDefinition} node for the {@code typedef} child of this {@link AIsExp} node
	*/
	public AIsExp(PType type_, ILexLocation location_, ILexNameToken typeName_, PType basicType_, PExp test_, PDefinition typedef_)
	{
		super(type_,location_);
		this.setTypeName(typeName_);
		this.setBasicType(basicType_);
		this.setTest(test_);
		this.setTypedef(typedef_);

	}


	/**
	 * Creates a new {@link AIsExp} node with no children.
	 */
	public AIsExp()
	{

	}


	/**
	* Creates a new {@code AIsExp TAG=is} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param typeName_ the {@link ILexNameToken} node for the {@code typeName} child of this {@link AIsExp} node
	* @param test_ the {@link PExp} node for the {@code test} child of this {@link AIsExp} node
	* @param typedef_ the {@link PDefinition} node for the {@code typedef} child of this {@link AIsExp} node
	*/
	public AIsExp(ILexLocation location_, ILexNameToken typeName_, PExp test_, PDefinition typedef_)
	{
		super(null,location_);
		this.setTypeName(typeName_);
		this.setTest(test_);
		this.setTypedef(typedef_);

	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AIsExp} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AIsExp} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AIsExp} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._typeName == child) {
			this._typeName = null;
			return;
		}

		if (this._basicType == child) {
			return;
		}

		if (this._test == child) {
			this._test = null;
			return;
		}

		if (this._typedef == child) {
			this._typedef = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	 * Creates a deep clone of this {@link AIsExp} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AIsExp} node
	 */
	public AIsExp clone(Map<INode,INode> oldToNewMap)
	{
		AIsExp node = new AIsExp(
			_type,
			_location,
			cloneNode(_typeName, oldToNewMap),
			_basicType,
			cloneNode(_test, oldToNewMap),
			cloneNode(_typedef, oldToNewMap)
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
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AIsExp)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link AIsExp} node.
	 * @return a deep clone of this {@link AIsExp} node
	 */
	public AIsExp clone()
	{
		return new AIsExp(
			_type,
			_location,
			cloneNode(_typeName),
			_basicType,
			cloneNode(_test),
			cloneNode(_typedef)
		);
	}



	public String toString()
	{
		return "" + "is_("+_test+", "+( _typeName == null ? _basicType : _typeName)+")";
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
		fields.put("_typeName",this._typeName);
		fields.put("_basicType",this._basicType);
		fields.put("_test",this._test);
		fields.put("_typedef",this._typedef);
		return fields;
	}


	/**
	 * Sets the {@code _typeName} child of this {@link AIsExp} node.
	 * @param value the new {@code _typeName} child of this {@link AIsExp} node
	*/
	public void setTypeName(ILexNameToken value)
	{
		if (this._typeName != null) {
			this._typeName.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._typeName = value;

	}


	/**
	 * @return the {@link ILexNameToken} node which is the {@code _typeName} child of this {@link AIsExp} node
	*/
	public ILexNameToken getTypeName()
	{
		return this._typeName;
	}


	/**
	 * Sets the {@code _basicType} child of this {@link AIsExp} node.
	 * @param value the new {@code _basicType} child of this {@link AIsExp} node
	*/
	public void setBasicType(PType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._basicType = value;

	}


	/**
	 * @return the {@link PType} node which is the {@code _basicType} child of this {@link AIsExp} node
	*/
	public PType getBasicType()
	{
		return this._basicType;
	}


	/**
	 * Sets the {@code _test} child of this {@link AIsExp} node.
	 * @param value the new {@code _test} child of this {@link AIsExp} node
	*/
	public void setTest(PExp value)
	{
		if (this._test != null) {
			this._test.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._test = value;

	}


	/**
	 * @return the {@link PExp} node which is the {@code _test} child of this {@link AIsExp} node
	*/
	public PExp getTest()
	{
		return this._test;
	}


	/**
	 * Sets the {@code _typedef} child of this {@link AIsExp} node.
	 * @param value the new {@code _typedef} child of this {@link AIsExp} node
	*/
	public void setTypedef(PDefinition value)
	{
		if (this._typedef != null) {
			this._typedef.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._typedef = value;

	}


	/**
	 * @return the {@link PDefinition} node which is the {@code _typedef} child of this {@link AIsExp} node
	*/
	public PDefinition getTypedef()
	{
		return this._typedef;
	}


	/**
	* Calls the {@link IAnalysis#caseAIsExp(AIsExp)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AIsExp} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAIsExp(this);
	}


	/**
	* Calls the {@link IAnswer#caseAIsExp(AIsExp)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AIsExp} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAIsExp(this);
	}


	/**
	* Calls the {@link IQuestion#caseAIsExp(AIsExp, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AIsExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAIsExp(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAIsExp(AIsExp, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AIsExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAIsExp(this,question);
	}



}
