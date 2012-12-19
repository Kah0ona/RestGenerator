package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.HTTPRequest

class HTTPRequestGenerator {
	def generate(HTTPRequest it) '''
	    public class «it.expression.toString» {
	     }
	'''
}