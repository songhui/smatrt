package ie.tcd.everm.evedsl

import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext
import org.eclipse.xtext.scoping.Scopes
import ie.tcd.everm.evedsl.eveDesc.Event
import org.eclipse.xtext.xbase.XVariableDeclaration
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.XExpression
import ie.tcd.everm.evedsl.eveDesc.VarValue
import ie.tcd.everm.evedsl.eveDesc.TextParser

class EveDescScopeProvider extends XbaseScopeProvider {
	
    override protected createLocalVarScope(IScope parentScope,
            LocalVariableScopeContext scopeContext) {
        val context = scopeContext.getContext()
        if(context instanceof Event
        ){
        	val event = context as Event
        	val varscopes = new ArrayList<XExpression>();
        	varscopes += event.decScope.map(e|e.getVar())
        	varscopes += event.parser.ivar
        	
        	if(event.parser instanceof TextParser){
        		varscopes += (event.parser as TextParser).value.
        						filter(e | e instanceof VarValue).map(e|(e as VarValue).variable);
        	}
        	
        	return Scopes::scopeFor(varscopes)
        }
        return super.createLocalVarScope(parentScope,scopeContext)    	
    }
}

