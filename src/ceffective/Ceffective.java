/**
 */
package ceffective;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ceffective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ceffective.Ceffective#getProveedorNube <em>Proveedor Nube</em>}</li>
 *   <li>{@link ceffective.Ceffective#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see ceffective.CeffectivePackage#getCeffective()
 * @model
 * @generated
 */
public interface Ceffective extends EObject {
	/**
	 * Returns the value of the '<em><b>Proveedor Nube</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proveedor Nube</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proveedor Nube</em>' containment reference.
	 * @see #setProveedorNube(ProveedorNube)
	 * @see ceffective.CeffectivePackage#getCeffective_ProveedorNube()
	 * @model containment="true"
	 * @generated
	 */
	ProveedorNube getProveedorNube();

	/**
	 * Sets the value of the '{@link ceffective.Ceffective#getProveedorNube <em>Proveedor Nube</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proveedor Nube</em>' containment reference.
	 * @see #getProveedorNube()
	 * @generated
	 */
	void setProveedorNube(ProveedorNube value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ceffective.CeffectivePackage#getCeffective_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ceffective.Ceffective#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Ceffective
