/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeNone;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code None</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CodeNoneImpl extends CodeImpl implements CodeNone {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeNoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecModelPackage.Literals.CODE_NONE;
	}
	
	public String getCode(){
		return "";
	}

} //CodeNoneImpl
