
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uml.Comment;
import uml.Element;
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
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.CommentImpl#getBody <em>Body</em>}</li>
 *   <li>{@link uml.impl.CommentImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl  extends ElementImpl implements Comment
{
  /**
   * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected static final String BODY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected String body = BODY_EDEFAULT;

  /**
   * This is true if the Body attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean bodyESet;

  /**
   * The cached value of the '{@link #getAnnotatedElement() <em>Annotated Element</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotatedElement()
   * @generated
   * @ordered
   */
  protected EList<Element> annotatedElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommentImpl()
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
    return UmlPackage.Literals.COMMENT;
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
    
  
    case UmlPackage.COMMENT__ANNOTATED_ELEMENT:
  
      
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
  public String getBody()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return body;
    return body; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(String newBody)
  {
    String oldBody = body;
    body = newBody;
    boolean oldBodyESet = bodyESet;
    bodyESet = true;
        //Am I here 2?
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.COMMENT__BODY, oldBody, body, !oldBodyESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetBody()
  {
    String oldBody = body;
    boolean oldBodyESet = bodyESet;
    body = BODY_EDEFAULT;
    bodyESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.COMMENT__BODY, oldBody, BODY_EDEFAULT, oldBodyESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetBody()
  {
    return bodyESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getAnnotatedElement()
  {

    
    if (annotatedElement == null)
    {
  
  
    
      annotatedElement = new EObjectResolvingEList<Element>(Element.class, this, UmlPackage.COMMENT__ANNOTATED_ELEMENT);
    
      annotatedElement = new EObjectContainmentEListForWrapping<Element>(
          Element.class, 
          this, 
          UmlPackage.COMMENT__ANNOTATED_ELEMENT,
          UmlPackage.eINSTANCE.getElement()
        );
        
  }
  
    return annotatedElement;
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
      case UmlPackage.COMMENT__BODY:
        return getBody();
      case UmlPackage.COMMENT__ANNOTATED_ELEMENT:
        return getAnnotatedElement();
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
      case UmlPackage.COMMENT__BODY:
        setBody((String)newValue);
        return;
      case UmlPackage.COMMENT__ANNOTATED_ELEMENT:
        getAnnotatedElement().clear();
        getAnnotatedElement().addAll((Collection<? extends Element>)newValue);
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
      case UmlPackage.COMMENT__BODY:
        unsetBody();
        return;
      case UmlPackage.COMMENT__ANNOTATED_ELEMENT:
        getAnnotatedElement().clear();
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
      case UmlPackage.COMMENT__BODY:
        return isSetBody();
      case UmlPackage.COMMENT__ANNOTATED_ELEMENT:
        return annotatedElement != null && !annotatedElement.isEmpty();
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
    result.append(" (body: ");
    if (bodyESet) result.append(body); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //CommentImpl
