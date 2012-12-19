package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.Parameter

class ParameterGenerator {
	def generate(Parameter it) '''
	   public class «it.expression.toString» {
	    
	    }
  '''
}