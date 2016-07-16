package io.swagger.client.api

import io.swagger.client.model.RateDataResponse
import io.swagger.client.model.FailResult
import io.swagger.client.model.RateVolDataResponse
import io.swagger.client.model.LastTradeDataResponse
import io.swagger.client.model.RateDiffDataResponse
import io.swagger.client.model.StandardTickerResultData
import io.swagger.client.model.OrderDataResponse
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ExchangeTradeDataApi(val defBasePath: String = "https://api.coinsecure.in/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Lowest Ask
   * Returns the Lowest Ask Rate in Json. The Amount is in Paisa.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDataResponse
   */
  def v1ExchangeAskLow (accept: String) : Option[RateDataResponse] = {
    // create path and map variables
    val path = "/v1/exchange/ask/low".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[RateDataResponse]).asInstanceOf[RateDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * All Sell Orders
   * Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateVolDataResponse
   */
  def v1ExchangeAskOrders (accept: String) : Option[RateVolDataResponse] = {
    // create path and map variables
    val path = "/v1/exchange/ask/orders".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[RateVolDataResponse]).asInstanceOf[RateVolDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Returns the Highest Bid in the Order Book
   * Highest Bid.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDataResponse
   */
  def v1ExchangeBidHigh (accept: String) : Option[RateDataResponse] = {
    // create path and map variables
    val path = "/v1/exchange/bid/high".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[RateDataResponse]).asInstanceOf[RateDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * All Buy Orders
   * Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateVolDataResponse
   */
  def v1ExchangeBidOrders (accept: String) : Option[RateVolDataResponse] = {
    // create path and map variables
    val path = "/v1/exchange/bid/orders".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[RateVolDataResponse]).asInstanceOf[RateVolDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Last Trade
   * Returns a summary of data from the Exchange.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return LastTradeDataResponse
   */
  def v1ExchangeLastTrade (accept: String) : Option[LastTradeDataResponse] = {
    // create path and map variables
    val path = "/v1/exchange/lastTrade".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[LastTradeDataResponse]).asInstanceOf[LastTradeDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Max 24 Hour Rate
   * Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDiffDataResponse
   */
  def v1ExchangeMax24Hr (accept: String) : Option[RateDiffDataResponse] = {
    // create path and map variables
    val path = "/v1/exchange/max24Hr".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[RateDiffDataResponse]).asInstanceOf[RateDiffDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Min 24 Hour Rate
   * Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDiffDataResponse
   */
  def v1ExchangeMin24Hr (accept: String) : Option[RateDiffDataResponse] = {
    // create path and map variables
    val path = "/v1/exchange/min24Hr".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[RateDiffDataResponse]).asInstanceOf[RateDiffDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Exchange Ticker
   * Returns a summary of data from the Exchange.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return StandardTickerResultData
   */
  def v1ExchangeTicker (accept: String) : Option[StandardTickerResultData] = {
    // create path and map variables
    val path = "/v1/exchange/ticker".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[StandardTickerResultData]).asInstanceOf[StandardTickerResultData])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Cancelled User Sell Orders
   * Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   */
  def v1UserExchangeAskCancelled (authorization: String, accept: String) : Option[OrderDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/ask/cancelled".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[OrderDataResponse]).asInstanceOf[OrderDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Completed User Sell Orders
   * Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   */
  def v1UserExchangeAskCompleted (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[OrderDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/ask/completed".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[OrderDataResponse]).asInstanceOf[OrderDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Pending User Sell Orders
   * Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   */
  def v1UserExchangeAskPending (authorization: String, accept: String) : Option[OrderDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/ask/pending".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[OrderDataResponse]).asInstanceOf[OrderDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Cancelled User Buy Orders
   * Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   */
  def v1UserExchangeBidCancelled (authorization: String, accept: String) : Option[OrderDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bid/cancelled".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[OrderDataResponse]).asInstanceOf[OrderDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Completed User Buy Orders
   * Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   */
  def v1UserExchangeBidCompleted (authorization: String, accept: String) : Option[OrderDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bid/completed".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[OrderDataResponse]).asInstanceOf[OrderDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Pending User Buy Orders
   * Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   */
  def v1UserExchangeBidPending (authorization: String, accept: String) : Option[OrderDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bid/pending".replaceAll("\\{format\\}","json")
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
           Some(ApiInvoker.deserialize(s, "", classOf[OrderDataResponse]).asInstanceOf[OrderDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
