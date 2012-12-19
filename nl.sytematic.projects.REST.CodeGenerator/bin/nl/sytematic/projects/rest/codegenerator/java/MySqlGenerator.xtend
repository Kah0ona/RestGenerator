package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.MySql

class MySqlGenerator extends DatabaseGenerator {
	def generate(MySql it) '''
	    public class «it.name» {
	    
	    }
  '''
}