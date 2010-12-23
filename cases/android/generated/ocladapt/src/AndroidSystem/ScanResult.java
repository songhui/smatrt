
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
 * A representation of the model object '<em><b>Scan Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AndroidSystem.ScanResult#getSsid <em>Ssid</em>}</li>
 * </ul>
 * </p>
 *
 * @see AndroidSystem.AndroidSystemPackage#getScanResult()
 * @model
 * @generated
 */
public interface ScanResult extends EObject
{
  /**
   * Returns the value of the '<em><b>Ssid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ssid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ssid</em>' attribute.
   * @see #setSsid(String)
   * @see AndroidSystem.AndroidSystemPackage#getScanResult_Ssid()
   * @model required="true" derived="true"
   * @generated
   */
  String getSsid();

  /**
   * Sets the value of the '{@link AndroidSystem.ScanResult#getSsid <em>Ssid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ssid</em>' attribute.
   * @see #getSsid()
   * @generated
   */
  void setSsid(String value);

} // ScanResult
