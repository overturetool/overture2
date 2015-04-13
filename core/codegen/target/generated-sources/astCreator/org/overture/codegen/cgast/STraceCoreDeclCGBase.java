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

package org.overture.codegen.cgast;


import org.overture.codegen.cgast.PCGBase;
import org.overture.codegen.cgast.STraceCoreDeclCG;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Object;
import org.overture.codegen.cgast.INode;
import java.util.HashMap;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public abstract class STraceCoreDeclCGBase extends PCGBase implements STraceCoreDeclCG
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code STraceCoreDeclCGBase TAG=#traceCoreDecl} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public STraceCoreDeclCGBase(SourceNode sourceNode_)
	{
		super(sourceNode_,null);

	}


	/**
	 * Creates a new {@link STraceCoreDeclCGBase} node with no children.
	 */
	public STraceCoreDeclCGBase()
	{

	}


	/**
	* Creates a new {@code STraceCoreDeclCGBase} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public STraceCoreDeclCGBase(SourceNode sourceNode_, Object tag_)
	{
		super(sourceNode_,tag_);

	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof STraceCoreDeclCGBase)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link STraceCoreDeclCGBase} node.
	 * @return a deep clone of this {@link STraceCoreDeclCGBase} node
	 */
	@Override
	public abstract STraceCoreDeclCG clone();

	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link STraceCoreDeclCGBase} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link STraceCoreDeclCGBase} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link STraceCoreDeclCGBase} node
	 */
	public void removeChild(INode child)
	{
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
	 * Creates a deep clone of this {@link STraceCoreDeclCGBase} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link STraceCoreDeclCGBase} node
	 */
	@Override
	public abstract STraceCoreDeclCG clone(Map<INode,INode> oldToNewMap);


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



}
