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
package org.eclipselabs.prototype.installer.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipselabs.prototype.installer.wizards.InstallerWizard;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class InstallWizardHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public InstallWizardHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWizard wizard = new InstallerWizard();
		WizardDialog wd = new WizardDialog(Display.getDefault().getActiveShell(), wizard);
		wd.setTitle(wizard.getWindowTitle());
		wd.open();
		return null;
	}
}
