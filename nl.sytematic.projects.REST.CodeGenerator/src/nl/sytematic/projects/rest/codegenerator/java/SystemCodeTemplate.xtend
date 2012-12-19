package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.System
import nl.sytematic.projects.rest.codegenerator.GenericCodeTemplate
import org.eclipse.emf.ecore.resource.Resource

class SystemCodeTemplate extends GenericCodeTemplate {
	
	def generate(System it) '''
	    public class «it.name» {
	    
	    }
  '''

}