package nl.sytematic.projects.rest.codegenerator.java;

import nl.sytematic.projects.REST.REST.MySql;
import nl.sytematic.projects.rest.codegenerator.java.DatabaseGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class MySqlGenerator extends DatabaseGenerator {
  public CharSequence generate(final MySql it) {
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
