package nl.sytematic.projects.rest.codegenerator.java;

import nl.sytematic.projects.REST.REST.Parameter;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ParameterGenerator {
  public CharSequence generate(final Parameter it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _expression = it.getExpression();
    String _string = _expression.toString();
    _builder.append(_string, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
