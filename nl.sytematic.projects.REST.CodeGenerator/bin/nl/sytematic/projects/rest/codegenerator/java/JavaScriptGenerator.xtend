package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.JavaScript

class JavaScriptGenerator extends LanguageGenerator{
	def generate(JavaScript it) '''
	   public class «it.name» {
	    
	    }
  '''
}