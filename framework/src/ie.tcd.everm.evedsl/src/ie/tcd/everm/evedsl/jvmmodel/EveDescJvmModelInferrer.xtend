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
import ie.tcd.everm.evedsl.eveDesc.API
import ie.tcd.everm.evedsl.eveDesc.Helper
import ie.tcd.everm.evedsl.eveDesc.Mapping
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.notify.impl.AdapterImpl
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.ecore.EStructuralFeature
import ie.tcd.everm.evedsl.eveDesc.OperationType
import ie.tcd.everm.evedsl.eveDesc.Invocation


/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class EveDescJvmModelInferrer extends AbstractModelInferrer {
	
	
	
	@Inject extension JvmTypesBuilder
	@Inject extension TypeReferences
	@Inject extension IQualifiedNameProvider
	@Inject extension EveModelExtension
	@Inject extension JvmVisibilityExtension
	@Inject extension XbaseCompiler
	 

    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@Inject extension EventEngineInferrer
	@Inject extension APIEngineInferrer


	public static String INS_MAP = "instances"
	public static String RESOLVE_INS = "resolveInstance"
	public static String RES = "resource"
	public static String POOL = "_instPool"
	
	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
   	def dispatch void infer(EventSeq rootElement, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {   	
   		
   		val mainCls = rootElement.toClass(rootElement.fullyQualifiedName)[
   			abstract = false
	   		documentation = rootElement.documentation
   		]
   		acceptor.accept(mainCls)
   		
   		for(helper : rootElement.helper){
   			mainCls.members += helper.inferHelper
   		}
   		
   		for(elem : rootElement.event){
   			val eveCls = elem.inferEventEngine(acceptor,isPrelinkingPhase)   
   			mainCls.members += eNull.toField(eveCls.simpleName.toFirstLower, eveCls.createTypeRef)[
   				initializer =[ImportManager im|'''new «eveCls.simpleName»()'''] 
   			]			   			   		
	   	}
	   	
	   	val mapSE = rootElement.newTypeRef(typeof(Map), rootElement.newTypeRef(typeof(String)), rootElement.newTypeRef(typeof(EObject))) //Map<String,EObject>
	   	mainCls.members += eNull.toMethod("init", rootElement.newTypeRef(Void::TYPE))[
	   		parameters += eNull.toParameter("context",mapSE)
	   		body = ['''
	   			«FOR elem : rootElement.event»
	   				«elem.name.toFirstLower».init(context);
	   			«ENDFOR»
	   		''']
	   	]
	   	
	   	mainCls.members += eNull.toMethod("execute",rootElement.newTypeRef(Void::TYPE))[
   			parameters += eNull.toParameter("event", rootElement.newTypeRef(typeof(Object)))
   			body = ['''
				«FOR elem : rootElement.event»
	   				«elem.name.toFirstLower».execute(event);
	   			«ENDFOR»
   			''']
   		]
   		
   		
   		

   	}
   	
   	
   	def dispatch void infer(API apiRoot, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
   		val mainCls = apiRoot.toClass(apiRoot.fullyQualifiedName)[
   			abstract = false
	   		documentation = apiRoot.documentation
   		]
   		acceptor.accept(mainCls)
   		
   		for(helper : apiRoot.helper)
   			mainCls.members += helper.inferHelper
   			
   		for(mapping : apiRoot.mapping){
   			mainCls.members += mapping.inferNewImage(mainCls)
   			mainCls.members += mapping.inferInitImage
   		}
   		
   		for(elem : apiRoot.invocation){
   			elem.inferAPIEngine(acceptor, isPrelinkingPhase, mainCls)
   		}
   		val resType = apiRoot.newTypeRef(typeof(Resource))
   		val resInsMapType = apiRoot.newTypeRef(
   			typeof(Map), 
   			resType,
   			mainCls.createTypeRef()
   		)  
   		mainCls.members += eNull.toField(INS_MAP, resInsMapType)[
   			initializer = [ImportManager im | ''' new java.util.HashMap<Resource,«mainCls.simpleName»>()''']
   			^static = true
   		]   
   		mainCls.members += eNull.toField(RES,resType)[
   			initializer = [ImportManager im | '''null''']
   		]
   		
   		
   		mainCls.members += eNull.toMethod(RESOLVE_INS, mainCls.createTypeRef())[
   			parameters += eNull.toParameter("resource", resType)
   			^static = true
   			body = ['''
   				«mainCls.simpleName» result = «INS_MAP».get(resource);
   				if(result!=null)
   					return result;
   				result = new «mainCls.simpleName»();
   				result.«RES» = resource;
   				«INS_MAP».put(resource,result);
   				for(Object o:resource.eAdapters())
   					if(o instanceof «apiRoot.name»Adapter)
   						return result;
   				resource.eAdapters().add(«apiRoot.name»Adapter.INSTANCE);
   				return result;
   			''']
   		]
   		
   		mainCls.members += eNull.toField(POOL,apiRoot.newTypeRef(
   			typeof(Map), apiRoot.newTypeRef(typeof(EObject)),apiRoot.newTypeRef(typeof(Object))
   		))[
   			initializer = [ImportManager im| '''new java.util.HashMap<EObject,Object>()''']
   		]
		
		acceptor.accept(apiRoot.inferAdapter)
   	}
   	
   	def EObject eNull(){
   		null
   	}
   	
   	def inferHelper(Helper helper){
   		val mh = helper.toMethod(helper.name, helper.type)[
			for(param : helper.params){
				parameters += param.toParameter(param.name,param.parameterType)
			}
			body = helper.body
		]
		mh.setStatic(true);
		mh
   	}
   	
   	
   	def inferNewImage(Mapping mapping, JvmGenericType mainCls){
   		
   		for(subType : mapping.subType){
			val chkMethodName = "check"+mapping.MType.simpleName+"For"+subType.type.simpleName
			mainCls.members += subType.toMethod(chkMethodName, subType.newTypeRef(typeof(boolean)))[
				parameters += eNull.toParameter("core", mapping.SType)
				body = subType.pre
			]
	   	}
   		eNull.toMethod("create"+mapping.MType.simpleName, mapping.MType)[
   			val para = eNull.toParameter("core", mapping.SType)
   			parameters += para
   			body = [ImportManager im |
   				val subTypeStats = new ArrayList<String>()
   				for(subType : mapping.subType){
   					val chkMethodName = "check"+mapping.MType.simpleName+"For"+subType.type.simpleName
					subTypeStats +='''
						if(«chkMethodName»(core))
							mTypeName = "«subType.type.simpleName»";
					'''.toString
				}
				
   				'''
   					String mTypeName = "«mapping.MType.simpleName»";
   					«FOR subTypeState : subTypeStats»
   					«subTypeState»
   					«ENDFOR»
   					for(EObject obj : «POOL».keySet())
   						if(«POOL».get(obj).equals(core))
   							return («mapping.MType.simpleName»)obj;
   					org.eclipse.emf.ecore.EPackage epackage = «RES».getAllContents().next().eClass().getEPackage();
   					«mapping.MType.simpleName» ins = («mapping.MType.simpleName»)epackage.getEFactoryInstance().create((org.eclipse.emf.ecore.EClass)epackage.getEClassifier(mTypeName));
   					ins.eAdapters().add(«mainCls.simpleName»Adapter.INSTANCE);
   					init«mapping.MType.simpleName»(ins, core);
   					«POOL».put(ins,core);
   					return ins;
   				'''
   			]
   		]
   	}
   	
   	def inferInitImage(Mapping mapping){
   		
   		eNull.toMethod("init"+mapping.MType.simpleName, mapping.newTypeRef(Void::TYPE))[
   			parameters += eNull.toParameter("element", mapping.MType)
   			parameters += eNull.toParameter("core", mapping.SType)
   			body = mapping.newImage
   		]
   	}
   	
   	def inferAdapter(API apiRoot){
   		val adapterCls = apiRoot.toClass(apiRoot.fullyQualifiedName.toString + "Adapter")[
   			abstract = false
	   		documentation = apiRoot.documentation
	   		superTypes += apiRoot.newTypeRef(typeof(AdapterImpl))
   		]
   		adapterCls.members += eNull.toMethod("notifyChanged",apiRoot.newTypeRef(Void::TYPE))[
   			parameters += eNull.toParameter("notification", apiRoot.newTypeRef(typeof(Notification)))
   			val addStates = new ArrayList<String>()
   			for(invk : apiRoot.invocation)
   				for(op : invk.operation.filter(e|e.opType==OperationType::ADD || e.opType==OperationType::REMOVE)){
   					val elemType = if(op.elemType==null) "Object" else op.elemType.type.fullyQualifiedName.toString
   					val invkName = (op.eContainer as Invocation).name
   					addStates += '''
   						if((Notification.«op.opType.name.toUpperCase»==notification.getEventType()) && (notifier instanceof «elemType»)){
   							«apiRoot.name» root = «apiRoot.name».«RESOLVE_INS»(((«elemType»)notifier).eResource());
   							«invkName» invk = new «invkName»();
   							invk.«APIEngineInferrer::ROOT_FIELD» = root;
   							invk.«op.methodName»((«elemType»)notifier,feature,newvalue);
   						}
   					'''.toString
   				}
   			body=[ImportManager im|
   				im.addImportFor(apiRoot.newTypeRef(typeof(EObject)).type)
   				im.addImportFor(apiRoot.newTypeRef(typeof(EStructuralFeature)).type)
   				
   				//im.addImportFor(typeof
   				'''
   					StackTraceElement[] st = Thread.currentThread().getStackTrace();
   					for(int i=0; i<st.length; i++){
   						if(st[i].getMethodName().startsWith("«APIEngineInferrer::OPMETHOD_PREFIX»"))
   							return;
   					}
   					Object notifier = notification.getNotifier();
   					EStructuralFeature feature = (EStructuralFeature)notification.getFeature();
   					Object newvalue = notification.getNewValue();
   					«FOR addState : addStates»
   					«addState»
   					«ENDFOR»
   				'''
   			]
   		]
   		val instance = eNull.toField("INSTANCE",adapterCls.createTypeRef)[
   			initializer = [ImportManager im|'''new «adapterCls.simpleName»()''']
   			^static = true
   		]
   		instance.makePublic
   		adapterCls.members+=instance
   		adapterCls
   	}
   	
}





/*================Some dead code here ==================== */
				//cls.members += v.toField(v.name+"_scope",v.newTypeRef(typeof(List),v.type))[
	   			//	initializer = [ImportManager i | '''new ArrayList<«simpleName»>()''']
	   			//]
	   			//scope_init += ''' «simpleName»_scope.addAll() '''.toString
	   			
	   			
//	   			«fn» = it;
//	   										«(pre.feature as JvmOperation).parameters.get(0).parameterType.simpleName» original = «fn».get«pre.feature.simpleName.substring(3)»();	
//	   										«pre.toJavaStatement(appendable,true)»
//	   										«appendable» 
//	   										if(original.equals(it.get«pre.feature.simpleName.substring(3)»())){
//	   											found = true;
//	   											break;
//	   										}
//	   										«fn».«pre.feature.simpleName»(original);
//	   			)