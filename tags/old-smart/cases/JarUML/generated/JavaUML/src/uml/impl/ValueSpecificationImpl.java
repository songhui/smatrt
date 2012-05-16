
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Comment;
import uml.Dependency;
import uml.Element;
import uml.NamedElement;
import uml.Namespace;
import uml.Type;
import uml.TypedElement;
import uml.UmlPackage;
import uml.ValueSpecification;
import uml.VisibilityKind;
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
 * An implementation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ValueSpecificationImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link uml.impl.ValueSpecificationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link uml.impl.ValueSpecificationImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link uml.impl.ValueSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml.impl.ValueSpecificationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml.impl.ValueSpecificationImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link uml.impl.ValueSpecificationImpl#getClientDependency <em>Client Dependency</em>}</li>
 *   <li>{@link uml.impl.ValueSpecificationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link uml.impl.ValueSpecificationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ValueSpecificationImpl  extends PackageableElementImpl implements ValueSpecification
{
  /**
   * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedComment()
   * @generated
   * @ordered
   */
  protected EList<Comment> ownedComment;

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
   * This is true if the Name attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean nameESet;

  /**
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

  /**
   * This is true if the Visibility attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean visibilityESet;

  /**
   * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIED_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClientDependency() <em>Client Dependency</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientDependency()
   * @generated
   * @ordered
   */
  protected EList<Dependency> clientDependency;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueSpecificationImpl()
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
    return UmlPackage.Literals.VALUE_SPECIFICATION;
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
  public EList<Element> getOwnedElement()
  {
    // TODO: implement this method to return the 'Owned Element' reference list
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
  public Element getOwner()
  {
    Element owner = basicGetOwner();
    return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element basicGetOwner()
  {
    // TODO: implement this method to return the 'Owner' reference
    // -> do not perform proxy resolution
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comment> getOwnedComment()
  {

    
    if (ownedComment == null)
    {
  
  
    
      ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, UmlPackage.VALUE_SPECIFICATION__OWNED_COMMENT);
    
      ownedComment = new EObjectContainmentEListForWrapping<Comment>(
          Comment.class, 
          this, 
          UmlPackage.VALUE_SPECIFICATION__OWNED_COMMENT,
          UmlPackage.eINSTANCE.getComment()
        );
        
  }
  
    return ownedComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
        Object result=null;
        Object core=(Object)getCore();
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
    boolean oldNameESet = nameESet;
    nameESet = true;
        //Am I here 2?
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.VALUE_SPECIFICATION__NAME, oldName, name, !oldNameESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetName()
  {
    String oldName = name;
    boolean oldNameESet = nameESet;
    name = NAME_EDEFAULT;
    nameESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.VALUE_SPECIFICATION__NAME, oldName, NAME_EDEFAULT, oldNameESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetName()
  {
    return nameESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityKind getVisibility()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return visibility;
    return visibility; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(VisibilityKind newVisibility)
  {
    VisibilityKind oldVisibility = visibility;
    visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
    boolean oldVisibilityESet = visibilityESet;
    visibilityESet = true;
        //Am I here 2?
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.VALUE_SPECIFICATION__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetVisibility()
  {
    VisibilityKind oldVisibility = visibility;
    boolean oldVisibilityESet = visibilityESet;
    visibility = VISIBILITY_EDEFAULT;
    visibilityESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.VALUE_SPECIFICATION__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetVisibility()
  {
    return visibilityESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifiedName()
  {
    // TODO: implement this method to return the 'Qualified Name' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dependency> getClientDependency()
  {

    
    if (clientDependency == null)
    {
  
  
    
      clientDependency = new EObjectWithInverseResolvingEList.ManyInverse<Dependency>(Dependency.class, this, UmlPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY, UmlPackage.DEPENDENCY__CLIENT);
    
      clientDependency = new EObjectContainmentEListForWrapping<Dependency>(
          Dependency.class, 
          this, 
          UmlPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY,
          UmlPackage.eINSTANCE.getDependency()
        );
        
  }
  
    return clientDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace getNamespace()
  {
    Namespace namespace = basicGetNamespace();
    return namespace != null && namespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)namespace) : namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace basicGetNamespace()
  {
    // TODO: implement this method to return the 'Namespace' reference
    // -> do not perform proxy resolution
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.VALUE_SPECIFICATION__TYPE, oldType, type));
      }
    }
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return type;
    return type; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.VALUE_SPECIFICATION__TYPE, oldType, type));
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
      case UmlPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getClientDependency()).basicAdd(otherEnd, msgs);
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
      case UmlPackage.VALUE_SPECIFICATION__OWNED_COMMENT:
        return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
      case UmlPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY:
        return ((InternalEList<?>)getClientDependency()).basicRemove(otherEnd, msgs);
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
      case UmlPackage.VALUE_SPECIFICATION__OWNED_ELEMENT:
        return getOwnedElement();
      case UmlPackage.VALUE_SPECIFICATION__OWNER:
        if (resolve) return getOwner();
        return basicGetOwner();
      case UmlPackage.VALUE_SPECIFICATION__OWNED_COMMENT:
        return getOwnedComment();
      case UmlPackage.VALUE_SPECIFICATION__NAME:
        return getName();
      case UmlPackage.VALUE_SPECIFICATION__VISIBILITY:
        return getVisibility();
      case UmlPackage.VALUE_SPECIFICATION__QUALIFIED_NAME:
        return getQualifiedName();
      case UmlPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY:
        return getClientDependency();
      case UmlPackage.VALUE_SPECIFICATION__NAMESPACE:
        if (resolve) return getNamespace();
        return basicGetNamespace();
      case UmlPackage.VALUE_SPECIFICATION__TYPE:
        if (resolve) return getType();
        return basicGetType();
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
      case UmlPackage.VALUE_SPECIFICATION__OWNED_COMMENT:
        getOwnedComment().clear();
        getOwnedComment().addAll((Collection<? extends Comment>)newValue);
        return;
      case UmlPackage.VALUE_SPECIFICATION__NAME:
        setName((String)newValue);
        return;
      case UmlPackage.VALUE_SPECIFICATION__VISIBILITY:
        setVisibility((VisibilityKind)newValue);
        return;
      case UmlPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY:
        getClientDependency().clear();
        getClientDependency().addAll((Collection<? extends Dependency>)newValue);
        return;
      case UmlPackage.VALUE_SPECIFICATION__TYPE:
        setType((Type)newValue);
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
      case UmlPackage.VALUE_SPECIFICATION__OWNED_COMMENT:
        getOwnedComment().clear();
        return;
      case UmlPackage.VALUE_SPECIFICATION__NAME:
        unsetName();
        return;
      case UmlPackage.VALUE_SPECIFICATION__VISIBILITY:
        unsetVisibility();
        return;
      case UmlPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY:
        getClientDependency().clear();
        return;
      case UmlPackage.VALUE_SPECIFICATION__TYPE:
        setType((Type)null);
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
      case UmlPackage.VALUE_SPECIFICATION__OWNED_ELEMENT:
        return !getOwnedElement().isEmpty();
      case UmlPackage.VALUE_SPECIFICATION__OWNER:
        return basicGetOwner() != null;
      case UmlPackage.VALUE_SPECIFICATION__OWNED_COMMENT:
        return ownedComment != null && !ownedComment.isEmpty();
      case UmlPackage.VALUE_SPECIFICATION__NAME:
        return isSetName();
      case UmlPackage.VALUE_SPECIFICATION__VISIBILITY:
        return isSetVisibility();
      case UmlPackage.VALUE_SPECIFICATION__QUALIFIED_NAME:
        return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
      case UmlPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY:
        return clientDependency != null && !clientDependency.isEmpty();
      case UmlPackage.VALUE_SPECIFICATION__NAMESPACE:
        return basicGetNamespace() != null;
      case UmlPackage.VALUE_SPECIFICATION__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Element.class)
    {
      switch (derivedFeatureID)
      {
        case UmlPackage.VALUE_SPECIFICATION__OWNED_ELEMENT: return UmlPackage.ELEMENT__OWNED_ELEMENT;
        case UmlPackage.VALUE_SPECIFICATION__OWNER: return UmlPackage.ELEMENT__OWNER;
        case UmlPackage.VALUE_SPECIFICATION__OWNED_COMMENT: return UmlPackage.ELEMENT__OWNED_COMMENT;
        default: return -1;
      }
    }
    if (baseClass == NamedElement.class)
    {
      switch (derivedFeatureID)
      {
        case UmlPackage.VALUE_SPECIFICATION__NAME: return UmlPackage.NAMED_ELEMENT__NAME;
        case UmlPackage.VALUE_SPECIFICATION__VISIBILITY: return UmlPackage.NAMED_ELEMENT__VISIBILITY;
        case UmlPackage.VALUE_SPECIFICATION__QUALIFIED_NAME: return UmlPackage.NAMED_ELEMENT__QUALIFIED_NAME;
        case UmlPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY: return UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;
        case UmlPackage.VALUE_SPECIFICATION__NAMESPACE: return UmlPackage.NAMED_ELEMENT__NAMESPACE;
        default: return -1;
      }
    }
    if (baseClass == TypedElement.class)
    {
      switch (derivedFeatureID)
      {
        case UmlPackage.VALUE_SPECIFICATION__TYPE: return UmlPackage.TYPED_ELEMENT__TYPE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Element.class)
    {
      switch (baseFeatureID)
      {
        case UmlPackage.ELEMENT__OWNED_ELEMENT: return UmlPackage.VALUE_SPECIFICATION__OWNED_ELEMENT;
        case UmlPackage.ELEMENT__OWNER: return UmlPackage.VALUE_SPECIFICATION__OWNER;
        case UmlPackage.ELEMENT__OWNED_COMMENT: return UmlPackage.VALUE_SPECIFICATION__OWNED_COMMENT;
        default: return -1;
      }
    }
    if (baseClass == NamedElement.class)
    {
      switch (baseFeatureID)
      {
        case UmlPackage.NAMED_ELEMENT__NAME: return UmlPackage.VALUE_SPECIFICATION__NAME;
        case UmlPackage.NAMED_ELEMENT__VISIBILITY: return UmlPackage.VALUE_SPECIFICATION__VISIBILITY;
        case UmlPackage.NAMED_ELEMENT__QUALIFIED_NAME: return UmlPackage.VALUE_SPECIFICATION__QUALIFIED_NAME;
        case UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY: return UmlPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY;
        case UmlPackage.NAMED_ELEMENT__NAMESPACE: return UmlPackage.VALUE_SPECIFICATION__NAMESPACE;
        default: return -1;
      }
    }
    if (baseClass == TypedElement.class)
    {
      switch (baseFeatureID)
      {
        case UmlPackage.TYPED_ELEMENT__TYPE: return UmlPackage.VALUE_SPECIFICATION__TYPE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    if (nameESet) result.append(name); else result.append("<unset>");
    result.append(", visibility: ");
    if (visibilityESet) result.append(visibility); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //ValueSpecificationImpl
