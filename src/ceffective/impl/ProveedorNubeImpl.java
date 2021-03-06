/**
 */
package ceffective.impl;

import ceffective.AmbienteDespliegue;
import ceffective.AutenticacionUsuario;
import ceffective.CeffectivePackage;
import ceffective.ProveedorNube;
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
 * An implementation of the model object '<em><b>Proveedor Nube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ceffective.impl.ProveedorNubeImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ceffective.impl.ProveedorNubeImpl#getAutenticacionUsuario <em>Autenticacion Usuario</em>}</li>
 *   <li>{@link ceffective.impl.ProveedorNubeImpl#getAmbientedespliegue <em>Ambientedespliegue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProveedorNubeImpl extends MinimalEObjectImpl.Container implements ProveedorNube {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAutenticacionUsuario() <em>Autenticacion Usuario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutenticacionUsuario()
	 * @generated
	 * @ordered
	 */
	protected EList<AutenticacionUsuario> autenticacionUsuario;

	/**
	 * The cached value of the '{@link #getAmbientedespliegue() <em>Ambientedespliegue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientedespliegue()
	 * @generated
	 * @ordered
	 */
	protected EList<AmbienteDespliegue> ambientedespliegue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProveedorNubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.PROVEEDOR_NUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.PROVEEDOR_NUBE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutenticacionUsuario> getAutenticacionUsuario() {
		if (autenticacionUsuario == null) {
			autenticacionUsuario = new EObjectContainmentEList<AutenticacionUsuario>(AutenticacionUsuario.class, this, CeffectivePackage.PROVEEDOR_NUBE__AUTENTICACION_USUARIO);
		}
		return autenticacionUsuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmbienteDespliegue> getAmbientedespliegue() {
		if (ambientedespliegue == null) {
			ambientedespliegue = new EObjectContainmentEList<AmbienteDespliegue>(AmbienteDespliegue.class, this, CeffectivePackage.PROVEEDOR_NUBE__AMBIENTEDESPLIEGUE);
		}
		return ambientedespliegue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CeffectivePackage.PROVEEDOR_NUBE__AUTENTICACION_USUARIO:
				return ((InternalEList<?>)getAutenticacionUsuario()).basicRemove(otherEnd, msgs);
			case CeffectivePackage.PROVEEDOR_NUBE__AMBIENTEDESPLIEGUE:
				return ((InternalEList<?>)getAmbientedespliegue()).basicRemove(otherEnd, msgs);
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
			case CeffectivePackage.PROVEEDOR_NUBE__NOMBRE:
				return getNombre();
			case CeffectivePackage.PROVEEDOR_NUBE__AUTENTICACION_USUARIO:
				return getAutenticacionUsuario();
			case CeffectivePackage.PROVEEDOR_NUBE__AMBIENTEDESPLIEGUE:
				return getAmbientedespliegue();
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
			case CeffectivePackage.PROVEEDOR_NUBE__NOMBRE:
				setNombre((String)newValue);
				return;
			case CeffectivePackage.PROVEEDOR_NUBE__AUTENTICACION_USUARIO:
				getAutenticacionUsuario().clear();
				getAutenticacionUsuario().addAll((Collection<? extends AutenticacionUsuario>)newValue);
				return;
			case CeffectivePackage.PROVEEDOR_NUBE__AMBIENTEDESPLIEGUE:
				getAmbientedespliegue().clear();
				getAmbientedespliegue().addAll((Collection<? extends AmbienteDespliegue>)newValue);
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
			case CeffectivePackage.PROVEEDOR_NUBE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CeffectivePackage.PROVEEDOR_NUBE__AUTENTICACION_USUARIO:
				getAutenticacionUsuario().clear();
				return;
			case CeffectivePackage.PROVEEDOR_NUBE__AMBIENTEDESPLIEGUE:
				getAmbientedespliegue().clear();
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
			case CeffectivePackage.PROVEEDOR_NUBE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CeffectivePackage.PROVEEDOR_NUBE__AUTENTICACION_USUARIO:
				return autenticacionUsuario != null && !autenticacionUsuario.isEmpty();
			case CeffectivePackage.PROVEEDOR_NUBE__AMBIENTEDESPLIEGUE:
				return ambientedespliegue != null && !ambientedespliegue.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ProveedorNubeImpl
