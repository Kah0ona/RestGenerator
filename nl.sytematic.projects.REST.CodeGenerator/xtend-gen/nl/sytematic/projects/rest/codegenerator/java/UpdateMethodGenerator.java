package nl.sytematic.projects.rest.codegenerator.java;

import nl.sytematic.projects.REST.REST.UpdateMethod;
import nl.sytematic.projects.rest.codegenerator.java.MethodGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class UpdateMethodGenerator extends MethodGenerator {
  public CharSequence generate(final UpdateMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@POST  ");
    _builder.newLine();
    _builder.append("public void  ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
