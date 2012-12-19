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
 * A representation of the model object '<em><b>HTTP Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sytematic.projects.REST.REST.HTTPRequest#getParameters <em>Parameters</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.HTTPRequest#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sytematic.projects.REST.REST.RESTPackage#getHTTPRequest()
 * @model
 * @generated
 */
public interface HTTPRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link nl.sytematic.projects.REST.REST.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getHTTPRequest_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getHTTPRequest_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.HTTPRequest#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // HTTPRequest
