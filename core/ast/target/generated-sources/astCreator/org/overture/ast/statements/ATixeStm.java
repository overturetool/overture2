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


import org.overture.ast.statements.PStm;
import org.overture.ast.statements.PStmBase;
import org.overture.ast.statements.ATixeStm;
import java.util.HashMap;
import org.overture.ast.statements.ATixeStmtAlternative;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import java.util.List;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.node.NodeList;
import java.util.Map;
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
public class ATixeStm extends PStmBase
{
	private static final long serialVersionUID = 1L;

	private NodeList<ATixeStmtAlternative> _traps = new NodeList<ATixeStmtAlternative>(this);
	private PStm _body;

	/**
	* Creates a new {@code ATixeStm} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param traps_ the {@link NodeList} node for the {@code traps} child of this {@link ATixeStm} node
	* @param body_ the {@link PStm} node for the {@code body} child of this {@link ATixeStm} node
	*/
	public ATixeStm(ILexLocation location_, PType type_, List<? extends ATixeStmtAlternative> traps_, PStm body_)
	{
		super(location_,type_);
		this.setTraps(traps_);
		this.setBody(body_);

	}


	/**
	* Creates a new {@code ATixeStm TAG=tixe} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param traps_ the {@link NodeList} node for the {@code traps} child of this {@link ATixeStm} node
	* @param body_ the {@link PStm} node for the {@code body} child of this {@link ATixeStm} node
	*/
	public ATixeStm(ILexLocation location_, List<? extends ATixeStmtAlternative> traps_, PStm body_)
	{
		super(location_,null);
		this.setTraps(traps_);
		this.setBody(body_);

	}


	/**
	 * Creates a new {@link ATixeStm} node with no children.
	 */
	public ATixeStm()
	{

	}



	public String toString()
	{
		return "" + "tixe {"+_traps+"} in "+_body;
	}


	/**
	 * Creates a deep clone of this {@link ATixeStm} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ATixeStm} node
	 */
	public ATixeStm clone(Map<INode,INode> oldToNewMap)
	{
		ATixeStm node = new ATixeStm(
			_location,
			_type,
			cloneList(_traps, oldToNewMap),
			cloneNode(_body, oldToNewMap)
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
	 * Removes the {@link INode} {@code child} as a child of this {@link ATixeStm} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ATixeStm} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ATixeStm} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._traps.remove(child)) {
				return;
		}
		if (this._body == child) {
			this._body = null;
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
		if (o != null && o instanceof ATixeStm)		{
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
		fields.put("_traps",this._traps);
		fields.put("_body",this._body);
		return fields;
	}


	/**
	 * Returns a deep clone of this {@link ATixeStm} node.
	 * @return a deep clone of this {@link ATixeStm} node
	 */
	public ATixeStm clone()
	{
		return new ATixeStm(
			_location,
			_type,
			cloneList(_traps),
			cloneNode(_body)
		);
	}


	/**
	 * Sets the {@code _traps} child of this {@link ATixeStm} node.
	 * @param value the new {@code _traps} child of this {@link ATixeStm} node
	*/
	public void setTraps(List<? extends ATixeStmtAlternative> value)
	{
		if (this._traps.equals(value)) {
			return;
		}
		this._traps.clear();
		if (value != null) {
			this._traps.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _traps} child of this {@link ATixeStm} node
	*/
	public LinkedList<ATixeStmtAlternative> getTraps()
	{
		return this._traps;
	}


	/**
	 * Sets the {@code _body} child of this {@link ATixeStm} node.
	 * @param value the new {@code _body} child of this {@link ATixeStm} node
	*/
	public void setBody(PStm value)
	{
		if (this._body != null) {
			this._body.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._body = value;

	}


	/**
	 * @return the {@link PStm} node which is the {@code _body} child of this {@link ATixeStm} node
	*/
	public PStm getBody()
	{
		return this._body;
	}


	/**
	* Calls the {@link IAnalysis#caseATixeStm(ATixeStm)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ATixeStm} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseATixeStm(this);
	}


	/**
	* Calls the {@link IAnswer#caseATixeStm(ATixeStm)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ATixeStm} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseATixeStm(this);
	}


	/**
	* Calls the {@link IQuestion#caseATixeStm(ATixeStm, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ATixeStm} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseATixeStm(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseATixeStm(ATixeStm, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ATixeStm} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseATixeStm(this,question);
	}



}
