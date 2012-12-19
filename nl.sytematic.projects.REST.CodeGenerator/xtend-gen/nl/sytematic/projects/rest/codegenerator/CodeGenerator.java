package nl.sytematic.projects.rest.codegenerator;

import java.util.Map;
import nl.sytematic.projects.REST.REST.RESTPackage;
import nl.sytematic.projects.rest.codegenerator.java.SystemCodeTemplate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class CodeGenerator {
  /**
   * The resource handle for the domain model (input ecore file)
   */
  private Resource domainResource;
  
  /**
   * The resource handle for the REST model
   */
  private Resource restResource;
  
  private String filePath2 = "C:/Users/Tesfay/Desktop/Internship/WorkSpace/nl.sytematic.projects.REST.RESTServiceExample/src/nl/sytematic/projects/REST/RESTServiceExample/";
  
  private String filePath = "src-gen/nl/sytematic/projects/REST/CodeGenerator/";
  
  public static void main(final String[] args) {
    CodeGenerator _codeGenerator = new CodeGenerator();
    _codeGenerator.generate("sample-RESTmodel.xmi", "BussinesPlan.ecore");
  }
  
  public Resource getDomainModel() {
    return this.domainResource;
  }
  
  public void generate(final String restModelPath, final String domainModelPath) {
    this.doEMFSetup();
    this.loadRestResource(restModelPath);
    this.loadDomainResource(domainModelPath);
    this.invokeCodeGenerators();
    EList<EObject> _contents = this.restResource.getContents();
    for (final EObject content : _contents) {
    }
  }
  
  /**
   * Does the registration of the meta models, such that it knows the meta model belonging to a model
   */
  public Object doEMFSetup() {
    Object _xblockexpression = null;
    {
      String _nsURI = RESTPackage.eINSTANCE.getNsURI();
      Registry.INSTANCE.put(_nsURI, RESTPackage.eINSTANCE);
      Map<String,Object> _extensionToFactoryMap = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      Map<String,Object> _extensionToFactoryMap_1 = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl_1 = new XMIResourceFactoryImpl();
      Object _put = _extensionToFactoryMap_1.put("ecore", _xMIResourceFactoryImpl_1);
      _xblockexpression = (_put);
    }
    return _xblockexpression;
  }
  
  public Resource loadRestResource(final String restModelPath) {
    Resource _xblockexpression = null;
    {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      final ResourceSetImpl restResourceSet = _resourceSetImpl;
      URI _createURI = URI.createURI(restModelPath);
      Resource _resource = restResourceSet.getResource(_createURI, true);
      Resource _restResource = this.restResource = _resource;
      _xblockexpression = (_restResource);
    }
    return _xblockexpression;
  }
  
  public Resource loadDomainResource(final String domainModelPath) {
    Resource _xblockexpression = null;
    {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      final ResourceSetImpl domainResourceSet = _resourceSetImpl;
      URI _createURI = URI.createURI(domainModelPath);
      Resource _resource = domainResourceSet.getResource(_createURI, true);
      Resource _domainResource = this.domainResource = _resource;
      _xblockexpression = (_domainResource);
    }
    return _xblockexpression;
  }
  
  /**
   * Based on the annotations for languages, it generates java, php, etc.
   */
  public Object invokeCodeGenerators() {
    return null;
  }
  
  protected CharSequence _generateCode(final nl.sytematic.projects.REST.REST.System it) {
    CharSequence _xblockexpression = null;
    {
      SystemCodeTemplate _systemCodeTemplate = new SystemCodeTemplate();
      final SystemCodeTemplate tpl = _systemCodeTemplate;
      tpl.setRestResource(this.restResource);
      tpl.setDomainResource(this.domainResource);
      CharSequence _generate = tpl.generate(it);
      _xblockexpression = (_generate);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateCode(final nl.sytematic.projects.REST.REST.System it) {
    {
      return _generateCode(it);
    }
  }
}
