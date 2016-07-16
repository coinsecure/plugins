package io.swagger.client.api

import io.swagger.client.model.FailResult
import io.swagger.client.model.BankSummaryDataResponse
import io.swagger.client.model.DoubleDataResponse
import io.swagger.client.model.KYCDataResponse
import io.swagger.client.model.SuccCoinRefDataResponse
import io.swagger.client.model.SuccRefDataResponse
import io.swagger.client.model.AllRefDataResponse
import io.swagger.client.model.TradeSummaryDataResponse
import io.swagger.client.model.SuccessResult
import io.swagger.client.model.UserSummaryDataResponse
import io.swagger.client.model.WalletSummaryDataResponse
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class AccountDataApi(val defBasePath: String = "https://api.coinsecure.in/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Exchange Bank Summary
   * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return BankSummaryDataResponse
   */
  def v1ExchangeBankSummary (authorization: String, accept: String) : Option[BankSummaryDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/summary".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[BankSummaryDataResponse]).asInstanceOf[BankSummaryDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Users Coin Fee Percentage
   * Returns the users coin fee percentage. The response is in percentage.
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return DoubleDataResponse
   */
  def v1ExchangeUserCoinFee (authorization: String, accept: String) : Option[DoubleDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/coin/fee".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[DoubleDataResponse]).asInstanceOf[DoubleDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Users Fiat Fee Percentage
   * Returns the users fiat fee percentage. The response is in percentage.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return DoubleDataResponse
   */
  def v1ExchangeUserFiatFee (authorization: String, accept: String) : Option[DoubleDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/fiat/fee".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[DoubleDataResponse]).asInstanceOf[DoubleDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Coinsecure.me Netki Lookup
   * Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.
   * @param netkiName  
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return DoubleDataResponse
   */
  def v1NetkiSearchNetkiName (netkiName: String, accept: String) : Option[DoubleDataResponse] = {
    // create path and map variables
    val path = "/v1/netki/search/{netkiName}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "netkiName" + "\\}",apiInvoker.escape(netkiName))


    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
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
           Some(ApiInvoker.deserialize(s, "", classOf[DoubleDataResponse]).asInstanceOf[DoubleDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Gets KYC Status Details
   * Gets Users KYC Status Details.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return KYCDataResponse
   */
  def v1UserExchangeKycs (authorization: String, accept: String) : Option[KYCDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/kycs".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[KYCDataResponse]).asInstanceOf[KYCDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Users Paid Fiat Referrals
   * Returns the Users Paid Coin Referrals.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccCoinRefDataResponse
   */
  def v1UserExchangeReferralCoinPaid (authorization: String, accept: String) : Option[SuccCoinRefDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/referral/coin/paid".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[SuccCoinRefDataResponse]).asInstanceOf[SuccCoinRefDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Gets Users Successful Referral Links
   * Gets Users Successful Referral Links that can be used during signup.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccRefDataResponse
   */
  def v1UserExchangeReferralCoinSuccessful (authorization: String, accept: String) : Option[SuccRefDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/referral/coin/successful".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[SuccRefDataResponse]).asInstanceOf[SuccRefDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Users Paid Fiat Referrals
   * Returns the Users Paid Fiat Referrals.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccCoinRefDataResponse
   */
  def v1UserExchangeReferralFiatPaid (authorization: String, accept: String) : Option[SuccCoinRefDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/referral/fiat/paid".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[SuccCoinRefDataResponse]).asInstanceOf[SuccCoinRefDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Gets Users Referral Links
   * Gets Users Referral Links that can be used during signup.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return AllRefDataResponse
   */
  def v1UserExchangeReferrals (authorization: String, accept: String) : Option[AllRefDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/referrals".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[AllRefDataResponse]).asInstanceOf[AllRefDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Exchange Trade Summary
   * Gets a Summary of Exchange Trade Data.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeSummaryDataResponse
   */
  def v1UserExchangeTradeSummary (authorization: String, accept: String) : Option[TradeSummaryDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/trade/summary".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[TradeSummaryDataResponse]).asInstanceOf[TradeSummaryDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Login Token Email
   * Retrieves details of a Login Token
   * @param token  
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   */
  def v1UserLoginTokenToken (token: String, accept: String) : Option[SuccessResult] = {
    // create path and map variables
    val path = "/v1/user/login/token/{token}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "token" + "\\}",apiInvoker.escape(token))


    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
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
   * Exchange Bank Summary
   * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return UserSummaryDataResponse
   */
  def v1UserSummary (authorization: String, accept: String) : Option[UserSummaryDataResponse] = {
    // create path and map variables
    val path = "/v1/user/summary".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[UserSummaryDataResponse]).asInstanceOf[UserSummaryDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Exchange Bank Summary
   * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletSummaryDataResponse
   */
  def v1UserWalletSummary (authorization: String, accept: String) : Option[WalletSummaryDataResponse] = {
    // create path and map variables
    val path = "/v1/user/wallet/summary".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletSummaryDataResponse]).asInstanceOf[WalletSummaryDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
