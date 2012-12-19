package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.DeleteMethod

class DeleteMethodGenerator extends MethodGenerator {
	def generate(DeleteMethod it) '''
	  	@DELETE  
	  	@Consumes(MediaType.APPLICATION_XML)
	  	public void  «it.name»(){
	  		
	  	}
	'''
}