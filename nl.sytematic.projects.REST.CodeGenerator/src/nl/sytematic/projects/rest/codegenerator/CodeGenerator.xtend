package nl.sytematic.projects.rest.codegenerator

import nl.sytematic.projects.REST.REST.RESTPackage
import nl.sytematic.projects.rest.codegenerator.java.JavaCodeGenerator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage$Registry
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class CodeGenerator{
	/**
	 * The resource handle for the domain model (input ecore file)
	 */
	org.eclipse.emf.ecore.resource.Resource domainResource

	/**
	 * The resource handle for the REST model
	 */
	org.eclipse.emf.ecore.resource.Resource restResource

	
	def static void main(String[] args) {
		new CodeGenerator().generate("sample-RESTmodel.xmi", "BussinesPlan.ecore")    
	}
			  
	def org.eclipse.emf.ecore.resource.Resource getDomainModel() {
		return domainResource;
	}
	 	  	
	def generate(String restModelPath, String domainModelPath) {
		doEMFSetup();
		loadRestResource(restModelPath)
		loadDomainResource(domainModelPath)
		invokeCodeGenerators();
	
	}
	
	/**
	 * Does the registration of the meta models, such that it knows the meta model belonging to a model
	 */  	       
	def doEMFSetup() {
	    EPackage$Registry::INSTANCE.put(RESTPackage::eINSTANCE.nsURI, RESTPackage::eINSTANCE)
	    Resource$Factory$Registry::INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
		Resource$Factory$Registry::INSTANCE.extensionToFactoryMap.put("ecore", new XMIResourceFactoryImpl);
	}

	def loadRestResource(String restModelPath) {
		val restResourceSet = new ResourceSetImpl
		restResource = restResourceSet.getResource(URI::createURI(restModelPath), true)
	}
	  
	def loadDomainResource(String domainModelPath){
		val domainResourceSet = new ResourceSetImpl
	    domainResource = domainResourceSet.getResource(URI::createURI(domainModelPath), true)
	}
	
	/**
	 * Based on the annotations for languages, it generates java, php, etc.
	 * edit: no it isn't
	 */
	def invokeCodeGenerators() {
		invokeJavaGenerator
	}

	def void invokeJavaGenerator() {
		JavaCodeGenerator::generateCode(restResource, domainResource);
	}


	/*def dispatch generateCode(System it) {
		val SystemCodeTemplate tpl = new SystemCodeTemplate()
		tpl.setRestResource(restResource)
		tpl.setDomainResource(domainResource);
		tpl.generate(it)
	}*/
	
}