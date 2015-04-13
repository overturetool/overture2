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

package org.overture.pof.analysis;


import org.overture.ast.analysis.AnalysisException;
import org.overture.ast.analysis.intf.IAnswer;
import org.overture.pof.analysis.intf.IPOFAnswer;
import org.overture.pof.analysis.intf.IPOFAnalysis;
import org.overture.ast.analysis.AnswerAdaptor;
import org.overture.pof.PPoTree;
import org.overture.pof.AVdmPoTree;


/**
* Generated file by AST Creator
* @author Kenneth Lausdahl
*
*/
@SuppressWarnings({"all"})
public abstract class AnswerPOFAdaptor<A> extends AnswerAdaptor<A> implements IPOFAnswer<A>
{
	private static final long serialVersionUID = 1L;


	/**
	* Creates a new {@code AnswerPOFAdaptor} node with the given nodes as children.
	* The basic child nodes are removed from their previous parents.
	*/
	public AnswerPOFAdaptor(IAnswer<A> THIS_)
	{
		super(THIS_);

	}


	/**
	 * Creates a new {@link AnswerPOFAdaptor} node with no children.
	 */
	public AnswerPOFAdaptor()
	{

	}


	/**
	* Called by the {@link PPoTree} node from {@link PPoTree#apply(IPOFAnalysis)}.
	* @param node the calling {@link PPoTree} node
	*/
	public A defaultPPoTree(PPoTree node) throws AnalysisException
	{
		return defaultINode(node);
	}


	/**
	* Called by the {@link AVdmPoTree} node from {@link AVdmPoTree#apply(IPOFAnalysis)}.
	* @param node the calling {@link AVdmPoTree} node
	*/
	public A caseAVdmPoTree(AVdmPoTree node) throws AnalysisException
	{
		return defaultPPoTree(node);
	}



}
