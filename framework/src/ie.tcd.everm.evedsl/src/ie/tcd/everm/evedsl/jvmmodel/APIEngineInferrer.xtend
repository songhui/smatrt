package ie.tcd.everm.evedsl.jvmmodel


import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import ie.tcd.everm.evedsl.eveDesc.EventSeq
import ie.tcd.everm.evedsl.eveDesc.Event
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.XVariableDeclaration
import java.util.ArrayList
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.JvmVisibilityExtension
import org.eclipse.xtext.common.types.util.TypeReferences
import ie.tcd.everm.evedsl.eveDesc.TextParser
import ie.tcd.everm.evedsl.eveDesc.Parser
import org.eclipse.emf.ecore.EObject
import java.util.Collection
import ie.tcd.everm.evedsl.eveDesc.IgnoreValue
import ie.tcd.everm.evedsl.eveDesc.ConstantText
import ie.tcd.everm.evedsl.eveDesc.VarValue
import java.util.List
import ie.tcd.everm.runtime.event.AbstractEvent
import java.util.Map
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.eclipse.xtext.xbase.XAssignment
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.xbase.XMemberFeatureCall
import ie.tcd.everm.evedsl.eveDesc.TextFormatter
import ie.tcd.everm.evedsl.eveDesc.SplitFormatter
import ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter
import org.eclipse.xtext.common.types.JvmGenericType
import ie.tcd.everm.evedsl.eveDesc.API
import ie.tcd.everm.evedsl.eveDesc.Invocation
import com.google.inject.internal.Initializer$InjectableReference
import org.eclipse.emf.ecore.EStructuralFeature
import ie.tcd.everm.evedsl.eveDesc.OperationPointCut
import ie.tcd.everm.evedsl.eveDesc.OperationType
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Aspect
import java.util.Collection
import sun.net.www.protocol.mailto.MailToURLConnection
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator

class APIEngineInferrer {
	
	String GET_SCOPE = "getScope_"
	String CAL_VAR = "calcuVariables"
	String INNER_EXECUTE = "_execute"
	String PARSER_PARSE = "parse"
	String EVENT_INIT = "init"
	String POST_CONDITION = "postcondition"
	String INFORCE_PRE = "enforcePre"
	String EXT_EXECUTE = "execute"
	String CHK_PRE = "checkPre"
	public static String OPMETHOD_PREFIX="_operation_"
	
