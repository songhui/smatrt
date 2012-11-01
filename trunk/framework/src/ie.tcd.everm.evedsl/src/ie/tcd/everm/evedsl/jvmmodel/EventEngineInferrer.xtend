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
import ie.tcd.everm.evedsl.eveDesc.WordFormatter

class EventEngineInferrer {
	
	String GET_SCOPE = "getScope_"
	String CAL_VAR = "calcuVariables"
	String INNER_EXECUTE = "_execute"
	String PARSER_PARSE = "parse"
	String EVENT_INIT = "init"
	String POST_CONDITION = "postcondition"
	String INFORCE_PRE = "enforcePre"
	String EXT_EXECUTE = "execute"
	String CHK_PRE = "checkPre"

    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject extension TypeReferences
	@Inject extension IQualifiedNameProvider
	@Inject extension EveModelExtension
	@Inject extension JvmVisibilityExtension
	@Inject extension XbaseCompiler
	
	def JvmGenericType inferEventEngine(Event elem, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase){
		val mapSE = elem.newTypeRef(typeof(Map), elem.newTypeRef(typeof(String)), elem.newTypeRef(typeof(EObject))) //Map<String,EObject>
   			
   		val cls = elem.toClass(elem.eContainer.fullyQualifiedName.skipLast(1).append(elem.name))[
   			abstract = false
   			documentation = elem.documentation
   			superTypes += elem.newTypeRef(typeof(AbstractEvent))
   			members += eNull.toField("context", mapSE)[initializer = [ImportManager i | ''' null''']]
   		]
   		acceptor.accept(cls)
   		
   		val allvars = new ArrayList<XVariableDeclaration>()
   		allvars += elem.decScope.map(e | e.^var)
   		val scope_init = new ArrayList<String>()
   		for(v : allvars){
   			val simpleName = v.type.simpleName
   			cls.members += v.defaultField
   		}
   		
   		/*-----field: parser-------*/
   		val intpElem = elem.parser
   		val intpCls = intpElem.inferParser
   		acceptor.accept(intpCls)
   		cls.members += intpElem.toField("parser",intpCls.createTypeRef())[ 
   			initializer = [ImportManager i | "new "+ intpCls.simpleName +"()"]
   		]
   		
   		/*--------init-------------*/
   		
   		cls.members += eNull.toMethod("init",elem.newTypeRef(Void::TYPE))[
   			parameters += eNull.toParameter("context",mapSE)
   			body = ['''
   				this.context = context;
   				«FOR v:allvars»
   					this.«v.name» = null;
   					for(String key : context.keySet())
   						if("«v.name»".equals(key))
   							this.«v.name» = («v.type.simpleName»)context.get("«v.name»");
   					
   				«ENDFOR»
   			''']
   		]
   		
   		/*-----method: getScope_*--------- */
   		for(decScope : elem.decScope.filter(e | e.scope != null)){
   			val scope = decScope.scope
   			val typeListVar = scope.newTypeRef(typeof(List), decScope.^var.type)
   			cls.members += scope.toMethod(GET_SCOPE + decScope.^var.simpleName, typeListVar)[
   				body = scope.expr
   			]	   			
   		}
   		
   		/* ----method: calculateVariables ----- */
   		val methodCalVar = eNull.toMethod(CAL_VAR,cls.newTypeRef(typeof(boolean)))[
   			body = [ImportManager im |
   				//Calculte pre-conditions
   				val preConStates = new ArrayList<String>()
   				for(pre : elem.pre){
   					val appendable = new StringBuilderBasedAppendable(im)
   					appendable.declareVariable(cls,"this")
   					preConStates += switch pre{	   						
   						XAssignment case pre.assignable instanceof XFeatureCall:{ /* if compare based on some features */
   							val assignable = pre.assignable as XFeatureCall
   							val field = assignable.feature as JvmField
   							val fn = field.simpleName
   							val ftn = field.type.simpleName
							'''
   								if(«fn»==null){
   									List<«ftn»> scp_«field.simpleName» = «GET_SCOPE»«fn»();
   									for(«ftn» it : scp_«fn»){
   										«pre.value.toJavaStatement(appendable,true)»
   										«appendable»
   										«var toappear = appendable.getName(pre.value)»
   										«if(toappear.nullOrEmpty){pre.value.toJavaExpression(appendable); toappear=appendable.toString; ""}»
   										if(it.get«pre.feature.simpleName.substring(3)»().equals(«toappear»)){
   											«fn» = it;
   											break;
   										}  
   									}
   								}
   							'''
   						}
	   					XAssignment :{ /* if directly compare the element */
	   						val fn = pre.feature.simpleName
   							'''
   								if(«fn»==null){
   									«pre.toJavaStatement(appendable,true)»
   									«appendable»
   								}
   							'''	   							
   						}
  						XExpression:{
  							pre.toJavaStatement(appendable, true)
  							val resName = appendable.getName(pre)
  							val resState = appendable.toString
  							if(resState.substring(0,resState.indexOf(resName)).trim().endsWith("boolean"))
	  							'''
	  								«appendable»
	  								if(!«appendable.getName(pre)»)
	  									return false;
	  							'''
	  						else
	  							""
  						}
   						default:
   							""
   					}.toString
   				}
   				
   				//enforce the non-existing objects
   				val enforceStates = new ArrayList<String>()
   				val toEnforceList = elem.decScope.filter(e | e.scope!=null && e.scope.enforce)
   				for( toEnforce : toEnforceList){
   					val varName = toEnforce.^var.simpleName
   					val typeName = 
   						if(toEnforce.scope.realtype==null)
   							toEnforce.^var.type.simpleName
   						else{
   							im.addImportFor(toEnforce.scope.realtype.type)
   							toEnforce.scope.realtype.simpleName
   						}   							   					
   						
   					val parentName = (toEnforce.scope.expr as XMemberFeatureCall).memberCallTarget
   					val memberNameGet = (toEnforce.scope.expr as XMemberFeatureCall).feature.simpleName
   					val involvedPre = elem.pre.filter(e|
   						(e instanceof XAssignment) && 
   						((e as XAssignment).assignable as XFeatureCall).feature.simpleName == varName
   					)
   					
   					val appendable = new StringBuilderBasedAppendable(im)
   					appendable.declareVariable(cls,"this")
   					
   					enforceStates += 
   					'''
   						if(«varName» == null && «parentName» != null){
   							org.eclipse.emf.ecore.EPackage pkg = «parentName».eClass().getEPackage();
   							«varName» = («typeName»)pkg.getEFactoryInstance().create((org.eclipse.emf.ecore.EClass)pkg.getEClassifier("«typeName»"));
   							«parentName».«memberNameGet»().add(«varName»);
   							«FOR p : involvedPre»
   								«p.toJavaStatement(appendable,true)»
   								«appendable»
   							«ENDFOR»
   						}
					'''.toString
   				}
   				
   				'''
   					for(int i=0; i<«elem.decScope.size»; i++){
   						«FOR states : preConStates.filter(e|! e.nullOrEmpty)»
	   						try{
	   							«states»
	   						}
	   						catch(NullPointerException e){ }
   						«ENDFOR»
   					}
   					for(int i=0;i<«enforceStates.size()»;i++){
   						«FOR states: enforceStates»
							try{
								«states»
							}
							catch(NullPointerException e){ }
   						«ENDFOR»
   					}
   					return true;
   				'''
   			]
   		]
   		cls.members += methodCalVar
   		

   		
   		/*-----method: _execute ------------*/
   		
   		val methodInnerExec = eNull.toMethod(INNER_EXECUTE,elem.newTypeRef(typeof(boolean)))[
   			parameters += eNull.toParameter("text", elem.newTypeRef(typeof(String)))
   			body = ['''
   				if(!parser.parse(text))
   					return false;
   				if(!«CAL_VAR»())
   					return false;
   				«POST_CONDITION»();
   				return true;
   			''']
   		]
   		methodInnerExec.makePrivate
   		cls.members += methodInnerExec
   		
   		val methodExtExec = eNull.toMethod(EXT_EXECUTE,elem.newTypeRef(typeof(boolean)))[
   			parameters += eNull.toParameter("event", elem.newTypeRef(typeof(Object)))
   			body = ['''
				return _execute((String)event);
   			''']
   		]
   		methodInnerExec.makePublic
   		cls.members += methodExtExec
   		
   		
   		
   		/*-----method:postcondition -------*/
   		val postElem = elem.post
   		val methodPost = postElem.toMethod(POST_CONDITION, postElem.newTypeRef(Void::TYPE))[ 
   			body = postElem
   		]
   		cls.members += methodPost
   		
   		cls
	}
	
