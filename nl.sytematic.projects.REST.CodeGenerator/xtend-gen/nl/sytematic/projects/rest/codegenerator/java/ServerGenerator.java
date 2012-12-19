package nl.sytematic.projects.rest.codegenerator.java;

import nl.sytematic.projects.REST.REST.Resource;
import nl.sytematic.projects.REST.REST.Server;
import nl.sytematic.projects.rest.codegenerator.java.RESTServiceGenerator;
import nl.sytematic.projects.rest.codegenerator.java.ResourceGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ServerGenerator extends RESTServiceGenerator {
  public CharSequence generate(final Server it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("//your package here;");
    _builder.newLine();
    _builder.append("package nl.sytematic.projects.REST.RESTServiceExample;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.servlet.http.HttpServletResponse;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.PUT;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.GET;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.POST;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.DELETE;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.Path;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.Consumes;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.FormParam;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.PathParam;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.Produces;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.core.Context;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.core.MediaType;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.core.Request;");
    _builder.newLine();
    _builder.append("import javax.ws.rs.core.Response;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Path(\"");
    String _baseURI = it.getBaseURI();
    _builder.append(_baseURI, "");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Resource> _resources = it.getResources();
      for(final Resource resource : _resources) {
        ResourceGenerator _resourceGenerator = new ResourceGenerator();
        CharSequence _generate = _resourceGenerator.generate(resource);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
