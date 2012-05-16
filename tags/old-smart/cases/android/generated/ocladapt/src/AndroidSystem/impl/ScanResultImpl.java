
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem.impl;

import AndroidSystem.AndroidSystemPackage;
import AndroidSystem.ScanResult;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 * An implementation of the model object '<em><b>Scan Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AndroidSystem.impl.ScanResultImpl#getSsid <em>Ssid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScanResultImpl extends WrappingEObjectImpl implements ScanResult
{
  /**
   * The default value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSsid()
   * @generated
   * @ordered
   */
  protected static final String SSID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSsid()
   * @generated
   * @ordered
   */
  protected String ssid = SSID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScanResultImpl()
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
    return AndroidSystemPackage.Literals.SCAN_RESULT;
  }

  
  

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public boolean isForCore(Object arg0){
   	boolean result=true;
   	if(core==null) return false;
    try{
    result=((android.net.wifi.ScanResult)core).toString().equals(((android.net.wifi.ScanResult)arg0).toString());
    }
    catch(Exception e){
      result=false;
    }
    return result;
  }
  

  
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
  
    android.net.wifi.ScanResult core=(android.net.wifi.ScanResult)this.getCore();
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
  public String getSsid()
  {
        Object result=null;
        android.net.wifi.ScanResult core=(android.net.wifi.ScanResult)getCore();
        if(core==null) return ssid;	
        ssid=core.SSID;
    return ssid; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSsid(String newSsid)
  {
    String oldSsid = ssid;
    ssid = newSsid;
        	
      android.net.wifi.ScanResult core=(android.net.wifi.ScanResult)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidSystemPackage.SCAN_RESULT__SSID, oldSsid, ssid));
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
      case AndroidSystemPackage.SCAN_RESULT__SSID:
        return getSsid();
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
      case AndroidSystemPackage.SCAN_RESULT__SSID:
        setSsid((String)newValue);
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
      case AndroidSystemPackage.SCAN_RESULT__SSID:
        setSsid(SSID_EDEFAULT);
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
      case AndroidSystemPackage.SCAN_RESULT__SSID:
        return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ssid: ");
    result.append(ssid);
    result.append(')');
    return result.toString();
  }

} //ScanResultImpl
