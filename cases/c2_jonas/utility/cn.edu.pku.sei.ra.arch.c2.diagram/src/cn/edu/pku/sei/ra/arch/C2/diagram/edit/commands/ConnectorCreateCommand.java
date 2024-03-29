package cn.edu.pku.sei.ra.arch.C2.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import cn.edu.pku.sei.ra.arch.C2.C2Package;

/**
 * @generated
 */
public class ConnectorCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ConnectorCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return C2Package.eINSTANCE.getArchitecture();
	}

}
