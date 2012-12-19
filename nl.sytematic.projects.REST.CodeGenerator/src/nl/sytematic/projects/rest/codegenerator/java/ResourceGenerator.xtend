package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.Resource

class ResourceGenerator { //extends AbstractCodeTemplate {
	
	def  generate(Resource it) '''
	   «FOR method : it.methods»
	     
	   «ENDFOR»
  '''
}