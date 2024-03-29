/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
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
 * $Id: EDataTypeUniqueEList.java,v 1.3 2006/12/05 20:22:26 emerks Exp $
 */
package org.eclipse.emf.ecore.util;


import org.eclipse.emf.ecore.InternalEObject;


public class EDataTypeUniqueEList<E> extends EDataTypeEList<E>
{
  private static final long serialVersionUID = 1L;

  public static class Unsettable<E> extends EDataTypeEList.Unsettable<E>
  {
    private static final long serialVersionUID = 1L;

    public Unsettable(Class<?> dataClass, InternalEObject owner, int featureID)
    {
      super(dataClass, owner, featureID);
    }

    @Override
    protected boolean isUnique()
    {
      return true;
    }
  }

  public EDataTypeUniqueEList(Class<?> dataClass, InternalEObject owner, int featureID)
  {
    super(dataClass, owner, featureID);
  }

  @Override
  protected boolean isUnique()
  {
    return true;
  }
}
