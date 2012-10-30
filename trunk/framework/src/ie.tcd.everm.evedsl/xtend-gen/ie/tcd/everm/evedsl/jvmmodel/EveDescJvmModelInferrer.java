package ie.tcd.everm.evedsl.jvmmodel;

import com.google.inject.Inject;
import ie.tcd.everm.evedsl.eveDesc.API;
import ie.tcd.everm.evedsl.eveDesc.Event;
import ie.tcd.everm.evedsl.eveDesc.EventSeq;
import ie.tcd.everm.evedsl.eveDesc.Helper;
import ie.tcd.everm.evedsl.eveDesc.Invocation;
import ie.tcd.everm.evedsl.eveDesc.Mapping;
import ie.tcd.everm.evedsl.eveDesc.OperationPointCut;
import ie.tcd.everm.evedsl.eveDesc.OperationType;
import ie.tcd.everm.evedsl.eveDesc.SubType;
import ie.tcd.everm.evedsl.jvmmodel.APIEngineInferrer;
import ie.tcd.everm.evedsl.jvmmodel.EveModelExtension;
import ie.tcd.everm.evedsl.jvmmodel.EventEngineInferrer;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmVisibilityExtension;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class EveDescJvmModelInferrer extends AbstractModelInferrer {
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
  
  /**
   * conveninence API to build and initialize JvmTypes and their members.
   */
  @Inject
  private EventEngineInferrer _eventEngineInferrer;
  
  @Inject
  private APIEngineInferrer _aPIEngineInferrer;
  
  public static String INS_MAP = "instances";
  
  public static String RESOLVE_INS = "resolveInstance";
  
  public static String RES = "resource";
  
  public static String POOL = "_instPool";
  
  /**
   * Is called for each instance of the first argument's type contained in a resource.
   * 
   * @param element - the model to create one or more JvmDeclaredTypes from.
   * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
   *                   current resource.
   * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
   *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
   */
  protected void _infer(final EventSeq rootElement, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(rootElement);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              it.setAbstract(false);
              String _documentation = EveDescJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(rootElement);
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            }
          }
        };
      JvmGenericType _class = this._jvmTypesBuilder.toClass(rootElement, _fullyQualifiedName, _function);
      final JvmGenericType mainCls = _class;
      acceptor.accept(mainCls);
      EList<Helper> _helper = rootElement.getHelper();
      for (final Helper helper : _helper) {
        EList<JvmMember> _members = mainCls.getMembers();
        JvmOperation _inferHelper = this.inferHelper(helper);
        CollectionExtensions.<JvmOperation>operator_add(_members, _inferHelper);
      }
      EList<Event> _event = rootElement.getEvent();
      for (final Event elem : _event) {
        {
          JvmGenericType _inferEventEngine = this._eventEngineInferrer.inferEventEngine(elem, acceptor, isPrelinkingPhase);
          final JvmGenericType eveCls = _inferEventEngine;
          EList<JvmMember> _members_1 = mainCls.getMembers();
          EObject _eNull = this.eNull();
          String _simpleName = eveCls.getSimpleName();
          String _firstLower = StringExtensions.toFirstLower(_simpleName);
          JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(eveCls);
          final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
              public void apply(final JvmField it) {
                final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                    public CharSequence apply(final ImportManager im) {
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("new ");
                      String _simpleName = eveCls.getSimpleName();
                      _builder.append(_simpleName, "");
                      _builder.append("()");
                      return _builder;
                    }
                  };
                EveDescJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
              }
            };
          JvmField _field = this._jvmTypesBuilder.toField(_eNull, _firstLower, _createTypeRef, _function_1);
          CollectionExtensions.<JvmField>operator_add(_members_1, _field);
        }
      }
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(rootElement, java.lang.String.class);
      JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(rootElement, org.eclipse.emf.ecore.EObject.class);
      JvmTypeReference _newTypeRef_2 = this._jvmTypesBuilder.newTypeRef(rootElement, java.util.Map.class, _newTypeRef, _newTypeRef_1);
      final JvmTypeReference mapSE = _newTypeRef_2;
      EList<JvmMember> _members_2 = mainCls.getMembers();
      EObject _eNull_1 = this.eNull();
      JvmTypeReference _newTypeRef_3 = this._jvmTypesBuilder.newTypeRef(rootElement, Void.TYPE);
      final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              EObject _eNull = EveDescJvmModelInferrer.this.eNull();
              JvmFormalParameter _parameter = EveDescJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, "context", mapSE);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager it) {
                    StringConcatenation _builder = new StringConcatenation();
                    {
                      EList<Event> _event = rootElement.getEvent();
                      for(final Event elem : _event) {
                        String _name = elem.getName();
                        String _firstLower = StringExtensions.toFirstLower(_name);
                        _builder.append(_firstLower, "");
                        _builder.append(".init(context);");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    return _builder;
                  }
                };
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(_eNull_1, "init", _newTypeRef_3, _function_2);
      CollectionExtensions.<JvmOperation>operator_add(_members_2, _method);
      EList<JvmMember> _members_3 = mainCls.getMembers();
      EObject _eNull_2 = this.eNull();
      JvmTypeReference _newTypeRef_4 = this._jvmTypesBuilder.newTypeRef(rootElement, Void.TYPE);
      final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              EObject _eNull = EveDescJvmModelInferrer.this.eNull();
              JvmTypeReference _newTypeRef = EveDescJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(rootElement, java.lang.Object.class);
              JvmFormalParameter _parameter = EveDescJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, "event", _newTypeRef);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager it) {
                    StringConcatenation _builder = new StringConcatenation();
                    {
                      EList<Event> _event = rootElement.getEvent();
                      for(final Event elem : _event) {
                        String _name = elem.getName();
                        String _firstLower = StringExtensions.toFirstLower(_name);
                        _builder.append(_firstLower, "");
                        _builder.append(".execute(event);");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    return _builder;
                  }
                };
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          }
        };
      JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(_eNull_2, "execute", _newTypeRef_4, _function_3);
      CollectionExtensions.<JvmOperation>operator_add(_members_3, _method_1);
  }
  
  protected void _infer(final API apiRoot, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(apiRoot);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              it.setAbstract(false);
              String _documentation = EveDescJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(apiRoot);
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            }
          }
        };
      JvmGenericType _class = this._jvmTypesBuilder.toClass(apiRoot, _fullyQualifiedName, _function);
      final JvmGenericType mainCls = _class;
      acceptor.accept(mainCls);
      EList<Helper> _helper = apiRoot.getHelper();
      for (final Helper helper : _helper) {
        EList<JvmMember> _members = mainCls.getMembers();
        JvmOperation _inferHelper = this.inferHelper(helper);
        CollectionExtensions.<JvmOperation>operator_add(_members, _inferHelper);
      }
      EList<Mapping> _mapping = apiRoot.getMapping();
      for (final Mapping mapping : _mapping) {
        {
          EList<JvmMember> _members_1 = mainCls.getMembers();
          JvmOperation _inferNewImage = this.inferNewImage(mapping, mainCls);
          CollectionExtensions.<JvmOperation>operator_add(_members_1, _inferNewImage);
          EList<JvmMember> _members_2 = mainCls.getMembers();
          JvmOperation _inferInitImage = this.inferInitImage(mapping);
          CollectionExtensions.<JvmOperation>operator_add(_members_2, _inferInitImage);
        }
      }
      EList<Invocation> _invocation = apiRoot.getInvocation();
      for (final Invocation elem : _invocation) {
        this._aPIEngineInferrer.inferAPIEngine(elem, acceptor, isPrelinkingPhase, mainCls);
      }
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(apiRoot, org.eclipse.emf.ecore.resource.Resource.class);
      final JvmTypeReference resType = _newTypeRef;
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(mainCls);
      JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(apiRoot, java.util.Map.class, resType, _createTypeRef);
      final JvmTypeReference resInsMapType = _newTypeRef_1;
      EList<JvmMember> _members_3 = mainCls.getMembers();
      EObject _eNull = this.eNull();
      final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            {
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager im) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append(" ");
                    _builder.append("new java.util.HashMap<Resource,");
                    String _simpleName = mainCls.getSimpleName();
                    _builder.append(_simpleName, " ");
                    _builder.append(">()");
                    return _builder;
                  }
                };
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
              it.setStatic(true);
            }
          }
        };
      JvmField _field = this._jvmTypesBuilder.toField(_eNull, EveDescJvmModelInferrer.INS_MAP, resInsMapType, _function_1);
      CollectionExtensions.<JvmField>operator_add(_members_3, _field);
      EList<JvmMember> _members_4 = mainCls.getMembers();
      EObject _eNull_1 = this.eNull();
      final Procedure1<JvmField> _function_2 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                public CharSequence apply(final ImportManager im) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("null");
                  return _builder;
                }
              };
            EveDescJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
          }
        };
      JvmField _field_1 = this._jvmTypesBuilder.toField(_eNull_1, EveDescJvmModelInferrer.RES, resType, _function_2);
      CollectionExtensions.<JvmField>operator_add(_members_4, _field_1);
      EList<JvmMember> _members_5 = mainCls.getMembers();
      EObject _eNull_2 = this.eNull();
      JvmParameterizedTypeReference _createTypeRef_1 = this._typeReferences.createTypeRef(mainCls);
      final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              EObject _eNull = EveDescJvmModelInferrer.this.eNull();
              JvmFormalParameter _parameter = EveDescJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, "resource", resType);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              it.setStatic(true);
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager it) {
                    StringConcatenation _builder = new StringConcatenation();
                    String _simpleName = mainCls.getSimpleName();
                    _builder.append(_simpleName, "");
                    _builder.append(" result = ");
                    _builder.append(EveDescJvmModelInferrer.INS_MAP, "");
                    _builder.append(".get(resource);");
                    _builder.newLineIfNotEmpty();
                    _builder.append("if(result!=null)");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("return result;");
                    _builder.newLine();
                    _builder.append("result = new ");
                    String _simpleName_1 = mainCls.getSimpleName();
                    _builder.append(_simpleName_1, "");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("result.");
                    _builder.append(EveDescJvmModelInferrer.RES, "");
                    _builder.append(" = resource;");
                    _builder.newLineIfNotEmpty();
                    _builder.append(EveDescJvmModelInferrer.INS_MAP, "");
                    _builder.append(".put(resource,result);");
                    _builder.newLineIfNotEmpty();
                    _builder.append("for(Object o:resource.eAdapters())");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("if(o instanceof ");
                    String _name = apiRoot.getName();
                    _builder.append(_name, "	");
                    _builder.append("Adapter)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t");
                    _builder.append("return result;");
                    _builder.newLine();
                    _builder.append("resource.eAdapters().add(");
                    String _name_1 = apiRoot.getName();
                    _builder.append(_name_1, "");
                    _builder.append("Adapter.INSTANCE);");
                    _builder.newLineIfNotEmpty();
                    _builder.append("return result;");
                    _builder.newLine();
                    return _builder;
                  }
                };
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(_eNull_2, EveDescJvmModelInferrer.RESOLVE_INS, _createTypeRef_1, _function_3);
      CollectionExtensions.<JvmOperation>operator_add(_members_5, _method);
      EList<JvmMember> _members_6 = mainCls.getMembers();
      EObject _eNull_3 = this.eNull();
      JvmTypeReference _newTypeRef_2 = this._jvmTypesBuilder.newTypeRef(apiRoot, org.eclipse.emf.ecore.EObject.class);
      JvmTypeReference _newTypeRef_3 = this._jvmTypesBuilder.newTypeRef(apiRoot, java.lang.Object.class);
      JvmTypeReference _newTypeRef_4 = this._jvmTypesBuilder.newTypeRef(apiRoot, java.util.Map.class, _newTypeRef_2, _newTypeRef_3);
      final Procedure1<JvmField> _function_4 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                public CharSequence apply(final ImportManager im) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("new java.util.HashMap<EObject,Object>()");
                  return _builder;
                }
              };
            EveDescJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
          }
        };
      JvmField _field_2 = this._jvmTypesBuilder.toField(_eNull_3, EveDescJvmModelInferrer.POOL, _newTypeRef_4, _function_4);
      CollectionExtensions.<JvmField>operator_add(_members_6, _field_2);
      JvmGenericType _inferAdapter = this.inferAdapter(apiRoot);
      acceptor.accept(_inferAdapter);
  }
  
  public EObject eNull() {
    return null;
  }
  
  public JvmOperation inferHelper(final Helper helper) {
    JvmOperation _xblockexpression = null;
    {
      String _name = helper.getName();
      JvmTypeReference _type = helper.getType();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EList<JvmFormalParameter> _params = helper.getParams();
              for (final JvmFormalParameter param : _params) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                String _name = param.getName();
                JvmTypeReference _parameterType = param.getParameterType();
                JvmFormalParameter _parameter = EveDescJvmModelInferrer.this._jvmTypesBuilder.toParameter(param, _name, _parameterType);
                CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              }
              XExpression _body = helper.getBody();
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
            }
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(helper, _name, _type, _function);
      final JvmOperation mh = _method;
      mh.setStatic(true);
      _xblockexpression = (mh);
    }
    return _xblockexpression;
  }
  
  public JvmOperation inferNewImage(final Mapping mapping, final JvmGenericType mainCls) {
    JvmOperation _xblockexpression = null;
    {
      EList<SubType> _subType = mapping.getSubType();
      for (final SubType subType : _subType) {
        {
          JvmTypeReference _mType = mapping.getMType();
          String _simpleName = _mType.getSimpleName();
          String _operator_plus = StringExtensions.operator_plus("check", _simpleName);
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "For");
          JvmTypeReference _type = subType.getType();
          String _simpleName_1 = _type.getSimpleName();
          String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _simpleName_1);
          final String chkMethodName = _operator_plus_2;
          EList<JvmMember> _members = mainCls.getMembers();
          JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(subType, boolean.class);
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  EObject _eNull = EveDescJvmModelInferrer.this.eNull();
                  JvmTypeReference _sType = mapping.getSType();
                  JvmFormalParameter _parameter = EveDescJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, "core", _sType);
                  CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  XExpression _pre = subType.getPre();
                  EveDescJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _pre);
                }
              }
            };
          JvmOperation _method = this._jvmTypesBuilder.toMethod(subType, chkMethodName, _newTypeRef, _function);
          CollectionExtensions.<JvmOperation>operator_add(_members, _method);
        }
      }
      EObject _eNull = this.eNull();
      JvmTypeReference _mType_1 = mapping.getMType();
      String _simpleName_2 = _mType_1.getSimpleName();
      String _operator_plus_3 = StringExtensions.operator_plus("create", _simpleName_2);
      JvmTypeReference _mType_2 = mapping.getMType();
      final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EObject _eNull = EveDescJvmModelInferrer.this.eNull();
              JvmTypeReference _sType = mapping.getSType();
              JvmFormalParameter _parameter = EveDescJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, "core", _sType);
              final JvmFormalParameter para = _parameter;
              EList<JvmFormalParameter> _parameters = it.getParameters();
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, para);
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager im) {
                    CharSequence _xblockexpression = null;
                    {
                      ArrayList<String> _arrayList = new ArrayList<String>();
                      final ArrayList<String> subTypeStats = _arrayList;
                      EList<SubType> _subType = mapping.getSubType();
                      for (final SubType subType : _subType) {
                        {
                          JvmTypeReference _mType = mapping.getMType();
                          String _simpleName = _mType.getSimpleName();
                          String _operator_plus = StringExtensions.operator_plus("check", _simpleName);
                          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "For");
                          JvmTypeReference _type = subType.getType();
                          String _simpleName_1 = _type.getSimpleName();
                          String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _simpleName_1);
                          final String chkMethodName = _operator_plus_2;
                          StringConcatenation _builder = new StringConcatenation();
                          _builder.append("if(");
                          _builder.append(chkMethodName, "");
                          _builder.append("(core))");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("mTypeName = \"");
                          JvmTypeReference _type_1 = subType.getType();
                          String _simpleName_2 = _type_1.getSimpleName();
                          _builder.append(_simpleName_2, "	");
                          _builder.append("\";");
                          _builder.newLineIfNotEmpty();
                          String _string = _builder.toString();
                          CollectionExtensions.<String>operator_add(subTypeStats, _string);
                        }
                      }
                      StringConcatenation _builder_1 = new StringConcatenation();
                      _builder_1.append("String mTypeName = \"");
                      JvmTypeReference _mType_1 = mapping.getMType();
                      String _simpleName_3 = _mType_1.getSimpleName();
                      _builder_1.append(_simpleName_3, "");
                      _builder_1.append("\";");
                      _builder_1.newLineIfNotEmpty();
                      {
                        for(final String subTypeState : subTypeStats) {
                          _builder_1.append(subTypeState, "");
                          _builder_1.newLineIfNotEmpty();
                        }
                      }
                      _builder_1.append("for(EObject obj : ");
                      _builder_1.append(EveDescJvmModelInferrer.POOL, "");
                      _builder_1.append(".keySet())");
                      _builder_1.newLineIfNotEmpty();
                      _builder_1.append("\t");
                      _builder_1.append("if(");
                      _builder_1.append(EveDescJvmModelInferrer.POOL, "	");
                      _builder_1.append(".get(obj).equals(core))");
                      _builder_1.newLineIfNotEmpty();
                      _builder_1.append("\t\t");
                      _builder_1.append("return (");
                      JvmTypeReference _mType_2 = mapping.getMType();
                      String _simpleName_4 = _mType_2.getSimpleName();
                      _builder_1.append(_simpleName_4, "		");
                      _builder_1.append(")obj;");
                      _builder_1.newLineIfNotEmpty();
                      _builder_1.append("org.eclipse.emf.ecore.EPackage epackage = ");
                      _builder_1.append(EveDescJvmModelInferrer.RES, "");
                      _builder_1.append(".getAllContents().next().eClass().getEPackage();");
                      _builder_1.newLineIfNotEmpty();
                      JvmTypeReference _mType_3 = mapping.getMType();
                      String _simpleName_5 = _mType_3.getSimpleName();
                      _builder_1.append(_simpleName_5, "");
                      _builder_1.append(" ins = (");
                      JvmTypeReference _mType_4 = mapping.getMType();
                      String _simpleName_6 = _mType_4.getSimpleName();
                      _builder_1.append(_simpleName_6, "");
                      _builder_1.append(")epackage.getEFactoryInstance().create((org.eclipse.emf.ecore.EClass)epackage.getEClassifier(mTypeName));");
                      _builder_1.newLineIfNotEmpty();
                      _builder_1.append("ins.eAdapters().add(");
                      String _simpleName_7 = mainCls.getSimpleName();
                      _builder_1.append(_simpleName_7, "");
                      _builder_1.append("Adapter.INSTANCE);");
                      _builder_1.newLineIfNotEmpty();
                      _builder_1.append("init");
                      JvmTypeReference _mType_5 = mapping.getMType();
                      String _simpleName_8 = _mType_5.getSimpleName();
                      _builder_1.append(_simpleName_8, "");
                      _builder_1.append("(ins, core);");
                      _builder_1.newLineIfNotEmpty();
                      _builder_1.append(EveDescJvmModelInferrer.POOL, "");
                      _builder_1.append(".put(ins,core);");
                      _builder_1.newLineIfNotEmpty();
                      _builder_1.append("return ins;");
                      _builder_1.newLine();
                      _xblockexpression = (_builder_1);
                    }
                    return _xblockexpression;
                  }
                };
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          }
        };
      JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(_eNull, _operator_plus_3, _mType_2, _function_1);
      _xblockexpression = (_method_1);
    }
    return _xblockexpression;
  }
  
  public JvmOperation inferInitImage(final Mapping mapping) {
    EObject _eNull = this.eNull();
    JvmTypeReference _mType = mapping.getMType();
    String _simpleName = _mType.getSimpleName();
    String _operator_plus = StringExtensions.operator_plus("init", _simpleName);
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(mapping, Void.TYPE);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            EObject _eNull = EveDescJvmModelInferrer.this.eNull();
            JvmTypeReference _mType = mapping.getMType();
            JvmFormalParameter _parameter = EveDescJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, "element", _mType);
            CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            EObject _eNull_1 = EveDescJvmModelInferrer.this.eNull();
            JvmTypeReference _sType = mapping.getSType();
            JvmFormalParameter _parameter_1 = EveDescJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull_1, "core", _sType);
            CollectionExtensions.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            XExpression _newImage = mapping.getNewImage();
            EveDescJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _newImage);
          }
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(_eNull, _operator_plus, _newTypeRef, _function);
    return _method;
  }
  
  public JvmGenericType inferAdapter(final API apiRoot) {
    JvmGenericType _xblockexpression = null;
    {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(apiRoot);
      String _string = _fullyQualifiedName.toString();
      String _operator_plus = StringExtensions.operator_plus(_string, "Adapter");
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              it.setAbstract(false);
              String _documentation = EveDescJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(apiRoot);
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmTypeReference _newTypeRef = EveDescJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(apiRoot, org.eclipse.emf.common.notify.impl.AdapterImpl.class);
              CollectionExtensions.<JvmTypeReference>operator_add(_superTypes, _newTypeRef);
            }
          }
        };
      JvmGenericType _class = this._jvmTypesBuilder.toClass(apiRoot, _operator_plus, _function);
      final JvmGenericType adapterCls = _class;
      EList<JvmMember> _members = adapterCls.getMembers();
      EObject _eNull = this.eNull();
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(apiRoot, Void.TYPE);
      final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              EObject _eNull = EveDescJvmModelInferrer.this.eNull();
              JvmTypeReference _newTypeRef = EveDescJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(apiRoot, org.eclipse.emf.common.notify.Notification.class);
              JvmFormalParameter _parameter = EveDescJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, "notification", _newTypeRef);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              ArrayList<String> _arrayList = new ArrayList<String>();
              final ArrayList<String> addStates = _arrayList;
              EList<Invocation> _invocation = apiRoot.getInvocation();
              for (final Invocation invk : _invocation) {
                EList<OperationPointCut> _operation = invk.getOperation();
                final Function1<OperationPointCut,Boolean> _function = new Function1<OperationPointCut,Boolean>() {
                    public Boolean apply(final OperationPointCut e) {
                      boolean _operator_or = false;
                      OperationType _opType = e.getOpType();
                      boolean _operator_equals = ObjectExtensions.operator_equals(_opType, OperationType.ADD);
                      if (_operator_equals) {
                        _operator_or = true;
                      } else {
                        OperationType _opType_1 = e.getOpType();
                        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_opType_1, OperationType.REMOVE);
                        _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
                      }
                      return Boolean.valueOf(_operator_or);
                    }
                  };
                Iterable<OperationPointCut> _filter = IterableExtensions.<OperationPointCut>filter(_operation, _function);
                for (final OperationPointCut op : _filter) {
                  {
                    String _xifexpression = null;
                    JvmTypeReference _elemType = op.getElemType();
                    boolean _operator_equals = ObjectExtensions.operator_equals(_elemType, null);
                    if (_operator_equals) {
                      _xifexpression = "Object";
                    } else {
                      JvmTypeReference _elemType_1 = op.getElemType();
                      JvmType _type = _elemType_1.getType();
                      QualifiedName _fullyQualifiedName = EveDescJvmModelInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(_type);
                      String _string = _fullyQualifiedName.toString();
                      _xifexpression = _string;
                    }
                    final String elemType = _xifexpression;
                    EObject _eContainer = op.eContainer();
                    String _name = ((Invocation) _eContainer).getName();
                    final String invkName = _name;
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("if((Notification.");
                    OperationType _opType = op.getOpType();
                    String _name_1 = _opType.name();
                    String _upperCase = _name_1.toUpperCase();
                    _builder.append(_upperCase, "");
                    _builder.append("==notification.getEventType()) && (notifier instanceof ");
                    _builder.append(elemType, "");
                    _builder.append(")){");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    String _name_2 = apiRoot.getName();
                    _builder.append(_name_2, "	");
                    _builder.append(" root = ");
                    String _name_3 = apiRoot.getName();
                    _builder.append(_name_3, "	");
                    _builder.append(".");
                    _builder.append(EveDescJvmModelInferrer.RESOLVE_INS, "	");
                    _builder.append("(((");
                    _builder.append(elemType, "	");
                    _builder.append(")notifier).eResource());");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append(invkName, "	");
                    _builder.append(" invk = new ");
                    _builder.append(invkName, "	");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("invk.");
                    _builder.append(APIEngineInferrer.ROOT_FIELD, "	");
                    _builder.append(" = root;");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("invk.");
                    String _methodName = EveDescJvmModelInferrer.this._aPIEngineInferrer.getMethodName(op);
                    _builder.append(_methodName, "	");
                    _builder.append("((");
                    _builder.append(elemType, "	");
                    _builder.append(")notifier,feature,newvalue);");
                    _builder.newLineIfNotEmpty();
                    _builder.append("}");
                    _builder.newLine();
                    String _string_1 = _builder.toString();
                    CollectionExtensions.<String>operator_add(addStates, _string_1);
                  }
                }
              }
              final Function1<ImportManager,CharSequence> _function_1 = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager im) {
                    CharSequence _xblockexpression = null;
                    {
                      JvmTypeReference _newTypeRef = EveDescJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(apiRoot, org.eclipse.emf.ecore.EObject.class);
                      JvmType _type = _newTypeRef.getType();
                      im.addImportFor(_type);
                      JvmTypeReference _newTypeRef_1 = EveDescJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(apiRoot, org.eclipse.emf.ecore.EStructuralFeature.class);
                      JvmType _type_1 = _newTypeRef_1.getType();
                      im.addImportFor(_type_1);
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("StackTraceElement[] st = Thread.currentThread().getStackTrace();");
                      _builder.newLine();
                      _builder.append("for(int i=0; i<st.length; i++){");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("if(st[i].getMethodName().startsWith(\"");
                      _builder.append(APIEngineInferrer.OPMETHOD_PREFIX, "	");
                      _builder.append("\"))");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("return;");
                      _builder.newLine();
                      _builder.append("}");
                      _builder.newLine();
                      _builder.append("Object notifier = notification.getNotifier();");
                      _builder.newLine();
                      _builder.append("EStructuralFeature feature = (EStructuralFeature)notification.getFeature();");
                      _builder.newLine();
                      _builder.append("Object newvalue = notification.getNewValue();");
                      _builder.newLine();
                      {
                        for(final String addState : addStates) {
                          _builder.append(addState, "");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                      _xblockexpression = (_builder);
                    }
                    return _xblockexpression;
                  }
                };
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function_1);
            }
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(_eNull, "notifyChanged", _newTypeRef, _function_1);
      CollectionExtensions.<JvmOperation>operator_add(_members, _method);
      EObject _eNull_1 = this.eNull();
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(adapterCls);
      final Procedure1<JvmField> _function_2 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            {
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager im) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("new ");
                    String _simpleName = adapterCls.getSimpleName();
                    _builder.append(_simpleName, "");
                    _builder.append("()");
                    return _builder;
                  }
                };
              EveDescJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
              it.setStatic(true);
            }
          }
        };
      JvmField _field = this._jvmTypesBuilder.toField(_eNull_1, "INSTANCE", _createTypeRef, _function_2);
      final JvmField instance = _field;
      this._jvmVisibilityExtension.makePublic(instance);
      EList<JvmMember> _members_1 = adapterCls.getMembers();
      CollectionExtensions.<JvmField>operator_add(_members_1, instance);
      _xblockexpression = (adapterCls);
    }
    return _xblockexpression;
  }
  
  public void infer(final EObject apiRoot, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    if (apiRoot instanceof API) {
      _infer((API)apiRoot, acceptor, isPrelinkingPhase);
    } else if (apiRoot instanceof EventSeq) {
      _infer((EventSeq)apiRoot, acceptor, isPrelinkingPhase);
    } else if (apiRoot != null) {
      _infer(apiRoot, acceptor, isPrelinkingPhase);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(apiRoot, acceptor, isPrelinkingPhase).toString());
    }
  }
}
