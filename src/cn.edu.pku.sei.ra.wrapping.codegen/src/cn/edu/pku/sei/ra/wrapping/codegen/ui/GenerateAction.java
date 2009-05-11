/**
 * Copyright (c) 2008, Song Hui, Peking University, All rights
 * reserved.
 */
package cn.edu.pku.sei.ra.wrapping.codegen.ui;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import cn.edu.pku.sei.ra.wrapping.codegen.generator.Generator;
import cn.edu.pku.sei.ra.wrapping.codegen.genmodel.generator.GenBaseGeneratorAdapter;
import cn.edu.pku.sei.ra.wrapping.codegen.genmodel.generator.GenModelGeneratorAdapterFactory;
import cn.edu.pku.sei.ra.wrapping.codegen.util.GenEnvironment;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode;

/**
 * 
 */
public class GenerateAction implements IWorkbenchWindowActionDelegate {
	IWorkbenchWindow window;
	Decoration decoration;
	/**
	 * 
	 */
	public GenerateAction() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#dispose()
	 */
	public void dispose() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
		this.window=window;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
//		//for test
//		
		//		EClass clazz=(EClass)pack.getEClassifier("SessionBean");
//		GenEnvironment.init(decoration.getGenModel(), pack, decoration);
//		SpecCode sc=GenEnvironment.eINSTANCE.retrieveSpecCode(clazz, "jndiName",GenEnvironment.SET);
//		MessageDialog.openInformation(null, "hey", sc.getCode().getCode());
//		//end for test
		GenModel genModel=decoration.getGenModel();
		EPackage pack=genModel.getGenPackages().get(0).getEcorePackage();
		GenEnvironment.init(decoration.getGenModel(), pack, decoration);
		
		genModel.setCanGenerate(true);
		Generator gen=new Generator();
		gen.getAdapterFactoryDescriptorRegistry().addDescriptor(
				GenModelPackage.eNS_URI,
				GenModelGeneratorAdapterFactory.DESCRIPTOR);
		gen.setInput(genModel);
		Monitor monitor=new BasicMonitor();
		gen.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,"model project", monitor);
		MessageDialog.openInformation(null, "Done", "Generation done!");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		try{
			decoration=(Decoration)((TreeSelection)selection).getFirstElement();
			action.setEnabled(true);
		}
		catch(Exception e){
			action.setEnabled(false);
		}
	}

}
