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

package org.overture.codegen.cgast.statements;


import org.overture.codegen.cgast.statements.SAltStmStmCG;
import java.util.Map;
import java.lang.Boolean;
import org.overture.codegen.cgast.SStmCGBase;
import java.lang.Object;
import java.util.HashMap;
import org.overture.codegen.cgast.INode;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public abstract class SAltStmStmBase extends SStmCGBase implements SAltStmStmCG
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code SAltStmStmBase} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public SAltStmStmBase(SourceNode sourceNode_, Object tag_)
	{
		super(sourceNode_,tag_);

	}


	/**
	* Creates a new {@code SAltStmStmBase TAG=#altStm} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public SAltStmStmBase(SourceNode sourceNode_)
	{
		super(sourceNode_,null);

	}


	/**
	 * Creates a new {@link SAltStmStmBase} node with no children.
	 */
	public SAltStmStmBase()
	{

	}



	public String toString()
	{
		return super.toString();

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
		if (o != null && o instanceof SAltStmStmBase)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link SAltStmStmBase} node.
	 * @return a deep clone of this {@link SAltStmStmBase} node
	 */
	@Override
	public abstract SAltStmStmCG clone();

	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link SAltStmStmBase} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link SAltStmStmBase} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link SAltStmStmBase} node
	 */
	public void removeChild(INode child)
	{
		throw new RuntimeException("Not a child.");
	}


	/**
	 * Creates a deep clone of this {@link SAltStmStmBase} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link SAltStmStmBase} node
	 */
	@Override
	public abstract SAltStmStmCG clone(Map<INode,INode> oldToNewMap);


}
