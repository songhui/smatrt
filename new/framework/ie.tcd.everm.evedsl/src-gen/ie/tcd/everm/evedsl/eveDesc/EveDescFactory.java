/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage
 * @generated
 */
public interface EveDescFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EveDescFactory eINSTANCE = ie.tcd.everm.evedsl.eveDesc.impl.EveDescFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Event Desc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Desc</em>'.
   * @generated
   */
  EventDesc createEventDesc();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Helper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Helper</em>'.
   * @generated
   */
  Helper createHelper();

  /**
   * Returns a new object of class '<em>Event Seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Seq</em>'.
   * @generated
   */
  EventSeq createEventSeq();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Parser</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parser</em>'.
   * @generated
   */
  Parser createParser();

  /**
   * Returns a new object of class '<em>Text Parser</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Parser</em>'.
   * @generated
   */
  TextParser createTextParser();

  /**
   * Returns a new object of class '<em>Text Formatter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Formatter</em>'.
   * @generated
   */
  TextFormatter createTextFormatter();

  /**
   * Returns a new object of class '<em>Split Formatter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Split Formatter</em>'.
   * @generated
   */
  SplitFormatter createSplitFormatter();

  /**
   * Returns a new object of class '<em>User Defined Formatter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Defined Formatter</em>'.
   * @generated
   */
  UserDefinedFormatter createUserDefinedFormatter();

  /**
   * Returns a new object of class '<em>Abstract Text Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Text Value</em>'.
   * @generated
   */
  AbstractTextValue createAbstractTextValue();

  /**
   * Returns a new object of class '<em>Var Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Value</em>'.
   * @generated
   */
  VarValue createVarValue();

  /**
   * Returns a new object of class '<em>Constant Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Text</em>'.
   * @generated
   */
  ConstantText createConstantText();

  /**
   * Returns a new object of class '<em>Ignore Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ignore Value</em>'.
   * @generated
   */
  IgnoreValue createIgnoreValue();

  /**
   * Returns a new object of class '<em>Plain Parser</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plain Parser</em>'.
   * @generated
   */
  PlainParser createPlainParser();

  /**
   * Returns a new object of class '<em>Dec Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dec Scope</em>'.
   * @generated
   */
  DecScope createDecScope();

  /**
   * Returns a new object of class '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scope</em>'.
   * @generated
   */
  Scope createScope();

  /**
   * Returns a new object of class '<em>API</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>API</em>'.
   * @generated
   */
  API createAPI();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Sub Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Type</em>'.
   * @generated
   */
  SubType createSubType();

  /**
   * Returns a new object of class '<em>Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invocation</em>'.
   * @generated
   */
  Invocation createInvocation();

  /**
   * Returns a new object of class '<em>Operation Point Cut</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Point Cut</em>'.
   * @generated
   */
  OperationPointCut createOperationPointCut();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EveDescPackage getEveDescPackage();

} //EveDescFactory
