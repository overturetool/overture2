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

package org.overture.ast.types;


import org.overture.ast.definitions.PDefinition;
import org.overture.ast.types.AVoidReturnType;
import java.util.HashMap;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import java.util.List;
import org.overture.ast.analysis.intf.IAnswer;
import java.util.Map;
import org.overture.ast.types.PTypeBase;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import java.lang.String;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.analysis.intf.IAnalysis;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AVoidReturnType extends PTypeBase
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code AVoidReturnType} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public AVoidReturnType(ILexLocation location_, Boolean resolved_, List<? extends PDefinition> definitions_)
	{
		super(location_,resolved_,definitions_);

	}


	/**
	* Creates a new {@code AVoidReturnType TAG=voidReturn} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public AVoidReturnType(ILexLocation location_, Boolean resolved_)
	{
		super(location_,resolved_,null);

	}


	/**
	 * Creates a new {@link AVoidReturnType} node with no children.
	 */
	public AVoidReturnType()
	{

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
	 * Creates a deep clone of this {@link AVoidReturnType} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AVoidReturnType} node
	 */
	public AVoidReturnType clone(Map<INode,INode> oldToNewMap)
	{
		AVoidReturnType node = new AVoidReturnType(
			_location,
			_resolved,
			_definitions
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
	 * Removes the {@link INode} {@code child} as a child of this {@link AVoidReturnType} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AVoidReturnType} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AVoidReturnType} node
	 */
	public void removeChild(INode child)
	{
		if (this._definitions.contains(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}



	public String toString()
	{
		return "" + "(return)";
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AVoidReturnType)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link AVoidReturnType} node.
	 * @return a deep clone of this {@link AVoidReturnType} node
	 */
	public AVoidReturnType clone()
	{
		return new AVoidReturnType(
			_location,
			_resolved,
			_definitions
		);
	}


	/**
	* Calls the {@link IAnalysis#caseAVoidReturnType(AVoidReturnType)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AVoidReturnType} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAVoidReturnType(this);
	}


	/**
	* Calls the {@link IAnswer#caseAVoidReturnType(AVoidReturnType)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AVoidReturnType} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAVoidReturnType(this);
	}


	/**
	* Calls the {@link IQuestion#caseAVoidReturnType(AVoidReturnType, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AVoidReturnType} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAVoidReturnType(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAVoidReturnType(AVoidReturnType, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AVoidReturnType} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAVoidReturnType(this,question);
	}



}
