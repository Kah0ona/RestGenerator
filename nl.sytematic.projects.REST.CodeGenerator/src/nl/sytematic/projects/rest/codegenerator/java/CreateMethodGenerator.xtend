package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.CreateMethod

class CreateMethodGenerator extends MethodGenerator {
	def generate(CreateMethod it) '''
		@PUT  
		@Consumes(MediaType.APPLICATION_XML)
		public void «it.name»(){
			
		}
	'''
}