package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.TEXTMediaType

class TEXTMediaTypeGenerator extends MediaTypeGenerator{
	def generate(TEXTMediaType it) '''
	   public class «it.expression.toString» {
	    
	    }
  '''
}