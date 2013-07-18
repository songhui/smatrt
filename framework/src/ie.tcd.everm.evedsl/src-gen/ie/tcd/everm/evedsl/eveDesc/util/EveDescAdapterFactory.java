/**
 */
package ie.tcd.everm.evedsl.eveDesc.util;

import ie.tcd.everm.evedsl.eveDesc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage
 * @generated
 */
public class EveDescAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EveDescPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveDescAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EveDescPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EveDescSwitch<Adapter> modelSwitch =
    new EveDescSwitch<Adapter>()
    {
      @Override
      public Adapter caseEventDesc(EventDesc object)
      {
        return createEventDescAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseHelper(Helper object)
      {
        return createHelperAdapter();
      }
      @Override
      public Adapter caseEventSeq(EventSeq object)
      {
        return createEventSeqAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseParser(Parser object)
      {
        return createParserAdapter();
      }
      @Override
      public Adapter caseTextParser(TextParser object)
      {
        return createTextParserAdapter();
      }
      @Override
      public Adapter caseTextFormatter(TextFormatter object)
      {
        return createTextFormatterAdapter();
      }
      @Override
      public Adapter caseWordFormatter(WordFormatter object)
      {
        return createWordFormatterAdapter();
      }
      @Override
      public Adapter caseSplitFormatter(SplitFormatter object)
      {
        return createSplitFormatterAdapter();
      }
      @Override
      public Adapter caseUserDefinedFormatter(UserDefinedFormatter object)
      {
        return createUserDefinedFormatterAdapter();
      }
      @Override
      public Adapter caseAbstractTextValue(AbstractTextValue object)
      {
        return createAbstractTextValueAdapter();
      }
      @Override
      public Adapter caseVarValue(VarValue object)
      {
        return createVarValueAdapter();
      }
      @Override
      public Adapter caseConstantText(ConstantText object)
      {
        return createConstantTextAdapter();
      }
      @Override
      public Adapter caseIgnoreValue(IgnoreValue object)
      {
        return createIgnoreValueAdapter();
      }
      @Override
      public Adapter casePlainParser(PlainParser object)
      {
        return createPlainParserAdapter();
      }
      @Override
      public Adapter caseDirectObjectParser(DirectObjectParser object)
      {
        return createDirectObjectParserAdapter();
      }
      @Override
      public Adapter caseDecScope(DecScope object)
      {
        return createDecScopeAdapter();
      }
      @Override
      public Adapter caseScope(Scope object)
      {
        return createScopeAdapter();
      }
      @Override
      public Adapter caseAPI(API object)
      {
        return createAPIAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseSubType(SubType object)
      {
        return createSubTypeAdapter();
      }
      @Override
      public Adapter caseInvocation(Invocation object)
      {
        return createInvocationAdapter();
      }
      @Override
      public Adapter caseOperationPointCut(OperationPointCut object)
      {
        return createOperationPointCutAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.EventDesc <em>Event Desc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.EventDesc
   * @generated
   */
  public Adapter createEventDescAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.Helper <em>Helper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.Helper
   * @generated
   */
  public Adapter createHelperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.EventSeq <em>Event Seq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.EventSeq
   * @generated
   */
  public Adapter createEventSeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.Parser <em>Parser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.Parser
   * @generated
   */
  public Adapter createParserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.TextParser <em>Text Parser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.TextParser
   * @generated
   */
  public Adapter createTextParserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.TextFormatter <em>Text Formatter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.TextFormatter
   * @generated
   */
  public Adapter createTextFormatterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.WordFormatter <em>Word Formatter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.WordFormatter
   * @generated
   */
  public Adapter createWordFormatterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.SplitFormatter <em>Split Formatter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.SplitFormatter
   * @generated
   */
  public Adapter createSplitFormatterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter <em>User Defined Formatter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter
   * @generated
   */
  public Adapter createUserDefinedFormatterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.AbstractTextValue <em>Abstract Text Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.AbstractTextValue
   * @generated
   */
  public Adapter createAbstractTextValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.VarValue <em>Var Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.VarValue
   * @generated
   */
  public Adapter createVarValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.ConstantText <em>Constant Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.ConstantText
   * @generated
   */
  public Adapter createConstantTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.IgnoreValue <em>Ignore Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.IgnoreValue
   * @generated
   */
  public Adapter createIgnoreValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.PlainParser <em>Plain Parser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.PlainParser
   * @generated
   */
  public Adapter createPlainParserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.DirectObjectParser <em>Direct Object Parser</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.DirectObjectParser
   * @generated
   */
  public Adapter createDirectObjectParserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.DecScope <em>Dec Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.DecScope
   * @generated
   */
  public Adapter createDecScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.Scope
   * @generated
   */
  public Adapter createScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.API <em>API</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.API
   * @generated
   */
  public Adapter createAPIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.SubType <em>Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.SubType
   * @generated
   */
  public Adapter createSubTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.Invocation <em>Invocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.Invocation
   * @generated
   */
  public Adapter createInvocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut <em>Operation Point Cut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ie.tcd.everm.evedsl.eveDesc.OperationPointCut
   * @generated
   */
  public Adapter createOperationPointCutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EveDescAdapterFactory
