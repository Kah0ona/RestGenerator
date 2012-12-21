package nl.sytematic.projects.rest.codegenerator.java

import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import java.util.ArrayList

class JavaPojoGenerator {
	
	Map<String, Pojo> pojos=new HashMap<String, Pojo>();
	

	def generateCode(Resource resource, Resource resource2) {
		val packageName = JavaCodeGenerator::targetPackageName +".data";
		val generationDirectory = JavaCodeGenerator::packageToDirectory(packageName);
		mapPojos(resource2);
		for(entry: pojos.entrySet){
			entry.value.packageName=packageName;
			JavaCodeGenerator::createJavaSourceFile(packageName, '''«entry.key».java''', generatePojoCode(entry.value));			
			//JavaCodeGenerator::createSourceFile('''«generationDirectory»/«entry.key».java''', generatePojoCode(entry.value));
		}
	}

	/** Given a Pojo object generate the Java source code to implement that Pojo
	 * @param pojo The Pojo object to generate
	 * @return String Java source code
	 */	
	def String generatePojoCode(Pojo pojo){
		val sb = new StringBuilder();
		pojo.attributes.forEach(a | sb.append(generateAttributeCode(a.EType.instanceTypeName, a.name)));		
		pojo.references.entrySet.forEach(ref | sb.append(generateAttributeCode('''List<«ref.value.name»>''', ref.key)));		
		pojo.incomingReferences.forEach(iRef | sb.append(generateAttributeCode(iRef.name, iRef.name.toLowerCase)));
		
		'''
		package «pojo.packageName»;
		
		import java.util.List;
		
		class «pojo.name»{
			«sb.toString»
		}
		'''
	}

	def String generateAttributeCode(String type, String variable){
		'''
		
		private «type» «variable»;
		
		public «type» get«variable.toFirstUpper»(){
		    return this.«variable»;	
		}
		
		public void set«variable.toFirstUpper»(«type» «variable»){
		    this.«variable» = «variable»;	
		}
		'''
	}

	/** */
	def String convertToClassName(String name){
		return name.toFirstUpper;
	}


	/** Fill the this.pojos map with a Pojo objects for each class in the model. 
	 *  This function creates all Pojo objects and also tracks incoming references for each Pojo.
	 */

	def dispatch void mapPojos(Resource model){
		model.contents.forEach(o | mapPojos(o));
	}
	def dispatch void mapPojos(EObject obj){
		obj.eContents.forEach(c | mapPojos(c));
	}

	/** Add the Eclass c to the this.pojos map.
	 *  This function creates all Pojo objects and also tracks incoming references for each Pojo.
	 *  
	 */
	def dispatch void mapPojos(EClass c){
		val name=c.name.convertToClassName;
		var Pojo pojo;
		if(pojos.containsKey(name)){
			pojo=pojos.get(name);
		} else {
			pojo=new Pojo(name);
			pojos.put(name, pojo);
		}
		pojo.attributes=c.eContents.filter(typeof(EAttribute)).toList;
		for(ref: c.eContents.filter(typeof(EReference)).toList){
			val refName=ref.EType.name.convertToClassName;
			var Pojo refPojo;
			if(pojos.containsKey(refName)){
				refPojo=pojos.get(refName);
			} else {
				refPojo=new Pojo(refName);
				refPojo.incomingReferences.add(pojo);
				pojos.put(refName, refPojo);
			}
			pojo.references.put(ref.name, refPojo);
		}
	}
	

}

	



class Pojo{
	
	new(String name){
		this.name=name;
	}
	
	public String name;
	public String packageName;	
	public List<EAttribute> attributes = new ArrayList<EAttribute>();
	public Map<String, Pojo> references = new HashMap<String, Pojo>();
	public List<Pojo> incomingReferences = new ArrayList<Pojo>();
}
