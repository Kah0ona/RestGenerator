/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nl.sytematic.projects.REST.REST;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sytematic.projects.REST.REST.Server#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.Server#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sytematic.projects.REST.REST.RESTPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends RESTService {
	/**
	 * Returns the value of the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URI</em>' attribute.
	 * @see #setBaseURI(String)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getServer_BaseURI()
	 * @model
	 * @generated
	 */
	String getBaseURI();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.Server#getBaseURI <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URI</em>' attribute.
	 * @see #getBaseURI()
	 * @generated
	 */
	void setBaseURI(String value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference list.
	 * The list contents are of type {@link nl.sytematic.projects.REST.REST.DataBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference list.
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getServer_Database()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataBase> getDatabase();

} // Server
