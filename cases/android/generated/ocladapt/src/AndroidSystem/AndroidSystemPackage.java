/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;



/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see AndroidSystem.AndroidSystemFactory
 * @model kind="package"
 * @generated
 */
public interface AndroidSystemPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "AndroidSystem";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sei.pku.edu.cn/ra/android";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "android.system";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AndroidSystemPackage eINSTANCE = AndroidSystem.impl.AndroidSystemPackageImpl.init();

  /**
   * The meta object id for the '{@link AndroidSystem.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see AndroidSystem.impl.ContextImpl
   * @see AndroidSystem.impl.AndroidSystemPackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Activity Manager</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__ACTIVITY_MANAGER = 0;

  /**
   * The feature id for the '<em><b>Connectivity Manager</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__CONNECTIVITY_MANAGER = 1;

  /**
   * The feature id for the '<em><b>Wifi Manager</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__WIFI_MANAGER = 2;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link AndroidSystem.impl.ActivityManagerImpl <em>Activity Manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see AndroidSystem.impl.ActivityManagerImpl
   * @see AndroidSystem.impl.AndroidSystemPackageImpl#getActivityManager()
   * @generated
   */
  int ACTIVITY_MANAGER = 1;

  /**
   * The feature id for the '<em><b>Running Service</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_MANAGER__RUNNING_SERVICE = 0;

  /**
   * The number of structural features of the '<em>Activity Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_MANAGER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link AndroidSystem.impl.RunningServiceImpl <em>Running Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see AndroidSystem.impl.RunningServiceImpl
   * @see AndroidSystem.impl.AndroidSystemPackageImpl#getRunningService()
   * @generated
   */
  int RUNNING_SERVICE = 2;

  /**
   * The feature id for the '<em><b>Process</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNNING_SERVICE__PROCESS = 0;

  /**
   * The feature id for the '<em><b>Client Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNNING_SERVICE__CLIENT_COUNT = 1;

  /**
   * The number of structural features of the '<em>Running Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUNNING_SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link AndroidSystem.impl.ConnectivityManagerImpl <em>Connectivity Manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see AndroidSystem.impl.ConnectivityManagerImpl
   * @see AndroidSystem.impl.AndroidSystemPackageImpl#getConnectivityManager()
   * @generated
   */
  int CONNECTIVITY_MANAGER = 3;

  /**
   * The feature id for the '<em><b>Network Info</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTIVITY_MANAGER__NETWORK_INFO = 0;

  /**
   * The number of structural features of the '<em>Connectivity Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTIVITY_MANAGER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link AndroidSystem.impl.NetworkInfoImpl <em>Network Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see AndroidSystem.impl.NetworkInfoImpl
   * @see AndroidSystem.impl.AndroidSystemPackageImpl#getNetworkInfo()
   * @generated
   */
  int NETWORK_INFO = 4;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NETWORK_INFO__TYPE_NAME = 0;

  /**
   * The number of structural features of the '<em>Network Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NETWORK_INFO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link AndroidSystem.impl.WiFiManagerImpl <em>Wi Fi Manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see AndroidSystem.impl.WiFiManagerImpl
   * @see AndroidSystem.impl.AndroidSystemPackageImpl#getWiFiManager()
   * @generated
   */
  int WI_FI_MANAGER = 5;

  /**
   * The feature id for the '<em><b>Scan Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_FI_MANAGER__SCAN_RESULT = 0;

  /**
   * The number of structural features of the '<em>Wi Fi Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WI_FI_MANAGER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link AndroidSystem.impl.ScanResultImpl <em>Scan Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see AndroidSystem.impl.ScanResultImpl
   * @see AndroidSystem.impl.AndroidSystemPackageImpl#getScanResult()
   * @generated
   */
  int SCAN_RESULT = 6;

  /**
   * The feature id for the '<em><b>Ssid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCAN_RESULT__SSID = 0;

  /**
   * The number of structural features of the '<em>Scan Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCAN_RESULT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link AndroidSystem.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see AndroidSystem.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for the containment reference '{@link AndroidSystem.Context#getActivityManager <em>Activity Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Activity Manager</em>'.
   * @see AndroidSystem.Context#getActivityManager()
   * @see #getContext()
   * @generated
   */
  EReference getContext_ActivityManager();

  /**
   * Returns the meta object for the containment reference '{@link AndroidSystem.Context#getConnectivityManager <em>Connectivity Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Connectivity Manager</em>'.
   * @see AndroidSystem.Context#getConnectivityManager()
   * @see #getContext()
   * @generated
   */
  EReference getContext_ConnectivityManager();

  /**
   * Returns the meta object for the containment reference '{@link AndroidSystem.Context#getWifiManager <em>Wifi Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wifi Manager</em>'.
   * @see AndroidSystem.Context#getWifiManager()
   * @see #getContext()
   * @generated
   */
  EReference getContext_WifiManager();

  /**
   * Returns the meta object for class '{@link AndroidSystem.ActivityManager <em>Activity Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Manager</em>'.
   * @see AndroidSystem.ActivityManager
   * @generated
   */
  EClass getActivityManager();

  /**
   * Returns the meta object for the containment reference list '{@link AndroidSystem.ActivityManager#getRunningService <em>Running Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Running Service</em>'.
   * @see AndroidSystem.ActivityManager#getRunningService()
   * @see #getActivityManager()
   * @generated
   */
  EReference getActivityManager_RunningService();

  /**
   * Returns the meta object for class '{@link AndroidSystem.RunningService <em>Running Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Running Service</em>'.
   * @see AndroidSystem.RunningService
   * @generated
   */
  EClass getRunningService();

  /**
   * Returns the meta object for the attribute '{@link AndroidSystem.RunningService#getProcess <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process</em>'.
   * @see AndroidSystem.RunningService#getProcess()
   * @see #getRunningService()
   * @generated
   */
  EAttribute getRunningService_Process();

  /**
   * Returns the meta object for the attribute '{@link AndroidSystem.RunningService#getClientCount <em>Client Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Client Count</em>'.
   * @see AndroidSystem.RunningService#getClientCount()
   * @see #getRunningService()
   * @generated
   */
  EAttribute getRunningService_ClientCount();

  /**
   * Returns the meta object for class '{@link AndroidSystem.ConnectivityManager <em>Connectivity Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connectivity Manager</em>'.
   * @see AndroidSystem.ConnectivityManager
   * @generated
   */
  EClass getConnectivityManager();

  /**
   * Returns the meta object for the containment reference list '{@link AndroidSystem.ConnectivityManager#getNetworkInfo <em>Network Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Network Info</em>'.
   * @see AndroidSystem.ConnectivityManager#getNetworkInfo()
   * @see #getConnectivityManager()
   * @generated
   */
  EReference getConnectivityManager_NetworkInfo();

  /**
   * Returns the meta object for class '{@link AndroidSystem.NetworkInfo <em>Network Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Network Info</em>'.
   * @see AndroidSystem.NetworkInfo
   * @generated
   */
  EClass getNetworkInfo();

  /**
   * Returns the meta object for the attribute '{@link AndroidSystem.NetworkInfo#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see AndroidSystem.NetworkInfo#getTypeName()
   * @see #getNetworkInfo()
   * @generated
   */
  EAttribute getNetworkInfo_TypeName();

  /**
   * Returns the meta object for class '{@link AndroidSystem.WiFiManager <em>Wi Fi Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wi Fi Manager</em>'.
   * @see AndroidSystem.WiFiManager
   * @generated
   */
  EClass getWiFiManager();

  /**
   * Returns the meta object for the containment reference list '{@link AndroidSystem.WiFiManager#getScanResult <em>Scan Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scan Result</em>'.
   * @see AndroidSystem.WiFiManager#getScanResult()
   * @see #getWiFiManager()
   * @generated
   */
  EReference getWiFiManager_ScanResult();

  /**
   * Returns the meta object for class '{@link AndroidSystem.ScanResult <em>Scan Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scan Result</em>'.
   * @see AndroidSystem.ScanResult
   * @generated
   */
  EClass getScanResult();

  /**
   * Returns the meta object for the attribute '{@link AndroidSystem.ScanResult#getSsid <em>Ssid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ssid</em>'.
   * @see AndroidSystem.ScanResult#getSsid()
   * @see #getScanResult()
   * @generated
   */
  EAttribute getScanResult_Ssid();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AndroidSystemFactory getAndroidSystemFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link AndroidSystem.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see AndroidSystem.impl.ContextImpl
     * @see AndroidSystem.impl.AndroidSystemPackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '<em><b>Activity Manager</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__ACTIVITY_MANAGER = eINSTANCE.getContext_ActivityManager();

    /**
     * The meta object literal for the '<em><b>Connectivity Manager</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__CONNECTIVITY_MANAGER = eINSTANCE.getContext_ConnectivityManager();

    /**
     * The meta object literal for the '<em><b>Wifi Manager</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__WIFI_MANAGER = eINSTANCE.getContext_WifiManager();

    /**
     * The meta object literal for the '{@link AndroidSystem.impl.ActivityManagerImpl <em>Activity Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see AndroidSystem.impl.ActivityManagerImpl
     * @see AndroidSystem.impl.AndroidSystemPackageImpl#getActivityManager()
     * @generated
     */
    EClass ACTIVITY_MANAGER = eINSTANCE.getActivityManager();

    /**
     * The meta object literal for the '<em><b>Running Service</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_MANAGER__RUNNING_SERVICE = eINSTANCE.getActivityManager_RunningService();

    /**
     * The meta object literal for the '{@link AndroidSystem.impl.RunningServiceImpl <em>Running Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see AndroidSystem.impl.RunningServiceImpl
     * @see AndroidSystem.impl.AndroidSystemPackageImpl#getRunningService()
     * @generated
     */
    EClass RUNNING_SERVICE = eINSTANCE.getRunningService();

    /**
     * The meta object literal for the '<em><b>Process</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUNNING_SERVICE__PROCESS = eINSTANCE.getRunningService_Process();

    /**
     * The meta object literal for the '<em><b>Client Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUNNING_SERVICE__CLIENT_COUNT = eINSTANCE.getRunningService_ClientCount();

    /**
     * The meta object literal for the '{@link AndroidSystem.impl.ConnectivityManagerImpl <em>Connectivity Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see AndroidSystem.impl.ConnectivityManagerImpl
     * @see AndroidSystem.impl.AndroidSystemPackageImpl#getConnectivityManager()
     * @generated
     */
    EClass CONNECTIVITY_MANAGER = eINSTANCE.getConnectivityManager();

    /**
     * The meta object literal for the '<em><b>Network Info</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTIVITY_MANAGER__NETWORK_INFO = eINSTANCE.getConnectivityManager_NetworkInfo();

    /**
     * The meta object literal for the '{@link AndroidSystem.impl.NetworkInfoImpl <em>Network Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see AndroidSystem.impl.NetworkInfoImpl
     * @see AndroidSystem.impl.AndroidSystemPackageImpl#getNetworkInfo()
     * @generated
     */
    EClass NETWORK_INFO = eINSTANCE.getNetworkInfo();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NETWORK_INFO__TYPE_NAME = eINSTANCE.getNetworkInfo_TypeName();

    /**
     * The meta object literal for the '{@link AndroidSystem.impl.WiFiManagerImpl <em>Wi Fi Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see AndroidSystem.impl.WiFiManagerImpl
     * @see AndroidSystem.impl.AndroidSystemPackageImpl#getWiFiManager()
     * @generated
     */
    EClass WI_FI_MANAGER = eINSTANCE.getWiFiManager();

    /**
     * The meta object literal for the '<em><b>Scan Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WI_FI_MANAGER__SCAN_RESULT = eINSTANCE.getWiFiManager_ScanResult();

    /**
     * The meta object literal for the '{@link AndroidSystem.impl.ScanResultImpl <em>Scan Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see AndroidSystem.impl.ScanResultImpl
     * @see AndroidSystem.impl.AndroidSystemPackageImpl#getScanResult()
     * @generated
     */
    EClass SCAN_RESULT = eINSTANCE.getScanResult();

    /**
     * The meta object literal for the '<em><b>Ssid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCAN_RESULT__SSID = eINSTANCE.getScanResult_Ssid();

  }

  /*Global utility methods are generated here*/
    
} //AndroidSystemPackage
