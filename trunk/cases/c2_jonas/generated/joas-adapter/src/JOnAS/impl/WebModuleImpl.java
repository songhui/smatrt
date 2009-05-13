/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.impl;

import JOnAS.JOnASPackage;
import JOnAS.MBeanServer;
import JOnAS.WebModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
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
 * An implementation of the model object '<em><b>Web Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JOnAS.impl.WebModuleImpl#getPath <em>Path</em>}</li>
 *   <li>{@link JOnAS.impl.WebModuleImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link JOnAS.impl.WebModuleImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link JOnAS.impl.WebModuleImpl#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link JOnAS.impl.WebModuleImpl#getWarURL <em>War URL</em>}</li>
 *   <li>{@link JOnAS.impl.WebModuleImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link JOnAS.impl.WebModuleImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link JOnAS.impl.WebModuleImpl#getEjbref <em>Ejbref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebModuleImpl  extends J2EEManagedObjectImpl implements WebModule
{
  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartTime()
   * @generated
   * @ordered
   */
  protected static final long START_TIME_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartTime()
   * @generated
   * @ordered
   */
  protected long startTime = START_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected static final String HOSTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected String hostname = HOSTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartupTime()
   * @generated
   * @ordered
   */
  protected static final long STARTUP_TIME_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartupTime()
   * @generated
   * @ordered
   */
  protected long startupTime = STARTUP_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getWarURL() <em>War URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarURL()
   * @generated
   * @ordered
   */
  protected static final String WAR_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWarURL() <em>War URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarURL()
   * @generated
   * @ordered
   */
  protected String warURL = WAR_URL_EDEFAULT;

  /**
   * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileName()
   * @generated
   * @ordered
   */
  protected static final String FILE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileName()
   * @generated
   * @ordered
   */
  protected String fileName = FILE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getEjbref() <em>Ejbref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEjbref()
   * @generated
   * @ordered
   */
  protected static final String EJBREF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEjbref() <em>Ejbref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEjbref()
   * @generated
   * @ordered
   */
  protected String ejbref = EJBREF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WebModuleImpl()
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
    return JOnASPackage.Literals.WEB_MODULE;
  }
  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createCore(){
    if(fileName==null && warURL!=null && warURL.endsWith("war")){
      if(warURL.startsWith("file:"))
        fileName=warURL.substring(5);
      else
        fileName=warURL;
    }
    if(fileName!=null && fileName.endsWith("war")){
      Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
      ObjectName query;
      try {
        this.setNewborn(false);
        String[] signature={"java.lang.String"};
        String[] params=new String[1];
        params[0] = fileName;
        query = new ObjectName("jonas:j2eeType=J2EEServer,*");
        ObjectName server=(ObjectName)mgmt.queryNames(query, null).iterator().next();
        mgmt.invoke(server, "deployWar", params, signature);
        query=new ObjectName("jonas:j2eeType=WebModule,*");
        Set allModules=mgmt.queryNames(query, null);
        ObjectName res=null;
        for(Iterator it=allModules.iterator();it.hasNext();){
          ObjectName obj=(ObjectName)it.next();
          String checkWarURL=mgmt.getAttribute(obj, "warURL").toString();
          if(checkWarURL!=null && checkWarURL.endsWith(fileName)){
            res=obj;
            break;
          }
        }
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
    if(warURL==null)
      getWarURL();
    if(fileName==null && warURL!=null && warURL.endsWith("war")){
      if(warURL.startsWith("file:"))
        fileName=warURL.substring(5);
      else
        fileName=warURL;
    }
    if(fileName!=null && fileName.endsWith("war")){
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
        mgmt.invoke(server, "unDeployWar", params, signature);
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
  public String getPath()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return path;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "path");
    } catch (Exception e) {
      e.printStackTrace();
      return path;
    }
if(result==null)
  return path;
path=result.toString();
    return path; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.WEB_MODULE__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getStartTime()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return startTime;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "startTime");
    } catch (Exception e) {
      e.printStackTrace();
      return startTime;
    }
if(result==null)
  return startTime;
startTime=((Long)result).longValue();
    return startTime; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartTime(long newStartTime)
  {
    long oldStartTime = startTime;
    startTime = newStartTime;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.WEB_MODULE__START_TIME, oldStartTime, startTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHostname()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return hostname;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "hostname");
    } catch (Exception e) {
      e.printStackTrace();
      return hostname;
    }
if(result==null)
  return hostname;
hostname=result.toString();
    return hostname; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostname(String newHostname)
  {
    String oldHostname = hostname;
    hostname = newHostname;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.WEB_MODULE__HOSTNAME, oldHostname, hostname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getStartupTime()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return startupTime;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "startupTime");
    } catch (Exception e) {
      e.printStackTrace();
      return startupTime;
    }
