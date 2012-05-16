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
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Place#getId <em>Id</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Place#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Place#getVariable <em>Variable</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Place#getStatementOrMethod <em>Statement Or Method</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Place#isInvolved <em>Involved</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Place#getInputOf <em>Input Of</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Place#getOutputOf <em>Output Of</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Place#getType <em>Type</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Place#getParaOrder <em>Para Order</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.Place#getTypefull <em>Typefull</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject {
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
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Place#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Place#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(IJavaElement)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace_Variable()
	 * @model dataType="cn.edu.pku.sei.ra.dt.SJavaElement" required="true" transient="true"
	 * @generated
	 */
	IJavaElement getVariable();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Place#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(IJavaElement value);

	/**
	 * Returns the value of the '<em><b>Statement Or Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Or Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Or Method</em>' attribute.
	 * @see #setStatementOrMethod(ASTNode)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace_StatementOrMethod()
	 * @model dataType="cn.edu.pku.sei.ra.dt.SStatementOrMethod" required="true" transient="true"
	 * @generated
	 */
	ASTNode getStatementOrMethod();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Place#getStatementOrMethod <em>Statement Or Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Or Method</em>' attribute.
	 * @see #getStatementOrMethod()
	 * @generated
	 */
	void setStatementOrMethod(ASTNode value);

	/**
	 * Returns the value of the '<em><b>Involved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved</em>' attribute.
	 * @see #setInvolved(boolean)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace_Involved()
	 * @model required="true"
	 * @generated
	 */
	boolean isInvolved();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Place#isInvolved <em>Involved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Involved</em>' attribute.
	 * @see #isInvolved()
	 * @generated
	 */
	void setInvolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Of</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.dt.Transition}.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.dt.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Of</em>' reference list.
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace_InputOf()
	 * @see cn.edu.pku.sei.ra.dt.Transition#getInput
	 * @model opposite="input"
	 * @generated
	 */
	EList<Transition> getInputOf();

	/**
	 * Returns the value of the '<em><b>Output Of</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.dt.Transition}.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.dt.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Of</em>' reference list.
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace_OutputOf()
	 * @see cn.edu.pku.sei.ra.dt.Transition#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	EList<Transition> getOutputOf();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * The literals are from the enumeration {@link cn.edu.pku.sei.ra.dt.PlaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cn.edu.pku.sei.ra.dt.PlaceType
	 * @see #setType(PlaceType)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace_Type()
	 * @model default="False" required="true"
	 * @generated
	 */
	PlaceType getType();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Place#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cn.edu.pku.sei.ra.dt.PlaceType
	 * @see #getType()
	 * @generated
	 */
	void setType(PlaceType value);

	/**
	 * Returns the value of the '<em><b>Para Order</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Para Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para Order</em>' attribute.
	 * @see #setParaOrder(int)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace_ParaOrder()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getParaOrder();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Place#getParaOrder <em>Para Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Para Order</em>' attribute.
	 * @see #getParaOrder()
	 * @generated
	 */
	void setParaOrder(int value);

	/**
	 * Returns the value of the '<em><b>Typefull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typefull</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typefull</em>' attribute.
	 * @see #setTypefull(String)
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlace_Typefull()
	 * @model required="true"
	 * @generated
	 */
	String getTypefull();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.dt.Place#getTypefull <em>Typefull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typefull</em>' attribute.
	 * @see #getTypefull()
	 * @generated
	 */
	void setTypefull(String value);

} // Place
