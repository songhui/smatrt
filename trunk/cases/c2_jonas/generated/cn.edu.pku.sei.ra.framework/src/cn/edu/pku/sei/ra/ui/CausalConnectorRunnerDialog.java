/**
 * Copyright (c) 2008, Song Hui, Peking University, All rights
 * reserved.
 */
package cn.edu.pku.sei.ra.ui;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import cn.edu.pku.sei.ra.framework.CausalConnector;

/**
 * 
 */
public class CausalConnectorRunnerDialog extends Dialog {
	
	public static ArrayList<CausalConnector> causalConnectors=
		new ArrayList<CausalConnector>();
	
	private ArrayList<Text> comments=new ArrayList<Text>();
	private ArrayList<Button> buttons=new ArrayList<Button>();
	
	

	/**
	 * @param parentShell
	 */
	public CausalConnectorRunnerDialog(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parentShell
	 */
	public CausalConnectorRunnerDialog(IShellProvider parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}
	
	protected Control createDialogArea(Composite parent){
		parent=(Composite)super.createDialogArea(parent);
		return parent;
		
	}

}
