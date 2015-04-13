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

package org.overture.codegen.cgast.types;


import org.overture.codegen.cgast.analysis.intf.IQuestion;
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.types.ARecordTypeCG;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import org.overture.codegen.cgast.INode;
import java.util.HashMap;
import org.overture.codegen.cgast.STypeCGBase;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import org.overture.codegen.cgast.name.ATypeNameCG;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;
import org.overture.codegen.cgast.analysis.intf.IAnswer;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class ARecordTypeCG extends STypeCGBase
{
	private static final long serialVersionUID = 1L;

	private ATypeNameCG _name;

	/**
	* Creates a new {@code ARecordTypeCG TAG=record} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param name_ the {@link ATypeNameCG} node for the {@code name} child of this {@link ARecordTypeCG} node
	*/
	public ARecordTypeCG(SourceNode sourceNode_, ATypeNameCG name_)
	{
		super(sourceNode_,null);
		this.setName(name_);

	}


	/**
	* Creates a new {@code ARecordTypeCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param name_ the {@link ATypeNameCG} node for the {@code name} child of this {@link ARecordTypeCG} node
	*/
	public ARecordTypeCG(SourceNode sourceNode_, Object tag_, ATypeNameCG name_)
	{
		super(sourceNode_,tag_);
		this.setName(name_);

	}


	/**
	 * Creates a new {@link ARecordTypeCG} node with no children.
	 */
	public ARecordTypeCG()
	{

	}



	public String toString()
	{
		return "" + _name;
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
	 * Removes the {@link INode} {@code child} as a child of this {@link ARecordTypeCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ARecordTypeCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ARecordTypeCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._name == child) {
			this._name = null;
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
		fields.put("_name",this._name);
		return fields;
	}


	/**
	 * Returns a deep clone of this {@link ARecordTypeCG} node.
	 * @return a deep clone of this {@link ARecordTypeCG} node
	 */
	public ARecordTypeCG clone()
	{
		return new ARecordTypeCG(
			_sourceNode,
			_tag,
			cloneNode(_name)
		);
	}


	/**
	 * Creates a deep clone of this {@link ARecordTypeCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ARecordTypeCG} node
	 */
	public ARecordTypeCG clone(Map<INode,INode> oldToNewMap)
	{
		ARecordTypeCG node = new ARecordTypeCG(
			_sourceNode,
			_tag,
			cloneNode(_name, oldToNewMap)
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
		if (o != null && o instanceof ARecordTypeCG)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Sets the {@code _name} child of this {@link ARecordTypeCG} node.
	 * @param value the new {@code _name} child of this {@link ARecordTypeCG} node
	*/
	public void setName(ATypeNameCG value)
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
	 * @return the {@link ATypeNameCG} node which is the {@code _name} child of this {@link ARecordTypeCG} node
	*/
	public ATypeNameCG getName()
	{
		return this._name;
	}


	/**
	* Calls the {@link IAnalysis#caseARecordTypeCG(ARecordTypeCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ARecordTypeCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseARecordTypeCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseARecordTypeCG(ARecordTypeCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ARecordTypeCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseARecordTypeCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseARecordTypeCG(ARecordTypeCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ARecordTypeCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseARecordTypeCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseARecordTypeCG(ARecordTypeCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ARecordTypeCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseARecordTypeCG(this,question);
	}



}
