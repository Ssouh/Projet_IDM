/**
 * generated by Xtext 2.17.1
 */
package project.simple.pDL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import project.simple.pDL.Guidance;
import project.simple.pDL.PDLFactory;
import project.simple.pDL.PDLPackage;
import project.simple.pDL.Resource;
import project.simple.pDL.WorkDefinition;
import project.simple.pDL.WorkSequence;
import project.simple.pDL.WorkSequenceType;
import project.simple.pDL.parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDLFactoryImpl extends EFactoryImpl implements PDLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PDLFactory init()
  {
    try
    {
      PDLFactory thePDLFactory = (PDLFactory)EPackage.Registry.INSTANCE.getEFactory(PDLPackage.eNS_URI);
      if (thePDLFactory != null)
      {
        return thePDLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PDLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PDLPackage.PROCESS: return createProcess();
      case PDLPackage.WORK_DEFINITION: return createWorkDefinition();
      case PDLPackage.WORK_SEQUENCE: return createWorkSequence();
      case PDLPackage.GUIDANCE: return createGuidance();
      case PDLPackage.RESOURCE: return createResource();
      case PDLPackage.PARAMETER: return createparameter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PDLPackage.WORK_SEQUENCE_TYPE:
        return createWorkSequenceTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PDLPackage.WORK_SEQUENCE_TYPE:
        return convertWorkSequenceTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public project.simple.pDL.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WorkDefinition createWorkDefinition()
  {
    WorkDefinitionImpl workDefinition = new WorkDefinitionImpl();
    return workDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WorkSequence createWorkSequence()
  {
    WorkSequenceImpl workSequence = new WorkSequenceImpl();
    return workSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Guidance createGuidance()
  {
    GuidanceImpl guidance = new GuidanceImpl();
    return guidance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public parameter createparameter()
  {
    parameterImpl parameter = new parameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSequenceType createWorkSequenceTypeFromString(EDataType eDataType, String initialValue)
  {
    WorkSequenceType result = WorkSequenceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWorkSequenceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PDLPackage getPDLPackage()
  {
    return (PDLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PDLPackage getPackage()
  {
    return PDLPackage.eINSTANCE;
  }

} //PDLFactoryImpl
