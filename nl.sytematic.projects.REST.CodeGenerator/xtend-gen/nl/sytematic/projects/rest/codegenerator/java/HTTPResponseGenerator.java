package nl.sytematic.projects.rest.codegenerator.java;

import nl.sytematic.projects.REST.REST.HTTPResponse;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class HTTPResponseGenerator {
  public CharSequence generate(final HTTPResponse it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _expression = it.getExpression();
    String _string = _expression.toString();
    _builder.append(_string, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
