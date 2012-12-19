package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.Java

class JavaGenerator extends LanguageGenerator{
	def generate(Java it) '''
	   public class «it.name» {
	    
	    }
  '''
}