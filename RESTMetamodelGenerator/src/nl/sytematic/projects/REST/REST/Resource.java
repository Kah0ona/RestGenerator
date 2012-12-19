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
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sytematic.projects.REST.REST.Resource#getMethods <em>Methods</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.Resource#getName <em>Name</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.Resource#getPath <em>Path</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.Resource#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sytematic.projects.REST.REST.RESTPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link nl.sytematic.projects.REST.REST.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getResource_Methods()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Method> getMethods();

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
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getResource_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.Resource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link nl.sytematic.projects.REST.REST.RESTService#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' container reference.
	 * @see #setBelongsTo(RESTService)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getResource_BelongsTo()
	 * @see nl.sytematic.projects.REST.REST.RESTService#getResources
	 * @model opposite="resources" required="true" transient="false"
	 * @generated
	 */
	RESTService getBelongsTo();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.Resource#getBelongsTo <em>Belongs To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' container reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(RESTService value);

} // Resource
