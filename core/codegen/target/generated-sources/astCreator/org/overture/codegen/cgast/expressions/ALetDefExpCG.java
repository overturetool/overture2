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
import org.overture.codegen.cgast.NodeList;
import java.util.HashMap;
import org.overture.codegen.cgast.INode;
import org.overture.codegen.cgast.declarations.AVarDeclCG;
import org.overture.codegen.cgast.SExpCG;
import org.overture.codegen.cgast.expressions.ALetDefExpCG;
import java.util.List;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import org.overture.codegen.cgast.STypeCG;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;
import java.util.LinkedList;
import org.overture.codegen.cgast.analysis.intf.IAnswer;
import org.overture.codegen.cgast.SExpCGBase;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class ALetDefExpCG extends SExpCGBase
{
	private static final long serialVersionUID = 1L;

	private NodeList<AVarDeclCG> _localDefs = new NodeList<AVarDeclCG>(this);
	private SExpCG _exp;

	/**
	* Creates a new {@code ALetDefExpCG TAG=letDef} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param localDefs_ the {@link NodeList} node for the {@code localDefs} child of this {@link ALetDefExpCG} node
	* @param exp_ the {@link SExpCG} node for the {@code exp} child of this {@link ALetDefExpCG} node
	*/
	public ALetDefExpCG(SourceNode sourceNode_, STypeCG type_, List<? extends AVarDeclCG> localDefs_, SExpCG exp_)
	{
		super(sourceNode_,null,type_);
		this.setLocalDefs(localDefs_);
		this.setExp(exp_);

	}


	/**
	 * Creates a new {@link ALetDefExpCG} node with no children.
	 */
	public ALetDefExpCG()
	{

	}


	/**
	* Creates a new {@code ALetDefExpCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param localDefs_ the {@link NodeList} node for the {@code localDefs} child of this {@link ALetDefExpCG} node
	* @param exp_ the {@link SExpCG} node for the {@code exp} child of this {@link ALetDefExpCG} node
	*/
	public ALetDefExpCG(SourceNode sourceNode_, Object tag_, STypeCG type_, List<? extends AVarDeclCG> localDefs_, SExpCG exp_)
	{
		super(sourceNode_,tag_,type_);
		this.setLocalDefs(localDefs_);
		this.setExp(exp_);

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
		fields.put("_localDefs",this._localDefs);
		fields.put("_exp",this._exp);
		return fields;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ALetDefExpCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ALetDefExpCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ALetDefExpCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			this._type = null;
			return;
		}

		if (this._localDefs.remove(child)) {
				return;
		}
		if (this._exp == child) {
			this._exp = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof ALetDefExpCG)		{
			 return toString().equals(o.toString());
		}
		return false;
	}



	public String toString()
	{
		return (_localDefs!=null?_localDefs.toString():this.getClass().getSimpleName())+ (_exp!=null?_exp.toString():this.getClass().getSimpleName());
	}


	/**
	 * Creates a deep clone of this {@link ALetDefExpCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ALetDefExpCG} node
	 */
	public ALetDefExpCG clone(Map<INode,INode> oldToNewMap)
	{
		ALetDefExpCG node = new ALetDefExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type, oldToNewMap),
			cloneList(_localDefs, oldToNewMap),
			cloneNode(_exp, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	 * Returns a deep clone of this {@link ALetDefExpCG} node.
	 * @return a deep clone of this {@link ALetDefExpCG} node
	 */
	public ALetDefExpCG clone()
	{
		return new ALetDefExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type),
			cloneList(_localDefs),
			cloneNode(_exp)
		);
	}


	/**
	 * Sets the {@code _localDefs} child of this {@link ALetDefExpCG} node.
	 * @param value the new {@code _localDefs} child of this {@link ALetDefExpCG} node
	*/
	public void setLocalDefs(List<? extends AVarDeclCG> value)
	{
		if (this._localDefs.equals(value)) {
			return;
		}
		this._localDefs.clear();
		if (value != null) {
			this._localDefs.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _localDefs} child of this {@link ALetDefExpCG} node
	*/
	public LinkedList<AVarDeclCG> getLocalDefs()
	{
		return this._localDefs;
	}


	/**
	 * Sets the {@code _exp} child of this {@link ALetDefExpCG} node.
	 * @param value the new {@code _exp} child of this {@link ALetDefExpCG} node
	*/
	public void setExp(SExpCG value)
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
	 * @return the {@link SExpCG} node which is the {@code _exp} child of this {@link ALetDefExpCG} node
	*/
	public SExpCG getExp()
	{
		return this._exp;
	}


	/**
	* Calls the {@link IAnalysis#caseALetDefExpCG(ALetDefExpCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ALetDefExpCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseALetDefExpCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseALetDefExpCG(ALetDefExpCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ALetDefExpCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseALetDefExpCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseALetDefExpCG(ALetDefExpCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ALetDefExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseALetDefExpCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseALetDefExpCG(ALetDefExpCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ALetDefExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseALetDefExpCG(this,question);
	}



}
