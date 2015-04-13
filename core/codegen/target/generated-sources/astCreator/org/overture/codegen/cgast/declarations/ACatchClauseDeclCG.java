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
import java.util.HashMap;
import org.overture.codegen.cgast.INode;
import org.overture.codegen.cgast.SDeclCGBase;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import org.overture.codegen.cgast.STypeCG;
import java.lang.Boolean;
import java.lang.Object;
import org.overture.codegen.cgast.SStmCG;
import java.lang.String;
import org.overture.codegen.cgast.declarations.ACatchClauseDeclCG;
import org.overture.codegen.ir.SourceNode;
import org.overture.codegen.cgast.analysis.intf.IAnswer;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class ACatchClauseDeclCG extends SDeclCGBase
{
	private static final long serialVersionUID = 1L;

	private STypeCG _type;
	private String _name;
	private SStmCG _stm;

	/**
	 * Creates a new {@link ACatchClauseDeclCG} node with no children.
	 */
	public ACatchClauseDeclCG()
	{

	}


	/**
	* Creates a new {@code ACatchClauseDeclCG TAG=catchClause} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param type_ the {@link STypeCG} node for the {@code type} child of this {@link ACatchClauseDeclCG} node
	* @param name_ the {@link String} node for the {@code name} child of this {@link ACatchClauseDeclCG} node
	* @param stm_ the {@link SStmCG} node for the {@code stm} child of this {@link ACatchClauseDeclCG} node
	*/
	public ACatchClauseDeclCG(SourceNode sourceNode_, STypeCG type_, String name_, SStmCG stm_)
	{
		super(sourceNode_,null);
		this.setType(type_);
		this.setName(name_);
		this.setStm(stm_);

	}


	/**
	* Creates a new {@code ACatchClauseDeclCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param type_ the {@link STypeCG} node for the {@code type} child of this {@link ACatchClauseDeclCG} node
	* @param name_ the {@link String} node for the {@code name} child of this {@link ACatchClauseDeclCG} node
	* @param stm_ the {@link SStmCG} node for the {@code stm} child of this {@link ACatchClauseDeclCG} node
	*/
	public ACatchClauseDeclCG(SourceNode sourceNode_, Object tag_, STypeCG type_, String name_, SStmCG stm_)
	{
		super(sourceNode_,tag_);
		this.setType(type_);
		this.setName(name_);
		this.setStm(stm_);

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
		if (o != null && o instanceof ACatchClauseDeclCG)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link ACatchClauseDeclCG} node.
	 * @return a deep clone of this {@link ACatchClauseDeclCG} node
	 */
	public ACatchClauseDeclCG clone()
	{
		return new ACatchClauseDeclCG(
			_sourceNode,
			_tag,
			cloneNode(_type),
			_name,
			cloneNode(_stm)
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
		fields.put("_type",this._type);
		fields.put("_name",this._name);
		fields.put("_stm",this._stm);
		return fields;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link ACatchClauseDeclCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link ACatchClauseDeclCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link ACatchClauseDeclCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			this._type = null;
			return;
		}

		if (this._stm == child) {
			this._stm = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}


	/**
	 * Creates a deep clone of this {@link ACatchClauseDeclCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link ACatchClauseDeclCG} node
	 */
	public ACatchClauseDeclCG clone(Map<INode,INode> oldToNewMap)
	{
		ACatchClauseDeclCG node = new ACatchClauseDeclCG(
			_sourceNode,
			_tag,
			cloneNode(_type, oldToNewMap),
			_name,
			cloneNode(_stm, oldToNewMap)
		);
		oldToNewMap.put(this, node);
		return node;
	}



	public String toString()
	{
		return (_type!=null?_type.toString():this.getClass().getSimpleName())+ (_name!=null?_name.toString():this.getClass().getSimpleName())+ (_stm!=null?_stm.toString():this.getClass().getSimpleName());
	}


	/**
	 * Sets the {@code _type} child of this {@link ACatchClauseDeclCG} node.
	 * @param value the new {@code _type} child of this {@link ACatchClauseDeclCG} node
	*/
	public void setType(STypeCG value)
	{
		if (this._type != null) {
			this._type.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._type = value;

	}


	/**
	 * @return the {@link STypeCG} node which is the {@code _type} child of this {@link ACatchClauseDeclCG} node
	*/
	public STypeCG getType()
	{
		return this._type;
	}


	/**
	 * Sets the {@code _name} child of this {@link ACatchClauseDeclCG} node.
	 * @param value the new {@code _name} child of this {@link ACatchClauseDeclCG} node
	*/
	public void setName(String value)
	{
		this._name = value;
	}


	/**
	 * @return the {@link String} node which is the {@code _name} child of this {@link ACatchClauseDeclCG} node
	*/
	public String getName()
	{
		return this._name;
	}


	/**
	 * Sets the {@code _stm} child of this {@link ACatchClauseDeclCG} node.
	 * @param value the new {@code _stm} child of this {@link ACatchClauseDeclCG} node
	*/
	public void setStm(SStmCG value)
	{
		if (this._stm != null) {
			this._stm.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._stm = value;

	}


	/**
	 * @return the {@link SStmCG} node which is the {@code _stm} child of this {@link ACatchClauseDeclCG} node
	*/
	public SStmCG getStm()
	{
		return this._stm;
	}


	/**
	* Calls the {@link IAnalysis#caseACatchClauseDeclCG(ACatchClauseDeclCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link ACatchClauseDeclCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseACatchClauseDeclCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseACatchClauseDeclCG(ACatchClauseDeclCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link ACatchClauseDeclCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseACatchClauseDeclCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseACatchClauseDeclCG(ACatchClauseDeclCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link ACatchClauseDeclCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseACatchClauseDeclCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseACatchClauseDeclCG(ACatchClauseDeclCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link ACatchClauseDeclCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseACatchClauseDeclCG(this,question);
	}



}
