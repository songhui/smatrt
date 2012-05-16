
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Classifier;
import uml.Generalization;
import uml.Operation;
import uml.Property;
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
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ClassImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl  extends ClassifierImpl implements uml.Class
{
  /**
   * The cached value of the '{@link #getNestedClassifier() <em>Nested Classifier</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedClassifier()
   * @generated
   * @ordered
   */
  protected EList<Classifier> nestedClassifier;

  /**
   * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedOperation()
   * @generated
   * @ordered
   */
  protected EList<Operation> ownedOperation;

  /**
   * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsActive()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ACTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsActive()
   * @generated
   * @ordered
   */
  protected boolean isActive = IS_ACTIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedAttribute()
   * @generated
   * @ordered
   */
  protected EList<Property> ownedAttribute;

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
   * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralization()
   * @generated
   * @ordered
   */
  protected EList<Generalization> generalization;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return UmlPackage.Literals.CLASS;
  }

  
  
  public class ClassWrap{
  public JavaClass clazz;
}
boolean hasAttribute=false;
ArrayList attr=new ArrayList();
  

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public boolean isForCore(Object arg0){
   	boolean result=true;
   	if(core==null) return false;
    try{
    result=((JavaClass)core).getClassName().equals(((JavaClass)arg0).getClassName());
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
  
    JavaClass core=(JavaClass)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
    case UmlPackage.CLASS__NESTED_CLASSIFIER:
  
      
    break;
    
    case UmlPackage.CLASS__OWNED_OPERATION:
  
      
    break;
    
    case UmlPackage.CLASS__SUPER_CLASS:
  
      
    break;
    
  
    case UmlPackage.CLASS__OWNED_ATTRIBUTE:
  
      if(hasAttribute){
        return attr;
      }
      hasAttribute=true;			
      Field[] fd=core.getFields();
      for(int i=0;i<fd.length;i++){
        org.apache.bcel.generic.Type tp=fd[i].getType();
        if(tp instanceof BasicType) {
          AssociationImpl.ClassWrap cw=new AssociationImpl.ClassWrap();
          cw.id=AssociationImpl.random.nextLong();
          cw.name=fd[i].getName();
          result.add(cw);
          attr.add(cw);
        }
      }
    break;
    
  
    case UmlPackage.CLASS__GENERALIZATION:
  
      try{
JavaClass[] sup=core.getSuperClasses();
for(int i=0;i<sup.length;i++){
  if(!sup[i].getClassName().startsWith((String)((PackageImpl)eContainer()).getName()))
    break;
  ClassWrap cw=new ClassWrap();
  cw.clazz=sup[i];
  result.add(cw);
  break;
}
}
catch(Exception e){}
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
  
  
  
    return null;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Classifier> getNestedClassifier()
  {

    
    if (nestedClassifier == null)
    {
  
  
    
      nestedClassifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, UmlPackage.CLASS__NESTED_CLASSIFIER);
    
      nestedClassifier = new EObjectContainmentEListForWrapping<Classifier>(
          Classifier.class, 
          this, 
          UmlPackage.CLASS__NESTED_CLASSIFIER,
          UmlPackage.eINSTANCE.getClassifier()
        );
        
  }
  
    return nestedClassifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOwnedOperation()
  {

    
    if (ownedOperation == null)
    {
  
  
    
      ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, UmlPackage.CLASS__OWNED_OPERATION, UmlPackage.OPERATION__CLASS);
    
      ownedOperation = new EObjectContainmentEListForWrapping<Operation>(
          Operation.class, 
          this, 
          UmlPackage.CLASS__OWNED_OPERATION,
          UmlPackage.eINSTANCE.getOperation()
        );
        
  }
  
    return ownedOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<uml.Class> getSuperClass()
  {
    // TODO: implement this method to return the 'Super Class' reference list
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
  public boolean isIsActive()
  {
        Object result=null;
        JavaClass core=(JavaClass)getCore();
        if(core==null) return isActive;
    return isActive; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsActive(boolean newIsActive)
  {
    boolean oldIsActive = isActive;
    isActive = newIsActive;
        	
      JavaClass core=(JavaClass)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASS__IS_ACTIVE, oldIsActive, isActive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getOwnedAttribute()
  {

    
    if (ownedAttribute == null)
    {
  
  
    
      ownedAttribute = new EObjectContainmentEListForWrapping<Property>(
          Property.class, 
          this, 
          UmlPackage.CLASS__OWNED_ATTRIBUTE,
          UmlPackage.eINSTANCE.getProperty()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<Property>)ownedAttribute)
    .refreshWrap();
  
    return ownedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
        Object result=null;
        JavaClass core=(JavaClass)getCore();
        if(core==null) return name;	
        String ename=core.getClassName();
int lst=ename.lastIndexOf(".");
name=ename.substring(lst+1);
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
        	
      JavaClass core=(JavaClass)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Generalization> getGeneralization()
  {

    
    if (generalization == null)
    {
  
  
    
      generalization = new EObjectContainmentEListForWrapping<Generalization>(
          Generalization.class, 
          this, 
          UmlPackage.CLASS__GENERALIZATION,
          UmlPackage.eINSTANCE.getGeneralization()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<Generalization>)generalization)
    .refreshWrap();
  
    return generalization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UmlPackage.CLASS__OWNED_OPERATION:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
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
      case UmlPackage.CLASS__NESTED_CLASSIFIER:
        return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
      case UmlPackage.CLASS__OWNED_OPERATION:
        return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
      case UmlPackage.CLASS__OWNED_ATTRIBUTE:
        return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
      case UmlPackage.CLASS__GENERALIZATION:
        return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
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
      case UmlPackage.CLASS__NESTED_CLASSIFIER:
        return getNestedClassifier();
      case UmlPackage.CLASS__OWNED_OPERATION:
        return getOwnedOperation();
      case UmlPackage.CLASS__SUPER_CLASS:
        return getSuperClass();
      case UmlPackage.CLASS__IS_ACTIVE:
        return isIsActive() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.CLASS__OWNED_ATTRIBUTE:
        return getOwnedAttribute();
      case UmlPackage.CLASS__NAME:
        return getName();
      case UmlPackage.CLASS__GENERALIZATION:
        return getGeneralization();
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
      case UmlPackage.CLASS__NESTED_CLASSIFIER:
        getNestedClassifier().clear();
        getNestedClassifier().addAll((Collection<? extends Classifier>)newValue);
        return;
      case UmlPackage.CLASS__OWNED_OPERATION:
        getOwnedOperation().clear();
        getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
        return;
      case UmlPackage.CLASS__SUPER_CLASS:
        getSuperClass().clear();
        getSuperClass().addAll((Collection<? extends uml.Class>)newValue);
        return;
      case UmlPackage.CLASS__IS_ACTIVE:
        setIsActive(((Boolean)newValue).booleanValue());
        return;
      case UmlPackage.CLASS__OWNED_ATTRIBUTE:
        getOwnedAttribute().clear();
        getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
        return;
      case UmlPackage.CLASS__NAME:
        setName((String)newValue);
        return;
      case UmlPackage.CLASS__GENERALIZATION:
        getGeneralization().clear();
        getGeneralization().addAll((Collection<? extends Generalization>)newValue);
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
      case UmlPackage.CLASS__NESTED_CLASSIFIER:
        getNestedClassifier().clear();
        return;
      case UmlPackage.CLASS__OWNED_OPERATION:
        getOwnedOperation().clear();
        return;
      case UmlPackage.CLASS__SUPER_CLASS:
        getSuperClass().clear();
        return;
      case UmlPackage.CLASS__IS_ACTIVE:
        setIsActive(IS_ACTIVE_EDEFAULT);
        return;
      case UmlPackage.CLASS__OWNED_ATTRIBUTE:
        getOwnedAttribute().clear();
        return;
      case UmlPackage.CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UmlPackage.CLASS__GENERALIZATION:
        getGeneralization().clear();
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
      case UmlPackage.CLASS__NESTED_CLASSIFIER:
        return nestedClassifier != null && !nestedClassifier.isEmpty();
      case UmlPackage.CLASS__OWNED_OPERATION:
        return ownedOperation != null && !ownedOperation.isEmpty();
      case UmlPackage.CLASS__SUPER_CLASS:
        return !getSuperClass().isEmpty();
      case UmlPackage.CLASS__IS_ACTIVE:
        return isActive != IS_ACTIVE_EDEFAULT;
      case UmlPackage.CLASS__OWNED_ATTRIBUTE:
        return ownedAttribute != null && !ownedAttribute.isEmpty();
      case UmlPackage.CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UmlPackage.CLASS__GENERALIZATION:
        return generalization != null && !generalization.isEmpty();
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
    result.append(" (isActive: ");
    result.append(isActive);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ClassImpl
