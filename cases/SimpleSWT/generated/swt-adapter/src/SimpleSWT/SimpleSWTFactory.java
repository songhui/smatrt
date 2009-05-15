/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SimpleSWT.SimpleSWTPackage
 * @generated
 */
public interface SimpleSWTFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleSWTFactory eINSTANCE = SimpleSWT.impl.SimpleSWTFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Composite Wrap</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Wrap</em>'.
   * @generated
   */
  CompositeWrap createCompositeWrap();

  /**
   * Returns a new object of class '<em>Text Wrap</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Wrap</em>'.
   * @generated
   */
  TextWrap createTextWrap();

  /**
   * Returns a new object of class '<em>Button Wrap</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button Wrap</em>'.
   * @generated
   */
  ButtonWrap createButtonWrap();

  /**
   * Returns a new object of class '<em>Label Wrap</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Wrap</em>'.
   * @generated
   */
  LabelWrap createLabelWrap();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimpleSWTPackage getSimpleSWTPackage();

} //SimpleSWTFactory
