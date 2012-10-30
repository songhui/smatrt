package ie.tcd.everm.evedsl.jvmmodel


import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.XbaseFactory
import ie.tcd.everm.evedsl.eveDesc.TextParser

class TextInterpreterPreProcessor {
	String IVAR_PREFIX = "text_var_"
	def public preprocess(TextParser interpreter){
		var int index = 0
		for(value : interpreter.value){
			val name = IVAR_PREFIX + index
			if(!interpreter.ivar.exists(e | (e as XVariableDeclaration).name == name)){
				val xvd = XbaseFactory::eINSTANCE.createXVariableDeclaration()
				xvd.writeable = true;
				xvd.name = name;
				xvd.type
			}
			index = index + 1
		}
	}
}
