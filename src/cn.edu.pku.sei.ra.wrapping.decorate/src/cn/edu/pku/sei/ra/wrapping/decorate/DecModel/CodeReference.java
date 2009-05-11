/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeReference#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getCodeReference()
 * @model
 * @generated
 */
public interface CodeReference extends Code {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Code)
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getCodeReference_Reference()
	 * @model required="true"
	 * @generated
	 */
	Code getReference();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Code value);

} // CodeReference
