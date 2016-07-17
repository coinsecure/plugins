package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.FailResult;
import io.swagger.client.model.LoginFormNew;
import io.swagger.client.model.StandardLoginResultData;
import io.swagger.client.model.LoginId;
import io.swagger.client.model.StandardInitiateLoginResultData;
import io.swagger.client.model.Email;
import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.SignupForm;
import java.io.File;
import io.swagger.client.model.NetkiNameAddress;
import io.swagger.client.model.Address;
import io.swagger.client.model.NetkiName;
import io.swagger.client.model.NumberOtp;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class AccountActionsApi {
  private ApiClient apiClient;

  public AccountActionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountActionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a Login Instance and returns an API Key.
   * Creates a Login Instance and returns an API Key
   * @param body Please send the form with valid inputs. (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return StandardLoginResultData
   * @throws ApiException if fails to make API call
   */
  public StandardLoginResultData v1login(LoginFormNew body, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1login");
    }
    
    // create path and map variables
    String localVarPath = "/v1/login".replaceAll("\\{format\\}","json");

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

    GenericType<StandardLoginResultData> localVarReturnType = new GenericType<StandardLoginResultData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Initiate Login
   * Sends an Email with a Verification Link.
   * @param body Enter a valid Login ID. This method will send an email with a token to be used for login. (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return StandardInitiateLoginResultData
   * @throws ApiException if fails to make API call
   */
  public StandardInitiateLoginResultData v1logininitiate(LoginId body, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1logininitiate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/login/initiate".replaceAll("\\{format\\}","json");

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

    GenericType<StandardInitiateLoginResultData> localVarReturnType = new GenericType<StandardInitiateLoginResultData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sends an email with a password reset token
   * Sends an email with a password reset token
   * @param body Enter a valid and registered Email ID. (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1loginpasswordforgot(Email body, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1loginpasswordforgot");
    }
    
    // create path and map variables
    String localVarPath = "/v1/login/password/forgot".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates a new Unverified Account.
   * Creates a new Unverified Account.
   * @param body Please send the form with valid inputs. (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1signup(SignupForm body, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1signup");
    }
    
    // create path and map variables
    String localVarPath = "/v1/signup".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Send OTP for Bank Link
   * Send OTP for an additional Bank Link.
   * @param number  (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return StandardInitiateLoginResultData
   * @throws ApiException if fails to make API call
   */
  public StandardInitiateLoginResultData v1userbankotpNumber(String number, String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'number' is set
    if (number == null) {
      throw new ApiException(400, "Missing the required parameter 'number' when calling v1userbankotpNumber");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/bank/otp/{number}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "number" + "\\}", apiClient.escapeString(number.toString()));

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

    GenericType<StandardInitiateLoginResultData> localVarReturnType = new GenericType<StandardInitiateLoginResultData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Submits a New Bank Link and initial KYC Documents.
   * Submits a New Bank Link and initial KYC Documents.
   * @param panNumber Please enter your Pan Card Number (required)
   * @param acctNick Please enter an Account NickName (required)
   * @param name Please enter your Name as it appears on your Bank account. (required)
   * @param ban Please enter your Bank account number. (required)
   * @param ifsc Please enter your IFSC Code. (required)
   * @param acctType Please enter your Coinsecure account type. Allowable Values are Personal or Company. (required)
   * @param banType Please enter your Bank account type. Allowable Values are Savings or Current. (required)
   * @param phone Please enter your Valid Phone Number. (required)
   * @param otp Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number. (required)
   * @param file Enter a valid image, pdf or zip file under 5 MB in size. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param message Please enter an optional message if needed. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userexchangekyc(String panNumber, String acctNick, String name, String ban, String ifsc, String acctType, String banType, String phone, String otp, File file, String authorization, String message, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'panNumber' is set
    if (panNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'panNumber' when calling v1userexchangekyc");
    }
    
    // verify the required parameter 'acctNick' is set
    if (acctNick == null) {
      throw new ApiException(400, "Missing the required parameter 'acctNick' when calling v1userexchangekyc");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling v1userexchangekyc");
    }
    
    // verify the required parameter 'ban' is set
    if (ban == null) {
      throw new ApiException(400, "Missing the required parameter 'ban' when calling v1userexchangekyc");
    }
    
    // verify the required parameter 'ifsc' is set
    if (ifsc == null) {
      throw new ApiException(400, "Missing the required parameter 'ifsc' when calling v1userexchangekyc");
    }
    
    // verify the required parameter 'acctType' is set
    if (acctType == null) {
      throw new ApiException(400, "Missing the required parameter 'acctType' when calling v1userexchangekyc");
    }
    
    // verify the required parameter 'banType' is set
    if (banType == null) {
      throw new ApiException(400, "Missing the required parameter 'banType' when calling v1userexchangekyc");
    }
    
    // verify the required parameter 'phone' is set
    if (phone == null) {
      throw new ApiException(400, "Missing the required parameter 'phone' when calling v1userexchangekyc");
    }
    
    // verify the required parameter 'otp' is set
    if (otp == null) {
      throw new ApiException(400, "Missing the required parameter 'otp' when calling v1userexchangekyc");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling v1userexchangekyc");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/exchange/kyc".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    if (panNumber != null)
      localVarFormParams.put("panNumber", panNumber);
if (acctNick != null)
      localVarFormParams.put("acctNick", acctNick);
if (name != null)
      localVarFormParams.put("name", name);
if (ban != null)
      localVarFormParams.put("ban", ban);
if (ifsc != null)
      localVarFormParams.put("ifsc", ifsc);
if (acctType != null)
      localVarFormParams.put("acctType", acctType);
if (message != null)
      localVarFormParams.put("message", message);
if (banType != null)
      localVarFormParams.put("banType", banType);
if (phone != null)
      localVarFormParams.put("phone", phone);
if (otp != null)
      localVarFormParams.put("otp", otp);
if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete GCM Code
   * Delete GCM Code and associated API Key.
   * @param code  (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1usergcmCode(String code, String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling v1usergcmCode");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/gcm/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
   * Send OTP for KYC Link
   * Send OTP for KYC Link.
   * @param number  (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userkycotpNumber(String number, String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'number' is set
    if (number == null) {
      throw new ApiException(400, "Missing the required parameter 'number' when calling v1userkycotpNumber");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/kyc/otp/{number}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "number" + "\\}", apiClient.escapeString(number.toString()));

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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Logout User
   * Logs out user and Deletes the api key and associated session data.
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userlogout(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/user/logout".replaceAll("\\{format\\}","json");

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
   * Create Neki Wallet Name
   * Creates a new Netki Wallet Name.
   * @param body Enter a valid Netki name and Bitcoin address from Wallet or Exchange. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1usernetkicreate(NetkiNameAddress body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1usernetkicreate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/netki/create".replaceAll("\\{format\\}","json");

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
   * Update Netki Address
   * Updates the address on an existing wallet name.
   * @param body Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1usernetkiupdate(Address body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1usernetkiupdate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/netki/update".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete Profile Image
   * Deletes a profile Image.
   * @param body Please enter a valid Netki name associated with your prfile Image. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userprofileimagedelete(NetkiName body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userprofileimagedelete");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/contact".replaceAll("\\{format\\}","json");

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
   * Update Profile Image
   * Updates Profile Image and allows public or private options for netki profile page.
   * @param netkiName Please enter your Netki Wallet Name. (required)
   * @param isPublic Please enter if this image can be public. (required)
   * @param file Enter a valid image, pdf or zip file under 5 MB in size. (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userprofileimageupdate(String netkiName, Boolean isPublic, File file, String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'netkiName' is set
    if (netkiName == null) {
      throw new ApiException(400, "Missing the required parameter 'netkiName' when calling v1userprofileimageupdate");
    }
    
    // verify the required parameter 'isPublic' is set
    if (isPublic == null) {
      throw new ApiException(400, "Missing the required parameter 'isPublic' when calling v1userprofileimageupdate");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling v1userprofileimageupdate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/profile/image/update".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
if (accept != null)
      localVarHeaderParams.put("accept", apiClient.parameterToString(accept));

    if (netkiName != null)
      localVarFormParams.put("netkiName", netkiName);
if (isPublic != null)
      localVarFormParams.put("isPublic", isPublic);
if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "application/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessResult> localVarReturnType = new GenericType<SuccessResult>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * New Profile Phone
   * Set a New Profile Phone Number.
   * @param body You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userprofilephone(NumberOtp body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userprofilephone");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/profile/phone/new".replaceAll("\\{format\\}","json");

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
   * Delete Profile Phone Number
   * Delete Profile Phone Number.
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userprofilephoneNumber(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/user/profile/phone/delete".replaceAll("\\{format\\}","json");

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
   * Send OTP for Profile Phone
   * Send OTP for Profile Phone addition or updation.
   * @param number  (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userprofilephoneotpNumber(String number, String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'number' is set
    if (number == null) {
      throw new ApiException(400, "Missing the required parameter 'number' when calling v1userprofilephoneotpNumber");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/profile/phone/otp/{number}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "number" + "\\}", apiClient.escapeString(number.toString()));

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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
