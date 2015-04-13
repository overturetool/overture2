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


import org.overture.codegen.cgast.Node;
import org.overture.codegen.cgast.PCG;
import java.util.Map;
import java.lang.Boolean;
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
public abstract class PCGBase extends Node implements PCG
{
	private static final long serialVersionUID = 1L;

	protected SourceNode _sourceNode;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	protected Object _tag;

	/**
	* Creates a new {@code PCGBase TAG=CG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param sourceNode_ the {@link SourceNode} node for the {@code sourceNode} child of this {@link PCGBase} node
	*/
	public PCGBase(SourceNode sourceNode_)
	{
		super();
		this.setSourceNode(sourceNode_);

	}


	/**
	 * Creates a new {@link PCGBase} node with no children.
	 */
	public PCGBase()
	{

	}


	/**
	* Creates a new {@code PCGBase} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param sourceNode_ the {@link SourceNode} node for the {@code sourceNode} child of this {@link PCGBase} node
	* @param tag_ the {@link Object} <b>graph</a> node for the {@code tag} child of this {@link PCGBase} node.
	*  <i>The parent of this {@code tag } will not be changed by adding it to this node.</i>
	*/
	public PCGBase(SourceNode sourceNode_, Object tag_)
	{
		super();
		this.setSourceNode(sourceNode_);
		this.setTag(tag_);

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
		fields.put("_sourceNode",this._sourceNode);
		fields.put("_tag",this._tag);
		return fields;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link PCGBase} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link PCGBase} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link PCGBase} node
	 */
	public void removeChild(INode child)
	{
		throw new RuntimeException("Not a child.");
	}


	/**
	 * Creates a deep clone of this {@link PCGBase} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link PCGBase} node
	 */
	@Override
	public abstract PCG clone(Map<INode,INode> oldToNewMap);

	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof PCGBase)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link PCGBase} node.
	 * @return a deep clone of this {@link PCGBase} node
	 */
	@Override
	public abstract PCG clone();


	public String toString()
	{
		return super.toString();

	}


	/**
	 * Sets the {@code _sourceNode} child of this {@link PCGBase} node.
	 * @param value the new {@code _sourceNode} child of this {@link PCGBase} node
	*/
	public void setSourceNode(SourceNode value)
	{
		this._sourceNode = value;
	}


	/**
	 * @return the {@link SourceNode} node which is the {@code _sourceNode} child of this {@link PCGBase} node
	*/
	public SourceNode getSourceNode()
	{
		return this._sourceNode;
	}


	/**
	 * Sets the {@code _tag} child of this {@link PCGBase} node.
	 * @param value the new {@code _tag} child of this {@link PCGBase} node
	*/
	public void setTag(Object value)
	{
		this._tag = value;
	}


	/**
	 * @return the {@link Object} node which is the {@code _tag} child of this {@link PCGBase} node
	*/
	public Object getTag()
	{
		return this._tag;
	}



}
