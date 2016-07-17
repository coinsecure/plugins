package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.RateDataResponse;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.RateVolDataResponse;
import io.swagger.client.model.LastTradeDataResponse;
import io.swagger.client.model.RateDiffDataResponse;
import io.swagger.client.model.StandardTickerResultData;
import io.swagger.client.model.OrderDataResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class ExchangeTradeDataApi {
  private ApiClient apiClient;

  public ExchangeTradeDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExchangeTradeDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Lowest Ask
   * Returns the Lowest Ask Rate in Json. The Amount is in Paisa.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDataResponse
   * @throws ApiException if fails to make API call
   */
  public RateDataResponse v1exchangeasklow(String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/exchange/ask/low".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RateDataResponse> localVarReturnType = new GenericType<RateDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * All Sell Orders
   * Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateVolDataResponse
   * @throws ApiException if fails to make API call
   */
  public RateVolDataResponse v1exchangeaskorders(String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/exchange/ask/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RateVolDataResponse> localVarReturnType = new GenericType<RateVolDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns the Highest Bid in the Order Book
   * Highest Bid.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDataResponse
   * @throws ApiException if fails to make API call
   */
  public RateDataResponse v1exchangebidhigh(String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/exchange/bid/high".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RateDataResponse> localVarReturnType = new GenericType<RateDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * All Buy Orders
   * Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateVolDataResponse
   * @throws ApiException if fails to make API call
   */
  public RateVolDataResponse v1exchangebidorders(String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/exchange/bid/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RateVolDataResponse> localVarReturnType = new GenericType<RateVolDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Last Trade
   * Returns a summary of data from the Exchange.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return LastTradeDataResponse
   * @throws ApiException if fails to make API call
   */
  public LastTradeDataResponse v1exchangelastTrade(String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/exchange/lastTrade".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<LastTradeDataResponse> localVarReturnType = new GenericType<LastTradeDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Max 24 Hour Rate
   * Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDiffDataResponse
   * @throws ApiException if fails to make API call
   */
  public RateDiffDataResponse v1exchangemax24Hr(String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/exchange/max24Hr".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RateDiffDataResponse> localVarReturnType = new GenericType<RateDiffDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Min 24 Hour Rate
   * Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return RateDiffDataResponse
   * @throws ApiException if fails to make API call
   */
  public RateDiffDataResponse v1exchangemin24Hr(String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/exchange/min24Hr".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RateDiffDataResponse> localVarReturnType = new GenericType<RateDiffDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Exchange Ticker
   * Returns a summary of data from the Exchange.
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return StandardTickerResultData
   * @throws ApiException if fails to make API call
   */
  public StandardTickerResultData v1exchangeticker(String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/exchange/ticker".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<StandardTickerResultData> localVarReturnType = new GenericType<StandardTickerResultData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancelled User Sell Orders
   * Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   * @throws ApiException if fails to make API call
   */
  public OrderDataResponse v1userexchangeaskcancelled(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangeaskcancelled");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/ask/cancelled".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrderDataResponse> localVarReturnType = new GenericType<OrderDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Completed User Sell Orders
   * Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added (required)
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   * @throws ApiException if fails to make API call
   */
  public OrderDataResponse v1userexchangeaskcompleted(String authorization, Long from, Long to, Integer max, Long offset, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangeaskcompleted");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/ask/completed".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "max", max));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrderDataResponse> localVarReturnType = new GenericType<OrderDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pending User Sell Orders
   * Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   * @throws ApiException if fails to make API call
   */
  public OrderDataResponse v1userexchangeaskpending(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangeaskpending");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/ask/pending".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrderDataResponse> localVarReturnType = new GenericType<OrderDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancelled User Buy Orders
   * Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   * @throws ApiException if fails to make API call
   */
  public OrderDataResponse v1userexchangebidcancelled(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebidcancelled");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bid/cancelled".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrderDataResponse> localVarReturnType = new GenericType<OrderDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Completed User Buy Orders
   * Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   * @throws ApiException if fails to make API call
   */
  public OrderDataResponse v1userexchangebidcompleted(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebidcompleted");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bid/completed".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrderDataResponse> localVarReturnType = new GenericType<OrderDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pending User Buy Orders
   * Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return OrderDataResponse
   * @throws ApiException if fails to make API call
   */
  public OrderDataResponse v1userexchangebidpending(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebidpending");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bid/pending".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OrderDataResponse> localVarReturnType = new GenericType<OrderDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
