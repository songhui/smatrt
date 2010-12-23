
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
 * A representation of the model object '<em><b>Connectivity Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AndroidSystem.ConnectivityManager#getNetworkInfo <em>Network Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see AndroidSystem.AndroidSystemPackage#getConnectivityManager()
 * @model
 * @generated
 */
public interface ConnectivityManager extends EObject
{
  /**
   * Returns the value of the '<em><b>Network Info</b></em>' containment reference list.
   * The list contents are of type {@link AndroidSystem.NetworkInfo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Network Info</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Network Info</em>' containment reference list.
   * @see AndroidSystem.AndroidSystemPackage#getConnectivityManager_NetworkInfo()
   * @model containment="true"
   * @generated
   */
  EList<NetworkInfo> getNetworkInfo();

} // ConnectivityManager
