package io.swagger.client.api

import io.swagger.client.model.FailResult
import io.swagger.client.model.ValidAddressSearchDataResponse
import io.swagger.client.model.ConfirmDataResponse
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class BlockchainToolsApi(val defBasePath: String = "https://api.coinsecure.in/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Search Bitcoin Blockchain
   * Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.
   * @param any  
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return ValidAddressSearchDataResponse
   */
  def v1BitcoinSearchAddress (any: String, accept: String) : Option[ValidAddressSearchDataResponse] = {
    // create path and map variables
    val path = "/v1/bitcoin/search/{any}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "any" + "\\}",apiInvoker.escape(any))


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
           Some(ApiInvoker.deserialize(s, "", classOf[ValidAddressSearchDataResponse]).asInstanceOf[ValidAddressSearchDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get Confirmations
   * Searches for a Number of Confirmations on a transaction ID.
   * @param txid  
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return ConfirmDataResponse
   */
  def v1BitcoinSearchTxid (txid: String, accept: String) : Option[ConfirmDataResponse] = {
    // create path and map variables
    val path = "/v1/bitcoin/search/confirmation/{txid}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "txid" + "\\}",apiInvoker.escape(txid))


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
           Some(ApiInvoker.deserialize(s, "", classOf[ConfirmDataResponse]).asInstanceOf[ConfirmDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
