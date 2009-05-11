/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommonWrappingFactory.java,v 1.1 2008/11/09 03:10:52 song Exp $
 */
package cn.edu.pku.sei.ra.wrapping.CommonWrapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage
 * @generated
 */
public interface CommonWrappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonWrappingFactory eINSTANCE = cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.CommonWrappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wrapping EObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wrapping EObject</em>'.
	 * @generated
	 */
	WrappingEObject createWrappingEObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonWrappingPackage getCommonWrappingPackage();

} //CommonWrappingFactory
