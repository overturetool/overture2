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

package org.overture.codegen.cgast.traces;


import org.overture.codegen.cgast.analysis.intf.IQuestion;
import org.overture.codegen.cgast.PCG;
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import org.overture.codegen.cgast.NodeList;
import java.util.HashMap;
import org.overture.codegen.cgast.INode;
import java.util.List;
import org.overture.codegen.cgast.traces.ALetDefBindingTraceDeclCG;
import org.overture.codegen.cgast.STraceDeclCGBase;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;
import java.util.LinkedList;
import org.overture.codegen.cgast.analysis.intf.IAnswer;
import org.overture.codegen.cgast.SDeclCG;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class ALetDefBindingTraceDeclCG extends STraceDeclCGBase
{
	private static final long serialVersionUID = 1L;

	private NodeList<SDeclCG> _localDecls = new NodeList<SDeclCG>(this);
	private PCG _body;

	/**
	* Creates a new {@code ALetDefBindingTraceDeclCG TAG=letDefBinding} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param localDecls_ the {@link NodeList} node for the {@code localDecls} child of this {@link ALetDefBindingTraceDeclCG} node
	* @param body_ the {@link PCG} node for the {@code body} child of this {@link ALetDefBindingTraceDeclCG} node
	*/
	public ALetDefBindingTraceDeclCG(SourceNode sourceNode_, List<? extends SDeclCG> localDecls_, PCG body_)
	{
		super(sourceNode_,null);
		this.setLocalDecls(localDecls_);
		this.setBody(body_);

	}


	/**
	* Creates a new {@code ALetDefBindingTraceDeclCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param localDecls_ the {@link NodeList} node for the {@code localDecls} child of this {@link ALetDefBindingTraceDeclCG} node
	* @param body_ the {@link PCG} node for the {@code body} child of this {@link ALetDefBindingTraceDeclCG} node
	*/
	public ALetDefBindingTraceDeclCG(SourceNode sourceNode_, Object tag_, List<? extends SDeclCG> localDecls_, PCG body_)
	{
		super(sourceNode_,tag_);
		this.setLocalDecls(localDecls_);
		this.setBody(body_);

	}


	/**
	 * Creates a new {@link ALetDefBindingTraceDeclCG} node with no children.
	 */
	public ALetDefBindingTraceDeclCG()
	{

	}



	public String toString()
	{
		return (_localDecls!=null?_localDecls.toString():this.getClass().getSimpleName())+ (_body!=null?_body.toString():this.getClass().getSimpleName());
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
		fields.put("_localDecls",this._localDecls);
		fields.put("_body",this._body);
		return fields;
	}


	/**
	 * Returns a deep clone of this {@link ALetDefBindingTraceDeclCG} node.
	 * @return a deep clone of this {@link ALetDefBindingTraceDeclCG} node
	 */
	public ALetDefBindingTraceDeclCG clone()
	{
		return new ALetDefBindingTraceDeclCG(
			_sourceNode,
			_tag,
			cloneList(_localDecls),
			cloneNode(_body)
		);
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ALetDefBindingTraceDeclCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ALetDefBindingTraceDeclCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ALetDefBindingTraceDeclCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._localDecls.remove(child)) {
				return;
		}
		if (this._body == child) {
			this._body = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	 * Creates a deep clone of this {@link ALetDefBindingTraceDeclCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ALetDefBindingTraceDeclCG} node
	 */
	public ALetDefBindingTraceDeclCG clone(Map<INode,INode> oldToNewMap)
	{
		ALetDefBindingTraceDeclCG node = new ALetDefBindingTraceDeclCG(
			_sourceNode,
			_tag,
			cloneList(_localDecls, oldToNewMap),
			cloneNode(_body, oldToNewMap)
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
		if (o != null && o instanceof ALetDefBindingTraceDeclCG)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Sets the {@code _localDecls} child of this {@link ALetDefBindingTraceDeclCG} node.
	 * @param value the new {@code _localDecls} child of this {@link ALetDefBindingTraceDeclCG} node
	*/
	public void setLocalDecls(List<? extends SDeclCG> value)
	{
		if (this._localDecls.equals(value)) {
			return;
		}
		this._localDecls.clear();
		if (value != null) {
			this._localDecls.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _localDecls} child of this {@link ALetDefBindingTraceDeclCG} node
	*/
	public LinkedList<SDeclCG> getLocalDecls()
	{
		return this._localDecls;
	}


	/**
	 * Sets the {@code _body} child of this {@link ALetDefBindingTraceDeclCG} node.
	 * @param value the new {@code _body} child of this {@link ALetDefBindingTraceDeclCG} node
	*/
	public void setBody(PCG value)
	{
		if (this._body != null) {
			this._body.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._body = value;

	}


	/**
	 * @return the {@link PCG} node which is the {@code _body} child of this {@link ALetDefBindingTraceDeclCG} node
	*/
	public PCG getBody()
	{
		return this._body;
	}


	/**
	* Calls the {@link IAnalysis#caseALetDefBindingTraceDeclCG(ALetDefBindingTraceDeclCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ALetDefBindingTraceDeclCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseALetDefBindingTraceDeclCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseALetDefBindingTraceDeclCG(ALetDefBindingTraceDeclCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ALetDefBindingTraceDeclCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseALetDefBindingTraceDeclCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseALetDefBindingTraceDeclCG(ALetDefBindingTraceDeclCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ALetDefBindingTraceDeclCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseALetDefBindingTraceDeclCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseALetDefBindingTraceDeclCG(ALetDefBindingTraceDeclCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ALetDefBindingTraceDeclCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseALetDefBindingTraceDeclCG(this,question);
	}



}
