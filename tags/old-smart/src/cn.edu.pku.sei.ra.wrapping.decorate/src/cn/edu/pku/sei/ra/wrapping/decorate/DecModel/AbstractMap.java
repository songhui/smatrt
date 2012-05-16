/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap#getSpecType <em>Spec Type</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap#getSpecCode <em>Spec Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getAbstractMap()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Spec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Type</em>' attribute.
	 * @see #setSpecType(String)
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getAbstractMap_SpecType()
	 * @model
	 * @generated
	 */
	String getSpecType();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap#getSpecType <em>Spec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Type</em>' attribute.
	 * @see #getSpecType()
	 * @generated
	 */
	void setSpecType(String value);

	/**
	 * Returns the value of the '<em><b>Spec Code</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Code</em>' containment reference list.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getAbstractMap_SpecCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecCode> getSpecCode();

} // AbstractMap
