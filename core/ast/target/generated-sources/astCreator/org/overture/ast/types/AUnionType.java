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

package org.overture.ast.types;


import org.overture.ast.definitions.PDefinition;
import java.util.HashMap;
import org.overture.ast.util.Utils;
import java.lang.Integer;
import org.overture.ast.types.AProductType;
import org.overture.ast.analysis.intf.IAnswer;
import java.util.Map;
import org.overture.ast.types.PTypeBase;
import java.lang.Boolean;
import org.overture.ast.types.ASetType;
import org.overture.ast.node.INode;
import org.overture.ast.analysis.intf.IQuestion;
import org.overture.ast.node.GraphNodeList;
import java.lang.String;
import java.util.LinkedList;
import org.overture.ast.analysis.intf.IQuestionAnswer;
import org.overture.ast.types.SNumericBasicType;
import org.overture.ast.types.SMapType;
import org.overture.ast.types.ARecordInvariantType;
import org.overture.ast.types.SSeqType;
import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.intf.lex.ILexLocation;
import java.util.List;
import org.overture.ast.types.AUnionType;
import org.overture.ast.types.PType;
import org.overture.ast.types.AClassType;
import org.overture.ast.analysis.intf.IAnalysis;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
public class AUnionType extends PTypeBase
{
	private static final long serialVersionUID = 1L;

	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private GraphNodeList<PType> _types = new GraphNodeList<PType>(this);
	private Boolean _infinite;
	private Boolean _expanded;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private Boolean _seqDone;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private SSeqType _seqType;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private Boolean _setDone;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private ASetType _setType;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private Boolean _mapDone;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private SMapType _mapType;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private Integer _prodCard;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private AProductType _prodType;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private Boolean _funcDone;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private PType _funcType;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private Boolean _opDone;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private PType _opType;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private Boolean _numDone;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private SNumericBasicType _numType;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private Boolean _recDone;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private ARecordInvariantType _recType;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private Boolean _classDone;
	/**
	* Graph field, parent will not be removed when added and parent 
	*  of this field may not be this node. Also excluded for visitor.
	*/
	private AClassType _classType;

	/**
	 * Creates a new {@link AUnionType} node with no children.
	 */
	public AUnionType()
	{

	}


	/**
	* Creates a new {@code AUnionType TAG=union} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param infinite_ the {@link Boolean} node for the {@code infinite} child of this {@link AUnionType} node
	* @param expanded_ the {@link Boolean} node for the {@code expanded} child of this {@link AUnionType} node
	*/
	public AUnionType(ILexLocation location_, Boolean resolved_, Boolean infinite_, Boolean expanded_)
	{
		super(location_,resolved_,null);
		this.setInfinite(infinite_);
		this.setExpanded(expanded_);
		this.setSeqDone(false);
		this.setSetDone(false);
		this.setMapDone(false);
		this.setProdCard(0);
		this.setFuncDone(false);
		this.setOpDone(false);
		this.setNumDone(false);
		this.setRecDone(false);
		this.setClassDone(false);

	}


