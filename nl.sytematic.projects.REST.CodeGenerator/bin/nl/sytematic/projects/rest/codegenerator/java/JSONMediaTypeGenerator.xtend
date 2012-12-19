package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.JSONMediaType

class JSONMediaTypeGenerator extends MediaTypeGenerator {
	def generate(JSONMediaType it) '''
	   public class «it.expression.toString» {
	    
	    }
  '''
}