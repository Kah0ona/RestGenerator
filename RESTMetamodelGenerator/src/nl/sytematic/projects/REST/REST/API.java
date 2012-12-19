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
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sytematic.projects.REST.REST.API#getName <em>Name</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.API#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.API#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sytematic.projects.REST.REST.RESTPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends EObject {
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
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getAPI_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.API#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link nl.sytematic.projects.REST.REST.System#getAPIs <em>AP Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' container reference.
	 * @see #setBelongsTo(nl.sytematic.projects.REST.REST.System)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getAPI_BelongsTo()
	 * @see nl.sytematic.projects.REST.REST.System#getAPIs
	 * @model opposite="APIs" required="true" transient="false"
	 * @generated
	 */
	nl.sytematic.projects.REST.REST.System getBelongsTo();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.API#getBelongsTo <em>Belongs To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' container reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(nl.sytematic.projects.REST.REST.System value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link nl.sytematic.projects.REST.REST.RESTService}.
	 * It is bidirectional and its opposite is '{@link nl.sytematic.projects.REST.REST.RESTService#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getAPI_Services()
	 * @see nl.sytematic.projects.REST.REST.RESTService#getBelongsTo
	 * @model opposite="belongsTo" containment="true" required="true"
	 * @generated
	 */
	EList<RESTService> getServices();

} // API
