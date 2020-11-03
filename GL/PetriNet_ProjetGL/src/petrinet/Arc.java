/**
 */
package petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Arc#getPoid <em>Poid</em>}</li>
 *   <li>{@link petrinet.Arc#getType <em>Type</em>}</li>
 *   <li>{@link petrinet.Arc#getSource <em>Source</em>}</li>
 *   <li>{@link petrinet.Arc#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>Poid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poid</em>' attribute.
	 * @see #setPoid(int)
	 * @see petrinet.PetrinetPackage#getArc_Poid()
	 * @model required="true"
	 * @generated
	 */
	int getPoid();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getPoid <em>Poid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poid</em>' attribute.
	 * @see #getPoid()
	 * @generated
	 */
	void setPoid(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link petrinet.ArcType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see petrinet.ArcType
	 * @see #setType(ArcType)
	 * @see petrinet.PetrinetPackage#getArc_Type()
	 * @model
	 * @generated
	 */
	ArcType getType();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see petrinet.ArcType
	 * @see #getType()
	 * @generated
	 */
	void setType(ArcType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Noeud#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Noeud)
	 * @see petrinet.PetrinetPackage#getArc_Source()
	 * @see petrinet.Noeud#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Noeud getSource();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Noeud value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Noeud#getIngoing <em>Ingoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Noeud)
	 * @see petrinet.PetrinetPackage#getArc_Target()
	 * @see petrinet.Noeud#getIngoing
	 * @model opposite="ingoing" required="true"
	 * @generated
	 */
	Noeud getTarget();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Noeud value);

} // Arc
