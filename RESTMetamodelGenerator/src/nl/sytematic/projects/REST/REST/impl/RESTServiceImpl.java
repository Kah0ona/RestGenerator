/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nl.sytematic.projects.REST.REST.impl;

import java.util.Collection;

import nl.sytematic.projects.REST.REST.API;
import nl.sytematic.projects.REST.REST.Language;
import nl.sytematic.projects.REST.REST.RESTPackage;
import nl.sytematic.projects.REST.REST.RESTService;
import nl.sytematic.projects.REST.REST.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sytematic.projects.REST.REST.impl.RESTServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.impl.RESTServiceImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.impl.RESTServiceImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.impl.RESTServiceImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RESTServiceImpl extends EObjectImpl implements RESTService {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected Language languages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTPackage.Literals.REST_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTPackage.REST_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, RESTPackage.REST_SERVICE__RESOURCES, RESTPackage.RESOURCE__BELONGS_TO);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLanguages() {
		if (languages != null && languages.eIsProxy()) {
			InternalEObject oldLanguages = (InternalEObject)languages;
			languages = (Language)eResolveProxy(oldLanguages);
			if (languages != oldLanguages) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTPackage.REST_SERVICE__LANGUAGES, oldLanguages, languages));
			}
		}
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language basicGetLanguages() {
		return languages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguages(Language newLanguages) {
		Language oldLanguages = languages;
		languages = newLanguages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTPackage.REST_SERVICE__LANGUAGES, oldLanguages, languages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API getBelongsTo() {
		if (eContainerFeatureID() != RESTPackage.REST_SERVICE__BELONGS_TO) return null;
		return (API)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsTo(API newBelongsTo, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBelongsTo, RESTPackage.REST_SERVICE__BELONGS_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(API newBelongsTo) {
		if (newBelongsTo != eInternalContainer() || (eContainerFeatureID() != RESTPackage.REST_SERVICE__BELONGS_TO && newBelongsTo != null)) {
			if (EcoreUtil.isAncestor(this, newBelongsTo))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBelongsTo != null)
				msgs = ((InternalEObject)newBelongsTo).eInverseAdd(this, RESTPackage.API__SERVICES, API.class, msgs);
			msgs = basicSetBelongsTo(newBelongsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTPackage.REST_SERVICE__BELONGS_TO, newBelongsTo, newBelongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTPackage.REST_SERVICE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case RESTPackage.REST_SERVICE__BELONGS_TO:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBelongsTo((API)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTPackage.REST_SERVICE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case RESTPackage.REST_SERVICE__BELONGS_TO:
				return basicSetBelongsTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RESTPackage.REST_SERVICE__BELONGS_TO:
				return eInternalContainer().eInverseRemove(this, RESTPackage.API__SERVICES, API.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTPackage.REST_SERVICE__NAME:
				return getName();
			case RESTPackage.REST_SERVICE__RESOURCES:
				return getResources();
			case RESTPackage.REST_SERVICE__LANGUAGES:
				if (resolve) return getLanguages();
				return basicGetLanguages();
			case RESTPackage.REST_SERVICE__BELONGS_TO:
				return getBelongsTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RESTPackage.REST_SERVICE__NAME:
				setName((String)newValue);
				return;
			case RESTPackage.REST_SERVICE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case RESTPackage.REST_SERVICE__LANGUAGES:
				setLanguages((Language)newValue);
				return;
			case RESTPackage.REST_SERVICE__BELONGS_TO:
				setBelongsTo((API)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RESTPackage.REST_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTPackage.REST_SERVICE__RESOURCES:
				getResources().clear();
				return;
			case RESTPackage.REST_SERVICE__LANGUAGES:
				setLanguages((Language)null);
				return;
			case RESTPackage.REST_SERVICE__BELONGS_TO:
				setBelongsTo((API)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RESTPackage.REST_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTPackage.REST_SERVICE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case RESTPackage.REST_SERVICE__LANGUAGES:
				return languages != null;
			case RESTPackage.REST_SERVICE__BELONGS_TO:
				return getBelongsTo() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RESTServiceImpl
