/**
 */
package ceffective.impl;

import ceffective.CeffectivePackage;
import ceffective.Recurso;
import ceffective.VPC;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ceffective.impl.RecursoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ceffective.impl.RecursoImpl#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 *   <li>{@link ceffective.impl.RecursoImpl#getZonaNombre <em>Zona Nombre</em>}</li>
 *   <li>{@link ceffective.impl.RecursoImpl#getVpc <em>Vpc</em>}</li>
 *   <li>{@link ceffective.impl.RecursoImpl#getId <em>Id</em>}</li>
 *   <li>{@link ceffective.impl.RecursoImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RecursoImpl extends MinimalEObjectImpl.Container implements Recurso {
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
	 * The default value of the '{@link #getZonaDisponibilidad() <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonaDisponibilidad()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONA_DISPONIBILIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZonaDisponibilidad() <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonaDisponibilidad()
	 * @generated
	 * @ordered
	 */
	protected String zonaDisponibilidad = ZONA_DISPONIBILIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getZonaNombre() <em>Zona Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonaNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONA_NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZonaNombre() <em>Zona Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonaNombre()
	 * @generated
	 * @ordered
	 */
	protected String zonaNombre = ZONA_NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVpc() <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected VPC vpc;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	protected RecursoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.RECURSO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.RECURSO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPC getVpc() {
		if (vpc != null && vpc.eIsProxy()) {
			InternalEObject oldVpc = (InternalEObject)vpc;
			vpc = (VPC)eResolveProxy(oldVpc);
			if (vpc != oldVpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CeffectivePackage.RECURSO__VPC, oldVpc, vpc));
			}
		}
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPC basicGetVpc() {
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpc(VPC newVpc) {
		VPC oldVpc = vpc;
		vpc = newVpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.RECURSO__VPC, oldVpc, vpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.RECURSO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.RECURSO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZonaDisponibilidad() {
		return zonaDisponibilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZonaDisponibilidad(String newZonaDisponibilidad) {
		String oldZonaDisponibilidad = zonaDisponibilidad;
		zonaDisponibilidad = newZonaDisponibilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.RECURSO__ZONA_DISPONIBILIDAD, oldZonaDisponibilidad, zonaDisponibilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZonaNombre() {
		return zonaNombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZonaNombre(String newZonaNombre) {
		String oldZonaNombre = zonaNombre;
		zonaNombre = newZonaNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.RECURSO__ZONA_NOMBRE, oldZonaNombre, zonaNombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.RECURSO__NOMBRE:
				return getNombre();
			case CeffectivePackage.RECURSO__ZONA_DISPONIBILIDAD:
				return getZonaDisponibilidad();
			case CeffectivePackage.RECURSO__ZONA_NOMBRE:
				return getZonaNombre();
			case CeffectivePackage.RECURSO__VPC:
				if (resolve) return getVpc();
				return basicGetVpc();
			case CeffectivePackage.RECURSO__ID:
				return getId();
			case CeffectivePackage.RECURSO__NAME:
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
			case CeffectivePackage.RECURSO__NOMBRE:
				setNombre((String)newValue);
				return;
			case CeffectivePackage.RECURSO__ZONA_DISPONIBILIDAD:
				setZonaDisponibilidad((String)newValue);
				return;
			case CeffectivePackage.RECURSO__ZONA_NOMBRE:
				setZonaNombre((String)newValue);
				return;
			case CeffectivePackage.RECURSO__VPC:
				setVpc((VPC)newValue);
				return;
			case CeffectivePackage.RECURSO__ID:
				setId((String)newValue);
				return;
			case CeffectivePackage.RECURSO__NAME:
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
			case CeffectivePackage.RECURSO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CeffectivePackage.RECURSO__ZONA_DISPONIBILIDAD:
				setZonaDisponibilidad(ZONA_DISPONIBILIDAD_EDEFAULT);
				return;
			case CeffectivePackage.RECURSO__ZONA_NOMBRE:
				setZonaNombre(ZONA_NOMBRE_EDEFAULT);
				return;
			case CeffectivePackage.RECURSO__VPC:
				setVpc((VPC)null);
				return;
			case CeffectivePackage.RECURSO__ID:
				setId(ID_EDEFAULT);
				return;
			case CeffectivePackage.RECURSO__NAME:
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
			case CeffectivePackage.RECURSO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CeffectivePackage.RECURSO__ZONA_DISPONIBILIDAD:
				return ZONA_DISPONIBILIDAD_EDEFAULT == null ? zonaDisponibilidad != null : !ZONA_DISPONIBILIDAD_EDEFAULT.equals(zonaDisponibilidad);
			case CeffectivePackage.RECURSO__ZONA_NOMBRE:
				return ZONA_NOMBRE_EDEFAULT == null ? zonaNombre != null : !ZONA_NOMBRE_EDEFAULT.equals(zonaNombre);
			case CeffectivePackage.RECURSO__VPC:
				return vpc != null;
			case CeffectivePackage.RECURSO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CeffectivePackage.RECURSO__NAME:
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", zonaDisponibilidad: ");
		result.append(zonaDisponibilidad);
		result.append(", zonaNombre: ");
		result.append(zonaNombre);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RecursoImpl
