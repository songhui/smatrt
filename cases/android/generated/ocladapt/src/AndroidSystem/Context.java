
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
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AndroidSystem.Context#getActivityManager <em>Activity Manager</em>}</li>
 *   <li>{@link AndroidSystem.Context#getConnectivityManager <em>Connectivity Manager</em>}</li>
 *   <li>{@link AndroidSystem.Context#getWifiManager <em>Wifi Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see AndroidSystem.AndroidSystemPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject
{
  /**
   * Returns the value of the '<em><b>Activity Manager</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity Manager</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity Manager</em>' containment reference.
   * @see #setActivityManager(ActivityManager)
   * @see AndroidSystem.AndroidSystemPackage#getContext_ActivityManager()
   * @model containment="true"
   * @generated
   */
  ActivityManager getActivityManager();

  /**
   * Sets the value of the '{@link AndroidSystem.Context#getActivityManager <em>Activity Manager</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity Manager</em>' containment reference.
   * @see #getActivityManager()
   * @generated
   */
  void setActivityManager(ActivityManager value);

  /**
   * Returns the value of the '<em><b>Connectivity Manager</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connectivity Manager</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connectivity Manager</em>' containment reference.
   * @see #setConnectivityManager(ConnectivityManager)
   * @see AndroidSystem.AndroidSystemPackage#getContext_ConnectivityManager()
   * @model containment="true"
   * @generated
   */
  ConnectivityManager getConnectivityManager();

  /**
   * Sets the value of the '{@link AndroidSystem.Context#getConnectivityManager <em>Connectivity Manager</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connectivity Manager</em>' containment reference.
   * @see #getConnectivityManager()
   * @generated
   */
  void setConnectivityManager(ConnectivityManager value);

  /**
   * Returns the value of the '<em><b>Wifi Manager</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wifi Manager</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wifi Manager</em>' containment reference.
   * @see #setWifiManager(WiFiManager)
   * @see AndroidSystem.AndroidSystemPackage#getContext_WifiManager()
   * @model containment="true"
   * @generated
   */
  WiFiManager getWifiManager();

  /**
   * Sets the value of the '{@link AndroidSystem.Context#getWifiManager <em>Wifi Manager</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wifi Manager</em>' containment reference.
   * @see #getWifiManager()
   * @generated
   */
  void setWifiManager(WiFiManager value);

} // Context
