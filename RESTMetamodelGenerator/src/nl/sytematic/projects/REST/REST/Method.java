/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nl.sytematic.projects.REST.REST;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sytematic.projects.REST.REST.Method#getRequests <em>Requests</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.Method#getResponses <em>Responses</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.Method#getHooks <em>Hooks</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.Method#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sytematic.projects.REST.REST.RESTPackage#getMethod()
 * @model abstract="true"
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' containment reference.
	 * @see #setRequests(HTTPRequest)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getMethod_Requests()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HTTPRequest getRequests();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.Method#getRequests <em>Requests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requests</em>' containment reference.
	 * @see #getRequests()
	 * @generated
	 */
	void setRequests(HTTPRequest value);

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference.
	 * @see #setResponses(HTTPResponse)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getMethod_Responses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HTTPResponse getResponses();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.Method#getResponses <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responses</em>' containment reference.
	 * @see #getResponses()
	 * @generated
	 */
	void setResponses(HTTPResponse value);

	/**
	 * Returns the value of the '<em><b>Hooks</b></em>' containment reference list.
	 * The list contents are of type {@link nl.sytematic.projects.REST.REST.Hook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hooks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hooks</em>' containment reference list.
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getMethod_Hooks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hook> getHooks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Method
