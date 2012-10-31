/**
 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dec Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.DecScope#getVar <em>Var</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.DecScope#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getDecScope()
 * @model
 * @generated
 */
public interface DecScope extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(XVariableDeclaration)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getDecScope_Var()
   * @model containment="true"
   * @generated
   */
  XVariableDeclaration getVar();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.DecScope#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(XVariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' containment reference.
   * @see #setScope(Scope)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getDecScope_Scope()
   * @model containment="true"
   * @generated
   */
  Scope getScope();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.DecScope#getScope <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' containment reference.
   * @see #getScope()
   * @generated
   */
  void setScope(Scope value);

} // DecScope
