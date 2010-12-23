
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem.impl;

import AndroidSystem.ActivityManager;
import AndroidSystem.AndroidSystemPackage;
import AndroidSystem.ConnectivityManager;
import AndroidSystem.Context;
import AndroidSystem.WiFiManager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.EObject;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectContainmentEListForWrapping;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectResolvingEListForWrapping;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.ImagePool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AndroidSystem.impl.ContextImpl#getActivityManager <em>Activity Manager</em>}</li>
 *   <li>{@link AndroidSystem.impl.ContextImpl#getConnectivityManager <em>Connectivity Manager</em>}</li>
 *   <li>{@link AndroidSystem.impl.ContextImpl#getWifiManager <em>Wifi Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends WrappingEObjectImpl implements Context
{
  /**
   * The cached value of the '{@link #getActivityManager() <em>Activity Manager</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivityManager()
   * @generated
   * @ordered
   */
  protected ActivityManager activityManager;

  /**
   * The cached value of the '{@link #getConnectivityManager() <em>Connectivity Manager</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectivityManager()
   * @generated
   * @ordered
   */
  protected ConnectivityManager connectivityManager;

  /**
   * The cached value of the '{@link #getWifiManager() <em>Wifi Manager</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWifiManager()
   * @generated
   * @ordered
   */
  protected WiFiManager wifiManager;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AndroidSystemPackage.Literals.CONTEXT;
  }

  
  

  
  

  
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
  
    android.content.Context core=(android.content.Context)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
  
  
  
  }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public EClass getChildClassMap(Object object){
    AndroidSystemPackage pack=AndroidSystemPackage.eINSTANCE;	
  
    return null;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityManager getActivityManager()
  {
        Object result=null;
        android.content.Context core=(android.content.Context)getCore();
        if(core==null) return activityManager;	
        result=(android.app.ActivityManager)core.getSystemService(core.ACTIVITY_SERVICE);
        activityManager=(result instanceof EObject)?(ActivityManager)result:(ActivityManager)ImagePool.find(result);
        	
        if(activityManager==null){
        	
        	activityManager=new ActivityManagerImpl();
        	((ActivityManagerImpl)activityManager).setCore(result);
        	ImagePool.put((ActivityManagerImpl)activityManager);
        }
        	
    return activityManager; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActivityManager(ActivityManager newActivityManager, NotificationChain msgs)
  {
    ActivityManager oldActivityManager = activityManager;
    activityManager = newActivityManager;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidSystemPackage.CONTEXT__ACTIVITY_MANAGER, oldActivityManager, newActivityManager);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivityManager(ActivityManager newActivityManager)
  {
    if (newActivityManager != activityManager)
    {
      NotificationChain msgs = null;
      if (activityManager != null)
        msgs = ((InternalEObject)activityManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidSystemPackage.CONTEXT__ACTIVITY_MANAGER, null, msgs);
      if (newActivityManager != null)
        msgs = ((InternalEObject)newActivityManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidSystemPackage.CONTEXT__ACTIVITY_MANAGER, null, msgs);
      msgs = basicSetActivityManager(newActivityManager, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidSystemPackage.CONTEXT__ACTIVITY_MANAGER, newActivityManager, newActivityManager));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectivityManager getConnectivityManager()
  {
        Object result=null;
        android.content.Context core=(android.content.Context)getCore();
        if(core==null) return connectivityManager;	
        result=(android.net.ConnectivityManager)core.getSystemService(core.CONNECTIVITY_SERVICE);
        connectivityManager=(result instanceof EObject)?(ConnectivityManager)result:(ConnectivityManager)ImagePool.find(result);
        	
        if(connectivityManager==null){
        	
        	connectivityManager=new ConnectivityManagerImpl();
        	((ConnectivityManagerImpl)connectivityManager).setCore(result);
        	ImagePool.put((ConnectivityManagerImpl)connectivityManager);
        }
        	
    return connectivityManager; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConnectivityManager(ConnectivityManager newConnectivityManager, NotificationChain msgs)
  {
    ConnectivityManager oldConnectivityManager = connectivityManager;
    connectivityManager = newConnectivityManager;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidSystemPackage.CONTEXT__CONNECTIVITY_MANAGER, oldConnectivityManager, newConnectivityManager);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnectivityManager(ConnectivityManager newConnectivityManager)
  {
    if (newConnectivityManager != connectivityManager)
    {
      NotificationChain msgs = null;
      if (connectivityManager != null)
        msgs = ((InternalEObject)connectivityManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidSystemPackage.CONTEXT__CONNECTIVITY_MANAGER, null, msgs);
      if (newConnectivityManager != null)
        msgs = ((InternalEObject)newConnectivityManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidSystemPackage.CONTEXT__CONNECTIVITY_MANAGER, null, msgs);
      msgs = basicSetConnectivityManager(newConnectivityManager, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidSystemPackage.CONTEXT__CONNECTIVITY_MANAGER, newConnectivityManager, newConnectivityManager));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WiFiManager getWifiManager()
  {
        Object result=null;
        android.content.Context core=(android.content.Context)getCore();
        if(core==null) return wifiManager;	
        result=(android.net.wifi.WifiManager)core.getSystemService(core.WIFI_SERVICE);
        wifiManager=(result instanceof EObject)?(WiFiManager)result:(WiFiManager)ImagePool.find(result);
        	
        if(wifiManager==null){
        	
        	wifiManager=new WiFiManagerImpl();
        	((WiFiManagerImpl)wifiManager).setCore(result);
        	ImagePool.put((WiFiManagerImpl)wifiManager);
        }
        	
    return wifiManager; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWifiManager(WiFiManager newWifiManager, NotificationChain msgs)
  {
    WiFiManager oldWifiManager = wifiManager;
    wifiManager = newWifiManager;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidSystemPackage.CONTEXT__WIFI_MANAGER, oldWifiManager, newWifiManager);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWifiManager(WiFiManager newWifiManager)
  {
    if (newWifiManager != wifiManager)
    {
      NotificationChain msgs = null;
      if (wifiManager != null)
        msgs = ((InternalEObject)wifiManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidSystemPackage.CONTEXT__WIFI_MANAGER, null, msgs);
      if (newWifiManager != null)
        msgs = ((InternalEObject)newWifiManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidSystemPackage.CONTEXT__WIFI_MANAGER, null, msgs);
      msgs = basicSetWifiManager(newWifiManager, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidSystemPackage.CONTEXT__WIFI_MANAGER, newWifiManager, newWifiManager));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.CONTEXT__ACTIVITY_MANAGER:
        return basicSetActivityManager(null, msgs);
      case AndroidSystemPackage.CONTEXT__CONNECTIVITY_MANAGER:
        return basicSetConnectivityManager(null, msgs);
      case AndroidSystemPackage.CONTEXT__WIFI_MANAGER:
        return basicSetWifiManager(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.CONTEXT__ACTIVITY_MANAGER:
        return getActivityManager();
      case AndroidSystemPackage.CONTEXT__CONNECTIVITY_MANAGER:
        return getConnectivityManager();
      case AndroidSystemPackage.CONTEXT__WIFI_MANAGER:
        return getWifiManager();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.CONTEXT__ACTIVITY_MANAGER:
        setActivityManager((ActivityManager)newValue);
        return;
      case AndroidSystemPackage.CONTEXT__CONNECTIVITY_MANAGER:
        setConnectivityManager((ConnectivityManager)newValue);
        return;
      case AndroidSystemPackage.CONTEXT__WIFI_MANAGER:
        setWifiManager((WiFiManager)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.CONTEXT__ACTIVITY_MANAGER:
        setActivityManager((ActivityManager)null);
        return;
      case AndroidSystemPackage.CONTEXT__CONNECTIVITY_MANAGER:
        setConnectivityManager((ConnectivityManager)null);
        return;
      case AndroidSystemPackage.CONTEXT__WIFI_MANAGER:
        setWifiManager((WiFiManager)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.CONTEXT__ACTIVITY_MANAGER:
        return activityManager != null;
      case AndroidSystemPackage.CONTEXT__CONNECTIVITY_MANAGER:
        return connectivityManager != null;
      case AndroidSystemPackage.CONTEXT__WIFI_MANAGER:
        return wifiManager != null;
    }
    return super.eIsSet(featureID);
  }

} //ContextImpl
