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

package org.overture.ast.modules;


import java.util.HashMap;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.intf.lex.ILexNameToken;
import org.overture.ast.modules.AAllImport;
import org.overture.ast.modules.PImportBase;
import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import java.lang.String;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.analysis.intf.IAnalysis;
import org.overture.ast.modules.AModuleModules;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AAllImport extends PImportBase
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code AAllImport} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public AAllImport(ILexLocation location_, ILexNameToken name_, ILexNameToken renamed_, AModuleModules from_)
	{
		super(location_,name_,renamed_,from_);

	}


	/**
	* Creates a new {@code AAllImport TAG=all} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	*/
	public AAllImport(ILexLocation location_, ILexNameToken name_, ILexNameToken renamed_)
	{
		super(location_,name_,renamed_,null);

	}


	/**
	 * Creates a new {@link AAllImport} node with no children.
	 */
	public AAllImport()
	{

	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AAllImport} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AAllImport} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AAllImport} node
	 */
	public void removeChild(INode child)
	{
		if (this._name == child) {
			this._name = null;
			return;
		}

		if (this._renamed == child) {
			this._renamed = null;
			return;
		}

		if (this._from == child) {
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
		return fields;
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AAllImport)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link AAllImport} node.
	 * @return a deep clone of this {@link AAllImport} node
	 */
	public AAllImport clone()
	{
		return new AAllImport(
			_location,
			cloneNode(_name),
			cloneNode(_renamed),
			_from
		);
	}


	/**
	 * Creates a deep clone of this {@link AAllImport} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AAllImport} node
	 */
	public AAllImport clone(Map<INode,INode> oldToNewMap)
	{
		AAllImport node = new AAllImport(
			_location,
			cloneNode(_name, oldToNewMap),
			cloneNode(_renamed, oldToNewMap),
			_from
		);
		oldToNewMap.put(this, node);
		return node;
	}



	public String toString()
	{
		return super.toString();
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
	* Calls the {@link IAnalysis#caseAAllImport(AAllImport)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AAllImport} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAAllImport(this);
	}


	/**
	* Calls the {@link IAnswer#caseAAllImport(AAllImport)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AAllImport} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAAllImport(this);
	}


	/**
	* Calls the {@link IQuestion#caseAAllImport(AAllImport, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AAllImport} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAAllImport(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAAllImport(AAllImport, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AAllImport} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAAllImport(this,question);
	}



}
