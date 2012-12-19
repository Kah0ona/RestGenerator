/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nl.sytematic.projects.REST.REST.impl;

import nl.sytematic.projects.REST.REST.API;
import nl.sytematic.projects.REST.REST.Client;
import nl.sytematic.projects.REST.REST.CreateMethod;
import nl.sytematic.projects.REST.REST.DeleteMethod;
import nl.sytematic.projects.REST.REST.HTMLMediaType;
import nl.sytematic.projects.REST.REST.HTTPRequest;
import nl.sytematic.projects.REST.REST.HTTPResponse;
import nl.sytematic.projects.REST.REST.Hook;
import nl.sytematic.projects.REST.REST.JSONMediaType;
import nl.sytematic.projects.REST.REST.Java;
import nl.sytematic.projects.REST.REST.JavaScript;
import nl.sytematic.projects.REST.REST.MySql;
import nl.sytematic.projects.REST.REST.PHP;
import nl.sytematic.projects.REST.REST.Parameter;
import nl.sytematic.projects.REST.REST.RESTFactory;
import nl.sytematic.projects.REST.REST.RESTPackage;
import nl.sytematic.projects.REST.REST.ReadMethod;
import nl.sytematic.projects.REST.REST.Resource;
import nl.sytematic.projects.REST.REST.Server;
import nl.sytematic.projects.REST.REST.SqlServer;
import nl.sytematic.projects.REST.REST.TEXTMediaType;
import nl.sytematic.projects.REST.REST.UpdateMethod;
import nl.sytematic.projects.REST.REST.XMLMediaType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RESTFactoryImpl extends EFactoryImpl implements RESTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RESTFactory init() {
		try {
			RESTFactory theRESTFactory = (RESTFactory)EPackage.Registry.INSTANCE.getEFactory("http://rest/1.0"); 
			if (theRESTFactory != null) {
				return theRESTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RESTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RESTPackage.RESOURCE: return createResource();
			case RESTPackage.HTTP_REQUEST: return createHTTPRequest();
			case RESTPackage.HTTP_RESPONSE: return createHTTPResponse();
			case RESTPackage.PARAMETER: return createParameter();
			case RESTPackage.JSON_MEDIA_TYPE: return createJSONMediaType();
			case RESTPackage.XML_MEDIA_TYPE: return createXMLMediaType();
			case RESTPackage.HTML_MEDIA_TYPE: return createHTMLMediaType();
			case RESTPackage.TEXT_MEDIA_TYPE: return createTEXTMediaType();
			case RESTPackage.CREATE_METHOD: return createCreateMethod();
			case RESTPackage.READ_METHOD: return createReadMethod();
			case RESTPackage.UPDATE_METHOD: return createUpdateMethod();
			case RESTPackage.DELETE_METHOD: return createDeleteMethod();
			case RESTPackage.HOOK: return createHook();
			case RESTPackage.API: return createAPI();
			case RESTPackage.SERVER: return createServer();
			case RESTPackage.CLIENT: return createClient();
			case RESTPackage.SYSTEM: return createSystem();
			case RESTPackage.JAVA: return createJava();
			case RESTPackage.PHP: return createPHP();
			case RESTPackage.JAVA_SCRIPT: return createJavaScript();
			case RESTPackage.MY_SQL: return createMySql();
			case RESTPackage.SQL_SERVER: return createSqlServer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPRequest createHTTPRequest() {
		HTTPRequestImpl httpRequest = new HTTPRequestImpl();
		return httpRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPResponse createHTTPResponse() {
		HTTPResponseImpl httpResponse = new HTTPResponseImpl();
		return httpResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONMediaType createJSONMediaType() {
		JSONMediaTypeImpl jsonMediaType = new JSONMediaTypeImpl();
		return jsonMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLMediaType createXMLMediaType() {
		XMLMediaTypeImpl xmlMediaType = new XMLMediaTypeImpl();
		return xmlMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLMediaType createHTMLMediaType() {
		HTMLMediaTypeImpl htmlMediaType = new HTMLMediaTypeImpl();
		return htmlMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXTMediaType createTEXTMediaType() {
		TEXTMediaTypeImpl textMediaType = new TEXTMediaTypeImpl();
		return textMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateMethod createCreateMethod() {
		CreateMethodImpl createMethod = new CreateMethodImpl();
		return createMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadMethod createReadMethod() {
		ReadMethodImpl readMethod = new ReadMethodImpl();
		return readMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateMethod createUpdateMethod() {
		UpdateMethodImpl updateMethod = new UpdateMethodImpl();
		return updateMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteMethod createDeleteMethod() {
		DeleteMethodImpl deleteMethod = new DeleteMethodImpl();
		return deleteMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hook createHook() {
		HookImpl hook = new HookImpl();
		return hook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public nl.sytematic.projects.REST.REST.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java createJava() {
		JavaImpl java = new JavaImpl();
		return java;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHP createPHP() {
		PHPImpl php = new PHPImpl();
		return php;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScript createJavaScript() {
		JavaScriptImpl javaScript = new JavaScriptImpl();
		return javaScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MySql createMySql() {
		MySqlImpl mySql = new MySqlImpl();
		return mySql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlServer createSqlServer() {
		SqlServerImpl sqlServer = new SqlServerImpl();
		return sqlServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTPackage getRESTPackage() {
		return (RESTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RESTPackage getPackage() {
		return RESTPackage.eINSTANCE;
	}

} //RESTFactoryImpl
