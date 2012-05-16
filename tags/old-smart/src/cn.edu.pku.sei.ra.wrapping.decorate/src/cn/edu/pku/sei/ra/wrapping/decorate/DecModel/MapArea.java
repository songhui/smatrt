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
 * A representation of the model object '<em><b>Map Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea#getGlobalMap <em>Global Map</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea#getClassMap <em>Class Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getMapArea()
 * @model
 * @generated
 */
public interface MapArea extends EObject {

	/**
	 * Returns the value of the '<em><b>Global Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Map</em>' containment reference.
	 * @see #setGlobalMap(GlobalMap)
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getMapArea_GlobalMap()
	 * @model containment="true"
	 * @generated
	 */
	GlobalMap getGlobalMap();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea#getGlobalMap <em>Global Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Map</em>' containment reference.
	 * @see #getGlobalMap()
	 * @generated
	 */
	void setGlobalMap(GlobalMap value);

	/**
	 * Returns the value of the '<em><b>Class Map</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Map</em>' containment reference list.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getMapArea_ClassMap()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassMap> getClassMap();
} // MapArea
