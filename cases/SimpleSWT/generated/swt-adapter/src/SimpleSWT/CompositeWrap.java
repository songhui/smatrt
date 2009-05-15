
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Wrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleSWT.CompositeWrap#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleSWT.SimpleSWTPackage#getCompositeWrap()
 * @model annotation="http://www.sei.pku.edu.cn/rsa RootClass='true'"
 * @generated
 */
public interface CompositeWrap extends ControlWrap
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link SimpleSWT.ControlWrap}.
   * It is bidirectional and its opposite is '{@link SimpleSWT.ControlWrap#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see SimpleSWT.SimpleSWTPackage#getCompositeWrap_Children()
   * @see SimpleSWT.ControlWrap#getParent
   * @model opposite="parent" containment="true" ordered="false"
   * @generated
   */
  EList<ControlWrap> getChildren();

} // CompositeWrap
