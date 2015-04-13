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


import org.overture.codegen.cgast.types.SBasicTypeWrappersTypeBase;
import org.overture.codegen.cgast.analysis.intf.IQuestion;
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import java.util.HashMap;
import org.overture.codegen.cgast.INode;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import org.overture.codegen.cgast.types.ARatBasicTypeWrappersTypeCG;
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
public class ARatBasicTypeWrappersTypeCG extends SBasicTypeWrappersTypeBase
{
	private static final long serialVersionUID = 1L;


	/**
	 * Creates a new {@link ARatBasicTypeWrappersTypeCG} node with no children.
	 */
	public ARatBasicTypeWrappersTypeCG()
	{

	}


	/**
	* Creates a new {@code ARatBasicTypeWrappersTypeCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public ARatBasicTypeWrappersTypeCG(SourceNode sourceNode_, Object tag_)
	{
		super(sourceNode_,tag_);

	}


	/**
	* Creates a new {@code ARatBasicTypeWrappersTypeCG TAG=Rat} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public ARatBasicTypeWrappersTypeCG(SourceNode sourceNode_)
	{
		super(sourceNode_,null);

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
	 * Returns a deep clone of this {@link ARatBasicTypeWrappersTypeCG} node.
	 * @return a deep clone of this {@link ARatBasicTypeWrappersTypeCG} node
	 */
	public ARatBasicTypeWrappersTypeCG clone()
	{
		return new ARatBasicTypeWrappersTypeCG(
			_sourceNode,
			_tag
		);
	}


	/**
	 * Creates a deep clone of this {@link ARatBasicTypeWrappersTypeCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ARatBasicTypeWrappersTypeCG} node
	 */
	public ARatBasicTypeWrappersTypeCG clone(Map<INode,INode> oldToNewMap)
	{
		ARatBasicTypeWrappersTypeCG node = new ARatBasicTypeWrappersTypeCG(
			_sourceNode,
			_tag
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
	 * Removes the {@link INode} {@code child} as a child of this {@link ARatBasicTypeWrappersTypeCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ARatBasicTypeWrappersTypeCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ARatBasicTypeWrappersTypeCG} node
	 */
	public void removeChild(INode child)
	{
		throw new RuntimeException("Not a child.");
	}



	public String toString()
	{
		return super.toString();
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof ARatBasicTypeWrappersTypeCG)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	* Calls the {@link IAnalysis#caseARatBasicTypeWrappersTypeCG(ARatBasicTypeWrappersTypeCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ARatBasicTypeWrappersTypeCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseARatBasicTypeWrappersTypeCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseARatBasicTypeWrappersTypeCG(ARatBasicTypeWrappersTypeCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ARatBasicTypeWrappersTypeCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseARatBasicTypeWrappersTypeCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseARatBasicTypeWrappersTypeCG(ARatBasicTypeWrappersTypeCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ARatBasicTypeWrappersTypeCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseARatBasicTypeWrappersTypeCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseARatBasicTypeWrappersTypeCG(ARatBasicTypeWrappersTypeCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ARatBasicTypeWrappersTypeCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseARatBasicTypeWrappersTypeCG(this,question);
	}



}
