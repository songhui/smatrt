/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc.util;

import ie.tcd.everm.evedsl.eveDesc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage
 * @generated
 */
public class EveDescSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EveDescPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveDescSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EveDescPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EveDescPackage.EVENT_DESC:
      {
        EventDesc eventDesc = (EventDesc)theEObject;
        T result = caseEventDesc(eventDesc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.HELPER:
      {
        Helper helper = (Helper)theEObject;
        T result = caseHelper(helper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.EVENT_SEQ:
      {
        EventSeq eventSeq = (EventSeq)theEObject;
        T result = caseEventSeq(eventSeq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.PARSER:
      {
        Parser parser = (Parser)theEObject;
        T result = caseParser(parser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.TEXT_PARSER:
      {
        TextParser textParser = (TextParser)theEObject;
        T result = caseTextParser(textParser);
        if (result == null) result = caseParser(textParser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.TEXT_FORMATTER:
      {
        TextFormatter textFormatter = (TextFormatter)theEObject;
        T result = caseTextFormatter(textFormatter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.SPLIT_FORMATTER:
      {
        SplitFormatter splitFormatter = (SplitFormatter)theEObject;
        T result = caseSplitFormatter(splitFormatter);
        if (result == null) result = caseTextFormatter(splitFormatter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.USER_DEFINED_FORMATTER:
      {
        UserDefinedFormatter userDefinedFormatter = (UserDefinedFormatter)theEObject;
        T result = caseUserDefinedFormatter(userDefinedFormatter);
        if (result == null) result = caseTextFormatter(userDefinedFormatter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.ABSTRACT_TEXT_VALUE:
      {
        AbstractTextValue abstractTextValue = (AbstractTextValue)theEObject;
        T result = caseAbstractTextValue(abstractTextValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.VAR_VALUE:
      {
        VarValue varValue = (VarValue)theEObject;
        T result = caseVarValue(varValue);
        if (result == null) result = caseAbstractTextValue(varValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.CONSTANT_TEXT:
      {
        ConstantText constantText = (ConstantText)theEObject;
        T result = caseConstantText(constantText);
        if (result == null) result = caseAbstractTextValue(constantText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.IGNORE_VALUE:
      {
        IgnoreValue ignoreValue = (IgnoreValue)theEObject;
        T result = caseIgnoreValue(ignoreValue);
        if (result == null) result = caseAbstractTextValue(ignoreValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.PLAIN_PARSER:
      {
        PlainParser plainParser = (PlainParser)theEObject;
        T result = casePlainParser(plainParser);
        if (result == null) result = caseParser(plainParser);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.DEC_SCOPE:
      {
        DecScope decScope = (DecScope)theEObject;
        T result = caseDecScope(decScope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.SCOPE:
      {
        Scope scope = (Scope)theEObject;
        T result = caseScope(scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.API:
      {
        API api = (API)theEObject;
        T result = caseAPI(api);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.MAPPING:
      {
        Mapping mapping = (Mapping)theEObject;
        T result = caseMapping(mapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.SUB_TYPE:
      {
        SubType subType = (SubType)theEObject;
        T result = caseSubType(subType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.INVOCATION:
      {
        Invocation invocation = (Invocation)theEObject;
        T result = caseInvocation(invocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EveDescPackage.OPERATION_POINT_CUT:
      {
        OperationPointCut operationPointCut = (OperationPointCut)theEObject;
        T result = caseOperationPointCut(operationPointCut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Desc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Desc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventDesc(EventDesc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Helper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Helper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHelper(Helper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Seq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Seq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventSeq(EventSeq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parser</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParser(Parser object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Parser</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Parser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextParser(TextParser object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Formatter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Formatter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextFormatter(TextFormatter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Split Formatter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Split Formatter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSplitFormatter(SplitFormatter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Defined Formatter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Defined Formatter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserDefinedFormatter(UserDefinedFormatter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Text Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Text Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractTextValue(AbstractTextValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarValue(VarValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantText(ConstantText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ignore Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ignore Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIgnoreValue(IgnoreValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plain Parser</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plain Parser</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlainParser(PlainParser object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dec Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dec Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecScope(DecScope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScope(Scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>API</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>API</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAPI(API object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapping(Mapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubType(SubType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvocation(Invocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Point Cut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Point Cut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationPointCut(OperationPointCut object)
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
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EveDescSwitch
