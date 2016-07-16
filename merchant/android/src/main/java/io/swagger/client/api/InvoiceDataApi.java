package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.FailInvoice;
import io.swagger.client.model.InvoiceIDFull;
import io.swagger.client.model.SuccessInvoices;
import io.swagger.client.model.SuccessInvoice;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class InvoiceDataApi {
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
  * GET ALL CANCELLED INVOICES
  * Gets All Cancelled Invoice Details.
   * @param apikey Enter User Key
   * @param body Enter details to query Invoices
   * @return SuccessInvoices
  */
  public SuccessInvoices getCancInvoices (String apikey, InvoiceIDFull body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'apikey' is set
      if (apikey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getCancInvoices",
      new ApiException(400, "Missing the required parameter 'apikey' when calling getCancInvoices"));
      }
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getCancInvoices",
      new ApiException(400, "Missing the required parameter 'body' when calling getCancInvoices"));
      }
  

  // create path and map variables
  String path = "/invoice/getCancInvoices".replaceAll("\\{format\\}","json");

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
           return (SuccessInvoices) ApiInvoker.deserialize(localVarResponse, "", SuccessInvoices.class);
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
   * GET ALL CANCELLED INVOICES
   * Gets All Cancelled Invoice Details.
   * @param apikey Enter User Key   * @param body Enter details to query Invoices
  */
  public void getCancInvoices (String apikey, InvoiceIDFull body, final Response.Listener<SuccessInvoices> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getCancInvoices",
         new ApiException(400, "Missing the required parameter 'apikey' when calling getCancInvoices"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getCancInvoices",
         new ApiException(400, "Missing the required parameter 'body' when calling getCancInvoices"));
    }
    

    // create path and map variables
    String path = "/invoice/getCancInvoices".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((SuccessInvoices) ApiInvoker.deserialize(localVarResponse,  "", SuccessInvoices.class));
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
  * GET ALL COMPLETED INVOICES
  * Gets All Completed Invoice Details.
   * @param apikey Enter User Key
   * @param body Enter details to query Invoices
   * @return SuccessInvoices
  */
  public SuccessInvoices getCompleteInvoices (String apikey, InvoiceIDFull body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'apikey' is set
      if (apikey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getCompleteInvoices",
      new ApiException(400, "Missing the required parameter 'apikey' when calling getCompleteInvoices"));
      }
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getCompleteInvoices",
      new ApiException(400, "Missing the required parameter 'body' when calling getCompleteInvoices"));
      }
  

  // create path and map variables
  String path = "/invoice/getCompleteInvoices".replaceAll("\\{format\\}","json");

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
           return (SuccessInvoices) ApiInvoker.deserialize(localVarResponse, "", SuccessInvoices.class);
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
   * GET ALL COMPLETED INVOICES
   * Gets All Completed Invoice Details.
   * @param apikey Enter User Key   * @param body Enter details to query Invoices
  */
  public void getCompleteInvoices (String apikey, InvoiceIDFull body, final Response.Listener<SuccessInvoices> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getCompleteInvoices",
         new ApiException(400, "Missing the required parameter 'apikey' when calling getCompleteInvoices"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getCompleteInvoices",
         new ApiException(400, "Missing the required parameter 'body' when calling getCompleteInvoices"));
    }
    

    // create path and map variables
    String path = "/invoice/getCompleteInvoices".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((SuccessInvoices) ApiInvoker.deserialize(localVarResponse,  "", SuccessInvoices.class));
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
  * GET ALL CONFIRMED INVOICES
  * Gets All Confirmed Invoice Details.
   * @param apikey Enter User Key
   * @param body Enter details to query Invoices
   * @return SuccessInvoices
  */
  public SuccessInvoices getConfInvoices (String apikey, InvoiceIDFull body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'apikey' is set
      if (apikey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getConfInvoices",
      new ApiException(400, "Missing the required parameter 'apikey' when calling getConfInvoices"));
      }
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getConfInvoices",
      new ApiException(400, "Missing the required parameter 'body' when calling getConfInvoices"));
      }
  

  // create path and map variables
  String path = "/invoice/getConfInvoices".replaceAll("\\{format\\}","json");

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
           return (SuccessInvoices) ApiInvoker.deserialize(localVarResponse, "", SuccessInvoices.class);
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
   * GET ALL CONFIRMED INVOICES
   * Gets All Confirmed Invoice Details.
   * @param apikey Enter User Key   * @param body Enter details to query Invoices
  */
  public void getConfInvoices (String apikey, InvoiceIDFull body, final Response.Listener<SuccessInvoices> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getConfInvoices",
         new ApiException(400, "Missing the required parameter 'apikey' when calling getConfInvoices"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getConfInvoices",
         new ApiException(400, "Missing the required parameter 'body' when calling getConfInvoices"));
    }
    

    // create path and map variables
    String path = "/invoice/getConfInvoices".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((SuccessInvoices) ApiInvoker.deserialize(localVarResponse,  "", SuccessInvoices.class));
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
  * GET INVOICE FROM ID
  * Gets Details of an Invoice ID.
   * @param invoiceID 
   * @param apikey Enter User Key
   * @return SuccessInvoice
  */
  public SuccessInvoice getInvoiceFromID (String invoiceID, String apikey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'invoiceID' is set
      if (invoiceID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'invoiceID' when calling getInvoiceFromID",
      new ApiException(400, "Missing the required parameter 'invoiceID' when calling getInvoiceFromID"));
      }
  
      // verify the required parameter 'apikey' is set
      if (apikey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getInvoiceFromID",
      new ApiException(400, "Missing the required parameter 'apikey' when calling getInvoiceFromID"));
      }
  

  // create path and map variables
  String path = "/invoice/getInvoiceFromID/{invoiceID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "invoiceID" + "\\}", apiInvoker.escapeString(invoiceID.toString()));

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
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
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
   * GET INVOICE FROM ID
   * Gets Details of an Invoice ID.
   * @param invoiceID    * @param apikey Enter User Key
  */
  public void getInvoiceFromID (String invoiceID, String apikey, final Response.Listener<SuccessInvoice> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'invoiceID' is set
    if (invoiceID == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'invoiceID' when calling getInvoiceFromID",
         new ApiException(400, "Missing the required parameter 'invoiceID' when calling getInvoiceFromID"));
    }
    
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getInvoiceFromID",
         new ApiException(400, "Missing the required parameter 'apikey' when calling getInvoiceFromID"));
    }
    

    // create path and map variables
    String path = "/invoice/getInvoiceFromID/{invoiceID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "invoiceID" + "\\}", apiInvoker.escapeString(invoiceID.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
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
  * GET ALL PAID INVOICES
  * Gets All Paid Invoice Details.
   * @param apikey Enter User Key
   * @param body Enter details to query Invoices
   * @return SuccessInvoices
  */
  public SuccessInvoices getPaidInvoices (String apikey, InvoiceIDFull body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'apikey' is set
      if (apikey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getPaidInvoices",
      new ApiException(400, "Missing the required parameter 'apikey' when calling getPaidInvoices"));
      }
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getPaidInvoices",
      new ApiException(400, "Missing the required parameter 'body' when calling getPaidInvoices"));
      }
  

  // create path and map variables
  String path = "/invoice/getPaidInvoices".replaceAll("\\{format\\}","json");

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
           return (SuccessInvoices) ApiInvoker.deserialize(localVarResponse, "", SuccessInvoices.class);
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
   * GET ALL PAID INVOICES
   * Gets All Paid Invoice Details.
   * @param apikey Enter User Key   * @param body Enter details to query Invoices
  */
  public void getPaidInvoices (String apikey, InvoiceIDFull body, final Response.Listener<SuccessInvoices> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getPaidInvoices",
         new ApiException(400, "Missing the required parameter 'apikey' when calling getPaidInvoices"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getPaidInvoices",
         new ApiException(400, "Missing the required parameter 'body' when calling getPaidInvoices"));
    }
    

    // create path and map variables
    String path = "/invoice/getPaidInvoices".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((SuccessInvoices) ApiInvoker.deserialize(localVarResponse,  "", SuccessInvoices.class));
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
  * GET ALL REFUND INVOICES
  * Gets All Refund Invoice Details.
   * @param apikey Enter User Key
   * @param body Enter details to query Invoices
   * @return SuccessInvoices
  */
  public SuccessInvoices getRefundInvoices (String apikey, InvoiceIDFull body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'apikey' is set
      if (apikey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getRefundInvoices",
      new ApiException(400, "Missing the required parameter 'apikey' when calling getRefundInvoices"));
      }
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getRefundInvoices",
      new ApiException(400, "Missing the required parameter 'body' when calling getRefundInvoices"));
      }
  

  // create path and map variables
  String path = "/invoice/getRefundInvoices".replaceAll("\\{format\\}","json");

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
           return (SuccessInvoices) ApiInvoker.deserialize(localVarResponse, "", SuccessInvoices.class);
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
   * GET ALL REFUND INVOICES
   * Gets All Refund Invoice Details.
   * @param apikey Enter User Key   * @param body Enter details to query Invoices
  */
  public void getRefundInvoices (String apikey, InvoiceIDFull body, final Response.Listener<SuccessInvoices> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getRefundInvoices",
         new ApiException(400, "Missing the required parameter 'apikey' when calling getRefundInvoices"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getRefundInvoices",
         new ApiException(400, "Missing the required parameter 'body' when calling getRefundInvoices"));
    }
    

    // create path and map variables
    String path = "/invoice/getRefundInvoices".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((SuccessInvoices) ApiInvoker.deserialize(localVarResponse,  "", SuccessInvoices.class));
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
  * GET ALL UNPROCESSED INVOICES
  * Gets All Unprocessed Invoice Details.
   * @param apikey Enter User Key
   * @param body Enter details to query Invoices
   * @return SuccessInvoices
  */
  public SuccessInvoices getUnprocessedInvoices (String apikey, InvoiceIDFull body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'apikey' is set
      if (apikey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getUnprocessedInvoices",
      new ApiException(400, "Missing the required parameter 'apikey' when calling getUnprocessedInvoices"));
      }
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getUnprocessedInvoices",
      new ApiException(400, "Missing the required parameter 'body' when calling getUnprocessedInvoices"));
      }
  

  // create path and map variables
  String path = "/invoice/getUnprocessedInvoices".replaceAll("\\{format\\}","json");

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
           return (SuccessInvoices) ApiInvoker.deserialize(localVarResponse, "", SuccessInvoices.class);
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
   * GET ALL UNPROCESSED INVOICES
   * Gets All Unprocessed Invoice Details.
   * @param apikey Enter User Key   * @param body Enter details to query Invoices
  */
  public void getUnprocessedInvoices (String apikey, InvoiceIDFull body, final Response.Listener<SuccessInvoices> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'apikey' when calling getUnprocessedInvoices",
         new ApiException(400, "Missing the required parameter 'apikey' when calling getUnprocessedInvoices"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling getUnprocessedInvoices",
         new ApiException(400, "Missing the required parameter 'body' when calling getUnprocessedInvoices"));
    }
    

    // create path and map variables
    String path = "/invoice/getUnprocessedInvoices".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((SuccessInvoices) ApiInvoker.deserialize(localVarResponse,  "", SuccessInvoices.class));
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
