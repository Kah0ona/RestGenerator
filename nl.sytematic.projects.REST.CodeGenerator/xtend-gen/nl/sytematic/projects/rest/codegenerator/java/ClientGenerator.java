package nl.sytematic.projects.rest.codegenerator.java;

import nl.sytematic.projects.REST.REST.Client;
import nl.sytematic.projects.rest.codegenerator.java.RESTServiceGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ClientGenerator extends RESTServiceGenerator {
  public CharSequence generate(final Client it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(" {   ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
