package io.swagger.client.api

import io.swagger.client.model.SendCoin
import io.swagger.client.model.SuccessResult
import io.swagger.client.model.FailResult
import io.swagger.client.model.WithdrawID
import io.swagger.client.model.Code
import io.swagger.client.model.NewBankForm
import io.swagger.client.model.DepositID
import io.swagger.client.model.NewFiatBankDeposit
import io.swagger.client.model.WithdrawFiat
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ExchangeBankActionsApi(val defBasePath: String = "https://api.coinsecure.in/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Initiate Bitcoin Withdrawal
   * The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
   * @param body Please send the form with valid inputs. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankCoinWithdrawInitiate (body: SendCoin, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/withdraw/initiate".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankCoinWithdrawInitiate")

        
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
   * Gets a Verification Code.
   * Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.
   * @param body You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified 
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankCoinWithdrawNewVerifycode (body: WithdrawID, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/withdraw/newVerifycode".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankCoinWithdrawNewVerifycode")

        
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
   * Cancel Bitcoin Withdrawal
   * Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.
   * @param body You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankCoinWithdrawUnverifiedCancel (body: WithdrawID, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/withdraw/unverified/cancel".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankCoinWithdrawUnverifiedCancel")

        
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
   * Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
   * @param body You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankCoinWithdrawVerify (body: Code, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/withdraw/verify".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankCoinWithdrawVerify")

        
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
   * New Bank Link
   * Submits a New Bank Link on KYC Verified Accounts.
   * @param body Please send the form with valid inputs. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankFiatAccountNew (body: NewBankForm, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/account/new".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankFiatAccountNew")

        
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
   * Cancel Unverified Exchange Fiat Deposit
   * Cancels an unverified Exchange Fiat Deposit.
   * @param body Please send the form with valid inputs. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankFiatDepositCancel (body: DepositID, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/deposit/cancel".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankFiatDepositCancel")

        
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
   * New Exchange Fiat Deposit
   * Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.
   * @param body Please send the form with valid inputs. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankFiatDepositNew (body: NewFiatBankDeposit, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/deposit/new".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankFiatDepositNew")

        
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
   * Initiate Fiat Withdrawal
   * The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
   * @param body Please send the form with valid inputs. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankFiatWithdrawInitiate (body: WithdrawFiat, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/withdraw/initiate".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankFiatWithdrawInitiate")

        
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
   * Gets a Fiat Verification Code.
   * Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.
   * @param body You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified 
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankFiatWithdrawNewVerifycode (body: WithdrawID, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/withdraw/newVerifycode".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankFiatWithdrawNewVerifycode")

        
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
   * Cancel Fiat Withdrawal
   * Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.
   * @param body You can get the code from /v1/user/exchange/bank/fiat/withdraw/unverified. 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankFiatWithdrawUnverifiedCancel (body: WithdrawID, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/withdraw/unverified/cancel".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankFiatWithdrawUnverifiedCancel")

        
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
   * Verify Fiat Withdrawal
   * Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.
   * @param body You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode 
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserExchangeBankFiatWithdrawVerify (body: Code, authorization: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/withdraw/verify".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ExchangeBankActionsApi->v1UserExchangeBankFiatWithdrawVerify")

        
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

}
