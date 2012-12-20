package nl.sytematic.projects.rest.codegenerator.java.domain

import org.eclipse.emf.ecore.*
/**
 * This file contains some generic extension methods:  (see http://www.eclipse.org/xtend/documentation.html#extensionMethods for docs)
 * for helping with generating the Java POJO's  (http://en.wikipedia.org/wiki/Plain_Old_Java_Object) 
 *
 * It operates on instances of ECore (that is: class diagrams) 
 */
class DomainModelExtensions {
	
	def javaFilePath(EPackage e){
		"java/"+e.name
	}
	
}