if(result==null)
  return startupTime;
startupTime=((Long)result).longValue();
    return startupTime; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartupTime(long newStartupTime)
  {
    long oldStartupTime = startupTime;
    startupTime = newStartupTime;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.WEB_MODULE__STARTUP_TIME, oldStartupTime, startupTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWarURL()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return warURL;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "warURL");
    } catch (Exception e) {
      e.printStackTrace();
      return warURL;
    }
if(result==null)
  return warURL;
warURL=result.toString();
    return warURL; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWarURL(String newWarURL)
  {
    String oldWarURL = warURL;
    warURL = newWarURL;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.WEB_MODULE__WAR_URL, oldWarURL, warURL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MBeanServer getParent()
  {
    if (eContainerFeatureID != JOnASPackage.WEB_MODULE__PARENT) return null;
    return (MBeanServer)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(MBeanServer newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, JOnASPackage.WEB_MODULE__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(MBeanServer newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID != JOnASPackage.WEB_MODULE__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, JOnASPackage.MBEAN_SERVER__WEB_MODULE, MBeanServer.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.WEB_MODULE__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFileName()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return fileName;	
        
    return fileName; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileName(String newFileName)
  {
    String oldFileName = fileName;
    fileName = newFileName;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.WEB_MODULE__FILE_NAME, oldFileName, fileName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEjbref()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return ejbref;	
        ejbref=null;
try{
      Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
      String descriptor=(String)mainEntry.getAttribute(core, "jonasDeploymentDescriptor");
      if(descriptor==null||!descriptor.contains("jonas-ejb-ref"))
        return ejbref;
      DOMImplementation impl 
           = DOMImplementationImpl.getDOMImplementation();
      DocumentBuilderFactory factory= DocumentBuilderFactoryImpl.newInstance();
      DocumentBuilder db=factory.newDocumentBuilder();			
      Document doc=db.parse(new StringBufferInputStream(descriptor));
      String xpathString="jonas-web-app/jonas-ejb-ref/jndi-name";
      NodeIterator nl = XPathAPI.selectNodeIterator(doc, xpathString);
      Element nd=(Element)nl.nextNode();
      ejbref=nd.getFirstChild().getTextContent();
    }
    catch(Exception e){
      ;
    }
    return ejbref; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEjbref(String newEjbref)
  {
    String oldEjbref = ejbref;
    ejbref = newEjbref;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.WEB_MODULE__EJBREF, oldEjbref, ejbref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JOnASPackage.WEB_MODULE__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((MBeanServer)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case JOnASPackage.WEB_MODULE__PARENT:
        return basicSetParent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
      case JOnASPackage.WEB_MODULE__PARENT:
        return eInternalContainer().eInverseRemove(this, JOnASPackage.MBEAN_SERVER__WEB_MODULE, MBeanServer.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case JOnASPackage.WEB_MODULE__PATH:
        return getPath();
      case JOnASPackage.WEB_MODULE__START_TIME:
        return new Long(getStartTime());
      case JOnASPackage.WEB_MODULE__HOSTNAME:
        return getHostname();
      case JOnASPackage.WEB_MODULE__STARTUP_TIME:
        return new Long(getStartupTime());
      case JOnASPackage.WEB_MODULE__WAR_URL:
        return getWarURL();
      case JOnASPackage.WEB_MODULE__PARENT:
        return getParent();
      case JOnASPackage.WEB_MODULE__FILE_NAME:
        return getFileName();
      case JOnASPackage.WEB_MODULE__EJBREF:
        return getEjbref();
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
      case JOnASPackage.WEB_MODULE__PATH:
        setPath((String)newValue);
        return;
      case JOnASPackage.WEB_MODULE__START_TIME:
        setStartTime(((Long)newValue).longValue());
        return;
      case JOnASPackage.WEB_MODULE__HOSTNAME:
        setHostname((String)newValue);
        return;
      case JOnASPackage.WEB_MODULE__STARTUP_TIME:
        setStartupTime(((Long)newValue).longValue());
        return;
      case JOnASPackage.WEB_MODULE__WAR_URL:
        setWarURL((String)newValue);
        return;
      case JOnASPackage.WEB_MODULE__PARENT:
        setParent((MBeanServer)newValue);
        return;
      case JOnASPackage.WEB_MODULE__FILE_NAME:
        setFileName((String)newValue);
        return;
      case JOnASPackage.WEB_MODULE__EJBREF:
        setEjbref((String)newValue);
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
      case JOnASPackage.WEB_MODULE__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case JOnASPackage.WEB_MODULE__START_TIME:
        setStartTime(START_TIME_EDEFAULT);
        return;
      case JOnASPackage.WEB_MODULE__HOSTNAME:
        setHostname(HOSTNAME_EDEFAULT);
        return;
      case JOnASPackage.WEB_MODULE__STARTUP_TIME:
        setStartupTime(STARTUP_TIME_EDEFAULT);
        return;
      case JOnASPackage.WEB_MODULE__WAR_URL:
        setWarURL(WAR_URL_EDEFAULT);
        return;
      case JOnASPackage.WEB_MODULE__PARENT:
        setParent((MBeanServer)null);
        return;
      case JOnASPackage.WEB_MODULE__FILE_NAME:
        setFileName(FILE_NAME_EDEFAULT);
        return;
      case JOnASPackage.WEB_MODULE__EJBREF:
        setEjbref(EJBREF_EDEFAULT);
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
      case JOnASPackage.WEB_MODULE__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case JOnASPackage.WEB_MODULE__START_TIME:
        return startTime != START_TIME_EDEFAULT;
      case JOnASPackage.WEB_MODULE__HOSTNAME:
        return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
      case JOnASPackage.WEB_MODULE__STARTUP_TIME:
        return startupTime != STARTUP_TIME_EDEFAULT;
      case JOnASPackage.WEB_MODULE__WAR_URL:
        return WAR_URL_EDEFAULT == null ? warURL != null : !WAR_URL_EDEFAULT.equals(warURL);
      case JOnASPackage.WEB_MODULE__PARENT:
        return getParent() != null;
      case JOnASPackage.WEB_MODULE__FILE_NAME:
        return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
      case JOnASPackage.WEB_MODULE__EJBREF:
        return EJBREF_EDEFAULT == null ? ejbref != null : !EJBREF_EDEFAULT.equals(ejbref);
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
    result.append(" (path: ");
    result.append(path);
    result.append(", startTime: ");
    result.append(startTime);
    result.append(", hostname: ");
    result.append(hostname);
    result.append(", startupTime: ");
    result.append(startupTime);
    result.append(", warURL: ");
    result.append(warURL);
    result.append(", fileName: ");
    result.append(fileName);
    result.append(", ejbref: ");
    result.append(ejbref);
    result.append(')');
    return result.toString();
  }

} //WebModuleImpl
