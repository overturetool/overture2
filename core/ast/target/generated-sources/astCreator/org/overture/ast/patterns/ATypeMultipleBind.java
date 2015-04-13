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

package org.overture.ast.patterns;


import org.overture.ast.patterns.ATypeMultipleBind;
import org.overture.ast.patterns.PMultipleBindBase;
import java.util.HashMap;
import org.overture.ast.util.Utils;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import java.util.List;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.patterns.PPattern;
import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import java.lang.String;
import org.overture.ast.types.PType;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.analysis.intf.IAnalysis;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class ATypeMultipleBind extends PMultipleBindBase
{
	private static final long serialVersionUID = 1L;

	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private PType _type;

	/**
	 * Creates a new {@link ATypeMultipleBind} node with no children.
	 */
	public ATypeMultipleBind()
	{

	}


	/**
	* Creates a new {@code ATypeMultipleBind TAG=type} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public ATypeMultipleBind(ILexLocation location_, List<? extends PPattern> plist_)
	{
		super(location_,plist_);

	}


	/**
	* Creates a new {@code ATypeMultipleBind} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param type_ the {@link PType} <b>graph</a> node for the {@code type} child of this {@link ATypeMultipleBind} node.
	*  <i>The parent of this {@code type } will not be changed by adding it to this node.</i>
	*/
	public ATypeMultipleBind(ILexLocation location_, List<? extends PPattern> plist_, PType type_)
	{
		super(location_,plist_);
		this.setType(type_);

	}


	/**
	 * Returns a deep clone of this {@link ATypeMultipleBind} node.
	 * @return a deep clone of this {@link ATypeMultipleBind} node
	 */
	public ATypeMultipleBind clone()
	{
		return new ATypeMultipleBind(
			_location,
			cloneList(_plist),
			_type
		);
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ATypeMultipleBind} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ATypeMultipleBind} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ATypeMultipleBind} node
	 */
	public void removeChild(INode child)
	{
		if (this._plist.remove(child)) {
				return;
		}
		if (this._type == child) {
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
		if (o != null && o instanceof ATypeMultipleBind)		{
			 return toString().equals(o.toString());
		}
		return false;
	}



	public String toString()
	{
		return "" + ""+Utils.listToString(_plist)+":"+_type;
	}


	/**
	 * Creates a deep clone of this {@link ATypeMultipleBind} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ATypeMultipleBind} node
	 */
	public ATypeMultipleBind clone(Map<INode,INode> oldToNewMap)
	{
		ATypeMultipleBind node = new ATypeMultipleBind(
			_location,
			cloneList(_plist, oldToNewMap),
			_type
		);
		oldToNewMap.put(this, node);
		return node;
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
		fields.put("_type",this._type);
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
	 * Sets the {@code _type} child of this {@link ATypeMultipleBind} node.
	 * @param value the new {@code _type} child of this {@link ATypeMultipleBind} node
	*/
	public void setType(PType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._type = value;

	}


	/**
	 * @return the {@link PType} node which is the {@code _type} child of this {@link ATypeMultipleBind} node
	*/
	public PType getType()
	{
		return this._type;
	}


	/**
	* Calls the {@link IAnalysis#caseATypeMultipleBind(ATypeMultipleBind)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ATypeMultipleBind} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseATypeMultipleBind(this);
	}


	/**
	* Calls the {@link IAnswer#caseATypeMultipleBind(ATypeMultipleBind)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ATypeMultipleBind} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseATypeMultipleBind(this);
	}


	/**
	* Calls the {@link IQuestion#caseATypeMultipleBind(ATypeMultipleBind, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ATypeMultipleBind} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseATypeMultipleBind(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseATypeMultipleBind(ATypeMultipleBind, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ATypeMultipleBind} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseATypeMultipleBind(this,question);
	}



}
