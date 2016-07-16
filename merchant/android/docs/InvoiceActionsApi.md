# InvoiceActionsApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewInvoice**](InvoiceActionsApi.md#createNewInvoice) | **POST** /invoice/createNewInvoice | NEW INVOICE
[**loadInvoice**](InvoiceActionsApi.md#loadInvoice) | **GET** /invoice/{invoiceID} | 


<a name="createNewInvoice"></a>
# **createNewInvoice**
> SuccessInvoice createNewInvoice(apikey, body)

NEW INVOICE

Allows user to create a new Invoice.

### Example
```java
// Import classes:
//import io.swagger.client.api.InvoiceActionsApi;

InvoiceActionsApi apiInstance = new InvoiceActionsApi();
String apikey = "apikey_example"; // String | Enter User Key
NewInvoice body = new NewInvoice(); // NewInvoice | Enter details to create an Invoice
try {
    SuccessInvoice result = apiInstance.createNewInvoice(apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceActionsApi#createNewInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Enter User Key |
 **body** | [**NewInvoice**](NewInvoice.md)| Enter details to create an Invoice |

### Return type

[**SuccessInvoice**](SuccessInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="loadInvoice"></a>
# **loadInvoice**
> ActionAnyContent loadInvoice(invoiceID)



### Example
```java
// Import classes:
//import io.swagger.client.api.InvoiceActionsApi;

InvoiceActionsApi apiInstance = new InvoiceActionsApi();
String invoiceID = "invoiceID_example"; // String | 
try {
    ActionAnyContent result = apiInstance.loadInvoice(invoiceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceActionsApi#loadInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceID** | **String**|  |

### Return type

[**ActionAnyContent**](ActionAnyContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