	public static String ROOT_FIELD = "apiRoot"

    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@com.google.inject.Inject extension JvmTypesBuilder
	@Inject extension TypeReferences
	@Inject extension IQualifiedNameProvider
	@Inject extension EveModelExtension
	@Inject extension JvmVisibilityExtension
	@Inject extension XbaseCompiler
	
	
	def JvmGenericType inferAPIEngine(Invocation elem, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase, JvmGenericType mainCls){
		val cls = elem.toClass(elem.eContainer.fullyQualifiedName.skipLast(1).append(elem.name))[
			abstract = false
   			documentation = elem.documentation
   			for(v : elem.variable){
   				members += v.toField(v.name, v.type)[
   					if(v.type.isInstanceOf(typeof(Object)))
   						Initializer = [ImportManager im | "null"]
   				]
   			}
   			annotations += elem.toAnnotation(typeof(Aspect))
		]
		acceptor.accept(cls)
		
		val rootField = eNull.toField(ROOT_FIELD, mainCls.createTypeRef())
		rootField.makePublic
		cls.members += rootField
		
		//acceptor.
		
		/* The operation methods tarts here */
		for(op : elem.operation){	
			val elemType = if(op.elemType==null) op.newTypeRef(typeof(EObject)) else op.elemType	
			val valType = 
					if(op.feature==null || op.elemType == null) 
						op.newTypeRef(typeof(Object)) 
					else{
						//TODO: get the real type: op.elemType.type
						op.newTypeRef(typeof(Object)) 
					}	
			val opMethod = op.toMethod(op.methodName, op.newTypeRef(typeof(boolean)))[
				parameters += eNull.toParameter("element", elemType)
				parameters += eNull.toParameter("feature", op.newTypeRef(typeof(EStructuralFeature)))
				parameters += eNull.toParameter("value", valType)
				body =[ImportManager im |
					val appendable = new StringBuilderBasedAppendable(im)
					appendable.declareVariable(cls,"this")					
					op.pre.toJavaStatement(appendable,true)
					
					val invokeStates = new ArrayList<String>();
					if(elem.retType == null || elem.postpara == null){
						invokeStates += '''invoke();'''.toString
						invokeStates += '''postcondition();'''.toString
					}
					else{
						invokeStates += '''«elem.retType.simpleName» result = invoke();'''.toString
						if(elem.retType == elem.postpara.parameterType)
							invokeStates += '''postcondition(result);'''.toString
						else if(elem.postpara.parameterType.isInstanceOf(typeof(java.util.List))){
							val tempType = elem.retType.getArgument(0).simpleName
							val postTempType = elem.postpara.parameterType.getArgument(0).simpleName
							invokeStates += '''
								List<«postTempType»> res = new java.util.ArrayList<«postTempType»>();
								for(Object r : result){
									res.add(«ROOT_FIELD».create«postTempType»((«tempType»)r));
								}
								postcondition(res);
							'''.toString
						}
					}
					val resultName = appendable.getName(op.pre)
					'''
					try{
						«appendable»
						if(!«if(resultName.nullOrEmpty) "true" else resultName»)
							return false;
						if(!precondition())
							return false;
						«FOR invokeState : invokeStates» 
						«invokeState»
						«ENDFOR»
						return true;
					}
					catch(Exception e){
						e.printStackTrace();
						return false;
					}
					'''
				]
			]
			cls.members += opMethod			
			
			val opListenMethod = eNull.toMethod("_listen_"+op.methodName, op.newTypeRef(Void::TYPE))[
				
				switch(op.opType){
				case OperationType::GET : {
					parameters += eNull.toParameter("elem", elemType)
					parameters += eNull.toParameter("feature", op.newTypeRef(typeof(EStructuralFeature)))
					val annoString = '''call(* *.eGet(EStructuralFeature,boolean)) && target(elem) &&  args(feature,*) && (!cflow(call(* «elem.fullyQualifiedName.skipLast(2)».*.«OPMETHOD_PREFIX»*(*,*,*))))'''.toString
					val anno = op.toAnnotation("org.aspectj.lang.annotation.Before",annoString)
					//val Before before = Before::
					annotations += anno
					body =[ '''
						if(elem.eResource()==null)
							return;
						«ROOT_FIELD» = «mainCls.simpleName».«EveDescJvmModelInferrer::RESOLVE_INS»(elem.eResource());
						«op.methodName»(elem, feature, null);
						
					''']
				}
				case OperationType::SET :{
					parameters += eNull.toParameter("elem", elemType)
					parameters += eNull.toParameter("feature", op.newTypeRef(typeof(EStructuralFeature)))
					parameters += eNull.toParameter("value",op.newTypeRef(typeof(Object)))
					val annoString = '''execution(* *.eSet(EStructuralFeature,Object)) && target(elem) &&  args(feature,value) && (!cflow(call(* «elem.fullyQualifiedName.skipLast(2)».*.«OPMETHOD_PREFIX»*(*,*,*))))'''.toString
					annotations += op.toAnnotation("org.aspectj.lang.annotation.Before", annoString)
					body = ['''
						if(elem.eResource()==null)
							return;
						«ROOT_FIELD» = «mainCls.simpleName».«EveDescJvmModelInferrer::RESOLVE_INS»(elem.eResource());
						«op.methodName»(elem, feature, value);						
					''']
				}
				}
				
				
			]
			cls.members += opListenMethod
			
		}
		
		cls.members += eNull.toMethod("precondition", elem.newTypeRef(typeof(boolean)))[
			body = elem.pre
		]
		
	
		cls.members += eNull.toMethod("postcondition", elem.newTypeRef(Void::TYPE))[
			if(elem.postpara !=null)
				parameters += elem.postpara.toParameter(elem.postpara.name, elem.postpara.parameterType)
			body = elem.post
		]
		
		val invkRetType = if(elem.retType==null) elem.newTypeRef(Void::TYPE) else elem.retType
		cls.members += eNull.toMethod("invoke", invkRetType)[
			exceptions += elem.newTypeRef(typeof(Exception))
			body = elem.invoke
		]
		
		cls
	}
	
	
	def getMethodName(OperationPointCut op) {
		'''«OPMETHOD_PREFIX»«op.opType.name»_«if(op.elemType==null) "Any" else op.elemType.simpleName»_«if(op.feature.nullOrEmpty)"Any" else op.feature»'''.toString
	}
	
	def EObject eNull(){
		null
	}
	
	
	
}