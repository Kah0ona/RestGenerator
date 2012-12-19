package nl.sytematic.projects.rest.codegenerator.java

import nl.sytematic.projects.REST.REST.ReadMethod
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource

class ReadMethodGenerator extends MethodGenerator{
	def generate(ReadMethod it,org.eclipse.emf.ecore.resource.Resource resource ) throws  Exception '''
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public String «it.name»() {
			String result; 
			result = " Hello guys! I am « it.name » RESTService From Sytematic Software  \n" + 
			«FOR firstLoop : resource.contents»
				«FOR secondLoop: firstLoop.eContents»
					«FOR thirdLoop: secondLoop.eContents»
						«thirdLoop.generateContent()»
					«ENDFOR»
				«ENDFOR»
			«ENDFOR» " ";
			return result; 
		  }
	'''
	  
	  // Business Resource Object Dispatch Method 
	   def dispatch generateContent(EObject it)'''
	  '''
	  // Business Resource Package Dispatch Method 
	  def dispatch generateContent(EPackage it)'''
	  '''
	  // Business Resource Classifier Dispatch Method 
	  def dispatch generateContent(EClassifier it)'''
	'''
	  // Business Resource Annotation Dispatch Method   
	  def  dispatch generateContent(EAnnotation it)'''
	  '''
	  // Business Resource Attribute Dispatch Method 
	  def dispatch generateContent(EAttribute it)'''
	"«it.name + " attribute with content " + it.defaultValueLiteral»\n" +
	  '''
	  // Business Resource class Dispatch Method 
	  def dispatch generateContent(EClass it)'''
	«it.name» 
	  '''
}