	/**
	* Creates a new {@code AUnionType} node with the given nodes as children.
	* @deprecated This method should not be used, use AstFactory instead.
	* The basic child nodes are removed from their previous parents.
	* @param types_ the {@link GraphNodeList} <b>graph</a> node for the {@code types} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code types } will not be changed by adding it to this node.</i>
	* @param infinite_ the {@link Boolean} node for the {@code infinite} child of this {@link AUnionType} node
	* @param expanded_ the {@link Boolean} node for the {@code expanded} child of this {@link AUnionType} node
	* @param seqDone_ the {@link Boolean} <b>graph</a> node for the {@code seqDone} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code seqDone } will not be changed by adding it to this node.</i>
	* @param seqType_ the {@link SSeqType} <b>graph</a> node for the {@code seqType} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code seqType } will not be changed by adding it to this node.</i>
	* @param setDone_ the {@link Boolean} <b>graph</a> node for the {@code setDone} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code setDone } will not be changed by adding it to this node.</i>
	* @param setType_ the {@link ASetType} <b>graph</a> node for the {@code setType} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code setType } will not be changed by adding it to this node.</i>
	* @param mapDone_ the {@link Boolean} <b>graph</a> node for the {@code mapDone} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code mapDone } will not be changed by adding it to this node.</i>
	* @param mapType_ the {@link SMapType} <b>graph</a> node for the {@code mapType} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code mapType } will not be changed by adding it to this node.</i>
	* @param prodCard_ the {@link Integer} <b>graph</a> node for the {@code prodCard} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code prodCard } will not be changed by adding it to this node.</i>
	* @param prodType_ the {@link AProductType} <b>graph</a> node for the {@code prodType} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code prodType } will not be changed by adding it to this node.</i>
	* @param funcDone_ the {@link Boolean} <b>graph</a> node for the {@code funcDone} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code funcDone } will not be changed by adding it to this node.</i>
	* @param funcType_ the {@link PType} <b>graph</a> node for the {@code funcType} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code funcType } will not be changed by adding it to this node.</i>
	* @param opDone_ the {@link Boolean} <b>graph</a> node for the {@code opDone} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code opDone } will not be changed by adding it to this node.</i>
	* @param opType_ the {@link PType} <b>graph</a> node for the {@code opType} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code opType } will not be changed by adding it to this node.</i>
	* @param numDone_ the {@link Boolean} <b>graph</a> node for the {@code numDone} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code numDone } will not be changed by adding it to this node.</i>
	* @param numType_ the {@link SNumericBasicType} <b>graph</a> node for the {@code numType} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code numType } will not be changed by adding it to this node.</i>
	* @param recDone_ the {@link Boolean} <b>graph</a> node for the {@code recDone} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code recDone } will not be changed by adding it to this node.</i>
	* @param recType_ the {@link ARecordInvariantType} <b>graph</a> node for the {@code recType} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code recType } will not be changed by adding it to this node.</i>
	* @param classDone_ the {@link Boolean} <b>graph</a> node for the {@code classDone} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code classDone } will not be changed by adding it to this node.</i>
	* @param classType_ the {@link AClassType} <b>graph</a> node for the {@code classType} child of this {@link AUnionType} node.
	*  <i>The parent of this {@code classType } will not be changed by adding it to this node.</i>
	*/
	public AUnionType(ILexLocation location_, Boolean resolved_, List<? extends PDefinition> definitions_, List<? extends PType> types_, Boolean infinite_, Boolean expanded_, Boolean seqDone_, SSeqType seqType_, Boolean setDone_, ASetType setType_, Boolean mapDone_, SMapType mapType_, Integer prodCard_, AProductType prodType_, Boolean funcDone_, PType funcType_, Boolean opDone_, PType opType_, Boolean numDone_, SNumericBasicType numType_, Boolean recDone_, ARecordInvariantType recType_, Boolean classDone_, AClassType classType_)
	{
		super(location_,resolved_,definitions_);
		this.setTypes(types_);
		this.setInfinite(infinite_);
		this.setExpanded(expanded_);
		this.setSeqDone(seqDone_);
		this.setSeqType(seqType_);
		this.setSetDone(setDone_);
		this.setSetType(setType_);
		this.setMapDone(mapDone_);
		this.setMapType(mapType_);
		this.setProdCard(prodCard_);
		this.setProdType(prodType_);
		this.setFuncDone(funcDone_);
		this.setFuncType(funcType_);
		this.setOpDone(opDone_);
		this.setOpType(opType_);
		this.setNumDone(numDone_);
		this.setNumType(numType_);
		this.setRecDone(recDone_);
		this.setRecType(recType_);
		this.setClassDone(classDone_);
		this.setClassType(classType_);

	}


	/**
	 * Creates a deep clone of this {@link AUnionType} node while putting all
	 * old node-new node relations in the map {@code oldToNewMap}.
	 * @param oldToNewMap the map filled with the old node-new node relation
	 * @return a deep clone of this {@link AUnionType} node
	 */
	public AUnionType clone(Map<INode,INode> oldToNewMap)
	{
		AUnionType node = new AUnionType(
			_location,
			_resolved,
			_definitions,
			_types,
			_infinite,
			_expanded,
			_seqDone,
			_seqType,
			_setDone,
			_setType,
			_mapDone,
			_mapType,
			_prodCard,
			_prodType,
			_funcDone,
			_funcType,
			_opDone,
			_opType,
			_numDone,
			_numType,
			_recDone,
			_recType,
			_classDone,
			_classType
		);
		oldToNewMap.put(this, node);
		return node;
	}


