/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ie.tcd.test.filesys;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ie.tcd.test.filesys.FileSysPackage
 * @generated
 */
public interface FileSysFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileSysFactory eINSTANCE = ie.tcd.test.filesys.impl.FileSysFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EFolder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFolder</em>'.
	 * @generated
	 */
	EFolder createEFolder();

	/**
	 * Returns a new object of class '<em>EFile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFile</em>'.
	 * @generated
	 */
	EFile createEFile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FileSysPackage getFileSysPackage();

} //FileSysFactory
