/**
 */
package com.robotoworks.mechanoid.net.netModel.util;

import com.robotoworks.mechanoid.net.netModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.robotoworks.mechanoid.net.netModel.NetModelPackage
 * @generated
 */
public class NetModelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NetModelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetModelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = NetModelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case NetModelPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.CLIENT:
      {
        Client client = (Client)theEObject;
        T result = caseClient(client);
        if (result == null) result = caseDeclaration(client);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.HTTP_METHOD:
      {
        HttpMethod httpMethod = (HttpMethod)theEObject;
        T result = caseHttpMethod(httpMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.HTTP_POST:
      {
        HttpPost httpPost = (HttpPost)theEObject;
        T result = caseHttpPost(httpPost);
        if (result == null) result = caseHttpMethod(httpPost);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.HTTP_PUT:
      {
        HttpPut httpPut = (HttpPut)theEObject;
        T result = caseHttpPut(httpPut);
        if (result == null) result = caseHttpMethod(httpPut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.HTTP_GET:
      {
        HttpGet httpGet = (HttpGet)theEObject;
        T result = caseHttpGet(httpGet);
        if (result == null) result = caseHttpMethod(httpGet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.HTTP_DELETE:
      {
        HttpDelete httpDelete = (HttpDelete)theEObject;
        T result = caseHttpDelete(httpDelete);
        if (result == null) result = caseHttpMethod(httpDelete);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.PARAMS_BLOCK:
      {
        ParamsBlock paramsBlock = (ParamsBlock)theEObject;
        T result = caseParamsBlock(paramsBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.BODY_BLOCK:
      {
        BodyBlock bodyBlock = (BodyBlock)theEObject;
        T result = caseBodyBlock(bodyBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.RESPONSE_BLOCK:
      {
        ResponseBlock responseBlock = (ResponseBlock)theEObject;
        T result = caseResponseBlock(responseBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.BLOCK_TYPE:
      {
        BlockType blockType = (BlockType)theEObject;
        T result = caseBlockType(blockType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.MEMBER:
      {
        Member member = (Member)theEObject;
        T result = caseMember(member);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.TYPED_MEMBER:
      {
        TypedMember typedMember = (TypedMember)theEObject;
        T result = caseTypedMember(typedMember);
        if (result == null) result = caseMember(typedMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.ID_NAMED_MEMBER:
      {
        IDNamedMember idNamedMember = (IDNamedMember)theEObject;
        T result = caseIDNamedMember(idNamedMember);
        if (result == null) result = caseTypedMember(idNamedMember);
        if (result == null) result = caseMember(idNamedMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.STRING_NAMED_MEMBER:
      {
        StringNamedMember stringNamedMember = (StringNamedMember)theEObject;
        T result = caseStringNamedMember(stringNamedMember);
        if (result == null) result = caseTypedMember(stringNamedMember);
        if (result == null) result = caseMember(stringNamedMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.SKIP_MEMBER:
      {
        SkipMember skipMember = (SkipMember)theEObject;
        T result = caseSkipMember(skipMember);
        if (result == null) result = caseMember(skipMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.SIMPLE_MEMBER:
      {
        SimpleMember simpleMember = (SimpleMember)theEObject;
        T result = caseSimpleMember(simpleMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.ID_NAMED_SIMPLE_MEMBER:
      {
        IDNamedSimpleMember idNamedSimpleMember = (IDNamedSimpleMember)theEObject;
        T result = caseIDNamedSimpleMember(idNamedSimpleMember);
        if (result == null) result = caseSimpleMember(idNamedSimpleMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.STRING_NAMED_SIMPLE_MEMBER:
      {
        StringNamedSimpleMember stringNamedSimpleMember = (StringNamedSimpleMember)theEObject;
        T result = caseStringNamedSimpleMember(stringNamedSimpleMember);
        if (result == null) result = caseSimpleMember(stringNamedSimpleMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseBlockType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.GENERIC_LIST_TYPE:
      {
        GenericListType genericListType = (GenericListType)theEObject;
        T result = caseGenericListType(genericListType);
        if (result == null) result = caseType(genericListType);
        if (result == null) result = caseBlockType(genericListType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.USER_TYPE:
      {
        UserType userType = (UserType)theEObject;
        T result = caseUserType(userType);
        if (result == null) result = caseType(userType);
        if (result == null) result = caseBlockType(userType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.USER_TYPE_DECLARATION:
      {
        UserTypeDeclaration userTypeDeclaration = (UserTypeDeclaration)theEObject;
        T result = caseUserTypeDeclaration(userTypeDeclaration);
        if (result == null) result = caseDeclaration(userTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.COMPLEX_TYPE_DECLARATION:
      {
        ComplexTypeDeclaration complexTypeDeclaration = (ComplexTypeDeclaration)theEObject;
        T result = caseComplexTypeDeclaration(complexTypeDeclaration);
        if (result == null) result = caseUserTypeDeclaration(complexTypeDeclaration);
        if (result == null) result = caseDeclaration(complexTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.ENUM_TYPE_DECLARATION:
      {
        EnumTypeDeclaration enumTypeDeclaration = (EnumTypeDeclaration)theEObject;
        T result = caseEnumTypeDeclaration(enumTypeDeclaration);
        if (result == null) result = caseUserTypeDeclaration(enumTypeDeclaration);
        if (result == null) result = caseDeclaration(enumTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.ENUM_TYPE_LITERAL:
      {
        EnumTypeLiteral enumTypeLiteral = (EnumTypeLiteral)theEObject;
        T result = caseEnumTypeLiteral(enumTypeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.ENUM_MEMBER:
      {
        EnumMember enumMember = (EnumMember)theEObject;
        T result = caseEnumMember(enumMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.COMPLEX_TYPE_LITERAL:
      {
        ComplexTypeLiteral complexTypeLiteral = (ComplexTypeLiteral)theEObject;
        T result = caseComplexTypeLiteral(complexTypeLiteral);
        if (result == null) result = caseBlockType(complexTypeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.INTRINSIC_TYPE:
      {
        IntrinsicType intrinsicType = (IntrinsicType)theEObject;
        T result = caseIntrinsicType(intrinsicType);
        if (result == null) result = caseType(intrinsicType);
        if (result == null) result = caseBlockType(intrinsicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.STRING_TYPE:
      {
        StringType stringType = (StringType)theEObject;
        T result = caseStringType(stringType);
        if (result == null) result = caseIntrinsicType(stringType);
        if (result == null) result = caseType(stringType);
        if (result == null) result = caseBlockType(stringType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.BOOLEAN_TYPE:
      {
        BooleanType booleanType = (BooleanType)theEObject;
        T result = caseBooleanType(booleanType);
        if (result == null) result = caseIntrinsicType(booleanType);
        if (result == null) result = caseType(booleanType);
        if (result == null) result = caseBlockType(booleanType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.NUMERIC_TYPE:
      {
        NumericType numericType = (NumericType)theEObject;
        T result = caseNumericType(numericType);
        if (result == null) result = caseIntrinsicType(numericType);
        if (result == null) result = caseType(numericType);
        if (result == null) result = caseBlockType(numericType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.INTEGER_TYPE:
      {
        IntegerType integerType = (IntegerType)theEObject;
        T result = caseIntegerType(integerType);
        if (result == null) result = caseNumericType(integerType);
        if (result == null) result = caseIntrinsicType(integerType);
        if (result == null) result = caseType(integerType);
        if (result == null) result = caseBlockType(integerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.LONG_TYPE:
      {
        LongType longType = (LongType)theEObject;
        T result = caseLongType(longType);
        if (result == null) result = caseNumericType(longType);
        if (result == null) result = caseIntrinsicType(longType);
        if (result == null) result = caseType(longType);
        if (result == null) result = caseBlockType(longType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetModelPackage.DOUBLE_TYPE:
      {
        DoubleType doubleType = (DoubleType)theEObject;
        T result = caseDoubleType(doubleType);
        if (result == null) result = caseNumericType(doubleType);
        if (result == null) result = caseIntrinsicType(doubleType);
        if (result == null) result = caseType(doubleType);
        if (result == null) result = caseBlockType(doubleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Client</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClient(Client object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Http Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Http Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHttpMethod(HttpMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Http Post</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Http Post</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHttpPost(HttpPost object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Http Put</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Http Put</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHttpPut(HttpPut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Http Get</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Http Get</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHttpGet(HttpGet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Http Delete</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Http Delete</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHttpDelete(HttpDelete object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Params Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Params Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamsBlock(ParamsBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyBlock(BodyBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Response Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Response Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResponseBlock(ResponseBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockType(BlockType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMember(Member object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedMember(TypedMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ID Named Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ID Named Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDNamedMember(IDNamedMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Named Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Named Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringNamedMember(StringNamedMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Skip Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skip Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSkipMember(SkipMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleMember(SimpleMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ID Named Simple Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ID Named Simple Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDNamedSimpleMember(IDNamedSimpleMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Named Simple Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Named Simple Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringNamedSimpleMember(StringNamedSimpleMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic List Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic List Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericListType(GenericListType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserType(UserType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserTypeDeclaration(UserTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexTypeDeclaration(ComplexTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumTypeDeclaration(EnumTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Type Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Type Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumTypeLiteral(EnumTypeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumMember(EnumMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Type Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Type Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexTypeLiteral(ComplexTypeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intrinsic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intrinsic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntrinsicType(IntrinsicType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringType(StringType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanType(BooleanType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericType(NumericType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerType(IntegerType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Long Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Long Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLongType(LongType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleType(DoubleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //NetModelSwitch
