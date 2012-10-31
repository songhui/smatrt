/**
 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.AbstractTextValue;
import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.TextFormatter;
import ie.tcd.everm.evedsl.eveDesc.TextParser;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.TextParserImpl#getFormatter <em>Formatter</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.TextParserImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextParserImpl extends ParserImpl implements TextParser
{
  /**
   * The cached value of the '{@link #getFormatter() <em>Formatter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormatter()
   * @generated
   * @ordered
   */
  protected TextFormatter formatter;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<AbstractTextValue> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextParserImpl()
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
    return EveDescPackage.Literals.TEXT_PARSER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextFormatter getFormatter()
  {
    return formatter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormatter(TextFormatter newFormatter, NotificationChain msgs)
  {
    TextFormatter oldFormatter = formatter;
    formatter = newFormatter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.TEXT_PARSER__FORMATTER, oldFormatter, newFormatter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormatter(TextFormatter newFormatter)
  {
    if (newFormatter != formatter)
    {
      NotificationChain msgs = null;
      if (formatter != null)
        msgs = ((InternalEObject)formatter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.TEXT_PARSER__FORMATTER, null, msgs);
      if (newFormatter != null)
        msgs = ((InternalEObject)newFormatter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.TEXT_PARSER__FORMATTER, null, msgs);
      msgs = basicSetFormatter(newFormatter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.TEXT_PARSER__FORMATTER, newFormatter, newFormatter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractTextValue> getValue()
  {
    if (value == null)
    {
      value = new EObjectContainmentEList<AbstractTextValue>(AbstractTextValue.class, this, EveDescPackage.TEXT_PARSER__VALUE);
    }
    return value;
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
      case EveDescPackage.TEXT_PARSER__FORMATTER:
        return basicSetFormatter(null, msgs);
      case EveDescPackage.TEXT_PARSER__VALUE:
        return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
      case EveDescPackage.TEXT_PARSER__FORMATTER:
        return getFormatter();
      case EveDescPackage.TEXT_PARSER__VALUE:
        return getValue();
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
      case EveDescPackage.TEXT_PARSER__FORMATTER:
        setFormatter((TextFormatter)newValue);
        return;
      case EveDescPackage.TEXT_PARSER__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends AbstractTextValue>)newValue);
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
      case EveDescPackage.TEXT_PARSER__FORMATTER:
        setFormatter((TextFormatter)null);
        return;
      case EveDescPackage.TEXT_PARSER__VALUE:
        getValue().clear();
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
      case EveDescPackage.TEXT_PARSER__FORMATTER:
        return formatter != null;
      case EveDescPackage.TEXT_PARSER__VALUE:
        return value != null && !value.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TextParserImpl
