/**
 * <copyright>
 * </copyright>
 *
 * $Id: C2Factory.java,v 1.1 2008/11/09 02:43:02 song Exp $
 */
package cn.edu.pku.sei.ra.arch.C2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cn.edu.pku.sei.ra.arch.C2.C2Package
 * @generated
 */
public interface C2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	C2Factory eINSTANCE = cn.edu.pku.sei.ra.arch.C2.impl.C2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture</em>'.
	 * @generated
	 */
	Architecture createArchitecture();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	C2Package getC2Package();

} //C2Factory
