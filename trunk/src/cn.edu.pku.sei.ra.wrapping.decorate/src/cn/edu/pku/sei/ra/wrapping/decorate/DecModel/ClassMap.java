/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap#getFeatureMap <em>Feature Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getClassMap()
 * @model
 * @generated
 */
public interface ClassMap extends AbstractMap {
	/**
	 * Returns the value of the '<em><b>Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Ref</em>' reference.
	 * @see #setClassRef(EClass)
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getClassMap_ClassRef()
	 * @model required="true"
	 * @generated
	 */
	EClass getClassRef();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap#getClassRef <em>Class Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Ref</em>' reference.
	 * @see #getClassRef()
	 * @generated
	 */
	void setClassRef(EClass value);

	/**
	 * Returns the value of the '<em><b>Feature Map</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Map</em>' containment reference list.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getClassMap_FeatureMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureMap> getFeatureMap();

} // ClassMap
