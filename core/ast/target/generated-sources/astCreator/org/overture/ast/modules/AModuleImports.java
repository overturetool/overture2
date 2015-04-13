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


import org.overture.ast.intf.lex.ILexIdentifierToken;
import org.overture.ast.modules.PImportsBase;
import org.overture.ast.modules.AModuleImports;
import java.util.HashMap;
import org.overture.ast.modules.AFromModuleImports;
import org.overture.ast.analysis.AnalysisException;
import java.util.List;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.ast.node.NodeList;
import java.util.Map;
import java.lang.Boolean;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import java.lang.String;
import java.util.LinkedList;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.analysis.intf.IAnalysis;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AModuleImports extends PImportsBase
{
	private static final long serialVersionUID = 1L;

	private ILexIdentifierToken _name;
	private NodeList<AFromModuleImports> _imports = new NodeList<AFromModuleImports>(this);

	/**
	* Creates a new {@code AModuleImports} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param name_ the {@link ILexIdentifierToken} node for the {@code name} child of this {@link AModuleImports} node
	* @param imports_ the {@link NodeList} node for the {@code imports} child of this {@link AModuleImports} node
	*/
	public AModuleImports(ILexIdentifierToken name_, List<? extends AFromModuleImports> imports_)
	{
		super();
		this.setName(name_);
		this.setImports(imports_);

	}



	/**
	 * Creates a new {@link AModuleImports} node with no children.
	 */
	public AModuleImports()
	{

	}


	/**
	 * Creates a deep clone of this {@link AModuleImports} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AModuleImports} node
	 */
	public AModuleImports clone(Map<INode,INode> oldToNewMap)
	{
		AModuleImports node = new AModuleImports(
			cloneNode(_name, oldToNewMap),
			cloneList(_imports, oldToNewMap)
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
		return (_name!=null?_name.toString():this.getClass().getSimpleName())+ (_imports!=null?_imports.toString():this.getClass().getSimpleName());
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AModuleImports)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AModuleImports} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AModuleImports} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AModuleImports} node
	 */
	public void removeChild(INode child)
	{
		if (this._name == child) {
			this._name = null;
			return;
		}

		if (this._imports.remove(child)) {
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
		fields.put("_name",this._name);
		fields.put("_imports",this._imports);
		return fields;
	}


	/**
	 * Returns a deep clone of this {@link AModuleImports} node.
	 * @return a deep clone of this {@link AModuleImports} node
	 */
	public AModuleImports clone()
	{
		return new AModuleImports(
			cloneNode(_name),
			cloneList(_imports)
		);
	}


	/**
	 * Sets the {@code _name} child of this {@link AModuleImports} node.
	 * @param value the new {@code _name} child of this {@link AModuleImports} node
	*/
	public void setName(ILexIdentifierToken value)
	{
		if (this._name != null) {
			this._name.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._name = value;

	}


	/**
	 * @return the {@link ILexIdentifierToken} node which is the {@code _name} child of this {@link AModuleImports} node
	*/
	public ILexIdentifierToken getName()
	{
		return this._name;
	}


	/**
	 * Sets the {@code _imports} child of this {@link AModuleImports} node.
	 * @param value the new {@code _imports} child of this {@link AModuleImports} node
	*/
	public void setImports(List<? extends AFromModuleImports> value)
	{
		if (this._imports.equals(value)) {
			return;
		}
		this._imports.clear();
		if (value != null) {
			this._imports.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _imports} child of this {@link AModuleImports} node
	*/
	public LinkedList<AFromModuleImports> getImports()
	{
		return this._imports;
	}


	/**
	* Calls the {@link IAnalysis#caseAModuleImports(AModuleImports)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AModuleImports} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAModuleImports(this);
	}


	/**
	* Calls the {@link IAnswer#caseAModuleImports(AModuleImports)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AModuleImports} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAModuleImports(this);
	}


	/**
	* Calls the {@link IQuestion#caseAModuleImports(AModuleImports, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AModuleImports} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAModuleImports(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAModuleImports(AModuleImports, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AModuleImports} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAModuleImports(this,question);
	}



}
