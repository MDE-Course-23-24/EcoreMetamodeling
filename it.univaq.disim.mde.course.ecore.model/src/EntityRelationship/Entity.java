/**
 */
package EntityRelationship;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EntityRelationship.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link EntityRelationship.Entity#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link EntityRelationship.Entity#getIncomingRelationships <em>Incoming Relationships</em>}</li>
 * </ul>
 *
 * @see EntityRelationship.EntityRelationshipPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link EntityRelationship.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see EntityRelationship.EntityRelationshipPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link EntityRelationship.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see EntityRelationship.EntityRelationshipPackage#getEntity_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Incoming Relationships</b></em>' reference list.
	 * The list contents are of type {@link EntityRelationship.Relationship}.
	 * It is bidirectional and its opposite is '{@link EntityRelationship.Relationship#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Relationships</em>' reference list.
	 * @see EntityRelationship.EntityRelationshipPackage#getEntity_IncomingRelationships()
	 * @see EntityRelationship.Relationship#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	EList<Relationship> getIncomingRelationships();

} // Entity
