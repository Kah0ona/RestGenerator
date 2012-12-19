package nl.sytematic.projects.rest.codegenerator.java;

import java.util.Arrays;
import nl.sytematic.projects.REST.REST.ReadMethod;
import nl.sytematic.projects.rest.codegenerator.java.MethodGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ReadMethodGenerator extends MethodGenerator {
  public CharSequence generate(final ReadMethod it, final Resource resource) throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@GET");
    _builder.newLine();
    _builder.append("@Produces(MediaType.TEXT_PLAIN)");
    _builder.newLine();
    _builder.append("public String ");
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("String result; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("result = \" Hello guys! I am ");
    String _name_1 = it.getName();
    _builder.append(_name_1, "	");
    _builder.append(" RESTService From Sytematic Software  \\n\" + ");
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _contents = resource.getContents();
      for(final EObject firstLoop : _contents) {
        {
          EList<EObject> _eContents = firstLoop.eContents();
          for(final EObject secondLoop : _eContents) {
            {
              EList<EObject> _eContents_1 = secondLoop.eContents();
              for(final EObject thirdLoop : _eContents_1) {
                _builder.append("\t");
                CharSequence _generateContent = this.generateContent(thirdLoop);
                _builder.append(_generateContent, "	");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t\t\t");
      }
    }
    _builder.append(" \" \";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return result; ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateContent(final EObject it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generateContent(final EPackage it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generateContent(final EClassifier it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generateContent(final EAnnotation it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generateContent(final EAttribute it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = it.getName();
    String _plus = (_name + " attribute with content ");
    String _defaultValueLiteral = it.getDefaultValueLiteral();
    String _plus_1 = (_plus + _defaultValueLiteral);
    _builder.append(_plus_1, "");
    _builder.append("\\n\" +");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateContent(final EClass it) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = it.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateContent(final EObject it) {
    if (it instanceof EAttribute) {
      return _generateContent((EAttribute)it);
    } else if (it instanceof EClass) {
      return _generateContent((EClass)it);
    } else if (it instanceof EClassifier) {
      return _generateContent((EClassifier)it);
    } else if (it instanceof EPackage) {
      return _generateContent((EPackage)it);
    } else if (it instanceof EAnnotation) {
      return _generateContent((EAnnotation)it);
    } else if (it != null) {
      return _generateContent(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
