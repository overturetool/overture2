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


import java.util.Map;
import java.lang.Boolean;
import org.overture.codegen.cgast.INode;
import java.lang.Object;
import java.lang.String;
import org.overture.codegen.cgast.SExpCG;
import org.overture.codegen.cgast.expressions.SBinaryExpCG;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public interface SBinaryExpCG extends SExpCG
{
	public String toString();
	/**
	* Forwarding hashCode call to {@link Object#hashCode()}.
	**/
	public int hashCode();
	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link SBinaryExpBase} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link SBinaryExpBase} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link SBinaryExpBase} node
	 */
	public void removeChild(INode child);
	/**
	 * Creates a map of all field names and their value
	 * @param includeInheritedFields if true all inherited fields are included
	 * @return a a map of names to values of all fields
	 */
	public Map<String,Object> getChildren(Boolean includeInheritedFields);
	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	public boolean equals(Object o);
	/**
	 * Creates a deep clone of this {@link SBinaryExpBase} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link SBinaryExpBase} node
	 */
	public abstract SBinaryExpCG clone(Map<INode,INode> oldToNewMap);
	/**
	 * Returns a deep clone of this {@link SBinaryExpBase} node.
	 * @return a deep clone of this {@link SBinaryExpBase} node
	 */
	public abstract SBinaryExpCG clone();
	/**
	 * Sets the {@code _left} child of this {@link SBinaryExpBase} node.
	 * @param value the new {@code _left} child of this {@link SBinaryExpBase} node
	*/
	public void setLeft(SExpCG value);
	/**
	 * @return the {@link SExpCG} node which is the {@code _left} child of this {@link SBinaryExpBase} node
	*/
	public SExpCG getLeft();
	/**
	 * Sets the {@code _right} child of this {@link SBinaryExpBase} node.
	 * @param value the new {@code _right} child of this {@link SBinaryExpBase} node
	*/
	public void setRight(SExpCG value);
	/**
	 * @return the {@link SExpCG} node which is the {@code _right} child of this {@link SBinaryExpBase} node
	*/
	public SExpCG getRight();

}
