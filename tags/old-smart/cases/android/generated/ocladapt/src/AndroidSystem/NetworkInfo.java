
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AndroidSystem.NetworkInfo#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see AndroidSystem.AndroidSystemPackage#getNetworkInfo()
 * @model
 * @generated
 */
public interface NetworkInfo extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' attribute.
   * @see #setTypeName(String)
   * @see AndroidSystem.AndroidSystemPackage#getNetworkInfo_TypeName()
   * @model required="true"
   * @generated
   */
  String getTypeName();

  /**
   * Sets the value of the '{@link AndroidSystem.NetworkInfo#getTypeName <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' attribute.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(String value);

} // NetworkInfo
