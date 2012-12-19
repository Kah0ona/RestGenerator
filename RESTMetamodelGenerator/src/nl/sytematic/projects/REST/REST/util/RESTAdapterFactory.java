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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.sytematic.projects.REST.REST.RESTPackage
 * @generated
 */
public class RESTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RESTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RESTPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTSwitch<Adapter> modelSwitch =
		new RESTSwitch<Adapter>() {
			@Override
			public Adapter caseRESTService(RESTService object) {
				return createRESTServiceAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseHTTPRequest(HTTPRequest object) {
				return createHTTPRequestAdapter();
			}
			@Override
			public Adapter caseHTTPResponse(HTTPResponse object) {
				return createHTTPResponseAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseMediaType(MediaType object) {
				return createMediaTypeAdapter();
			}
			@Override
			public Adapter caseJSONMediaType(JSONMediaType object) {
				return createJSONMediaTypeAdapter();
			}
			@Override
			public Adapter caseXMLMediaType(XMLMediaType object) {
				return createXMLMediaTypeAdapter();
			}
			@Override
			public Adapter caseHTMLMediaType(HTMLMediaType object) {
				return createHTMLMediaTypeAdapter();
			}
			@Override
			public Adapter caseTEXTMediaType(TEXTMediaType object) {
				return createTEXTMediaTypeAdapter();
			}
			@Override
			public Adapter caseCreateMethod(CreateMethod object) {
				return createCreateMethodAdapter();
			}
			@Override
			public Adapter caseReadMethod(ReadMethod object) {
				return createReadMethodAdapter();
			}
			@Override
			public Adapter caseUpdateMethod(UpdateMethod object) {
				return createUpdateMethodAdapter();
			}
			@Override
			public Adapter caseDeleteMethod(DeleteMethod object) {
				return createDeleteMethodAdapter();
			}
			@Override
			public Adapter caseHook(Hook object) {
				return createHookAdapter();
			}
			@Override
			public Adapter caseAPI(API object) {
				return createAPIAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseDataBase(DataBase object) {
				return createDataBaseAdapter();
			}
			@Override
			public Adapter caseSystem(nl.sytematic.projects.REST.REST.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			@Override
			public Adapter caseJava(Java object) {
				return createJavaAdapter();
			}
			@Override
			public Adapter casePHP(PHP object) {
				return createPHPAdapter();
			}
			@Override
			public Adapter caseJavaScript(JavaScript object) {
				return createJavaScriptAdapter();
			}
			@Override
			public Adapter caseMySql(MySql object) {
				return createMySqlAdapter();
			}
			@Override
			public Adapter caseSqlServer(SqlServer object) {
				return createSqlServerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.RESTService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.RESTService
	 * @generated
	 */
	public Adapter createRESTServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.HTTPRequest <em>HTTP Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.HTTPRequest
	 * @generated
	 */
	public Adapter createHTTPRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.HTTPResponse <em>HTTP Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.HTTPResponse
	 * @generated
	 */
	public Adapter createHTTPResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.MediaType
	 * @generated
	 */
	public Adapter createMediaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.JSONMediaType <em>JSON Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.JSONMediaType
	 * @generated
	 */
	public Adapter createJSONMediaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.XMLMediaType <em>XML Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.XMLMediaType
	 * @generated
	 */
	public Adapter createXMLMediaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.HTMLMediaType <em>HTML Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.HTMLMediaType
	 * @generated
	 */
	public Adapter createHTMLMediaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.TEXTMediaType <em>TEXT Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.TEXTMediaType
	 * @generated
	 */
	public Adapter createTEXTMediaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.CreateMethod <em>Create Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.CreateMethod
	 * @generated
	 */
	public Adapter createCreateMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.ReadMethod <em>Read Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.ReadMethod
	 * @generated
	 */
	public Adapter createReadMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.UpdateMethod <em>Update Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.UpdateMethod
	 * @generated
	 */
	public Adapter createUpdateMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.DeleteMethod <em>Delete Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.DeleteMethod
	 * @generated
	 */
	public Adapter createDeleteMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.Hook <em>Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.Hook
	 * @generated
	 */
	public Adapter createHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.API
	 * @generated
	 */
	public Adapter createAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.DataBase
	 * @generated
	 */
	public Adapter createDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.Java <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.Java
	 * @generated
	 */
	public Adapter createJavaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.PHP <em>PHP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.PHP
	 * @generated
	 */
	public Adapter createPHPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.JavaScript <em>Java Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.JavaScript
	 * @generated
	 */
	public Adapter createJavaScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.MySql <em>My Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.MySql
	 * @generated
	 */
	public Adapter createMySqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.sytematic.projects.REST.REST.SqlServer <em>Sql Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.sytematic.projects.REST.REST.SqlServer
	 * @generated
	 */
	public Adapter createSqlServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RESTAdapterFactory
