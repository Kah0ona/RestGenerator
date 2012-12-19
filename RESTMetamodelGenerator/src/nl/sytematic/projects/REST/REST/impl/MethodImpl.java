/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nl.sytematic.projects.REST.REST.impl;

import java.util.Collection;

import nl.sytematic.projects.REST.REST.HTTPRequest;
import nl.sytematic.projects.REST.REST.HTTPResponse;
import nl.sytematic.projects.REST.REST.Hook;
import nl.sytematic.projects.REST.REST.Method;
import nl.sytematic.projects.REST.REST.RESTPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sytematic.projects.REST.REST.impl.MethodImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.impl.MethodImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.impl.MethodImpl#getHooks <em>Hooks</em>}</li>
 *   <li>{@link nl.sytematic.projects.REST.REST.impl.MethodImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MethodImpl extends EObjectImpl implements Method {
	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected HTTPRequest requests;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected HTTPResponse responses;

	/**
	 * The cached value of the '{@link #getHooks() <em>Hooks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Hook> hooks;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPRequest getRequests() {
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequests(HTTPRequest newRequests, NotificationChain msgs) {
		HTTPRequest oldRequests = requests;
		requests = newRequests;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTPackage.METHOD__REQUESTS, oldRequests, newRequests);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequests(HTTPRequest newRequests) {
		if (newRequests != requests) {
			NotificationChain msgs = null;
			if (requests != null)
				msgs = ((InternalEObject)requests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTPackage.METHOD__REQUESTS, null, msgs);
			if (newRequests != null)
				msgs = ((InternalEObject)newRequests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTPackage.METHOD__REQUESTS, null, msgs);
			msgs = basicSetRequests(newRequests, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTPackage.METHOD__REQUESTS, newRequests, newRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPResponse getResponses() {
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponses(HTTPResponse newResponses, NotificationChain msgs) {
		HTTPResponse oldResponses = responses;
		responses = newResponses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTPackage.METHOD__RESPONSES, oldResponses, newResponses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponses(HTTPResponse newResponses) {
		if (newResponses != responses) {
			NotificationChain msgs = null;
			if (responses != null)
				msgs = ((InternalEObject)responses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTPackage.METHOD__RESPONSES, null, msgs);
			if (newResponses != null)
				msgs = ((InternalEObject)newResponses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTPackage.METHOD__RESPONSES, null, msgs);
			msgs = basicSetResponses(newResponses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTPackage.METHOD__RESPONSES, newResponses, newResponses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hook> getHooks() {
		if (hooks == null) {
			hooks = new EObjectContainmentEList<Hook>(Hook.class, this, RESTPackage.METHOD__HOOKS);
		}
		return hooks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTPackage.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTPackage.METHOD__REQUESTS:
				return basicSetRequests(null, msgs);
			case RESTPackage.METHOD__RESPONSES:
				return basicSetResponses(null, msgs);
			case RESTPackage.METHOD__HOOKS:
				return ((InternalEList<?>)getHooks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTPackage.METHOD__REQUESTS:
				return getRequests();
			case RESTPackage.METHOD__RESPONSES:
				return getResponses();
			case RESTPackage.METHOD__HOOKS:
				return getHooks();
			case RESTPackage.METHOD__NAME:
				return getName();
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
			case RESTPackage.METHOD__REQUESTS:
				setRequests((HTTPRequest)newValue);
				return;
			case RESTPackage.METHOD__RESPONSES:
				setResponses((HTTPResponse)newValue);
				return;
			case RESTPackage.METHOD__HOOKS:
				getHooks().clear();
				getHooks().addAll((Collection<? extends Hook>)newValue);
				return;
			case RESTPackage.METHOD__NAME:
				setName((String)newValue);
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
			case RESTPackage.METHOD__REQUESTS:
				setRequests((HTTPRequest)null);
				return;
			case RESTPackage.METHOD__RESPONSES:
				setResponses((HTTPResponse)null);
				return;
			case RESTPackage.METHOD__HOOKS:
				getHooks().clear();
				return;
			case RESTPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
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
			case RESTPackage.METHOD__REQUESTS:
				return requests != null;
			case RESTPackage.METHOD__RESPONSES:
				return responses != null;
			case RESTPackage.METHOD__HOOKS:
				return hooks != null && !hooks.isEmpty();
			case RESTPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //MethodImpl
