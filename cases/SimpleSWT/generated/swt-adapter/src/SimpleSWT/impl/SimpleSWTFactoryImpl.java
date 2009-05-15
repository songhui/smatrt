/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT.impl;

import SimpleSWT.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleSWTFactoryImpl extends EFactoryImpl implements SimpleSWTFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimpleSWTFactory init()
  {
    try
    {
      SimpleSWTFactory theSimpleSWTFactory = (SimpleSWTFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sei.pku.edu.cn/rsa/simpleswt"); 
      if (theSimpleSWTFactory != null)
      {
        return theSimpleSWTFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimpleSWTFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSWTFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SimpleSWTPackage.COMPOSITE_WRAP: return createCompositeWrap();
      case SimpleSWTPackage.TEXT_WRAP: return createTextWrap();
      case SimpleSWTPackage.BUTTON_WRAP: return createButtonWrap();
      case SimpleSWTPackage.LABEL_WRAP: return createLabelWrap();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeWrap createCompositeWrap()
  {
    CompositeWrapImpl compositeWrap = new CompositeWrapImpl();
    return compositeWrap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextWrap createTextWrap()
  {
    TextWrapImpl textWrap = new TextWrapImpl();
    return textWrap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonWrap createButtonWrap()
  {
    ButtonWrapImpl buttonWrap = new ButtonWrapImpl();
    return buttonWrap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelWrap createLabelWrap()
  {
    LabelWrapImpl labelWrap = new LabelWrapImpl();
    return labelWrap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSWTPackage getSimpleSWTPackage()
  {
    return (SimpleSWTPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimpleSWTPackage getPackage()
  {
    return SimpleSWTPackage.eINSTANCE;
  }

} //SimpleSWTFactoryImpl
