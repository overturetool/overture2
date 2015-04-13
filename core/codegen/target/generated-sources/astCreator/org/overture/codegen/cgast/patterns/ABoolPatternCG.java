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

package org.overture.codegen.cgast.patterns;


import org.overture.codegen.cgast.analysis.intf.IQuestion;
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.patterns.ABoolPatternCG;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import org.overture.codegen.cgast.INode;
import java.util.HashMap;
import org.overture.codegen.cgast.SPatternCGBase;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
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
public class ABoolPatternCG extends SPatternCGBase
{
	private static final long serialVersionUID = 1L;

	private Boolean _value;

	/**
	* Creates a new {@code ABoolPatternCG TAG=bool} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param value_ the {@link Boolean} node for the {@code value} child of this {@link ABoolPatternCG} node
	*/
	public ABoolPatternCG(SourceNode sourceNode_, Boolean value_)
	{
		super(sourceNode_,null);
		this.setValue(value_);

	}


	/**
	 * Creates a new {@link ABoolPatternCG} node with no children.
	 */
	public ABoolPatternCG()
	{

	}


	/**
	* Creates a new {@code ABoolPatternCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param value_ the {@link Boolean} node for the {@code value} child of this {@link ABoolPatternCG} node
	*/
	public ABoolPatternCG(SourceNode sourceNode_, Object tag_, Boolean value_)
	{
		super(sourceNode_,tag_);
		this.setValue(value_);

	}


	/**
	 * Creates a deep clone of this {@link ABoolPatternCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ABoolPatternCG} node
	 */
	public ABoolPatternCG clone(Map<INode,INode> oldToNewMap)
	{
		ABoolPatternCG node = new ABoolPatternCG(
			_sourceNode,
			_tag,
			_value
		);
		oldToNewMap.put(this, node);
		return node;
	}



	public String toString()
	{
		return (_value!=null?_value.toString():this.getClass().getSimpleName());
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof ABoolPatternCG)		{
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
	 * Returns a deep clone of this {@link ABoolPatternCG} node.
	 * @return a deep clone of this {@link ABoolPatternCG} node
	 */
	public ABoolPatternCG clone()
	{
		return new ABoolPatternCG(
			_sourceNode,
			_tag,
			_value
		);
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ABoolPatternCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ABoolPatternCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ABoolPatternCG} node
	 */
	public void removeChild(INode child)
	{
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
		fields.put("_value",this._value);
		return fields;
	}


	/**
	 * Sets the {@code _value} child of this {@link ABoolPatternCG} node.
	 * @param value the new {@code _value} child of this {@link ABoolPatternCG} node
	*/
	public void setValue(Boolean value)
	{
		this._value = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _value} child of this {@link ABoolPatternCG} node
	*/
	public Boolean getValue()
	{
		return this._value;
	}


	/**
	* Calls the {@link IAnalysis#caseABoolPatternCG(ABoolPatternCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ABoolPatternCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseABoolPatternCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseABoolPatternCG(ABoolPatternCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ABoolPatternCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseABoolPatternCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseABoolPatternCG(ABoolPatternCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ABoolPatternCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseABoolPatternCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseABoolPatternCG(ABoolPatternCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ABoolPatternCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseABoolPatternCG(this,question);
	}



}
