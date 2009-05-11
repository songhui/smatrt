/**
 * <copyright>
 * </copyright>
 *
 * $Id: WaitingPair.java,v 1.1 2008/11/09 03:10:52 song Exp $
 */
package cn.edu.pku.sei.ra.wrapping.CommonWrapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Waiting Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WaitingPair#getFeatureID <em>Feature ID</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WaitingPair#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage#getWaitingPair()
 * @model
 * @generated
 */
public interface WaitingPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature ID</em>' attribute.
	 * @see #setFeatureID(int)
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage#getWaitingPair_FeatureID()
	 * @model required="true"
	 * @generated
	 */
	int getFeatureID();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WaitingPair#getFeatureID <em>Feature ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature ID</em>' attribute.
	 * @see #getFeatureID()
	 * @generated
	 */
	void setFeatureID(int value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(WrappingEObject)
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage#getWaitingPair_Container()
	 * @model required="true"
	 * @generated
	 */
	WrappingEObject getContainer();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WaitingPair#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(WrappingEObject value);

} // WaitingPair
