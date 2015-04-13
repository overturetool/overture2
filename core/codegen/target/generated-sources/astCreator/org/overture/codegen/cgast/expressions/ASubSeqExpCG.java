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
import org.overture.codegen.cgast.expressions.ASubSeqExpCG;
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
import org.overture.codegen.cgast.analysis.intf.IAnswer;
import org.overture.codegen.cgast.SExpCGBase;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class ASubSeqExpCG extends SExpCGBase
{
	private static final long serialVersionUID = 1L;

	private SExpCG _seq;
	private SExpCG _from;
	private SExpCG _to;

	/**
	* Creates a new {@code ASubSeqExpCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param seq_ the {@link SExpCG} node for the {@code seq} child of this {@link ASubSeqExpCG} node
	* @param from_ the {@link SExpCG} node for the {@code from} child of this {@link ASubSeqExpCG} node
	* @param to_ the {@link SExpCG} node for the {@code to} child of this {@link ASubSeqExpCG} node
	*/
	public ASubSeqExpCG(SourceNode sourceNode_, Object tag_, STypeCG type_, SExpCG seq_, SExpCG from_, SExpCG to_)
	{
		super(sourceNode_,tag_,type_);
		this.setSeq(seq_);
		this.setFrom(from_);
		this.setTo(to_);

	}


	/**
	* Creates a new {@code ASubSeqExpCG TAG=subSeq} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param seq_ the {@link SExpCG} node for the {@code seq} child of this {@link ASubSeqExpCG} node
	* @param from_ the {@link SExpCG} node for the {@code from} child of this {@link ASubSeqExpCG} node
	* @param to_ the {@link SExpCG} node for the {@code to} child of this {@link ASubSeqExpCG} node
	*/
	public ASubSeqExpCG(SourceNode sourceNode_, STypeCG type_, SExpCG seq_, SExpCG from_, SExpCG to_)
	{
		super(sourceNode_,null,type_);
		this.setSeq(seq_);
		this.setFrom(from_);
		this.setTo(to_);

	}


	/**
	 * Creates a new {@link ASubSeqExpCG} node with no children.
	 */
	public ASubSeqExpCG()
	{

	}



	public String toString()
	{
		return (_seq!=null?_seq.toString():this.getClass().getSimpleName())+ (_from!=null?_from.toString():this.getClass().getSimpleName())+ (_to!=null?_to.toString():this.getClass().getSimpleName());
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ASubSeqExpCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ASubSeqExpCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ASubSeqExpCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			this._type = null;
			return;
		}

		if (this._seq == child) {
			this._seq = null;
			return;
		}

		if (this._from == child) {
			this._from = null;
			return;
		}

		if (this._to == child) {
			this._to = null;
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
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof ASubSeqExpCG)		{
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
		fields.put("_seq",this._seq);
		fields.put("_from",this._from);
		fields.put("_to",this._to);
		return fields;
	}


	/**
	 * Returns a deep clone of this {@link ASubSeqExpCG} node.
	 * @return a deep clone of this {@link ASubSeqExpCG} node
	 */
	public ASubSeqExpCG clone()
	{
		return new ASubSeqExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type),
			cloneNode(_seq),
			cloneNode(_from),
			cloneNode(_to)
		);
	}


	/**
	 * Creates a deep clone of this {@link ASubSeqExpCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ASubSeqExpCG} node
	 */
	public ASubSeqExpCG clone(Map<INode,INode> oldToNewMap)
	{
		ASubSeqExpCG node = new ASubSeqExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type, oldToNewMap),
			cloneNode(_seq, oldToNewMap),
			cloneNode(_from, oldToNewMap),
			cloneNode(_to, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	 * Sets the {@code _seq} child of this {@link ASubSeqExpCG} node.
	 * @param value the new {@code _seq} child of this {@link ASubSeqExpCG} node
	*/
	public void setSeq(SExpCG value)
	{
		if (this._seq != null) {
			this._seq.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._seq = value;

	}


	/**
	 * @return the {@link SExpCG} node which is the {@code _seq} child of this {@link ASubSeqExpCG} node
	*/
	public SExpCG getSeq()
	{
		return this._seq;
	}


	/**
	 * Sets the {@code _from} child of this {@link ASubSeqExpCG} node.
	 * @param value the new {@code _from} child of this {@link ASubSeqExpCG} node
	*/
	public void setFrom(SExpCG value)
	{
		if (this._from != null) {
			this._from.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._from = value;

	}


	/**
	 * @return the {@link SExpCG} node which is the {@code _from} child of this {@link ASubSeqExpCG} node
	*/
	public SExpCG getFrom()
	{
		return this._from;
	}


	/**
	 * Sets the {@code _to} child of this {@link ASubSeqExpCG} node.
	 * @param value the new {@code _to} child of this {@link ASubSeqExpCG} node
	*/
	public void setTo(SExpCG value)
	{
		if (this._to != null) {
			this._to.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._to = value;

	}


	/**
	 * @return the {@link SExpCG} node which is the {@code _to} child of this {@link ASubSeqExpCG} node
	*/
	public SExpCG getTo()
	{
		return this._to;
	}


	/**
	* Calls the {@link IAnalysis#caseASubSeqExpCG(ASubSeqExpCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ASubSeqExpCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseASubSeqExpCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseASubSeqExpCG(ASubSeqExpCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ASubSeqExpCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseASubSeqExpCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseASubSeqExpCG(ASubSeqExpCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ASubSeqExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseASubSeqExpCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseASubSeqExpCG(ASubSeqExpCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ASubSeqExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseASubSeqExpCG(this,question);
	}



}
