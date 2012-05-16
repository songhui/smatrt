/**
 * <copyright>
 * </copyright>
 *
 * $Id: WrappingEObject.java,v 1.3 2008/11/19 02:38:06 song Exp $
 */
package cn.edu.pku.sei.ra.wrapping.CommonWrapping;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wrapping EObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#getWaitingFeature <em>Waiting Feature</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#getCore <em>Core</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#isNewborn <em>Newborn</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#isDead <em>Dead</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage#getWrappingEObject()
 * @model
 * @generated
 */
public interface WrappingEObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Waiting Feature</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waiting Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waiting Feature</em>' attribute.
	 * @see #setWaitingFeature(int)
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage#getWrappingEObject_WaitingFeature()
	 * @model default="-1" required="true" transient="true"
	 * @generated
	 */
	int getWaitingFeature();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#getWaitingFeature <em>Waiting Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Feature</em>' attribute.
	 * @see #getWaitingFeature()
	 * @generated
	 */
	void setWaitingFeature(int value);

	/**
	 * Returns the value of the '<em><b>Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' attribute.
	 * @see #setCore(Object)
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage#getWrappingEObject_Core()
	 * @model required="true" transient="true" volatile="true"
	 * @generated
	 */
	Object getCore();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#getCore <em>Core</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' attribute.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Object value);

	/**
	 * Returns the value of the '<em><b>Newborn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newborn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newborn</em>' attribute.
	 * @see #setNewborn(boolean)
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage#getWrappingEObject_Newborn()
	 * @model required="true"
	 * @generated
	 */
	boolean isNewborn();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#isNewborn <em>Newborn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newborn</em>' attribute.
	 * @see #isNewborn()
	 * @generated
	 */
	void setNewborn(boolean value);

	/**
	 * Returns the value of the '<em><b>Dead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead</em>' attribute.
	 * @see #setDead(boolean)
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage#getWrappingEObject_Dead()
	 * @model required="true"
	 * @generated
	 */
	boolean isDead();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#isDead <em>Dead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead</em>' attribute.
	 * @see #isDead()
	 * @generated
	 */
	void setDead(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Object lookupCore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Object createCore();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" wrappingEObjectRequired="true" featureIDRequired="true"
	 * @generated
	 */
	boolean addSubCore(WrappingEObject wrappingEObject, int featureID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wrappingEObjectRequired="true" featureIDRequired="true"
	 * @generated
	 */
	void removeSubCore(WrappingEObject wrappingEObject, int featureID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="cn.edu.pku.sei.ra.wrapping.CommonWrapping.EJavaList" required="true" many="false" featureIDRequired="true"
	 * @generated
	 */
	List listSubCores(int featureID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean isForCore(Object core);



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void destroyCore();



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true" indexRequired="true" featureIDRequired="true"
	 * @generated
	 */
	boolean addAttribute(Object value, int index, int featureID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true" indexRequired="true" featureIDRequired="true"
	 * @generated
	 */
	boolean removeAttribute(Object value, int index, int featureID);



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EClass getChildClassMap(Object object);

	public static final int NO_WAITING=-51483;
} // WrappingEObject
