package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.Hook

class HookGenerator {
	def generate(Hook it) '''
	    public class «it.name» {
	    
	    }
	'''
}