package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.SqlServer

class SqlServerGenerator extends DatabaseGenerator{
	def generate(SqlServer it) '''
	    public class «it.name» {
	    
	    }
  '''
}