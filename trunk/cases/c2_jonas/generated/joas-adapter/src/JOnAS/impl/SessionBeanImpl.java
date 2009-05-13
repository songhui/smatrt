/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.impl;

import JOnAS.JOnASPackage;
import JOnAS.SessionBean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import javax.management.j2ee.Management;
import javax.management.j2ee.ManagementHome;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.management.ObjectName;
import javax.management.Attribute;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.xerces.dom.DOMImplementationImpl;
import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.apache.xpath.XPathAPI;
import org.w3c.dom.traversal.NodeIterator;
import org.w3c.dom.*;
import java.util.Hashtable;
import java.io.*;
import java.util.Iterator;
import java.util.Properties;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectContainmentEListForWrapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JOnAS.impl.SessionBeanImpl#getSessionTimeOut <em>Session Time Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionBeanImpl  extends EJBImpl implements SessionBean
{
  /**
   * The default value of the '{@link #getSessionTimeOut() <em>Session Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSessionTimeOut()
   * @generated
   * @ordered
   */
  protected static final int SESSION_TIME_OUT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSessionTimeOut() <em>Session Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSessionTimeOut()
   * @generated
   * @ordered
   */
  protected int sessionTimeOut = SESSION_TIME_OUT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SessionBeanImpl()
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
    return JOnASPackage.Literals.SESSION_BEAN;
  }
  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createCore(){
    if(fileName!=null && fileName.endsWith("jar")){
      Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
      ObjectName query;
      try {
        this.setNewborn(false);
        String[] signature={"java.lang.String"};
        String[] params=new String[1];
        params[0] = fileName;
        query = new ObjectName("jonas:j2eeType=J2EEServer,*");
        ObjectName server=(ObjectName)mgmt.queryNames(query, null).iterator().next();
        String deployedName=(String)mgmt.invoke(server, "deployJar", params, signature);
        query=new ObjectName(deployedName);
        ObjectName module=(ObjectName)mgmt.queryNames(query, null).iterator().next();
        String[] allEjb=(String[])mgmt.getAttribute(module, "ejbs");
        
        String qString=allEjb[0];
        query=new ObjectName(qString+",*");
        ObjectName res=(ObjectName)mgmt.queryNames(query, null).iterator().next();
        return res;
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return null;
      } 
    }
    return null;
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public void destroyCore(){
   	if(core==null){
      this.newborn=false;
      return;
    }
    if(core==null)
      return;
    getFileName();
    if(fileName!=null && fileName.endsWith("jar")){
      Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
      ObjectName query;
      try {
        this.setCore(null);
        this.setNewborn(false);
        String[] signature={"java.lang.String"};
        String[] params=new String[1];
        params[0] = fileName;
        query = new ObjectName("jonas:j2eeType=J2EEServer,*");
        ObjectName server=(ObjectName)mgmt.queryNames(query, null).iterator().next();
        mgmt.invoke(server, "unDeployJar", params, signature);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } 
    }
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public boolean isForCore(Object arg0){
   	boolean result=true;
    if(core!=null && core.equals(arg0))
  result=true;
else
  result=false;
    return result;
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
    switch(featureID){
  
  }
    return result;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSessionTimeOut()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return sessionTimeOut;	
        
    return sessionTimeOut; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSessionTimeOut(int newSessionTimeOut)
  {
    int oldSessionTimeOut = sessionTimeOut;
    sessionTimeOut = newSessionTimeOut;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    try {
      Attribute ab=new Attribute(
          "sessionTimeOut",
          new Integer(sessionTimeOut)
        );
      mainEntry.setAttribute(core,ab);
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.SESSION_BEAN__SESSION_TIME_OUT, oldSessionTimeOut, sessionTimeOut));
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
      case JOnASPackage.SESSION_BEAN__SESSION_TIME_OUT:
        return new Integer(getSessionTimeOut());
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
      case JOnASPackage.SESSION_BEAN__SESSION_TIME_OUT:
        setSessionTimeOut(((Integer)newValue).intValue());
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
      case JOnASPackage.SESSION_BEAN__SESSION_TIME_OUT:
        setSessionTimeOut(SESSION_TIME_OUT_EDEFAULT);
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
      case JOnASPackage.SESSION_BEAN__SESSION_TIME_OUT:
        return sessionTimeOut != SESSION_TIME_OUT_EDEFAULT;
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
    result.append(" (sessionTimeOut: ");
    result.append(sessionTimeOut);
    result.append(')');
    return result.toString();
  }

} //SessionBeanImpl
