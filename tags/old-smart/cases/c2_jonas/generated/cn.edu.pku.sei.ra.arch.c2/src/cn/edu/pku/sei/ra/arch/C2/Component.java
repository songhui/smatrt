/**
 * <copyright>
 * </copyright>
 *
 * $Id: Component.java,v 1.2 2008/11/13 05:53:00 song Exp $
 */
package cn.edu.pku.sei.ra.arch.C2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getFilePath <em>File Path</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getAddress <em>Address</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getVersion <em>Version</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getMinPool <em>Min Pool</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getMaxPool <em>Max Pool</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getAbove <em>Above</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getBelow <em>Below</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getParent <em>Parent</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getType <em>Type</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getComment <em>Comment</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getInnerArch <em>Inner Arch</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.Component#getInstanceLife <em>Instance Life</em>}</li>
 * </ul>
 * </p>
 *
 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_Name()
	 * @model required="true"
	 *        annotation="http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations KeyAttribute='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_FilePath()
	 * @model required="true"
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_Address()
	 * @model required="true"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Pool Size</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pool Size</em>' attribute.
	 * @see #setPoolSize(int)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_PoolSize()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getPoolSize();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getPoolSize <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Size</em>' attribute.
	 * @see #getPoolSize()
	 * @generated
	 */
	void setPoolSize(int value);

	/**
	 * Returns the value of the '<em><b>Min Pool</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Pool</em>' attribute.
	 * @see #setMinPool(int)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_MinPool()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getMinPool();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getMinPool <em>Min Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Pool</em>' attribute.
	 * @see #getMinPool()
	 * @generated
	 */
	void setMinPool(int value);

	/**
	 * Returns the value of the '<em><b>Max Pool</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Pool</em>' attribute.
	 * @see #setMaxPool(int)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_MaxPool()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getMaxPool();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getMaxPool <em>Max Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pool</em>' attribute.
	 * @see #getMaxPool()
	 * @generated
	 */
	void setMaxPool(int value);

	/**
	 * Returns the value of the '<em><b>Above</b></em>' reference list.
	 * The list contents are of type {@link cn.edu.pku.sei.ra.arch.C2.Connector}.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getBelow <em>Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Above</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Above</em>' reference list.
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_Above()
	 * @see cn.edu.pku.sei.ra.arch.C2.Connector#getBelow
	 * @model opposite="below" ordered="false"
	 * @generated
	 */
	EList<Connector> getAbove();

	/**
	 * Returns the value of the '<em><b>Below</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getAbove <em>Above</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Below</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Below</em>' reference.
	 * @see #setBelow(Connector)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_Below()
	 * @see cn.edu.pku.sei.ra.arch.C2.Connector#getAbove
	 * @model opposite="above"
	 * @generated
	 */
	Connector getBelow();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getBelow <em>Below</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Below</em>' reference.
	 * @see #getBelow()
	 * @generated
	 */
	void setBelow(Connector value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Architecture)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_Parent()
	 * @see cn.edu.pku.sei.ra.arch.C2.Architecture#getComponent
	 * @model opposite="component" required="true" transient="false"
	 * @generated
	 */
	Architecture getParent();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getParent <em>Parent</em>}' container reference.
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
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getType <em>Type</em>}' attribute.
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
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_Comment()
	 * @model required="true"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Inner Arch</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Arch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Arch</em>' containment reference.
	 * @see #setInnerArch(Architecture)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_InnerArch()
	 * @see cn.edu.pku.sei.ra.arch.C2.Architecture#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	Architecture getInnerArch();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getInnerArch <em>Inner Arch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Arch</em>' containment reference.
	 * @see #getInnerArch()
	 * @generated
	 */
	void setInnerArch(Architecture value);

	/**
	 * Returns the value of the '<em><b>Instance Life</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Life</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Life</em>' attribute.
	 * @see #setInstanceLife(int)
	 * @see cn.edu.pku.sei.ra.arch.C2.C2Package#getComponent_InstanceLife()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getInstanceLife();

	/**
	 * Sets the value of the '{@link cn.edu.pku.sei.ra.arch.C2.Component#getInstanceLife <em>Instance Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Life</em>' attribute.
	 * @see #getInstanceLife()
	 * @generated
	 */
	void setInstanceLife(int value);

} // Component
