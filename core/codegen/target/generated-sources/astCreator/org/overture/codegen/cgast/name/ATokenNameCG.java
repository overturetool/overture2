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

package org.overture.codegen.cgast.name;


import org.overture.codegen.cgast.SNameCGBase;
import org.overture.codegen.cgast.analysis.intf.IQuestion;
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import org.overture.codegen.cgast.INode;
import java.util.HashMap;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Object;
import org.overture.codegen.cgast.name.ATokenNameCG;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;
import org.overture.codegen.cgast.analysis.intf.IAnswer;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class ATokenNameCG extends SNameCGBase
{
	private static final long serialVersionUID = 1L;

	private String _name;

	/**
	* Creates a new {@code ATokenNameCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param name_ the {@link String} node for the {@code name} child of this {@link ATokenNameCG} node
	*/
	public ATokenNameCG(SourceNode sourceNode_, Object tag_, String name_)
	{
		super(sourceNode_,tag_);
		this.setName(name_);

	}


	/**
	 * Creates a new {@link ATokenNameCG} node with no children.
	 */
	public ATokenNameCG()
	{

	}


	/**
	* Creates a new {@code ATokenNameCG TAG=token} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param name_ the {@link String} node for the {@code name} child of this {@link ATokenNameCG} node
	*/
	public ATokenNameCG(SourceNode sourceNode_, String name_)
	{
		super(sourceNode_,null);
		this.setName(name_);

	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ATokenNameCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ATokenNameCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ATokenNameCG} node
	 */
	public void removeChild(INode child)
	{
		throw new RuntimeException("Not a child.");
	}


	/**
	 * Returns a deep clone of this {@link ATokenNameCG} node.
	 * @return a deep clone of this {@link ATokenNameCG} node
	 */
	public ATokenNameCG clone()
	{
		return new ATokenNameCG(
			_sourceNode,
			_tag,
			_name
		);
	}


	/**
	 * Creates a deep clone of this {@link ATokenNameCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ATokenNameCG} node
	 */
	public ATokenNameCG clone(Map<INode,INode> oldToNewMap)
	{
		ATokenNameCG node = new ATokenNameCG(
			_sourceNode,
			_tag,
			_name
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
		if (o != null && o instanceof ATokenNameCG)		{
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
		fields.put("_name",this._name);
		return fields;
	}


	/**
	* Forwarding hashCode call to {@link Object#hashCode()}.
	**/
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}



	public String toString()
	{
		return (_name!=null?_name.toString():this.getClass().getSimpleName());
	}


	/**
	 * Sets the {@code _name} child of this {@link ATokenNameCG} node.
	 * @param value the new {@code _name} child of this {@link ATokenNameCG} node
	*/
	public void setName(String value)
	{
		this._name = value;
	}


	/**
	 * @return the {@link String} node which is the {@code _name} child of this {@link ATokenNameCG} node
	*/
	public String getName()
	{
		return this._name;
	}


	/**
	* Calls the {@link IAnalysis#caseATokenNameCG(ATokenNameCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ATokenNameCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseATokenNameCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseATokenNameCG(ATokenNameCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ATokenNameCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseATokenNameCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseATokenNameCG(ATokenNameCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ATokenNameCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseATokenNameCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseATokenNameCG(ATokenNameCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ATokenNameCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseATokenNameCG(this,question);
	}



}
