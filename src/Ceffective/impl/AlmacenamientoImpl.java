/**
 */
package Ceffective.impl;

import Ceffective.Almacenamiento;
import Ceffective.CeffectivePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Almacenamiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.impl.AlmacenamientoImpl#getTamanoInicial <em>Tamano Inicial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlmacenamientoImpl extends RecursoImpl implements Almacenamiento {
	/**
	 * The default value of the '{@link #getTamanoInicial() <em>Tamano Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanoInicial()
	 * @generated
	 * @ordered
	 */
	protected static final int TAMANO_INICIAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTamanoInicial() <em>Tamano Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanoInicial()
	 * @generated
	 * @ordered
	 */
	protected int tamanoInicial = TAMANO_INICIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlmacenamientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.ALMACENAMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTamanoInicial() {
		return tamanoInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTamanoInicial(int newTamanoInicial) {
		int oldTamanoInicial = tamanoInicial;
		tamanoInicial = newTamanoInicial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.ALMACENAMIENTO__TAMANO_INICIAL, oldTamanoInicial, tamanoInicial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.ALMACENAMIENTO__TAMANO_INICIAL:
				return getTamanoInicial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CeffectivePackage.ALMACENAMIENTO__TAMANO_INICIAL:
				setTamanoInicial((Integer)newValue);
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
			case CeffectivePackage.ALMACENAMIENTO__TAMANO_INICIAL:
				setTamanoInicial(TAMANO_INICIAL_EDEFAULT);
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
			case CeffectivePackage.ALMACENAMIENTO__TAMANO_INICIAL:
				return tamanoInicial != TAMANO_INICIAL_EDEFAULT;
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
		result.append(" (tamanoInicial: ");
		result.append(tamanoInicial);
		result.append(')');
		return result.toString();
	}

} //AlmacenamientoImpl