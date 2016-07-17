package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.SendCoin;
import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.WithdrawID;
import io.swagger.client.model.Code;
import io.swagger.client.model.NewBankForm;
import io.swagger.client.model.DepositID;
import io.swagger.client.model.NewFiatBankDeposit;
import io.swagger.client.model.WithdrawFiat;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class ExchangeBankActionsApi {
  private ApiClient apiClient;

  public ExchangeBankActionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExchangeBankActionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Initiate Bitcoin Withdrawal
   * The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
   * @param body Please send the form with valid inputs. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankcoinwithdrawinitiate(SendCoin body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankcoinwithdrawinitiate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/withdraw/initiate".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Verification Code.
   * Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.
   * @param body You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankcoinwithdrawnewVerifycode(WithdrawID body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankcoinwithdrawnewVerifycode");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/withdraw/newVerifycode".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel Bitcoin Withdrawal
   * Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.
   * @param body You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankcoinwithdrawunverifiedcancel(WithdrawID body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankcoinwithdrawunverifiedcancel");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/withdraw/unverified/cancel".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verify Bitcoin Withdrawal
   * Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
   * @param body You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankcoinwithdrawverify(Code body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankcoinwithdrawverify");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/coin/withdraw/verify".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * New Bank Link
   * Submits a New Bank Link on KYC Verified Accounts.
   * @param body Please send the form with valid inputs. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankfiataccountnew(NewBankForm body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankfiataccountnew");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/fiat/account/new".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel Unverified Exchange Fiat Deposit
   * Cancels an unverified Exchange Fiat Deposit.
   * @param body Please send the form with valid inputs. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankfiatdepositcancel(DepositID body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankfiatdepositcancel");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/fiat/deposit/cancel".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * New Exchange Fiat Deposit
   * Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.
   * @param body Please send the form with valid inputs. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankfiatdepositnew(NewFiatBankDeposit body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankfiatdepositnew");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/fiat/deposit/new".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Initiate Fiat Withdrawal
   * The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
   * @param body Please send the form with valid inputs. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankfiatwithdrawinitiate(WithdrawFiat body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankfiatwithdrawinitiate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/fiat/withdraw/initiate".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets a Fiat Verification Code.
   * Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.
   * @param body You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankfiatwithdrawnewVerifycode(WithdrawID body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankfiatwithdrawnewVerifycode");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/fiat/withdraw/newVerifycode".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel Fiat Withdrawal
   * Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.
   * @param body You can get the code from /v1/user/exchange/bank/fiat/withdraw/unverified. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankfiatwithdrawunverifiedcancel(WithdrawID body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankfiatwithdrawunverifiedcancel");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/fiat/withdraw/unverified/cancel".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verify Fiat Withdrawal
   * Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.
   * @param body You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangebankfiatwithdrawverify(Code body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userexchangebankfiatwithdrawverify");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/bank/fiat/withdraw/verify".replaceAll("\\{format\\}","json");

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

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
