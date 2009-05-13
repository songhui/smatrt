
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

import org.eclipse.emf.ecore.util.InternalEList;

import uml.PackageableElement;
import uml.Type;
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
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.PackageImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml.impl.PackageImpl#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl  extends PackageableElementImpl implements uml.Package
{
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
   * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackagedElement()
   * @generated
   * @ordered
   */
  protected EList<PackageableElement> packagedElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageImpl()
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
    return UmlPackage.Literals.PACKAGE;
  }

  
  
  public static class FieldWrap{
  JavaClass src;
  JavaClass tgt;
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
    result=core.equals(arg0);
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
  
    String core=(String)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
    case UmlPackage.PACKAGE__OWNED_TYPE:
  
      
    break;
    
  
    case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
  
      try{
      ArrayList<PackageImpl.FieldWrap> fields=new ArrayList<PackageImpl.FieldWrap>();
      java.util.jar.JarFile jarFile=(java.util.jar.JarFile)((ModelImpl)this.eContainer()).getCore();
      for(Enumeration<JarEntry> entries = jarFile.entries(); 
        entries.hasMoreElements();){
        JarEntry entry=entries.nextElement();
        String ename=entry.getName();
        int last=ename.lastIndexOf("/");
        String prefix=ename.substring(0,last+1);
        if(ename.endsWith(".class") && prefix.equals(core)){
          InputStream input=jarFile.getInputStream(entry);
          ClassParser parser=new ClassParser(input, entry.getName());
          JavaClass clazz=parser.parse();
          result.add(clazz);
          Field[] fd=clazz.getFields();
          for(int i=0;i<fd.length;i++){
            String tmp=fd[i].getType().getSignature();
            if(tmp.length()<3) continue;
            String type_str=tmp.substring(1,tmp.length()-1);
            if(!type_str.startsWith(core.toString()))
              continue;
            String entryPath=type_str+".class";
            JarEntry fentry=jarFile.getJarEntry(entryPath);
            InputStream in=jarFile.getInputStream(fentry);
            ClassParser np=new ClassParser(in,fentry.getName());
            JavaClass tclazz=np.parse();
            FieldWrap fw=new FieldWrap();
            fw.src=clazz;
            fw.tgt=tclazz;
            fields.add(fw);
          }
        }
      }	
      for(FieldWrap fw:fields) result.add(fw);			
    }
    catch(Exception e){
      e.printStackTrace();
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
  
  
    if(object instanceof JavaClass)
      return pack.getClass_();
      
      
    if(object instanceof PackageImpl.FieldWrap)
      return pack.getAssociation();
      
      
    
  
    return null;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getOwnedType()
  {
    // TODO: implement this method to return the 'Owned Type' reference list
    // Ensure that you remove @generated or mark it @generated NOT
    // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
    // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
        Object result=null;
        String core=(String)getCore();
        if(core==null) return name;	
        name=core.replace('/','.');
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
        	
      String core=(String)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE__NAME, oldName, name));
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
          UmlPackage.PACKAGE__PACKAGED_ELEMENT,
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
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
      case UmlPackage.PACKAGE__OWNED_TYPE:
        return getOwnedType();
      case UmlPackage.PACKAGE__NAME:
        return getName();
      case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
        return getPackagedElement();
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
      case UmlPackage.PACKAGE__OWNED_TYPE:
        getOwnedType().clear();
        getOwnedType().addAll((Collection<? extends Type>)newValue);
        return;
      case UmlPackage.PACKAGE__NAME:
        setName((String)newValue);
        return;
      case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
        getPackagedElement().clear();
        getPackagedElement().addAll((Collection<? extends PackageableElement>)newValue);
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
      case UmlPackage.PACKAGE__OWNED_TYPE:
        getOwnedType().clear();
        return;
      case UmlPackage.PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
        getPackagedElement().clear();
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
      case UmlPackage.PACKAGE__OWNED_TYPE:
        return !getOwnedType().isEmpty();
      case UmlPackage.PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UmlPackage.PACKAGE__PACKAGED_ELEMENT:
        return packagedElement != null && !packagedElement.isEmpty();
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

} //PackageImpl
