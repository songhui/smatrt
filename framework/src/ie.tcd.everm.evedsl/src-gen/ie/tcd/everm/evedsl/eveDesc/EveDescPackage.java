/**
 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescFactory
 * @model kind="package"
 * @generated
 */
public interface EveDescPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eveDesc";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tcd.ie/everm/evedsl/EveDesc";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eveDesc";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EveDescPackage eINSTANCE = ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl.init();

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.EventDescImpl <em>Event Desc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EventDescImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getEventDesc()
   * @generated
   */
  int EVENT_DESC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DESC__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DESC__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DESC__SEQUENCE = 2;

  /**
   * The feature id for the '<em><b>Api</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DESC__API = 3;

  /**
   * The number of structural features of the '<em>Event Desc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DESC_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.ImportImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.HelperImpl <em>Helper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.HelperImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getHelper()
   * @generated
   */
  int HELPER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__TYPE = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER__BODY = 3;

  /**
   * The number of structural features of the '<em>Helper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.EventSeqImpl <em>Event Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EventSeqImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getEventSeq()
   * @generated
   */
  int EVENT_SEQ = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEQ__NAME = 0;

  /**
   * The feature id for the '<em><b>Helper</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEQ__HELPER = 1;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEQ__EVENT = 2;

  /**
   * The number of structural features of the '<em>Event Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SEQ_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EventImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Dec Scope</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__DEC_SCOPE = 1;

  /**
   * The feature id for the '<em><b>Parser</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__PARSER = 2;

  /**
   * The feature id for the '<em><b>Pre</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__PRE = 3;

  /**
   * The feature id for the '<em><b>Post</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__POST = 4;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.ParserImpl <em>Parser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.ParserImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getParser()
   * @generated
   */
  int PARSER = 5;

  /**
   * The feature id for the '<em><b>Ivar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARSER__IVAR = 0;

  /**
   * The number of structural features of the '<em>Parser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARSER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.TextParserImpl <em>Text Parser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.TextParserImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getTextParser()
   * @generated
   */
  int TEXT_PARSER = 6;

  /**
   * The feature id for the '<em><b>Ivar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PARSER__IVAR = PARSER__IVAR;

  /**
   * The feature id for the '<em><b>Formatter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PARSER__FORMATTER = PARSER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PARSER__VALUE = PARSER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Text Parser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_PARSER_FEATURE_COUNT = PARSER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.TextFormatterImpl <em>Text Formatter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.TextFormatterImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getTextFormatter()
   * @generated
   */
  int TEXT_FORMATTER = 7;

  /**
   * The number of structural features of the '<em>Text Formatter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FORMATTER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.WordFormatterImpl <em>Word Formatter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.WordFormatterImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getWordFormatter()
   * @generated
   */
  int WORD_FORMATTER = 8;

  /**
   * The feature id for the '<em><b>White</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_FORMATTER__WHITE = TEXT_FORMATTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Word Formatter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_FORMATTER_FEATURE_COUNT = TEXT_FORMATTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.SplitFormatterImpl <em>Split Formatter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.SplitFormatterImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getSplitFormatter()
   * @generated
   */
  int SPLIT_FORMATTER = 9;

  /**
   * The feature id for the '<em><b>Spliter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_FORMATTER__SPLITER = TEXT_FORMATTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Split Formatter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_FORMATTER_FEATURE_COUNT = TEXT_FORMATTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.UserDefinedFormatterImpl <em>User Defined Formatter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.UserDefinedFormatterImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getUserDefinedFormatter()
   * @generated
   */
  int USER_DEFINED_FORMATTER = 10;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_FORMATTER__EXPR = TEXT_FORMATTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User Defined Formatter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_FORMATTER_FEATURE_COUNT = TEXT_FORMATTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.AbstractTextValueImpl <em>Abstract Text Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.AbstractTextValueImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getAbstractTextValue()
   * @generated
   */
  int ABSTRACT_TEXT_VALUE = 11;

  /**
   * The number of structural features of the '<em>Abstract Text Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TEXT_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.VarValueImpl <em>Var Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.VarValueImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getVarValue()
   * @generated
   */
  int VAR_VALUE = 12;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_VALUE__VARIABLE = ABSTRACT_TEXT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_VALUE_FEATURE_COUNT = ABSTRACT_TEXT_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.ConstantTextImpl <em>Constant Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.ConstantTextImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getConstantText()
   * @generated
   */
  int CONSTANT_TEXT = 13;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_TEXT__CONTENT = ABSTRACT_TEXT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_TEXT_FEATURE_COUNT = ABSTRACT_TEXT_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.IgnoreValueImpl <em>Ignore Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.IgnoreValueImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getIgnoreValue()
   * @generated
   */
  int IGNORE_VALUE = 14;

  /**
   * The feature id for the '<em><b>Ignore</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGNORE_VALUE__IGNORE = ABSTRACT_TEXT_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ignore Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IGNORE_VALUE_FEATURE_COUNT = ABSTRACT_TEXT_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.PlainParserImpl <em>Plain Parser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.PlainParserImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getPlainParser()
   * @generated
   */
  int PLAIN_PARSER = 15;

  /**
   * The feature id for the '<em><b>Ivar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAIN_PARSER__IVAR = PARSER__IVAR;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAIN_PARSER__LOGIC = PARSER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Plain Parser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAIN_PARSER_FEATURE_COUNT = PARSER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.DirectObjectParserImpl <em>Direct Object Parser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.DirectObjectParserImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getDirectObjectParser()
   * @generated
   */
  int DIRECT_OBJECT_PARSER = 16;

  /**
   * The feature id for the '<em><b>Ivar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_OBJECT_PARSER__IVAR = PARSER__IVAR;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_OBJECT_PARSER__TYPE = PARSER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Direct Object Parser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_OBJECT_PARSER_FEATURE_COUNT = PARSER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.DecScopeImpl <em>Dec Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.DecScopeImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getDecScope()
   * @generated
   */
  int DEC_SCOPE = 17;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEC_SCOPE__VAR = 0;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEC_SCOPE__SCOPE = 1;

  /**
   * The number of structural features of the '<em>Dec Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEC_SCOPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.ScopeImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getScope()
   * @generated
   */
  int SCOPE = 18;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__EXPR = 0;

  /**
   * The feature id for the '<em><b>Enforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__ENFORCE = 1;

  /**
   * The feature id for the '<em><b>Realtype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__REALTYPE = 2;

  /**
   * The number of structural features of the '<em>Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.APIImpl <em>API</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.APIImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getAPI()
   * @generated
   */
  int API = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__NAME = 0;

  /**
   * The feature id for the '<em><b>Helper</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__HELPER = 1;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__MAPPING = 2;

  /**
   * The feature id for the '<em><b>Invocation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__INVOCATION = 3;

  /**
   * The number of structural features of the '<em>API</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.MappingImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 20;

  /**
   * The feature id for the '<em><b>MType</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__MTYPE = 0;

  /**
   * The feature id for the '<em><b>SType</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__STYPE = 1;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__UNIQUE = 2;

  /**
   * The feature id for the '<em><b>Identify</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__IDENTIFY = 3;

  /**
   * The feature id for the '<em><b>Sub Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__SUB_TYPE = 4;

  /**
   * The feature id for the '<em><b>New Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__NEW_IMAGE = 5;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.SubTypeImpl <em>Sub Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.SubTypeImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getSubType()
   * @generated
   */
  int SUB_TYPE = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Pre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_TYPE__PRE = 1;

  /**
   * The number of structural features of the '<em>Sub Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl <em>Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getInvocation()
   * @generated
   */
  int INVOCATION = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION__OPERATION = 2;

  /**
   * The feature id for the '<em><b>Pre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION__PRE = 3;

  /**
   * The feature id for the '<em><b>Ret Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION__RET_TYPE = 4;

  /**
   * The feature id for the '<em><b>Invoke</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION__INVOKE = 5;

  /**
   * The feature id for the '<em><b>Postpara</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION__POSTPARA = 6;

  /**
   * The feature id for the '<em><b>Post</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION__POST = 7;

  /**
   * The number of structural features of the '<em>Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOCATION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.OperationPointCutImpl <em>Operation Point Cut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.impl.OperationPointCutImpl
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getOperationPointCut()
   * @generated
   */
  int OPERATION_POINT_CUT = 23;

  /**
   * The feature id for the '<em><b>Op Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_POINT_CUT__OP_TYPE = 0;

  /**
   * The feature id for the '<em><b>Elem Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_POINT_CUT__ELEM_TYPE = 1;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_POINT_CUT__FEATURE = 2;

  /**
   * The feature id for the '<em><b>Pre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_POINT_CUT__PRE = 3;

  /**
   * The number of structural features of the '<em>Operation Point Cut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_POINT_CUT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ie.tcd.everm.evedsl.eveDesc.OperationType <em>Operation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ie.tcd.everm.evedsl.eveDesc.OperationType
   * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getOperationType()
   * @generated
   */
  int OPERATION_TYPE = 24;


  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.EventDesc <em>Event Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Desc</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.EventDesc
   * @generated
   */
  EClass getEventDesc();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.EventDesc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.EventDesc#getName()
   * @see #getEventDesc()
   * @generated
   */
  EAttribute getEventDesc_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.EventDesc#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.EventDesc#getImports()
   * @see #getEventDesc()
   * @generated
   */
  EReference getEventDesc_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.EventDesc#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequence</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.EventDesc#getSequence()
   * @see #getEventDesc()
   * @generated
   */
  EReference getEventDesc_Sequence();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.EventDesc#getApi <em>Api</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Api</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.EventDesc#getApi()
   * @see #getEventDesc()
   * @generated
   */
  EReference getEventDesc_Api();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.Helper <em>Helper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Helper</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Helper
   * @generated
   */
  EClass getHelper();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.Helper#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Helper#getName()
   * @see #getHelper()
   * @generated
   */
  EAttribute getHelper_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.Helper#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Helper#getParams()
   * @see #getHelper()
   * @generated
   */
  EReference getHelper_Params();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Helper#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Helper#getType()
   * @see #getHelper()
   * @generated
   */
  EReference getHelper_Type();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Helper#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Helper#getBody()
   * @see #getHelper()
   * @generated
   */
  EReference getHelper_Body();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.EventSeq <em>Event Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Seq</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.EventSeq
   * @generated
   */
  EClass getEventSeq();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.EventSeq#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.EventSeq#getName()
   * @see #getEventSeq()
   * @generated
   */
  EAttribute getEventSeq_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.EventSeq#getHelper <em>Helper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Helper</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.EventSeq#getHelper()
   * @see #getEventSeq()
   * @generated
   */
  EReference getEventSeq_Helper();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.EventSeq#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.EventSeq#getEvent()
   * @see #getEventSeq()
   * @generated
   */
  EReference getEventSeq_Event();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.Event#getDecScope <em>Dec Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dec Scope</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Event#getDecScope()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_DecScope();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Event#getParser <em>Parser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parser</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Event#getParser()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Parser();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.Event#getPre <em>Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pre</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Event#getPre()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Pre();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Event#getPost <em>Post</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Event#getPost()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Post();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.Parser <em>Parser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parser</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Parser
   * @generated
   */
  EClass getParser();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.Parser#getIvar <em>Ivar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ivar</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Parser#getIvar()
   * @see #getParser()
   * @generated
   */
  EReference getParser_Ivar();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.TextParser <em>Text Parser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Parser</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.TextParser
   * @generated
   */
  EClass getTextParser();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.TextParser#getFormatter <em>Formatter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formatter</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.TextParser#getFormatter()
   * @see #getTextParser()
   * @generated
   */
  EReference getTextParser_Formatter();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.TextParser#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.TextParser#getValue()
   * @see #getTextParser()
   * @generated
   */
  EReference getTextParser_Value();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.TextFormatter <em>Text Formatter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Formatter</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.TextFormatter
   * @generated
   */
  EClass getTextFormatter();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.WordFormatter <em>Word Formatter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word Formatter</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.WordFormatter
   * @generated
   */
  EClass getWordFormatter();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.WordFormatter#isWhite <em>White</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>White</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.WordFormatter#isWhite()
   * @see #getWordFormatter()
   * @generated
   */
  EAttribute getWordFormatter_White();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.SplitFormatter <em>Split Formatter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Split Formatter</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.SplitFormatter
   * @generated
   */
  EClass getSplitFormatter();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.SplitFormatter#getSpliter <em>Spliter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spliter</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.SplitFormatter#getSpliter()
   * @see #getSplitFormatter()
   * @generated
   */
  EAttribute getSplitFormatter_Spliter();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter <em>User Defined Formatter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Defined Formatter</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter
   * @generated
   */
  EClass getUserDefinedFormatter();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter#getExpr()
   * @see #getUserDefinedFormatter()
   * @generated
   */
  EReference getUserDefinedFormatter_Expr();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.AbstractTextValue <em>Abstract Text Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Text Value</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.AbstractTextValue
   * @generated
   */
  EClass getAbstractTextValue();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.VarValue <em>Var Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Value</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.VarValue
   * @generated
   */
  EClass getVarValue();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.VarValue#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.VarValue#getVariable()
   * @see #getVarValue()
   * @generated
   */
  EReference getVarValue_Variable();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.ConstantText <em>Constant Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Text</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.ConstantText
   * @generated
   */
  EClass getConstantText();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.ConstantText#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.ConstantText#getContent()
   * @see #getConstantText()
   * @generated
   */
  EAttribute getConstantText_Content();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.IgnoreValue <em>Ignore Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ignore Value</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.IgnoreValue
   * @generated
   */
  EClass getIgnoreValue();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.IgnoreValue#isIgnore <em>Ignore</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ignore</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.IgnoreValue#isIgnore()
   * @see #getIgnoreValue()
   * @generated
   */
  EAttribute getIgnoreValue_Ignore();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.PlainParser <em>Plain Parser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plain Parser</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.PlainParser
   * @generated
   */
  EClass getPlainParser();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.PlainParser#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Logic</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.PlainParser#getLogic()
   * @see #getPlainParser()
   * @generated
   */
  EReference getPlainParser_Logic();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.DirectObjectParser <em>Direct Object Parser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Object Parser</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.DirectObjectParser
   * @generated
   */
  EClass getDirectObjectParser();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.DirectObjectParser#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.DirectObjectParser#getType()
   * @see #getDirectObjectParser()
   * @generated
   */
  EReference getDirectObjectParser_Type();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.DecScope <em>Dec Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dec Scope</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.DecScope
   * @generated
   */
  EClass getDecScope();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.DecScope#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.DecScope#getVar()
   * @see #getDecScope()
   * @generated
   */
  EReference getDecScope_Var();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.DecScope#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scope</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.DecScope#getScope()
   * @see #getDecScope()
   * @generated
   */
  EReference getDecScope_Scope();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Scope
   * @generated
   */
  EClass getScope();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Scope#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Scope#getExpr()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Expr();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.Scope#isEnforce <em>Enforce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enforce</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Scope#isEnforce()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_Enforce();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Scope#getRealtype <em>Realtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Realtype</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Scope#getRealtype()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Realtype();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.API <em>API</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>API</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.API
   * @generated
   */
  EClass getAPI();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.API#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.API#getName()
   * @see #getAPI()
   * @generated
   */
  EAttribute getAPI_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.API#getHelper <em>Helper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Helper</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.API#getHelper()
   * @see #getAPI()
   * @generated
   */
  EReference getAPI_Helper();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.API#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapping</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.API#getMapping()
   * @see #getAPI()
   * @generated
   */
  EReference getAPI_Mapping();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.API#getInvocation <em>Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Invocation</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.API#getInvocation()
   * @see #getAPI()
   * @generated
   */
  EReference getAPI_Invocation();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getMType <em>MType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>MType</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Mapping#getMType()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_MType();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getSType <em>SType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SType</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Mapping#getSType()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_SType();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Mapping#isUnique()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Unique();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getIdentify <em>Identify</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identify</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Mapping#getIdentify()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Identify();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getSubType <em>Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Type</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Mapping#getSubType()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_SubType();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getNewImage <em>New Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Image</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Mapping#getNewImage()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_NewImage();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.SubType <em>Sub Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Type</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.SubType
   * @generated
   */
  EClass getSubType();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.SubType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.SubType#getType()
   * @see #getSubType()
   * @generated
   */
  EReference getSubType_Type();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.SubType#getPre <em>Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.SubType#getPre()
   * @see #getSubType()
   * @generated
   */
  EReference getSubType_Pre();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.Invocation <em>Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invocation</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Invocation
   * @generated
   */
  EClass getInvocation();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Invocation#getName()
   * @see #getInvocation()
   * @generated
   */
  EAttribute getInvocation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Invocation#getVariable()
   * @see #getInvocation()
   * @generated
   */
  EReference getInvocation_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operation</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Invocation#getOperation()
   * @see #getInvocation()
   * @generated
   */
  EReference getInvocation_Operation();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getPre <em>Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Invocation#getPre()
   * @see #getInvocation()
   * @generated
   */
  EReference getInvocation_Pre();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getRetType <em>Ret Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ret Type</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Invocation#getRetType()
   * @see #getInvocation()
   * @generated
   */
  EReference getInvocation_RetType();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getInvoke <em>Invoke</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invoke</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Invocation#getInvoke()
   * @see #getInvocation()
   * @generated
   */
  EReference getInvocation_Invoke();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getPostpara <em>Postpara</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Postpara</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Invocation#getPostpara()
   * @see #getInvocation()
   * @generated
   */
  EReference getInvocation_Postpara();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getPost <em>Post</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.Invocation#getPost()
   * @see #getInvocation()
   * @generated
   */
  EReference getInvocation_Post();

  /**
   * Returns the meta object for class '{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut <em>Operation Point Cut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Point Cut</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.OperationPointCut
   * @generated
   */
  EClass getOperationPointCut();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getOpType <em>Op Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op Type</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getOpType()
   * @see #getOperationPointCut()
   * @generated
   */
  EAttribute getOperationPointCut_OpType();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getElemType <em>Elem Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem Type</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getElemType()
   * @see #getOperationPointCut()
   * @generated
   */
  EReference getOperationPointCut_ElemType();

  /**
   * Returns the meta object for the attribute '{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getFeature()
   * @see #getOperationPointCut()
   * @generated
   */
  EAttribute getOperationPointCut_Feature();

  /**
   * Returns the meta object for the containment reference '{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getPre <em>Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getPre()
   * @see #getOperationPointCut()
   * @generated
   */
  EReference getOperationPointCut_Pre();

  /**
   * Returns the meta object for enum '{@link ie.tcd.everm.evedsl.eveDesc.OperationType <em>Operation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operation Type</em>'.
   * @see ie.tcd.everm.evedsl.eveDesc.OperationType
   * @generated
   */
  EEnum getOperationType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EveDescFactory getEveDescFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.EventDescImpl <em>Event Desc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EventDescImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getEventDesc()
     * @generated
     */
    EClass EVENT_DESC = eINSTANCE.getEventDesc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DESC__NAME = eINSTANCE.getEventDesc_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DESC__IMPORTS = eINSTANCE.getEventDesc_Imports();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DESC__SEQUENCE = eINSTANCE.getEventDesc_Sequence();

    /**
     * The meta object literal for the '<em><b>Api</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DESC__API = eINSTANCE.getEventDesc_Api();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.ImportImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.HelperImpl <em>Helper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.HelperImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getHelper()
     * @generated
     */
    EClass HELPER = eINSTANCE.getHelper();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER__NAME = eINSTANCE.getHelper_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER__PARAMS = eINSTANCE.getHelper_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER__TYPE = eINSTANCE.getHelper_Type();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER__BODY = eINSTANCE.getHelper_Body();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.EventSeqImpl <em>Event Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EventSeqImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getEventSeq()
     * @generated
     */
    EClass EVENT_SEQ = eINSTANCE.getEventSeq();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_SEQ__NAME = eINSTANCE.getEventSeq_Name();

    /**
     * The meta object literal for the '<em><b>Helper</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_SEQ__HELPER = eINSTANCE.getEventSeq_Helper();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_SEQ__EVENT = eINSTANCE.getEventSeq_Event();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EventImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Dec Scope</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__DEC_SCOPE = eINSTANCE.getEvent_DecScope();

    /**
     * The meta object literal for the '<em><b>Parser</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__PARSER = eINSTANCE.getEvent_Parser();

    /**
     * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__PRE = eINSTANCE.getEvent_Pre();

    /**
     * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__POST = eINSTANCE.getEvent_Post();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.ParserImpl <em>Parser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.ParserImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getParser()
     * @generated
     */
    EClass PARSER = eINSTANCE.getParser();

    /**
     * The meta object literal for the '<em><b>Ivar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARSER__IVAR = eINSTANCE.getParser_Ivar();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.TextParserImpl <em>Text Parser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.TextParserImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getTextParser()
     * @generated
     */
    EClass TEXT_PARSER = eINSTANCE.getTextParser();

    /**
     * The meta object literal for the '<em><b>Formatter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_PARSER__FORMATTER = eINSTANCE.getTextParser_Formatter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_PARSER__VALUE = eINSTANCE.getTextParser_Value();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.TextFormatterImpl <em>Text Formatter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.TextFormatterImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getTextFormatter()
     * @generated
     */
    EClass TEXT_FORMATTER = eINSTANCE.getTextFormatter();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.WordFormatterImpl <em>Word Formatter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.WordFormatterImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getWordFormatter()
     * @generated
     */
    EClass WORD_FORMATTER = eINSTANCE.getWordFormatter();

    /**
     * The meta object literal for the '<em><b>White</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORD_FORMATTER__WHITE = eINSTANCE.getWordFormatter_White();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.SplitFormatterImpl <em>Split Formatter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.SplitFormatterImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getSplitFormatter()
     * @generated
     */
    EClass SPLIT_FORMATTER = eINSTANCE.getSplitFormatter();

    /**
     * The meta object literal for the '<em><b>Spliter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLIT_FORMATTER__SPLITER = eINSTANCE.getSplitFormatter_Spliter();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.UserDefinedFormatterImpl <em>User Defined Formatter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.UserDefinedFormatterImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getUserDefinedFormatter()
     * @generated
     */
    EClass USER_DEFINED_FORMATTER = eINSTANCE.getUserDefinedFormatter();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_DEFINED_FORMATTER__EXPR = eINSTANCE.getUserDefinedFormatter_Expr();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.AbstractTextValueImpl <em>Abstract Text Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.AbstractTextValueImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getAbstractTextValue()
     * @generated
     */
    EClass ABSTRACT_TEXT_VALUE = eINSTANCE.getAbstractTextValue();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.VarValueImpl <em>Var Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.VarValueImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getVarValue()
     * @generated
     */
    EClass VAR_VALUE = eINSTANCE.getVarValue();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_VALUE__VARIABLE = eINSTANCE.getVarValue_Variable();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.ConstantTextImpl <em>Constant Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.ConstantTextImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getConstantText()
     * @generated
     */
    EClass CONSTANT_TEXT = eINSTANCE.getConstantText();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_TEXT__CONTENT = eINSTANCE.getConstantText_Content();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.IgnoreValueImpl <em>Ignore Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.IgnoreValueImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getIgnoreValue()
     * @generated
     */
    EClass IGNORE_VALUE = eINSTANCE.getIgnoreValue();

    /**
     * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IGNORE_VALUE__IGNORE = eINSTANCE.getIgnoreValue_Ignore();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.PlainParserImpl <em>Plain Parser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.PlainParserImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getPlainParser()
     * @generated
     */
    EClass PLAIN_PARSER = eINSTANCE.getPlainParser();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAIN_PARSER__LOGIC = eINSTANCE.getPlainParser_Logic();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.DirectObjectParserImpl <em>Direct Object Parser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.DirectObjectParserImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getDirectObjectParser()
     * @generated
     */
    EClass DIRECT_OBJECT_PARSER = eINSTANCE.getDirectObjectParser();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_OBJECT_PARSER__TYPE = eINSTANCE.getDirectObjectParser_Type();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.DecScopeImpl <em>Dec Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.DecScopeImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getDecScope()
     * @generated
     */
    EClass DEC_SCOPE = eINSTANCE.getDecScope();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEC_SCOPE__VAR = eINSTANCE.getDecScope_Var();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEC_SCOPE__SCOPE = eINSTANCE.getDecScope_Scope();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.ScopeImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getScope()
     * @generated
     */
    EClass SCOPE = eINSTANCE.getScope();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__EXPR = eINSTANCE.getScope_Expr();

    /**
     * The meta object literal for the '<em><b>Enforce</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__ENFORCE = eINSTANCE.getScope_Enforce();

    /**
     * The meta object literal for the '<em><b>Realtype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__REALTYPE = eINSTANCE.getScope_Realtype();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.APIImpl <em>API</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.APIImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getAPI()
     * @generated
     */
    EClass API = eINSTANCE.getAPI();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute API__NAME = eINSTANCE.getAPI_Name();

    /**
     * The meta object literal for the '<em><b>Helper</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference API__HELPER = eINSTANCE.getAPI_Helper();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference API__MAPPING = eINSTANCE.getAPI_Mapping();

    /**
     * The meta object literal for the '<em><b>Invocation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference API__INVOCATION = eINSTANCE.getAPI_Invocation();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.MappingImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>MType</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__MTYPE = eINSTANCE.getMapping_MType();

    /**
     * The meta object literal for the '<em><b>SType</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__STYPE = eINSTANCE.getMapping_SType();

    /**
     * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__UNIQUE = eINSTANCE.getMapping_Unique();

    /**
     * The meta object literal for the '<em><b>Identify</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__IDENTIFY = eINSTANCE.getMapping_Identify();

    /**
     * The meta object literal for the '<em><b>Sub Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__SUB_TYPE = eINSTANCE.getMapping_SubType();

    /**
     * The meta object literal for the '<em><b>New Image</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__NEW_IMAGE = eINSTANCE.getMapping_NewImage();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.SubTypeImpl <em>Sub Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.SubTypeImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getSubType()
     * @generated
     */
    EClass SUB_TYPE = eINSTANCE.getSubType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_TYPE__TYPE = eINSTANCE.getSubType_Type();

    /**
     * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_TYPE__PRE = eINSTANCE.getSubType_Pre();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl <em>Invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getInvocation()
     * @generated
     */
    EClass INVOCATION = eINSTANCE.getInvocation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVOCATION__NAME = eINSTANCE.getInvocation_Name();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION__VARIABLE = eINSTANCE.getInvocation_Variable();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION__OPERATION = eINSTANCE.getInvocation_Operation();

    /**
     * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION__PRE = eINSTANCE.getInvocation_Pre();

    /**
     * The meta object literal for the '<em><b>Ret Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION__RET_TYPE = eINSTANCE.getInvocation_RetType();

    /**
     * The meta object literal for the '<em><b>Invoke</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION__INVOKE = eINSTANCE.getInvocation_Invoke();

    /**
     * The meta object literal for the '<em><b>Postpara</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION__POSTPARA = eINSTANCE.getInvocation_Postpara();

    /**
     * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOCATION__POST = eINSTANCE.getInvocation_Post();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.impl.OperationPointCutImpl <em>Operation Point Cut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.impl.OperationPointCutImpl
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getOperationPointCut()
     * @generated
     */
    EClass OPERATION_POINT_CUT = eINSTANCE.getOperationPointCut();

    /**
     * The meta object literal for the '<em><b>Op Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_POINT_CUT__OP_TYPE = eINSTANCE.getOperationPointCut_OpType();

    /**
     * The meta object literal for the '<em><b>Elem Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_POINT_CUT__ELEM_TYPE = eINSTANCE.getOperationPointCut_ElemType();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_POINT_CUT__FEATURE = eINSTANCE.getOperationPointCut_Feature();

    /**
     * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_POINT_CUT__PRE = eINSTANCE.getOperationPointCut_Pre();

    /**
     * The meta object literal for the '{@link ie.tcd.everm.evedsl.eveDesc.OperationType <em>Operation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ie.tcd.everm.evedsl.eveDesc.OperationType
     * @see ie.tcd.everm.evedsl.eveDesc.impl.EveDescPackageImpl#getOperationType()
     * @generated
     */
    EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

  }

} //EveDescPackage
