/*******************************************************************************
 * Copyright (c) 2015 The Eclipse Foundation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Wayne Beaton - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.prototype.installer.wizards;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class InstallerWizardPreferencesPage extends WizardPage {

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public InstallerWizardPreferencesPage() {
		super("wizardPage");
		setTitle("Default Preferences");
		setDescription("Customize Eclipse settings (you can change these in the preferences later).");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 9;
		
		createPreferenceOption(container, "Set default encoding to UTF-8", true);
		createPreferenceOption(container, "Automatically refresh workspace.", true);
		createPreferenceOption(container, "Check for updates on startup.", false);
		createPreferenceOption(container, "Show line numbers in text editors.", false);

		setControl(container);
	}

	private void createPreferenceOption(Composite container, String string, boolean selected) {
		Button button = new Button(container, SWT.CHECK);
		button.setText(string);
		button.setSelection(selected);
	}

}