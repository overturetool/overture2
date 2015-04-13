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
import org.overture.codegen.cgast.expressions.ALetBeStNoBindingRuntimeErrorExpCG;
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import org.overture.codegen.cgast.INode;
import java.util.HashMap;
import org.overture.codegen.cgast.expressions.SRuntimeErrorExpBase;
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
public class ALetBeStNoBindingRuntimeErrorExpCG extends SRuntimeErrorExpBase
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code ALetBeStNoBindingRuntimeErrorExpCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public ALetBeStNoBindingRuntimeErrorExpCG(SourceNode sourceNode_, Object tag_, STypeCG type_)
	{
		super(sourceNode_,tag_,type_);

	}


	/**
	* Creates a new {@code ALetBeStNoBindingRuntimeErrorExpCG TAG=LetBeStNoBinding} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public ALetBeStNoBindingRuntimeErrorExpCG(SourceNode sourceNode_, STypeCG type_)
	{
		super(sourceNode_,null,type_);

	}


	/**
	 * Creates a new {@link ALetBeStNoBindingRuntimeErrorExpCG} node with no children.
	 */
	public ALetBeStNoBindingRuntimeErrorExpCG()
	{

	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ALetBeStNoBindingRuntimeErrorExpCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ALetBeStNoBindingRuntimeErrorExpCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ALetBeStNoBindingRuntimeErrorExpCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			this._type = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}



	public String toString()
	{
		return super.toString();
	}


	/**
	 * Returns a deep clone of this {@link ALetBeStNoBindingRuntimeErrorExpCG} node.
	 * @return a deep clone of this {@link ALetBeStNoBindingRuntimeErrorExpCG} node
	 */
	public ALetBeStNoBindingRuntimeErrorExpCG clone()
	{
		return new ALetBeStNoBindingRuntimeErrorExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type)
		);
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


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof ALetBeStNoBindingRuntimeErrorExpCG)		{
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
	 * Creates a deep clone of this {@link ALetBeStNoBindingRuntimeErrorExpCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ALetBeStNoBindingRuntimeErrorExpCG} node
	 */
	public ALetBeStNoBindingRuntimeErrorExpCG clone(Map<INode,INode> oldToNewMap)
	{
		ALetBeStNoBindingRuntimeErrorExpCG node = new ALetBeStNoBindingRuntimeErrorExpCG(
			_sourceNode,
			_tag,
			cloneNode(_type, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	* Calls the {@link IAnalysis#caseALetBeStNoBindingRuntimeErrorExpCG(ALetBeStNoBindingRuntimeErrorExpCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ALetBeStNoBindingRuntimeErrorExpCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseALetBeStNoBindingRuntimeErrorExpCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseALetBeStNoBindingRuntimeErrorExpCG(ALetBeStNoBindingRuntimeErrorExpCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ALetBeStNoBindingRuntimeErrorExpCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseALetBeStNoBindingRuntimeErrorExpCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseALetBeStNoBindingRuntimeErrorExpCG(ALetBeStNoBindingRuntimeErrorExpCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ALetBeStNoBindingRuntimeErrorExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseALetBeStNoBindingRuntimeErrorExpCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseALetBeStNoBindingRuntimeErrorExpCG(ALetBeStNoBindingRuntimeErrorExpCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ALetBeStNoBindingRuntimeErrorExpCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseALetBeStNoBindingRuntimeErrorExpCG(this,question);
	}



}
