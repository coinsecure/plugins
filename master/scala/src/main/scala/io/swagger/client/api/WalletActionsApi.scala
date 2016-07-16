package io.swagger.client.api

import io.swagger.client.model.WalletAddressDataResponse
import io.swagger.client.model.NewAddress
import io.swagger.client.model.FailResult
import io.swagger.client.model.NewWallet
import io.swagger.client.model.SendCoinWallet
import io.swagger.client.model.SuccessResult
import io.swagger.client.model.SendExchange
import io.swagger.client.model.WithdrawID
import io.swagger.client.model.Code
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class WalletActionsApi(val defBasePath: String = "https://api.coinsecure.in/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * New Bitcoin Address
   * Generates a New Bitcoin Address to store coins.
   * @param body  
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletAddressDataResponse
   */
  def v1UserWalletCoinAddressNew (body: NewAddress, authorization: String, accept: String) : Option[WalletAddressDataResponse] = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/address/new".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling WalletActionsApi->v1UserWalletCoinAddressNew")

        
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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletAddressDataResponse]).asInstanceOf[WalletAddressDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Create New Wallet
   * Creates a New wallet to store addresses. This method also creates a single default address in each new wallet.
   * @param body  
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletAddressDataResponse
   */
  def v1UserWalletCoinNew (body: NewWallet, authorization: String, accept: String) : Option[WalletAddressDataResponse] = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/new".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling WalletActionsApi->v1UserWalletCoinNew")

        
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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletAddressDataResponse]).asInstanceOf[WalletAddressDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Initiate Bitcoin Withdrawal
   * The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
   * @param body  
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserWalletCoinWithdrawInitiate (body: SendCoinWallet, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/withdraw/initiate".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling WalletActionsApi->v1UserWalletCoinWithdrawInitiate")

        
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
   * Send to Exchange
   * This function transfers funds to yout Exchange Balance without the need for any confirmations.
   * @param body  
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserWalletCoinWithdrawSendToExchange (body: SendExchange, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/withdraw/sendToExchange".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling WalletActionsApi->v1UserWalletCoinWithdrawSendToExchange")

        
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
   * Cancel Bitcoin Withdrawal
   * Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws.
   * @param authorization Enter a valid Api Key. 
   * @param body  
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserWalletCoinWithdrawUnverifiedCancel (authorization: String, body: WithdrawID, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/withdraw/unverified/cancel".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling WalletActionsApi->v1UserWalletCoinWithdrawUnverifiedCancel")

        
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
   * Verify Bitcoin Withdrawal
   * Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode.
   * @param authorization Enter a valid Api Key. 
   * @param body  
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserWalletCoinWithdrawVerify (authorization: String, body: Code, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/withdraw/verify".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling WalletActionsApi->v1UserWalletCoinWithdrawVerify")

        
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
   * Gets a Verification Code
   * Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified.
   * @param body You can get unverified withdraw ID&#39;s from /v1/exchange/bank/coin/withdrawVerifycode 
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1WalletCoinWithdrawNewVerifycode (body: WithdrawID, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/wallet/coin/withdraw/newVerifycode".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling WalletActionsApi->v1WalletCoinWithdrawNewVerifycode")

        
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

}
