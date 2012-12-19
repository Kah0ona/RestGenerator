package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.UpdateMethod

class UpdateMethodGenerator extends MethodGenerator{
	
	def generate(UpdateMethod it) '''
	  	@POST  
	  	public void  «it.name»(){
	  	
	  	}
	'''
}