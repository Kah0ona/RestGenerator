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
import java.util.Map$Entry

class JavaPojoGenerator {
	
	Map<String, Pojo> pojos=new HashMap<String, Pojo>();
	

	def generateCode(Resource resource, Resource resource2) {
		
		mapPojos(resource2);
		for(entry: pojos.entrySet){
			System::out.println("entry: "+ entry.key);
			System::out.println("content to string:\r\n "+ generatePojoCode(entry.value));
			
		}
		if(true) return;
		
		System::out.println("Start Java generation.");
		for(EObject object: resource2.contents){
			generateObject(object);
			//System::out.println("Generated: \"" + t + "\"");
			//sb.append("OI   " + object.toString() + "\r\n");
		}
		System::out.println("Done generating Java.");
	}
	
	def String generatePojoCode(Pojo pojo){
		val sb = new StringBuilder();
		pojo.attributes.forEach(a | sb.append('''«a.EType.instanceTypeName» «a.name»;''' +"\r\n"))
		pojo.references.entrySet.forEach(ref |sb.append('''List<«ref.value.name»> «ref.key»;''' + "\r\n"))
		pojo.incomingReferences.forEach(iRef | sb.append('''«iRef.name» «iRef.name.toLowerCase»;''' + "\r\n"))
		
		''' 
		class «pojo.name»{
			«sb.toString»
		}
		'''
	}

	def dispatch void mapPojos(Resource model){
		model.contents.forEach(o | mapPojos(o));
	}
	def dispatch void mapPojos(EObject obj){
		obj.eContents.forEach(c | mapPojos(c));
	}

	/** Create a mapping of the references between POJOs as well as back-references. 
	 * 
	 */
	def dispatch void mapPojos(EClass c){
		val name=c.name;
		var Pojo pojo;
		if(pojos.containsKey(name)){
			pojo=pojos.get(name);
		} else {
			pojo=new Pojo(name);
			pojos.put(name, pojo);
		}
		pojo.attributes=c.eContents.filter(typeof(EAttribute)).toList;
		for(ref: c.eContents.filter(typeof(EReference)).toList){
			val refName=ref.EType.name;
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
	

	

	
	def void createSourceFile(String name, String content){
		System::out.println(
'''

================
file: «name»
----------------
«content»
================''');
	
	}
	
	
	def dispatch void generateObject(EClass c){
		//System::out.println("Class: " + c.name);
		val sb=new StringBuilder();
		c.eContents.forEach(content | sb.append(generateObject(content)));
		val file=c.name + ".java";
		val content = '''
		class «c.name»{
			«sb.toString()»
		} 
		''';
		createSourceFile(file, content.toString);
	}

	def dispatch String generateObject(EAttribute a){
		'''
		«a.EType.instanceTypeName» «a.name»;
		'''		
	}
	def dispatch String generateObject(EReference r){
		'''
		List<«r.EType.name»> «r.name»;
		'''		
	}
	

	def dispatch String generateObject(EObject obj){
		//System::out.println("Object: " + obj.toString());
		val sb=new StringBuilder();
		obj.eContents.forEach(c | sb.append(generateObject(c)));
		return sb.toString();
	}
}

class Pojo{
	
	new(String name){
		this.name=name;
	}
	
	public String name;
	public List<EAttribute> attributes = new ArrayList<EAttribute>();
	public Map<String, Pojo> references = new HashMap<String, Pojo>();
	public List<Pojo> incomingReferences = new ArrayList<Pojo>();
}
