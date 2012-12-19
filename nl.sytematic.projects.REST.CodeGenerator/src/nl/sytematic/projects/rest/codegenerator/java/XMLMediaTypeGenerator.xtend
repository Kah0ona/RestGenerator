package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.XMLMediaType

class XMLMediaTypeGenerator extends MediaTypeGenerator{
	def generate(XMLMediaType it) '''
   		@Produces(MediaType.XML)
  '''
}