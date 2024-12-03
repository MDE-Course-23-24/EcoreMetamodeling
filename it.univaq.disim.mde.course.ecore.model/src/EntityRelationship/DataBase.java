/**
 */
package EntityRelationship;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EntityRelationship.DataBase#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see EntityRelationship.EntityRelationshipPackage#getDataBase()
 * @model
 * @generated
 */
public interface DataBase extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link EntityRelationship.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see EntityRelationship.EntityRelationshipPackage#getDataBase_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

} // DataBase
