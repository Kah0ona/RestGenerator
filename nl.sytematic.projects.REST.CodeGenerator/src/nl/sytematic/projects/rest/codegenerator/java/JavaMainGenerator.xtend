package nl.sytematic.projects.rest.codegenerator.java

import org.eclipse.emf.ecore.resource.Resource

;

class JavaMainGenerator {
	
	private var String packageName;
	private var String mainName;


	def generateCode(JavaCodeGenerator jcg, Resource resource, Resource resource2) {
		packageName = jcg.getTargetPackageName();
		mainName = jcg.serviceName;
		JavaCodeGenerator::createJavaSourceFile(packageName, '''«mainName».java''', generateClassCode());			
	}
	
	def String generateClassCode(){
		'''
		package «packageName»;
		
		import «packageName».data.*;

		import java.util.List;
		
		import javax.ws.rs.core.MediaType;
		import javax.xml.bind.JAXB;
		import javax.xml.bind.JAXBElement;
		import com.sun.jersey.api.client.Client;
		import com.sun.jersey.api.client.ClientResponse;
		import com.sun.jersey.api.client.WebResource;		
		
		public class «mainName» {

			private Client client;
			private WebResource resource;
			
			public «mainName»() {
				this.client = new Client();
				this.resource = client.resource("http://localhost/");
			}
			
			public String getRawString(String path){
				return resource
						.path(path)
						.accept(MediaType.TEXT_HTML)
						.get(String.class);
			}				
			
		}
		
		'''
		
	}



}
