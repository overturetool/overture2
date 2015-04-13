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
import java.util.HashMap;
import org.overture.ast.expressions.PExp;
import org.overture.ast.types.SSeqType;
import org.overture.ast.patterns.ADefPatternBind;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.statements.AForPatternBindStm;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.analysis.intf.IAnswer;
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
public class AForPatternBindStm extends PStmBase
{
	private static final long serialVersionUID = 1L;

	private ADefPatternBind _patternBind;
	private Boolean _reverse;
	private PExp _exp;
	private PStm _statement;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private SSeqType _seqType;

	/**
	 * Creates a new {@link AForPatternBindStm} node with no children.
	 */
	public AForPatternBindStm()
	{

	}


	/**
	* Creates a new {@code AForPatternBindStm TAG=forPatternBind} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param patternBind_ the {@link ADefPatternBind} node for the {@code patternBind} child of this {@link AForPatternBindStm} node
	* @param reverse_ the {@link Boolean} node for the {@code reverse} child of this {@link AForPatternBindStm} node
	* @param exp_ the {@link PExp} node for the {@code exp} child of this {@link AForPatternBindStm} node
	* @param statement_ the {@link PStm} node for the {@code statement} child of this {@link AForPatternBindStm} node
	*/
	public AForPatternBindStm(ILexLocation location_, ADefPatternBind patternBind_, Boolean reverse_, PExp exp_, PStm statement_)
	{
		super(location_,null);
		this.setPatternBind(patternBind_);
		this.setReverse(reverse_);
		this.setExp(exp_);
		this.setStatement(statement_);

	}


	/**
	* Creates a new {@code AForPatternBindStm} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param patternBind_ the {@link ADefPatternBind} node for the {@code patternBind} child of this {@link AForPatternBindStm} node
	* @param reverse_ the {@link Boolean} node for the {@code reverse} child of this {@link AForPatternBindStm} node
	* @param exp_ the {@link PExp} node for the {@code exp} child of this {@link AForPatternBindStm} node
	* @param statement_ the {@link PStm} node for the {@code statement} child of this {@link AForPatternBindStm} node
	* @param seqType_ the {@link SSeqType} <b>graph</a> node for the {@code seqType} child of this {@link AForPatternBindStm} node.
	*  <i>The parent of this {@code seqType } will not be changed by adding it to this node.</i>
	*/
	public AForPatternBindStm(ILexLocation location_, PType type_, ADefPatternBind patternBind_, Boolean reverse_, PExp exp_, PStm statement_, SSeqType seqType_)
	{
		super(location_,type_);
		this.setPatternBind(patternBind_);
		this.setReverse(reverse_);
		this.setExp(exp_);
		this.setStatement(statement_);
		this.setSeqType(seqType_);

	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AForPatternBindStm)		{
			 return toString().equals(o.toString());
		}
		return false;
	}



	public String toString()
	{
		return "" + "for "+_patternBind+" in "+(_reverse ? " reverse " : "")+_exp+" do\n"+_statement;
	}


	/**
	 * Returns a deep clone of this {@link AForPatternBindStm} node.
	 * @return a deep clone of this {@link AForPatternBindStm} node
	 */
	public AForPatternBindStm clone()
	{
		return new AForPatternBindStm(
			_location,
			_type,
			cloneNode(_patternBind),
			_reverse,
			cloneNode(_exp),
			cloneNode(_statement),
			_seqType
		);
	}


	/**
	 * Creates a deep clone of this {@link AForPatternBindStm} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AForPatternBindStm} node
	 */
	public AForPatternBindStm clone(Map<INode,INode> oldToNewMap)
	{
		AForPatternBindStm node = new AForPatternBindStm(
			_location,
			_type,
			cloneNode(_patternBind, oldToNewMap),
			_reverse,
			cloneNode(_exp, oldToNewMap),
			cloneNode(_statement, oldToNewMap),
			_seqType
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
		fields.put("_patternBind",this._patternBind);
		fields.put("_reverse",this._reverse);
		fields.put("_exp",this._exp);
		fields.put("_statement",this._statement);
		fields.put("_seqType",this._seqType);
		return fields;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AForPatternBindStm} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AForPatternBindStm} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AForPatternBindStm} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			return;
		}

		if (this._patternBind == child) {
			this._patternBind = null;
			return;
		}

		if (this._exp == child) {
			this._exp = null;
			return;
		}

		if (this._statement == child) {
			this._statement = null;
			return;
		}

		if (this._seqType == child) {
			return;
		}

		throw new RuntimeException("Not a child.");
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
	 * Sets the {@code _patternBind} child of this {@link AForPatternBindStm} node.
	 * @param value the new {@code _patternBind} child of this {@link AForPatternBindStm} node
	*/
	public void setPatternBind(ADefPatternBind value)
	{
		if (this._patternBind != null) {
			this._patternBind.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._patternBind = value;

	}


	/**
	 * @return the {@link ADefPatternBind} node which is the {@code _patternBind} child of this {@link AForPatternBindStm} node
	*/
	public ADefPatternBind getPatternBind()
	{
		return this._patternBind;
	}


	/**
	 * Sets the {@code _reverse} child of this {@link AForPatternBindStm} node.
	 * @param value the new {@code _reverse} child of this {@link AForPatternBindStm} node
	*/
	public void setReverse(Boolean value)
	{
		this._reverse = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _reverse} child of this {@link AForPatternBindStm} node
	*/
	public Boolean getReverse()
	{
		return this._reverse;
	}


	/**
	 * Sets the {@code _exp} child of this {@link AForPatternBindStm} node.
	 * @param value the new {@code _exp} child of this {@link AForPatternBindStm} node
	*/
	public void setExp(PExp value)
	{
		if (this._exp != null) {
			this._exp.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._exp = value;

	}


	/**
	 * @return the {@link PExp} node which is the {@code _exp} child of this {@link AForPatternBindStm} node
	*/
	public PExp getExp()
	{
		return this._exp;
	}


	/**
	 * Sets the {@code _statement} child of this {@link AForPatternBindStm} node.
	 * @param value the new {@code _statement} child of this {@link AForPatternBindStm} node
	*/
	public void setStatement(PStm value)
	{
		if (this._statement != null) {
			this._statement.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._statement = value;

	}


	/**
	 * @return the {@link PStm} node which is the {@code _statement} child of this {@link AForPatternBindStm} node
	*/
	public PStm getStatement()
	{
		return this._statement;
	}


	/**
	 * Sets the {@code _seqType} child of this {@link AForPatternBindStm} node.
	 * @param value the new {@code _seqType} child of this {@link AForPatternBindStm} node
	*/
	public void setSeqType(SSeqType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._seqType = value;

	}


	/**
	 * @return the {@link SSeqType} node which is the {@code _seqType} child of this {@link AForPatternBindStm} node
	*/
	public SSeqType getSeqType()
	{
		return this._seqType;
	}


	/**
	* Calls the {@link IAnalysis#caseAForPatternBindStm(AForPatternBindStm)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AForPatternBindStm} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAForPatternBindStm(this);
	}


	/**
	* Calls the {@link IAnswer#caseAForPatternBindStm(AForPatternBindStm)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AForPatternBindStm} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAForPatternBindStm(this);
	}


	/**
	* Calls the {@link IQuestion#caseAForPatternBindStm(AForPatternBindStm, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AForPatternBindStm} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAForPatternBindStm(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAForPatternBindStm(AForPatternBindStm, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AForPatternBindStm} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAForPatternBindStm(this,question);
	}



}
