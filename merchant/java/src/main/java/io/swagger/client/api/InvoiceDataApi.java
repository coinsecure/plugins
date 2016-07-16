package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.FailInvoice;
import io.swagger.client.model.InvoiceIDFull;
import io.swagger.client.model.SuccessInvoices;
import io.swagger.client.model.SuccessInvoice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-26T17:34:18.778Z")
public class InvoiceDataApi {
  private ApiClient apiClient;

  public InvoiceDataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InvoiceDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * GET ALL CANCELLED INVOICES
   * Gets All Cancelled Invoice Details.
   * @param apikey Enter User Key (required)
   * @param body Enter details to query Invoices (required)
   * @return SuccessInvoices
   * @throws ApiException if fails to make API call
   */
  public SuccessInvoices getCancInvoices(String apikey, InvoiceIDFull body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
      throw new ApiException(400, "Missing the required parameter 'apikey' when calling getCancInvoices");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getCancInvoices");
    }
    
    // create path and map variables
    String localVarPath = "/invoice/getCancInvoices".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apikey != null)
      localVarHeaderParams.put("apikey", apiClient.parameterToString(apikey));

    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessInvoices> localVarReturnType = new GenericType<SuccessInvoices>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * GET ALL COMPLETED INVOICES
   * Gets All Completed Invoice Details.
   * @param apikey Enter User Key (required)
   * @param body Enter details to query Invoices (required)
   * @return SuccessInvoices
   * @throws ApiException if fails to make API call
   */
  public SuccessInvoices getCompleteInvoices(String apikey, InvoiceIDFull body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
      throw new ApiException(400, "Missing the required parameter 'apikey' when calling getCompleteInvoices");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getCompleteInvoices");
    }
    
    // create path and map variables
    String localVarPath = "/invoice/getCompleteInvoices".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apikey != null)
      localVarHeaderParams.put("apikey", apiClient.parameterToString(apikey));

    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessInvoices> localVarReturnType = new GenericType<SuccessInvoices>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * GET ALL CONFIRMED INVOICES
   * Gets All Confirmed Invoice Details.
   * @param apikey Enter User Key (required)
   * @param body Enter details to query Invoices (required)
   * @return SuccessInvoices
   * @throws ApiException if fails to make API call
   */
  public SuccessInvoices getConfInvoices(String apikey, InvoiceIDFull body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
      throw new ApiException(400, "Missing the required parameter 'apikey' when calling getConfInvoices");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getConfInvoices");
    }
    
    // create path and map variables
    String localVarPath = "/invoice/getConfInvoices".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apikey != null)
      localVarHeaderParams.put("apikey", apiClient.parameterToString(apikey));

    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessInvoices> localVarReturnType = new GenericType<SuccessInvoices>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * GET INVOICE FROM ID
   * Gets Details of an Invoice ID.
   * @param invoiceID  (required)
   * @param apikey Enter User Key (required)
   * @return SuccessInvoice
   * @throws ApiException if fails to make API call
   */
  public SuccessInvoice getInvoiceFromID(String invoiceID, String apikey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceID' is set
    if (invoiceID == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceID' when calling getInvoiceFromID");
    }
    
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
      throw new ApiException(400, "Missing the required parameter 'apikey' when calling getInvoiceFromID");
    }
    
    // create path and map variables
    String localVarPath = "/invoice/getInvoiceFromID/{invoiceID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceID" + "\\}", apiClient.escapeString(invoiceID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apikey != null)
      localVarHeaderParams.put("apikey", apiClient.parameterToString(apikey));

    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessInvoice> localVarReturnType = new GenericType<SuccessInvoice>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * GET ALL PAID INVOICES
   * Gets All Paid Invoice Details.
   * @param apikey Enter User Key (required)
   * @param body Enter details to query Invoices (required)
   * @return SuccessInvoices
   * @throws ApiException if fails to make API call
   */
  public SuccessInvoices getPaidInvoices(String apikey, InvoiceIDFull body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
      throw new ApiException(400, "Missing the required parameter 'apikey' when calling getPaidInvoices");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getPaidInvoices");
    }
    
    // create path and map variables
    String localVarPath = "/invoice/getPaidInvoices".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apikey != null)
      localVarHeaderParams.put("apikey", apiClient.parameterToString(apikey));

    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessInvoices> localVarReturnType = new GenericType<SuccessInvoices>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * GET ALL REFUND INVOICES
   * Gets All Refund Invoice Details.
   * @param apikey Enter User Key (required)
   * @param body Enter details to query Invoices (required)
   * @return SuccessInvoices
   * @throws ApiException if fails to make API call
   */
  public SuccessInvoices getRefundInvoices(String apikey, InvoiceIDFull body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
      throw new ApiException(400, "Missing the required parameter 'apikey' when calling getRefundInvoices");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getRefundInvoices");
    }
    
    // create path and map variables
    String localVarPath = "/invoice/getRefundInvoices".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apikey != null)
      localVarHeaderParams.put("apikey", apiClient.parameterToString(apikey));

    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessInvoices> localVarReturnType = new GenericType<SuccessInvoices>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * GET ALL UNPROCESSED INVOICES
   * Gets All Unprocessed Invoice Details.
   * @param apikey Enter User Key (required)
   * @param body Enter details to query Invoices (required)
   * @return SuccessInvoices
   * @throws ApiException if fails to make API call
   */
  public SuccessInvoices getUnprocessedInvoices(String apikey, InvoiceIDFull body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
      throw new ApiException(400, "Missing the required parameter 'apikey' when calling getUnprocessedInvoices");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getUnprocessedInvoices");
    }
    
    // create path and map variables
    String localVarPath = "/invoice/getUnprocessedInvoices".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (apikey != null)
      localVarHeaderParams.put("apikey", apiClient.parameterToString(apikey));

    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<SuccessInvoices> localVarReturnType = new GenericType<SuccessInvoices>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
