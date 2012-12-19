package nl.sytematic.projects.rest.codegenerator.java;

import nl.sytematic.projects.REST.REST.XMLMediaType;
import nl.sytematic.projects.rest.codegenerator.java.MediaTypeGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XMLMediaTypeGenerator extends MediaTypeGenerator {
  public CharSequence generate(final XMLMediaType it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Produces(MediaType.XML)");
    _builder.newLine();
    return _builder;
  }
}
