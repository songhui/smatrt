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
 * $Id: LetExpCS.java,v 1.1 2007/10/11 23:04:54 cdamus Exp $
 */
package org.eclipse.ocl.cst;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.cst.LetExpCS#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eclipse.ocl.cst.LetExpCS#getInExpression <em>In Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.cst.CSTPackage#getLetExpCS()
 * @model
 * @generated
 */
public interface LetExpCS extends OCLExpressionCS {
	/**
     * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.ocl.cst.VariableCS}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' containment reference list.
     * @see org.eclipse.ocl.cst.CSTPackage#getLetExpCS_Variables()
     * @model containment="true" required="true"
     * @generated
     */
	EList<VariableCS> getVariables();

	/**
     * Returns the value of the '<em><b>In Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>In Expression</em>' containment reference.
     * @see #setInExpression(OCLExpressionCS)
     * @see org.eclipse.ocl.cst.CSTPackage#getLetExpCS_InExpression()
     * @model containment="true"
     * @generated
     */
	OCLExpressionCS getInExpression();

	/**
     * Sets the value of the '{@link org.eclipse.ocl.cst.LetExpCS#getInExpression <em>In Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Expression</em>' containment reference.
     * @see #getInExpression()
     * @generated
     */
	void setInExpression(OCLExpressionCS value);

} // LetExpCS
