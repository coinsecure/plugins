package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.SuccessInvoice;
import io.swagger.client.model.FailInvoice;
import io.swagger.client.model.NewInvoice;
import io.swagger.client.model.ActionAnyContent;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-26T17:34:18.778Z")
public class InvoiceActionsApi {
  private ApiClient apiClient;

  public InvoiceActionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InvoiceActionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * NEW INVOICE
   * Allows user to create a new Invoice.
   * @param apikey Enter User Key (required)
   * @param body Enter details to create an Invoice (required)
   * @return SuccessInvoice
   * @throws ApiException if fails to make API call
   */
  public SuccessInvoice createNewInvoice(String apikey, NewInvoice body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'apikey' is set
    if (apikey == null) {
      throw new ApiException(400, "Missing the required parameter 'apikey' when calling createNewInvoice");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createNewInvoice");
    }
    
    // create path and map variables
    String localVarPath = "/invoice/createNewInvoice".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * 
   * @param invoiceID  (required)
   * @return ActionAnyContent
   * @throws ApiException if fails to make API call
   */
  public ActionAnyContent loadInvoice(String invoiceID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'invoiceID' is set
    if (invoiceID == null) {
      throw new ApiException(400, "Missing the required parameter 'invoiceID' when calling loadInvoice");
    }
    
    // create path and map variables
    String localVarPath = "/invoice/{invoiceID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "invoiceID" + "\\}", apiClient.escapeString(invoiceID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ActionAnyContent> localVarReturnType = new GenericType<ActionAnyContent>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
