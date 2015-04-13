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

package org.overture.codegen.cgast.statements;


import org.overture.codegen.cgast.analysis.intf.IQuestion;
import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.statements.SCallStmBase;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import org.overture.codegen.cgast.INode;
import java.util.HashMap;
import org.overture.codegen.cgast.SExpCG;
import org.overture.codegen.cgast.statements.APlainCallStmCG;
import java.util.List;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import org.overture.codegen.cgast.STypeCG;
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
public class APlainCallStmCG extends SCallStmBase
{
	private static final long serialVersionUID = 1L;

	private STypeCG _classType;

	/**
	* Creates a new {@code APlainCallStmCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param classType_ the {@link STypeCG} node for the {@code classType} child of this {@link APlainCallStmCG} node
	*/
	public APlainCallStmCG(SourceNode sourceNode_, Object tag_, STypeCG type_, Boolean isStatic_, String name_, List<? extends SExpCG> args_, STypeCG classType_)
	{
		super(sourceNode_,tag_,type_,isStatic_,name_,args_);
		this.setClassType(classType_);

	}


	/**
	 * Creates a new {@link APlainCallStmCG} node with no children.
	 */
	public APlainCallStmCG()
	{

	}


	/**
	* Creates a new {@code APlainCallStmCG TAG=plain} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param classType_ the {@link STypeCG} node for the {@code classType} child of this {@link APlainCallStmCG} node
	*/
	public APlainCallStmCG(SourceNode sourceNode_, STypeCG type_, Boolean isStatic_, String name_, List<? extends SExpCG> args_, STypeCG classType_)
	{
		super(sourceNode_,null,type_,isStatic_,name_,args_);
		this.setClassType(classType_);

	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link APlainCallStmCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link APlainCallStmCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link APlainCallStmCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._type == child) {
			this._type = null;
			return;
		}

		if (this._args.remove(child)) {
				return;
		}
		if (this._classType == child) {
			this._classType = null;
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
	 * Creates a deep clone of this {@link APlainCallStmCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link APlainCallStmCG} node
	 */
	public APlainCallStmCG clone(Map<INode,INode> oldToNewMap)
	{
		APlainCallStmCG node = new APlainCallStmCG(
			_sourceNode,
			_tag,
			cloneNode(_type, oldToNewMap),
			_isStatic,
			_name,
			cloneList(_args, oldToNewMap),
			cloneNode(_classType, oldToNewMap)
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
		fields.put("_classType",this._classType);
		return fields;
	}


	/**
	 * Returns a deep clone of this {@link APlainCallStmCG} node.
	 * @return a deep clone of this {@link APlainCallStmCG} node
	 */
	public APlainCallStmCG clone()
	{
		return new APlainCallStmCG(
			_sourceNode,
			_tag,
			cloneNode(_type),
			_isStatic,
			_name,
			cloneList(_args),
			cloneNode(_classType)
		);
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof APlainCallStmCG)		{
			 return toString().equals(o.toString());
		}
		return false;
	}



	public String toString()
	{
		return (_classType!=null?_classType.toString():this.getClass().getSimpleName());
	}


	/**
	 * Sets the {@code _classType} child of this {@link APlainCallStmCG} node.
	 * @param value the new {@code _classType} child of this {@link APlainCallStmCG} node
	*/
	public void setClassType(STypeCG value)
	{
		if (this._classType != null) {
			this._classType.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._classType = value;

	}


	/**
	 * @return the {@link STypeCG} node which is the {@code _classType} child of this {@link APlainCallStmCG} node
	*/
	public STypeCG getClassType()
	{
		return this._classType;
	}


	/**
	* Calls the {@link IAnalysis#caseAPlainCallStmCG(APlainCallStmCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link APlainCallStmCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseAPlainCallStmCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseAPlainCallStmCG(APlainCallStmCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link APlainCallStmCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAPlainCallStmCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseAPlainCallStmCG(APlainCallStmCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link APlainCallStmCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAPlainCallStmCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAPlainCallStmCG(APlainCallStmCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link APlainCallStmCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAPlainCallStmCG(this,question);
	}



}
