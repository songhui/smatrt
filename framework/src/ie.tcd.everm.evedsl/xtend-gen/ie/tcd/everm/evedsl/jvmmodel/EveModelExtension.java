package ie.tcd.everm.evedsl.jvmmodel;

import ie.tcd.everm.evedsl.eveDesc.AbstractTextValue;
import ie.tcd.everm.evedsl.eveDesc.Parser;
import ie.tcd.everm.evedsl.eveDesc.PlainParser;
import ie.tcd.everm.evedsl.eveDesc.TextParser;
import ie.tcd.everm.evedsl.eveDesc.VarValue;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EveModelExtension {
  protected Iterable<XVariableDeclaration> _getVariableDecs(final TextParser intp) {
    EList<AbstractTextValue> _value = intp.getValue();
    final Function1<AbstractTextValue,Boolean> _function = new Function1<AbstractTextValue,Boolean>() {
        public Boolean apply(final AbstractTextValue e) {
          return Boolean.valueOf((e instanceof VarValue));
        }
      };
    Iterable<AbstractTextValue> _filter = IterableExtensions.<AbstractTextValue>filter(_value, _function);
    final Function1<AbstractTextValue,XVariableDeclaration> _function_1 = new Function1<AbstractTextValue,XVariableDeclaration>() {
        public XVariableDeclaration apply(final AbstractTextValue e) {
          XVariableDeclaration _variable = ((VarValue) e).getVariable();
          return _variable;
        }
      };
    Iterable<XVariableDeclaration> _map = IterableExtensions.<AbstractTextValue, XVariableDeclaration>map(_filter, _function_1);
    return _map;
  }
  
  protected Iterable<XVariableDeclaration> _getVariableDecs(final PlainParser intp) {
    EList<XExpression> _ivar = intp.getIvar();
    final Function1<XExpression,Boolean> _function = new Function1<XExpression,Boolean>() {
        public Boolean apply(final XExpression e) {
          return Boolean.valueOf((e instanceof XVariableDeclaration));
        }
      };
    Iterable<XExpression> _filter = IterableExtensions.<XExpression>filter(_ivar, _function);
    final Function1<XExpression,XVariableDeclaration> _function_1 = new Function1<XExpression,XVariableDeclaration>() {
        public XVariableDeclaration apply(final XExpression e) {
          return ((XVariableDeclaration) e);
        }
      };
    Iterable<XVariableDeclaration> _map = IterableExtensions.<XExpression, XVariableDeclaration>map(_filter, _function_1);
    return _map;
  }
  
  public Iterable<XVariableDeclaration> getVariableDecs(final Parser intp) {
    if (intp instanceof PlainParser) {
      return _getVariableDecs((PlainParser)intp);
    } else if (intp instanceof TextParser) {
      return _getVariableDecs((TextParser)intp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(intp).toString());
    }
  }
}
