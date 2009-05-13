/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.impl;

import JOnAS.EJB;
import JOnAS.JOnASPackage;

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
 * An implementation of the model object '<em><b>EJB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JOnAS.impl.EJBImpl#getJndiName <em>Jndi Name</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getLocalClass <em>Local Class</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getLocalHomeClass <em>Local Home Class</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getHomeClass <em>Home Class</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getCacheSize <em>Cache Size</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getMaxCacheSize <em>Max Cache Size</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getMinPoolSize <em>Min Pool Size</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link JOnAS.impl.EJBImpl#getDataSourceJNDI <em>Data Source JNDI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EJBImpl  extends J2EEManagedObjectImpl implements EJB
{
  /**
   * The default value of the '{@link #getJndiName() <em>Jndi Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJndiName()
   * @generated
   * @ordered
   */
  protected static final String JNDI_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJndiName() <em>Jndi Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJndiName()
   * @generated
   * @ordered
   */
  protected String jndiName = JNDI_NAME_EDEFAULT;

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
   * The default value of the '{@link #getLocalClass() <em>Local Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalClass()
   * @generated
   * @ordered
   */
  protected static final String LOCAL_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocalClass() <em>Local Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalClass()
   * @generated
   * @ordered
   */
  protected String localClass = LOCAL_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getLocalHomeClass() <em>Local Home Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalHomeClass()
   * @generated
   * @ordered
   */
  protected static final String LOCAL_HOME_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocalHomeClass() <em>Local Home Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalHomeClass()
   * @generated
   * @ordered
   */
  protected String localHomeClass = LOCAL_HOME_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getHomeClass() <em>Home Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHomeClass()
   * @generated
   * @ordered
   */
  protected static final String HOME_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHomeClass() <em>Home Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHomeClass()
   * @generated
   * @ordered
   */
  protected String homeClass = HOME_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getEjbClass() <em>Ejb Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEjbClass()
   * @generated
   * @ordered
   */
  protected static final String EJB_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEjbClass() <em>Ejb Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEjbClass()
   * @generated
   * @ordered
   */
  protected String ejbClass = EJB_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getCacheSize() <em>Cache Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCacheSize()
   * @generated
   * @ordered
   */
  protected static final int CACHE_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCacheSize() <em>Cache Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCacheSize()
   * @generated
   * @ordered
   */
  protected int cacheSize = CACHE_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoolSize()
   * @generated
   * @ordered
   */
  protected static final int POOL_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoolSize()
   * @generated
   * @ordered
   */
  protected int poolSize = POOL_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxCacheSize() <em>Max Cache Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxCacheSize()
   * @generated
   * @ordered
   */
  protected static final int MAX_CACHE_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxCacheSize() <em>Max Cache Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxCacheSize()
   * @generated
   * @ordered
   */
  protected int maxCacheSize = MAX_CACHE_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinPoolSize() <em>Min Pool Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinPoolSize()
   * @generated
   * @ordered
   */
  protected static final int MIN_POOL_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinPoolSize() <em>Min Pool Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinPoolSize()
   * @generated
   * @ordered
   */
  protected int minPoolSize = MIN_POOL_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayName()
   * @generated
   * @ordered
   */
  protected static final String DISPLAY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayName()
   * @generated
   * @ordered
   */
  protected String displayName = DISPLAY_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDataSourceJNDI() <em>Data Source JNDI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSourceJNDI()
   * @generated
   * @ordered
   */
  protected static final String DATA_SOURCE_JNDI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDataSourceJNDI() <em>Data Source JNDI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSourceJNDI()
   * @generated
   * @ordered
   */
  protected String dataSourceJNDI = DATA_SOURCE_JNDI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EJBImpl()
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
    return JOnASPackage.Literals.EJB;
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
  public String getJndiName()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return jndiName;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "jndiName");
    } catch (Exception e) {
      e.printStackTrace();
      return jndiName;
    }
if(result==null)
  return jndiName;
jndiName=result.toString();
    return jndiName; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJndiName(String newJndiName)
  {
    String oldJndiName = jndiName;
    jndiName = newJndiName;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__JNDI_NAME, oldJndiName, jndiName));
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
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "fileName");
    } catch (Exception e) {
      e.printStackTrace();
      return fileName;
    }
