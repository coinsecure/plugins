package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

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

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class AccountActionsApi {
  String basePath = "https://api.coinsecure.in/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Creates a Login Instance and returns an API Key.
  * Creates a Login Instance and returns an API Key
   * @param body Please send the form with valid inputs.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return StandardLoginResultData
  */
  public StandardLoginResultData v1login (LoginFormNew body, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1login",
      new ApiException(400, "Missing the required parameter 'body' when calling v1login"));
      }
  

  // create path and map variables
  String path = "/v1/login".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (StandardLoginResultData) ApiInvoker.deserialize(localVarResponse, "", StandardLoginResultData.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Creates a Login Instance and returns an API Key.
   * Creates a Login Instance and returns an API Key
   * @param body Please send the form with valid inputs.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1login (LoginFormNew body, String accept, final Response.Listener<StandardLoginResultData> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1login",
         new ApiException(400, "Missing the required parameter 'body' when calling v1login"));
    }
    

    // create path and map variables
    String path = "/v1/login".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((StandardLoginResultData) ApiInvoker.deserialize(localVarResponse,  "", StandardLoginResultData.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Initiate Login
  * Sends an Email with a Verification Link.
   * @param body Enter a valid Login ID. This method will send an email with a token to be used for login.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return StandardInitiateLoginResultData
  */
  public StandardInitiateLoginResultData v1logininitiate (LoginId body, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1logininitiate",
      new ApiException(400, "Missing the required parameter 'body' when calling v1logininitiate"));
      }
  

  // create path and map variables
  String path = "/v1/login/initiate".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (StandardInitiateLoginResultData) ApiInvoker.deserialize(localVarResponse, "", StandardInitiateLoginResultData.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Initiate Login
   * Sends an Email with a Verification Link.
   * @param body Enter a valid Login ID. This method will send an email with a token to be used for login.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1logininitiate (LoginId body, String accept, final Response.Listener<StandardInitiateLoginResultData> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1logininitiate",
         new ApiException(400, "Missing the required parameter 'body' when calling v1logininitiate"));
    }
    

    // create path and map variables
    String path = "/v1/login/initiate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((StandardInitiateLoginResultData) ApiInvoker.deserialize(localVarResponse,  "", StandardInitiateLoginResultData.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Sends an email with a password reset token
  * Sends an email with a password reset token
   * @param body Enter a valid and registered Email ID.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1loginpasswordforgot (Email body, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1loginpasswordforgot",
      new ApiException(400, "Missing the required parameter 'body' when calling v1loginpasswordforgot"));
      }
  

  // create path and map variables
  String path = "/v1/login/password/forgot".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Sends an email with a password reset token
   * Sends an email with a password reset token
   * @param body Enter a valid and registered Email ID.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1loginpasswordforgot (Email body, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1loginpasswordforgot",
         new ApiException(400, "Missing the required parameter 'body' when calling v1loginpasswordforgot"));
    }
    

    // create path and map variables
    String path = "/v1/login/password/forgot".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Creates a new Unverified Account.
  * Creates a new Unverified Account.
   * @param body Please send the form with valid inputs.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1signup (SignupForm body, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1signup",
      new ApiException(400, "Missing the required parameter 'body' when calling v1signup"));
      }
  

  // create path and map variables
  String path = "/v1/signup".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Creates a new Unverified Account.
   * Creates a new Unverified Account.
   * @param body Please send the form with valid inputs.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1signup (SignupForm body, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1signup",
         new ApiException(400, "Missing the required parameter 'body' when calling v1signup"));
    }
    

    // create path and map variables
    String path = "/v1/signup".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Send OTP for Bank Link
  * Send OTP for an additional Bank Link.
   * @param number 
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return StandardInitiateLoginResultData
  */
  public StandardInitiateLoginResultData v1userbankotpNumber (String number, String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'number' is set
      if (number == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'number' when calling v1userbankotpNumber",
      new ApiException(400, "Missing the required parameter 'number' when calling v1userbankotpNumber"));
      }
  

  // create path and map variables
  String path = "/v1/user/bank/otp/{number}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "number" + "\\}", apiInvoker.escapeString(number.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (StandardInitiateLoginResultData) ApiInvoker.deserialize(localVarResponse, "", StandardInitiateLoginResultData.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Send OTP for Bank Link
   * Send OTP for an additional Bank Link.
   * @param number    * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userbankotpNumber (String number, String authorization, String accept, final Response.Listener<StandardInitiateLoginResultData> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'number' is set
    if (number == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'number' when calling v1userbankotpNumber",
         new ApiException(400, "Missing the required parameter 'number' when calling v1userbankotpNumber"));
    }
    

    // create path and map variables
    String path = "/v1/user/bank/otp/{number}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "number" + "\\}", apiInvoker.escapeString(number.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((StandardInitiateLoginResultData) ApiInvoker.deserialize(localVarResponse,  "", StandardInitiateLoginResultData.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Submits a New Bank Link and initial KYC Documents.
  * Submits a New Bank Link and initial KYC Documents.
   * @param panNumber Please enter your Pan Card Number
   * @param acctNick Please enter an Account NickName
   * @param name Please enter your Name as it appears on your Bank account.
   * @param ban Please enter your Bank account number.
   * @param ifsc Please enter your IFSC Code.
   * @param acctType Please enter your Coinsecure account type. Allowable Values are Personal or Company.
   * @param banType Please enter your Bank account type. Allowable Values are Savings or Current.
   * @param phone Please enter your Valid Phone Number.
   * @param otp Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number.
   * @param file Enter a valid image, pdf or zip file under 5 MB in size.
   * @param authorization Enter a valid Api Key.
   * @param message Please enter an optional message if needed.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1userexchangekyc (String panNumber, String acctNick, String name, String ban, String ifsc, String acctType, String banType, String phone, String otp, File file, String authorization, String message, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'panNumber' is set
      if (panNumber == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'panNumber' when calling v1userexchangekyc",
      new ApiException(400, "Missing the required parameter 'panNumber' when calling v1userexchangekyc"));
      }
  
      // verify the required parameter 'acctNick' is set
      if (acctNick == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'acctNick' when calling v1userexchangekyc",
      new ApiException(400, "Missing the required parameter 'acctNick' when calling v1userexchangekyc"));
      }
  
      // verify the required parameter 'name' is set
      if (name == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'name' when calling v1userexchangekyc",
      new ApiException(400, "Missing the required parameter 'name' when calling v1userexchangekyc"));
      }
  
      // verify the required parameter 'ban' is set
      if (ban == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ban' when calling v1userexchangekyc",
      new ApiException(400, "Missing the required parameter 'ban' when calling v1userexchangekyc"));
      }
  
      // verify the required parameter 'ifsc' is set
      if (ifsc == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'ifsc' when calling v1userexchangekyc",
      new ApiException(400, "Missing the required parameter 'ifsc' when calling v1userexchangekyc"));
      }
  
      // verify the required parameter 'acctType' is set
      if (acctType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'acctType' when calling v1userexchangekyc",
      new ApiException(400, "Missing the required parameter 'acctType' when calling v1userexchangekyc"));
      }
  
      // verify the required parameter 'banType' is set
      if (banType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'banType' when calling v1userexchangekyc",
      new ApiException(400, "Missing the required parameter 'banType' when calling v1userexchangekyc"));
      }
  
      // verify the required parameter 'phone' is set
      if (phone == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'phone' when calling v1userexchangekyc",
      new ApiException(400, "Missing the required parameter 'phone' when calling v1userexchangekyc"));
      }
  
      // verify the required parameter 'otp' is set
      if (otp == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'otp' when calling v1userexchangekyc",
      new ApiException(400, "Missing the required parameter 'otp' when calling v1userexchangekyc"));
      }
  
      // verify the required parameter 'file' is set
      if (file == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'file' when calling v1userexchangekyc",
      new ApiException(400, "Missing the required parameter 'file' when calling v1userexchangekyc"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/kyc".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "multipart/form-data"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (panNumber != null) {
          localVarBuilder.addTextBody("panNumber", ApiInvoker.parameterToString(panNumber), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (acctNick != null) {
          localVarBuilder.addTextBody("acctNick", ApiInvoker.parameterToString(acctNick), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (name != null) {
          localVarBuilder.addTextBody("name", ApiInvoker.parameterToString(name), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (ban != null) {
          localVarBuilder.addTextBody("ban", ApiInvoker.parameterToString(ban), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (ifsc != null) {
          localVarBuilder.addTextBody("ifsc", ApiInvoker.parameterToString(ifsc), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (acctType != null) {
          localVarBuilder.addTextBody("acctType", ApiInvoker.parameterToString(acctType), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (message != null) {
          localVarBuilder.addTextBody("message", ApiInvoker.parameterToString(message), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (banType != null) {
          localVarBuilder.addTextBody("banType", ApiInvoker.parameterToString(banType), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (phone != null) {
          localVarBuilder.addTextBody("phone", ApiInvoker.parameterToString(phone), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (otp != null) {
          localVarBuilder.addTextBody("otp", ApiInvoker.parameterToString(otp), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (file != null) {
          localVarBuilder.addBinaryBody("file", file);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("panNumber", ApiInvoker.parameterToString(panNumber));
formParams.put("acctNick", ApiInvoker.parameterToString(acctNick));
formParams.put("name", ApiInvoker.parameterToString(name));
formParams.put("ban", ApiInvoker.parameterToString(ban));
formParams.put("ifsc", ApiInvoker.parameterToString(ifsc));
formParams.put("acctType", ApiInvoker.parameterToString(acctType));
formParams.put("message", ApiInvoker.parameterToString(message));
formParams.put("banType", ApiInvoker.parameterToString(banType));
formParams.put("phone", ApiInvoker.parameterToString(phone));
formParams.put("otp", ApiInvoker.parameterToString(otp));

      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Submits a New Bank Link and initial KYC Documents.
   * Submits a New Bank Link and initial KYC Documents.
   * @param panNumber Please enter your Pan Card Number   * @param acctNick Please enter an Account NickName   * @param name Please enter your Name as it appears on your Bank account.   * @param ban Please enter your Bank account number.   * @param ifsc Please enter your IFSC Code.   * @param acctType Please enter your Coinsecure account type. Allowable Values are Personal or Company.   * @param banType Please enter your Bank account type. Allowable Values are Savings or Current.   * @param phone Please enter your Valid Phone Number.   * @param otp Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number.   * @param file Enter a valid image, pdf or zip file under 5 MB in size.   * @param authorization Enter a valid Api Key.   * @param message Please enter an optional message if needed.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangekyc (String panNumber, String acctNick, String name, String ban, String ifsc, String acctType, String banType, String phone, String otp, File file, String authorization, String message, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'panNumber' is set
    if (panNumber == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'panNumber' when calling v1userexchangekyc",
         new ApiException(400, "Missing the required parameter 'panNumber' when calling v1userexchangekyc"));
    }
    
    // verify the required parameter 'acctNick' is set
    if (acctNick == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'acctNick' when calling v1userexchangekyc",
         new ApiException(400, "Missing the required parameter 'acctNick' when calling v1userexchangekyc"));
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'name' when calling v1userexchangekyc",
         new ApiException(400, "Missing the required parameter 'name' when calling v1userexchangekyc"));
    }
    
    // verify the required parameter 'ban' is set
    if (ban == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'ban' when calling v1userexchangekyc",
         new ApiException(400, "Missing the required parameter 'ban' when calling v1userexchangekyc"));
    }
    
    // verify the required parameter 'ifsc' is set
    if (ifsc == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'ifsc' when calling v1userexchangekyc",
         new ApiException(400, "Missing the required parameter 'ifsc' when calling v1userexchangekyc"));
    }
    
    // verify the required parameter 'acctType' is set
    if (acctType == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'acctType' when calling v1userexchangekyc",
         new ApiException(400, "Missing the required parameter 'acctType' when calling v1userexchangekyc"));
    }
    
    // verify the required parameter 'banType' is set
    if (banType == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'banType' when calling v1userexchangekyc",
         new ApiException(400, "Missing the required parameter 'banType' when calling v1userexchangekyc"));
    }
    
    // verify the required parameter 'phone' is set
    if (phone == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'phone' when calling v1userexchangekyc",
         new ApiException(400, "Missing the required parameter 'phone' when calling v1userexchangekyc"));
    }
    
    // verify the required parameter 'otp' is set
    if (otp == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'otp' when calling v1userexchangekyc",
         new ApiException(400, "Missing the required parameter 'otp' when calling v1userexchangekyc"));
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'file' when calling v1userexchangekyc",
         new ApiException(400, "Missing the required parameter 'file' when calling v1userexchangekyc"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/kyc".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (panNumber != null) {
        localVarBuilder.addTextBody("panNumber", ApiInvoker.parameterToString(panNumber), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (acctNick != null) {
        localVarBuilder.addTextBody("acctNick", ApiInvoker.parameterToString(acctNick), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (name != null) {
        localVarBuilder.addTextBody("name", ApiInvoker.parameterToString(name), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (ban != null) {
        localVarBuilder.addTextBody("ban", ApiInvoker.parameterToString(ban), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (ifsc != null) {
        localVarBuilder.addTextBody("ifsc", ApiInvoker.parameterToString(ifsc), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (acctType != null) {
        localVarBuilder.addTextBody("acctType", ApiInvoker.parameterToString(acctType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (message != null) {
        localVarBuilder.addTextBody("message", ApiInvoker.parameterToString(message), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (banType != null) {
        localVarBuilder.addTextBody("banType", ApiInvoker.parameterToString(banType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (phone != null) {
        localVarBuilder.addTextBody("phone", ApiInvoker.parameterToString(phone), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (otp != null) {
        localVarBuilder.addTextBody("otp", ApiInvoker.parameterToString(otp), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (file != null) {
        localVarBuilder.addBinaryBody("file", file);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("panNumber", ApiInvoker.parameterToString(panNumber));
formParams.put("acctNick", ApiInvoker.parameterToString(acctNick));
formParams.put("name", ApiInvoker.parameterToString(name));
formParams.put("ban", ApiInvoker.parameterToString(ban));
formParams.put("ifsc", ApiInvoker.parameterToString(ifsc));
formParams.put("acctType", ApiInvoker.parameterToString(acctType));
formParams.put("message", ApiInvoker.parameterToString(message));
formParams.put("banType", ApiInvoker.parameterToString(banType));
formParams.put("phone", ApiInvoker.parameterToString(phone));
formParams.put("otp", ApiInvoker.parameterToString(otp));

    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Delete GCM Code
  * Delete GCM Code and associated API Key.
   * @param code 
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1usergcmCode (String code, String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'code' is set
      if (code == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'code' when calling v1usergcmCode",
      new ApiException(400, "Missing the required parameter 'code' when calling v1usergcmCode"));
      }
  

  // create path and map variables
  String path = "/v1/user/gcm/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Delete GCM Code
   * Delete GCM Code and associated API Key.
   * @param code    * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1usergcmCode (String code, String authorization, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'code' is set
    if (code == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'code' when calling v1usergcmCode",
         new ApiException(400, "Missing the required parameter 'code' when calling v1usergcmCode"));
    }
    

    // create path and map variables
    String path = "/v1/user/gcm/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Send OTP for KYC Link
  * Send OTP for KYC Link.
   * @param number 
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1userkycotpNumber (String number, String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'number' is set
      if (number == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'number' when calling v1userkycotpNumber",
      new ApiException(400, "Missing the required parameter 'number' when calling v1userkycotpNumber"));
      }
  

  // create path and map variables
  String path = "/v1/user/kyc/otp/{number}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "number" + "\\}", apiInvoker.escapeString(number.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Send OTP for KYC Link
   * Send OTP for KYC Link.
   * @param number    * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userkycotpNumber (String number, String authorization, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'number' is set
    if (number == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'number' when calling v1userkycotpNumber",
         new ApiException(400, "Missing the required parameter 'number' when calling v1userkycotpNumber"));
    }
    

    // create path and map variables
    String path = "/v1/user/kyc/otp/{number}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "number" + "\\}", apiInvoker.escapeString(number.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Logout User
  * Logs out user and Deletes the api key and associated session data.
   * @param authorization Enter a valid Api Key.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1userlogout (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/v1/user/logout".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Logout User
   * Logs out user and Deletes the api key and associated session data.
   * @param authorization Enter a valid Api Key.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userlogout (String authorization, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/v1/user/logout".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Create Neki Wallet Name
  * Creates a new Netki Wallet Name.
   * @param body Enter a valid Netki name and Bitcoin address from Wallet or Exchange.
   * @param authorization Enter a valid Api Key.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1usernetkicreate (NetkiNameAddress body, String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1usernetkicreate",
      new ApiException(400, "Missing the required parameter 'body' when calling v1usernetkicreate"));
      }
  

  // create path and map variables
  String path = "/v1/user/netki/create".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Create Neki Wallet Name
   * Creates a new Netki Wallet Name.
   * @param body Enter a valid Netki name and Bitcoin address from Wallet or Exchange.   * @param authorization Enter a valid Api Key.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1usernetkicreate (NetkiNameAddress body, String authorization, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1usernetkicreate",
         new ApiException(400, "Missing the required parameter 'body' when calling v1usernetkicreate"));
    }
    

    // create path and map variables
    String path = "/v1/user/netki/create".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Update Netki Address
  * Updates the address on an existing wallet name.
   * @param body Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name.
   * @param authorization Enter a valid Api Key.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1usernetkiupdate (Address body, String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1usernetkiupdate",
      new ApiException(400, "Missing the required parameter 'body' when calling v1usernetkiupdate"));
      }
  

  // create path and map variables
  String path = "/v1/user/netki/update".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Update Netki Address
   * Updates the address on an existing wallet name.
   * @param body Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name.   * @param authorization Enter a valid Api Key.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1usernetkiupdate (Address body, String authorization, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1usernetkiupdate",
         new ApiException(400, "Missing the required parameter 'body' when calling v1usernetkiupdate"));
    }
    

    // create path and map variables
    String path = "/v1/user/netki/update".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Delete Profile Image
  * Deletes a profile Image.
   * @param body Please enter a valid Netki name associated with your prfile Image.
   * @param authorization Enter a valid Api Key.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1userprofileimagedelete (NetkiName body, String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1userprofileimagedelete",
      new ApiException(400, "Missing the required parameter 'body' when calling v1userprofileimagedelete"));
      }
  

  // create path and map variables
  String path = "/v1/user/contact".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Delete Profile Image
   * Deletes a profile Image.
   * @param body Please enter a valid Netki name associated with your prfile Image.   * @param authorization Enter a valid Api Key.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userprofileimagedelete (NetkiName body, String authorization, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1userprofileimagedelete",
         new ApiException(400, "Missing the required parameter 'body' when calling v1userprofileimagedelete"));
    }
    

    // create path and map variables
    String path = "/v1/user/contact".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Update Profile Image
  * Updates Profile Image and allows public or private options for netki profile page.
   * @param netkiName Please enter your Netki Wallet Name.
   * @param isPublic Please enter if this image can be public.
   * @param file Enter a valid image, pdf or zip file under 5 MB in size.
   * @param authorization Enter a valid Api Key.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1userprofileimageupdate (String netkiName, Boolean isPublic, File file, String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'netkiName' is set
      if (netkiName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'netkiName' when calling v1userprofileimageupdate",
      new ApiException(400, "Missing the required parameter 'netkiName' when calling v1userprofileimageupdate"));
      }
  
      // verify the required parameter 'isPublic' is set
      if (isPublic == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'isPublic' when calling v1userprofileimageupdate",
      new ApiException(400, "Missing the required parameter 'isPublic' when calling v1userprofileimageupdate"));
      }
  
      // verify the required parameter 'file' is set
      if (file == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'file' when calling v1userprofileimageupdate",
      new ApiException(400, "Missing the required parameter 'file' when calling v1userprofileimageupdate"));
      }
  

  // create path and map variables
  String path = "/v1/user/profile/image/update".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "multipart/form-data"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (netkiName != null) {
          localVarBuilder.addTextBody("netkiName", ApiInvoker.parameterToString(netkiName), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (isPublic != null) {
          localVarBuilder.addTextBody("isPublic", ApiInvoker.parameterToString(isPublic), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (file != null) {
          localVarBuilder.addBinaryBody("file", file);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("netkiName", ApiInvoker.parameterToString(netkiName));
formParams.put("isPublic", ApiInvoker.parameterToString(isPublic));

      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Update Profile Image
   * Updates Profile Image and allows public or private options for netki profile page.
   * @param netkiName Please enter your Netki Wallet Name.   * @param isPublic Please enter if this image can be public.   * @param file Enter a valid image, pdf or zip file under 5 MB in size.   * @param authorization Enter a valid Api Key.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userprofileimageupdate (String netkiName, Boolean isPublic, File file, String authorization, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'netkiName' is set
    if (netkiName == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'netkiName' when calling v1userprofileimageupdate",
         new ApiException(400, "Missing the required parameter 'netkiName' when calling v1userprofileimageupdate"));
    }
    
    // verify the required parameter 'isPublic' is set
    if (isPublic == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'isPublic' when calling v1userprofileimageupdate",
         new ApiException(400, "Missing the required parameter 'isPublic' when calling v1userprofileimageupdate"));
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'file' when calling v1userprofileimageupdate",
         new ApiException(400, "Missing the required parameter 'file' when calling v1userprofileimageupdate"));
    }
    

    // create path and map variables
    String path = "/v1/user/profile/image/update".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (netkiName != null) {
        localVarBuilder.addTextBody("netkiName", ApiInvoker.parameterToString(netkiName), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (isPublic != null) {
        localVarBuilder.addTextBody("isPublic", ApiInvoker.parameterToString(isPublic), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (file != null) {
        localVarBuilder.addBinaryBody("file", file);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("netkiName", ApiInvoker.parameterToString(netkiName));
formParams.put("isPublic", ApiInvoker.parameterToString(isPublic));

    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * New Profile Phone
  * Set a New Profile Phone Number.
   * @param body You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number
   * @param authorization Enter a valid Api Key.
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1userprofilephone (NumberOtp body, String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1userprofilephone",
      new ApiException(400, "Missing the required parameter 'body' when calling v1userprofilephone"));
      }
  

  // create path and map variables
  String path = "/v1/user/profile/phone/new".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * New Profile Phone
   * Set a New Profile Phone Number.
   * @param body You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number   * @param authorization Enter a valid Api Key.   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userprofilephone (NumberOtp body, String authorization, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1userprofilephone",
         new ApiException(400, "Missing the required parameter 'body' when calling v1userprofilephone"));
    }
    

    // create path and map variables
    String path = "/v1/user/profile/phone/new".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Delete Profile Phone Number
  * Delete Profile Phone Number.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1userprofilephoneNumber (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/v1/user/profile/phone/delete".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Delete Profile Phone Number
   * Delete Profile Phone Number.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userprofilephoneNumber (String authorization, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/v1/user/profile/phone/delete".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Send OTP for Profile Phone
  * Send OTP for Profile Phone addition or updation.
   * @param number 
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1userprofilephoneotpNumber (String number, String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'number' is set
      if (number == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'number' when calling v1userprofilephoneotpNumber",
      new ApiException(400, "Missing the required parameter 'number' when calling v1userprofilephoneotpNumber"));
      }
  

  // create path and map variables
  String path = "/v1/user/profile/phone/otp/{number}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "number" + "\\}", apiInvoker.escapeString(number.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Send OTP for Profile Phone
   * Send OTP for Profile Phone addition or updation.
   * @param number    * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userprofilephoneotpNumber (String number, String authorization, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'number' is set
    if (number == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'number' when calling v1userprofilephoneotpNumber",
         new ApiException(400, "Missing the required parameter 'number' when calling v1userprofilephoneotpNumber"));
    }
    

    // create path and map variables
    String path = "/v1/user/profile/phone/otp/{number}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "number" + "\\}", apiInvoker.escapeString(number.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
