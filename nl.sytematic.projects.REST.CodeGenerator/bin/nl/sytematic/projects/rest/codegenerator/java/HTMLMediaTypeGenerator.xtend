package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.HTMLMediaType

class HTMLMediaTypeGenerator extends MediaTypeGenerator {
	def generate(HTMLMediaType it) '''
	    public class «it.expression.toString» {
	    
	    }
	'''
}