/**
 */
package ceffective;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Almacenamiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ceffective.Almacenamiento#getTamanoInicial <em>Tamano Inicial</em>}</li>
 * </ul>
 *
 * @see ceffective.CeffectivePackage#getAlmacenamiento()
 * @model
 * @generated
 */
public interface Almacenamiento extends Recurso {
	/**
	 * Returns the value of the '<em><b>Tamano Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamano Inicial</em>' attribute.
	 * @see #setTamanoInicial(int)
	 * @see ceffective.CeffectivePackage#getAlmacenamiento_TamanoInicial()
	 * @model
	 * @generated
	 */
	int getTamanoInicial();

	/**
	 * Sets the value of the '{@link ceffective.Almacenamiento#getTamanoInicial <em>Tamano Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tamano Inicial</em>' attribute.
	 * @see #getTamanoInicial()
	 * @generated
	 */
	void setTamanoInicial(int value);

} // Almacenamiento