package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.HTTPResponse

class HTTPResponseGenerator {
	def generate(HTTPResponse it) '''
	    public class «it.expression.toString» {
	    
	    }
	'''
}