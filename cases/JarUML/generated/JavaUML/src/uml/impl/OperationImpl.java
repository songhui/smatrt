
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.Operation;
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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.OperationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml.impl.OperationImpl#getRedefinedOperation <em>Redefined Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl  extends BehavioralFeatureImpl implements Operation
{
  /**
   * The default value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsQuery()
   * @generated
   * @ordered
   */
  protected static final boolean IS_QUERY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsQuery()
   * @generated
   * @ordered
   */
  protected boolean isQuery = IS_QUERY_EDEFAULT;

  /**
   * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsOrdered()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ORDERED_EDEFAULT = false;

  /**
   * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsUnique()
   * @generated
   * @ordered
   */
  protected static final boolean IS_UNIQUE_EDEFAULT = true;

  /**
   * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected static final int LOWER_EDEFAULT = 1;

  /**
   * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected static final int UPPER_EDEFAULT = 1;

  /**
   * The cached value of the '{@link #getRedefinedOperation() <em>Redefined Operation</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRedefinedOperation()
   * @generated
   * @ordered
   */
  protected EList<Operation> redefinedOperation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return UmlPackage.Literals.OPERATION;
  }

  
  

  
  

  
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
  
    Object core=(Object)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
  
  
  
  
  
  
    case UmlPackage.OPERATION__REDEFINED_OPERATION:
  
      
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
  public uml.Class getClass_()
  {
    if (eContainerFeatureID != UmlPackage.OPERATION__CLASS) return null;
    return (uml.Class)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(uml.Class newClass, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newClass, UmlPackage.OPERATION__CLASS, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(uml.Class newClass)
  {
    if (newClass != eInternalContainer() || (eContainerFeatureID != UmlPackage.OPERATION__CLASS && newClass != null))
    {
      if (EcoreUtil.isAncestor(this, newClass))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, UmlPackage.CLASS__OWNED_OPERATION, uml.Class.class, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsQuery()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return isQuery;
    return isQuery; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsQuery(boolean newIsQuery)
  {
    boolean oldIsQuery = isQuery;
    isQuery = newIsQuery;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OPERATION__IS_QUERY, oldIsQuery, isQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsOrdered()
  {
    // TODO: implement this method to return the 'Is Ordered' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsOrdered(boolean newIsOrdered)
  {
    // TODO: implement this method to set the 'Is Ordered' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsUnique()
  {
    // TODO: implement this method to return the 'Is Unique' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsUnique(boolean newIsUnique)
  {
    // TODO: implement this method to set the 'Is Unique' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLower()
  {
    // TODO: implement this method to return the 'Lower' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLower(int newLower)
  {
    // TODO: implement this method to set the 'Lower' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUpper()
  {
    // TODO: implement this method to return the 'Upper' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpper(int newUpper)
  {
    // TODO: implement this method to set the 'Upper' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getRedefinedOperation()
  {

    
    if (redefinedOperation == null)
    {
  
  
    
      redefinedOperation = new EObjectResolvingEList<Operation>(Operation.class, this, UmlPackage.OPERATION__REDEFINED_OPERATION);
    
      redefinedOperation = new EObjectContainmentEListForWrapping<Operation>(
          Operation.class, 
          this, 
          UmlPackage.OPERATION__REDEFINED_OPERATION,
          UmlPackage.eINSTANCE.getOperation()
        );
        
  }
  
    return redefinedOperation;
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
      case UmlPackage.OPERATION__CLASS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetClass((uml.Class)otherEnd, msgs);
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
      case UmlPackage.OPERATION__CLASS:
        return basicSetClass(null, msgs);
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
      case UmlPackage.OPERATION__CLASS:
        return eInternalContainer().eInverseRemove(this, UmlPackage.CLASS__OWNED_OPERATION, uml.Class.class, msgs);
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
      case UmlPackage.OPERATION__CLASS:
        return getClass_();
      case UmlPackage.OPERATION__IS_QUERY:
        return isIsQuery() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.OPERATION__IS_ORDERED:
        return isIsOrdered() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.OPERATION__IS_UNIQUE:
        return isIsUnique() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.OPERATION__LOWER:
        return new Integer(getLower());
      case UmlPackage.OPERATION__UPPER:
        return new Integer(getUpper());
      case UmlPackage.OPERATION__REDEFINED_OPERATION:
        return getRedefinedOperation();
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
      case UmlPackage.OPERATION__CLASS:
        setClass((uml.Class)newValue);
        return;
      case UmlPackage.OPERATION__IS_QUERY:
        setIsQuery(((Boolean)newValue).booleanValue());
        return;
      case UmlPackage.OPERATION__IS_ORDERED:
        setIsOrdered(((Boolean)newValue).booleanValue());
        return;
      case UmlPackage.OPERATION__IS_UNIQUE:
        setIsUnique(((Boolean)newValue).booleanValue());
        return;
      case UmlPackage.OPERATION__LOWER:
        setLower(((Integer)newValue).intValue());
        return;
      case UmlPackage.OPERATION__UPPER:
        setUpper(((Integer)newValue).intValue());
        return;
      case UmlPackage.OPERATION__REDEFINED_OPERATION:
        getRedefinedOperation().clear();
        getRedefinedOperation().addAll((Collection<? extends Operation>)newValue);
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
      case UmlPackage.OPERATION__CLASS:
        setClass((uml.Class)null);
        return;
      case UmlPackage.OPERATION__IS_QUERY:
        setIsQuery(IS_QUERY_EDEFAULT);
        return;
      case UmlPackage.OPERATION__IS_ORDERED:
        setIsOrdered(IS_ORDERED_EDEFAULT);
        return;
      case UmlPackage.OPERATION__IS_UNIQUE:
        setIsUnique(IS_UNIQUE_EDEFAULT);
        return;
      case UmlPackage.OPERATION__LOWER:
        setLower(LOWER_EDEFAULT);
        return;
      case UmlPackage.OPERATION__UPPER:
        setUpper(UPPER_EDEFAULT);
        return;
      case UmlPackage.OPERATION__REDEFINED_OPERATION:
        getRedefinedOperation().clear();
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
      case UmlPackage.OPERATION__CLASS:
        return getClass_() != null;
      case UmlPackage.OPERATION__IS_QUERY:
        return isQuery != IS_QUERY_EDEFAULT;
      case UmlPackage.OPERATION__IS_ORDERED:
        return isIsOrdered() != IS_ORDERED_EDEFAULT;
      case UmlPackage.OPERATION__IS_UNIQUE:
        return isIsUnique() != IS_UNIQUE_EDEFAULT;
      case UmlPackage.OPERATION__LOWER:
        return getLower() != LOWER_EDEFAULT;
      case UmlPackage.OPERATION__UPPER:
        return getUpper() != UPPER_EDEFAULT;
      case UmlPackage.OPERATION__REDEFINED_OPERATION:
        return redefinedOperation != null && !redefinedOperation.isEmpty();
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
    result.append(" (isQuery: ");
    result.append(isQuery);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
