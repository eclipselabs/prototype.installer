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
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;

public class InstallerWizardRegisterPage extends WizardPage {

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public InstallerWizardRegisterPage() {
		super("wizardPage");
		setTitle("Register");
		setDescription("Optionally register with The Eclipse Foundation.");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		
		new Label(container, SWT.NONE).setText("Name:");
		new Text(container, SWT.BORDER).setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		new Label(container, SWT.NONE).setText("Email:");
		new Text(container, SWT.BORDER).setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

		new Label(container, SWT.NONE).setText("Password:");
		new Text(container, SWT.BORDER).setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		new Label(container, SWT.NONE).setText("Repeat password:");
		new Text(container, SWT.BORDER).setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		new Link(container, SWT.NONE).setText("<a>Privacy Policy</a>");
		
		setControl(container);
	}

}