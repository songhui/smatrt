/**
 * <copyright>
 * </copyright>
 *
 * $Id: Connector.java,v 1.2 2008/11/13 05:53:00 song Exp $
 */
package cn.edu.pku.sei.ra.arch.C2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Connector#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Connector#getParent <em>Parent</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Connector#getType <em>Type</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Connector#getComment <em>Comment</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Connector#getAbove <em>Above</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Connector#getBelow <em>Below</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getConnector_Name()
	 * @model required="true"
	 *        annotation="http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations KeyAttribute='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Architecture)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getConnector_Parent()
	 * @see cn.edu.pku.sei.ra.arch.C2.Architecture#getConnector
	 * @model opposite="connector" required="true" transient="false"
	 * @generated
	 */
	Architecture getParent();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Architecture value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getConnector_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getConnector_Comment()
	 * @model required="true"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Above</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.arch.C2.Component}.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.arch.C2.Component#getBelow <em>Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Above</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Above</em>' reference list.
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getConnector_Above()
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getBelow
	 * @model opposite="below" ordered="false"
	 * @generated
	 */
	EList<Component> getAbove();

	/**
	 * Returns the value of the '<em><b>Below</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.arch.C2.Component}.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.arch.C2.Component#getAbove <em>Above</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Below</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Below</em>' reference list.
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getConnector_Below()
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getAbove
	 * @model opposite="above" ordered="false"
	 * @generated
	 */
	EList<Component> getBelow();

} // Connector
