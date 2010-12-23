/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 * 
 * </copyright>
 *
 * $Id: SetType.java,v 1.2 2007/02/14 13:42:16 cdamus Exp $
 */
package org.eclipse.ocl.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.types.TypesPackage#getSetType()
 * @model
 * @generated
 */
public interface SetType<C, O> extends CollectionType<C, O> {
	String SINGLETON_NAME = "Set"; //$NON-NLS-1$

} // SetType
