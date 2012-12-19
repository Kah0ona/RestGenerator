package nl.sytematic.projects.rest.codegenerator.java;

import nl.sytematic.projects.REST.REST.CreateMethod;
import nl.sytematic.projects.rest.codegenerator.java.MethodGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CreateMethodGenerator extends MethodGenerator {
  public CharSequence generate(final CreateMethod it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@PUT  ");
    _builder.newLine();
    _builder.append("@Consumes(MediaType.APPLICATION_XML)");
    _builder.newLine();
    _builder.append("public void ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
