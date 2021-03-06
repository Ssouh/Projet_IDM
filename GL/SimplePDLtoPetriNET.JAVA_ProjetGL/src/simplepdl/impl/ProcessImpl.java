/**
 */
package simplepdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplepdl.Guidance;
import simplepdl.Resource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.impl.ProcessImpl#getWorkDefinitions <em>Work Definitions</em>}</li>
 *   <li>{@link simplepdl.impl.ProcessImpl#getWorkSequences <em>Work Sequences</em>}</li>
 *   <li>{@link simplepdl.impl.ProcessImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link simplepdl.impl.ProcessImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements simplepdl.Process {
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
	 * The cached value of the '{@link #getWorkDefinitions() <em>Work Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkDefinition> workDefinitions;

	/**
	 * The cached value of the '{@link #getWorkSequences() <em>Work Sequences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> workSequences;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected EList<Guidance> guidance;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.PROCESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkDefinition> getWorkDefinitions() {
		if (workDefinitions == null) {
			workDefinitions = new EObjectContainmentEList<WorkDefinition>(WorkDefinition.class, this, SimplepdlPackage.PROCESS__WORK_DEFINITIONS);
		}
		return workDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkSequence> getWorkSequences() {
		if (workSequences == null) {
			workSequences = new EObjectContainmentEList<WorkSequence>(WorkSequence.class, this, SimplepdlPackage.PROCESS__WORK_SEQUENCES);
		}
		return workSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guidance> getGuidance() {
		if (guidance == null) {
			guidance = new EObjectContainmentEList<Guidance>(Guidance.class, this, SimplepdlPackage.PROCESS__GUIDANCE);
		}
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<Resource>(Resource.class, this, SimplepdlPackage.PROCESS__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.PROCESS__WORK_DEFINITIONS:
				return ((InternalEList<?>)getWorkDefinitions()).basicRemove(otherEnd, msgs);
			case SimplepdlPackage.PROCESS__WORK_SEQUENCES:
				return ((InternalEList<?>)getWorkSequences()).basicRemove(otherEnd, msgs);
			case SimplepdlPackage.PROCESS__GUIDANCE:
				return ((InternalEList<?>)getGuidance()).basicRemove(otherEnd, msgs);
			case SimplepdlPackage.PROCESS__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
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
			case SimplepdlPackage.PROCESS__NAME:
				return getName();
			case SimplepdlPackage.PROCESS__WORK_DEFINITIONS:
				return getWorkDefinitions();
			case SimplepdlPackage.PROCESS__WORK_SEQUENCES:
				return getWorkSequences();
			case SimplepdlPackage.PROCESS__GUIDANCE:
				return getGuidance();
			case SimplepdlPackage.PROCESS__RESOURCE:
				return getResource();
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
			case SimplepdlPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case SimplepdlPackage.PROCESS__WORK_DEFINITIONS:
				getWorkDefinitions().clear();
				getWorkDefinitions().addAll((Collection<? extends WorkDefinition>)newValue);
				return;
			case SimplepdlPackage.PROCESS__WORK_SEQUENCES:
				getWorkSequences().clear();
				getWorkSequences().addAll((Collection<? extends WorkSequence>)newValue);
				return;
			case SimplepdlPackage.PROCESS__GUIDANCE:
				getGuidance().clear();
				getGuidance().addAll((Collection<? extends Guidance>)newValue);
				return;
			case SimplepdlPackage.PROCESS__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends Resource>)newValue);
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
			case SimplepdlPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimplepdlPackage.PROCESS__WORK_DEFINITIONS:
				getWorkDefinitions().clear();
				return;
			case SimplepdlPackage.PROCESS__WORK_SEQUENCES:
				getWorkSequences().clear();
				return;
			case SimplepdlPackage.PROCESS__GUIDANCE:
				getGuidance().clear();
				return;
			case SimplepdlPackage.PROCESS__RESOURCE:
				getResource().clear();
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
			case SimplepdlPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimplepdlPackage.PROCESS__WORK_DEFINITIONS:
				return workDefinitions != null && !workDefinitions.isEmpty();
			case SimplepdlPackage.PROCESS__WORK_SEQUENCES:
				return workSequences != null && !workSequences.isEmpty();
			case SimplepdlPackage.PROCESS__GUIDANCE:
				return guidance != null && !guidance.isEmpty();
			case SimplepdlPackage.PROCESS__RESOURCE:
				return resource != null && !resource.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
