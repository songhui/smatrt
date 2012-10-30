/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.DecScope;
import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.Event;
import ie.tcd.everm.evedsl.eveDesc.Parser;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.EventImpl#getDecScope <em>Dec Scope</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.EventImpl#getParser <em>Parser</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.EventImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.EventImpl#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event
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
   * The cached value of the '{@link #getDecScope() <em>Dec Scope</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecScope()
   * @generated
   * @ordered
   */
  protected EList<DecScope> decScope;

  /**
   * The cached value of the '{@link #getParser() <em>Parser</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParser()
   * @generated
   * @ordered
   */
  protected Parser parser;

  /**
   * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPre()
   * @generated
   * @ordered
   */
  protected EList<XExpression> pre;

  /**
   * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPost()
   * @generated
   * @ordered
   */
  protected XExpression post;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return EveDescPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
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
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.EVENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DecScope> getDecScope()
  {
    if (decScope == null)
    {
      decScope = new EObjectContainmentEList<DecScope>(DecScope.class, this, EveDescPackage.EVENT__DEC_SCOPE);
    }
    return decScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parser getParser()
  {
    return parser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParser(Parser newParser, NotificationChain msgs)
  {
    Parser oldParser = parser;
    parser = newParser;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.EVENT__PARSER, oldParser, newParser);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParser(Parser newParser)
  {
    if (newParser != parser)
    {
      NotificationChain msgs = null;
      if (parser != null)
        msgs = ((InternalEObject)parser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.EVENT__PARSER, null, msgs);
      if (newParser != null)
        msgs = ((InternalEObject)newParser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.EVENT__PARSER, null, msgs);
      msgs = basicSetParser(newParser, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.EVENT__PARSER, newParser, newParser));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getPre()
  {
    if (pre == null)
    {
      pre = new EObjectContainmentEList<XExpression>(XExpression.class, this, EveDescPackage.EVENT__PRE);
    }
    return pre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getPost()
  {
    return post;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPost(XExpression newPost, NotificationChain msgs)
  {
    XExpression oldPost = post;
    post = newPost;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.EVENT__POST, oldPost, newPost);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPost(XExpression newPost)
  {
    if (newPost != post)
    {
      NotificationChain msgs = null;
      if (post != null)
        msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.EVENT__POST, null, msgs);
      if (newPost != null)
        msgs = ((InternalEObject)newPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.EVENT__POST, null, msgs);
      msgs = basicSetPost(newPost, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.EVENT__POST, newPost, newPost));
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
      case EveDescPackage.EVENT__DEC_SCOPE:
        return ((InternalEList<?>)getDecScope()).basicRemove(otherEnd, msgs);
      case EveDescPackage.EVENT__PARSER:
        return basicSetParser(null, msgs);
      case EveDescPackage.EVENT__PRE:
        return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
      case EveDescPackage.EVENT__POST:
        return basicSetPost(null, msgs);
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
      case EveDescPackage.EVENT__NAME:
        return getName();
      case EveDescPackage.EVENT__DEC_SCOPE:
        return getDecScope();
      case EveDescPackage.EVENT__PARSER:
        return getParser();
      case EveDescPackage.EVENT__PRE:
        return getPre();
      case EveDescPackage.EVENT__POST:
        return getPost();
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
      case EveDescPackage.EVENT__NAME:
        setName((String)newValue);
        return;
      case EveDescPackage.EVENT__DEC_SCOPE:
        getDecScope().clear();
        getDecScope().addAll((Collection<? extends DecScope>)newValue);
        return;
      case EveDescPackage.EVENT__PARSER:
        setParser((Parser)newValue);
        return;
      case EveDescPackage.EVENT__PRE:
        getPre().clear();
        getPre().addAll((Collection<? extends XExpression>)newValue);
        return;
      case EveDescPackage.EVENT__POST:
        setPost((XExpression)newValue);
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
      case EveDescPackage.EVENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EveDescPackage.EVENT__DEC_SCOPE:
        getDecScope().clear();
        return;
      case EveDescPackage.EVENT__PARSER:
        setParser((Parser)null);
        return;
      case EveDescPackage.EVENT__PRE:
        getPre().clear();
        return;
      case EveDescPackage.EVENT__POST:
        setPost((XExpression)null);
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
      case EveDescPackage.EVENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EveDescPackage.EVENT__DEC_SCOPE:
        return decScope != null && !decScope.isEmpty();
      case EveDescPackage.EVENT__PARSER:
        return parser != null;
      case EveDescPackage.EVENT__PRE:
        return pre != null && !pre.isEmpty();
      case EveDescPackage.EVENT__POST:
        return post != null;
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

} //EventImpl
