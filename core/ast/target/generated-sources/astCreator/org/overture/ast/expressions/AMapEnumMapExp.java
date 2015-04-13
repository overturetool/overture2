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


import java.util.HashMap;
import org.overture.ast.expressions.AMapletExp;
import org.overture.ast.util.Utils;
import org.overture.ast.expressions.AMapEnumMapExp;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.expressions.SMapExpBase;
import org.overture.ast.intf.lex.ILexLocation;
import java.util.List;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.node.NodeList;
import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import org.overture.ast.node.GraphNodeList;
import java.lang.String;
import org.overture.ast.types.PType;
import java.util.LinkedList;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.analysis.intf.IAnalysis;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AMapEnumMapExp extends SMapExpBase
{
	private static final long serialVersionUID = 1L;

	private NodeList<AMapletExp> _members = new NodeList<AMapletExp>(this);
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private GraphNodeList<PType> _domTypes = new GraphNodeList<PType>(this);
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private GraphNodeList<PType> _rngTypes = new GraphNodeList<PType>(this);

	/**
	* Creates a new {@code AMapEnumMapExp} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param members_ the {@link NodeList} node for the {@code members} child of this {@link AMapEnumMapExp} node
	* @param domTypes_ the {@link GraphNodeList} <b>graph</a> node for the {@code domTypes} child of this {@link AMapEnumMapExp} node.
	*  <i>The parent of this {@code domTypes } will not be changed by adding it to this node.</i>
	* @param rngTypes_ the {@link GraphNodeList} <b>graph</a> node for the {@code rngTypes} child of this {@link AMapEnumMapExp} node.
	*  <i>The parent of this {@code rngTypes } will not be changed by adding it to this node.</i>
	*/
	public AMapEnumMapExp(PType type_, ILexLocation location_, List<? extends AMapletExp> members_, List<? extends PType> domTypes_, List<? extends PType> rngTypes_)
	{
		super(type_,location_);
		this.setMembers(members_);
		this.setDomTypes(domTypes_);
		this.setRngTypes(rngTypes_);

	}


	/**
	 * Creates a new {@link AMapEnumMapExp} node with no children.
	 */
	public AMapEnumMapExp()
	{

	}


	/**
	* Creates a new {@code AMapEnumMapExp TAG=mapEnum} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param members_ the {@link NodeList} node for the {@code members} child of this {@link AMapEnumMapExp} node
	*/
	public AMapEnumMapExp(ILexLocation location_, List<? extends AMapletExp> members_)
	{
		super(null,location_);
		this.setMembers(members_);

	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AMapEnumMapExp} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AMapEnumMapExp} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AMapEnumMapExp} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._members.remove(child)) {
				return;
		}
		if (this._domTypes.contains(child)) {
			return;
		}

		if (this._rngTypes.contains(child)) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	 * Returns a deep clone of this {@link AMapEnumMapExp} node.
	 * @return a deep clone of this {@link AMapEnumMapExp} node
	 */
	public AMapEnumMapExp clone()
	{
		return new AMapEnumMapExp(
			_type,
			_location,
			cloneList(_members),
			_domTypes,
			_rngTypes
		);
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
		fields.put("_members",this._members);
		fields.put("_domTypes",this._domTypes);
		fields.put("_rngTypes",this._rngTypes);
		return fields;
	}


	/**
	 * Creates a deep clone of this {@link AMapEnumMapExp} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AMapEnumMapExp} node
	 */
	public AMapEnumMapExp clone(Map<INode,INode> oldToNewMap)
	{
		AMapEnumMapExp node = new AMapEnumMapExp(
			_type,
			_location,
			cloneList(_members, oldToNewMap),
			_domTypes,
			_rngTypes
		);
		oldToNewMap.put(this, node);
		return node;
	}



	public String toString()
	{
		return "" + ""+(_members.isEmpty() ? "{|->}" : "{" + Utils.listToString(_members) + "}") + "";
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
		if (o != null && o instanceof AMapEnumMapExp)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Sets the {@code _members} child of this {@link AMapEnumMapExp} node.
	 * @param value the new {@code _members} child of this {@link AMapEnumMapExp} node
	*/
	public void setMembers(List<? extends AMapletExp> value)
	{
		if (this._members.equals(value)) {
			return;
		}
		this._members.clear();
		if (value != null) {
			this._members.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _members} child of this {@link AMapEnumMapExp} node
	*/
	public LinkedList<AMapletExp> getMembers()
	{
		return this._members;
	}


	/**
	 * Sets the {@code _domTypes} child of this {@link AMapEnumMapExp} node.
	 * @param value the new {@code _domTypes} child of this {@link AMapEnumMapExp} node
	*/
	public void setDomTypes(List<? extends PType> value)
	{
		if (this._domTypes.equals(value)) {
			return;
		}
		this._domTypes.clear();
		if (value != null) {
			this._domTypes.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _domTypes} child of this {@link AMapEnumMapExp} node
	*/
	public LinkedList<PType> getDomTypes()
	{
		return this._domTypes;
	}


	/**
	 * Sets the {@code _rngTypes} child of this {@link AMapEnumMapExp} node.
	 * @param value the new {@code _rngTypes} child of this {@link AMapEnumMapExp} node
	*/
	public void setRngTypes(List<? extends PType> value)
	{
		if (this._rngTypes.equals(value)) {
			return;
		}
		this._rngTypes.clear();
		if (value != null) {
			this._rngTypes.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _rngTypes} child of this {@link AMapEnumMapExp} node
	*/
	public LinkedList<PType> getRngTypes()
	{
		return this._rngTypes;
	}


	/**
	* Calls the {@link IAnalysis#caseAMapEnumMapExp(AMapEnumMapExp)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AMapEnumMapExp} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAMapEnumMapExp(this);
	}


	/**
	* Calls the {@link IAnswer#caseAMapEnumMapExp(AMapEnumMapExp)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AMapEnumMapExp} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAMapEnumMapExp(this);
	}


	/**
	* Calls the {@link IQuestion#caseAMapEnumMapExp(AMapEnumMapExp, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AMapEnumMapExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAMapEnumMapExp(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAMapEnumMapExp(AMapEnumMapExp, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AMapEnumMapExp} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAMapEnumMapExp(this,question);
	}



}
