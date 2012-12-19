package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.Client

class ClientGenerator extends RESTServiceGenerator {
	def generate(Client it) '''
		public class «it.name» {   
		}
	'''
}