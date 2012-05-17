package ie.tcd.everm.evedsl.jvmmodel;

import com.google.inject.Inject;
import ie.tcd.everm.evedsl.eveDesc.AbstractTextValue;
import ie.tcd.everm.evedsl.eveDesc.ConstantText;
import ie.tcd.everm.evedsl.eveDesc.DecScope;
import ie.tcd.everm.evedsl.eveDesc.Event;
import ie.tcd.everm.evedsl.eveDesc.Parser;
import ie.tcd.everm.evedsl.eveDesc.Scope;
import ie.tcd.everm.evedsl.eveDesc.SplitFormatter;
import ie.tcd.everm.evedsl.eveDesc.TextFormatter;
import ie.tcd.everm.evedsl.eveDesc.TextParser;
import ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter;
import ie.tcd.everm.evedsl.eveDesc.VarValue;
import ie.tcd.everm.evedsl.jvmmodel.EveModelExtension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmVisibilityExtension;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EventEngineInferrer {
  private String GET_SCOPE = "getScope_";
  
  private String CAL_VAR = "calcuVariables";
  
  private String INNER_EXECUTE = "_execute";
  
  private String PARSER_PARSE = "parse";
  
  private String EVENT_INIT = "init";
  
  private String POST_CONDITION = "postcondition";
  
  private String INFORCE_PRE = "enforcePre";
  
  private String EXT_EXECUTE = "execute";
  
  private String CHK_PRE = "checkPre";
  
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
  
  public JvmGenericType inferEventEngine(final Event elem, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    JvmGenericType _xblockexpression = null;
    {
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(elem, java.lang.String.class);
      JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(elem, org.eclipse.emf.ecore.EObject.class);
      JvmTypeReference _newTypeRef_2 = this._jvmTypesBuilder.newTypeRef(elem, java.util.Map.class, _newTypeRef, _newTypeRef_1);
      final JvmTypeReference mapSE = _newTypeRef_2;
      EObject _eContainer = elem.eContainer();
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer);
      QualifiedName _skipLast = _fullyQualifiedName.skipLast(1);
      String _name = elem.getName();
      QualifiedName _append = _skipLast.append(_name);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              it.setAbstract(false);
              String _documentation = EventEngineInferrer.this._jvmTypesBuilder.getDocumentation(elem);
              EventEngineInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmTypeReference _newTypeRef = EventEngineInferrer.this._jvmTypesBuilder.newTypeRef(elem, ie.tcd.everm.runtime.event.AbstractEvent.class);
              CollectionExtensions.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
              EList<JvmMember> _members = it.getMembers();
              EObject _eNull = EventEngineInferrer.this.eNull();
              final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
                  public void apply(final JvmField it) {
                    final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                        public CharSequence apply(final ImportManager i) {
                          StringConcatenation _builder = new StringConcatenation();
                          _builder.append(" ");
                          _builder.append("null");
                          return _builder;
                        }
                      };
                    EventEngineInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
                  }
                };
              JvmField _field = EventEngineInferrer.this._jvmTypesBuilder.toField(_eNull, "context", mapSE, _function);
              CollectionExtensions.<JvmField>operator_add(_members, _field);
            }
          }
        };
      JvmGenericType _class = this._jvmTypesBuilder.toClass(elem, _append, _function);
      final JvmGenericType cls = _class;
      acceptor.accept(cls);
      ArrayList<XVariableDeclaration> _arrayList = new ArrayList<XVariableDeclaration>();
      final ArrayList<XVariableDeclaration> allvars = _arrayList;
      EList<DecScope> _decScope = elem.getDecScope();
      final Function1<DecScope,XVariableDeclaration> _function_1 = new Function1<DecScope,XVariableDeclaration>() {
          public XVariableDeclaration apply(final DecScope e) {
            XVariableDeclaration _var = e.getVar();
            return _var;
          }
        };
      List<XVariableDeclaration> _map = ListExtensions.<DecScope, XVariableDeclaration>map(_decScope, _function_1);
      CollectionExtensions.<XVariableDeclaration>operator_add(allvars, _map);
      ArrayList<String> _arrayList_1 = new ArrayList<String>();
      final ArrayList<String> scope_init = _arrayList_1;
      for (final XVariableDeclaration v : allvars) {
        {
          JvmTypeReference _type = v.getType();
          String _simpleName = _type.getSimpleName();
          final String simpleName = _simpleName;
          EList<JvmMember> _members = cls.getMembers();
          JvmField _defaultField = this.defaultField(v);
          CollectionExtensions.<JvmField>operator_add(_members, _defaultField);
        }
      }
      Parser _parser = elem.getParser();
      final Parser intpElem = _parser;
      JvmGenericType _inferParser = this.inferParser(intpElem);
      final JvmGenericType intpCls = _inferParser;
      acceptor.accept(intpCls);
      EList<JvmMember> _members_1 = cls.getMembers();
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(intpCls);
      final Procedure1<JvmField> _function_2 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            final Function1<ImportManager,String> _function = new Function1<ImportManager,String>() {
                public String apply(final ImportManager i) {
                  String _simpleName = intpCls.getSimpleName();
                  String _operator_plus = StringExtensions.operator_plus("new ", _simpleName);
                  String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "()");
                  return _operator_plus_1;
                }
              };
            EventEngineInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
          }
        };
      JvmField _field = this._jvmTypesBuilder.toField(intpElem, "parser", _createTypeRef, _function_2);
      CollectionExtensions.<JvmField>operator_add(_members_1, _field);
      EList<JvmMember> _members_2 = cls.getMembers();
      EObject _eNull = this.eNull();
      JvmTypeReference _newTypeRef_3 = this._jvmTypesBuilder.newTypeRef(elem, Void.TYPE);
      final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              EObject _eNull = EventEngineInferrer.this.eNull();
              JvmFormalParameter _parameter = EventEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull, "context", mapSE);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager it) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("this.context = context;");
                    _builder.newLine();
                    {
                      for(final XVariableDeclaration v : allvars) {
                        _builder.append("this.");
                        String _name = v.getName();
                        _builder.append(_name, "");
                        _builder.append(" = null;");
                        _builder.newLineIfNotEmpty();
                        _builder.append("for(String key : context.keySet())");
                        _builder.newLine();
                        _builder.append("\t");
                        _builder.append("if(\"");
                        String _name_1 = v.getName();
                        _builder.append(_name_1, "	");
                        _builder.append("\".equals(key))");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t");
                        _builder.append("this.");
                        String _name_2 = v.getName();
                        _builder.append(_name_2, "		");
                        _builder.append(" = (");
                        JvmTypeReference _type = v.getType();
                        String _simpleName = _type.getSimpleName();
                        _builder.append(_simpleName, "		");
                        _builder.append(")context.get(\"");
                        String _name_3 = v.getName();
                        _builder.append(_name_3, "		");
                        _builder.append("\");");
                        _builder.newLineIfNotEmpty();
                        _builder.newLine();
                      }
                    }
                    return _builder;
                  }
                };
              EventEngineInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(_eNull, "init", _newTypeRef_3, _function_3);
      CollectionExtensions.<JvmOperation>operator_add(_members_2, _method);
      EList<DecScope> _decScope_1 = elem.getDecScope();
      final Function1<DecScope,Boolean> _function_4 = new Function1<DecScope,Boolean>() {
          public Boolean apply(final DecScope e) {
            Scope _scope = e.getScope();
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_scope, null);
            return Boolean.valueOf(_operator_notEquals);
          }
        };
      Iterable<DecScope> _filter = IterableExtensions.<DecScope>filter(_decScope_1, _function_4);
      for (final DecScope decScope : _filter) {
        {
          Scope _scope = decScope.getScope();
          final Scope scope = _scope;
          XVariableDeclaration _var = decScope.getVar();
          JvmTypeReference _type_1 = _var.getType();
          JvmTypeReference _newTypeRef_4 = this._jvmTypesBuilder.newTypeRef(scope, java.util.List.class, _type_1);
          final JvmTypeReference typeListVar = _newTypeRef_4;
          EList<JvmMember> _members_3 = cls.getMembers();
          XVariableDeclaration _var_1 = decScope.getVar();
          String _simpleName_1 = _var_1.getSimpleName();
          String _operator_plus = StringExtensions.operator_plus(this.GET_SCOPE, _simpleName_1);
          final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                XExpression _expr = scope.getExpr();
                EventEngineInferrer.this._jvmTypesBuilder.setBody(it, _expr);
              }
            };
          JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(scope, _operator_plus, typeListVar, _function_5);
          CollectionExtensions.<JvmOperation>operator_add(_members_3, _method_1);
        }
      }
      EObject _eNull_1 = this.eNull();
      JvmTypeReference _newTypeRef_5 = this._jvmTypesBuilder.newTypeRef(cls, boolean.class);
      final Procedure1<JvmOperation> _function_6 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                public CharSequence apply(final ImportManager im) {
                  CharSequence _xblockexpression = null;
                  {
                    ArrayList<String> _arrayList = new ArrayList<String>();
                    final ArrayList<String> preConStates = _arrayList;
                    EList<XExpression> _pre = elem.getPre();
                    for (final XExpression pre : _pre) {
                      {
                        StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable(im);
                        final StringBuilderBasedAppendable appendable = _stringBuilderBasedAppendable;
                        appendable.declareVariable(cls, "this");
                        CharSequence _switchResult = null;
                        boolean matched = false;
                        if (!matched) {
                          if (pre instanceof XAssignment) {
                            final XAssignment _xAssignment = (XAssignment)pre;
                            XExpression _assignable = _xAssignment.getAssignable();
                            if ((_assignable instanceof XFeatureCall)) {
                              matched=true;
                              CharSequence _xblockexpression_1 = null;
                              {
                                XExpression _assignable_1 = _xAssignment.getAssignable();
                                final XFeatureCall assignable = ((XFeatureCall) _assignable_1);
                                JvmIdentifiableElement _feature = assignable.getFeature();
                                final JvmField field = ((JvmField) _feature);
                                String _simpleName = field.getSimpleName();
                                final String fn = _simpleName;
                                JvmTypeReference _type = field.getType();
                                String _simpleName_1 = _type.getSimpleName();
                                final String ftn = _simpleName_1;
                                StringConcatenation _builder = new StringConcatenation();
                                _builder.append("if(");
                                _builder.append(fn, "");
                                _builder.append("==null){");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("List<");
                                _builder.append(ftn, "	");
                                _builder.append("> scp_");
                                String _simpleName_2 = field.getSimpleName();
                                _builder.append(_simpleName_2, "	");
                                _builder.append(" = ");
                                _builder.append(EventEngineInferrer.this.GET_SCOPE, "	");
                                _builder.append(fn, "	");
                                _builder.append("();");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("for(");
                                _builder.append(ftn, "	");
                                _builder.append(" it : scp_");
                                _builder.append(fn, "	");
                                _builder.append("){");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t");
                                XExpression _value = _xAssignment.getValue();
                                EventEngineInferrer.this._xbaseCompiler.toJavaStatement(_value, appendable, true);
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t");
                                _builder.append(appendable, "		");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t");
                                _builder.append("if(it.get");
                                JvmIdentifiableElement _feature_1 = _xAssignment.getFeature();
                                String _simpleName_3 = _feature_1.getSimpleName();
                                String _substring = _simpleName_3.substring(3);
                                _builder.append(_substring, "		");
                                _builder.append("().equals(");
                                XExpression _value_1 = _xAssignment.getValue();
                                String _name = appendable.getName(_value_1);
                                _builder.append(_name, "		");
                                _builder.append(")){");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t\t");
                                _builder.append(fn, "			");
                                _builder.append(" = it;");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t\t");
                                _builder.append("break;");
                                _builder.newLine();
                                _builder.append("\t\t");
                                _builder.append("}  ");
                                _builder.newLine();
                                _builder.append("\t");
                                _builder.append("}");
                                _builder.newLine();
                                _builder.append("}");
                                _builder.newLine();
                                _xblockexpression_1 = (_builder);
                              }
                              _switchResult = _xblockexpression_1;
                            }
                          }
                        }
                        if (!matched) {
                          if (pre instanceof XAssignment) {
                            final XAssignment _xAssignment = (XAssignment)pre;
                            matched=true;
                            CharSequence _xblockexpression_1 = null;
                            {
                              JvmIdentifiableElement _feature = _xAssignment.getFeature();
                              String _simpleName = _feature.getSimpleName();
                              final String fn = _simpleName;
                              StringConcatenation _builder = new StringConcatenation();
                              _builder.append("if(");
                              _builder.append(fn, "");
                              _builder.append("==null){");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              EventEngineInferrer.this._xbaseCompiler.toJavaStatement(_xAssignment, appendable, true);
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t");
                              _builder.append(appendable, "	");
                              _builder.newLineIfNotEmpty();
                              _builder.append("}");
                              _builder.newLine();
                              _xblockexpression_1 = (_builder);
                            }
                            _switchResult = _xblockexpression_1;
                          }
                        }
                        if (!matched) {
                          if (pre instanceof XExpression) {
                            final XExpression _xExpression = (XExpression)pre;
                            matched=true;
                            CharSequence _xblockexpression_1 = null;
                            {
                              EventEngineInferrer.this._xbaseCompiler.toJavaStatement(_xExpression, appendable, true);
                              String _name = appendable.getName(_xExpression);
                              final String resName = _name;
                              String _string = appendable.toString();
                              final String resState = _string;
                              CharSequence _xifexpression = null;
                              int _indexOf = resState.indexOf(resName);
                              String _substring = resState.substring(0, _indexOf);
                              String _trim = _substring.trim();
                              boolean _endsWith = _trim.endsWith("boolean");
                              if (_endsWith) {
                                StringConcatenation _builder = new StringConcatenation();
                                _builder.append(appendable, "");
                                _builder.newLineIfNotEmpty();
                                _builder.append("if(!");
                                String _name_1 = appendable.getName(_xExpression);
                                _builder.append(_name_1, "");
                                _builder.append(")");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t");
                                _builder.append("return false;");
                                _builder.newLine();
                                _xifexpression = _builder;
                              } else {
                                _xifexpression = "";
                              }
                              _xblockexpression_1 = (_xifexpression);
                            }
                            _switchResult = _xblockexpression_1;
                          }
                        }
                        if (!matched) {
                          _switchResult = "";
                        }
                        String _string = _switchResult.toString();
                        CollectionExtensions.<String>operator_add(preConStates, _string);
                      }
                    }
                    ArrayList<String> _arrayList_1 = new ArrayList<String>();
                    final ArrayList<String> enforceStates = _arrayList_1;
                    EList<DecScope> _decScope = elem.getDecScope();
                    final Function1<DecScope,Boolean> _function = new Function1<DecScope,Boolean>() {
                        public Boolean apply(final DecScope e) {
                          boolean _operator_and = false;
                          Scope _scope = e.getScope();
                          boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_scope, null);
                          if (!_operator_notEquals) {
                            _operator_and = false;
                          } else {
                            Scope _scope_1 = e.getScope();
                            boolean _isEnforce = _scope_1.isEnforce();
                            _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _isEnforce);
                          }
                          return Boolean.valueOf(_operator_and);
                        }
                      };
                    Iterable<DecScope> _filter = IterableExtensions.<DecScope>filter(_decScope, _function);
                    final Iterable<DecScope> toEnforceList = _filter;
                    for (final DecScope toEnforce : toEnforceList) {
                      {
                        XVariableDeclaration _var = toEnforce.getVar();
                        String _simpleName = _var.getSimpleName();
                        final String varName = _simpleName;
                        XVariableDeclaration _var_1 = toEnforce.getVar();
                        JvmTypeReference _type = _var_1.getType();
                        String _simpleName_1 = _type.getSimpleName();
                        final String typeName = _simpleName_1;
                        Scope _scope = toEnforce.getScope();
                        XExpression _expr = _scope.getExpr();
                        XExpression _memberCallTarget = ((XMemberFeatureCall) _expr).getMemberCallTarget();
                        final XExpression parentName = _memberCallTarget;
                        Scope _scope_1 = toEnforce.getScope();
                        XExpression _expr_1 = _scope_1.getExpr();
                        JvmIdentifiableElement _feature = ((XMemberFeatureCall) _expr_1).getFeature();
                        String _simpleName_2 = _feature.getSimpleName();
                        final String memberNameGet = _simpleName_2;
                        EList<XExpression> _pre_1 = elem.getPre();
                        final Function1<XExpression,Boolean> _function_1 = new Function1<XExpression,Boolean>() {
                            public Boolean apply(final XExpression e) {
                              boolean _operator_and = false;
                              if (!(e instanceof XAssignment)) {
                                _operator_and = false;
                              } else {
                                XExpression _assignable = ((XAssignment) e).getAssignable();
                                JvmIdentifiableElement _feature = ((XFeatureCall) _assignable).getFeature();
                                String _simpleName = _feature.getSimpleName();
                                boolean _operator_equals = ObjectExtensions.operator_equals(_simpleName, varName);
                                _operator_and = BooleanExtensions.operator_and((e instanceof XAssignment), _operator_equals);
                              }
                              return Boolean.valueOf(_operator_and);
                            }
                          };
                        Iterable<XExpression> _filter_1 = IterableExtensions.<XExpression>filter(_pre_1, _function_1);
                        final Iterable<XExpression> involvedPre = _filter_1;
                        StringBuilderBasedAppendable _stringBuilderBasedAppendable_1 = new StringBuilderBasedAppendable(im);
                        final StringBuilderBasedAppendable appendable_1 = _stringBuilderBasedAppendable_1;
                        appendable_1.declareVariable(cls, "this");
                        StringConcatenation _builder = new StringConcatenation();
                        _builder.append("if(");
                        _builder.append(varName, "");
                        _builder.append(" == null && ");
                        _builder.append(parentName, "");
                        _builder.append(" != null){");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("org.eclipse.emf.ecore.EPackage pkg = ");
                        _builder.append(parentName, "	");
                        _builder.append(".eClass().getEPackage();");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append(varName, "	");
                        _builder.append(" = (");
                        _builder.append(typeName, "	");
                        _builder.append(")pkg.getEFactoryInstance().create((org.eclipse.emf.ecore.EClass)pkg.getEClassifier(\"");
                        _builder.append(typeName, "	");
                        _builder.append("\"));");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append(parentName, "	");
                        _builder.append(".");
                        _builder.append(memberNameGet, "	");
                        _builder.append("().add(");
                        _builder.append(varName, "	");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                        {
                          for(final XExpression p : involvedPre) {
                            _builder.append("\t");
                            EventEngineInferrer.this._xbaseCompiler.toJavaStatement(p, appendable_1, true);
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t");
                            _builder.append(appendable_1, "	");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                        _builder.append("}");
                        _builder.newLine();
                        String _string_1 = _builder.toString();
                        CollectionExtensions.<String>operator_add(enforceStates, _string_1);
                      }
                    }
                    StringConcatenation _builder_1 = new StringConcatenation();
                    _builder_1.append("for(int i=0; i<");
                    EList<DecScope> _decScope_1 = elem.getDecScope();
                    int _size = _decScope_1.size();
                    _builder_1.append(_size, "");
                    _builder_1.append("; i++){");
                    _builder_1.newLineIfNotEmpty();
                    {
                      final Function1<String,Boolean> _function_2 = new Function1<String,Boolean>() {
                          public Boolean apply(final String e) {
                            boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(e);
                            boolean _operator_not = BooleanExtensions.operator_not(_isNullOrEmpty);
                            return Boolean.valueOf(_operator_not);
                          }
                        };
                      Iterable<String> _filter_2 = IterableExtensions.<String>filter(preConStates, _function_2);
                      for(final String states : _filter_2) {
                        _builder_1.append("try{");
                        _builder_1.newLine();
                        _builder_1.append("\t");
                        _builder_1.append(states, "	");
                        _builder_1.newLineIfNotEmpty();
                        _builder_1.append("}");
                        _builder_1.newLine();
                        _builder_1.append("catch(NullPointerException e){ }");
                        _builder_1.newLine();
                      }
                    }
                    _builder_1.append("}");
                    _builder_1.newLine();
                    _builder_1.append("for(int i=0;i<");
                    int _size_1 = enforceStates.size();
                    _builder_1.append(_size_1, "");
                    _builder_1.append(";i++){");
                    _builder_1.newLineIfNotEmpty();
                    {
                      for(final String states_1 : enforceStates) {
                        _builder_1.append("try{");
                        _builder_1.newLine();
                        _builder_1.append("\t");
                        _builder_1.append(states_1, "	");
                        _builder_1.newLineIfNotEmpty();
                        _builder_1.append("}");
                        _builder_1.newLine();
                        _builder_1.append("catch(NullPointerException e){ }");
                        _builder_1.newLine();
                      }
                    }
                    _builder_1.append("}");
                    _builder_1.newLine();
                    _builder_1.append("return true;");
                    _builder_1.newLine();
                    _xblockexpression = (_builder_1);
                  }
                  return _xblockexpression;
                }
              };
            EventEngineInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method_2 = this._jvmTypesBuilder.toMethod(_eNull_1, this.CAL_VAR, _newTypeRef_5, _function_6);
      final JvmOperation methodCalVar = _method_2;
      EList<JvmMember> _members_4 = cls.getMembers();
      CollectionExtensions.<JvmOperation>operator_add(_members_4, methodCalVar);
      EObject _eNull_2 = this.eNull();
      JvmTypeReference _newTypeRef_6 = this._jvmTypesBuilder.newTypeRef(elem, boolean.class);
      final Procedure1<JvmOperation> _function_7 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              EObject _eNull = EventEngineInferrer.this.eNull();
              JvmTypeReference _newTypeRef = EventEngineInferrer.this._jvmTypesBuilder.newTypeRef(elem, java.lang.String.class);
              JvmFormalParameter _parameter = EventEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull, "text", _newTypeRef);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager it) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("if(!parser.parse(text))");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("return false;");
                    _builder.newLine();
                    _builder.append("if(!");
                    _builder.append(EventEngineInferrer.this.CAL_VAR, "");
                    _builder.append("())");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("return false;");
                    _builder.newLine();
                    _builder.append(EventEngineInferrer.this.POST_CONDITION, "");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("return true;");
                    _builder.newLine();
                    return _builder;
                  }
                };
              EventEngineInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          }
        };
      JvmOperation _method_3 = this._jvmTypesBuilder.toMethod(_eNull_2, this.INNER_EXECUTE, _newTypeRef_6, _function_7);
      final JvmOperation methodInnerExec = _method_3;
      this._jvmVisibilityExtension.makePrivate(methodInnerExec);
      EList<JvmMember> _members_5 = cls.getMembers();
      CollectionExtensions.<JvmOperation>operator_add(_members_5, methodInnerExec);
      EObject _eNull_3 = this.eNull();
      JvmTypeReference _newTypeRef_7 = this._jvmTypesBuilder.newTypeRef(elem, boolean.class);
      final Procedure1<JvmOperation> _function_8 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              EObject _eNull = EventEngineInferrer.this.eNull();
              JvmTypeReference _newTypeRef = EventEngineInferrer.this._jvmTypesBuilder.newTypeRef(elem, java.lang.Object.class);
              JvmFormalParameter _parameter = EventEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull, "event", _newTypeRef);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager it) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("return _execute((String)event);");
                    _builder.newLine();
                    return _builder;
                  }
                };
              EventEngineInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          }
        };
      JvmOperation _method_4 = this._jvmTypesBuilder.toMethod(_eNull_3, this.EXT_EXECUTE, _newTypeRef_7, _function_8);
      final JvmOperation methodExtExec = _method_4;
      this._jvmVisibilityExtension.makePublic(methodInnerExec);
      EList<JvmMember> _members_6 = cls.getMembers();
      CollectionExtensions.<JvmOperation>operator_add(_members_6, methodExtExec);
      XExpression _post = elem.getPost();
      final XExpression postElem = _post;
      JvmTypeReference _newTypeRef_8 = this._jvmTypesBuilder.newTypeRef(postElem, Void.TYPE);
      final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EventEngineInferrer.this._jvmTypesBuilder.setBody(it, postElem);
          }
        };
      JvmOperation _method_5 = this._jvmTypesBuilder.toMethod(postElem, this.POST_CONDITION, _newTypeRef_8, _function_9);
      final JvmOperation methodPost = _method_5;
      EList<JvmMember> _members_7 = cls.getMembers();
      CollectionExtensions.<JvmOperation>operator_add(_members_7, methodPost);
      _xblockexpression = (cls);
    }
    return _xblockexpression;
  }
  
  protected JvmGenericType _inferParser(final Parser parser) {
    return null;
  }
  
  /**
   * Event Parser for Text
   */
  protected JvmGenericType _inferParser(final TextParser parser) {
    JvmGenericType _xblockexpression = null;
    {
      EObject _eContainer = parser.eContainer();
      final EObject eveElement = _eContainer;
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(eveElement);
      QualifiedName _skipLast = _fullyQualifiedName.skipLast(2);
      QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(eveElement);
      String _lastSegment = _fullyQualifiedName_1.getLastSegment();
      QualifiedName _append = _skipLast.append(_lastSegment);
      String _string = _append.toString();
      String _operator_plus = StringExtensions.operator_plus(_string, "Parser");
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              it.setAbstract(false);
              Iterable<XVariableDeclaration> _variableDecs = EventEngineInferrer.this._eveModelExtension.getVariableDecs(parser);
              for (final XVariableDeclaration v : _variableDecs) {
                EList<JvmMember> _members = it.getMembers();
                JvmField _defaultField = EventEngineInferrer.this.defaultField(v);
                CollectionExtensions.<JvmField>operator_add(_members, _defaultField);
              }
              EList<JvmMember> _members_1 = it.getMembers();
              final Procedure1<JvmMember> _function = new Procedure1<JvmMember>() {
                  public void apply(final JvmMember e) {
                    EventEngineInferrer.this._jvmVisibilityExtension.makePublic(e);
                  }
                };
              IterableExtensions.<JvmMember>forEach(_members_1, _function);
            }
          }
        };
      JvmGenericType _class = this._jvmTypesBuilder.toClass(parser, _operator_plus, _function);
      final JvmGenericType result = _class;
      ArrayList<String> _arrayList = new ArrayList<String>();
      final ArrayList<String> matchStats = _arrayList;
      int i = 0;
      EList<AbstractTextValue> _value = parser.getValue();
      for (final AbstractTextValue value : _value) {
        {
          CharSequence _switchResult = null;
          boolean matched = false;
          if (!matched) {
            if (value instanceof ConstantText) {
              final ConstantText _constantText = (ConstantText)value;
              matched=true;
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("if(!text.get(");
              _builder.append(i, "");
              _builder.append(").equals(\"");
              String _content = _constantText.getContent();
              _builder.append(_content, "");
              _builder.append("\"))  ");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("return false;");
              _builder.newLine();
              _switchResult = _builder;
            }
          }
          if (!matched) {
            if (value instanceof VarValue) {
              final VarValue _varValue = (VarValue)value;
              XVariableDeclaration _variable = _varValue.getVariable();
              JvmTypeReference _type = _variable.getType();
              boolean _is = this._typeReferences.is(_type, java.lang.String.class);
              if (_is) {
                matched=true;
                StringConcatenation _builder = new StringConcatenation();
                _builder.append(" ");
                _builder.append("this.");
                XVariableDeclaration _variable_1 = _varValue.getVariable();
                String _name = _variable_1.getName();
                _builder.append(_name, " ");
                _builder.append(" = text.get(");
                _builder.append(i, " ");
                _builder.append("); ");
                _switchResult = _builder;
              }
            }
          }
          if (!matched) {
            if (value instanceof VarValue) {
              final VarValue _varValue = (VarValue)value;
              XVariableDeclaration _variable = _varValue.getVariable();
              JvmTypeReference _type = _variable.getType();
              boolean _is = this._typeReferences.is(_type, java.lang.Double.class);
              if (_is) {
                matched=true;
                StringConcatenation _builder = new StringConcatenation();
                _builder.append(" ");
                _builder.append("this.");
                XVariableDeclaration _variable_1 = _varValue.getVariable();
                String _name = _variable_1.getName();
                _builder.append(_name, " ");
                _builder.append(" = new Double(text.get(");
                _builder.append(i, " ");
                _builder.append(")); ");
                _switchResult = _builder;
              }
            }
          }
          if (!matched) {
            if (value instanceof VarValue) {
              final VarValue _varValue = (VarValue)value;
              XVariableDeclaration _variable = _varValue.getVariable();
              JvmTypeReference _type = _variable.getType();
              boolean _is = this._typeReferences.is(_type, java.lang.Integer.class);
              if (_is) {
                matched=true;
                StringConcatenation _builder = new StringConcatenation();
                _builder.append(" ");
                _builder.append("this.");
                XVariableDeclaration _variable_1 = _varValue.getVariable();
                String _name = _variable_1.getName();
                _builder.append(_name, " ");
                _builder.append(" = new Integer(text.get(");
                _builder.append(i, " ");
                _builder.append(")); ");
                _switchResult = _builder;
              }
            }
          }
          if (!matched) {
            _switchResult = "";
          }
          final CharSequence line = _switchResult;
          String _string_1 = line.toString();
          CollectionExtensions.<String>operator_add(matchStats, _string_1);
          int _operator_plus_1 = IntegerExtensions.operator_plus(i, 1);
          i = _operator_plus_1;
        }
      }
      EList<JvmMember> _members = result.getMembers();
      EObject _eNull = this.eNull();
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(parser, boolean.class);
      final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              EObject _eNull = EventEngineInferrer.this.eNull();
              JvmTypeReference _newTypeRef = EventEngineInferrer.this._jvmTypesBuilder.newTypeRef(parser, java.lang.String.class);
              JvmFormalParameter _parameter = EventEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull, "stringText", _newTypeRef);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager it) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("try{");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("List<String> text = format(stringText);");
                    _builder.newLine();
                    {
                      for(final String line : matchStats) {
                        _builder.append("\t");
                        _builder.append(line, "	");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t");
                    _builder.append("return true;");
                    _builder.newLine();
                    _builder.append("}catch(Exception e){");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("System.err.println(e.getMessage());return false;");
                    _builder.newLine();
                    _builder.append("}");
                    _builder.newLine();
                    return _builder;
                  }
                };
              EventEngineInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(_eNull, "parse", _newTypeRef, _function_1);
      CollectionExtensions.<JvmOperation>operator_add(_members, _method);
      EList<JvmMember> _members_1 = result.getMembers();
      TextFormatter _formatter = parser.getFormatter();
      JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(parser, java.lang.String.class);
      JvmTypeReference _newTypeRef_2 = this._jvmTypesBuilder.newTypeRef(parser, java.util.List.class, _newTypeRef_1);
      final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EObject _eNull = EventEngineInferrer.this.eNull();
              JvmTypeReference _newTypeRef = EventEngineInferrer.this._jvmTypesBuilder.newTypeRef(parser, java.lang.String.class);
              JvmFormalParameter _parameter = EventEngineInferrer.this._jvmTypesBuilder.toParameter(_eNull, "text", _newTypeRef);
              final JvmFormalParameter para = _parameter;
              EList<JvmFormalParameter> _parameters = it.getParameters();
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, para);
              TextFormatter _formatter = parser.getFormatter();
              if ((_formatter instanceof UserDefinedFormatter)) {
                TextFormatter _formatter_1 = parser.getFormatter();
                XExpression _expr = ((UserDefinedFormatter) _formatter_1).getExpr();
                EventEngineInferrer.this._jvmTypesBuilder.setBody(it, _expr);
              } else {
                final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                    public CharSequence apply(final ImportManager im) {
                      CharSequence _xblockexpression = null;
                      {
                        TextFormatter _formatter = parser.getFormatter();
                        final TextFormatter formatter = _formatter;
                        CharSequence _switchResult = null;
                        boolean matched = false;
                        if (!matched) {
                          if (formatter instanceof SplitFormatter) {
                            final SplitFormatter _splitFormatter = (SplitFormatter)formatter;
                            matched=true;
                            StringConcatenation _builder = new StringConcatenation();
                            _builder.append("return java.util.Arrays.asList(text.split(\"");
                            String _spliter = _splitFormatter.getSpliter();
                            _builder.append(_spliter, "");
                            _builder.append("\"));");
                            _switchResult = _builder;
                          }
                        }
                        if (!matched) {
                          if (formatter instanceof UserDefinedFormatter) {
                            final UserDefinedFormatter _userDefinedFormatter = (UserDefinedFormatter)formatter;
                            matched=true;
                            CharSequence _xblockexpression_1 = null;
                            {
                              StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable(im);
                              final StringBuilderBasedAppendable appendable = _stringBuilderBasedAppendable;
                              appendable.declareVariable(para, "text");
                              XExpression _expr = _userDefinedFormatter.getExpr();
                              EventEngineInferrer.this._xbaseCompiler.toJavaStatement(_expr, appendable, true);
                              StringConcatenation _builder = new StringConcatenation();
                              _builder.append(appendable, "");
                              _builder.newLineIfNotEmpty();
                              _builder.append("return ");
                              XExpression _expr_1 = _userDefinedFormatter.getExpr();
                              String _name = appendable.getName(_expr_1);
                              _builder.append(_name, "");
                              _builder.append(";\t   \t\t\t\t\t\t");
                              _builder.newLineIfNotEmpty();
                              _xblockexpression_1 = (_builder);
                            }
                            _switchResult = _xblockexpression_1;
                          }
                        }
                        if (!matched) {
                          StringConcatenation _builder = new StringConcatenation();
                          _builder.append("return java.util.Arrays.asList(text.split(\",\"));");
                          _switchResult = _builder;
                        }
                        _xblockexpression = (_switchResult);
                      }
                      return _xblockexpression;
                    }
                  };
                EventEngineInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            }
          }
        };
      JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(_formatter, "format", _newTypeRef_2, _function_2);
      CollectionExtensions.<JvmOperation>operator_add(_members_1, _method_1);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public EObject eNull() {
    return null;
  }
  
  public JvmField defaultField(final XVariableDeclaration v) {
    String _name = v.getName();
    JvmTypeReference _type = v.getType();
    final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
        public void apply(final JvmField it) {
          final Function1<ImportManager,String> _function = new Function1<ImportManager,String>() {
              public String apply(final ImportManager i) {
                return "null";
              }
            };
          EventEngineInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
        }
      };
    JvmField _field = this._jvmTypesBuilder.toField(v, _name, _type, _function);
    return _field;
  }
  
  public JvmGenericType inferParser(final Parser parser) {
    if (parser instanceof TextParser) {
      return _inferParser((TextParser)parser);
    } else if (parser != null) {
      return _inferParser(parser);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(parser).toString());
    }
  }
}
