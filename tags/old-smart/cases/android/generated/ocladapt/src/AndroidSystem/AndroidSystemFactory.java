/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AndroidSystem.AndroidSystemPackage
 * @generated
 */
public interface AndroidSystemFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AndroidSystemFactory eINSTANCE = AndroidSystem.impl.AndroidSystemFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context</em>'.
   * @generated
   */
  Context createContext();

  /**
   * Returns a new object of class '<em>Activity Manager</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Manager</em>'.
   * @generated
   */
  ActivityManager createActivityManager();

  /**
   * Returns a new object of class '<em>Running Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Running Service</em>'.
   * @generated
   */
  RunningService createRunningService();

  /**
   * Returns a new object of class '<em>Connectivity Manager</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connectivity Manager</em>'.
   * @generated
   */
  ConnectivityManager createConnectivityManager();

  /**
   * Returns a new object of class '<em>Network Info</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Network Info</em>'.
   * @generated
   */
  NetworkInfo createNetworkInfo();

  /**
   * Returns a new object of class '<em>Wi Fi Manager</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wi Fi Manager</em>'.
   * @generated
   */
  WiFiManager createWiFiManager();

  /**
   * Returns a new object of class '<em>Scan Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scan Result</em>'.
   * @generated
   */
  ScanResult createScanResult();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AndroidSystemPackage getAndroidSystemPackage();

} //AndroidSystemFactory
