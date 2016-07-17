package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.FailResult;
import io.swagger.client.model.ValidAddressSearchDataResponse;
import io.swagger.client.model.ConfirmDataResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class BlockchainToolsApi {
  private ApiClient apiClient;

  public BlockchainToolsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BlockchainToolsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Search Bitcoin Blockchain
   * Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.
   * @param any  (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return ValidAddressSearchDataResponse
   * @throws ApiException if fails to make API call
   */
  public ValidAddressSearchDataResponse v1bitcoinsearchAddress(String any, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'any' is set
    if (any == null) {
      throw new ApiException(400, "Missing the required parameter 'any' when calling v1bitcoinsearchAddress");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bitcoin/search/{any}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "any" + "\\}", apiClient.escapeString(any.toString()));

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

    GenericType<ValidAddressSearchDataResponse> localVarReturnType = new GenericType<ValidAddressSearchDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Confirmations
   * Searches for a Number of Confirmations on a transaction ID.
   * @param txid  (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return ConfirmDataResponse
   * @throws ApiException if fails to make API call
   */
  public ConfirmDataResponse v1bitcoinsearchTxid(String txid, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'txid' is set
    if (txid == null) {
      throw new ApiException(400, "Missing the required parameter 'txid' when calling v1bitcoinsearchTxid");
    }
    
    // create path and map variables
    String localVarPath = "/v1/bitcoin/search/confirmation/{txid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "txid" + "\\}", apiClient.escapeString(txid.toString()));

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

    GenericType<ConfirmDataResponse> localVarReturnType = new GenericType<ConfirmDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
