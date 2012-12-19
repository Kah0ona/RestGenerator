package nl.sytematic.projects.rest.codegenerator.java;

import nl.sytematic.projects.REST.REST.JavaScript;
import nl.sytematic.projects.rest.codegenerator.java.LanguageGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JavaScriptGenerator extends LanguageGenerator {
  public CharSequence generate(final JavaScript it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = it.getName();
    _builder.append(_name, "");
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