	/**
	 * Removes the {@link INode} {@code child} as a child of this {@link AUnionType} node.
	 * Do not call this method with any graph fields of this node. This will cause any child's
	 * with the same reference to be removed unintentionally or {@link RuntimeException}will be thrown.
	 * @param child the child node to be removed from this {@link AUnionType} node
	 * @throws RuntimeException if {@code child} is not a child of this {@link AUnionType} node
	 */
	public void removeChild(INode child)
	{
		if (this._definitions.contains(child)) {
			return;
		}

		if (this._types.contains(child)) {
			return;
		}

		if (this._seqType == child) {
			return;
		}

		if (this._setType == child) {
			return;
		}

		if (this._mapType == child) {
			return;
		}

		if (this._prodType == child) {
			return;
		}

		if (this._funcType == child) {
			return;
		}

		if (this._opType == child) {
			return;
		}

		if (this._numType == child) {
			return;
		}

		if (this._recType == child) {
			return;
		}

		if (this._classType == child) {
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
		fields.put("_types",this._types);
		fields.put("_infinite",this._infinite);
		fields.put("_expanded",this._expanded);
		fields.put("_seqDone",this._seqDone);
		fields.put("_seqType",this._seqType);
		fields.put("_setDone",this._setDone);
		fields.put("_setType",this._setType);
		fields.put("_mapDone",this._mapDone);
		fields.put("_mapType",this._mapType);
		fields.put("_prodCard",this._prodCard);
		fields.put("_prodType",this._prodType);
		fields.put("_funcDone",this._funcDone);
		fields.put("_funcType",this._funcType);
		fields.put("_opDone",this._opDone);
		fields.put("_opType",this._opType);
		fields.put("_numDone",this._numDone);
		fields.put("_numType",this._numType);
		fields.put("_recDone",this._recDone);
		fields.put("_recType",this._recType);
		fields.put("_classDone",this._classDone);
		fields.put("_classType",this._classType);
		return fields;
	}


	/**
	* Essentially this.toString().equals(o.toString()).
	**/
	@Override
	public boolean equals(Object o)
	{
		if (o != null && o instanceof AUnionType)		{
			 return toString().equals(o.toString());
		}
		return false;
	}


	/**
	 * Returns a deep clone of this {@link AUnionType} node.
	 * @return a deep clone of this {@link AUnionType} node
	 */
	public AUnionType clone()
	{
		return new AUnionType(
			_location,
			_resolved,
			_definitions,
			_types,
			_infinite,
			_expanded,
			_seqDone,
			_seqType,
			_setDone,
			_setType,
			_mapDone,
			_mapType,
			_prodCard,
			_prodType,
			_funcDone,
			_funcType,
			_opDone,
			_opType,
			_numDone,
			_numType,
			_recDone,
			_recType,
			_classDone,
			_classType
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



	public String toString()
	{
		return "" + ""+(_types.size() == 1?_types.iterator().next().toString() : Utils.setToString(_types, " | "));
	}


	/**
	 * Sets the {@code _types} child of this {@link AUnionType} node.
	 * @param value the new {@code _types} child of this {@link AUnionType} node
	*/
	public void setTypes(List<? extends PType> value)
	{
		if (this._types.equals(value)) {
			return;
		}
		this._types.clear();
		if (value != null) {
			this._types.addAll(value);
		}

	}


	/**
	 * @return the {@link LinkedList} node which is the {@code _types} child of this {@link AUnionType} node
	*/
	public LinkedList<PType> getTypes()
	{
		return this._types;
	}


	/**
	 * Sets the {@code _infinite} child of this {@link AUnionType} node.
	 * @param value the new {@code _infinite} child of this {@link AUnionType} node
	*/
	public void setInfinite(Boolean value)
	{
		this._infinite = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _infinite} child of this {@link AUnionType} node
	*/
	public Boolean getInfinite()
	{
		return this._infinite;
	}


	/**
	 * Sets the {@code _expanded} child of this {@link AUnionType} node.
	 * @param value the new {@code _expanded} child of this {@link AUnionType} node
	*/
	public void setExpanded(Boolean value)
	{
		this._expanded = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _expanded} child of this {@link AUnionType} node
	*/
	public Boolean getExpanded()
	{
		return this._expanded;
	}


	/**
	 * Sets the {@code _seqDone} child of this {@link AUnionType} node.
	 * @param value the new {@code _seqDone} child of this {@link AUnionType} node
	*/
	public void setSeqDone(Boolean value)
	{
		this._seqDone = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _seqDone} child of this {@link AUnionType} node
	*/
	public Boolean getSeqDone()
	{
		return this._seqDone;
	}


	/**
	 * Sets the {@code _seqType} child of this {@link AUnionType} node.
	 * @param value the new {@code _seqType} child of this {@link AUnionType} node
	*/
	public void setSeqType(SSeqType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._seqType = value;

	}


	/**
	 * @return the {@link SSeqType} node which is the {@code _seqType} child of this {@link AUnionType} node
	*/
	public SSeqType getSeqType()
	{
		return this._seqType;
	}


	/**
	 * Sets the {@code _setDone} child of this {@link AUnionType} node.
	 * @param value the new {@code _setDone} child of this {@link AUnionType} node
	*/
	public void setSetDone(Boolean value)
	{
		this._setDone = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _setDone} child of this {@link AUnionType} node
	*/
	public Boolean getSetDone()
	{
		return this._setDone;
	}


	/**
	 * Sets the {@code _setType} child of this {@link AUnionType} node.
	 * @param value the new {@code _setType} child of this {@link AUnionType} node
	*/
	public void setSetType(ASetType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._setType = value;

	}


	/**
	 * @return the {@link ASetType} node which is the {@code _setType} child of this {@link AUnionType} node
	*/
	public ASetType getSetType()
	{
		return this._setType;
	}


	/**
	 * Sets the {@code _mapDone} child of this {@link AUnionType} node.
	 * @param value the new {@code _mapDone} child of this {@link AUnionType} node
	*/
	public void setMapDone(Boolean value)
	{
		this._mapDone = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _mapDone} child of this {@link AUnionType} node
	*/
	public Boolean getMapDone()
	{
		return this._mapDone;
	}


	/**
	 * Sets the {@code _mapType} child of this {@link AUnionType} node.
	 * @param value the new {@code _mapType} child of this {@link AUnionType} node
	*/
	public void setMapType(SMapType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._mapType = value;

	}


	/**
	 * @return the {@link SMapType} node which is the {@code _mapType} child of this {@link AUnionType} node
	*/
	public SMapType getMapType()
	{
		return this._mapType;
	}


	/**
	 * Sets the {@code _prodCard} child of this {@link AUnionType} node.
	 * @param value the new {@code _prodCard} child of this {@link AUnionType} node
	*/
	public void setProdCard(Integer value)
	{
		this._prodCard = value;
	}


	/**
	 * @return the {@link Integer} node which is the {@code _prodCard} child of this {@link AUnionType} node
	*/
	public Integer getProdCard()
	{
		return this._prodCard;
	}


	/**
	 * Sets the {@code _prodType} child of this {@link AUnionType} node.
	 * @param value the new {@code _prodType} child of this {@link AUnionType} node
	*/
	public void setProdType(AProductType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._prodType = value;

	}


	/**
	 * @return the {@link AProductType} node which is the {@code _prodType} child of this {@link AUnionType} node
	*/
	public AProductType getProdType()
	{
		return this._prodType;
	}


	/**
	 * Sets the {@code _funcDone} child of this {@link AUnionType} node.
	 * @param value the new {@code _funcDone} child of this {@link AUnionType} node
	*/
	public void setFuncDone(Boolean value)
	{
		this._funcDone = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _funcDone} child of this {@link AUnionType} node
	*/
	public Boolean getFuncDone()
	{
		return this._funcDone;
	}


	/**
	 * Sets the {@code _funcType} child of this {@link AUnionType} node.
	 * @param value the new {@code _funcType} child of this {@link AUnionType} node
	*/
	public void setFuncType(PType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._funcType = value;

	}


	/**
	 * @return the {@link PType} node which is the {@code _funcType} child of this {@link AUnionType} node
	*/
	public PType getFuncType()
	{
		return this._funcType;
	}


	/**
	 * Sets the {@code _opDone} child of this {@link AUnionType} node.
	 * @param value the new {@code _opDone} child of this {@link AUnionType} node
	*/
	public void setOpDone(Boolean value)
	{
		this._opDone = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _opDone} child of this {@link AUnionType} node
	*/
	public Boolean getOpDone()
	{
		return this._opDone;
	}


	/**
	 * Sets the {@code _opType} child of this {@link AUnionType} node.
	 * @param value the new {@code _opType} child of this {@link AUnionType} node
	*/
	public void setOpType(PType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._opType = value;

	}


	/**
	 * @return the {@link PType} node which is the {@code _opType} child of this {@link AUnionType} node
	*/
	public PType getOpType()
	{
		return this._opType;
	}


	/**
	 * Sets the {@code _numDone} child of this {@link AUnionType} node.
	 * @param value the new {@code _numDone} child of this {@link AUnionType} node
	*/
	public void setNumDone(Boolean value)
	{
		this._numDone = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _numDone} child of this {@link AUnionType} node
	*/
	public Boolean getNumDone()
	{
		return this._numDone;
	}


	/**
	 * Sets the {@code _numType} child of this {@link AUnionType} node.
	 * @param value the new {@code _numType} child of this {@link AUnionType} node
	*/
	public void setNumType(SNumericBasicType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._numType = value;

	}


	/**
	 * @return the {@link SNumericBasicType} node which is the {@code _numType} child of this {@link AUnionType} node
	*/
	public SNumericBasicType getNumType()
	{
		return this._numType;
	}


	/**
	 * Sets the {@code _recDone} child of this {@link AUnionType} node.
	 * @param value the new {@code _recDone} child of this {@link AUnionType} node
	*/
	public void setRecDone(Boolean value)
	{
		this._recDone = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _recDone} child of this {@link AUnionType} node
	*/
	public Boolean getRecDone()
	{
		return this._recDone;
	}


	/**
	 * Sets the {@code _recType} child of this {@link AUnionType} node.
	 * @param value the new {@code _recType} child of this {@link AUnionType} node
	*/
	public void setRecType(ARecordInvariantType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._recType = value;

	}


	/**
	 * @return the {@link ARecordInvariantType} node which is the {@code _recType} child of this {@link AUnionType} node
	*/
	public ARecordInvariantType getRecType()
	{
		return this._recType;
	}


	/**
	 * Sets the {@code _classDone} child of this {@link AUnionType} node.
	 * @param value the new {@code _classDone} child of this {@link AUnionType} node
	*/
	public void setClassDone(Boolean value)
	{
		this._classDone = value;
	}


	/**
	 * @return the {@link Boolean} node which is the {@code _classDone} child of this {@link AUnionType} node
	*/
	public Boolean getClassDone()
	{
		return this._classDone;
	}


	/**
	 * Sets the {@code _classType} child of this {@link AUnionType} node.
	 * @param value the new {@code _classType} child of this {@link AUnionType} node
	*/
	public void setClassType(AClassType value)
	{
		if( value != null && value.parent() == null) {
			value.parent(this);
		}
		this._classType = value;

	}


	/**
	 * @return the {@link AClassType} node which is the {@code _classType} child of this {@link AUnionType} node
	*/
	public AClassType getClassType()
	{
		return this._classType;
	}


	/**
	* Calls the {@link IAnalysis#caseAUnionType(AUnionType)} of the {@link IAnalysis} {@code caller}.
	* @param caller the {@link IAnalysis} to which this {@link AUnionType} node is applied
	*/
	@Override
	public void apply(IAnalysis caller) throws AnalysisException
	{
		caller.caseAUnionType(this);
	}


	/**
	* Calls the {@link IAnswer#caseAUnionType(AUnionType)} of the {@link IAnswer} {@code caller}.
	* @param caller the {@link IAnswer} to which this {@link AUnionType} node is applied
	*/
	@Override
	public <A> A apply(IAnswer<A> caller) throws AnalysisException
	{
		return caller.caseAUnionType(this);
	}


	/**
	* Calls the {@link IQuestion#caseAUnionType(AUnionType, Object)} of the {@link IQuestion} {@code caller}.
	* @param caller the {@link IQuestion} to which this {@link AUnionType} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q> void apply(IQuestion<Q> caller, Q question) throws AnalysisException
	{
		caller.caseAUnionType(this,question);
	}


	/**
	* Calls the {@link IQuestionAnswer#caseAUnionType(AUnionType, Object)} of the {@link IQuestionAnswer} {@code caller}.
	* @param caller the {@link IQuestionAnswer} to which this {@link AUnionType} node is applied
	* @param question the question provided to {@code caller}
	*/
	@Override
	public <Q, A> A apply(IQuestionAnswer<Q, A> caller, Q question) throws AnalysisException
	{
		return caller.caseAUnionType(this,question);
	}



}
