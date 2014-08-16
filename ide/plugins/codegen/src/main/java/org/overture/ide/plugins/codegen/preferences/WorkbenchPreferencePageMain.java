/*
 * #%~
 * Code Generator Plugin
 * %%
 * Copyright (C) 2008 - 2014 Overture
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #~%
 */
package org.overture.ide.plugins.codegen.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.overture.ide.plugins.codegen.Activator;
import org.overture.ide.plugins.codegen.ICodeGenConstants;

public class WorkbenchPreferencePageMain extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage
{

	@Override
	protected void createFieldEditors()
	{
		addField(new BooleanFieldEditor(ICodeGenConstants.GENERATE_CHAR_SEQUENCES_AS_STRINGS, "Generate character sequences as strings", getFieldEditorParent()));
		addField(new BooleanFieldEditor(ICodeGenConstants.DISABLE_CLONING, "Disable cloning", getFieldEditorParent()));
		
	}

	@Override
	protected IPreferenceStore doGetPreferenceStore()
	{
		return Activator.getDefault().getPreferenceStore();
	}

	@Override
	protected void performDefaults()
	{
		IPreferenceStore store = getPreferenceStore();
		store.setDefault(ICodeGenConstants.GENERATE_CHAR_SEQUENCES_AS_STRINGS, ICodeGenConstants.GENERATE_CHAR_SEQUENCES_AS_STRING_DEFAULT);
		store.setDefault(ICodeGenConstants.DISABLE_CLONING, ICodeGenConstants.DISABLE_CLONING_DEFAULT);
		super.performDefaults();
	}

	public void init(IWorkbench workbench)
	{
		IPreferenceStore store = getPreferenceStore();
		store.setDefault(ICodeGenConstants.GENERATE_CHAR_SEQUENCES_AS_STRINGS, ICodeGenConstants.GENERATE_CHAR_SEQUENCES_AS_STRING_DEFAULT);
		store.setDefault(ICodeGenConstants.DISABLE_CLONING, ICodeGenConstants.DISABLE_CLONING_DEFAULT);
	}

}