if(result==null)
  return fileName;
fileName=result.toString();
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
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__FILE_NAME, oldFileName, fileName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocalClass()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return localClass;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "localClass");
    } catch (Exception e) {
      e.printStackTrace();
      return localClass;
    }
if(result==null)
  return localClass;
localClass=result.toString();
    return localClass; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalClass(String newLocalClass)
  {
    String oldLocalClass = localClass;
    localClass = newLocalClass;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__LOCAL_CLASS, oldLocalClass, localClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocalHomeClass()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return localHomeClass;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "localHomeClass");
    } catch (Exception e) {
      e.printStackTrace();
      return localHomeClass;
    }
if(result==null)
  return localHomeClass;
localHomeClass=result.toString();
    return localHomeClass; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalHomeClass(String newLocalHomeClass)
  {
    String oldLocalHomeClass = localHomeClass;
    localHomeClass = newLocalHomeClass;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__LOCAL_HOME_CLASS, oldLocalHomeClass, localHomeClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHomeClass()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return homeClass;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "homeClass");
    } catch (Exception e) {
      e.printStackTrace();
      return homeClass;
    }
if(result==null)
  return homeClass;
homeClass=result.toString();
    return homeClass; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHomeClass(String newHomeClass)
  {
    String oldHomeClass = homeClass;
    homeClass = newHomeClass;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__HOME_CLASS, oldHomeClass, homeClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEjbClass()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return ejbClass;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "ejbClass");
    } catch (Exception e) {
      e.printStackTrace();
      return ejbClass;
    }
if(result==null)
  return ejbClass;
ejbClass=result.toString();
    return ejbClass; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEjbClass(String newEjbClass)
  {
    String oldEjbClass = ejbClass;
    ejbClass = newEjbClass;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__EJB_CLASS, oldEjbClass, ejbClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCacheSize()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return cacheSize;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "cacheSize");
    } catch (Exception e) {
      e.printStackTrace();
      return cacheSize;
    }
if(result==null)
  return cacheSize;
cacheSize=((Integer)result).intValue();
    return cacheSize; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCacheSize(int newCacheSize)
  {
    int oldCacheSize = cacheSize;
    cacheSize = newCacheSize;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__CACHE_SIZE, oldCacheSize, cacheSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPoolSize()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return poolSize;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "poolSize");
    } catch (Exception e) {
      e.printStackTrace();
      return poolSize;
    }
if(result==null)
  return poolSize;
poolSize=((Integer)result).intValue();
    return poolSize; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoolSize(int newPoolSize)
  {
    int oldPoolSize = poolSize;
    poolSize = newPoolSize;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__POOL_SIZE, oldPoolSize, poolSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxCacheSize()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return maxCacheSize;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "maxCacheSize");
    } catch (Exception e) {
      e.printStackTrace();
      return maxCacheSize;
    }
if(result==null)
  return maxCacheSize;
maxCacheSize=((Integer)result).intValue();
    return maxCacheSize; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxCacheSize(int newMaxCacheSize)
  {
    int oldMaxCacheSize = maxCacheSize;
    maxCacheSize = newMaxCacheSize;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__MAX_CACHE_SIZE, oldMaxCacheSize, maxCacheSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinPoolSize()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return minPoolSize;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "minPoolSize");
    } catch (Exception e) {
      e.printStackTrace();
      return minPoolSize;
    }
if(result==null)
  return minPoolSize;
minPoolSize=((Integer)result).intValue();
    return minPoolSize; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinPoolSize(int newMinPoolSize)
  {
    int oldMinPoolSize = minPoolSize;
    minPoolSize = newMinPoolSize;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__MIN_POOL_SIZE, oldMinPoolSize, minPoolSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDisplayName()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return displayName;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "displayName");
    } catch (Exception e) {
      e.printStackTrace();
      return displayName;
    }
if(result==null)
  return displayName;
