package ie.tcd.everm.evedsl;

import ie.tcd.everm.evedsl.eveDesc.AbstractTextValue;
import ie.tcd.everm.evedsl.eveDesc.DecScope;
import ie.tcd.everm.evedsl.eveDesc.Event;
import ie.tcd.everm.evedsl.eveDesc.Parser;
import ie.tcd.everm.evedsl.eveDesc.TextParser;
import ie.tcd.everm.evedsl.eveDesc.VarValue;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

@SuppressWarnings("all")
public class EveDescScopeProvider extends XbaseScopeProvider {
  protected IScope createLocalVarScope(final IScope parentScope, final LocalVariableScopeContext scopeContext) {
      EObject _context = scopeContext.getContext();
      final EObject context = _context;
      if ((context instanceof Event)) {
        {
          final Event event = ((Event) context);
          ArrayList<XExpression> _arrayList = new ArrayList<XExpression>();
          final ArrayList<XExpression> varscopes = _arrayList;
          EList<DecScope> _decScope = event.getDecScope();
          final Function1<DecScope,XVariableDeclaration> _function = new Function1<DecScope,XVariableDeclaration>() {
              public XVariableDeclaration apply(final DecScope e) {
                XVariableDeclaration _var = e.getVar();
                return _var;
              }
            };
          List<XVariableDeclaration> _map = ListExtensions.<DecScope, XVariableDeclaration>map(_decScope, _function);
          CollectionExtensions.<XExpression>operator_add(varscopes, _map);
          Parser _parser = event.getParser();
          EList<XExpression> _ivar = _parser.getIvar();
          CollectionExtensions.<XExpression>operator_add(varscopes, _ivar);
          Parser _parser_1 = event.getParser();
          if ((_parser_1 instanceof TextParser)) {
            Parser _parser_2 = event.getParser();
            EList<AbstractTextValue> _value = ((TextParser) _parser_2).getValue();
            final Function1<AbstractTextValue,Boolean> _function_1 = new Function1<AbstractTextValue,Boolean>() {
                public Boolean apply(final AbstractTextValue e) {
                  return Boolean.valueOf((e instanceof VarValue));
                }
              };
            Iterable<AbstractTextValue> _filter = IterableExtensions.<AbstractTextValue>filter(_value, _function_1);
            final Function1<AbstractTextValue,XVariableDeclaration> _function_2 = new Function1<AbstractTextValue,XVariableDeclaration>() {
                public XVariableDeclaration apply(final AbstractTextValue e) {
                  XVariableDeclaration _variable = ((VarValue) e).getVariable();
                  return _variable;
                }
              };
            Iterable<XVariableDeclaration> _map_1 = IterableExtensions.<AbstractTextValue, XVariableDeclaration>map(_filter, _function_2);
            CollectionExtensions.<XExpression>operator_add(varscopes, _map_1);
          }
          IScope _scopeFor = Scopes.scopeFor(varscopes);
          return _scopeFor;
        }
      }
      IScope _createLocalVarScope = super.createLocalVarScope(parentScope, scopeContext);
      return _createLocalVarScope;
  }
}
