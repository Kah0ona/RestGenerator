package nl.sytematic.projects.rest.codegenerator
import org.eclipse.emf.ecore.resource.Resource


class GenericCodeTemplate {
	Resource restResource
	Resource domainResource
	
	def setRestResource(Resource rest){
		restResource = rest
	}
	
	def setDomainResource(Resource domain){
		domainResource = domain
	}
	
} 