package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.PHP

class PHPGenerator extends LanguageGenerator{
	def generate(PHP it) '''
	   public class «it.name» {
	    
	    }
  '''
}