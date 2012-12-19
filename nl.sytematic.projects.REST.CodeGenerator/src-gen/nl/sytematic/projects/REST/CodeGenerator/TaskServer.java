	
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

@Path("/task")
public class TaskServer {
@PUT  
@Consumes(MediaType.APPLICATION_XML)
public void Task_Create(){
	
}
@POST  
public void  Task_Update(){

}
@GET
@Produces(MediaType.TEXT_PLAIN)
public String Task_Read() {
	String result; 
result = " Hello guys! I am Task_Read RESTService From Sytematic Software" + 
 
"address attribute with content Enschede" +
"name attribute with content tesfa" +
"task attribute with content tesfa's tasks" +
"plan attribute with content tesfa's plans" +
  +;
 return result; 
 }
@DELETE  
@Consumes(MediaType.APPLICATION_XML)
public void  Task_Delete(){
	
}
}
