/**
 * <copyright>
 * </copyright>
 *
 * $Id: Architecture.java,v 1.2 2008/11/13 05:53:00 song Exp $
 */
package cn.edu.pku.sei.ra.arch.C2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getComponent <em>Component</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getConnector <em>Connector</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getDeployedHost <em>Deployed Host</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getComment <em>Comment</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.arch.C2.Component}.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.arch.C2.Component#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getArchitecture_Component()
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getParent
	 * @model opposite="parent" containment="true" ordered="false"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.arch.C2.Connector}.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getArchitecture_Connector()
	 * @see cn.edu.pku.sei.ra.arch.C2.Connector#getParent
	 * @model opposite="parent" containment="true" ordered="false"
	 * @generated
	 */
	EList<Connector> getConnector();

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
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getArchitecture_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Deployed Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Host</em>' attribute.
	 * @see #setDeployedHost(String)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getArchitecture_DeployedHost()
	 * @model required="true"
	 *        annotation="http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations KeyAttribute='true'"
	 * @generated
	 */
	String getDeployedHost();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getDeployedHost <em>Deployed Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed Host</em>' attribute.
	 * @see #getDeployedHost()
	 * @generated
	 */
	void setDeployedHost(String value);

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
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getArchitecture_Comment()
	 * @model required="true"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.arch.C2.Component#getInnerArch <em>Inner Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Component)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getArchitecture_Parent()
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getInnerArch
	 * @model opposite="innerArch" transient="false"
	 * @generated
	 */
	Component getParent();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Component value);

} // Architecture
