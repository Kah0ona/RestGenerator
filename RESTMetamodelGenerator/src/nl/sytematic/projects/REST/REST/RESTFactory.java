/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nl.sytematic.projects.REST.REST;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.sytematic.projects.REST.REST.RESTPackage
 * @generated
 */
public interface RESTFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RESTFactory eINSTANCE = nl.sytematic.projects.REST.REST.impl.RESTFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>HTTP Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Request</em>'.
	 * @generated
	 */
	HTTPRequest createHTTPRequest();

	/**
	 * Returns a new object of class '<em>HTTP Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Response</em>'.
	 * @generated
	 */
	HTTPResponse createHTTPResponse();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>JSON Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JSON Media Type</em>'.
	 * @generated
	 */
	JSONMediaType createJSONMediaType();

	/**
	 * Returns a new object of class '<em>XML Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Media Type</em>'.
	 * @generated
	 */
	XMLMediaType createXMLMediaType();

	/**
	 * Returns a new object of class '<em>HTML Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Media Type</em>'.
	 * @generated
	 */
	HTMLMediaType createHTMLMediaType();

	/**
	 * Returns a new object of class '<em>TEXT Media Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEXT Media Type</em>'.
	 * @generated
	 */
	TEXTMediaType createTEXTMediaType();

	/**
	 * Returns a new object of class '<em>Create Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Method</em>'.
	 * @generated
	 */
	CreateMethod createCreateMethod();

	/**
	 * Returns a new object of class '<em>Read Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Method</em>'.
	 * @generated
	 */
	ReadMethod createReadMethod();

	/**
	 * Returns a new object of class '<em>Update Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Method</em>'.
	 * @generated
	 */
	UpdateMethod createUpdateMethod();

	/**
	 * Returns a new object of class '<em>Delete Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Method</em>'.
	 * @generated
	 */
	DeleteMethod createDeleteMethod();

	/**
	 * Returns a new object of class '<em>Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hook</em>'.
	 * @generated
	 */
	Hook createHook();

	/**
	 * Returns a new object of class '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API</em>'.
	 * @generated
	 */
	API createAPI();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Java</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java</em>'.
	 * @generated
	 */
	Java createJava();

	/**
	 * Returns a new object of class '<em>PHP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PHP</em>'.
	 * @generated
	 */
	PHP createPHP();

	/**
	 * Returns a new object of class '<em>Java Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Script</em>'.
	 * @generated
	 */
	JavaScript createJavaScript();

	/**
	 * Returns a new object of class '<em>My Sql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Sql</em>'.
	 * @generated
	 */
	MySql createMySql();

	/**
	 * Returns a new object of class '<em>Sql Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Server</em>'.
	 * @generated
	 */
	SqlServer createSqlServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RESTPackage getRESTPackage();

} //RESTFactory
