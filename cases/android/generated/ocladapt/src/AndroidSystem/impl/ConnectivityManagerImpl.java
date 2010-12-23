
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem.impl;

import AndroidSystem.AndroidSystemPackage;
import AndroidSystem.ConnectivityManager;
import AndroidSystem.NetworkInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
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
 * An implementation of the model object '<em><b>Connectivity Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AndroidSystem.impl.ConnectivityManagerImpl#getNetworkInfo <em>Network Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectivityManagerImpl extends WrappingEObjectImpl implements ConnectivityManager
{
  /**
   * The cached value of the '{@link #getNetworkInfo() <em>Network Info</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetworkInfo()
   * @generated
   * @ordered
   */
  protected EList<NetworkInfo> networkInfo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectivityManagerImpl()
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
    return AndroidSystemPackage.Literals.CONNECTIVITY_MANAGER;
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
    result= (core==arg0);
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
  
    android.net.ConnectivityManager core=(android.net.ConnectivityManager)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
    case AndroidSystemPackage.CONNECTIVITY_MANAGER__NETWORK_INFO:
  
      android.net.NetworkInfo[] infos=core.getAllNetworkInfo();
for(int i=0;i<infos.length;i++)
  result.add(infos[i]);
    break;
    
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
  public EList<NetworkInfo> getNetworkInfo()
  {

    
    if (networkInfo == null)
    {
  
  
    
      
      networkInfo = new EObjectContainmentEListForWrapping<NetworkInfo>(
          NetworkInfo.class, 
          this, 
          AndroidSystemPackage.CONNECTIVITY_MANAGER__NETWORK_INFO,
          AndroidSystemPackage.eINSTANCE.getNetworkInfo()
        );
        
  }
  
      ((EObjectContainmentEListForWrapping<NetworkInfo>)networkInfo)
      .refreshWrap();
  
    return networkInfo;
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
      case AndroidSystemPackage.CONNECTIVITY_MANAGER__NETWORK_INFO:
        return ((InternalEList<?>)getNetworkInfo()).basicRemove(otherEnd, msgs);
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
      case AndroidSystemPackage.CONNECTIVITY_MANAGER__NETWORK_INFO:
        return getNetworkInfo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.CONNECTIVITY_MANAGER__NETWORK_INFO:
        getNetworkInfo().clear();
        getNetworkInfo().addAll((Collection<? extends NetworkInfo>)newValue);
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
      case AndroidSystemPackage.CONNECTIVITY_MANAGER__NETWORK_INFO:
        getNetworkInfo().clear();
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
      case AndroidSystemPackage.CONNECTIVITY_MANAGER__NETWORK_INFO:
        return networkInfo != null && !networkInfo.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConnectivityManagerImpl
