package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.SuccessInvoice;
import io.swagger.client.model.FailInvoice;
import io.swagger.client.model.NewInvoice;
import io.swagger.client.model.ActionAnyContent;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class InvoiceActionsApi {
  String basePath = "https://pay.coinsecure.in/";
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
  * NEW INVOICE
  * Allows user to create a new Invoice.
   * @param apikey Enter User Key
   * @param body Enter details to create an Invoice
   * @return SuccessInvoice
  */
  public SuccessInvoice createNewInvoice (String apikey, NewInvoice body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'apikey' is set
      if (apikey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling createNewInvoice",
      new ApiException(400, "Missing the required parameter 'apikey' when calling createNewInvoice"));
      }
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling createNewInvoice",
      new ApiException(400, "Missing the required parameter 'body' when calling createNewInvoice"));
      }
  

  // create path and map variables
  String path = "/invoice/createNewInvoice".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("apikey", ApiInvoker.parameterToString(apikey));

      String[] contentTypes = {
  
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
           return (SuccessInvoice) ApiInvoker.deserialize(localVarResponse, "", SuccessInvoice.class);
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
   * NEW INVOICE
   * Allows user to create a new Invoice.
   * @param apikey Enter User Key   * @param body Enter details to create an Invoice
  */
  public void createNewInvoice (String apikey, NewInvoice body, final Response.Listener<SuccessInvoice> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling createNewInvoice",
         new ApiException(400, "Missing the required parameter 'apikey' when calling createNewInvoice"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling createNewInvoice",
         new ApiException(400, "Missing the required parameter 'body' when calling createNewInvoice"));
    }
    

    // create path and map variables
    String path = "/invoice/createNewInvoice".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("apikey", ApiInvoker.parameterToString(apikey));

    String[] contentTypes = {
      
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
              responseListener.onResponse((SuccessInvoice) ApiInvoker.deserialize(localVarResponse,  "", SuccessInvoice.class));
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
  * 
  * 
   * @param invoiceID 
   * @return ActionAnyContent
  */
  public ActionAnyContent loadInvoice (String invoiceID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'invoiceID' is set
      if (invoiceID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'invoiceID' when calling loadInvoice",
      new ApiException(400, "Missing the required parameter 'invoiceID' when calling loadInvoice"));
      }
  

  // create path and map variables
  String path = "/invoice/{invoiceID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "invoiceID" + "\\}", apiInvoker.escapeString(invoiceID.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  
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
           return (ActionAnyContent) ApiInvoker.deserialize(localVarResponse, "", ActionAnyContent.class);
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
   * 
   * 
   * @param invoiceID 
  */
  public void loadInvoice (String invoiceID, final Response.Listener<ActionAnyContent> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'invoiceID' is set
    if (invoiceID == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'invoiceID' when calling loadInvoice",
         new ApiException(400, "Missing the required parameter 'invoiceID' when calling loadInvoice"));
    }
    

    // create path and map variables
    String path = "/invoice/{invoiceID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "invoiceID" + "\\}", apiInvoker.escapeString(invoiceID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
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
              responseListener.onResponse((ActionAnyContent) ApiInvoker.deserialize(localVarResponse,  "", ActionAnyContent.class));
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
