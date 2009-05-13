
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import uml.Model;
import uml.PackageableElement;
import uml.UmlPackage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.Field;
import java.util.Random;
import org.apache.bcel.generic.BasicType;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectContainmentEListForWrapping;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.ImagePool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ModelImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.impl.ModelImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends WrappingEObjectImpl implements Model
{
  /**
   * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackagedElement()
   * @generated
   * @ordered
   */
  protected EList<PackageableElement> packagedElement;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return UmlPackage.Literals.MODEL;
  }

  
  

  
  

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public Object lookupCore(){
    Object result=null;
    try {
      result = new java.util.jar.JarFile("D:\\test\\bcel.jar");
      ImagePool.reset();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
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
  
    java.util.jar.JarFile core=(java.util.jar.JarFile)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
    case UmlPackage.MODEL__PACKAGED_ELEMENT:
  
      Set<String> pks=new HashSet<String>();
    for(Enumeration<JarEntry> entries =core.entries();entries.hasMoreElements();){
      JarEntry entry=entries.nextElement();
      String ename=entry.getName();
      if(entry.getName().endsWith(".class")){
        int lst=ename.lastIndexOf("/");
        pks.add(ename.substring(0,lst+1));
      }
    }
    for(String s:pks){
      result.add(s);
    }
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
    UmlPackage pack=UmlPackage.eINSTANCE;	
  
    if(object instanceof String)
      return pack.getPackage();
      
      
    
  
  
    return null;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PackageableElement> getPackagedElement()
  {

    
    if (packagedElement == null)
    {
  
  
    
      packagedElement = new EObjectContainmentEListForWrapping<PackageableElement>(
          PackageableElement.class, 
          this, 
          UmlPackage.MODEL__PACKAGED_ELEMENT,
          UmlPackage.eINSTANCE.getPackageableElement()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<PackageableElement>)packagedElement)
    .refreshWrap();
  
    return packagedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
        Object result=null;
        java.util.jar.JarFile core=(java.util.jar.JarFile)getCore();
        if(core==null) return name;
    return name; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
        	
      java.util.jar.JarFile core=(java.util.jar.JarFile)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MODEL__NAME, oldName, name));
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
      case UmlPackage.MODEL__PACKAGED_ELEMENT:
        return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
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
      case UmlPackage.MODEL__PACKAGED_ELEMENT:
        return getPackagedElement();
      case UmlPackage.MODEL__NAME:
        return getName();
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
      case UmlPackage.MODEL__PACKAGED_ELEMENT:
        getPackagedElement().clear();
        getPackagedElement().addAll((Collection<? extends PackageableElement>)newValue);
        return;
      case UmlPackage.MODEL__NAME:
        setName((String)newValue);
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
      case UmlPackage.MODEL__PACKAGED_ELEMENT:
        getPackagedElement().clear();
        return;
      case UmlPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
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
      case UmlPackage.MODEL__PACKAGED_ELEMENT:
        return packagedElement != null && !packagedElement.isEmpty();
      case UmlPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
