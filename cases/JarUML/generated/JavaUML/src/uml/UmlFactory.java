/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.ecore.EFactory;

import uml.impl.UmlFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uml.UmlPackage
 * @generated
 */
public interface UmlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UmlFactory eINSTANCE = UmlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment</em>'.
   * @generated
   */
  Comment createComment();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  uml.Package createPackage();

  /**
   * Returns a new object of class '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dependency</em>'.
   * @generated
   */
  Dependency createDependency();

  /**
   * Returns a new object of class '<em>Element Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Import</em>'.
   * @generated
   */
  ElementImport createElementImport();

  /**
   * Returns a new object of class '<em>Package Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Import</em>'.
   * @generated
   */
  PackageImport createPackageImport();

  /**
   * Returns a new object of class '<em>Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Association</em>'.
   * @generated
   */
  Association createAssociation();

  /**
   * Returns a new object of class '<em>Substitution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Substitution</em>'.
   * @generated
   */
  Substitution createSubstitution();

  /**
   * Returns a new object of class '<em>Realization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Realization</em>'.
   * @generated
   */
  Realization createRealization();

  /**
   * Returns a new object of class '<em>Abstraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstraction</em>'.
   * @generated
   */
  Abstraction createAbstraction();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  uml.Class createClass();

  /**
   * Returns a new object of class '<em>Generalization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generalization</em>'.
   * @generated
   */
  Generalization createGeneralization();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UmlPackage getUmlPackage();

} //UmlFactory
