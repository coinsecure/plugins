package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.MethodCountryMobile;
import io.swagger.client.model.Code;
import io.swagger.client.model.CodeCountryMobile;
import io.swagger.client.model.ChangePassword;
import io.swagger.client.model.ResetPassword;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class SecurityActionsApi {
  private ApiClient apiClient;

  public SecurityActionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SecurityActionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Initiate Authy Registration.
   * Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.
   * @param body Please Send Valid Json as below. (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1mfaauthyinitiate(MethodCountryMobile body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1mfaauthyinitiate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/mfa/authy/initiate".replaceAll("\\{format\\}","json");

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
   * Initiate GA Registration.
   * Returns the Google Authenticator Secret and a QR code URL.
   * @param body Please Send Valid Json as below. (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1mfagainitiate(MethodCountryMobile body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1mfagainitiate");
    }
    
    // create path and map variables
    String localVarPath = "/v1/mfa/ga/initiate".replaceAll("\\{format\\}","json");

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
   * Authy Call Code
   * Calls valid phone user with a code.
   * @param authorization Login Token or any Apikey to be added as Authorization in header (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1usermfaauthycall(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/mfa/authy/call".replaceAll("\\{format\\}","json");

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
   * Disable Authy
   * Disables users Authy
   * @param body Please Send Valid Json as below. (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1usermfaauthydisable(Code body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1usermfaauthydisable");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/mfa/authy/disable".replaceAll("\\{format\\}","json");

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
   * Verify Authy Registration
   * Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.
   * @param body Please Send Valid Json as below. (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1usermfaauthyinitiateenable(CodeCountryMobile body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1usermfaauthyinitiateenable");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/mfa/authy/initiate/enable".replaceAll("\\{format\\}","json");

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
   * Authy Sms Code
   * Disables users Authy
   * @param authorization Login Token or any Apikey to be added as Authorization in header (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1usermfaauthysms(String authorization, String accept) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/mfa/authy/sms".replaceAll("\\{format\\}","json");

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
   * Disable Google Authenticator
   * Disables users Google Authenticator 2FA
   * @param body Please Send Valid Json as below. (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1usermfagadisable(Code body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1usermfagadisable");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/mfa/ga/disable".replaceAll("\\{format\\}","json");

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
   * Enable Google Authenticator
   * Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.
   * @param body Please Send Valid Json as below. (required)
   * @param authorization API object to be added (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1usermfagainitiateenable(CodeCountryMobile body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1usermfagainitiateenable");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/mfa/ga/initiate/enable".replaceAll("\\{format\\}","json");

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
   * Change Password.
   * Changes an account Password.
   * @param body  (required)
   * @param authorization Enter a valid Api Key. (optional)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userpasswordchange(ChangePassword body, String authorization, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userpasswordchange");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/password/change".replaceAll("\\{format\\}","json");

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
   * Reset Password.
   * Resets an account Password. Use forgotPassword to generate a token.
   * @param body Please Send Valid Json as below. (required)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return SuccessResult
   * @throws ApiException if fails to make API call
   */
  public SuccessResult v1userpasswordreset(ResetPassword body, String accept) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1userpasswordreset");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user/password/reset".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
