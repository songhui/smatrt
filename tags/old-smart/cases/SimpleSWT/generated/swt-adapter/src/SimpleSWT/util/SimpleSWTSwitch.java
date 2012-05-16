/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT.util;

import SimpleSWT.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see SimpleSWT.SimpleSWTPackage
 * @generated
 */
public class SimpleSWTSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SimpleSWTPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSWTSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SimpleSWTPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SimpleSWTPackage.CONTROL_WRAP:
      {
        ControlWrap controlWrap = (ControlWrap)theEObject;
        T result = caseControlWrap(controlWrap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleSWTPackage.COMPOSITE_WRAP:
      {
        CompositeWrap compositeWrap = (CompositeWrap)theEObject;
        T result = caseCompositeWrap(compositeWrap);
        if (result == null) result = caseControlWrap(compositeWrap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleSWTPackage.TEXT_WRAP:
      {
        TextWrap textWrap = (TextWrap)theEObject;
        T result = caseTextWrap(textWrap);
        if (result == null) result = caseControlWrap(textWrap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleSWTPackage.BUTTON_WRAP:
      {
        ButtonWrap buttonWrap = (ButtonWrap)theEObject;
        T result = caseButtonWrap(buttonWrap);
        if (result == null) result = caseControlWrap(buttonWrap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimpleSWTPackage.LABEL_WRAP:
      {
        LabelWrap labelWrap = (LabelWrap)theEObject;
        T result = caseLabelWrap(labelWrap);
        if (result == null) result = caseControlWrap(labelWrap);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Wrap</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Wrap</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlWrap(ControlWrap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Wrap</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Wrap</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeWrap(CompositeWrap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Wrap</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Wrap</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextWrap(TextWrap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Wrap</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Wrap</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonWrap(ButtonWrap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Wrap</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Wrap</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelWrap(LabelWrap object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SimpleSWTSwitch
