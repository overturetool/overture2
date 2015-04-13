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

package org.overture.ast.expressions;


import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import java.lang.String;
import org.overture.ast.expressions.SMapExp;
import org.overture.ast.expressions.PExp;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public interface SMapExp extends PExp
{	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	public boolean equals(Object o);
	/**
	 * Creates a map of all field names and their value
	 * @param includeInheritedFields if true all inherited fields are included
	 * @return a a map of names to values of all fields
	 */
	public Map<String,Object> getChildren(Boolean includeInheritedFields);
	/**
	 * Creates a deep clone of this {@link SMapExpBase} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link SMapExpBase} node
	 */
	public abstract SMapExp clone(Map<INode,INode> oldToNewMap);

	public String toString();
	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link SMapExpBase} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link SMapExpBase} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link SMapExpBase} node
	 */
	public void removeChild(INode child);
	/**
	* Forwarding hashCode call to {@link Object#hashCode()}.
	**/
	public int hashCode();
	/**
	 * Returns a deep clone of this {@link SMapExpBase} node.
	 * @return a deep clone of this {@link SMapExpBase} node
	 */
	public abstract SMapExp clone();

}
