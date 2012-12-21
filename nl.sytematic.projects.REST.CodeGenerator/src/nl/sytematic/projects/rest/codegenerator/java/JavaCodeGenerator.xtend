package nl.sytematic.projects.rest.codegenerator.java

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import java.io.File
import java.io.PrintWriter
import java.io.IOException

class JavaCodeGenerator{

	private static val String targetSourceDir="/home/thijs/work/sytematic/RESTWorkspace/generation-test/src/";
	private static var String serviceName="projectX";
	private static val String targetPackageName="nl.sytematic.lib.projectX";
	
	
	def generateCode(Resource restResource, Resource domainResource) {
		val jpg = new JavaPojoGenerator();
		val jmg = new JavaMainGenerator();
		jpg.generateCode(this, restResource, domainResource);
		jmg.generateCode(this, restResource, domainResource);
	}
	
	
	def public getTargetPackageName(){
		targetPackageName;
	}
	
	def public getServiceName(){
		serviceName;
	}
	
	def static packageToDirectory(String packageName){
		targetSourceDir + packageName.replace('.', '/') + '/';
	}
	
	def public static void createJavaSourceFile(String packageName, String fileName, String content){
		createSourceFile(packageToDirectory(packageName) + fileName, content);
	}
	
	/** Write content to a file.
	 * Only write to the file if the file does not yet exist.
	 * 
	 */
	def public static void createSourceFile(String fileName, String content){
		val f= new File(fileName);
		//if(!f.exists){
			if(!f.getParentFile().exists()){
				f.parentFile.mkdirs();
			}
			var PrintWriter out=null;
			try{		
				out = new PrintWriter(f);
				out.println(content);
				System::out.println("File created: " + fileName);
			} catch (IOException ioe){
				System::out.println("Error in writing to file:" + fileName);
				ioe.printStackTrace();
			} finally {
				if(out != null){
					out.close();
				}
			}
		//} else {
		//	System::out.println('''File already exists: «fileName»''' );
		//}
		/*
		System::out.println(
'''

================
file: «name»
----------------
«content»
================''');
		*/
	}
	
}