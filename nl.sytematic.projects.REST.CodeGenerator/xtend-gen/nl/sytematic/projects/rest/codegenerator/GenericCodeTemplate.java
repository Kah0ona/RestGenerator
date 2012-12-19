package nl.sytematic.projects.rest.codegenerator;

import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class GenericCodeTemplate {
  private Resource restResource;
  
  private Resource domainResource;
  
  public Resource setRestResource(final Resource rest) {
    Resource _restResource = this.restResource = rest;
    return _restResource;
  }
  
  public Resource setDomainResource(final Resource domain) {
    Resource _domainResource = this.domainResource = domain;
    return _domainResource;
  }
}
