
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uml.Operation;
import uml.Parameter;
import uml.UmlPackage;
import uml.ValueSpecification;
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
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link uml.impl.ParameterImpl#isIsStream <em>Is Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends WrappingEObjectImpl implements Parameter
{
  /**
   * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected ValueSpecification defaultValue;

  /**
   * The default value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsException()
   * @generated
   * @ordered
   */
  protected static final boolean IS_EXCEPTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsException()
   * @generated
   * @ordered
   */
  protected boolean isException = IS_EXCEPTION_EDEFAULT;

  /**
   * The default value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStream()
   * @generated
   * @ordered
   */
  protected static final boolean IS_STREAM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStream()
   * @generated
   * @ordered
   */
  protected boolean isStream = IS_STREAM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return UmlPackage.Literals.PARAMETER;
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
  public Operation getOperation()
  {
    Operation operation = basicGetOperation();
    return operation != null && operation.eIsProxy() ? (Operation)eResolveProxy((InternalEObject)operation) : operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetOperation()
  {
    // TODO: implement this method to return the 'Operation' reference
    // -> do not perform proxy resolution
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefault()
  {
    // TODO: implement this method to return the 'Default' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(String newDefault)
  {
    // TODO: implement this method to set the 'Default' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetDefault()
  {
    // TODO: implement this method to unset the 'Default' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDefault()
  {
    // TODO: implement this method to return whether the 'Default' attribute is set
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueSpecification getDefaultValue()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return defaultValue;
    return defaultValue; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs)
  {
    ValueSpecification oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(ValueSpecification newDefaultValue)
  {
    if (newDefaultValue != defaultValue)
    {
      NotificationChain msgs = null;
      if (defaultValue != null)
        msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
      if (newDefaultValue != null)
        msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
      msgs = basicSetDefaultValue(newDefaultValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsException()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return isException;
    return isException; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsException(boolean newIsException)
  {
    boolean oldIsException = isException;
    isException = newIsException;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__IS_EXCEPTION, oldIsException, isException));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsStream()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return isStream;
    return isStream; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsStream(boolean newIsStream)
  {
    boolean oldIsStream = isStream;
    isStream = newIsStream;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PARAMETER__IS_STREAM, oldIsStream, isStream));
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
      case UmlPackage.PARAMETER__DEFAULT_VALUE:
        return basicSetDefaultValue(null, msgs);
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
      case UmlPackage.PARAMETER__OPERATION:
        if (resolve) return getOperation();
        return basicGetOperation();
      case UmlPackage.PARAMETER__DEFAULT:
        return getDefault();
      case UmlPackage.PARAMETER__DEFAULT_VALUE:
        return getDefaultValue();
      case UmlPackage.PARAMETER__IS_EXCEPTION:
        return isIsException() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.PARAMETER__IS_STREAM:
        return isIsStream() ? Boolean.TRUE : Boolean.FALSE;
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
      case UmlPackage.PARAMETER__DEFAULT:
        setDefault((String)newValue);
        return;
      case UmlPackage.PARAMETER__DEFAULT_VALUE:
        setDefaultValue((ValueSpecification)newValue);
        return;
      case UmlPackage.PARAMETER__IS_EXCEPTION:
        setIsException(((Boolean)newValue).booleanValue());
        return;
      case UmlPackage.PARAMETER__IS_STREAM:
        setIsStream(((Boolean)newValue).booleanValue());
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
      case UmlPackage.PARAMETER__DEFAULT:
        unsetDefault();
        return;
      case UmlPackage.PARAMETER__DEFAULT_VALUE:
        setDefaultValue((ValueSpecification)null);
        return;
      case UmlPackage.PARAMETER__IS_EXCEPTION:
        setIsException(IS_EXCEPTION_EDEFAULT);
        return;
      case UmlPackage.PARAMETER__IS_STREAM:
        setIsStream(IS_STREAM_EDEFAULT);
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
      case UmlPackage.PARAMETER__OPERATION:
        return basicGetOperation() != null;
      case UmlPackage.PARAMETER__DEFAULT:
        return isSetDefault();
      case UmlPackage.PARAMETER__DEFAULT_VALUE:
        return defaultValue != null;
      case UmlPackage.PARAMETER__IS_EXCEPTION:
        return isException != IS_EXCEPTION_EDEFAULT;
      case UmlPackage.PARAMETER__IS_STREAM:
        return isStream != IS_STREAM_EDEFAULT;
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
    result.append(" (isException: ");
    result.append(isException);
    result.append(", isStream: ");
    result.append(isStream);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
