/**
 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Parser#getIvar <em>Ivar</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getParser()
 * @model
 * @generated
 */
public interface Parser extends EObject
{
  /**
   * Returns the value of the '<em><b>Ivar</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ivar</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ivar</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getParser_Ivar()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getIvar();

} // Parser
