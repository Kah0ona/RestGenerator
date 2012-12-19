package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.Resource
import nl.sytematic.projects.rest.codegenerator.CodeGenerator

class ResourceGenerator { //extends AbstractCodeTemplate {
	
	def  generate(Resource it) '''
	   «FOR method : it.methods»
	     «new CodeGenerator().generateCode(method)»
	   «ENDFOR»
  '''
}