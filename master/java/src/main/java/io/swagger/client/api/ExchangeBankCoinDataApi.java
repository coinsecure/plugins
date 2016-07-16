package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.TradeAddressDataResponse;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.VolDataResponse;
import io.swagger.client.model.CoinDepDataResponse;
import io.swagger.client.model.TradeCoinWithdrawDataResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class ExchangeBankCoinDataApi {
  private ApiClient apiClient;

  public ExchangeBankCoinDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExchangeBankCoinDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Exchange Coin Addresses
   * Gets a List of Users Exchange Bitcoin Deposit Addresses.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeAddressDataResponse
   * @throws ApiException if fails to make API call
   */
  public TradeAddressDataResponse v1userexchangebankcoinaddresses(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinaddresses");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/addresses".replaceAll("\\{format\\}","json");

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

    GenericType<TradeAddressDataResponse> localVarReturnType = new GenericType<TradeAddressDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Available Exchange Coin Balance
   * Returns balance which is in Available for Trades. The response is in satoshis.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return VolDataResponse
   * @throws ApiException if fails to make API call
   */
  public VolDataResponse v1userexchangebankcoinbalanceavailable(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalanceavailable");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/balance/total".replaceAll("\\{format\\}","json");

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

    GenericType<VolDataResponse> localVarReturnType = new GenericType<VolDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * In Trade Coin Balance
   * Returns in-trade or pending coin balance in satoshi.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return VolDataResponse
   * @throws ApiException if fails to make API call
   */
  public VolDataResponse v1userexchangebankcoinbalancepending(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancepending");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/balance/pending".replaceAll("\\{format\\}","json");

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

    GenericType<VolDataResponse> localVarReturnType = new GenericType<VolDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Total Exchange Coin Balance
   * Returns users total coin balance in satoshis. Pending + Available
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return VolDataResponse
   * @throws ApiException if fails to make API call
   */
  public VolDataResponse v1userexchangebankcoinbalancetotal(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancetotal");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/balance/available".replaceAll("\\{format\\}","json");

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

    GenericType<VolDataResponse> localVarReturnType = new GenericType<VolDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancelled Exchange Coin Deposits
   * Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added (required)
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return CoinDepDataResponse
   * @throws ApiException if fails to make API call
   */
  public CoinDepDataResponse v1userexchangebankcoindepositcancelled(String authorization, Long from, Long to, Integer max, Long offset, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositcancelled");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/deposit/cancelled".replaceAll("\\{format\\}","json");

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

    GenericType<CoinDepDataResponse> localVarReturnType = new GenericType<CoinDepDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Unverified Exchange Coin Deposits
   * Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added (required)
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return CoinDepDataResponse
   * @throws ApiException if fails to make API call
   */
  public CoinDepDataResponse v1userexchangebankcoindepositunverified(String authorization, Long from, Long to, Integer max, Long offset, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositunverified");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/deposit/unverified".replaceAll("\\{format\\}","json");

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

    GenericType<CoinDepDataResponse> localVarReturnType = new GenericType<CoinDepDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verified Exchange Coin Deposits
   * Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added (required)
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return CoinDepDataResponse
   * @throws ApiException if fails to make API call
   */
  public CoinDepDataResponse v1userexchangebankcoindepositverified(String authorization, Long from, Long to, Integer max, Long offset, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositverified");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/deposit/verified".replaceAll("\\{format\\}","json");

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

    GenericType<CoinDepDataResponse> localVarReturnType = new GenericType<CoinDepDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancelled Exchange Coin Withdrawals
   * Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added (required)
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeCoinWithdrawDataResponse
   * @throws ApiException if fails to make API call
   */
  public TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcancelled(String authorization, Long from, Long to, Integer max, Long offset, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcancelled");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/withdraw/cancelled".replaceAll("\\{format\\}","json");

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

    GenericType<TradeCoinWithdrawDataResponse> localVarReturnType = new GenericType<TradeCoinWithdrawDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Completed Exchange Coin Withdrawals
   * Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added (required)
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeCoinWithdrawDataResponse
   * @throws ApiException if fails to make API call
   */
  public TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcompleted(String authorization, Long from, Long to, Integer max, Long offset, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcompleted");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/withdraw/completed".replaceAll("\\{format\\}","json");

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

    GenericType<TradeCoinWithdrawDataResponse> localVarReturnType = new GenericType<TradeCoinWithdrawDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Unverified Exchange Coin Withdrawals
   * Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added (required)
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeCoinWithdrawDataResponse
   * @throws ApiException if fails to make API call
   */
  public TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawunverified(String authorization, Long from, Long to, Integer max, Long offset, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawunverified");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/withdraw/unverified".replaceAll("\\{format\\}","json");

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

    GenericType<TradeCoinWithdrawDataResponse> localVarReturnType = new GenericType<TradeCoinWithdrawDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verified Exchange Coin Withdrawals
   * Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added (required)
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeCoinWithdrawDataResponse
   * @throws ApiException if fails to make API call
   */
  public TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawverified(String authorization, Long from, Long to, Integer max, Long offset, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawverified");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/withdraw/verified".replaceAll("\\{format\\}","json");

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

    GenericType<TradeCoinWithdrawDataResponse> localVarReturnType = new GenericType<TradeCoinWithdrawDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
