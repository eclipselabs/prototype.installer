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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class InstallerWizardLauncherConfigurationPage extends WizardPage {

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public InstallerWizardLauncherConfigurationPage() {
		super("wizardPage");
		setTitle("Launcher");
		setDescription("Launcher icon and configuration.");
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
		
		createPreferenceOption(container, "Always ask for workspace location", true);
		addWorkspaceLocationControls(container);
		createPreferenceOption(container, "Create a launcher icon in the start menu.", true);
		createPreferenceOption(container, "Add a shortcut on the desktop.", false);
		
		setControl(container);
	}

	private void createPreferenceOption(Composite container, String string, boolean selection) {
		Button button = new Button(container, SWT.CHECK);
		button.setText(string);
		button.setSelection(selection);
	}

	private void addWorkspaceLocationControls(Composite parent) {
		Composite panel = new Composite(parent, SWT.NONE);
		panel.setLayout(new GridLayout(3, false));
		panel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		new Label(panel, SWT.NONE).setText("Workspace location:");
		Text text = new Text(panel, SWT.BORDER);
		text.setText("~/workspace");
		text.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		new Button(panel, SWT.PUSH).setText("Browse...");		
	}

}