/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nl.sytematic.projects.REST.REST.util;

import nl.sytematic.projects.REST.REST.API;
import nl.sytematic.projects.REST.REST.Client;
import nl.sytematic.projects.REST.REST.CreateMethod;
import nl.sytematic.projects.REST.REST.DataBase;
import nl.sytematic.projects.REST.REST.DeleteMethod;
import nl.sytematic.projects.REST.REST.HTMLMediaType;
import nl.sytematic.projects.REST.REST.HTTPRequest;
import nl.sytematic.projects.REST.REST.HTTPResponse;
import nl.sytematic.projects.REST.REST.Hook;
import nl.sytematic.projects.REST.REST.JSONMediaType;
import nl.sytematic.projects.REST.REST.Java;
import nl.sytematic.projects.REST.REST.JavaScript;
import nl.sytematic.projects.REST.REST.Language;
import nl.sytematic.projects.REST.REST.MediaType;
import nl.sytematic.projects.REST.REST.Method;
import nl.sytematic.projects.REST.REST.MySql;
import nl.sytematic.projects.REST.REST.PHP;
import nl.sytematic.projects.REST.REST.Parameter;
import nl.sytematic.projects.REST.REST.RESTPackage;
import nl.sytematic.projects.REST.REST.RESTService;
import nl.sytematic.projects.REST.REST.ReadMethod;
import nl.sytematic.projects.REST.REST.Resource;
import nl.sytematic.projects.REST.REST.Server;
import nl.sytematic.projects.REST.REST.SqlServer;
import nl.sytematic.projects.REST.REST.TEXTMediaType;
import nl.sytematic.projects.REST.REST.UpdateMethod;
import nl.sytematic.projects.REST.REST.XMLMediaType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nl.sytematic.projects.REST.REST.RESTPackage
 * @generated
 */
public class RESTSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RESTPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTSwitch() {
		if (modelPackage == null) {
			modelPackage = RESTPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RESTPackage.REST_SERVICE: {
				RESTService restService = (RESTService)theEObject;
				T result = caseRESTService(restService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.HTTP_REQUEST: {
				HTTPRequest httpRequest = (HTTPRequest)theEObject;
				T result = caseHTTPRequest(httpRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.HTTP_RESPONSE: {
				HTTPResponse httpResponse = (HTTPResponse)theEObject;
				T result = caseHTTPResponse(httpResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.MEDIA_TYPE: {
				MediaType mediaType = (MediaType)theEObject;
				T result = caseMediaType(mediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.JSON_MEDIA_TYPE: {
				JSONMediaType jsonMediaType = (JSONMediaType)theEObject;
				T result = caseJSONMediaType(jsonMediaType);
				if (result == null) result = caseMediaType(jsonMediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.XML_MEDIA_TYPE: {
				XMLMediaType xmlMediaType = (XMLMediaType)theEObject;
				T result = caseXMLMediaType(xmlMediaType);
				if (result == null) result = caseMediaType(xmlMediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.HTML_MEDIA_TYPE: {
				HTMLMediaType htmlMediaType = (HTMLMediaType)theEObject;
				T result = caseHTMLMediaType(htmlMediaType);
				if (result == null) result = caseMediaType(htmlMediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.TEXT_MEDIA_TYPE: {
				TEXTMediaType textMediaType = (TEXTMediaType)theEObject;
				T result = caseTEXTMediaType(textMediaType);
				if (result == null) result = caseMediaType(textMediaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.CREATE_METHOD: {
				CreateMethod createMethod = (CreateMethod)theEObject;
				T result = caseCreateMethod(createMethod);
				if (result == null) result = caseMethod(createMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.READ_METHOD: {
				ReadMethod readMethod = (ReadMethod)theEObject;
				T result = caseReadMethod(readMethod);
				if (result == null) result = caseMethod(readMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.UPDATE_METHOD: {
				UpdateMethod updateMethod = (UpdateMethod)theEObject;
				T result = caseUpdateMethod(updateMethod);
				if (result == null) result = caseMethod(updateMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.DELETE_METHOD: {
				DeleteMethod deleteMethod = (DeleteMethod)theEObject;
				T result = caseDeleteMethod(deleteMethod);
				if (result == null) result = caseMethod(deleteMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.HOOK: {
				Hook hook = (Hook)theEObject;
				T result = caseHook(hook);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.API: {
				API api = (API)theEObject;
				T result = caseAPI(api);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseRESTService(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = caseRESTService(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.DATA_BASE: {
				DataBase dataBase = (DataBase)theEObject;
				T result = caseDataBase(dataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.SYSTEM: {
				nl.sytematic.projects.REST.REST.System system = (nl.sytematic.projects.REST.REST.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.LANGUAGE: {
				Language language = (Language)theEObject;
				T result = caseLanguage(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.JAVA: {
				Java java = (Java)theEObject;
				T result = caseJava(java);
				if (result == null) result = caseLanguage(java);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.PHP: {
				PHP php = (PHP)theEObject;
				T result = casePHP(php);
				if (result == null) result = caseLanguage(php);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.JAVA_SCRIPT: {
				JavaScript javaScript = (JavaScript)theEObject;
				T result = caseJavaScript(javaScript);
				if (result == null) result = caseLanguage(javaScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.MY_SQL: {
				MySql mySql = (MySql)theEObject;
				T result = caseMySql(mySql);
				if (result == null) result = caseDataBase(mySql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTPackage.SQL_SERVER: {
				SqlServer sqlServer = (SqlServer)theEObject;
				T result = caseSqlServer(sqlServer);
				if (result == null) result = caseDataBase(sqlServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRESTService(RESTService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPRequest(HTTPRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPResponse(HTTPResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaType(MediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONMediaType(JSONMediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLMediaType(XMLMediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLMediaType(HTMLMediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEXT Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEXT Media Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEXTMediaType(TEXTMediaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateMethod(CreateMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadMethod(ReadMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateMethod(UpdateMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteMethod(DeleteMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHook(Hook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPI(API object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBase(DataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(nl.sytematic.projects.REST.REST.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJava(Java object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHP(PHP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaScript(JavaScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My Sql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My Sql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMySql(MySql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlServer(SqlServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RESTSwitch
