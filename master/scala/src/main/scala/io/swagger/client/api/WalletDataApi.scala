package io.swagger.client.api

import io.swagger.client.model.WalletAddressDataResponse
import io.swagger.client.model.FailResult
import io.swagger.client.model.WalletsDataResponse
import io.swagger.client.model.WalletCoinWithdrawDataResponse
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class WalletDataApi(val defBasePath: String = "https://api.coinsecure.in/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Wallet Bitcoin Addresses
   * Gets a List of Users Bitcoin Deposit Addresses.
   * @param walletID  
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletAddressDataResponse
   */
  def v1UserWalletCoinAddressWalletID (walletID: String, authorization: String, accept: String) : Option[WalletAddressDataResponse] = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/address/{walletID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "walletID" + "\\}",apiInvoker.escape(walletID))


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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletAddressDataResponse]).asInstanceOf[WalletAddressDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Confirmed Wallet Deposit
   * Gets the total confirmed transactions across all accounts and addresses
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletAddressDataResponse
   */
  def v1UserWalletCoinDepositConfirmedAll (authorization: String, accept: String) : Option[WalletAddressDataResponse] = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/deposit/confirmed/all".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletAddressDataResponse]).asInstanceOf[WalletAddressDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Confirmed Wallet Transactions
   * Gets your Confirmed Wallet Bitcoin Transactions.
   * @param walletID  
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletAddressDataResponse
   */
  def v1UserWalletCoinDepositConfirmedWalletID (walletID: String, authorization: String, accept: String) : Option[WalletAddressDataResponse] = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/deposit/confirmed/{walletID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "walletID" + "\\}",apiInvoker.escape(walletID))


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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletAddressDataResponse]).asInstanceOf[WalletAddressDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * All Unconfirmed Deposits
   * Gets the total unconfirmed transactions across all accounts and addresses
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return void
   */
  def v1UserWalletCoinDepositUnconfirmedAll (authorization: String, accept: String)  = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/deposit/unconfirmed/all".replaceAll("\\{format\\}","json")
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
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Unconfirmed Transactions in Wallet
   * Gets the unconfirmed transactions on an account/ wallet.
   * @param walletID  
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return void
   */
  def v1UserWalletCoinDepositUnconfirmedWalletID (walletID: String, authorization: String, accept: String)  = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/deposit/unconfirmed/{walletID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "walletID" + "\\}",apiInvoker.escape(walletID))


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
                  case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Wallet Details
   * Gets a List of Users Wallets.
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletsDataResponse
   */
  def v1UserWalletCoinWallets (authorization: String, accept: String) : Option[WalletsDataResponse] = {
    // create path and map variables
    val path = "/v1/user/wallet/coin/wallets".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletsDataResponse]).asInstanceOf[WalletsDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Cancelled Coin Withdrawals
   * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletCoinWithdrawDataResponse
   */
  def v1WalletWithdrawCancelled (authorization: String, accept: String) : Option[WalletCoinWithdrawDataResponse] = {
    // create path and map variables
    val path = "/v1/wallet/coin/withdraw/cancelled".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletCoinWithdrawDataResponse]).asInstanceOf[WalletCoinWithdrawDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Completed Coin Withdrawals
   * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletCoinWithdrawDataResponse
   */
  def v1WalletWithdrawCompleted (authorization: String, accept: String) : Option[WalletCoinWithdrawDataResponse] = {
    // create path and map variables
    val path = "/v1/wallet/coin/withdraw/completed".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletCoinWithdrawDataResponse]).asInstanceOf[WalletCoinWithdrawDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Unverified Coin Withdrawals
   * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletCoinWithdrawDataResponse
   */
  def v1WalletWithdrawUnverified (authorization: String, accept: String) : Option[WalletCoinWithdrawDataResponse] = {
    // create path and map variables
    val path = "/v1/wallet/coin/withdraw/unverified".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletCoinWithdrawDataResponse]).asInstanceOf[WalletCoinWithdrawDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Verified Coin Withdrawals
   * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletCoinWithdrawDataResponse
   */
  def v1WalletWithdrawVerified (authorization: String, accept: String) : Option[WalletCoinWithdrawDataResponse] = {
    // create path and map variables
    val path = "/v1/wallet/coin/withdraw/verified".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[WalletCoinWithdrawDataResponse]).asInstanceOf[WalletCoinWithdrawDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
