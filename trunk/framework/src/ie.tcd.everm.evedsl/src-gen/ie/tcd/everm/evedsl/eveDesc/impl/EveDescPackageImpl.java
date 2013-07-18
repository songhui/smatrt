/**
 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.AbstractTextValue;
import ie.tcd.everm.evedsl.eveDesc.ConstantText;
import ie.tcd.everm.evedsl.eveDesc.DecScope;
import ie.tcd.everm.evedsl.eveDesc.DirectObjectParser;
import ie.tcd.everm.evedsl.eveDesc.EveDescFactory;
import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.Event;
import ie.tcd.everm.evedsl.eveDesc.EventDesc;
import ie.tcd.everm.evedsl.eveDesc.EventSeq;
import ie.tcd.everm.evedsl.eveDesc.Helper;
import ie.tcd.everm.evedsl.eveDesc.IgnoreValue;
import ie.tcd.everm.evedsl.eveDesc.Import;
import ie.tcd.everm.evedsl.eveDesc.Invocation;
import ie.tcd.everm.evedsl.eveDesc.Mapping;
import ie.tcd.everm.evedsl.eveDesc.OperationPointCut;
import ie.tcd.everm.evedsl.eveDesc.OperationType;
import ie.tcd.everm.evedsl.eveDesc.Parser;
import ie.tcd.everm.evedsl.eveDesc.PlainParser;
import ie.tcd.everm.evedsl.eveDesc.Scope;
import ie.tcd.everm.evedsl.eveDesc.SplitFormatter;
import ie.tcd.everm.evedsl.eveDesc.SubType;
import ie.tcd.everm.evedsl.eveDesc.TextFormatter;
import ie.tcd.everm.evedsl.eveDesc.TextParser;
import ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter;
import ie.tcd.everm.evedsl.eveDesc.VarValue;
import ie.tcd.everm.evedsl.eveDesc.WordFormatter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EveDescPackageImpl extends EPackageImpl implements EveDescPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDescEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass helperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventSeqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textParserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textFormatterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wordFormatterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass splitFormatterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userDefinedFormatterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractTextValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ignoreValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plainParserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directObjectParserEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass apiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationPointCutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operationTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EveDescPackageImpl()
  {
    super(eNS_URI, EveDescFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EveDescPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EveDescPackage init()
  {
    if (isInited) return (EveDescPackage)EPackage.Registry.INSTANCE.getEPackage(EveDescPackage.eNS_URI);

    // Obtain or create and register package
    EveDescPackageImpl theEveDescPackage = (EveDescPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EveDescPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EveDescPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEveDescPackage.createPackageContents();

    // Initialize created meta-data
    theEveDescPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEveDescPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EveDescPackage.eNS_URI, theEveDescPackage);
    return theEveDescPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventDesc()
  {
    return eventDescEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDesc_Name()
  {
    return (EAttribute)eventDescEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDesc_Imports()
  {
    return (EReference)eventDescEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDesc_Sequence()
  {
    return (EReference)eventDescEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDesc_Api()
  {
    return (EReference)eventDescEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHelper()
  {
    return helperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHelper_Name()
  {
    return (EAttribute)helperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelper_Params()
  {
    return (EReference)helperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelper_Type()
  {
    return (EReference)helperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHelper_Body()
  {
    return (EReference)helperEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventSeq()
  {
    return eventSeqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventSeq_Name()
  {
    return (EAttribute)eventSeqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventSeq_Helper()
  {
    return (EReference)eventSeqEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventSeq_Event()
  {
    return (EReference)eventSeqEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvent_Name()
  {
    return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_DecScope()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Parser()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Pre()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Post()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParser()
  {
    return parserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParser_Ivar()
  {
    return (EReference)parserEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextParser()
  {
    return textParserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextParser_Formatter()
  {
    return (EReference)textParserEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextParser_Value()
  {
    return (EReference)textParserEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextFormatter()
  {
    return textFormatterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWordFormatter()
  {
    return wordFormatterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWordFormatter_White()
  {
    return (EAttribute)wordFormatterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSplitFormatter()
  {
    return splitFormatterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplitFormatter_Spliter()
  {
    return (EAttribute)splitFormatterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserDefinedFormatter()
  {
    return userDefinedFormatterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserDefinedFormatter_Expr()
  {
    return (EReference)userDefinedFormatterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractTextValue()
  {
    return abstractTextValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarValue()
  {
    return varValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarValue_Variable()
  {
    return (EReference)varValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantText()
  {
    return constantTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantText_Content()
  {
    return (EAttribute)constantTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIgnoreValue()
  {
    return ignoreValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIgnoreValue_Ignore()
  {
    return (EAttribute)ignoreValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlainParser()
  {
    return plainParserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlainParser_Logic()
  {
    return (EReference)plainParserEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectObjectParser()
  {
    return directObjectParserEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectObjectParser_Type()
  {
    return (EReference)directObjectParserEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecScope()
  {
    return decScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecScope_Var()
  {
    return (EReference)decScopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecScope_Scope()
  {
    return (EReference)decScopeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScope()
  {
    return scopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScope_Expr()
  {
    return (EReference)scopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScope_Enforce()
  {
    return (EAttribute)scopeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScope_Realtype()
  {
    return (EReference)scopeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAPI()
  {
    return apiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAPI_Name()
  {
    return (EAttribute)apiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAPI_Helper()
  {
    return (EReference)apiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAPI_Mapping()
  {
    return (EReference)apiEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAPI_Invocation()
  {
    return (EReference)apiEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapping()
  {
    return mappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_MType()
  {
    return (EReference)mappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_SType()
  {
    return (EReference)mappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapping_Unique()
  {
    return (EAttribute)mappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_Identify()
  {
    return (EReference)mappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_SubType()
  {
    return (EReference)mappingEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapping_NewImage()
  {
    return (EReference)mappingEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubType()
  {
    return subTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubType_Type()
  {
    return (EReference)subTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubType_Pre()
  {
    return (EReference)subTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvocation()
  {
    return invocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInvocation_Name()
  {
    return (EAttribute)invocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvocation_Variable()
  {
    return (EReference)invocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvocation_Operation()
  {
    return (EReference)invocationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvocation_Pre()
  {
    return (EReference)invocationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvocation_RetType()
  {
    return (EReference)invocationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvocation_Invoke()
  {
    return (EReference)invocationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvocation_Postpara()
  {
    return (EReference)invocationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvocation_Post()
  {
    return (EReference)invocationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationPointCut()
  {
    return operationPointCutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationPointCut_OpType()
  {
    return (EAttribute)operationPointCutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationPointCut_ElemType()
  {
    return (EReference)operationPointCutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperationPointCut_Feature()
  {
    return (EAttribute)operationPointCutEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationPointCut_Pre()
  {
    return (EReference)operationPointCutEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperationType()
  {
    return operationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveDescFactory getEveDescFactory()
  {
    return (EveDescFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    eventDescEClass = createEClass(EVENT_DESC);
    createEAttribute(eventDescEClass, EVENT_DESC__NAME);
    createEReference(eventDescEClass, EVENT_DESC__IMPORTS);
    createEReference(eventDescEClass, EVENT_DESC__SEQUENCE);
    createEReference(eventDescEClass, EVENT_DESC__API);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    helperEClass = createEClass(HELPER);
    createEAttribute(helperEClass, HELPER__NAME);
    createEReference(helperEClass, HELPER__PARAMS);
    createEReference(helperEClass, HELPER__TYPE);
    createEReference(helperEClass, HELPER__BODY);

    eventSeqEClass = createEClass(EVENT_SEQ);
    createEAttribute(eventSeqEClass, EVENT_SEQ__NAME);
    createEReference(eventSeqEClass, EVENT_SEQ__HELPER);
    createEReference(eventSeqEClass, EVENT_SEQ__EVENT);

    eventEClass = createEClass(EVENT);
    createEAttribute(eventEClass, EVENT__NAME);
    createEReference(eventEClass, EVENT__DEC_SCOPE);
    createEReference(eventEClass, EVENT__PARSER);
    createEReference(eventEClass, EVENT__PRE);
    createEReference(eventEClass, EVENT__POST);

    parserEClass = createEClass(PARSER);
    createEReference(parserEClass, PARSER__IVAR);

    textParserEClass = createEClass(TEXT_PARSER);
    createEReference(textParserEClass, TEXT_PARSER__FORMATTER);
    createEReference(textParserEClass, TEXT_PARSER__VALUE);

    textFormatterEClass = createEClass(TEXT_FORMATTER);

    wordFormatterEClass = createEClass(WORD_FORMATTER);
    createEAttribute(wordFormatterEClass, WORD_FORMATTER__WHITE);

    splitFormatterEClass = createEClass(SPLIT_FORMATTER);
    createEAttribute(splitFormatterEClass, SPLIT_FORMATTER__SPLITER);

    userDefinedFormatterEClass = createEClass(USER_DEFINED_FORMATTER);
    createEReference(userDefinedFormatterEClass, USER_DEFINED_FORMATTER__EXPR);

    abstractTextValueEClass = createEClass(ABSTRACT_TEXT_VALUE);

    varValueEClass = createEClass(VAR_VALUE);
    createEReference(varValueEClass, VAR_VALUE__VARIABLE);

    constantTextEClass = createEClass(CONSTANT_TEXT);
    createEAttribute(constantTextEClass, CONSTANT_TEXT__CONTENT);

    ignoreValueEClass = createEClass(IGNORE_VALUE);
    createEAttribute(ignoreValueEClass, IGNORE_VALUE__IGNORE);

    plainParserEClass = createEClass(PLAIN_PARSER);
    createEReference(plainParserEClass, PLAIN_PARSER__LOGIC);

    directObjectParserEClass = createEClass(DIRECT_OBJECT_PARSER);
    createEReference(directObjectParserEClass, DIRECT_OBJECT_PARSER__TYPE);

    decScopeEClass = createEClass(DEC_SCOPE);
    createEReference(decScopeEClass, DEC_SCOPE__VAR);
    createEReference(decScopeEClass, DEC_SCOPE__SCOPE);

    scopeEClass = createEClass(SCOPE);
    createEReference(scopeEClass, SCOPE__EXPR);
    createEAttribute(scopeEClass, SCOPE__ENFORCE);
    createEReference(scopeEClass, SCOPE__REALTYPE);

    apiEClass = createEClass(API);
    createEAttribute(apiEClass, API__NAME);
    createEReference(apiEClass, API__HELPER);
    createEReference(apiEClass, API__MAPPING);
    createEReference(apiEClass, API__INVOCATION);

    mappingEClass = createEClass(MAPPING);
    createEReference(mappingEClass, MAPPING__MTYPE);
    createEReference(mappingEClass, MAPPING__STYPE);
    createEAttribute(mappingEClass, MAPPING__UNIQUE);
    createEReference(mappingEClass, MAPPING__IDENTIFY);
    createEReference(mappingEClass, MAPPING__SUB_TYPE);
    createEReference(mappingEClass, MAPPING__NEW_IMAGE);

    subTypeEClass = createEClass(SUB_TYPE);
    createEReference(subTypeEClass, SUB_TYPE__TYPE);
    createEReference(subTypeEClass, SUB_TYPE__PRE);

    invocationEClass = createEClass(INVOCATION);
    createEAttribute(invocationEClass, INVOCATION__NAME);
    createEReference(invocationEClass, INVOCATION__VARIABLE);
    createEReference(invocationEClass, INVOCATION__OPERATION);
    createEReference(invocationEClass, INVOCATION__PRE);
    createEReference(invocationEClass, INVOCATION__RET_TYPE);
    createEReference(invocationEClass, INVOCATION__INVOKE);
    createEReference(invocationEClass, INVOCATION__POSTPARA);
    createEReference(invocationEClass, INVOCATION__POST);

    operationPointCutEClass = createEClass(OPERATION_POINT_CUT);
    createEAttribute(operationPointCutEClass, OPERATION_POINT_CUT__OP_TYPE);
    createEReference(operationPointCutEClass, OPERATION_POINT_CUT__ELEM_TYPE);
    createEAttribute(operationPointCutEClass, OPERATION_POINT_CUT__FEATURE);
    createEReference(operationPointCutEClass, OPERATION_POINT_CUT__PRE);

    // Create enums
    operationTypeEEnum = createEEnum(OPERATION_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    textParserEClass.getESuperTypes().add(this.getParser());
    wordFormatterEClass.getESuperTypes().add(this.getTextFormatter());
    splitFormatterEClass.getESuperTypes().add(this.getTextFormatter());
    userDefinedFormatterEClass.getESuperTypes().add(this.getTextFormatter());
    varValueEClass.getESuperTypes().add(this.getAbstractTextValue());
    constantTextEClass.getESuperTypes().add(this.getAbstractTextValue());
    ignoreValueEClass.getESuperTypes().add(this.getAbstractTextValue());
    plainParserEClass.getESuperTypes().add(this.getParser());
    directObjectParserEClass.getESuperTypes().add(this.getParser());

    // Initialize classes and features; add operations and parameters
    initEClass(eventDescEClass, EventDesc.class, "EventDesc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventDesc_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventDesc_Imports(), this.getImport(), null, "imports", null, 0, -1, EventDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventDesc_Sequence(), this.getEventSeq(), null, "sequence", null, 0, -1, EventDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventDesc_Api(), this.getAPI(), null, "api", null, 0, -1, EventDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(helperEClass, Helper.class, "Helper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHelper_Name(), ecorePackage.getEString(), "name", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelper_Params(), theTypesPackage.getJvmFormalParameter(), null, "params", null, 0, -1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelper_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHelper_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventSeqEClass, EventSeq.class, "EventSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventSeq_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventSeq_Helper(), this.getHelper(), null, "helper", null, 0, -1, EventSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventSeq_Event(), this.getEvent(), null, "event", null, 0, -1, EventSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_DecScope(), this.getDecScope(), null, "decScope", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Parser(), this.getParser(), null, "parser", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Pre(), theXbasePackage.getXExpression(), null, "pre", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvent_Post(), theXbasePackage.getXExpression(), null, "post", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parserEClass, Parser.class, "Parser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParser_Ivar(), theXbasePackage.getXExpression(), null, "ivar", null, 0, -1, Parser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textParserEClass, TextParser.class, "TextParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextParser_Formatter(), this.getTextFormatter(), null, "formatter", null, 0, 1, TextParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextParser_Value(), this.getAbstractTextValue(), null, "value", null, 0, -1, TextParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textFormatterEClass, TextFormatter.class, "TextFormatter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wordFormatterEClass, WordFormatter.class, "WordFormatter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWordFormatter_White(), ecorePackage.getEBoolean(), "white", null, 0, 1, WordFormatter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(splitFormatterEClass, SplitFormatter.class, "SplitFormatter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSplitFormatter_Spliter(), ecorePackage.getEString(), "spliter", null, 0, 1, SplitFormatter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userDefinedFormatterEClass, UserDefinedFormatter.class, "UserDefinedFormatter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUserDefinedFormatter_Expr(), theXbasePackage.getXExpression(), null, "expr", null, 0, 1, UserDefinedFormatter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractTextValueEClass, AbstractTextValue.class, "AbstractTextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(varValueEClass, VarValue.class, "VarValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarValue_Variable(), theXbasePackage.getXVariableDeclaration(), null, "variable", null, 0, 1, VarValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantTextEClass, ConstantText.class, "ConstantText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantText_Content(), ecorePackage.getEString(), "content", null, 0, 1, ConstantText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ignoreValueEClass, IgnoreValue.class, "IgnoreValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIgnoreValue_Ignore(), ecorePackage.getEBoolean(), "ignore", null, 0, 1, IgnoreValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plainParserEClass, PlainParser.class, "PlainParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlainParser_Logic(), theXbasePackage.getXExpression(), null, "logic", null, 0, 1, PlainParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directObjectParserEClass, DirectObjectParser.class, "DirectObjectParser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDirectObjectParser_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, DirectObjectParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decScopeEClass, DecScope.class, "DecScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDecScope_Var(), theXbasePackage.getXVariableDeclaration(), null, "var", null, 0, 1, DecScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecScope_Scope(), this.getScope(), null, "scope", null, 0, 1, DecScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScope_Expr(), theXbasePackage.getXExpression(), null, "expr", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScope_Enforce(), ecorePackage.getEBoolean(), "enforce", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScope_Realtype(), theTypesPackage.getJvmTypeReference(), null, "realtype", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(apiEClass, ie.tcd.everm.evedsl.eveDesc.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAPI_Name(), ecorePackage.getEString(), "name", null, 0, 1, ie.tcd.everm.evedsl.eveDesc.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAPI_Helper(), this.getHelper(), null, "helper", null, 0, -1, ie.tcd.everm.evedsl.eveDesc.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAPI_Mapping(), this.getMapping(), null, "mapping", null, 0, -1, ie.tcd.everm.evedsl.eveDesc.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAPI_Invocation(), this.getInvocation(), null, "invocation", null, 0, -1, ie.tcd.everm.evedsl.eveDesc.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapping_MType(), theTypesPackage.getJvmTypeReference(), null, "mType", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapping_SType(), theTypesPackage.getJvmTypeReference(), null, "sType", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMapping_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapping_Identify(), theXbasePackage.getXExpression(), null, "identify", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapping_SubType(), this.getSubType(), null, "subType", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapping_NewImage(), theXbasePackage.getXExpression(), null, "newImage", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subTypeEClass, SubType.class, "SubType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubType_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubType_Pre(), theXbasePackage.getXExpression(), null, "pre", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invocationEClass, Invocation.class, "Invocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInvocation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvocation_Variable(), theXbasePackage.getXVariableDeclaration(), null, "variable", null, 0, -1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvocation_Operation(), this.getOperationPointCut(), null, "operation", null, 0, -1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvocation_Pre(), theXbasePackage.getXExpression(), null, "pre", null, 0, 1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvocation_RetType(), theTypesPackage.getJvmTypeReference(), null, "retType", null, 0, 1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvocation_Invoke(), theXbasePackage.getXExpression(), null, "invoke", null, 0, 1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvocation_Postpara(), theTypesPackage.getJvmFormalParameter(), null, "postpara", null, 0, 1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvocation_Post(), theXbasePackage.getXExpression(), null, "post", null, 0, 1, Invocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationPointCutEClass, OperationPointCut.class, "OperationPointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperationPointCut_OpType(), this.getOperationType(), "opType", null, 0, 1, OperationPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationPointCut_ElemType(), theTypesPackage.getJvmTypeReference(), null, "elemType", null, 0, 1, OperationPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperationPointCut_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, OperationPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationPointCut_Pre(), theXbasePackage.getXExpression(), null, "pre", null, 0, 1, OperationPointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
    addEEnumLiteral(operationTypeEEnum, OperationType.GET);
    addEEnumLiteral(operationTypeEEnum, OperationType.SET);
    addEEnumLiteral(operationTypeEEnum, OperationType.ADD);
    addEEnumLiteral(operationTypeEEnum, OperationType.REMOVE);
    addEEnumLiteral(operationTypeEEnum, OperationType.CREATE);
    addEEnumLiteral(operationTypeEEnum, OperationType.DESTROY);

    // Create resource
    createResource(eNS_URI);
  }

} //EveDescPackageImpl
