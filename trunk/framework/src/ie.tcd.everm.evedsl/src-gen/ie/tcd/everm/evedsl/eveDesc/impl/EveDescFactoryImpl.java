/**
 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EveDescFactoryImpl extends EFactoryImpl implements EveDescFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EveDescFactory init()
  {
    try
    {
      EveDescFactory theEveDescFactory = (EveDescFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tcd.ie/everm/evedsl/EveDesc"); 
      if (theEveDescFactory != null)
      {
        return theEveDescFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EveDescFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveDescFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EveDescPackage.EVENT_DESC: return createEventDesc();
      case EveDescPackage.IMPORT: return createImport();
      case EveDescPackage.HELPER: return createHelper();
      case EveDescPackage.EVENT_SEQ: return createEventSeq();
      case EveDescPackage.EVENT: return createEvent();
      case EveDescPackage.PARSER: return createParser();
      case EveDescPackage.TEXT_PARSER: return createTextParser();
      case EveDescPackage.TEXT_FORMATTER: return createTextFormatter();
      case EveDescPackage.WORD_FORMATTER: return createWordFormatter();
      case EveDescPackage.SPLIT_FORMATTER: return createSplitFormatter();
      case EveDescPackage.USER_DEFINED_FORMATTER: return createUserDefinedFormatter();
      case EveDescPackage.ABSTRACT_TEXT_VALUE: return createAbstractTextValue();
      case EveDescPackage.VAR_VALUE: return createVarValue();
      case EveDescPackage.CONSTANT_TEXT: return createConstantText();
      case EveDescPackage.IGNORE_VALUE: return createIgnoreValue();
      case EveDescPackage.PLAIN_PARSER: return createPlainParser();
      case EveDescPackage.DEC_SCOPE: return createDecScope();
      case EveDescPackage.SCOPE: return createScope();
      case EveDescPackage.API: return createAPI();
      case EveDescPackage.MAPPING: return createMapping();
      case EveDescPackage.SUB_TYPE: return createSubType();
      case EveDescPackage.INVOCATION: return createInvocation();
      case EveDescPackage.OPERATION_POINT_CUT: return createOperationPointCut();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EveDescPackage.OPERATION_TYPE:
        return createOperationTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EveDescPackage.OPERATION_TYPE:
        return convertOperationTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDesc createEventDesc()
  {
    EventDescImpl eventDesc = new EventDescImpl();
    return eventDesc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Helper createHelper()
  {
    HelperImpl helper = new HelperImpl();
    return helper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSeq createEventSeq()
  {
    EventSeqImpl eventSeq = new EventSeqImpl();
    return eventSeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parser createParser()
  {
    ParserImpl parser = new ParserImpl();
    return parser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextParser createTextParser()
  {
    TextParserImpl textParser = new TextParserImpl();
    return textParser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextFormatter createTextFormatter()
  {
    TextFormatterImpl textFormatter = new TextFormatterImpl();
    return textFormatter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WordFormatter createWordFormatter()
  {
    WordFormatterImpl wordFormatter = new WordFormatterImpl();
    return wordFormatter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplitFormatter createSplitFormatter()
  {
    SplitFormatterImpl splitFormatter = new SplitFormatterImpl();
    return splitFormatter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserDefinedFormatter createUserDefinedFormatter()
  {
    UserDefinedFormatterImpl userDefinedFormatter = new UserDefinedFormatterImpl();
    return userDefinedFormatter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractTextValue createAbstractTextValue()
  {
    AbstractTextValueImpl abstractTextValue = new AbstractTextValueImpl();
    return abstractTextValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarValue createVarValue()
  {
    VarValueImpl varValue = new VarValueImpl();
    return varValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantText createConstantText()
  {
    ConstantTextImpl constantText = new ConstantTextImpl();
    return constantText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IgnoreValue createIgnoreValue()
  {
    IgnoreValueImpl ignoreValue = new IgnoreValueImpl();
    return ignoreValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlainParser createPlainParser()
  {
    PlainParserImpl plainParser = new PlainParserImpl();
    return plainParser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecScope createDecScope()
  {
    DecScopeImpl decScope = new DecScopeImpl();
    return decScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scope createScope()
  {
    ScopeImpl scope = new ScopeImpl();
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public API createAPI()
  {
    APIImpl api = new APIImpl();
    return api;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubType createSubType()
  {
    SubTypeImpl subType = new SubTypeImpl();
    return subType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Invocation createInvocation()
  {
    InvocationImpl invocation = new InvocationImpl();
    return invocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationPointCut createOperationPointCut()
  {
    OperationPointCutImpl operationPointCut = new OperationPointCutImpl();
    return operationPointCut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue)
  {
    OperationType result = OperationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveDescPackage getEveDescPackage()
  {
    return (EveDescPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EveDescPackage getPackage()
  {
    return EveDescPackage.eINSTANCE;
  }

} //EveDescFactoryImpl
