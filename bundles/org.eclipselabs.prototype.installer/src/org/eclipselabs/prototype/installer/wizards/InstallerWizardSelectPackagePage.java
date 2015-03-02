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
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Link;

public class InstallerWizardSelectPackagePage extends WizardPage {

	private static String[][] packages = {
		{"Eclipse IDE for Java Developers", "The essential tools for any Java developer, including a Java IDE, a CVS client, Git client, XML Editor, Mylyn, Maven integration and WindowBuilder."},
		{"Eclipse IDE for Java EE Developers", "Tools for Java developers creating Java EE and Web applications, including a Java IDE, tools for Java EE, JPA, JSF, Mylyn, EGit and others."},
		{"Eclipse IDE for PHP Developers", "The essential tools for any PHP developer, including PHP language support, Git client, Mylyn and editors for JavaScript, HTML, CSS and XML."}
	};
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public InstallerWizardSelectPackagePage() {
		super("wizardPage");
		setTitle("Select Package");
		setDescription("Select the package that you'd like to install.");
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
		
		int count = 0;
		for(String[] value : packages) {
			createPackageControl(container, value[0], value[1], count++ == 0);
		}
		
		container.pack();
		setControl(container);
	}

	private void createPackageControl(Composite container, String string, String text, boolean selected) {
		Button button = new Button(container, SWT.RADIO);
		button.setText(string);
		button.setSelection(selected);
		StyledText styledText = new StyledText(container, SWT.WRAP | SWT.READ_ONLY);
		styledText.setBackground(container.getBackground());
		styledText.setText(text);
		GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
		layoutData.widthHint = 100;
		layoutData.horizontalIndent = 20;
		styledText.setLayoutData(layoutData);
		Link link = new Link(container, SWT.NONE);
		link.setText("<a>More information...</a>");
		link.setLayoutData(layoutData);
	}

}