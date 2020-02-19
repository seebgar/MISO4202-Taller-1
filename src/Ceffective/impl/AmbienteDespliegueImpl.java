/**
 */
package Ceffective.impl;

import Ceffective.AmbienteDespliegue;
import Ceffective.CeffectivePackage;
import Ceffective.Recurso;
import Ceffective.TipoAmbiente;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ambiente Despliegue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.impl.AmbienteDespliegueImpl#getAmbiente <em>Ambiente</em>}</li>
 *   <li>{@link Ceffective.impl.AmbienteDespliegueImpl#getRecursos <em>Recursos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmbienteDespliegueImpl extends MinimalEObjectImpl.Container implements AmbienteDespliegue {
	/**
	 * The default value of the '{@link #getAmbiente() <em>Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbiente()
	 * @generated
	 * @ordered
	 */
	protected static final TipoAmbiente AMBIENTE_EDEFAULT = TipoAmbiente.IST;

	/**
	 * The cached value of the '{@link #getAmbiente() <em>Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbiente()
	 * @generated
	 * @ordered
	 */
	protected TipoAmbiente ambiente = AMBIENTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecursos() <em>Recursos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursos()
	 * @generated
	 * @ordered
	 */
	protected EList<Recurso> recursos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmbienteDespliegueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.AMBIENTE_DESPLIEGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoAmbiente getAmbiente() {
		return ambiente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmbiente(TipoAmbiente newAmbiente) {
		TipoAmbiente oldAmbiente = ambiente;
		ambiente = newAmbiente == null ? AMBIENTE_EDEFAULT : newAmbiente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.AMBIENTE_DESPLIEGUE__AMBIENTE, oldAmbiente, ambiente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Recurso> getRecursos() {
		if (recursos == null) {
			recursos = new EObjectContainmentEList<Recurso>(Recurso.class, this, CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS);
		}
		return recursos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS:
				return ((InternalEList<?>)getRecursos()).basicRemove(otherEnd, msgs);
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
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__AMBIENTE:
				return getAmbiente();
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS:
				return getRecursos();
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
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__AMBIENTE:
				setAmbiente((TipoAmbiente)newValue);
				return;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS:
				getRecursos().clear();
				getRecursos().addAll((Collection<? extends Recurso>)newValue);
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
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__AMBIENTE:
				setAmbiente(AMBIENTE_EDEFAULT);
				return;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS:
				getRecursos().clear();
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
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__AMBIENTE:
				return ambiente != AMBIENTE_EDEFAULT;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS:
				return recursos != null && !recursos.isEmpty();
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
		result.append(" (ambiente: ");
		result.append(ambiente);
		result.append(')');
		return result.toString();
	}

} //AmbienteDespliegueImpl