displayName=result.toString();
    return displayName; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayName(String newDisplayName)
  {
    String oldDisplayName = displayName;
    displayName = newDisplayName;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__DISPLAY_NAME, oldDisplayName, displayName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDataSourceJNDI()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return dataSourceJNDI;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();		
  try {
      Hashtable hs=(Hashtable)mainEntry.getAttribute(core, "allDataSourceName");
      dataSourceJNDI=hs.keySet().iterator().next().toString();
    } catch (Exception e) {
      dataSourceJNDI=null;
    }
    return dataSourceJNDI; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataSourceJNDI(String newDataSourceJNDI)
  {
    String oldDataSourceJNDI = dataSourceJNDI;
    dataSourceJNDI = newDataSourceJNDI;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.EJB__DATA_SOURCE_JNDI, oldDataSourceJNDI, dataSourceJNDI));
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
      case JOnASPackage.EJB__JNDI_NAME:
        return getJndiName();
      case JOnASPackage.EJB__FILE_NAME:
        return getFileName();
      case JOnASPackage.EJB__LOCAL_CLASS:
        return getLocalClass();
      case JOnASPackage.EJB__LOCAL_HOME_CLASS:
        return getLocalHomeClass();
      case JOnASPackage.EJB__HOME_CLASS:
        return getHomeClass();
      case JOnASPackage.EJB__EJB_CLASS:
        return getEjbClass();
      case JOnASPackage.EJB__CACHE_SIZE:
        return new Integer(getCacheSize());
      case JOnASPackage.EJB__POOL_SIZE:
        return new Integer(getPoolSize());
      case JOnASPackage.EJB__MAX_CACHE_SIZE:
        return new Integer(getMaxCacheSize());
      case JOnASPackage.EJB__MIN_POOL_SIZE:
        return new Integer(getMinPoolSize());
      case JOnASPackage.EJB__DISPLAY_NAME:
        return getDisplayName();
      case JOnASPackage.EJB__DATA_SOURCE_JNDI:
        return getDataSourceJNDI();
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
      case JOnASPackage.EJB__JNDI_NAME:
        setJndiName((String)newValue);
        return;
      case JOnASPackage.EJB__FILE_NAME:
        setFileName((String)newValue);
        return;
      case JOnASPackage.EJB__LOCAL_CLASS:
        setLocalClass((String)newValue);
        return;
      case JOnASPackage.EJB__LOCAL_HOME_CLASS:
        setLocalHomeClass((String)newValue);
        return;
      case JOnASPackage.EJB__HOME_CLASS:
        setHomeClass((String)newValue);
        return;
      case JOnASPackage.EJB__EJB_CLASS:
        setEjbClass((String)newValue);
        return;
      case JOnASPackage.EJB__CACHE_SIZE:
        setCacheSize(((Integer)newValue).intValue());
        return;
      case JOnASPackage.EJB__POOL_SIZE:
        setPoolSize(((Integer)newValue).intValue());
        return;
      case JOnASPackage.EJB__MAX_CACHE_SIZE:
        setMaxCacheSize(((Integer)newValue).intValue());
        return;
      case JOnASPackage.EJB__MIN_POOL_SIZE:
        setMinPoolSize(((Integer)newValue).intValue());
        return;
      case JOnASPackage.EJB__DISPLAY_NAME:
        setDisplayName((String)newValue);
        return;
      case JOnASPackage.EJB__DATA_SOURCE_JNDI:
        setDataSourceJNDI((String)newValue);
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
      case JOnASPackage.EJB__JNDI_NAME:
        setJndiName(JNDI_NAME_EDEFAULT);
        return;
      case JOnASPackage.EJB__FILE_NAME:
        setFileName(FILE_NAME_EDEFAULT);
        return;
      case JOnASPackage.EJB__LOCAL_CLASS:
        setLocalClass(LOCAL_CLASS_EDEFAULT);
        return;
      case JOnASPackage.EJB__LOCAL_HOME_CLASS:
        setLocalHomeClass(LOCAL_HOME_CLASS_EDEFAULT);
        return;
      case JOnASPackage.EJB__HOME_CLASS:
        setHomeClass(HOME_CLASS_EDEFAULT);
        return;
      case JOnASPackage.EJB__EJB_CLASS:
        setEjbClass(EJB_CLASS_EDEFAULT);
        return;
      case JOnASPackage.EJB__CACHE_SIZE:
        setCacheSize(CACHE_SIZE_EDEFAULT);
        return;
      case JOnASPackage.EJB__POOL_SIZE:
        setPoolSize(POOL_SIZE_EDEFAULT);
        return;
      case JOnASPackage.EJB__MAX_CACHE_SIZE:
        setMaxCacheSize(MAX_CACHE_SIZE_EDEFAULT);
        return;
      case JOnASPackage.EJB__MIN_POOL_SIZE:
        setMinPoolSize(MIN_POOL_SIZE_EDEFAULT);
        return;
      case JOnASPackage.EJB__DISPLAY_NAME:
        setDisplayName(DISPLAY_NAME_EDEFAULT);
        return;
      case JOnASPackage.EJB__DATA_SOURCE_JNDI:
        setDataSourceJNDI(DATA_SOURCE_JNDI_EDEFAULT);
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
      case JOnASPackage.EJB__JNDI_NAME:
        return JNDI_NAME_EDEFAULT == null ? jndiName != null : !JNDI_NAME_EDEFAULT.equals(jndiName);
      case JOnASPackage.EJB__FILE_NAME:
        return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
      case JOnASPackage.EJB__LOCAL_CLASS:
        return LOCAL_CLASS_EDEFAULT == null ? localClass != null : !LOCAL_CLASS_EDEFAULT.equals(localClass);
      case JOnASPackage.EJB__LOCAL_HOME_CLASS:
        return LOCAL_HOME_CLASS_EDEFAULT == null ? localHomeClass != null : !LOCAL_HOME_CLASS_EDEFAULT.equals(localHomeClass);
      case JOnASPackage.EJB__HOME_CLASS:
        return HOME_CLASS_EDEFAULT == null ? homeClass != null : !HOME_CLASS_EDEFAULT.equals(homeClass);
      case JOnASPackage.EJB__EJB_CLASS:
        return EJB_CLASS_EDEFAULT == null ? ejbClass != null : !EJB_CLASS_EDEFAULT.equals(ejbClass);
      case JOnASPackage.EJB__CACHE_SIZE:
        return cacheSize != CACHE_SIZE_EDEFAULT;
      case JOnASPackage.EJB__POOL_SIZE:
        return poolSize != POOL_SIZE_EDEFAULT;
      case JOnASPackage.EJB__MAX_CACHE_SIZE:
        return maxCacheSize != MAX_CACHE_SIZE_EDEFAULT;
      case JOnASPackage.EJB__MIN_POOL_SIZE:
        return minPoolSize != MIN_POOL_SIZE_EDEFAULT;
      case JOnASPackage.EJB__DISPLAY_NAME:
        return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
      case JOnASPackage.EJB__DATA_SOURCE_JNDI:
        return DATA_SOURCE_JNDI_EDEFAULT == null ? dataSourceJNDI != null : !DATA_SOURCE_JNDI_EDEFAULT.equals(dataSourceJNDI);
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
    result.append(" (jndiName: ");
    result.append(jndiName);
    result.append(", fileName: ");
    result.append(fileName);
    result.append(", localClass: ");
    result.append(localClass);
    result.append(", localHomeClass: ");
    result.append(localHomeClass);
    result.append(", homeClass: ");
    result.append(homeClass);
    result.append(", ejbClass: ");
    result.append(ejbClass);
    result.append(", cacheSize: ");
    result.append(cacheSize);
    result.append(", poolSize: ");
    result.append(poolSize);
    result.append(", maxCacheSize: ");
    result.append(maxCacheSize);
    result.append(", minPoolSize: ");
    result.append(minPoolSize);
    result.append(", displayName: ");
    result.append(displayName);
    result.append(", dataSourceJNDI: ");
    result.append(dataSourceJNDI);
    result.append(')');
    return result.toString();
  }

} //EJBImpl
