package ie.tcd.everm.evedsl.jvmmodel;

import ie.tcd.everm.evedsl.eveDesc.AbstractTextValue;
import ie.tcd.everm.evedsl.eveDesc.TextParser;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class TextInterpreterPreProcessor {
  private String IVAR_PREFIX = "text_var_";
  
  public void preprocess(final TextParser interpreter) {
      int index = 0;
      EList<AbstractTextValue> _value = interpreter.getValue();
      for (final AbstractTextValue value : _value) {
        {
          String _operator_plus = StringExtensions.operator_plus(this.IVAR_PREFIX, Integer.valueOf(index));
          final String name = _operator_plus;
          EList<XExpression> _ivar = interpreter.getIvar();
          final Function1<XExpression,Boolean> _function = new Function1<XExpression,Boolean>() {
              public Boolean apply(final XExpression e) {
                String _name = ((XVariableDeclaration) e).getName();
                boolean _operator_equals = ObjectExtensions.operator_equals(_name, name);
                return Boolean.valueOf(_operator_equals);
              }
            };
          boolean _exists = IterableExtensions.<XExpression>exists(_ivar, _function);
          boolean _operator_not = BooleanExtensions.operator_not(_exists);
          if (_operator_not) {
            {
              XVariableDeclaration _createXVariableDeclaration = XbaseFactory.eINSTANCE.createXVariableDeclaration();
              final XVariableDeclaration xvd = _createXVariableDeclaration;
              xvd.setWriteable(true);
              xvd.setName(name);
              xvd.getType();
            }
          }
          int _operator_plus_1 = IntegerExtensions.operator_plus(index, 1);
          index = _operator_plus_1;
        }
      }
  }
}
