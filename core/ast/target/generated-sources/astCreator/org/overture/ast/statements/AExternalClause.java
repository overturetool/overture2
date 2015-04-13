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

package org.overture.ast.statements;


import org.overture.ast.intf.lex.ILexToken;
import org.overture.ast.statements.PClauseBase;
import java.util.HashMap;
import org.overture.ast.analysis.AnalysisException;
import java.util.List;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.intf.lex.ILexNameToken;
import org.overture.ast.node.NodeList;
import java.util.Map;
import org.overture.ast.statements.AExternalClause;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
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
public class AExternalClause extends PClauseBase
{
	private static final long serialVersionUID = 1L;

	private ILexToken _mode;
	private NodeList<ILexNameToken> _identifiers = new NodeList<ILexNameToken>(this);
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private PType _type;

	/**
	* Creates a new {@code AExternalClause TAG=external} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param mode_ the {@link ILexToken} node for the {@code mode} child of this {@link AExternalClause} node
	* @param identifiers_ the {@link NodeList} node for the {@code identifiers} child of this {@link AExternalClause} node
	*/
	public AExternalClause(ILexToken mode_, List<? extends ILexNameToken> identifiers_)
	{
		super();
		this.setMode(mode_);
		this.setIdentifiers(identifiers_);

	}


	/**
	 * Creates a new {@link AExternalClause} node with no children.
	 */
	public AExternalClause()
	{

	}


	/**
	* Creates a new {@code AExternalClause} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param mode_ the {@link ILexToken} node for the {@code mode} child of this {@link AExternalClause} node
	* @param identifiers_ the {@link NodeList} node for the {@code identifiers} child of this {@link AExternalClause} node
	* @param type_ the {@link PType} <b>graph</a> node for the {@code type} child of this {@link AExternalClause} node.
	*  <i>The parent of this {@code type } will not be changed by adding it to this node.</i>
	*/
	public AExternalClause(ILexToken mode_, List<? extends ILexNameToken> identifiers_, PType type_)
	{
		super();
		this.setMode(mode_);
		this.setIdentifiers(identifiers_);
		this.setType(type_);

	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AExternalClause} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AExternalClause} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AExternalClause} node
	 */
	public void removeChild(INode child)
	{
		if (this._mode == child) {
			this._mode = null;
			return;
		}

		if (this._identifiers.remove(child)) {
				return;
		}
		if (this._type == child) {
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	 * Creates a deep clone of this {@link AExternalClause} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AExternalClause} node
	 */
	public AExternalClause clone(Map<INode,INode> oldToNewMap)
	{
		AExternalClause node = new AExternalClause(
			cloneNode(_mode, oldToNewMap),
			cloneList(_identifiers, oldToNewMap),
			_type
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



	public String toString()
	{
		return (_mode!=null?_mode.toString():this.getClass().getSimpleName())+ (_identifiers!=null?_identifiers.toString():this.getClass().getSimpleName())+ (_type!=null?_type.toString():this.getClass().getSimpleName());
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
		fields.put("_mode",this._mode);
		fields.put("_identifiers",this._identifiers);
		fields.put("_type",this._type);
		return fields;
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AExternalClause)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link AExternalClause} node.
	 * @return a deep clone of this {@link AExternalClause} node
	 */
	public AExternalClause clone()
	{
		return new AExternalClause(
			cloneNode(_mode),
			cloneList(_identifiers),
			_type
		);
	}


	/**
	 * Sets the {@code _mode} child of this {@link AExternalClause} node.
	 * @param value the new {@code _mode} child of this {@link AExternalClause} node
	*/
	public void setMode(ILexToken value)
	{
		if (this._mode != null) {
			this._mode.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._mode = value;

	}


	/**
	 * @return the {@link ILexToken} node which is the {@code _mode} child of this {@link AExternalClause} node
	*/
	public ILexToken getMode()
	{
		return this._mode;
	}


	/**
	 * Sets the {@code _identifiers} child of this {@link AExternalClause} node.
	 * @param value the new {@code _identifiers} child of this {@link AExternalClause} node
	*/
	public void setIdentifiers(List<? extends ILexNameToken> value)
	{
		if (this._identifiers.equals(value)) {
			return;
		}
		this._identifiers.clear();
		if (value != null) {
			this._identifiers.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _identifiers} child of this {@link AExternalClause} node
	*/
	public LinkedList<ILexNameToken> getIdentifiers()
	{
		return this._identifiers;
	}


	/**
	 * Sets the {@code _type} child of this {@link AExternalClause} node.
	 * @param value the new {@code _type} child of this {@link AExternalClause} node
	*/
	public void setType(PType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._type = value;

	}


	/**
	 * @return the {@link PType} node which is the {@code _type} child of this {@link AExternalClause} node
	*/
	public PType getType()
	{
		return this._type;
	}


	/**
	* Calls the {@link IAnalysis#caseAExternalClause(AExternalClause)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AExternalClause} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAExternalClause(this);
	}


	/**
	* Calls the {@link IAnswer#caseAExternalClause(AExternalClause)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AExternalClause} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAExternalClause(this);
	}


	/**
	* Calls the {@link IQuestion#caseAExternalClause(AExternalClause, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AExternalClause} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAExternalClause(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAExternalClause(AExternalClause, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AExternalClause} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAExternalClause(this,question);
	}



}
