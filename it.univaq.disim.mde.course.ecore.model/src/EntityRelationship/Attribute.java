/**
 */
package EntityRelationship;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EntityRelationship.Attribute#isIsPK <em>Is PK</em>}</li>
 *   <li>{@link EntityRelationship.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see EntityRelationship.EntityRelationshipPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is PK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is PK</em>' attribute.
	 * @see #setIsPK(boolean)
	 * @see EntityRelationship.EntityRelationshipPackage#getAttribute_IsPK()
	 * @model
	 * @generated
	 */
	boolean isIsPK();

	/**
	 * Sets the value of the '{@link EntityRelationship.Attribute#isIsPK <em>Is PK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is PK</em>' attribute.
	 * @see #isIsPK()
	 * @generated
	 */
	void setIsPK(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link EntityRelationship.PrimitiveTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see EntityRelationship.PrimitiveTypes
	 * @see #setType(PrimitiveTypes)
	 * @see EntityRelationship.EntityRelationshipPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	PrimitiveTypes getType();

	/**
	 * Sets the value of the '{@link EntityRelationship.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see EntityRelationship.PrimitiveTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveTypes value);

} // Attribute
