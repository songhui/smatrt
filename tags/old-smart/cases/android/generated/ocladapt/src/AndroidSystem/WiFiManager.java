
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wi Fi Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AndroidSystem.WiFiManager#getScanResult <em>Scan Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see AndroidSystem.AndroidSystemPackage#getWiFiManager()
 * @model
 * @generated
 */
public interface WiFiManager extends EObject
{
  /**
   * Returns the value of the '<em><b>Scan Result</b></em>' containment reference list.
   * The list contents are of type {@link AndroidSystem.ScanResult}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scan Result</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scan Result</em>' containment reference list.
   * @see AndroidSystem.AndroidSystemPackage#getWiFiManager_ScanResult()
   * @model containment="true"
   * @generated
   */
  EList<ScanResult> getScanResult();

} // WiFiManager
