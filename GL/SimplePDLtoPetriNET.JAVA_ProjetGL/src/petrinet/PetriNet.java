/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.PetriNet#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.PetriNet#getNoeud <em>Noeud</em>}</li>
 *   <li>{@link petrinet.PetriNet#getArc <em>Arc</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getPetriNet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.PetriNet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Noeud</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Noeud}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noeud</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetriNet_Noeud()
	 * @model containment="true"
	 * @generated
	 */
	EList<Noeud> getNoeud();

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetriNet_Arc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArc();

} // PetriNet
