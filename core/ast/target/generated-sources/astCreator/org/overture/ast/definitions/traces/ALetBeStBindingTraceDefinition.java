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

package org.overture.ast.definitions.traces;


import org.overture.ast.patterns.PMultipleBind;
import java.util.HashMap;
import org.overture.ast.expressions.PExp;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.definitions.traces.PTraceDefinitionBase;
import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.definitions.AMultiBindListDefinition;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import java.lang.String;
import org.overture.ast.definitions.traces.ALetBeStBindingTraceDefinition;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.analysis.intf.IAnalysis;
import org.overture.ast.definitions.traces.PTraceDefinition;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class ALetBeStBindingTraceDefinition extends PTraceDefinitionBase
{
	private static final long serialVersionUID = 1L;

	private PMultipleBind _bind;
	private PExp _stexp;
	private PTraceDefinition _body;
	private AMultiBindListDefinition _def;

	/**
	* Creates a new {@code ALetBeStBindingTraceDefinition} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param bind_ the {@link PMultipleBind} node for the {@code bind} child of this {@link ALetBeStBindingTraceDefinition} node
	* @param stexp_ the {@link PExp} node for the {@code stexp} child of this {@link ALetBeStBindingTraceDefinition} node
	* @param body_ the {@link PTraceDefinition} node for the {@code body} child of this {@link ALetBeStBindingTraceDefinition} node
	* @param def_ the {@link AMultiBindListDefinition} node for the {@code def} child of this {@link ALetBeStBindingTraceDefinition} node
	*/
	public ALetBeStBindingTraceDefinition(ILexLocation location_, PMultipleBind bind_, PExp stexp_, PTraceDefinition body_, AMultiBindListDefinition def_)
	{
		super(location_);
		this.setBind(bind_);
		this.setStexp(stexp_);
		this.setBody(body_);
		this.setDef(def_);

	}



	/**
	 * Creates a new {@link ALetBeStBindingTraceDefinition} node with no children.
	 */
	public ALetBeStBindingTraceDefinition()
	{

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
		fields.put("_bind",this._bind);
		fields.put("_stexp",this._stexp);
		fields.put("_body",this._body);
		fields.put("_def",this._def);
		return fields;
	}


	/**
	 * Creates a deep clone of this {@link ALetBeStBindingTraceDefinition} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ALetBeStBindingTraceDefinition} node
	 */
	public ALetBeStBindingTraceDefinition clone(Map<INode,INode> oldToNewMap)
	{
		ALetBeStBindingTraceDefinition node = new ALetBeStBindingTraceDefinition(
			_location,
			cloneNode(_bind, oldToNewMap),
			cloneNode(_stexp, oldToNewMap),
			cloneNode(_body, oldToNewMap),
			cloneNode(_def, oldToNewMap)
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
		return (_bind!=null?_bind.toString():this.getClass().getSimpleName())+ (_stexp!=null?_stexp.toString():this.getClass().getSimpleName())+ (_body!=null?_body.toString():this.getClass().getSimpleName())+ (_def!=null?_def.toString():this.getClass().getSimpleName());
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ALetBeStBindingTraceDefinition} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ALetBeStBindingTraceDefinition} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ALetBeStBindingTraceDefinition} node
	 */
	public void removeChild(INode child)
	{
		if (this._bind == child) {
			this._bind = null;
			return;
		}

		if (this._stexp == child) {
			this._stexp = null;
			return;
		}

		if (this._body == child) {
			this._body = null;
			return;
		}

		if (this._def == child) {
			this._def = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	 * Returns a deep clone of this {@link ALetBeStBindingTraceDefinition} node.
	 * @return a deep clone of this {@link ALetBeStBindingTraceDefinition} node
	 */
	public ALetBeStBindingTraceDefinition clone()
	{
		return new ALetBeStBindingTraceDefinition(
			_location,
			cloneNode(_bind),
			cloneNode(_stexp),
			cloneNode(_body),
			cloneNode(_def)
		);
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof ALetBeStBindingTraceDefinition)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Sets the {@code _bind} child of this {@link ALetBeStBindingTraceDefinition} node.
	 * @param value the new {@code _bind} child of this {@link ALetBeStBindingTraceDefinition} node
	*/
	public void setBind(PMultipleBind value)
	{
		if (this._bind != null) {
			this._bind.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._bind = value;

	}


	/**
	 * @return the {@link PMultipleBind} node which is the {@code _bind} child of this {@link ALetBeStBindingTraceDefinition} node
	*/
	public PMultipleBind getBind()
	{
		return this._bind;
	}


	/**
	 * Sets the {@code _stexp} child of this {@link ALetBeStBindingTraceDefinition} node.
	 * @param value the new {@code _stexp} child of this {@link ALetBeStBindingTraceDefinition} node
	*/
	public void setStexp(PExp value)
	{
		if (this._stexp != null) {
			this._stexp.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._stexp = value;

	}


	/**
	 * @return the {@link PExp} node which is the {@code _stexp} child of this {@link ALetBeStBindingTraceDefinition} node
	*/
	public PExp getStexp()
	{
		return this._stexp;
	}


	/**
	 * Sets the {@code _body} child of this {@link ALetBeStBindingTraceDefinition} node.
	 * @param value the new {@code _body} child of this {@link ALetBeStBindingTraceDefinition} node
	*/
	public void setBody(PTraceDefinition value)
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
	 * @return the {@link PTraceDefinition} node which is the {@code _body} child of this {@link ALetBeStBindingTraceDefinition} node
	*/
	public PTraceDefinition getBody()
	{
		return this._body;
	}


	/**
	 * Sets the {@code _def} child of this {@link ALetBeStBindingTraceDefinition} node.
	 * @param value the new {@code _def} child of this {@link ALetBeStBindingTraceDefinition} node
	*/
	public void setDef(AMultiBindListDefinition value)
	{
		if (this._def != null) {
			this._def.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._def = value;

	}


	/**
	 * @return the {@link AMultiBindListDefinition} node which is the {@code _def} child of this {@link ALetBeStBindingTraceDefinition} node
	*/
	public AMultiBindListDefinition getDef()
	{
		return this._def;
	}


	/**
	* Calls the {@link IAnalysis#caseALetBeStBindingTraceDefinition(ALetBeStBindingTraceDefinition)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ALetBeStBindingTraceDefinition} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseALetBeStBindingTraceDefinition(this);
	}


	/**
	* Calls the {@link IAnswer#caseALetBeStBindingTraceDefinition(ALetBeStBindingTraceDefinition)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ALetBeStBindingTraceDefinition} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseALetBeStBindingTraceDefinition(this);
	}


	/**
	* Calls the {@link IQuestion#caseALetBeStBindingTraceDefinition(ALetBeStBindingTraceDefinition, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ALetBeStBindingTraceDefinition} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseALetBeStBindingTraceDefinition(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseALetBeStBindingTraceDefinition(ALetBeStBindingTraceDefinition, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ALetBeStBindingTraceDefinition} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseALetBeStBindingTraceDefinition(this,question);
	}



}
