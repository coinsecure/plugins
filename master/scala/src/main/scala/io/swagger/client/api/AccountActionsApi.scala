package io.swagger.client.api

import io.swagger.client.model.FailResult
import io.swagger.client.model.LoginFormNew
import io.swagger.client.model.StandardLoginResultData
import io.swagger.client.model.LoginId
import io.swagger.client.model.StandardInitiateLoginResultData
import io.swagger.client.model.Email
import io.swagger.client.model.SuccessResult
import io.swagger.client.model.SignupForm
import java.io.File
import io.swagger.client.model.NetkiNameAddress
import io.swagger.client.model.Address
import io.swagger.client.model.NetkiName
import io.swagger.client.model.NumberOtp
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class AccountActionsApi(val defBasePath: String = "https://api.coinsecure.in/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Creates a Login Instance and returns an API Key.
   * Creates a Login Instance and returns an API Key
   * @param body Please send the form with valid inputs. 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return StandardLoginResultData
   */
  def v1Login (body: LoginFormNew, accept: String) : Option[StandardLoginResultData] = {
    // create path and map variables
    val path = "/v1/login".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AccountActionsApi->v1Login")

        
    headerParams += "accept" -> accept

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[StandardLoginResultData]).asInstanceOf[StandardLoginResultData])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Initiate Login
   * Sends an Email with a Verification Link.
   * @param body Enter a valid Login ID. This method will send an email with a token to be used for login. 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return StandardInitiateLoginResultData
   */
  def v1LoginInitiate (body: LoginId, accept: String) : Option[StandardInitiateLoginResultData] = {
    // create path and map variables
    val path = "/v1/login/initiate".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AccountActionsApi->v1LoginInitiate")

        
    headerParams += "accept" -> accept

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[StandardInitiateLoginResultData]).asInstanceOf[StandardInitiateLoginResultData])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Sends an email with a password reset token
   * Sends an email with a password reset token
   * @param body Enter a valid and registered Email ID. 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1LoginPasswordForgot (body: Email, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/login/password/forgot".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AccountActionsApi->v1LoginPasswordForgot")

        
    headerParams += "accept" -> accept

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Creates a new Unverified Account.
   * Creates a new Unverified Account.
   * @param body Please send the form with valid inputs. 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1Signup (body: SignupForm, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/signup".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AccountActionsApi->v1Signup")

        
    headerParams += "accept" -> accept

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Send OTP for Bank Link
   * Send OTP for an additional Bank Link.
   * @param number  
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return StandardInitiateLoginResultData
   */
  def v1UserBankOtpNumber (number: String, authorization: String, accept: String) : Option[StandardInitiateLoginResultData] = {
    // create path and map variables
    val path = "/v1/user/bank/otp/{number}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "number" + "\\}",apiInvoker.escape(number))


    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[StandardInitiateLoginResultData]).asInstanceOf[StandardInitiateLoginResultData])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Submits a New Bank Link and initial KYC Documents.
   * Submits a New Bank Link and initial KYC Documents.
   * @param panNumber Please enter your Pan Card Number 
   * @param acctNick Please enter an Account NickName 
   * @param name Please enter your Name as it appears on your Bank account. 
   * @param ban Please enter your Bank account number. 
   * @param ifsc Please enter your IFSC Code. 
   * @param acctType Please enter your Coinsecure account type. Allowable Values are Personal or Company. 
   * @param banType Please enter your Bank account type. Allowable Values are Savings or Current. 
   * @param phone Please enter your Valid Phone Number. 
   * @param otp Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number. 
   * @param file Enter a valid image, pdf or zip file under 5 MB in size. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param message Please enter an optional message if needed. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeKyc (panNumber: String, acctNick: String, name: String, ban: String, ifsc: String, acctType: String, banType: String, phone: String, otp: String, file: File, authorization: String, message: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/kyc".replaceAll("\\{format\\}","json")
    val contentTypes = List("multipart/form-data", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (file == null) throw new Exception("Missing required parameter 'file' when calling AccountActionsApi->v1UserExchangeKyc")

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("panNumber", panNumber.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("acctNick", acctNick.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("name", name.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("ban", ban.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("ifsc", ifsc.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("acctType", acctType.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("message", message.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("banType", banType.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("phone", phone.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("otp", otp.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("file", file.getName)
      mp.bodyPart(new FileDataBodyPart("file", file, MediaType.MULTIPART_FORM_DATA_TYPE))
      
      postBody = mp
    }
    else {
      formParams += "panNumber" -> panNumber.toString()
      formParams += "acctNick" -> acctNick.toString()
      formParams += "name" -> name.toString()
      formParams += "ban" -> ban.toString()
      formParams += "ifsc" -> ifsc.toString()
      formParams += "acctType" -> acctType.toString()
      formParams += "message" -> message.toString()
      formParams += "banType" -> banType.toString()
      formParams += "phone" -> phone.toString()
      formParams += "otp" -> otp.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete GCM Code
   * Delete GCM Code and associated API Key.
   * @param code  
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserGcmCode (code: String, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/gcm/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "code" + "\\}",apiInvoker.escape(code))


    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Send OTP for KYC Link
   * Send OTP for KYC Link.
   * @param number  
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserKycOtpNumber (number: String, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/kyc/otp/{number}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "number" + "\\}",apiInvoker.escape(number))


    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Logout User
   * Logs out user and Deletes the api key and associated session data.
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserLogout (authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/logout".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create Neki Wallet Name
   * Creates a new Netki Wallet Name.
   * @param body Enter a valid Netki name and Bitcoin address from Wallet or Exchange. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserNetkiCreate (body: NetkiNameAddress, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/netki/create".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AccountActionsApi->v1UserNetkiCreate")

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update Netki Address
   * Updates the address on an existing wallet name.
   * @param body Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserNetkiUpdate (body: Address, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/netki/update".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AccountActionsApi->v1UserNetkiUpdate")

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PATCH", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete Profile Image
   * Deletes a profile Image.
   * @param body Please enter a valid Netki name associated with your prfile Image. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserProfileImageDelete (body: NetkiName, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/contact".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AccountActionsApi->v1UserProfileImageDelete")

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Update Profile Image
   * Updates Profile Image and allows public or private options for netki profile page.
   * @param netkiName Please enter your Netki Wallet Name. 
   * @param isPublic Please enter if this image can be public. 
   * @param file Enter a valid image, pdf or zip file under 5 MB in size. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserProfileImageUpdate (netkiName: String, isPublic: Boolean, file: File, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/profile/image/update".replaceAll("\\{format\\}","json")
    val contentTypes = List("multipart/form-data", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (file == null) throw new Exception("Missing required parameter 'file' when calling AccountActionsApi->v1UserProfileImageUpdate")

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("netkiName", netkiName.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("isPublic", isPublic.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("file", file.getName)
      mp.bodyPart(new FileDataBodyPart("file", file, MediaType.MULTIPART_FORM_DATA_TYPE))
      
      postBody = mp
    }
    else {
      formParams += "netkiName" -> netkiName.toString()
      formParams += "isPublic" -> isPublic.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PATCH", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * New Profile Phone
   * Set a New Profile Phone Number.
   * @param body You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserProfilePhone (body: NumberOtp, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/profile/phone/new".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AccountActionsApi->v1UserProfilePhone")

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = body

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Delete Profile Phone Number
   * Delete Profile Phone Number.
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserProfilePhoneNumber (authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/profile/phone/delete".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Send OTP for Profile Phone
   * Send OTP for Profile Phone addition or updation.
   * @param number  
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserProfilePhoneOtpNumber (number: String, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/profile/phone/otp/{number}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "number" + "\\}",apiInvoker.escape(number))


    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[SuccessResult]).asInstanceOf[SuccessResult])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
