/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nl.sytematic.projects.REST.REST;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.sytematic.projects.REST.REST.RESTFactory
 * @model kind="package"
 * @generated
 */
public interface RESTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "REST";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rest/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "REST";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RESTPackage eINSTANCE = nl.sytematic.projects.REST.REST.impl.RESTPackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.RESTServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.RESTServiceImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getRESTService()
	 * @generated
	 */
	int REST_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__LANGUAGES = 2;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__BELONGS_TO = 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.ResourceImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__METHODS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__BELONGS_TO = 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.MethodImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 2;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__REQUESTS = 0;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RESPONSES = 1;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__HOOKS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 3;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.HTTPRequestImpl <em>HTTP Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.HTTPRequestImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getHTTPRequest()
	 * @generated
	 */
	int HTTP_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>HTTP Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.HTTPResponseImpl <em>HTTP Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.HTTPResponseImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getHTTPResponse()
	 * @generated
	 */
	int HTTP_RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Media Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE__MEDIA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>HTTP Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.ParameterImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.MediaTypeImpl <em>Media Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.MediaTypeImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Media Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.JSONMediaTypeImpl <em>JSON Media Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.JSONMediaTypeImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getJSONMediaType()
	 * @generated
	 */
	int JSON_MEDIA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_MEDIA_TYPE__EXPRESSION = MEDIA_TYPE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>JSON Media Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_MEDIA_TYPE_FEATURE_COUNT = MEDIA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.XMLMediaTypeImpl <em>XML Media Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.XMLMediaTypeImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getXMLMediaType()
	 * @generated
	 */
	int XML_MEDIA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_MEDIA_TYPE__EXPRESSION = MEDIA_TYPE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>XML Media Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_MEDIA_TYPE_FEATURE_COUNT = MEDIA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.HTMLMediaTypeImpl <em>HTML Media Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.HTMLMediaTypeImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getHTMLMediaType()
	 * @generated
	 */
	int HTML_MEDIA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_MEDIA_TYPE__EXPRESSION = MEDIA_TYPE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>HTML Media Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_MEDIA_TYPE_FEATURE_COUNT = MEDIA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.TEXTMediaTypeImpl <em>TEXT Media Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.TEXTMediaTypeImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getTEXTMediaType()
	 * @generated
	 */
	int TEXT_MEDIA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MEDIA_TYPE__EXPRESSION = MEDIA_TYPE__EXPRESSION;

	/**
	 * The number of structural features of the '<em>TEXT Media Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MEDIA_TYPE_FEATURE_COUNT = MEDIA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.CreateMethodImpl <em>Create Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.CreateMethodImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getCreateMethod()
	 * @generated
	 */
	int CREATE_METHOD = 11;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_METHOD__REQUESTS = METHOD__REQUESTS;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_METHOD__RESPONSES = METHOD__RESPONSES;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_METHOD__HOOKS = METHOD__HOOKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_METHOD__NAME = METHOD__NAME;

	/**
	 * The number of structural features of the '<em>Create Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.ReadMethodImpl <em>Read Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.ReadMethodImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getReadMethod()
	 * @generated
	 */
	int READ_METHOD = 12;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_METHOD__REQUESTS = METHOD__REQUESTS;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_METHOD__RESPONSES = METHOD__RESPONSES;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_METHOD__HOOKS = METHOD__HOOKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_METHOD__NAME = METHOD__NAME;

	/**
	 * The number of structural features of the '<em>Read Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.UpdateMethodImpl <em>Update Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.UpdateMethodImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getUpdateMethod()
	 * @generated
	 */
	int UPDATE_METHOD = 13;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__REQUESTS = METHOD__REQUESTS;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__RESPONSES = METHOD__RESPONSES;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__HOOKS = METHOD__HOOKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD__NAME = METHOD__NAME;

	/**
	 * The number of structural features of the '<em>Update Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.DeleteMethodImpl <em>Delete Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.DeleteMethodImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getDeleteMethod()
	 * @generated
	 */
	int DELETE_METHOD = 14;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_METHOD__REQUESTS = METHOD__REQUESTS;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_METHOD__RESPONSES = METHOD__RESPONSES;

	/**
	 * The feature id for the '<em><b>Hooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_METHOD__HOOKS = METHOD__HOOKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_METHOD__NAME = METHOD__NAME;

	/**
	 * The number of structural features of the '<em>Delete Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.HookImpl <em>Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.HookImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getHook()
	 * @generated
	 */
	int HOOK = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOOK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.APIImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getAPI()
	 * @generated
	 */
	int API = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__NAME = 0;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__BELONGS_TO = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SERVICES = 2;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.ServerImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = REST_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__RESOURCES = REST_SERVICE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__LANGUAGES = REST_SERVICE__LANGUAGES;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__BELONGS_TO = REST_SERVICE__BELONGS_TO;

	/**
	 * The feature id for the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__BASE_URI = REST_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DATABASE = REST_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = REST_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.ClientImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = REST_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__RESOURCES = REST_SERVICE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__LANGUAGES = REST_SERVICE__LANGUAGES;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__BELONGS_TO = REST_SERVICE__BELONGS_TO;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = REST_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.DataBaseImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.SystemImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>AP Is</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__AP_IS = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.LanguageImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.JavaImpl <em>Java</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.JavaImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getJava()
	 * @generated
	 */
	int JAVA = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA__NAME = LANGUAGE__NAME;

	/**
	 * The number of structural features of the '<em>Java</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.PHPImpl <em>PHP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.PHPImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getPHP()
	 * @generated
	 */
	int PHP = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHP__NAME = LANGUAGE__NAME;

	/**
	 * The number of structural features of the '<em>PHP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHP_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.JavaScriptImpl <em>Java Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.JavaScriptImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getJavaScript()
	 * @generated
	 */
	int JAVA_SCRIPT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT__NAME = LANGUAGE__NAME;

	/**
	 * The number of structural features of the '<em>Java Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.MySqlImpl <em>My Sql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.MySqlImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getMySql()
	 * @generated
	 */
	int MY_SQL = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL__NAME = DATA_BASE__NAME;

	/**
	 * The number of structural features of the '<em>My Sql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_SQL_FEATURE_COUNT = DATA_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.sytematic.projects.REST.REST.impl.SqlServerImpl <em>Sql Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.sytematic.projects.REST.REST.impl.SqlServerImpl
	 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getSqlServer()
	 * @generated
	 */
	int SQL_SERVER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SERVER__NAME = DATA_BASE__NAME;

	/**
	 * The number of structural features of the '<em>Sql Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SERVER_FEATURE_COUNT = DATA_BASE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.RESTService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see nl.sytematic.projects.REST.REST.RESTService
	 * @generated
	 */
	EClass getRESTService();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.RESTService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.sytematic.projects.REST.REST.RESTService#getName()
	 * @see #getRESTService()
	 * @generated
	 */
	EAttribute getRESTService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.sytematic.projects.REST.REST.RESTService#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see nl.sytematic.projects.REST.REST.RESTService#getResources()
	 * @see #getRESTService()
	 * @generated
	 */
	EReference getRESTService_Resources();

	/**
	 * Returns the meta object for the reference '{@link nl.sytematic.projects.REST.REST.RESTService#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Languages</em>'.
	 * @see nl.sytematic.projects.REST.REST.RESTService#getLanguages()
	 * @see #getRESTService()
	 * @generated
	 */
	EReference getRESTService_Languages();

	/**
	 * Returns the meta object for the container reference '{@link nl.sytematic.projects.REST.REST.RESTService#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Belongs To</em>'.
	 * @see nl.sytematic.projects.REST.REST.RESTService#getBelongsTo()
	 * @see #getRESTService()
	 * @generated
	 */
	EReference getRESTService_BelongsTo();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see nl.sytematic.projects.REST.REST.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.sytematic.projects.REST.REST.Resource#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see nl.sytematic.projects.REST.REST.Resource#getMethods()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Methods();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.sytematic.projects.REST.REST.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.Resource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see nl.sytematic.projects.REST.REST.Resource#getPath()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Path();

	/**
	 * Returns the meta object for the container reference '{@link nl.sytematic.projects.REST.REST.Resource#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Belongs To</em>'.
	 * @see nl.sytematic.projects.REST.REST.Resource#getBelongsTo()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_BelongsTo();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see nl.sytematic.projects.REST.REST.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference '{@link nl.sytematic.projects.REST.REST.Method#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requests</em>'.
	 * @see nl.sytematic.projects.REST.REST.Method#getRequests()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Requests();

	/**
	 * Returns the meta object for the containment reference '{@link nl.sytematic.projects.REST.REST.Method#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responses</em>'.
	 * @see nl.sytematic.projects.REST.REST.Method#getResponses()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Responses();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.sytematic.projects.REST.REST.Method#getHooks <em>Hooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hooks</em>'.
	 * @see nl.sytematic.projects.REST.REST.Method#getHooks()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Hooks();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.sytematic.projects.REST.REST.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.HTTPRequest <em>HTTP Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Request</em>'.
	 * @see nl.sytematic.projects.REST.REST.HTTPRequest
	 * @generated
	 */
	EClass getHTTPRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.sytematic.projects.REST.REST.HTTPRequest#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see nl.sytematic.projects.REST.REST.HTTPRequest#getParameters()
	 * @see #getHTTPRequest()
	 * @generated
	 */
	EReference getHTTPRequest_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.HTTPRequest#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see nl.sytematic.projects.REST.REST.HTTPRequest#getExpression()
	 * @see #getHTTPRequest()
	 * @generated
	 */
	EAttribute getHTTPRequest_Expression();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.HTTPResponse <em>HTTP Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Response</em>'.
	 * @see nl.sytematic.projects.REST.REST.HTTPResponse
	 * @generated
	 */
	EClass getHTTPResponse();

	/**
	 * Returns the meta object for the reference '{@link nl.sytematic.projects.REST.REST.HTTPResponse#getMediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Media Type</em>'.
	 * @see nl.sytematic.projects.REST.REST.HTTPResponse#getMediaType()
	 * @see #getHTTPResponse()
	 * @generated
	 */
	EReference getHTTPResponse_MediaType();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.HTTPResponse#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see nl.sytematic.projects.REST.REST.HTTPResponse#getExpression()
	 * @see #getHTTPResponse()
	 * @generated
	 */
	EAttribute getHTTPResponse_Expression();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see nl.sytematic.projects.REST.REST.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.Parameter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see nl.sytematic.projects.REST.REST.Parameter#getExpression()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Expression();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Type</em>'.
	 * @see nl.sytematic.projects.REST.REST.MediaType
	 * @generated
	 */
	EClass getMediaType();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.MediaType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see nl.sytematic.projects.REST.REST.MediaType#getExpression()
	 * @see #getMediaType()
	 * @generated
	 */
	EAttribute getMediaType_Expression();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.JSONMediaType <em>JSON Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Media Type</em>'.
	 * @see nl.sytematic.projects.REST.REST.JSONMediaType
	 * @generated
	 */
	EClass getJSONMediaType();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.XMLMediaType <em>XML Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Media Type</em>'.
	 * @see nl.sytematic.projects.REST.REST.XMLMediaType
	 * @generated
	 */
	EClass getXMLMediaType();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.HTMLMediaType <em>HTML Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Media Type</em>'.
	 * @see nl.sytematic.projects.REST.REST.HTMLMediaType
	 * @generated
	 */
	EClass getHTMLMediaType();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.TEXTMediaType <em>TEXT Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEXT Media Type</em>'.
	 * @see nl.sytematic.projects.REST.REST.TEXTMediaType
	 * @generated
	 */
	EClass getTEXTMediaType();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.CreateMethod <em>Create Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Method</em>'.
	 * @see nl.sytematic.projects.REST.REST.CreateMethod
	 * @generated
	 */
	EClass getCreateMethod();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.ReadMethod <em>Read Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Method</em>'.
	 * @see nl.sytematic.projects.REST.REST.ReadMethod
	 * @generated
	 */
	EClass getReadMethod();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.UpdateMethod <em>Update Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Method</em>'.
	 * @see nl.sytematic.projects.REST.REST.UpdateMethod
	 * @generated
	 */
	EClass getUpdateMethod();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.DeleteMethod <em>Delete Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Method</em>'.
	 * @see nl.sytematic.projects.REST.REST.DeleteMethod
	 * @generated
	 */
	EClass getDeleteMethod();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.Hook <em>Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hook</em>'.
	 * @see nl.sytematic.projects.REST.REST.Hook
	 * @generated
	 */
	EClass getHook();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.Hook#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.sytematic.projects.REST.REST.Hook#getName()
	 * @see #getHook()
	 * @generated
	 */
	EAttribute getHook_Name();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.Hook#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see nl.sytematic.projects.REST.REST.Hook#isValue()
	 * @see #getHook()
	 * @generated
	 */
	EAttribute getHook_Value();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see nl.sytematic.projects.REST.REST.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.API#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.sytematic.projects.REST.REST.API#getName()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Name();

	/**
	 * Returns the meta object for the container reference '{@link nl.sytematic.projects.REST.REST.API#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Belongs To</em>'.
	 * @see nl.sytematic.projects.REST.REST.API#getBelongsTo()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_BelongsTo();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.sytematic.projects.REST.REST.API#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see nl.sytematic.projects.REST.REST.API#getServices()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Services();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see nl.sytematic.projects.REST.REST.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.Server#getBaseURI <em>Base URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URI</em>'.
	 * @see nl.sytematic.projects.REST.REST.Server#getBaseURI()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_BaseURI();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.sytematic.projects.REST.REST.Server#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database</em>'.
	 * @see nl.sytematic.projects.REST.REST.Server#getDatabase()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Database();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see nl.sytematic.projects.REST.REST.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see nl.sytematic.projects.REST.REST.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.DataBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.sytematic.projects.REST.REST.DataBase#getName()
	 * @see #getDataBase()
	 * @generated
	 */
	EAttribute getDataBase_Name();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see nl.sytematic.projects.REST.REST.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.sytematic.projects.REST.REST.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.sytematic.projects.REST.REST.System#getAPIs <em>AP Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AP Is</em>'.
	 * @see nl.sytematic.projects.REST.REST.System#getAPIs()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_APIs();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see nl.sytematic.projects.REST.REST.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link nl.sytematic.projects.REST.REST.Language#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.sytematic.projects.REST.REST.Language#getName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Name();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.Java <em>Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java</em>'.
	 * @see nl.sytematic.projects.REST.REST.Java
	 * @generated
	 */
	EClass getJava();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.PHP <em>PHP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PHP</em>'.
	 * @see nl.sytematic.projects.REST.REST.PHP
	 * @generated
	 */
	EClass getPHP();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.JavaScript <em>Java Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Script</em>'.
	 * @see nl.sytematic.projects.REST.REST.JavaScript
	 * @generated
	 */
	EClass getJavaScript();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.MySql <em>My Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Sql</em>'.
	 * @see nl.sytematic.projects.REST.REST.MySql
	 * @generated
	 */
	EClass getMySql();

	/**
	 * Returns the meta object for class '{@link nl.sytematic.projects.REST.REST.SqlServer <em>Sql Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Server</em>'.
	 * @see nl.sytematic.projects.REST.REST.SqlServer
	 * @generated
	 */
	EClass getSqlServer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RESTFactory getRESTFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.RESTServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.RESTServiceImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getRESTService()
		 * @generated
		 */
		EClass REST_SERVICE = eINSTANCE.getRESTService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_SERVICE__NAME = eINSTANCE.getRESTService_Name();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SERVICE__RESOURCES = eINSTANCE.getRESTService_Resources();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SERVICE__LANGUAGES = eINSTANCE.getRESTService_Languages();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SERVICE__BELONGS_TO = eINSTANCE.getRESTService_BelongsTo();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.ResourceImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__METHODS = eINSTANCE.getResource_Methods();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__PATH = eINSTANCE.getResource_Path();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__BELONGS_TO = eINSTANCE.getResource_BelongsTo();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.MethodImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__REQUESTS = eINSTANCE.getMethod_Requests();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RESPONSES = eINSTANCE.getMethod_Responses();

		/**
		 * The meta object literal for the '<em><b>Hooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__HOOKS = eINSTANCE.getMethod_Hooks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.HTTPRequestImpl <em>HTTP Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.HTTPRequestImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getHTTPRequest()
		 * @generated
		 */
		EClass HTTP_REQUEST = eINSTANCE.getHTTPRequest();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_REQUEST__PARAMETERS = eINSTANCE.getHTTPRequest_Parameters();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_REQUEST__EXPRESSION = eINSTANCE.getHTTPRequest_Expression();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.HTTPResponseImpl <em>HTTP Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.HTTPResponseImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getHTTPResponse()
		 * @generated
		 */
		EClass HTTP_RESPONSE = eINSTANCE.getHTTPResponse();

		/**
		 * The meta object literal for the '<em><b>Media Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_RESPONSE__MEDIA_TYPE = eINSTANCE.getHTTPResponse_MediaType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_RESPONSE__EXPRESSION = eINSTANCE.getHTTPResponse_Expression();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.ParameterImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__EXPRESSION = eINSTANCE.getParameter_Expression();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.MediaTypeImpl <em>Media Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.MediaTypeImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getMediaType()
		 * @generated
		 */
		EClass MEDIA_TYPE = eINSTANCE.getMediaType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_TYPE__EXPRESSION = eINSTANCE.getMediaType_Expression();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.JSONMediaTypeImpl <em>JSON Media Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.JSONMediaTypeImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getJSONMediaType()
		 * @generated
		 */
		EClass JSON_MEDIA_TYPE = eINSTANCE.getJSONMediaType();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.XMLMediaTypeImpl <em>XML Media Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.XMLMediaTypeImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getXMLMediaType()
		 * @generated
		 */
		EClass XML_MEDIA_TYPE = eINSTANCE.getXMLMediaType();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.HTMLMediaTypeImpl <em>HTML Media Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.HTMLMediaTypeImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getHTMLMediaType()
		 * @generated
		 */
		EClass HTML_MEDIA_TYPE = eINSTANCE.getHTMLMediaType();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.TEXTMediaTypeImpl <em>TEXT Media Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.TEXTMediaTypeImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getTEXTMediaType()
		 * @generated
		 */
		EClass TEXT_MEDIA_TYPE = eINSTANCE.getTEXTMediaType();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.CreateMethodImpl <em>Create Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.CreateMethodImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getCreateMethod()
		 * @generated
		 */
		EClass CREATE_METHOD = eINSTANCE.getCreateMethod();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.ReadMethodImpl <em>Read Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.ReadMethodImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getReadMethod()
		 * @generated
		 */
		EClass READ_METHOD = eINSTANCE.getReadMethod();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.UpdateMethodImpl <em>Update Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.UpdateMethodImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getUpdateMethod()
		 * @generated
		 */
		EClass UPDATE_METHOD = eINSTANCE.getUpdateMethod();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.DeleteMethodImpl <em>Delete Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.DeleteMethodImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getDeleteMethod()
		 * @generated
		 */
		EClass DELETE_METHOD = eINSTANCE.getDeleteMethod();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.HookImpl <em>Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.HookImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getHook()
		 * @generated
		 */
		EClass HOOK = eINSTANCE.getHook();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOOK__NAME = eINSTANCE.getHook_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOOK__VALUE = eINSTANCE.getHook_Value();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.APIImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__NAME = eINSTANCE.getAPI_Name();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__BELONGS_TO = eINSTANCE.getAPI_BelongsTo();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__SERVICES = eINSTANCE.getAPI_Services();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.ServerImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Base URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__BASE_URI = eINSTANCE.getServer_BaseURI();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__DATABASE = eINSTANCE.getServer_Database();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.ClientImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.DataBaseImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE__NAME = eINSTANCE.getDataBase_Name();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.SystemImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>AP Is</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__AP_IS = eINSTANCE.getSystem_APIs();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.LanguageImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.JavaImpl <em>Java</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.JavaImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getJava()
		 * @generated
		 */
		EClass JAVA = eINSTANCE.getJava();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.PHPImpl <em>PHP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.PHPImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getPHP()
		 * @generated
		 */
		EClass PHP = eINSTANCE.getPHP();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.JavaScriptImpl <em>Java Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.JavaScriptImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getJavaScript()
		 * @generated
		 */
		EClass JAVA_SCRIPT = eINSTANCE.getJavaScript();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.MySqlImpl <em>My Sql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.MySqlImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getMySql()
		 * @generated
		 */
		EClass MY_SQL = eINSTANCE.getMySql();

		/**
		 * The meta object literal for the '{@link nl.sytematic.projects.REST.REST.impl.SqlServerImpl <em>Sql Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.sytematic.projects.REST.REST.impl.SqlServerImpl
		 * @see nl.sytematic.projects.REST.REST.impl.RESTPackageImpl#getSqlServer()
		 * @generated
		 */
		EClass SQL_SERVER = eINSTANCE.getSqlServer();

	}

} //RESTPackage
