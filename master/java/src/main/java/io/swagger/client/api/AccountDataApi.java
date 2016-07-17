package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.FailResult;
import io.swagger.client.model.BankSummaryDataResponse;
import io.swagger.client.model.DoubleDataResponse;
import io.swagger.client.model.KYCDataResponse;
import io.swagger.client.model.SuccCoinRefDataResponse;
import io.swagger.client.model.SuccRefDataResponse;
import io.swagger.client.model.AllRefDataResponse;
import io.swagger.client.model.TradeSummaryDataResponse;
import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.UserSummaryDataResponse;
import io.swagger.client.model.WalletSummaryDataResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class AccountDataApi {
  private ApiClient apiClient;

  public AccountDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Exchange Bank Summary
   * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return BankSummaryDataResponse
   * @throws ApiException if fails to make API call
   */
  public BankSummaryDataResponse v1exchangebanksummary(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1exchangebanksummary");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/summary".replaceAll("\\{format\\}","json");

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

    GenericType<BankSummaryDataResponse> localVarReturnType = new GenericType<BankSummaryDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Users Coin Fee Percentage
   * Returns the users coin fee percentage. The response is in percentage.
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return DoubleDataResponse
   * @throws ApiException if fails to make API call
   */
  public DoubleDataResponse v1exchangeusercoinfee(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/coin/fee".replaceAll("\\{format\\}","json");

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

    GenericType<DoubleDataResponse> localVarReturnType = new GenericType<DoubleDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Users Fiat Fee Percentage
   * Returns the users fiat fee percentage. The response is in percentage.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return DoubleDataResponse
   * @throws ApiException if fails to make API call
   */
  public DoubleDataResponse v1exchangeuserfiatfee(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1exchangeuserfiatfee");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/fiat/fee".replaceAll("\\{format\\}","json");

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

    GenericType<DoubleDataResponse> localVarReturnType = new GenericType<DoubleDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Coinsecure.me Netki Lookup
   * Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.
   * @param netkiName  (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return DoubleDataResponse
   * @throws ApiException if fails to make API call
   */
  public DoubleDataResponse v1netkisearchNetkiName(String netkiName, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'netkiName' is set
    if (netkiName == null) {
      throw new ApiException(400, "Missing the required parameter 'netkiName' when calling v1netkisearchNetkiName");
    }
    
    // create path and map variables
    String localVarPath = "/v1/netki/search/{netkiName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "netkiName" + "\\}", apiClient.escapeString(netkiName.toString()));

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

    GenericType<DoubleDataResponse> localVarReturnType = new GenericType<DoubleDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets KYC Status Details
   * Gets Users KYC Status Details.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return KYCDataResponse
   * @throws ApiException if fails to make API call
   */
  public KYCDataResponse v1userexchangekycs(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangekycs");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/kycs".replaceAll("\\{format\\}","json");

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

    GenericType<KYCDataResponse> localVarReturnType = new GenericType<KYCDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Users Paid Fiat Referrals
   * Returns the Users Paid Coin Referrals.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccCoinRefDataResponse
   * @throws ApiException if fails to make API call
   */
  public SuccCoinRefDataResponse v1userexchangereferralcoinpaid(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferralcoinpaid");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/referral/coin/paid".replaceAll("\\{format\\}","json");

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

    GenericType<SuccCoinRefDataResponse> localVarReturnType = new GenericType<SuccCoinRefDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets Users Successful Referral Links
   * Gets Users Successful Referral Links that can be used during signup.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccRefDataResponse
   * @throws ApiException if fails to make API call
   */
  public SuccRefDataResponse v1userexchangereferralcoinsuccessful(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferralcoinsuccessful");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/referral/coin/successful".replaceAll("\\{format\\}","json");

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

    GenericType<SuccRefDataResponse> localVarReturnType = new GenericType<SuccRefDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Users Paid Fiat Referrals
   * Returns the Users Paid Fiat Referrals.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccCoinRefDataResponse
   * @throws ApiException if fails to make API call
   */
  public SuccCoinRefDataResponse v1userexchangereferralfiatpaid(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferralfiatpaid");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/referral/fiat/paid".replaceAll("\\{format\\}","json");

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

    GenericType<SuccCoinRefDataResponse> localVarReturnType = new GenericType<SuccCoinRefDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets Users Referral Links
   * Gets Users Referral Links that can be used during signup.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return AllRefDataResponse
   * @throws ApiException if fails to make API call
   */
  public AllRefDataResponse v1userexchangereferrals(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferrals");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/referrals".replaceAll("\\{format\\}","json");

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

    GenericType<AllRefDataResponse> localVarReturnType = new GenericType<AllRefDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Exchange Trade Summary
   * Gets a Summary of Exchange Trade Data.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeSummaryDataResponse
   * @throws ApiException if fails to make API call
   */
  public TradeSummaryDataResponse v1userexchangetradesummary(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangetradesummary");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/trade/summary".replaceAll("\\{format\\}","json");

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

    GenericType<TradeSummaryDataResponse> localVarReturnType = new GenericType<TradeSummaryDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Login Token Email
   * Retrieves details of a Login Token
   * @param token  (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userlogintokenToken(String token, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling v1userlogintokenToken");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/login/token/{token}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Exchange Bank Summary
   * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return UserSummaryDataResponse
   * @throws ApiException if fails to make API call
   */
  public UserSummaryDataResponse v1usersummary(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1usersummary");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/summary".replaceAll("\\{format\\}","json");

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

    GenericType<UserSummaryDataResponse> localVarReturnType = new GenericType<UserSummaryDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Exchange Bank Summary
   * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return WalletSummaryDataResponse
   * @throws ApiException if fails to make API call
   */
  public WalletSummaryDataResponse v1userwalletsummary(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling v1userwalletsummary");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/wallet/summary".replaceAll("\\{format\\}","json");

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

    GenericType<WalletSummaryDataResponse> localVarReturnType = new GenericType<WalletSummaryDataResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
