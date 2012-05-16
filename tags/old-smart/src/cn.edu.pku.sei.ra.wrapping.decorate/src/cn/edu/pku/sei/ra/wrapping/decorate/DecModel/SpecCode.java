/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#getCode <em>Code</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#isFinal <em>Final</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getSpecCode()
 * @model abstract="true"
 * @generated
 */
public interface SpecCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getSpecCode_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getSpecCode_Final()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getSpecCode_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SpecCode
