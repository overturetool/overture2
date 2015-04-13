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

package org.overture.ast.definitions;


import org.overture.ast.definitions.PDefinition;
import org.overture.ast.definitions.PDefinitionBase;
import org.overture.ast.definitions.ALocalDefinition;
import java.util.HashMap;
import org.overture.ast.definitions.SClassDefinition;
import org.overture.ast.types.AFieldField;
import org.overture.ast.typechecker.Pass;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.patterns.PPattern;
import org.overture.ast.intf.lex.ILexNameToken;
import org.overture.ast.types.AAccessSpecifierAccessSpecifier;
import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import java.lang.String;
import org.overture.ast.node.GraphNodeList;
import java.util.LinkedList;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.expressions.PExp;
import org.overture.ast.definitions.AStateDefinition;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import java.util.List;
import org.overture.ast.node.NodeList;
import org.overture.ast.typechecker.NameScope;
import org.overture.ast.types.PType;
import org.overture.ast.definitions.AExplicitFunctionDefinition;
import org.overture.ast.analysis.intf.IAnalysis;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AStateDefinition extends PDefinitionBase
{
	private static final long serialVersionUID = 1L;

	private NodeList<AFieldField> _fields = new NodeList<AFieldField>(this);
	private PPattern _invPattern;
	private PExp _invExpression;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private AExplicitFunctionDefinition _invdef;
	private PPattern _initPattern;
	private PExp _initExpression;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private AExplicitFunctionDefinition _initdef;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private GraphNodeList<PDefinition> _stateDefs = new GraphNodeList<PDefinition>(this);
	private ALocalDefinition _recordDefinition;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private PType _recordType;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private Boolean _canBeExecuted;

	/**
	* Creates a new {@code AStateDefinition TAG=state} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param fields_ the {@link NodeList} node for the {@code fields} child of this {@link AStateDefinition} node
	* @param invPattern_ the {@link PPattern} node for the {@code invPattern} child of this {@link AStateDefinition} node
	* @param invExpression_ the {@link PExp} node for the {@code invExpression} child of this {@link AStateDefinition} node
	* @param initPattern_ the {@link PPattern} node for the {@code initPattern} child of this {@link AStateDefinition} node
	* @param initExpression_ the {@link PExp} node for the {@code initExpression} child of this {@link AStateDefinition} node
	* @param recordDefinition_ the {@link ALocalDefinition} node for the {@code recordDefinition} child of this {@link AStateDefinition} node
	*/
	public AStateDefinition(ILexLocation location_, NameScope nameScope_, Boolean used_, AAccessSpecifierAccessSpecifier access_, Pass pass_, List<? extends AFieldField> fields_, PPattern invPattern_, PExp invExpression_, PPattern initPattern_, PExp initExpression_, ALocalDefinition recordDefinition_)
	{
		super(location_,null,nameScope_,used_,null,access_,null,pass_);
		this.setFields(fields_);
		this.setInvPattern(invPattern_);
		this.setInvExpression(invExpression_);
		this.setInitPattern(initPattern_);
		this.setInitExpression(initExpression_);
		this.setRecordDefinition(recordDefinition_);
		this.setCanBeExecuted(false);

	}


	/**
	 * Creates a new {@link AStateDefinition} node with no children.
	 */
	public AStateDefinition()
	{

	}


	/**
	* Creates a new {@code AStateDefinition} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param fields_ the {@link NodeList} node for the {@code fields} child of this {@link AStateDefinition} node
	* @param invPattern_ the {@link PPattern} node for the {@code invPattern} child of this {@link AStateDefinition} node
	* @param invExpression_ the {@link PExp} node for the {@code invExpression} child of this {@link AStateDefinition} node
	* @param invdef_ the {@link AExplicitFunctionDefinition} <b>graph</a> node for the {@code invdef} child of this {@link AStateDefinition} node.
	*  <i>The parent of this {@code invdef } will not be changed by adding it to this node.</i>
	* @param initPattern_ the {@link PPattern} node for the {@code initPattern} child of this {@link AStateDefinition} node
	* @param initExpression_ the {@link PExp} node for the {@code initExpression} child of this {@link AStateDefinition} node
	* @param initdef_ the {@link AExplicitFunctionDefinition} <b>graph</a> node for the {@code initdef} child of this {@link AStateDefinition} node.
	*  <i>The parent of this {@code initdef } will not be changed by adding it to this node.</i>
	* @param stateDefs_ the {@link GraphNodeList} <b>graph</a> node for the {@code stateDefs} child of this {@link AStateDefinition} node.
	*  <i>The parent of this {@code stateDefs } will not be changed by adding it to this node.</i>
	* @param recordDefinition_ the {@link ALocalDefinition} node for the {@code recordDefinition} child of this {@link AStateDefinition} node
	* @param recordType_ the {@link PType} <b>graph</a> node for the {@code recordType} child of this {@link AStateDefinition} node.
	*  <i>The parent of this {@code recordType } will not be changed by adding it to this node.</i>
	* @param canBeExecuted_ the {@link Boolean} <b>graph</a> node for the {@code canBeExecuted} child of this {@link AStateDefinition} node.
	*  <i>The parent of this {@code canBeExecuted } will not be changed by adding it to this node.</i>
	*/
	public AStateDefinition(ILexLocation location_, ILexNameToken name_, NameScope nameScope_, Boolean used_, SClassDefinition classDefinition_, AAccessSpecifierAccessSpecifier access_, PType type_, Pass pass_, List<? extends AFieldField> fields_, PPattern invPattern_, PExp invExpression_, AExplicitFunctionDefinition invdef_, PPattern initPattern_, PExp initExpression_, AExplicitFunctionDefinition initdef_, List<? extends PDefinition> stateDefs_, ALocalDefinition recordDefinition_, PType recordType_, Boolean canBeExecuted_)
	{
		super(location_,name_,nameScope_,used_,classDefinition_,access_,type_,pass_);
		this.setFields(fields_);
		this.setInvPattern(invPattern_);
		this.setInvExpression(invExpression_);
		this.setInvdef(invdef_);
		this.setInitPattern(initPattern_);
		this.setInitExpression(initExpression_);
		this.setInitdef(initdef_);
		this.setStateDefs(stateDefs_);
		this.setRecordDefinition(recordDefinition_);
		this.setRecordType(recordType_);
		this.setCanBeExecuted(canBeExecuted_);

	}



	public String toString()
	{
		return "" + "state "+_name+"of\n"+_fields+
            (_invPattern == null ? "" : "\n\tinv " + _invPattern + " == " + _invExpression) +
            (_initPattern == null ? "" : "\n\tinit " + _initPattern + " == " + _initExpression);
	}


	/**
	 * Returns a deep clone of this {@link AStateDefinition} node.
	 * @return a deep clone of this {@link AStateDefinition} node
	 */
	public AStateDefinition clone()
	{
		return new AStateDefinition(
			_location,
			_name,
			_nameScope,
			_used,
			_classDefinition,
			cloneNode(_access),
			_type,
			_pass,
			cloneList(_fields),
			cloneNode(_invPattern),
			cloneNode(_invExpression),
			_invdef,
			cloneNode(_initPattern),
			cloneNode(_initExpression),
			_initdef,
			_stateDefs,
			cloneNode(_recordDefinition),
			_recordType,
			_canBeExecuted
		);
	}


	/**
	 * Creates a deep clone of this {@link AStateDefinition} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AStateDefinition} node
	 */
	public AStateDefinition clone(Map<INode,INode> oldToNewMap)
	{
		AStateDefinition node = new AStateDefinition(
			_location,
			_name,
			_nameScope,
			_used,
			_classDefinition,
			cloneNode(_access, oldToNewMap),
			_type,
			_pass,
			cloneList(_fields, oldToNewMap),
			cloneNode(_invPattern, oldToNewMap),
			cloneNode(_invExpression, oldToNewMap),
			_invdef,
			cloneNode(_initPattern, oldToNewMap),
			cloneNode(_initExpression, oldToNewMap),
			_initdef,
			_stateDefs,
			cloneNode(_recordDefinition, oldToNewMap),
			_recordType,
			_canBeExecuted
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AStateDefinition)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AStateDefinition} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AStateDefinition} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AStateDefinition} node
	 */
	public void removeChild(INode child)
	{
		if (this._name == child) {
			return;
		}

		if (this._classDefinition == child) {
			return;
		}

		if (this._access == child) {
			this._access = null;
			return;
		}

		if (this._type == child) {
			return;
		}

		if (this._fields.remove(child)) {
				return;
		}
		if (this._invPattern == child) {
			this._invPattern = null;
			return;
		}

		if (this._invExpression == child) {
			this._invExpression = null;
			return;
		}

		if (this._invdef == child) {
			return;
		}

		if (this._initPattern == child) {
			this._initPattern = null;
			return;
		}

		if (this._initExpression == child) {
			this._initExpression = null;
			return;
		}

		if (this._initdef == child) {
			return;
		}

		if (this._stateDefs.contains(child)) {
			return;
		}

		if (this._recordDefinition == child) {
			this._recordDefinition = null;
			return;
		}

		if (this._recordType == child) {
			return;
		}

		throw new RuntimeException("Not a child.");
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
		fields.put("_fields",this._fields);
		fields.put("_invPattern",this._invPattern);
		fields.put("_invExpression",this._invExpression);
		fields.put("_invdef",this._invdef);
		fields.put("_initPattern",this._initPattern);
		fields.put("_initExpression",this._initExpression);
		fields.put("_initdef",this._initdef);
		fields.put("_stateDefs",this._stateDefs);
		fields.put("_recordDefinition",this._recordDefinition);
		fields.put("_recordType",this._recordType);
		fields.put("_canBeExecuted",this._canBeExecuted);
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
	 * Sets the {@code _fields} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _fields} child of this {@link AStateDefinition} node
	*/
	public void setFields(List<? extends AFieldField> value)
	{
		if (this._fields.equals(value)) {
			return;
		}
		this._fields.clear();
		if (value != null) {
			this._fields.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _fields} child of this {@link AStateDefinition} node
	*/
	public LinkedList<AFieldField> getFields()
	{
		return this._fields;
	}


	/**
	 * Sets the {@code _invPattern} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _invPattern} child of this {@link AStateDefinition} node
	*/
	public void setInvPattern(PPattern value)
	{
		if (this._invPattern != null) {
			this._invPattern.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._invPattern = value;

	}


	/**
	 * @return the {@link PPattern} node which is the {@code _invPattern} child of this {@link AStateDefinition} node
	*/
	public PPattern getInvPattern()
	{
		return this._invPattern;
	}


	/**
	 * Sets the {@code _invExpression} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _invExpression} child of this {@link AStateDefinition} node
	*/
	public void setInvExpression(PExp value)
	{
		if (this._invExpression != null) {
			this._invExpression.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._invExpression = value;

	}


	/**
	 * @return the {@link PExp} node which is the {@code _invExpression} child of this {@link AStateDefinition} node
	*/
	public PExp getInvExpression()
	{
		return this._invExpression;
	}


	/**
	 * Sets the {@code _invdef} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _invdef} child of this {@link AStateDefinition} node
	*/
	public void setInvdef(AExplicitFunctionDefinition value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._invdef = value;

	}


	/**
	 * @return the {@link AExplicitFunctionDefinition} node which is the {@code _invdef} child of this {@link AStateDefinition} node
	*/
	public AExplicitFunctionDefinition getInvdef()
	{
		return this._invdef;
	}


	/**
	 * Sets the {@code _initPattern} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _initPattern} child of this {@link AStateDefinition} node
	*/
	public void setInitPattern(PPattern value)
	{
		if (this._initPattern != null) {
			this._initPattern.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._initPattern = value;

	}


	/**
	 * @return the {@link PPattern} node which is the {@code _initPattern} child of this {@link AStateDefinition} node
	*/
	public PPattern getInitPattern()
	{
		return this._initPattern;
	}


	/**
	 * Sets the {@code _initExpression} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _initExpression} child of this {@link AStateDefinition} node
	*/
	public void setInitExpression(PExp value)
	{
		if (this._initExpression != null) {
			this._initExpression.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._initExpression = value;

	}


	/**
	 * @return the {@link PExp} node which is the {@code _initExpression} child of this {@link AStateDefinition} node
	*/
	public PExp getInitExpression()
	{
		return this._initExpression;
	}


	/**
	 * Sets the {@code _initdef} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _initdef} child of this {@link AStateDefinition} node
	*/
	public void setInitdef(AExplicitFunctionDefinition value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._initdef = value;

	}


	/**
	 * @return the {@link AExplicitFunctionDefinition} node which is the {@code _initdef} child of this {@link AStateDefinition} node
	*/
	public AExplicitFunctionDefinition getInitdef()
	{
		return this._initdef;
	}


	/**
	 * Sets the {@code _stateDefs} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _stateDefs} child of this {@link AStateDefinition} node
	*/
	public void setStateDefs(List<? extends PDefinition> value)
	{
		if (this._stateDefs.equals(value)) {
			return;
		}
		this._stateDefs.clear();
		if (value != null) {
			this._stateDefs.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _stateDefs} child of this {@link AStateDefinition} node
	*/
	public LinkedList<PDefinition> getStateDefs()
	{
		return this._stateDefs;
	}


	/**
	 * Sets the {@code _recordDefinition} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _recordDefinition} child of this {@link AStateDefinition} node
	*/
	public void setRecordDefinition(ALocalDefinition value)
	{
		if (this._recordDefinition != null) {
			this._recordDefinition.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._recordDefinition = value;

	}


	/**
	 * @return the {@link ALocalDefinition} node which is the {@code _recordDefinition} child of this {@link AStateDefinition} node
	*/
	public ALocalDefinition getRecordDefinition()
	{
		return this._recordDefinition;
	}


	/**
	 * Sets the {@code _recordType} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _recordType} child of this {@link AStateDefinition} node
	*/
	public void setRecordType(PType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._recordType = value;

	}


	/**
	 * @return the {@link PType} node which is the {@code _recordType} child of this {@link AStateDefinition} node
	*/
	public PType getRecordType()
	{
		return this._recordType;
	}


	/**
	 * Sets the {@code _canBeExecuted} child of this {@link AStateDefinition} node.
	 * @param value the new {@code _canBeExecuted} child of this {@link AStateDefinition} node
	*/
	public void setCanBeExecuted(Boolean value)
	{
		this._canBeExecuted = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _canBeExecuted} child of this {@link AStateDefinition} node
	*/
	public Boolean getCanBeExecuted()
	{
		return this._canBeExecuted;
	}


	/**
	* Calls the {@link IAnalysis#caseAStateDefinition(AStateDefinition)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AStateDefinition} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAStateDefinition(this);
	}


	/**
	* Calls the {@link IAnswer#caseAStateDefinition(AStateDefinition)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AStateDefinition} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAStateDefinition(this);
	}


	/**
	* Calls the {@link IQuestion#caseAStateDefinition(AStateDefinition, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AStateDefinition} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAStateDefinition(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAStateDefinition(AStateDefinition, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AStateDefinition} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAStateDefinition(this,question);
	}



}
