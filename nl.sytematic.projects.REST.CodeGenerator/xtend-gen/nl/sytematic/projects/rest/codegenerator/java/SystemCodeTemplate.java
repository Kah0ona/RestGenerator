package nl.sytematic.projects.rest.codegenerator.java;

import nl.sytematic.projects.rest.codegenerator.GenericCodeTemplate;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SystemCodeTemplate extends GenericCodeTemplate {
  public CharSequence generate(final nl.sytematic.projects.REST.REST.System it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
