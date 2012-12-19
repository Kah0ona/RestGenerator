package nl.sytematic.projects.rest.codegenerator.java

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EAttribute

class JavaCodeGenerator {
	
	def static generateCode(Resource resource, Resource resource2) {
		System::out.println("Start Java generation.");
		val sb=new StringBuilder();
		sb.append("start");
		for(EObject object: resource2.contents){
			generateObject(object);
			sb.append(object.toString() + "\r\n");
		}
		sb.append("done");
		System::out.println(sb.toString());
		System::out.println("Done generating Java.");
	}
	
	
	def static dispatch void generateObject(EClass c){
		System::out.println("Class: " + c.name);
		c.eContents.forEach(content | generateObject(content));
	}

	def static dispatch void generateObject(EAttribute a){
		System::out.println("Attribute: " + a.EType.name + " " + a.name);
	}

	def static dispatch void generateObject(EObject obj){
		System::out.println("Object: " + obj.toString());
		obj.eContents.forEach(c | generateObject(c));
	}
	
}