/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nl.sytematic.projects.REST.REST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sytematic.projects.REST.REST.HTTPResponse#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.HTTPResponse#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sytematic.projects.REST.REST.RESTPackage#getHTTPResponse()
 * @model
 * @generated
 */
public interface HTTPResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Type</em>' reference.
	 * @see #setMediaType(MediaType)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getHTTPResponse_MediaType()
	 * @model required="true"
	 * @generated
	 */
	MediaType getMediaType();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.HTTPResponse#getMediaType <em>Media Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' reference.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(MediaType value);

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
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getHTTPResponse_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.HTTPResponse#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // HTTPResponse
