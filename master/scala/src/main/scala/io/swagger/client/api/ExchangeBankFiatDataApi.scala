package io.swagger.client.api

import io.swagger.client.model.FiatBankDataResponse
import io.swagger.client.model.FailResult
import io.swagger.client.model.RateDataResponse
import io.swagger.client.model.FiatDepDataResponse
import io.swagger.client.model.FiatWithDataResponse
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ExchangeBankFiatDataApi(val defBasePath: String = "https://api.coinsecure.in/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Exchange Bitcoin Deposit Addresses
   * Gets a List of Users Exchange Bitcoin Addresses.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return FiatBankDataResponse
   */
  def v1UserExchangeBankFiatAccounts (authorization: String, accept: String) : Option[FiatBankDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/accounts".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[FiatBankDataResponse]).asInstanceOf[FiatBankDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Available Exchange Fiat Balance
   * Returns balance which is in Available for Trades. The response is in paisa.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDataResponse
   */
  def v1UserExchangeBankFiatBalanceAvailable (authorization: String, accept: String) : Option[RateDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/balance/total".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[RateDataResponse]).asInstanceOf[RateDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * In Trade Coin Balance
   * Returns in-trade or pending fiat balance in paisa.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDataResponse
   */
  def v1UserExchangeBankFiatBalancePending (authorization: String, accept: String) : Option[RateDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/balance/pending".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[RateDataResponse]).asInstanceOf[RateDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Total Exchange Fiat Balance
   * Returns users total fiat balance in paisa. Pending + Available
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDataResponse
   */
  def v1UserExchangeBankFiatBalanceTotal (authorization: String, accept: String) : Option[RateDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/balance/available".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[RateDataResponse]).asInstanceOf[RateDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Cancelled Exchange Fiat Deposits
   * Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return FiatDepDataResponse
   */
  def v1UserExchangeBankFiatDepositCancelled (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[FiatDepDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/deposit/cancelled".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
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
           Some(ApiInvoker.deserialize(s, "", classOf[FiatDepDataResponse]).asInstanceOf[FiatDepDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Unverified Exchange Fiat Deposits
   * Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return FiatDepDataResponse
   */
  def v1UserExchangeBankFiatDepositUnverified (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[FiatDepDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/deposit/unverified".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
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
           Some(ApiInvoker.deserialize(s, "", classOf[FiatDepDataResponse]).asInstanceOf[FiatDepDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Verified Exchange Fiat Deposits
   * Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return FiatDepDataResponse
   */
  def v1UserExchangeBankFiatDepositVerified (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[FiatDepDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/deposit/verified".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
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
           Some(ApiInvoker.deserialize(s, "", classOf[FiatDepDataResponse]).asInstanceOf[FiatDepDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Cancelled Exchange Fiat Withdrawals
   * Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return FiatWithDataResponse
   */
  def v1UserExchangeBankFiatWithdrawCancelled (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[FiatWithDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/withdraw/cancelled".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
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
           Some(ApiInvoker.deserialize(s, "", classOf[FiatWithDataResponse]).asInstanceOf[FiatWithDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Completed Exchange Fiat Withdrawals
   * Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return FiatWithDataResponse
   */
  def v1UserExchangeBankFiatWithdrawCompleted (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[FiatWithDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/withdraw/completed".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
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
           Some(ApiInvoker.deserialize(s, "", classOf[FiatWithDataResponse]).asInstanceOf[FiatWithDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Unverified Exchange Fiat Withdrawals
   * Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return FiatWithDataResponse
   */
  def v1UserExchangeBankFiatWithdrawUnverified (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[FiatWithDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/withdraw/unverified".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
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
           Some(ApiInvoker.deserialize(s, "", classOf[FiatWithDataResponse]).asInstanceOf[FiatWithDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Verified Exchange Fiat Withdrawals
   * Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return FiatWithDataResponse
   */
  def v1UserExchangeBankFiatWithdrawVerified (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[FiatWithDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/fiat/withdraw/verified".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
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
           Some(ApiInvoker.deserialize(s, "", classOf[FiatWithDataResponse]).asInstanceOf[FiatWithDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
