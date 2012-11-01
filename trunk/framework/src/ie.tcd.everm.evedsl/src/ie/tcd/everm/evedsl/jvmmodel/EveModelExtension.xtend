package ie.tcd.everm.evedsl.jvmmodel

import ie.tcd.everm.evedsl.eveDesc.VarValue
import org.eclipse.xtext.xbase.XVariableDeclaration
import ie.tcd.everm.evedsl.eveDesc.TextParser
import ie.tcd.everm.evedsl.eveDesc.PlainParser

class EveModelExtension {
	def dispatch getVariableDecs(TextParser intp){
		intp.value.filter(e | e instanceof VarValue).map(e | (e as VarValue).variable)		
	}
	
	def dispatch getVariableDecs(PlainParser intp){
		intp.ivar.filter(e | e instanceof XVariableDeclaration).map(e | e as XVariableDeclaration)
	}
}

