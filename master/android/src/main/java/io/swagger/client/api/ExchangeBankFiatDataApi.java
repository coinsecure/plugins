package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.FiatBankDataResponse;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.RateDataResponse;
import io.swagger.client.model.FiatDepDataResponse;
import io.swagger.client.model.FiatWithDataResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ExchangeBankFiatDataApi {
  String basePath = "https://api.coinsecure.in";
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
  * Exchange Bitcoin Deposit Addresses
  * Gets a List of Users Exchange Bitcoin Addresses.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return FiatBankDataResponse
  */
  public FiatBankDataResponse v1userexchangebankfiataccounts (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiataccounts",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiataccounts"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/accounts".replaceAll("\\{format\\}","json");

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
           return (FiatBankDataResponse) ApiInvoker.deserialize(localVarResponse, "", FiatBankDataResponse.class);
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
   * Exchange Bitcoin Deposit Addresses
   * Gets a List of Users Exchange Bitcoin Addresses.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiataccounts (String authorization, String accept, final Response.Listener<FiatBankDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiataccounts",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiataccounts"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/accounts".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((FiatBankDataResponse) ApiInvoker.deserialize(localVarResponse,  "", FiatBankDataResponse.class));
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
  * Available Exchange Fiat Balance
  * Returns balance which is in Available for Trades. The response is in paisa.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return RateDataResponse
  */
  public RateDataResponse v1userexchangebankfiatbalanceavailable (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalanceavailable",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalanceavailable"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/balance/total".replaceAll("\\{format\\}","json");

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
           return (RateDataResponse) ApiInvoker.deserialize(localVarResponse, "", RateDataResponse.class);
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
   * Available Exchange Fiat Balance
   * Returns balance which is in Available for Trades. The response is in paisa.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiatbalanceavailable (String authorization, String accept, final Response.Listener<RateDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalanceavailable",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalanceavailable"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/balance/total".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((RateDataResponse) ApiInvoker.deserialize(localVarResponse,  "", RateDataResponse.class));
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
  * In Trade Coin Balance
  * Returns in-trade or pending fiat balance in paisa.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return RateDataResponse
  */
  public RateDataResponse v1userexchangebankfiatbalancepending (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalancepending",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalancepending"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/balance/pending".replaceAll("\\{format\\}","json");

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
           return (RateDataResponse) ApiInvoker.deserialize(localVarResponse, "", RateDataResponse.class);
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
   * In Trade Coin Balance
   * Returns in-trade or pending fiat balance in paisa.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiatbalancepending (String authorization, String accept, final Response.Listener<RateDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalancepending",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalancepending"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/balance/pending".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((RateDataResponse) ApiInvoker.deserialize(localVarResponse,  "", RateDataResponse.class));
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
  * Total Exchange Fiat Balance
  * Returns users total fiat balance in paisa. Pending + Available
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return RateDataResponse
  */
  public RateDataResponse v1userexchangebankfiatbalancetotal (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalancetotal",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalancetotal"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/balance/available".replaceAll("\\{format\\}","json");

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
           return (RateDataResponse) ApiInvoker.deserialize(localVarResponse, "", RateDataResponse.class);
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
   * Total Exchange Fiat Balance
   * Returns users total fiat balance in paisa. Pending + Available
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiatbalancetotal (String authorization, String accept, final Response.Listener<RateDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalancetotal",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalancetotal"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/balance/available".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((RateDataResponse) ApiInvoker.deserialize(localVarResponse,  "", RateDataResponse.class));
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
  * Cancelled Exchange Fiat Deposits
  * Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return FiatDepDataResponse
  */
  public FiatDepDataResponse v1userexchangebankfiatdepositcancelled (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositcancelled",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositcancelled"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/deposit/cancelled".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
           return (FiatDepDataResponse) ApiInvoker.deserialize(localVarResponse, "", FiatDepDataResponse.class);
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
   * Cancelled Exchange Fiat Deposits
   * Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiatdepositcancelled (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<FiatDepDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositcancelled",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositcancelled"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/deposit/cancelled".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
              responseListener.onResponse((FiatDepDataResponse) ApiInvoker.deserialize(localVarResponse,  "", FiatDepDataResponse.class));
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
  * Unverified Exchange Fiat Deposits
  * Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return FiatDepDataResponse
  */
  public FiatDepDataResponse v1userexchangebankfiatdepositunverified (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositunverified",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositunverified"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/deposit/unverified".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
           return (FiatDepDataResponse) ApiInvoker.deserialize(localVarResponse, "", FiatDepDataResponse.class);
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
   * Unverified Exchange Fiat Deposits
   * Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiatdepositunverified (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<FiatDepDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositunverified",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositunverified"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/deposit/unverified".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
              responseListener.onResponse((FiatDepDataResponse) ApiInvoker.deserialize(localVarResponse,  "", FiatDepDataResponse.class));
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
  * Verified Exchange Fiat Deposits
  * Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return FiatDepDataResponse
  */
  public FiatDepDataResponse v1userexchangebankfiatdepositverified (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositverified",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositverified"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/deposit/verified".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
           return (FiatDepDataResponse) ApiInvoker.deserialize(localVarResponse, "", FiatDepDataResponse.class);
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
   * Verified Exchange Fiat Deposits
   * Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiatdepositverified (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<FiatDepDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositverified",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositverified"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/deposit/verified".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
              responseListener.onResponse((FiatDepDataResponse) ApiInvoker.deserialize(localVarResponse,  "", FiatDepDataResponse.class));
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
  * Cancelled Exchange Fiat Withdrawals
  * Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return FiatWithDataResponse
  */
  public FiatWithDataResponse v1userexchangebankfiatwithdrawcancelled (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawcancelled",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawcancelled"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/withdraw/cancelled".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
           return (FiatWithDataResponse) ApiInvoker.deserialize(localVarResponse, "", FiatWithDataResponse.class);
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
   * Cancelled Exchange Fiat Withdrawals
   * Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiatwithdrawcancelled (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<FiatWithDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawcancelled",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawcancelled"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/withdraw/cancelled".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
              responseListener.onResponse((FiatWithDataResponse) ApiInvoker.deserialize(localVarResponse,  "", FiatWithDataResponse.class));
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
  * Completed Exchange Fiat Withdrawals
  * Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return FiatWithDataResponse
  */
  public FiatWithDataResponse v1userexchangebankfiatwithdrawcompleted (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawcompleted",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawcompleted"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/withdraw/completed".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
           return (FiatWithDataResponse) ApiInvoker.deserialize(localVarResponse, "", FiatWithDataResponse.class);
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
   * Completed Exchange Fiat Withdrawals
   * Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiatwithdrawcompleted (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<FiatWithDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawcompleted",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawcompleted"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/withdraw/completed".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
              responseListener.onResponse((FiatWithDataResponse) ApiInvoker.deserialize(localVarResponse,  "", FiatWithDataResponse.class));
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
  * Unverified Exchange Fiat Withdrawals
  * Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return FiatWithDataResponse
  */
  public FiatWithDataResponse v1userexchangebankfiatwithdrawunverified (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawunverified",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawunverified"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/withdraw/unverified".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
           return (FiatWithDataResponse) ApiInvoker.deserialize(localVarResponse, "", FiatWithDataResponse.class);
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
   * Unverified Exchange Fiat Withdrawals
   * Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiatwithdrawunverified (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<FiatWithDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawunverified",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawunverified"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/withdraw/unverified".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
              responseListener.onResponse((FiatWithDataResponse) ApiInvoker.deserialize(localVarResponse,  "", FiatWithDataResponse.class));
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
  * Verified Exchange Fiat Withdrawals
  * Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return FiatWithDataResponse
  */
  public FiatWithDataResponse v1userexchangebankfiatwithdrawverified (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawverified",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawverified"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/fiat/withdraw/verified".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
           return (FiatWithDataResponse) ApiInvoker.deserialize(localVarResponse, "", FiatWithDataResponse.class);
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
   * Verified Exchange Fiat Withdrawals
   * Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankfiatwithdrawverified (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<FiatWithDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawverified",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawverified"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/fiat/withdraw/verified".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

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
              responseListener.onResponse((FiatWithDataResponse) ApiInvoker.deserialize(localVarResponse,  "", FiatWithDataResponse.class));
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
