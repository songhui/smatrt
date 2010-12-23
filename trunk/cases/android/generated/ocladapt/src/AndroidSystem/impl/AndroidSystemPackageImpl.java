/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem.impl;

import AndroidSystem.ActivityManager;
import AndroidSystem.AndroidSystemFactory;
import AndroidSystem.AndroidSystemPackage;
import AndroidSystem.ConnectivityManager;
import AndroidSystem.Context;
import AndroidSystem.NetworkInfo;
import AndroidSystem.RunningService;
import AndroidSystem.ScanResult;
import AndroidSystem.WiFiManager;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.EObject;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidSystemPackageImpl extends EPackageImpl implements AndroidSystemPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityManagerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass runningServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectivityManagerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass networkInfoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wiFiManagerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scanResultEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see AndroidSystem.AndroidSystemPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AndroidSystemPackageImpl()
  {
    super(eNS_URI, AndroidSystemFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AndroidSystemPackage init()
  {
    if (isInited) return (AndroidSystemPackage)EPackage.Registry.INSTANCE.getEPackage(AndroidSystemPackage.eNS_URI);

    // Obtain or create and register package
    AndroidSystemPackageImpl theAndroidSystemPackage = (AndroidSystemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AndroidSystemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AndroidSystemPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAndroidSystemPackage.createPackageContents();

    // Initialize created meta-data
    theAndroidSystemPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAndroidSystemPackage.freeze();

    return theAndroidSystemPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContext()
  {
    return contextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContext_ActivityManager()
  {
    return (EReference)contextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContext_ConnectivityManager()
  {
    return (EReference)contextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContext_WifiManager()
  {
    return (EReference)contextEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityManager()
  {
    return activityManagerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityManager_RunningService()
  {
    return (EReference)activityManagerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRunningService()
  {
    return runningServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunningService_Process()
  {
    return (EAttribute)runningServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunningService_ClientCount()
  {
    return (EAttribute)runningServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnectivityManager()
  {
    return connectivityManagerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectivityManager_NetworkInfo()
  {
    return (EReference)connectivityManagerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetworkInfo()
  {
    return networkInfoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetworkInfo_TypeName()
  {
    return (EAttribute)networkInfoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWiFiManager()
  {
    return wiFiManagerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWiFiManager_ScanResult()
  {
    return (EReference)wiFiManagerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScanResult()
  {
    return scanResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScanResult_Ssid()
  {
    return (EAttribute)scanResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidSystemFactory getAndroidSystemFactory()
  {
    return (AndroidSystemFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    contextEClass = createEClass(CONTEXT);
    createEReference(contextEClass, CONTEXT__ACTIVITY_MANAGER);
    createEReference(contextEClass, CONTEXT__CONNECTIVITY_MANAGER);
    createEReference(contextEClass, CONTEXT__WIFI_MANAGER);

    activityManagerEClass = createEClass(ACTIVITY_MANAGER);
    createEReference(activityManagerEClass, ACTIVITY_MANAGER__RUNNING_SERVICE);

    runningServiceEClass = createEClass(RUNNING_SERVICE);
    createEAttribute(runningServiceEClass, RUNNING_SERVICE__PROCESS);
    createEAttribute(runningServiceEClass, RUNNING_SERVICE__CLIENT_COUNT);

    connectivityManagerEClass = createEClass(CONNECTIVITY_MANAGER);
    createEReference(connectivityManagerEClass, CONNECTIVITY_MANAGER__NETWORK_INFO);

    networkInfoEClass = createEClass(NETWORK_INFO);
    createEAttribute(networkInfoEClass, NETWORK_INFO__TYPE_NAME);

    wiFiManagerEClass = createEClass(WI_FI_MANAGER);
    createEReference(wiFiManagerEClass, WI_FI_MANAGER__SCAN_RESULT);

    scanResultEClass = createEClass(SCAN_RESULT);
    createEAttribute(scanResultEClass, SCAN_RESULT__SSID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContext_ActivityManager(), this.getActivityManager(), null, "activityManager", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContext_ConnectivityManager(), this.getConnectivityManager(), null, "connectivityManager", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContext_WifiManager(), this.getWiFiManager(), null, "wifiManager", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityManagerEClass, ActivityManager.class, "ActivityManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityManager_RunningService(), this.getRunningService(), null, "runningService", null, 0, -1, ActivityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runningServiceEClass, RunningService.class, "RunningService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRunningService_Process(), ecorePackage.getEString(), "process", null, 1, 1, RunningService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRunningService_ClientCount(), ecorePackage.getEInt(), "clientCount", null, 1, 1, RunningService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectivityManagerEClass, ConnectivityManager.class, "ConnectivityManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConnectivityManager_NetworkInfo(), this.getNetworkInfo(), null, "networkInfo", null, 0, -1, ConnectivityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(networkInfoEClass, NetworkInfo.class, "NetworkInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNetworkInfo_TypeName(), ecorePackage.getEString(), "typeName", null, 1, 1, NetworkInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wiFiManagerEClass, WiFiManager.class, "WiFiManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWiFiManager_ScanResult(), this.getScanResult(), null, "scanResult", null, 0, -1, WiFiManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scanResultEClass, ScanResult.class, "ScanResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScanResult_Ssid(), ecorePackage.getEString(), "ssid", null, 1, 1, ScanResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

  /*Global utility methods are generated here*/
    
} //AndroidSystemPackageImpl
