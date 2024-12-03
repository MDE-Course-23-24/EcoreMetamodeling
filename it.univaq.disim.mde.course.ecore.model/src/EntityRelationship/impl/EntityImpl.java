/**
 */
package EntityRelationship.impl;

import EntityRelationship.Attribute;
import EntityRelationship.Entity;
import EntityRelationship.EntityRelationshipPackage;
import EntityRelationship.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link EntityRelationship.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link EntityRelationship.impl.EntityImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link EntityRelationship.impl.EntityImpl#getIncomingRelationships <em>Incoming Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends NamedElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getIncomingRelationships() <em>Incoming Relationships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> incomingRelationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityRelationshipPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, EntityRelationshipPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, EntityRelationshipPackage.ENTITY__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getIncomingRelationships() {
		if (incomingRelationships == null) {
			incomingRelationships = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, EntityRelationshipPackage.ENTITY__INCOMING_RELATIONSHIPS, EntityRelationshipPackage.RELATIONSHIP__ENTITY);
		}
		return incomingRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityRelationshipPackage.ENTITY__INCOMING_RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingRelationships()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityRelationshipPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case EntityRelationshipPackage.ENTITY__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case EntityRelationshipPackage.ENTITY__INCOMING_RELATIONSHIPS:
				return ((InternalEList<?>)getIncomingRelationships()).basicRemove(otherEnd, msgs);
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
			case EntityRelationshipPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case EntityRelationshipPackage.ENTITY__RELATIONSHIPS:
				return getRelationships();
			case EntityRelationshipPackage.ENTITY__INCOMING_RELATIONSHIPS:
				return getIncomingRelationships();
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
			case EntityRelationshipPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EntityRelationshipPackage.ENTITY__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case EntityRelationshipPackage.ENTITY__INCOMING_RELATIONSHIPS:
				getIncomingRelationships().clear();
				getIncomingRelationships().addAll((Collection<? extends Relationship>)newValue);
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
			case EntityRelationshipPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case EntityRelationshipPackage.ENTITY__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case EntityRelationshipPackage.ENTITY__INCOMING_RELATIONSHIPS:
				getIncomingRelationships().clear();
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
			case EntityRelationshipPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case EntityRelationshipPackage.ENTITY__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case EntityRelationshipPackage.ENTITY__INCOMING_RELATIONSHIPS:
				return incomingRelationships != null && !incomingRelationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