	def dispatch inferParser(Parser parser){
   		null
   	}
   	
   	/**
   	 * Event Parser for Text
   	 */
   	def dispatch inferParser(TextParser parser){
   		val eveElement = parser.eContainer
   		val result = parser.toClass(eveElement.fullyQualifiedName.skipLast(2).append(eveElement.fullyQualifiedName.lastSegment).toString +"Parser")[
	   			abstract = false
	   			for(v : parser.variableDecs){
	   				members += v.defaultField
	   			}
	   			members.forEach(e|e.makePublic)
	   		]
	   		
	   	val matchStats = new ArrayList<String>()
	   	var i = 0;
	   	for(value : parser.value){
	   		val line =
	   		switch value{ 
	   			ConstantText :''' 
	   				if(!text.get(«i»).equals("«value.content»"))  
	   					return false;
	   				'''
	   			VarValue case value.variable.type.is(typeof(String)):
	   				''' this.«value.variable.name» = text.get(«i»); '''
	   			VarValue case value.variable.type.is(typeof(Double)):
	   				''' this.«value.variable.name» = new Double(text.get(«i»)); '''
	   			VarValue case value.variable.type.is(typeof(Integer)):
	   				''' this.«value.variable.name» = new Integer(text.get(«i»)); '''
	   			default:
	   				""
	   		}
	   		matchStats += line.toString
	   		i = i + 1
	   	}
	   	
	   	result.members +=
	   	eNull.toMethod("parse", parser.newTypeRef(typeof(boolean)))[
	   		parameters += eNull.toParameter("stringText", parser.newTypeRef(typeof(String)))
	   		
	   		body = ['''
	   			try{
	   				List<String> text = format(stringText);
	   				«FOR line : matchStats»
	   				«line»
	   				«ENDFOR»
	   				return true;
	   			}catch(Exception e){
	   				System.err.println(e.getMessage());return false;
	   			}
	   		''']
	   	]
	   	
	   	
	   	/*-- method format*/
	   	
	   	result.members +=
	   	parser.formatter.toMethod("format", parser.newTypeRef(typeof(List),parser.newTypeRef(typeof(String))))[
	   		val para = eNull.toParameter("text", parser.newTypeRef(typeof(String)))	
	   		parameters += para   		
	   		if(parser.formatter instanceof UserDefinedFormatter)
	   			body = (parser.formatter as UserDefinedFormatter).expr
	   		else
		   		body = [ ImportManager im |
		   			val formatter = parser.formatter
		   			switch formatter{
		   				SplitFormatter : '''return java.util.Arrays.asList(text.split("«formatter.spliter»"));'''
		   				UserDefinedFormatter : {
		   					val appendable = new StringBuilderBasedAppendable(im)
		   					appendable.declareVariable(para,"text")
		   					formatter.expr.toJavaStatement(appendable,true)
		   					'''
		   						«appendable»
		   						return «appendable.getName(formatter.expr)»;	   						
		   					'''
		   				}
		   				WordFormatter:{
		   					'''
		   					java.util.Scanner scanner = new java.util.Scanner(text);
		   					java.util.ArrayList<String> result = new java.util.ArrayList<String>();
		   					while(scanner.hasNext())
		   						result.add(scanner.next());
		   					return result;
		   					'''
		   				}
		   				default: '''return java.util.Arrays.asList(text.split(","));'''
		   			}
		   		]
	   	]
	   	
	   	
	   	result
   	}
   	
   	
   	
   	
   	def EObject eNull(){
   		null
   	}
   	
	
   	
   	def defaultField(XVariableDeclaration v){
   		v.toField(v.name, v.type)[
	   		initializer = [ImportManager i | "null"]
	   	] 
   	}
}