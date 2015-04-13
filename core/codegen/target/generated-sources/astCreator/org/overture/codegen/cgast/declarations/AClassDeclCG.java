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


import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.analysis.intf.IQuestionAnswer;
import org.overture.codegen.cgast.INode;
import java.util.HashMap;
import org.overture.codegen.cgast.declarations.AInterfaceDeclCG;
import org.overture.codegen.cgast.declarations.AFuncDeclCG;
import org.overture.codegen.cgast.analysis.intf.IAnalysis;
import java.util.Map;
import java.lang.Boolean;
import java.lang.String;
import org.overture.codegen.ir.SourceNode;
import java.util.LinkedList;
import org.overture.codegen.cgast.declarations.ANamedTraceDeclCG;
import org.overture.codegen.cgast.analysis.intf.IQuestion;
import org.overture.codegen.cgast.declarations.AMethodDeclCG;
import org.overture.codegen.cgast.declarations.AFieldDeclCG;
import org.overture.codegen.cgast.NodeList;
import org.overture.codegen.cgast.SDeclCGBase;
import org.overture.codegen.cgast.declarations.AClassDeclCG;
import org.overture.codegen.cgast.declarations.APersyncDeclCG;
import java.util.List;
import org.overture.codegen.cgast.declarations.ATypeDeclCG;
import org.overture.codegen.cgast.declarations.AThreadDeclCG;
import java.lang.Object;
import org.overture.codegen.cgast.analysis.intf.IAnswer;
import org.overture.codegen.cgast.declarations.AMutexSyncDeclCG;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AClassDeclCG extends SDeclCGBase
{
	private static final long serialVersionUID = 1L;

	private String _package;
	private String _access;
	private Boolean _abstract;
	private Boolean _static;
	private String _name;
	private NodeList<AFieldDeclCG> _fields = new NodeList<AFieldDeclCG>(this);
	private NodeList<AMethodDeclCG> _methods = new NodeList<AMethodDeclCG>(this);
	private NodeList<AFuncDeclCG> _functions = new NodeList<AFuncDeclCG>(this);
	private NodeList<ANamedTraceDeclCG> _traces = new NodeList<ANamedTraceDeclCG>(this);
	private String _superName;
	private AThreadDeclCG _thread;
	private NodeList<AClassDeclCG> _innerClasses = new NodeList<AClassDeclCG>(this);
	private NodeList<AInterfaceDeclCG> _interfaces = new NodeList<AInterfaceDeclCG>(this);
	private NodeList<ATypeDeclCG> _typeDecls = new NodeList<ATypeDeclCG>(this);
	private NodeList<APersyncDeclCG> _perSyncs = new NodeList<APersyncDeclCG>(this);
	private NodeList<AMutexSyncDeclCG> _mutexSyncs = new NodeList<AMutexSyncDeclCG>(this);

	/**
	* Creates a new {@code AClassDeclCG} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param package_ the {@link String} node for the {@code package} child of this {@link AClassDeclCG} node
	* @param access_ the {@link String} node for the {@code access} child of this {@link AClassDeclCG} node
	* @param abstract_ the {@link Boolean} node for the {@code abstract} child of this {@link AClassDeclCG} node
	* @param static_ the {@link Boolean} node for the {@code static} child of this {@link AClassDeclCG} node
	* @param name_ the {@link String} node for the {@code name} child of this {@link AClassDeclCG} node
	* @param fields_ the {@link NodeList} node for the {@code fields} child of this {@link AClassDeclCG} node
	* @param methods_ the {@link NodeList} node for the {@code methods} child of this {@link AClassDeclCG} node
	* @param functions_ the {@link NodeList} node for the {@code functions} child of this {@link AClassDeclCG} node
	* @param traces_ the {@link NodeList} node for the {@code traces} child of this {@link AClassDeclCG} node
	* @param superName_ the {@link String} node for the {@code superName} child of this {@link AClassDeclCG} node
	* @param thread_ the {@link AThreadDeclCG} node for the {@code thread} child of this {@link AClassDeclCG} node
	* @param innerClasses_ the {@link NodeList} node for the {@code innerClasses} child of this {@link AClassDeclCG} node
	* @param interfaces_ the {@link NodeList} node for the {@code interfaces} child of this {@link AClassDeclCG} node
	* @param typeDecls_ the {@link NodeList} node for the {@code typeDecls} child of this {@link AClassDeclCG} node
	* @param perSyncs_ the {@link NodeList} node for the {@code perSyncs} child of this {@link AClassDeclCG} node
	* @param mutexSyncs_ the {@link NodeList} node for the {@code mutexSyncs} child of this {@link AClassDeclCG} node
	*/
	public AClassDeclCG(SourceNode sourceNode_, Object tag_, String package_, String access_, Boolean abstract_, Boolean static_, String name_, List<? extends AFieldDeclCG> fields_, List<? extends AMethodDeclCG> methods_, List<? extends AFuncDeclCG> functions_, List<? extends ANamedTraceDeclCG> traces_, String superName_, AThreadDeclCG thread_, List<? extends AClassDeclCG> innerClasses_, List<? extends AInterfaceDeclCG> interfaces_, List<? extends ATypeDeclCG> typeDecls_, List<? extends APersyncDeclCG> perSyncs_, List<? extends AMutexSyncDeclCG> mutexSyncs_)
	{
		super(sourceNode_,tag_);
		this.setPackage(package_);
		this.setAccess(access_);
		this.setAbstract(abstract_);
		this.setStatic(static_);
		this.setName(name_);
		this.setFields(fields_);
		this.setMethods(methods_);
		this.setFunctions(functions_);
		this.setTraces(traces_);
		this.setSuperName(superName_);
		this.setThread(thread_);
		this.setInnerClasses(innerClasses_);
		this.setInterfaces(interfaces_);
		this.setTypeDecls(typeDecls_);
		this.setPerSyncs(perSyncs_);
		this.setMutexSyncs(mutexSyncs_);

	}


	/**
	 * Creates a new {@link AClassDeclCG} node with no children.
	 */
	public AClassDeclCG()
	{

	}


	/**
	* Creates a new {@code AClassDeclCG TAG=class} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param package_ the {@link String} node for the {@code package} child of this {@link AClassDeclCG} node
	* @param access_ the {@link String} node for the {@code access} child of this {@link AClassDeclCG} node
	* @param abstract_ the {@link Boolean} node for the {@code abstract} child of this {@link AClassDeclCG} node
	* @param static_ the {@link Boolean} node for the {@code static} child of this {@link AClassDeclCG} node
	* @param name_ the {@link String} node for the {@code name} child of this {@link AClassDeclCG} node
	* @param fields_ the {@link NodeList} node for the {@code fields} child of this {@link AClassDeclCG} node
	* @param methods_ the {@link NodeList} node for the {@code methods} child of this {@link AClassDeclCG} node
	* @param functions_ the {@link NodeList} node for the {@code functions} child of this {@link AClassDeclCG} node
	* @param traces_ the {@link NodeList} node for the {@code traces} child of this {@link AClassDeclCG} node
	* @param superName_ the {@link String} node for the {@code superName} child of this {@link AClassDeclCG} node
	* @param thread_ the {@link AThreadDeclCG} node for the {@code thread} child of this {@link AClassDeclCG} node
	* @param innerClasses_ the {@link NodeList} node for the {@code innerClasses} child of this {@link AClassDeclCG} node
	* @param interfaces_ the {@link NodeList} node for the {@code interfaces} child of this {@link AClassDeclCG} node
	* @param typeDecls_ the {@link NodeList} node for the {@code typeDecls} child of this {@link AClassDeclCG} node
	* @param perSyncs_ the {@link NodeList} node for the {@code perSyncs} child of this {@link AClassDeclCG} node
	* @param mutexSyncs_ the {@link NodeList} node for the {@code mutexSyncs} child of this {@link AClassDeclCG} node
	*/
	public AClassDeclCG(SourceNode sourceNode_, String package_, String access_, Boolean abstract_, Boolean static_, String name_, List<? extends AFieldDeclCG> fields_, List<? extends AMethodDeclCG> methods_, List<? extends AFuncDeclCG> functions_, List<? extends ANamedTraceDeclCG> traces_, String superName_, AThreadDeclCG thread_, List<? extends AClassDeclCG> innerClasses_, List<? extends AInterfaceDeclCG> interfaces_, List<? extends ATypeDeclCG> typeDecls_, List<? extends APersyncDeclCG> perSyncs_, List<? extends AMutexSyncDeclCG> mutexSyncs_)
	{
		super(sourceNode_,null);
		this.setPackage(package_);
		this.setAccess(access_);
		this.setAbstract(abstract_);
		this.setStatic(static_);
		this.setName(name_);
		this.setFields(fields_);
		this.setMethods(methods_);
		this.setFunctions(functions_);
		this.setTraces(traces_);
		this.setSuperName(superName_);
		this.setThread(thread_);
		this.setInnerClasses(innerClasses_);
		this.setInterfaces(interfaces_);
		this.setTypeDecls(typeDecls_);
		this.setPerSyncs(perSyncs_);
		this.setMutexSyncs(mutexSyncs_);

	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AClassDeclCG} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AClassDeclCG} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AClassDeclCG} node
	 */
	public void removeChild(INode child)
	{
		if (this._fields.remove(child)) {
				return;
		}
		if (this._methods.remove(child)) {
				return;
		}
		if (this._functions.remove(child)) {
				return;
		}
		if (this._traces.remove(child)) {
				return;
		}
		if (this._thread == child) {
			this._thread = null;
			return;
		}

		if (this._innerClasses.remove(child)) {
				return;
		}
		if (this._interfaces.remove(child)) {
				return;
		}
		if (this._typeDecls.remove(child)) {
				return;
		}
		if (this._perSyncs.remove(child)) {
				return;
		}
		if (this._mutexSyncs.remove(child)) {
				return;
		}
		throw new RuntimeException("Not a child.");
	}



	public String toString()
	{
		return "" + _name;
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AClassDeclCG)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Creates a deep clone of this {@link AClassDeclCG} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AClassDeclCG} node
	 */
	public AClassDeclCG clone(Map<INode,INode> oldToNewMap)
	{
		AClassDeclCG node = new AClassDeclCG(
			_sourceNode,
			_tag,
			_package,
			_access,
			_abstract,
			_static,
			_name,
			cloneList(_fields, oldToNewMap),
			cloneList(_methods, oldToNewMap),
			cloneList(_functions, oldToNewMap),
			cloneList(_traces, oldToNewMap),
			_superName,
			cloneNode(_thread, oldToNewMap),
			cloneList(_innerClasses, oldToNewMap),
			cloneList(_interfaces, oldToNewMap),
			cloneList(_typeDecls, oldToNewMap),
			cloneList(_perSyncs, oldToNewMap),
			cloneList(_mutexSyncs, oldToNewMap)
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
		fields.put("_package",this._package);
		fields.put("_access",this._access);
		fields.put("_abstract",this._abstract);
		fields.put("_static",this._static);
		fields.put("_name",this._name);
		fields.put("_fields",this._fields);
		fields.put("_methods",this._methods);
		fields.put("_functions",this._functions);
		fields.put("_traces",this._traces);
		fields.put("_superName",this._superName);
		fields.put("_thread",this._thread);
		fields.put("_innerClasses",this._innerClasses);
		fields.put("_interfaces",this._interfaces);
		fields.put("_typeDecls",this._typeDecls);
		fields.put("_perSyncs",this._perSyncs);
		fields.put("_mutexSyncs",this._mutexSyncs);
		return fields;
	}


	/**
	 * Returns a deep clone of this {@link AClassDeclCG} node.
	 * @return a deep clone of this {@link AClassDeclCG} node
	 */
	public AClassDeclCG clone()
	{
		return new AClassDeclCG(
			_sourceNode,
			_tag,
			_package,
			_access,
			_abstract,
			_static,
			_name,
			cloneList(_fields),
			cloneList(_methods),
			cloneList(_functions),
			cloneList(_traces),
			_superName,
			cloneNode(_thread),
			cloneList(_innerClasses),
			cloneList(_interfaces),
			cloneList(_typeDecls),
			cloneList(_perSyncs),
			cloneList(_mutexSyncs)
		);
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
	 * Sets the {@code _package} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _package} child of this {@link AClassDeclCG} node
	*/
	public void setPackage(String value)
	{
		this._package = value;
	}


	/**
	 * @return the {@link String} node which is the {@code _package} child of this {@link AClassDeclCG} node
	*/
	public String getPackage()
	{
		return this._package;
	}


	/**
	 * Sets the {@code _access} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _access} child of this {@link AClassDeclCG} node
	*/
	public void setAccess(String value)
	{
		this._access = value;
	}


	/**
	 * @return the {@link String} node which is the {@code _access} child of this {@link AClassDeclCG} node
	*/
	public String getAccess()
	{
		return this._access;
	}


	/**
	 * Sets the {@code _abstract} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _abstract} child of this {@link AClassDeclCG} node
	*/
	public void setAbstract(Boolean value)
	{
		this._abstract = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _abstract} child of this {@link AClassDeclCG} node
	*/
	public Boolean getAbstract()
	{
		return this._abstract;
	}


	/**
	 * Sets the {@code _static} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _static} child of this {@link AClassDeclCG} node
	*/
	public void setStatic(Boolean value)
	{
		this._static = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _static} child of this {@link AClassDeclCG} node
	*/
	public Boolean getStatic()
	{
		return this._static;
	}


	/**
	 * Sets the {@code _name} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _name} child of this {@link AClassDeclCG} node
	*/
	public void setName(String value)
	{
		this._name = value;
	}


	/**
	 * @return the {@link String} node which is the {@code _name} child of this {@link AClassDeclCG} node
	*/
	public String getName()
	{
		return this._name;
	}


	/**
	 * Sets the {@code _fields} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _fields} child of this {@link AClassDeclCG} node
	*/
	public void setFields(List<? extends AFieldDeclCG> value)
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
	 * @return the {@link LinkedList} node which is the {@code _fields} child of this {@link AClassDeclCG} node
	*/
	public LinkedList<AFieldDeclCG> getFields()
	{
		return this._fields;
	}


	/**
	 * Sets the {@code _methods} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _methods} child of this {@link AClassDeclCG} node
	*/
	public void setMethods(List<? extends AMethodDeclCG> value)
	{
		if (this._methods.equals(value)) {
			return;
		}
		this._methods.clear();
		if (value != null) {
			this._methods.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _methods} child of this {@link AClassDeclCG} node
	*/
	public LinkedList<AMethodDeclCG> getMethods()
	{
		return this._methods;
	}


	/**
	 * Sets the {@code _functions} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _functions} child of this {@link AClassDeclCG} node
	*/
	public void setFunctions(List<? extends AFuncDeclCG> value)
	{
		if (this._functions.equals(value)) {
			return;
		}
		this._functions.clear();
		if (value != null) {
			this._functions.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _functions} child of this {@link AClassDeclCG} node
	*/
	public LinkedList<AFuncDeclCG> getFunctions()
	{
		return this._functions;
	}


	/**
	 * Sets the {@code _traces} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _traces} child of this {@link AClassDeclCG} node
	*/
	public void setTraces(List<? extends ANamedTraceDeclCG> value)
	{
		if (this._traces.equals(value)) {
			return;
		}
		this._traces.clear();
		if (value != null) {
			this._traces.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _traces} child of this {@link AClassDeclCG} node
	*/
	public LinkedList<ANamedTraceDeclCG> getTraces()
	{
		return this._traces;
	}


	/**
	 * Sets the {@code _superName} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _superName} child of this {@link AClassDeclCG} node
	*/
	public void setSuperName(String value)
	{
		this._superName = value;
	}


	/**
	 * @return the {@link String} node which is the {@code _superName} child of this {@link AClassDeclCG} node
	*/
	public String getSuperName()
	{
		return this._superName;
	}


	/**
	 * Sets the {@code _thread} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _thread} child of this {@link AClassDeclCG} node
	*/
	public void setThread(AThreadDeclCG value)
	{
		if (this._thread != null) {
			this._thread.parent(null);
		}
		if (value != null) {
			if (value.parent() != null) {
				value.parent().removeChild(value);
		}
			value.parent(this);
		}
		this._thread = value;

	}


	/**
	 * @return the {@link AThreadDeclCG} node which is the {@code _thread} child of this {@link AClassDeclCG} node
	*/
	public AThreadDeclCG getThread()
	{
		return this._thread;
	}


	/**
	 * Sets the {@code _innerClasses} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _innerClasses} child of this {@link AClassDeclCG} node
	*/
	public void setInnerClasses(List<? extends AClassDeclCG> value)
	{
		if (this._innerClasses.equals(value)) {
			return;
		}
		this._innerClasses.clear();
		if (value != null) {
			this._innerClasses.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _innerClasses} child of this {@link AClassDeclCG} node
	*/
	public LinkedList<AClassDeclCG> getInnerClasses()
	{
		return this._innerClasses;
	}


	/**
	 * Sets the {@code _interfaces} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _interfaces} child of this {@link AClassDeclCG} node
	*/
	public void setInterfaces(List<? extends AInterfaceDeclCG> value)
	{
		if (this._interfaces.equals(value)) {
			return;
		}
		this._interfaces.clear();
		if (value != null) {
			this._interfaces.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _interfaces} child of this {@link AClassDeclCG} node
	*/
	public LinkedList<AInterfaceDeclCG> getInterfaces()
	{
		return this._interfaces;
	}


	/**
	 * Sets the {@code _typeDecls} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _typeDecls} child of this {@link AClassDeclCG} node
	*/
	public void setTypeDecls(List<? extends ATypeDeclCG> value)
	{
		if (this._typeDecls.equals(value)) {
			return;
		}
		this._typeDecls.clear();
		if (value != null) {
			this._typeDecls.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _typeDecls} child of this {@link AClassDeclCG} node
	*/
	public LinkedList<ATypeDeclCG> getTypeDecls()
	{
		return this._typeDecls;
	}


	/**
	 * Sets the {@code _perSyncs} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _perSyncs} child of this {@link AClassDeclCG} node
	*/
	public void setPerSyncs(List<? extends APersyncDeclCG> value)
	{
		if (this._perSyncs.equals(value)) {
			return;
		}
		this._perSyncs.clear();
		if (value != null) {
			this._perSyncs.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _perSyncs} child of this {@link AClassDeclCG} node
	*/
	public LinkedList<APersyncDeclCG> getPerSyncs()
	{
		return this._perSyncs;
	}


	/**
	 * Sets the {@code _mutexSyncs} child of this {@link AClassDeclCG} node.
	 * @param value the new {@code _mutexSyncs} child of this {@link AClassDeclCG} node
	*/
	public void setMutexSyncs(List<? extends AMutexSyncDeclCG> value)
	{
		if (this._mutexSyncs.equals(value)) {
			return;
		}
		this._mutexSyncs.clear();
		if (value != null) {
			this._mutexSyncs.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _mutexSyncs} child of this {@link AClassDeclCG} node
	*/
	public LinkedList<AMutexSyncDeclCG> getMutexSyncs()
	{
		return this._mutexSyncs;
	}


	/**
	* Calls the {@link IAnalysis#caseAClassDeclCG(AClassDeclCG)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AClassDeclCG} node is applied
	*/
	@Override
	public void apply(IAnalysis analysis) throws AnalysisException
	{
		analysis.caseAClassDeclCG(this);
	}


	/**
	* Calls the {@link IAnswer#caseAClassDeclCG(AClassDeclCG)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AClassDeclCG} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAClassDeclCG(this);
	}


	/**
	* Calls the {@link IQuestion#caseAClassDeclCG(AClassDeclCG)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AClassDeclCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAClassDeclCG(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAClassDeclCG(AClassDeclCG)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AClassDeclCG} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAClassDeclCG(this,question);
	}



}
