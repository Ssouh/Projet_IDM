/**
 */
package simplepdl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simplepdl.SimplepdlFactory;
import simplepdl.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkSequenceTest extends TestCase {

	/**
	 * The fixture for this Work Sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkSequence fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkSequenceTest.class);
	}

	/**
	 * Constructs a new Work Sequence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkSequenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Work Sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WorkSequence fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Work Sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkSequence getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplepdlFactory.eINSTANCE.createWorkSequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WorkSequenceTest
