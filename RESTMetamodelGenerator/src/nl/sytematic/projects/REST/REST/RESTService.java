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
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sytematic.projects.REST.REST.RESTService#getName <em>Name</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.RESTService#getResources <em>Resources</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.RESTService#getLanguages <em>Languages</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.RESTService#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sytematic.projects.REST.REST.RESTPackage#getRESTService()
 * @model abstract="true"
 * @generated
 */
public interface RESTService extends EObject {
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
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getRESTService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.RESTService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link nl.sytematic.projects.REST.REST.Resource}.
	 * It is bidirectional and its opposite is '{@link nl.sytematic.projects.REST.REST.Resource#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getRESTService_Resources()
	 * @see nl.sytematic.projects.REST.REST.Resource#getBelongsTo
	 * @model opposite="belongsTo" containment="true" required="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languages</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' reference.
	 * @see #setLanguages(Language)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getRESTService_Languages()
	 * @model required="true"
	 * @generated
	 */
	Language getLanguages();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.RESTService#getLanguages <em>Languages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Languages</em>' reference.
	 * @see #getLanguages()
	 * @generated
	 */
	void setLanguages(Language value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link nl.sytematic.projects.REST.REST.API#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' container reference.
	 * @see #setBelongsTo(API)
	 * @see nl.sytematic.projects.REST.REST.RESTPackage#getRESTService_BelongsTo()
	 * @see nl.sytematic.projects.REST.REST.API#getServices
	 * @model opposite="services" required="true" transient="false"
	 * @generated
	 */
	API getBelongsTo();

	/**
	 * Sets the value of the '{@link nl.sytematic.projects.REST.REST.RESTService#getBelongsTo <em>Belongs To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' container reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(API value);

} // RESTService
