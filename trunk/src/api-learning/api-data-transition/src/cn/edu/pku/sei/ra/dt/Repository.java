/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.dt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Repository#getPlace <em>Place</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Repository#getTransition <em>Transition</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Repository#getTracerBuilder <em>Tracer Builder</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Repository#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.dt.DtPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.dt.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' containment reference list.
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getRepository_Place()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlace();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.dt.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getRepository_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Tracer Builder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracer Builder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracer Builder</em>' attribute.
	 * @see #setTracerBuilder(Object)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getRepository_TracerBuilder()
	 * @model required="true"
	 * @generated
	 */
	Object getTracerBuilder();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Repository#getTracerBuilder <em>Tracer Builder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracer Builder</em>' attribute.
	 * @see #getTracerBuilder()
	 * @generated
	 */
	void setTracerBuilder(Object value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(IJavaElement)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getRepository_Method()
	 * @model dataType="cn.edu.pku.sei.ra.dt.SJavaElement" required="true"
	 * @generated
	 */
	IJavaElement getMethod();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Repository#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(IJavaElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementDataType="cn.edu.pku.sei.ra.dt.SJavaElement"
	 * @generated
	 */
	EList<Place> getPlaceByJavaElement(IJavaElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearTemp();

} // Repository
