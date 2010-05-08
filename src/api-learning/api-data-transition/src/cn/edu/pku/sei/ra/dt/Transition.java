/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.dt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jdt.core.IJavaElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Transition#getId <em>Id</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Transition#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Transition#getOutput <em>Output</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Transition#isInvolved <em>Involved</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Transition#getType <em>Type</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Transition#getJavaElement <em>Java Element</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Transition#getSignature <em>Signature</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Transition#isActivated <em>Activated</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Transition#isInvokechain <em>Invokechain</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Transition#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.dt.Place}.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.dt.Place#getInputOf <em>Input Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition_Input()
	 * @see cn.edu.pku.sei.ra.dt.Place#getInputOf
	 * @model opposite="inputOf"
	 * @generated
	 */
	EList<Place> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.dt.Place#getOutputOf <em>Output Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Place)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition_Output()
	 * @see cn.edu.pku.sei.ra.dt.Place#getOutputOf
	 * @model opposite="outputOf" required="true"
	 * @generated
	 */
	Place getOutput();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Transition#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Place value);

	/**
	 * Returns the value of the '<em><b>Involved</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved</em>' attribute.
	 * @see #setInvolved(boolean)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition_Involved()
	 * @model default="False" required="true"
	 * @generated
	 */
	boolean isInvolved();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Transition#isInvolved <em>Involved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Involved</em>' attribute.
	 * @see #isInvolved()
	 * @generated
	 */
	void setInvolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * The literals are from the enumeration {@link cn.edu.pku.sei.ra.dt.TransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cn.edu.pku.sei.ra.dt.TransitionType
	 * @see #setType(TransitionType)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition_Type()
	 * @model default="False" required="true"
	 * @generated
	 */
	TransitionType getType();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Transition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cn.edu.pku.sei.ra.dt.TransitionType
	 * @see #getType()
	 * @generated
	 */
	void setType(TransitionType value);

	/**
	 * Returns the value of the '<em><b>Java Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Element</em>' attribute.
	 * @see #setJavaElement(IJavaElement)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition_JavaElement()
	 * @model dataType="cn.edu.pku.sei.ra.dt.SJavaElement" required="true" transient="true"
	 * @generated
	 */
	IJavaElement getJavaElement();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Transition#getJavaElement <em>Java Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Element</em>' attribute.
	 * @see #getJavaElement()
	 * @generated
	 */
	void setJavaElement(IJavaElement value);

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
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition_Signature()
	 * @model required="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Transition#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Activated</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activated</em>' attribute.
	 * @see #setActivated(boolean)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition_Activated()
	 * @model default="False" required="true"
	 * @generated
	 */
	boolean isActivated();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Transition#isActivated <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated</em>' attribute.
	 * @see #isActivated()
	 * @generated
	 */
	void setActivated(boolean value);

	/**
	 * Returns the value of the '<em><b>Invokechain</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invokechain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invokechain</em>' attribute.
	 * @see #setInvokechain(boolean)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransition_Invokechain()
	 * @model default="False" required="true"
	 * @generated
	 */
	boolean isInvokechain();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Transition#isInvokechain <em>Invokechain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invokechain</em>' attribute.
	 * @see #isInvokechain()
	 * @generated
	 */
	void setInvokechain(boolean value);

} // Transition
