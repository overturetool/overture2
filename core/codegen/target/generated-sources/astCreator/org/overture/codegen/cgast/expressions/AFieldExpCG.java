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
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import org.overture.codegen.cgast.STypeCG;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;
import org.overture.codegen.cgast.expressions.AFieldExpCG;
import org.overture.codegen.cgast.analysis.intf.IAnswer;
import org.overture.codegen.cgast.SExpCGBase;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AFieldExpCG extends SExpCGBase
{
	private static final long serialVersionUID = 1L;

	private SExpCG _object;
	private String _memberName;

	/**
	* Creates a new {@code AFieldExpCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param object_ the {@link SExpCG} node for the {@code object} child of this {@link AFieldExpCG} node
	* @param memberName_ the {@link String} node for the {@code memberName} child of this {@link AFieldExpCG} node
	*/
	public AFieldExpCG(SourceNode sourceNode_, Object tag_, STypeCG type_, SExpCG object_, String memberName_)
	{
		super(sourceNode_,tag_,type_);
		this.setObject(object_);
		this.setMemberName(memberName_);

	}


	/**
	* Creates a new {@code AFieldExpCG TAG=field} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param object_ the {@link SExpCG} node for the {@code object} child of this {@link AFieldExpCG} node
	* @param memberName_ the {@link String} node for the {@code memberName} child of this {@link AFieldExpCG} node
	*/
	public AFieldExpCG(SourceNode sourceNode_, STypeCG type_, SExpCG object_, String memberName_)
	{
		super(sourceNode_,null,type_);
		this.setObject(object_);
		this.setMemberName(memberName_);

	}


	/**
	 * Creates a new {@link AFieldExpCG} node with no children.
	 */
	public AFieldExpCG()
	{

	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AFieldExpCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AFieldExpCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AFieldExpCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			this._type = null;
			return;
		}

		if (this._object == child) {
			this._object = null;
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
		fields.put("_object",this._object);
		fields.put("_memberName",this._memberName);
		return fields;
	}


	/**
	 * Creates a deep clone of this {@link AFieldExpCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AFieldExpCG} node
	 */
	public AFieldExpCG clone(Map<INode,INode> oldToNewMap)
	{
		AFieldExpCG node = new AFieldExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type, oldToNewMap),
			cloneNode(_object, oldToNewMap),
			_memberName
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
		if (o != null && o instanceof AFieldExpCG)		{
			 return toString().equals(o.toString());
		}
		return false;
	}



	public String toString()
	{
		return (_object!=null?_object.toString():this.getClass().getSimpleName())+ (_memberName!=null?_memberName.toString():this.getClass().getSimpleName());
	}


	/**
	 * Returns a deep clone of this {@link AFieldExpCG} node.
	 * @return a deep clone of this {@link AFieldExpCG} node
	 */
	public AFieldExpCG clone()
	{
		return new AFieldExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type),
			cloneNode(_object),
			_memberName
		);
	}


	/**
	 * Sets the {@code _object} child of this {@link AFieldExpCG} node.
	 * @param value the new {@code _object} child of this {@link AFieldExpCG} node
	*/
	public void setObject(SExpCG value)
	{
		if (this._object != null) {
			this._object.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._object = value;

	}


	/**
	 * @return the {@link SExpCG} node which is the {@code _object} child of this {@link AFieldExpCG} node
	*/
	public SExpCG getObject()
	{
		return this._object;
	}


	/**
	 * Sets the {@code _memberName} child of this {@link AFieldExpCG} node.
	 * @param value the new {@code _memberName} child of this {@link AFieldExpCG} node
	*/
	public void setMemberName(String value)
	{
		this._memberName = value;
	}


	/**
	 * @return the {@link String} node which is the {@code _memberName} child of this {@link AFieldExpCG} node
	*/
	public String getMemberName()
	{
		return this._memberName;
	}


	/**
	* Calls the {@link IAnalysis#caseAFieldExpCG(AFieldExpCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AFieldExpCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseAFieldExpCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseAFieldExpCG(AFieldExpCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AFieldExpCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAFieldExpCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseAFieldExpCG(AFieldExpCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AFieldExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAFieldExpCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAFieldExpCG(AFieldExpCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AFieldExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAFieldExpCG(this,question);
	}



}
