package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.API

class APIGenerator {
	def generate(API it) '''
		public class «it.name» {
		    
		}
	'''
}