package nl.sytematic.projects.rest.codegenerator

import java.io.File
import nl.sytematic.projects.REST.REST.API
import nl.sytematic.projects.REST.REST.RESTPackage
import nl.sytematic.projects.REST.REST.System
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage$Registry
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import nl.sytematic.projects.REST.REST.Client
import nl.sytematic.projects.REST.REST.CreateMethod
import nl.sytematic.projects.REST.REST.DataBase
import nl.sytematic.projects.REST.REST.DeleteMethod
import nl.sytematic.projects.REST.REST.Hook
import nl.sytematic.projects.REST.REST.HTMLMediaType
import nl.sytematic.projects.REST.REST.HTTPRequest
import nl.sytematic.projects.REST.REST.HTTPResponse
import nl.sytematic.projects.REST.REST.Java
import nl.sytematic.projects.REST.REST.JavaScript
import nl.sytematic.projects.REST.REST.JSONMediaType
import nl.sytematic.projects.REST.REST.MySql
import nl.sytematic.projects.REST.REST.Parameter
import nl.sytematic.projects.REST.REST.PHP
import nl.sytematic.projects.REST.REST.ReadMethod
import nl.sytematic.projects.REST.REST.Server
import nl.sytematic.projects.REST.REST.SqlServer
import nl.sytematic.projects.REST.REST.TEXTMediaType
import nl.sytematic.projects.REST.REST.UpdateMethod
import nl.sytematic.projects.REST.REST.XMLMediaType
import java.io.FileWriter
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EFactory
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EAttribute
import nl.sytematic.projects.rest.codegenerator.java.*

class CodeGenerator{
	/**
	 * The resource handle for the domain model (input ecore file)
	 */
	org.eclipse.emf.ecore.resource.Resource domainResource

	/**
	 * The resource handle for the REST model
	 */
	org.eclipse.emf.ecore.resource.Resource restResource

	// specify path here,  where you want your generated files to be stored 
	String filePath2="C:/Users/Tesfay/Desktop/Internship/WorkSpace/nl.sytematic.projects.REST.RESTServiceExample/src/nl/sytematic/projects/REST/RESTServiceExample/"
	String filePath	= "src-gen/nl/sytematic/projects/REST/CodeGenerator/";
	
	
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
	
		for (EObject content : restResource.contents) {
		 //   content.generateCode(); 
		} 
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
	 */
	def invokeCodeGenerators() {
				
	}

	def dispatch generateCode(System it) {
		val SystemCodeTemplate tpl = new SystemCodeTemplate()
		tpl.setRestResource(restResource)
		tpl.setDomainResource(domainResource);
		tpl.generate(it)
	}
	/*
	
	def dispatch generateCode(API it) {
		for (content : it.services) {
			content.generateCode(); 
		} 
		new APIGenerator().generate(it);
	}
	
	def dispatch generateCode(Server it) {
		var File classes = new File(filePath2+it.name+".java");
	    var FileWriter writer = new FileWriter(classes.absolutePath,true);
	    writer.write(new ServerGenerator().generate(it).toString);
	    writer.close(); 
		new ServerGenerator().generate(it);
	}
	  */
	// REST Client Dispatch Method 
	/* 	   
	def dispatch generateCode(Client it) {
		for (content : it.resources) {
			content.generateCode(); 
		} 
		new ClientGenerator().generate(it);
	}
	   	   
	   	   
	// REST CreateMethod Dispatch Method 	     
	   	   
	def dispatch generateCode(CreateMethod it) {			
		return new CreateMethodGenerator().generate(it); 
	}  
	   
	// REST Update Dispatch Method
	 def  dispatch generateCode(UpdateMethod it) {
	
		return new UpdateMethodGenerator().generate(it);
	
	}
		  
	 // REST Delete Dispatch Method
	   	      	   
	 def dispatch generateCode(DeleteMethod it) {
	   	return   new DeleteMethodGenerator().generate(it);
	   	   
	 } 
	 
	// REST ReadMethod Dispatch Method
	   
	def dispatch generateCode(ReadMethod it) {
		
		return  new ReadMethodGenerator().generate(it, domainResource);
	} 
	   
	   
	// REST Hook Dispatch Method	   
	 def dispatch generateCode(Hook it) {
		new HookGenerator().generate(it); 	   
	 }   
	// REST HTMLMediaType Dispatch Method	   
	 def dispatch generateCode(HTMLMediaType it) {
	   	   new HTMLMediaTypeGenerator().generate(it);
	   	   
	  }
	// REST HTTPRequest Dispatch Method
	def dispatch generateCode(HTTPRequest it) {
	   	   new HTTPRequestGenerator().generate(it);
	   	   
	   	   }
	// REST HTTPResponse Dispatch Method     	   	   
	def dispatch generateCode(HTTPResponse it) {
	   	   new HTTPResponseGenerator().generate(it);
	   	   
	 }
	// REST Java Dispatch Method  
	def dispatch generateCode(Java it) {
	   	   new JavaGenerator().generate(it);
	   	   
	}
	// REST JavaScript Dispatch Method
	def dispatch generateCode(JavaScript it) {
	   	   new JavaScriptGenerator().generate(it);
	} 
	// REST JSONMediaType Dispatch Method  
	def dispatch generateCode(JSONMediaType it) {
	   	   new JSONMediaTypeGenerator().generate(it);
	} 
	// REST MySql Dispatch Method 
	def dispatch generateCode(MySql it) {
	   	   new MySqlGenerator().generate(it);
	}  
	def dispatch generateCode(Parameter it) {
	   	   new ParameterGenerator().generate(it);
	}
	// REST PHP Dispatch Method  
	def dispatch generateCode(PHP it) {
	   	   new PHPGenerator().generate(it);
	}   	
	// REST Resource Dispatch Method 
	def dispatch generateCode(nl.sytematic.projects.REST.REST.Resource it) {
	   	   new ResourceGenerator().generate(it);
	}
	// REST SqlServer Dispatch Method 
	def dispatch generateCode(SqlServer it) {
	   	   new SqlServerGenerator().generate(it);
	}
	// REST TEXTMediaType Dispatch Method   
	def dispatch generateCode(TEXTMediaType it) {
	   	   new TEXTMediaTypeGenerator().generate(it);
	} 
	
	// REST XMLMediaType Dispatch Method   	   
	def dispatch generateCode(XMLMediaType it) {
	   	 return  new XMLMediaTypeGenerator().generate(it);
	} 
	// REST EObject Dispatch Method 
	def dispatch generateCode(EObject it) {
	   	
    }
    */
}