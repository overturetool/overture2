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

package org.overture.codegen.cgast.declarations;


import org.overture.codegen.cgast.analysis.intf.IQuestion;
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import org.overture.codegen.cgast.INode;
import java.util.HashMap;
import org.overture.codegen.cgast.SDeclCGBase;
import org.overture.codegen.cgast.SExpCG;
import org.overture.codegen.cgast.declarations.APersyncDeclCG;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;
import org.overture.codegen.cgast.analysis.intf.IAnswer;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class APersyncDeclCG extends SDeclCGBase
{
	private static final long serialVersionUID = 1L;

	private String _opname;
	private String _guardname;
	private SExpCG _pred;

	/**
	 * Creates a new {@link APersyncDeclCG} node with no children.
	 */
	public APersyncDeclCG()
	{

	}


	/**
	* Creates a new {@code APersyncDeclCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param opname_ the {@link String} node for the {@code opname} child of this {@link APersyncDeclCG} node
	* @param guardname_ the {@link String} node for the {@code guardname} child of this {@link APersyncDeclCG} node
	* @param pred_ the {@link SExpCG} node for the {@code pred} child of this {@link APersyncDeclCG} node
	*/
	public APersyncDeclCG(SourceNode sourceNode_, Object tag_, String opname_, String guardname_, SExpCG pred_)
	{
		super(sourceNode_,tag_);
		this.setOpname(opname_);
		this.setGuardname(guardname_);
		this.setPred(pred_);

	}


	/**
	* Creates a new {@code APersyncDeclCG TAG=persync} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param opname_ the {@link String} node for the {@code opname} child of this {@link APersyncDeclCG} node
	* @param guardname_ the {@link String} node for the {@code guardname} child of this {@link APersyncDeclCG} node
	* @param pred_ the {@link SExpCG} node for the {@code pred} child of this {@link APersyncDeclCG} node
	*/
	public APersyncDeclCG(SourceNode sourceNode_, String opname_, String guardname_, SExpCG pred_)
	{
		super(sourceNode_,null);
		this.setOpname(opname_);
		this.setGuardname(guardname_);
		this.setPred(pred_);

	}


	/**
	 * Returns a deep clone of this {@link APersyncDeclCG} node.
	 * @return a deep clone of this {@link APersyncDeclCG} node
	 */
	public APersyncDeclCG clone()
	{
		return new APersyncDeclCG(
			_sourceNode,
			_tag,
			_opname,
			_guardname,
			cloneNode(_pred)
		);
	}


	/**
	 * Creates a deep clone of this {@link APersyncDeclCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link APersyncDeclCG} node
	 */
	public APersyncDeclCG clone(Map<INode,INode> oldToNewMap)
	{
		APersyncDeclCG node = new APersyncDeclCG(
			_sourceNode,
			_tag,
			_opname,
			_guardname,
			cloneNode(_pred, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link APersyncDeclCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link APersyncDeclCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link APersyncDeclCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._pred == child) {
			this._pred = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}



	public String toString()
	{
		return (_opname!=null?_opname.toString():this.getClass().getSimpleName())+ (_guardname!=null?_guardname.toString():this.getClass().getSimpleName())+ (_pred!=null?_pred.toString():this.getClass().getSimpleName());
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
		fields.put("_opname",this._opname);
		fields.put("_guardname",this._guardname);
		fields.put("_pred",this._pred);
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
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof APersyncDeclCG)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Sets the {@code _opname} child of this {@link APersyncDeclCG} node.
	 * @param value the new {@code _opname} child of this {@link APersyncDeclCG} node
	*/
	public void setOpname(String value)
	{
		this._opname = value;
	}


	/**
	 * @return the {@link String} node which is the {@code _opname} child of this {@link APersyncDeclCG} node
	*/
	public String getOpname()
	{
		return this._opname;
	}


	/**
	 * Sets the {@code _guardname} child of this {@link APersyncDeclCG} node.
	 * @param value the new {@code _guardname} child of this {@link APersyncDeclCG} node
	*/
	public void setGuardname(String value)
	{
		this._guardname = value;
	}


	/**
	 * @return the {@link String} node which is the {@code _guardname} child of this {@link APersyncDeclCG} node
	*/
	public String getGuardname()
	{
		return this._guardname;
	}


	/**
	 * Sets the {@code _pred} child of this {@link APersyncDeclCG} node.
	 * @param value the new {@code _pred} child of this {@link APersyncDeclCG} node
	*/
	public void setPred(SExpCG value)
	{
		if (this._pred != null) {
			this._pred.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._pred = value;

	}


	/**
	 * @return the {@link SExpCG} node which is the {@code _pred} child of this {@link APersyncDeclCG} node
	*/
	public SExpCG getPred()
	{
		return this._pred;
	}


	/**
	* Calls the {@link IAnalysis#caseAPersyncDeclCG(APersyncDeclCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link APersyncDeclCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseAPersyncDeclCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseAPersyncDeclCG(APersyncDeclCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link APersyncDeclCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAPersyncDeclCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseAPersyncDeclCG(APersyncDeclCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link APersyncDeclCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAPersyncDeclCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAPersyncDeclCG(APersyncDeclCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link APersyncDeclCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAPersyncDeclCG(this,question);
	}



}
