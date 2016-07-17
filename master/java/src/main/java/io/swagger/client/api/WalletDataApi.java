package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.WalletAddressDataResponse;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.WalletsDataResponse;
import io.swagger.client.model.WalletCoinWithdrawDataResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class WalletDataApi {
  private ApiClient apiClient;

  public WalletDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WalletDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Wallet Bitcoin Addresses
   * Gets a List of Users Bitcoin Deposit Addresses.
   * @param walletID  (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletAddressDataResponse
   * @throws ApiException if fails to make API call
   */
  public WalletAddressDataResponse v1userwalletcoinaddressWalletID(String walletID, String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'walletID' is set
    if (walletID == null) {
      throw new ApiException(400, "Missing the required parameter 'walletID' when calling v1userwalletcoinaddressWalletID");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/wallet/coin/address/{walletID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "walletID" + "\\}", apiClient.escapeString(walletID.toString()));

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

    GenericType<WalletAddressDataResponse> localVarReturnType = new GenericType<WalletAddressDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Confirmed Wallet Transactions
   * Gets your Confirmed Wallet Bitcoin Transactions.
   * @param walletID  (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletAddressDataResponse
   * @throws ApiException if fails to make API call
   */
  public WalletAddressDataResponse v1userwalletcoindepositconfirmedWalletID(String walletID, String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'walletID' is set
    if (walletID == null) {
      throw new ApiException(400, "Missing the required parameter 'walletID' when calling v1userwalletcoindepositconfirmedWalletID");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/wallet/coin/deposit/confirmed/{walletID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "walletID" + "\\}", apiClient.escapeString(walletID.toString()));

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

    GenericType<WalletAddressDataResponse> localVarReturnType = new GenericType<WalletAddressDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Confirmed Wallet Deposit
   * Gets the total confirmed transactions across all accounts and addresses
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletAddressDataResponse
   * @throws ApiException if fails to make API call
   */
  public WalletAddressDataResponse v1userwalletcoindepositconfirmedall(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/user/wallet/coin/deposit/confirmed/all".replaceAll("\\{format\\}","json");

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

    GenericType<WalletAddressDataResponse> localVarReturnType = new GenericType<WalletAddressDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Unconfirmed Transactions in Wallet
   * Gets the unconfirmed transactions on an account/ wallet.
   * @param walletID  (required)
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @throws ApiException if fails to make API call
   */
  public void v1userwalletcoindepositunconfirmedWalletID(String walletID, String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'walletID' is set
    if (walletID == null) {
      throw new ApiException(400, "Missing the required parameter 'walletID' when calling v1userwalletcoindepositunconfirmedWalletID");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userwalletcoindepositunconfirmedWalletID");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/wallet/coin/deposit/unconfirmed/{walletID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "walletID" + "\\}", apiClient.escapeString(walletID.toString()));

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


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * All Unconfirmed Deposits
   * Gets the total unconfirmed transactions across all accounts and addresses
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @throws ApiException if fails to make API call
   */
  public void v1userwalletcoindepositunconfirmedall(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/user/wallet/coin/deposit/unconfirmed/all".replaceAll("\\{format\\}","json");

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


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Wallet Details
   * Gets a List of Users Wallets.
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletsDataResponse
   * @throws ApiException if fails to make API call
   */
  public WalletsDataResponse v1userwalletcoinwallets(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/user/wallet/coin/wallets".replaceAll("\\{format\\}","json");

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

    GenericType<WalletsDataResponse> localVarReturnType = new GenericType<WalletsDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancelled Coin Withdrawals
   * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletCoinWithdrawDataResponse
   * @throws ApiException if fails to make API call
   */
  public WalletCoinWithdrawDataResponse v1walletwithdrawcancelled(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1walletwithdrawcancelled");
    }
    
    // create path and map variables
    String localVarPath = "/v1/wallet/coin/withdraw/cancelled".replaceAll("\\{format\\}","json");

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

    GenericType<WalletCoinWithdrawDataResponse> localVarReturnType = new GenericType<WalletCoinWithdrawDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Completed Coin Withdrawals
   * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletCoinWithdrawDataResponse
   * @throws ApiException if fails to make API call
   */
  public WalletCoinWithdrawDataResponse v1walletwithdrawcompleted(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1walletwithdrawcompleted");
    }
    
    // create path and map variables
    String localVarPath = "/v1/wallet/coin/withdraw/completed".replaceAll("\\{format\\}","json");

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

    GenericType<WalletCoinWithdrawDataResponse> localVarReturnType = new GenericType<WalletCoinWithdrawDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Unverified Coin Withdrawals
   * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletCoinWithdrawDataResponse
   * @throws ApiException if fails to make API call
   */
  public WalletCoinWithdrawDataResponse v1walletwithdrawunverified(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1walletwithdrawunverified");
    }
    
    // create path and map variables
    String localVarPath = "/v1/wallet/coin/withdraw/unverified".replaceAll("\\{format\\}","json");

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

    GenericType<WalletCoinWithdrawDataResponse> localVarReturnType = new GenericType<WalletCoinWithdrawDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verified Coin Withdrawals
   * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletCoinWithdrawDataResponse
   * @throws ApiException if fails to make API call
   */
  public WalletCoinWithdrawDataResponse v1walletwithdrawverified(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1walletwithdrawverified");
    }
    
    // create path and map variables
    String localVarPath = "/v1/wallet/coin/withdraw/verified".replaceAll("\\{format\\}","json");

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

    GenericType<WalletCoinWithdrawDataResponse> localVarReturnType = new GenericType<WalletCoinWithdrawDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
