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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

public class InstallerWizard extends Wizard implements INewWizard {

	/**
	 * Constructor for InstallerWizard.
	 */
	public InstallerWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	@Override
	public String getWindowTitle() {
		return "Eclipse Installer";
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		addPage(new InstallerWizardSelectPackagePage());
		addPage(new InstallerWizardPreferencesPage());
		addPage(new InstallerWizardLauncherConfigurationPage());
		addPage(new InstallerWizardRegisterPage());
	}

	public boolean performFinish() {
		return true;
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}
}