package ie.tcd.everm.evedsl.jvmmodel;

import com.google.inject.Inject;
import ie.tcd.everm.evedsl.eveDesc.Invocation;
import ie.tcd.everm.evedsl.eveDesc.OperationPointCut;
import ie.tcd.everm.evedsl.eveDesc.OperationType;
import ie.tcd.everm.evedsl.jvmmodel.EveDescJvmModelInferrer;
import ie.tcd.everm.evedsl.jvmmodel.EveModelExtension;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmVisibilityExtension;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class APIEngineInferrer {
  private String GET_SCOPE = "getScope_";
  
  private String CAL_VAR = "calcuVariables";
  
  private String INNER_EXECUTE = "_execute";
  
  private String PARSER_PARSE = "parse";
  
  private String EVENT_INIT = "init";
  
  private String POST_CONDITION = "postcondition";
  
  private String INFORCE_PRE = "enforcePre";
  
  private String EXT_EXECUTE = "execute";
  
  private String CHK_PRE = "checkPre";
  
  public static String OPMETHOD_PREFIX = "_operation_";
  
  public static String ROOT_FIELD = "apiRoot";
  
  /**
   * conveninence API to build and initialize JvmTypes and their members.
   */
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private EveModelExtension _eveModelExtension;
  
  @Inject
  private JvmVisibilityExtension _jvmVisibilityExtension;
  
  @Inject
  private XbaseCompiler _xbaseCompiler;
  
  public JvmGenericType inferAPIEngine(final Invocation elem, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase, final JvmGenericType mainCls) {
    JvmGenericType _xblockexpression = null;
    {
      EObject _eContainer = elem.eContainer();
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer);
      QualifiedName _skipLast = _fullyQualifiedName.skipLast(1);
      String _name = elem.getName();
      QualifiedName _append = _skipLast.append(_name);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              it.setAbstract(false);
              String _documentation = APIEngineInferrer.this._jvmTypesBuilder.getDocumentation(elem);
              APIEngineInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
              EList<XVariableDeclaration> _variable = elem.getVariable();
              for (final XVariableDeclaration v : _variable) {
                EList<JvmMember> _members = it.getMembers();
                String _name = v.getName();
                JvmTypeReference _type = v.getType();
                final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
                    public void apply(final JvmField it) {
                      JvmTypeReference _type = v.getType();
                      boolean _isInstanceOf = APIEngineInferrer.this._typeReferences.isInstanceOf(_type, java.lang.Object.class);
                      if (_isInstanceOf) {
                        final Function1<ImportManager,String> _function = new Function1<ImportManager,String>() {
                            public String apply(final ImportManager im) {
                              return "null";
                            }
                          };
                        APIEngineInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
                      }
                    }
                  };
                JvmField _field = APIEngineInferrer.this._jvmTypesBuilder.toField(v, _name, _type, _function);
                CollectionExtensions.<JvmField>operator_add(_members, _field);
              }
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotation = APIEngineInferrer.this._jvmTypesBuilder.toAnnotation(elem, org.aspectj.lang.annotation.Aspect.class);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            }
          }
        };
      JvmGenericType _class = this._jvmTypesBuilder.toClass(elem, _append, _function);
      final JvmGenericType cls = _class;
      acceptor.accept(cls);
      EObject _eNull = this.eNull();
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(mainCls);
      JvmField _field = this._jvmTypesBuilder.toField(_eNull, APIEngineInferrer.ROOT_FIELD, _createTypeRef);
      final JvmField rootField = _field;
      this._jvmVisibilityExtension.makePublic(rootField);
      EList<JvmMember> _members = cls.getMembers();
      CollectionExtensions.<JvmField>operator_add(_members, rootField);
      EList<OperationPointCut> _operation = elem.getOperation();
      for (final OperationPointCut op : _operation) {
        {
          JvmTypeReference _xifexpression = null;
          JvmTypeReference _elemType = op.getElemType();
          boolean _operator_equals = ObjectExtensions.operator_equals(_elemType, null);
          if (_operator_equals) {
            JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(op, org.eclipse.emf.ecore.EObject.class);
            _xifexpression = _newTypeRef;
          } else {
            JvmTypeReference _elemType_1 = op.getElemType();
            _xifexpression = _elemType_1;
          }
          final JvmTypeReference elemType = _xifexpression;
          JvmTypeReference _xifexpression_1 = null;
          boolean _operator_or = false;
          String _feature = op.getFeature();
          boolean _operator_equals_1 = ObjectExtensions.operator_equals(_feature, null);
          if (_operator_equals_1) {
            _operator_or = true;
          } else {
            JvmTypeReference _elemType_2 = op.getElemType();
            boolean _operator_equals_2 = ObjectExtensions.operator_equals(_elemType_2, null);
            _operator_or = BooleanExtensions.operator_or(_operator_equals_1, _operator_equals_2);
          }
          if (_operator_or) {
            JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(op, java.lang.Object.class);
            _xifexpression_1 = _newTypeRef_1;
          } else {
            JvmTypeReference _newTypeRef_2 = this._jvmTypesBuilder.newTypeRef(op, java.lang.Object.class);
            _xifexpression_1 = _newTypeRef_2;
          }
          final JvmTypeReference valType = _xifexpression_1;
          String _methodName = this.getMethodName(op);
          JvmTypeReference _newTypeRef_3 = this._jvmTypesBuilder.newTypeRef(op, boolean.class);
          final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  EObject _eNull = APIEngineInferrer.this.eNull();
                  JvmFormalParameter _parameter = APIEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull, "element", elemType);
                  CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                  EObject _eNull_1 = APIEngineInferrer.this.eNull();
                  JvmTypeReference _newTypeRef = APIEngineInferrer.this._jvmTypesBuilder.newTypeRef(op, org.eclipse.emf.ecore.EStructuralFeature.class);
                  JvmFormalParameter _parameter_1 = APIEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull_1, "feature", _newTypeRef);
                  CollectionExtensions.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                  EList<JvmFormalParameter> _parameters_2 = it.getParameters();
                  EObject _eNull_2 = APIEngineInferrer.this.eNull();
                  JvmFormalParameter _parameter_2 = APIEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull_2, "value", valType);
                  CollectionExtensions.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
                  final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                      public CharSequence apply(final ImportManager im) {
                        CharSequence _xblockexpression = null;
                        {
                          StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable(im);
                          final StringBuilderBasedAppendable appendable = _stringBuilderBasedAppendable;
                          appendable.declareVariable(cls, "this");
                          XExpression _pre = op.getPre();
                          APIEngineInferrer.this._xbaseCompiler.toJavaStatement(_pre, appendable, true);
                          ArrayList<String> _arrayList = new ArrayList<String>();
                          final ArrayList<String> invokeStates = _arrayList;
                          boolean _operator_or = false;
                          JvmTypeReference _retType = elem.getRetType();
                          boolean _operator_equals = ObjectExtensions.operator_equals(_retType, null);
                          if (_operator_equals) {
                            _operator_or = true;
                          } else {
                            JvmFormalParameter _postpara = elem.getPostpara();
                            boolean _operator_equals_1 = ObjectExtensions.operator_equals(_postpara, null);
                            _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
                          }
                          if (_operator_or) {
                            {
                              StringConcatenation _builder = new StringConcatenation();
                              _builder.append("invoke();");
                              String _string = _builder.toString();
                              CollectionExtensions.<String>operator_add(invokeStates, _string);
                              StringConcatenation _builder_1 = new StringConcatenation();
                              _builder_1.append("postcondition();");
                              String _string_1 = _builder_1.toString();
                              CollectionExtensions.<String>operator_add(invokeStates, _string_1);
                            }
                          } else {
                            {
                              StringConcatenation _builder_2 = new StringConcatenation();
                              JvmTypeReference _retType_1 = elem.getRetType();
                              String _simpleName = _retType_1.getSimpleName();
                              _builder_2.append(_simpleName, "");
                              _builder_2.append(" result = invoke();");
                              String _string_2 = _builder_2.toString();
                              CollectionExtensions.<String>operator_add(invokeStates, _string_2);
                              JvmTypeReference _retType_2 = elem.getRetType();
                              JvmFormalParameter _postpara_1 = elem.getPostpara();
                              JvmTypeReference _parameterType = _postpara_1.getParameterType();
                              boolean _operator_equals_2 = ObjectExtensions.operator_equals(_retType_2, _parameterType);
                              if (_operator_equals_2) {
                                StringConcatenation _builder_3 = new StringConcatenation();
                                _builder_3.append("postcondition(result);");
                                String _string_3 = _builder_3.toString();
                                CollectionExtensions.<String>operator_add(invokeStates, _string_3);
                              } else {
                                JvmFormalParameter _postpara_2 = elem.getPostpara();
                                JvmTypeReference _parameterType_1 = _postpara_2.getParameterType();
                                boolean _isInstanceOf = APIEngineInferrer.this._typeReferences.isInstanceOf(_parameterType_1, java.util.List.class);
                                if (_isInstanceOf) {
                                  {
                                    JvmTypeReference _retType_3 = elem.getRetType();
                                    JvmTypeReference _argument = APIEngineInferrer.this._typeReferences.getArgument(_retType_3, 0);
                                    String _simpleName_1 = _argument.getSimpleName();
                                    final String tempType = _simpleName_1;
                                    JvmFormalParameter _postpara_3 = elem.getPostpara();
                                    JvmTypeReference _parameterType_2 = _postpara_3.getParameterType();
                                    JvmTypeReference _argument_1 = APIEngineInferrer.this._typeReferences.getArgument(_parameterType_2, 0);
                                    String _simpleName_2 = _argument_1.getSimpleName();
                                    final String postTempType = _simpleName_2;
                                    StringConcatenation _builder_4 = new StringConcatenation();
                                    _builder_4.append("List<");
                                    _builder_4.append(postTempType, "");
                                    _builder_4.append("> res = new java.util.ArrayList<");
                                    _builder_4.append(postTempType, "");
                                    _builder_4.append(">();");
                                    _builder_4.newLineIfNotEmpty();
                                    _builder_4.append("for(Object r : result){");
                                    _builder_4.newLine();
                                    _builder_4.append("\t");
                                    _builder_4.append("res.add(");
                                    _builder_4.append(APIEngineInferrer.ROOT_FIELD, "	");
                                    _builder_4.append(".create");
                                    _builder_4.append(postTempType, "	");
                                    _builder_4.append("((");
                                    _builder_4.append(tempType, "	");
                                    _builder_4.append(")r));");
                                    _builder_4.newLineIfNotEmpty();
                                    _builder_4.append("}");
                                    _builder_4.newLine();
                                    _builder_4.append("postcondition(res);");
                                    _builder_4.newLine();
                                    String _string_4 = _builder_4.toString();
                                    CollectionExtensions.<String>operator_add(invokeStates, _string_4);
                                  }
                                }
                              }
                            }
                          }
                          XExpression _pre_1 = op.getPre();
                          String _name = appendable.getName(_pre_1);
                          final String resultName = _name;
                          StringConcatenation _builder_5 = new StringConcatenation();
                          _builder_5.append("try{");
                          _builder_5.newLine();
                          _builder_5.append("\t");
                          _builder_5.append(appendable, "	");
                          _builder_5.newLineIfNotEmpty();
                          _builder_5.append("\t");
                          _builder_5.append("if(!");
                          String _xifexpression = null;
                          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(resultName);
                          if (_isNullOrEmpty) {
                            _xifexpression = "true";
                          } else {
                            _xifexpression = resultName;
                          }
                          _builder_5.append(_xifexpression, "	");
                          _builder_5.append(")");
                          _builder_5.newLineIfNotEmpty();
                          _builder_5.append("\t\t");
                          _builder_5.append("return false;");
                          _builder_5.newLine();
                          _builder_5.append("\t");
                          _builder_5.append("if(!precondition())");
                          _builder_5.newLine();
                          _builder_5.append("\t\t");
                          _builder_5.append("return false;");
                          _builder_5.newLine();
                          {
                            for(final String invokeState : invokeStates) {
                              _builder_5.append("\t");
                              _builder_5.append(invokeState, "	");
                              _builder_5.newLineIfNotEmpty();
                            }
                          }
                          _builder_5.append("\t");
                          _builder_5.append("return true;");
                          _builder_5.newLine();
                          _builder_5.append("}");
                          _builder_5.newLine();
                          _builder_5.append("catch(Exception e){");
                          _builder_5.newLine();
                          _builder_5.append("\t");
                          _builder_5.append("e.printStackTrace();");
                          _builder_5.newLine();
                          _builder_5.append("\t");
                          _builder_5.append("return false;");
                          _builder_5.newLine();
                          _builder_5.append("}");
                          _builder_5.newLine();
                          _xblockexpression = (_builder_5);
                        }
                        return _xblockexpression;
                      }
                    };
                  APIEngineInferrer.this._jvmTypesBuilder.setBody(it, _function);
                }
              }
            };
          JvmOperation _method = this._jvmTypesBuilder.toMethod(op, _methodName, _newTypeRef_3, _function_1);
          final JvmOperation opMethod = _method;
          EList<JvmMember> _members_1 = cls.getMembers();
          CollectionExtensions.<JvmOperation>operator_add(_members_1, opMethod);
          EObject _eNull_1 = this.eNull();
          String _methodName_1 = this.getMethodName(op);
          String _operator_plus = StringExtensions.operator_plus("_listen_", _methodName_1);
          JvmTypeReference _newTypeRef_4 = this._jvmTypesBuilder.newTypeRef(op, Void.TYPE);
          final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                OperationType _opType = op.getOpType();
                final OperationType __valOfSwitchOver = _opType;
                boolean matched = false;
                if (!matched) {
                  if (ObjectExtensions.operator_equals(__valOfSwitchOver,OperationType.GET)) {
                    matched=true;
                    {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      EObject _eNull = APIEngineInferrer.this.eNull();
                      JvmFormalParameter _parameter = APIEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull, "elem", elemType);
                      CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                      EObject _eNull_1 = APIEngineInferrer.this.eNull();
                      JvmTypeReference _newTypeRef = APIEngineInferrer.this._jvmTypesBuilder.newTypeRef(op, org.eclipse.emf.ecore.EStructuralFeature.class);
                      JvmFormalParameter _parameter_1 = APIEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull_1, "feature", _newTypeRef);
                      CollectionExtensions.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("call(* *.eGet(EStructuralFeature,boolean)) && target(elem) &&  args(feature,*) && (!cflow(call(* ");
                      QualifiedName _fullyQualifiedName = APIEngineInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(elem);
                      QualifiedName _skipLast = _fullyQualifiedName.skipLast(2);
                      _builder.append(_skipLast, "");
                      _builder.append(".*.");
                      _builder.append(APIEngineInferrer.OPMETHOD_PREFIX, "");
                      _builder.append("*(*,*,*))))");
                      String _string = _builder.toString();
                      final String annoString = _string;
                      JvmAnnotationReference _annotation = APIEngineInferrer.this._jvmTypesBuilder.toAnnotation(op, "org.aspectj.lang.annotation.Before", annoString);
                      final JvmAnnotationReference anno = _annotation;
                      EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                      CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, anno);
                      final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                          public CharSequence apply(final ImportManager it) {
                            StringConcatenation _builder = new StringConcatenation();
                            _builder.append(APIEngineInferrer.ROOT_FIELD, "");
                            _builder.append(" = ");
                            String _simpleName = mainCls.getSimpleName();
                            _builder.append(_simpleName, "");
                            _builder.append(".");
                            _builder.append(EveDescJvmModelInferrer.RESOLVE_INS, "");
                            _builder.append("(elem.eResource());");
                            _builder.newLineIfNotEmpty();
                            String _methodName = APIEngineInferrer.this.getMethodName(op);
                            _builder.append(_methodName, "");
                            _builder.append("(elem, feature, null);");
                            _builder.newLineIfNotEmpty();
                            _builder.newLine();
                            return _builder;
                          }
                        };
                      APIEngineInferrer.this._jvmTypesBuilder.setBody(it, _function);
                    }
                  }
                }
                if (!matched) {
                  if (ObjectExtensions.operator_equals(__valOfSwitchOver,OperationType.SET)) {
                    matched=true;
                    {
                      EList<JvmFormalParameter> _parameters_2 = it.getParameters();
                      EObject _eNull_2 = APIEngineInferrer.this.eNull();
                      JvmFormalParameter _parameter_2 = APIEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull_2, "elem", elemType);
                      CollectionExtensions.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
                      EList<JvmFormalParameter> _parameters_3 = it.getParameters();
                      EObject _eNull_3 = APIEngineInferrer.this.eNull();
                      JvmTypeReference _newTypeRef_1 = APIEngineInferrer.this._jvmTypesBuilder.newTypeRef(op, org.eclipse.emf.ecore.EStructuralFeature.class);
                      JvmFormalParameter _parameter_3 = APIEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull_3, "feature", _newTypeRef_1);
                      CollectionExtensions.<JvmFormalParameter>operator_add(_parameters_3, _parameter_3);
                      EList<JvmFormalParameter> _parameters_4 = it.getParameters();
                      EObject _eNull_4 = APIEngineInferrer.this.eNull();
                      JvmTypeReference _newTypeRef_2 = APIEngineInferrer.this._jvmTypesBuilder.newTypeRef(op, java.lang.Object.class);
                      JvmFormalParameter _parameter_4 = APIEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull_4, "value", _newTypeRef_2);
                      CollectionExtensions.<JvmFormalParameter>operator_add(_parameters_4, _parameter_4);
                      StringConcatenation _builder_1 = new StringConcatenation();
                      _builder_1.append("execution(* *.eSet(EStructuralFeature,Object)) && target(elem) &&  args(feature,value) && (!cflow(call(* ");
                      QualifiedName _fullyQualifiedName_1 = APIEngineInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(elem);
                      QualifiedName _skipLast_1 = _fullyQualifiedName_1.skipLast(2);
                      _builder_1.append(_skipLast_1, "");
                      _builder_1.append(".*.");
                      _builder_1.append(APIEngineInferrer.OPMETHOD_PREFIX, "");
                      _builder_1.append("*(*,*,*))))");
                      String _string_1 = _builder_1.toString();
                      final String annoString_1 = _string_1;
                      EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
                      JvmAnnotationReference _annotation_1 = APIEngineInferrer.this._jvmTypesBuilder.toAnnotation(op, "org.aspectj.lang.annotation.Before", annoString_1);
                      CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
                      final Function1<ImportManager,CharSequence> _function_1 = new Function1<ImportManager,CharSequence>() {
                          public CharSequence apply(final ImportManager it) {
                            StringConcatenation _builder = new StringConcatenation();
                            _builder.append("if(elem.eResource()==null)");
                            _builder.newLine();
                            _builder.append("\t");
                            _builder.append("return;");
                            _builder.newLine();
                            _builder.append(APIEngineInferrer.ROOT_FIELD, "");
                            _builder.append(" = ");
                            String _simpleName = mainCls.getSimpleName();
                            _builder.append(_simpleName, "");
                            _builder.append(".");
                            _builder.append(EveDescJvmModelInferrer.RESOLVE_INS, "");
                            _builder.append("(elem.eResource());");
                            _builder.newLineIfNotEmpty();
                            String _methodName = APIEngineInferrer.this.getMethodName(op);
                            _builder.append(_methodName, "");
                            _builder.append("(elem, feature, value);\t\t\t\t\t\t");
                            _builder.newLineIfNotEmpty();
                            return _builder;
                          }
                        };
                      APIEngineInferrer.this._jvmTypesBuilder.setBody(it, _function_1);
                    }
                  }
                }
              }
            };
          JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(_eNull_1, _operator_plus, _newTypeRef_4, _function_2);
          final JvmOperation opListenMethod = _method_1;
          EList<JvmMember> _members_2 = cls.getMembers();
          CollectionExtensions.<JvmOperation>operator_add(_members_2, opListenMethod);
        }
      }
      EList<JvmMember> _members_3 = cls.getMembers();
      EObject _eNull_2 = this.eNull();
      JvmTypeReference _newTypeRef_5 = this._jvmTypesBuilder.newTypeRef(elem, boolean.class);
      final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            XExpression _pre = elem.getPre();
            APIEngineInferrer.this._jvmTypesBuilder.setBody(it, _pre);
          }
        };
      JvmOperation _method_2 = this._jvmTypesBuilder.toMethod(_eNull_2, "precondition", _newTypeRef_5, _function_3);
      CollectionExtensions.<JvmOperation>operator_add(_members_3, _method_2);
      EList<JvmMember> _members_4 = cls.getMembers();
      EObject _eNull_3 = this.eNull();
      JvmTypeReference _newTypeRef_6 = this._jvmTypesBuilder.newTypeRef(elem, Void.TYPE);
      final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              JvmFormalParameter _postpara = elem.getPostpara();
              boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_postpara, null);
              if (_operator_notEquals) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmFormalParameter _postpara_1 = elem.getPostpara();
                JvmFormalParameter _postpara_2 = elem.getPostpara();
                String _name = _postpara_2.getName();
                JvmFormalParameter _postpara_3 = elem.getPostpara();
                JvmTypeReference _parameterType = _postpara_3.getParameterType();
                JvmFormalParameter _parameter = APIEngineInferrer.this._jvmTypesBuilder.toParameter(_postpara_1, _name, _parameterType);
                CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              }
              XExpression _post = elem.getPost();
              APIEngineInferrer.this._jvmTypesBuilder.setBody(it, _post);
            }
          }
        };
      JvmOperation _method_3 = this._jvmTypesBuilder.toMethod(_eNull_3, "postcondition", _newTypeRef_6, _function_4);
      CollectionExtensions.<JvmOperation>operator_add(_members_4, _method_3);
      JvmTypeReference _xifexpression_2 = null;
      JvmTypeReference _retType = elem.getRetType();
      boolean _operator_equals_3 = ObjectExtensions.operator_equals(_retType, null);
      if (_operator_equals_3) {
        JvmTypeReference _newTypeRef_7 = this._jvmTypesBuilder.newTypeRef(elem, Void.TYPE);
        _xifexpression_2 = _newTypeRef_7;
      } else {
        JvmTypeReference _retType_1 = elem.getRetType();
        _xifexpression_2 = _retType_1;
      }
      final JvmTypeReference invkRetType = _xifexpression_2;
      EList<JvmMember> _members_5 = cls.getMembers();
      EObject _eNull_4 = this.eNull();
      final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EList<JvmTypeReference> _exceptions = it.getExceptions();
              JvmTypeReference _newTypeRef = APIEngineInferrer.this._jvmTypesBuilder.newTypeRef(elem, java.lang.Exception.class);
              CollectionExtensions.<JvmTypeReference>operator_add(_exceptions, _newTypeRef);
              XExpression _invoke = elem.getInvoke();
              APIEngineInferrer.this._jvmTypesBuilder.setBody(it, _invoke);
            }
          }
        };
      JvmOperation _method_4 = this._jvmTypesBuilder.toMethod(_eNull_4, "invoke", invkRetType, _function_5);
      CollectionExtensions.<JvmOperation>operator_add(_members_5, _method_4);
      _xblockexpression = (cls);
    }
    return _xblockexpression;
  }
  
  public String getMethodName(final OperationPointCut op) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(APIEngineInferrer.OPMETHOD_PREFIX, "");
    OperationType _opType = op.getOpType();
    String _name = _opType.name();
    _builder.append(_name, "");
    _builder.append("_");
    String _xifexpression = null;
    JvmTypeReference _elemType = op.getElemType();
    boolean _operator_equals = ObjectExtensions.operator_equals(_elemType, null);
    if (_operator_equals) {
      _xifexpression = "Any";
    } else {
      JvmTypeReference _elemType_1 = op.getElemType();
      String _simpleName = _elemType_1.getSimpleName();
      _xifexpression = _simpleName;
    }
    _builder.append(_xifexpression, "");
    _builder.append("_");
    String _xifexpression_1 = null;
    String _feature = op.getFeature();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_feature);
    if (_isNullOrEmpty) {
      _xifexpression_1 = "Any";
    } else {
      String _feature_1 = op.getFeature();
      _xifexpression_1 = _feature_1;
    }
    _builder.append(_xifexpression_1, "");
    String _string = _builder.toString();
    return _string;
  }
  
  public EObject eNull() {
    return null;
  }
}
