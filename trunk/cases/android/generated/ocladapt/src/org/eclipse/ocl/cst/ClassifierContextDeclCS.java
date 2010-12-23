/**
 * <copyright>
 * 
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ClassifierContextDeclCS.java,v 1.1 2007/10/11 23:04:55 cdamus Exp $
 */
package org.eclipse.ocl.cst;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Context Decl CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.cst.ClassifierContextDeclCS#getPathNameCS <em>Path Name CS</em>}</li>
 *   <li>{@link org.eclipse.ocl.cst.ClassifierContextDeclCS#getInvOrDefCS <em>Inv Or Def CS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.cst.CSTPackage#getClassifierContextDeclCS()
 * @model
 * @generated
 */
public interface ClassifierContextDeclCS extends ContextDeclCS {
	/**
     * Returns the value of the '<em><b>Path Name CS</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Name CS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Path Name CS</em>' containment reference.
     * @see #setPathNameCS(PathNameCS)
     * @see org.eclipse.ocl.cst.CSTPackage#getClassifierContextDeclCS_PathNameCS()
     * @model containment="true"
     * @generated
     */
	PathNameCS getPathNameCS();

	/**
     * Sets the value of the '{@link org.eclipse.ocl.cst.ClassifierContextDeclCS#getPathNameCS <em>Path Name CS</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path Name CS</em>' containment reference.
     * @see #getPathNameCS()
     * @generated
     */
	void setPathNameCS(PathNameCS value);

	/**
     * Returns the value of the '<em><b>Inv Or Def CS</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inv Or Def CS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Inv Or Def CS</em>' containment reference.
     * @see #setInvOrDefCS(InvOrDefCS)
     * @see org.eclipse.ocl.cst.CSTPackage#getClassifierContextDeclCS_InvOrDefCS()
     * @model containment="true"
     * @generated
     */
	InvOrDefCS getInvOrDefCS();

	/**
     * Sets the value of the '{@link org.eclipse.ocl.cst.ClassifierContextDeclCS#getInvOrDefCS <em>Inv Or Def CS</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inv Or Def CS</em>' containment reference.
     * @see #getInvOrDefCS()
     * @generated
     */
	void setInvOrDefCS(InvOrDefCS value);

} // ClassifierContextDeclCS
