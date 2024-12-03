/**
 */
package EntityRelationship;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EntityRelationship.Relationship#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link EntityRelationship.Relationship#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see EntityRelationship.EntityRelationshipPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link EntityRelationship.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see EntityRelationship.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see EntityRelationship.EntityRelationshipPackage#getRelationship_Cardinality()
	 * @model
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link EntityRelationship.Relationship#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see EntityRelationship.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link EntityRelationship.Entity#getIncomingRelationships <em>Incoming Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see EntityRelationship.EntityRelationshipPackage#getRelationship_Entity()
	 * @see EntityRelationship.Entity#getIncomingRelationships
	 * @model opposite="incomingRelationships" required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link EntityRelationship.Relationship#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Relationship
