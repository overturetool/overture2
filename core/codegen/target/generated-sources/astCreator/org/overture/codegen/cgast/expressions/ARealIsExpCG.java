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
import org.overture.codegen.cgast.expressions.ARealIsExpCG;
import org.overture.codegen.cgast.expressions.SIsExpBase;
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import java.util.HashMap;
import org.overture.codegen.cgast.INode;
import org.overture.codegen.cgast.SExpCG;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import org.overture.codegen.cgast.STypeCG;
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
public class ARealIsExpCG extends SIsExpBase
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code ARealIsExpCG TAG=real} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public ARealIsExpCG(SourceNode sourceNode_, STypeCG type_, SExpCG exp_)
	{
		super(sourceNode_,null,type_,exp_);

	}


	/**
	 * Creates a new {@link ARealIsExpCG} node with no children.
	 */
	public ARealIsExpCG()
	{

	}


	/**
	* Creates a new {@code ARealIsExpCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public ARealIsExpCG(SourceNode sourceNode_, Object tag_, STypeCG type_, SExpCG exp_)
	{
		super(sourceNode_,tag_,type_,exp_);

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



	public String toString()
	{
		return super.toString();
	}


	/**
	 * Returns a deep clone of this {@link ARealIsExpCG} node.
	 * @return a deep clone of this {@link ARealIsExpCG} node
	 */
	public ARealIsExpCG clone()
	{
		return new ARealIsExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type),
			cloneNode(_exp)
		);
	}


	/**
	 * Creates a deep clone of this {@link ARealIsExpCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ARealIsExpCG} node
	 */
	public ARealIsExpCG clone(Map<INode,INode> oldToNewMap)
	{
		ARealIsExpCG node = new ARealIsExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type, oldToNewMap),
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
		if (o != null && o instanceof ARealIsExpCG)		{
			 return toString().equals(o.toString());
		}
		return false;
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
	 * Removes the {@link INode} {@code child} as a child of this {@link ARealIsExpCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ARealIsExpCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ARealIsExpCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			this._type = null;
			return;
		}

		if (this._exp == child) {
			this._exp = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	* Calls the {@link IAnalysis#caseARealIsExpCG(ARealIsExpCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ARealIsExpCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseARealIsExpCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseARealIsExpCG(ARealIsExpCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ARealIsExpCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseARealIsExpCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseARealIsExpCG(ARealIsExpCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ARealIsExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseARealIsExpCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseARealIsExpCG(ARealIsExpCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ARealIsExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseARealIsExpCG(this,question);
	}



}
