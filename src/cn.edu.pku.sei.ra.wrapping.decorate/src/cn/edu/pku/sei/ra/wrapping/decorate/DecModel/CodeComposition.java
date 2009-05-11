/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeComposition#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getCodeComposition()
 * @model
 * @generated
 */
public interface CodeComposition extends Code {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage#getCodeComposition_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Code> getChild();

} // CodeComposition
