/**
 * <copyright>
 * 
 * Copyright (c) 2007, 2008 IBM Corporation and others.
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
 * $Id: BooleanLiteralExpImpl.java,v 1.4 2008/03/28 20:33:41 cdamus Exp $
 */
package org.eclipse.ocl.ecore.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.ecore.BooleanLiteralExp;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.operations.BooleanLiteralExpOperations;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.ecore.impl.BooleanLiteralExpImpl#getBooleanSymbol <em>Boolean Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanLiteralExpImpl extends PrimitiveLiteralExpImpl implements BooleanLiteralExp {
	/**
     * The default value of the '{@link #getBooleanSymbol() <em>Boolean Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBooleanSymbol()
     * @generated
     * @ordered
     */
	protected static final Boolean BOOLEAN_SYMBOL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getBooleanSymbol() <em>Boolean Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBooleanSymbol()
     * @generated
     * @ordered
     */
	protected Boolean booleanSymbol = BOOLEAN_SYMBOL_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BooleanLiteralExpImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return EcorePackage.Literals.BOOLEAN_LITERAL_EXP;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Boolean getBooleanSymbol() {
        return booleanSymbol;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBooleanSymbol(Boolean newBooleanSymbol) {
        Boolean oldBooleanSymbol = booleanSymbol;
        booleanSymbol = newBooleanSymbol;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL, oldBooleanSymbol, booleanSymbol));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean checkBooleanType(DiagnosticChain diagnostics, Map<Object, Object> context) {
        return BooleanLiteralExpOperations.checkBooleanType(this, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EcorePackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL:
                return getBooleanSymbol();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EcorePackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL:
                setBooleanSymbol((Boolean)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case EcorePackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL:
                setBooleanSymbol(BOOLEAN_SYMBOL_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EcorePackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL:
                return BOOLEAN_SYMBOL_EDEFAULT == null ? booleanSymbol != null : !BOOLEAN_SYMBOL_EDEFAULT.equals(booleanSymbol);
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == org.eclipse.ocl.expressions.BooleanLiteralExp.class) {
            switch (derivedFeatureID) {
                case EcorePackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL: return ExpressionsPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == org.eclipse.ocl.expressions.BooleanLiteralExp.class) {
            switch (baseFeatureID) {
                case ExpressionsPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL: return EcorePackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
    public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		return v.visitBooleanLiteralExp((org.eclipse.ocl.expressions.BooleanLiteralExp)this);
	}

} //BooleanLiteralExpImpl
