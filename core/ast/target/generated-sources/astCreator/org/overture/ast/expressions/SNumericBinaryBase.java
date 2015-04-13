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


import org.overture.ast.expressions.SBinaryExpBase;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.intf.lex.ILexToken;
import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.expressions.SNumericBinaryExp;
import org.overture.ast.node.INode;
import java.util.HashMap;
import java.lang.String;
import org.overture.ast.types.PType;
import org.overture.ast.expressions.PExp;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public abstract class SNumericBinaryBase extends SBinaryExpBase implements SNumericBinaryExp
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code SNumericBinaryBase TAG=#Numeric} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public SNumericBinaryBase(ILexLocation location_, PExp left_, ILexToken op_, PExp right_)
	{
		super(null,location_,left_,op_,right_);

	}


	/**
	 * Creates a new {@link SNumericBinaryBase} node with no children.
	 */
	public SNumericBinaryBase()
	{

	}


	/**
	* Creates a new {@code SNumericBinaryBase} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public SNumericBinaryBase(PType type_, ILexLocation location_, PExp left_, ILexToken op_, PExp right_)
	{
		super(type_,location_,left_,op_,right_);

	}


	/**
	 * Creates a deep clone of this {@link SNumericBinaryBase} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link SNumericBinaryBase} node
	 */
	@Override
	public abstract SNumericBinaryExp clone(Map<INode,INode> oldToNewMap);

	/**
	 * Returns a deep clone of this {@link SNumericBinaryBase} node.
	 * @return a deep clone of this {@link SNumericBinaryBase} node
	 */
	@Override
	public abstract SNumericBinaryExp clone();

	/**
	* Forwarding hashCode call to {@link Object#hashCode()}.
	**/
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link SNumericBinaryBase} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link SNumericBinaryBase} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link SNumericBinaryBase} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._left == child) {
			this._left = null;
			return;
		}

		if (this._op == child) {
			this._op = null;
			return;
		}

		if (this._right == child) {
			this._right = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof SNumericBinaryBase)		{
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
		return fields;
	}



	public String toString()
	{
		return super.toString();

	}



}
