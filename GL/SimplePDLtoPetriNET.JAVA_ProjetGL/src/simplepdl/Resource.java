/**
 */
package simplepdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Resource#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.Resource#getOccuranceNb <em>Occurance Nb</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Occurance Nb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurance Nb</em>' attribute.
	 * @see #setOccuranceNb(int)
	 * @see simplepdl.SimplepdlPackage#getResource_OccuranceNb()
	 * @model
	 * @generated
	 */
	int getOccuranceNb();

	/**
	 * Sets the value of the '{@link simplepdl.Resource#getOccuranceNb <em>Occurance Nb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurance Nb</em>' attribute.
	 * @see #getOccuranceNb()
	 * @generated
	 */
	void setOccuranceNb(int value);

} // Resource
