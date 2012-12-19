package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.Server

class ServerGenerator extends RESTServiceGenerator {
	def generate(Server it) '''
			
		//your package here;
		package nl.sytematic.projects.REST.RESTServiceExample;
		
		import javax.servlet.http.HttpServletResponse;
		import javax.ws.rs.PUT;
		import javax.ws.rs.GET;
		import javax.ws.rs.POST;
		import javax.ws.rs.DELETE;
		import javax.ws.rs.Path;
		import javax.ws.rs.Consumes;
		import javax.ws.rs.FormParam;
		import javax.ws.rs.PathParam;
		import javax.ws.rs.Produces;
		import javax.ws.rs.core.Context;
		import javax.ws.rs.core.MediaType;
		import javax.ws.rs.core.Request;
		import javax.ws.rs.core.Response;
		
		@Path("«it.baseURI»")
		public class «it.name» {
			«FOR resource : it.resources»
		     	«new ResourceGenerator().generate(resource)»
		   «ENDFOR»
		}
	'''
}