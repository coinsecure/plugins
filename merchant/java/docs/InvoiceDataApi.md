# InvoiceDataApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCancInvoices**](InvoiceDataApi.md#getCancInvoices) | **POST** /invoice/getCancInvoices | GET ALL CANCELLED INVOICES
[**getCompleteInvoices**](InvoiceDataApi.md#getCompleteInvoices) | **POST** /invoice/getCompleteInvoices | GET ALL COMPLETED INVOICES
[**getConfInvoices**](InvoiceDataApi.md#getConfInvoices) | **POST** /invoice/getConfInvoices | GET ALL CONFIRMED INVOICES
[**getInvoiceFromID**](InvoiceDataApi.md#getInvoiceFromID) | **GET** /invoice/getInvoiceFromID/{invoiceID} | GET INVOICE FROM ID
[**getPaidInvoices**](InvoiceDataApi.md#getPaidInvoices) | **POST** /invoice/getPaidInvoices | GET ALL PAID INVOICES
[**getRefundInvoices**](InvoiceDataApi.md#getRefundInvoices) | **POST** /invoice/getRefundInvoices | GET ALL REFUND INVOICES
[**getUnprocessedInvoices**](InvoiceDataApi.md#getUnprocessedInvoices) | **POST** /invoice/getUnprocessedInvoices | GET ALL UNPROCESSED INVOICES


<a name="getCancInvoices"></a>
# **getCancInvoices**
> SuccessInvoices getCancInvoices(apikey, body)

GET ALL CANCELLED INVOICES

Gets All Cancelled Invoice Details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceDataApi;


InvoiceDataApi apiInstance = new InvoiceDataApi();
String apikey = "apikey_example"; // String | Enter User Key
InvoiceIDFull body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices
try {
    SuccessInvoices result = apiInstance.getCancInvoices(apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceDataApi#getCancInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Enter User Key |
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCompleteInvoices"></a>
# **getCompleteInvoices**
> SuccessInvoices getCompleteInvoices(apikey, body)

GET ALL COMPLETED INVOICES

Gets All Completed Invoice Details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceDataApi;


InvoiceDataApi apiInstance = new InvoiceDataApi();
String apikey = "apikey_example"; // String | Enter User Key
InvoiceIDFull body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices
try {
    SuccessInvoices result = apiInstance.getCompleteInvoices(apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceDataApi#getCompleteInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Enter User Key |
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getConfInvoices"></a>
# **getConfInvoices**
> SuccessInvoices getConfInvoices(apikey, body)

GET ALL CONFIRMED INVOICES

Gets All Confirmed Invoice Details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceDataApi;


InvoiceDataApi apiInstance = new InvoiceDataApi();
String apikey = "apikey_example"; // String | Enter User Key
InvoiceIDFull body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices
try {
    SuccessInvoices result = apiInstance.getConfInvoices(apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceDataApi#getConfInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Enter User Key |
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInvoiceFromID"></a>
# **getInvoiceFromID**
> SuccessInvoice getInvoiceFromID(invoiceID, apikey)

GET INVOICE FROM ID

Gets Details of an Invoice ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceDataApi;


InvoiceDataApi apiInstance = new InvoiceDataApi();
String invoiceID = "invoiceID_example"; // String | 
String apikey = "apikey_example"; // String | Enter User Key
try {
    SuccessInvoice result = apiInstance.getInvoiceFromID(invoiceID, apikey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceDataApi#getInvoiceFromID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceID** | **String**|  |
 **apikey** | **String**| Enter User Key |

### Return type

[**SuccessInvoice**](SuccessInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPaidInvoices"></a>
# **getPaidInvoices**
> SuccessInvoices getPaidInvoices(apikey, body)

GET ALL PAID INVOICES

Gets All Paid Invoice Details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceDataApi;


InvoiceDataApi apiInstance = new InvoiceDataApi();
String apikey = "apikey_example"; // String | Enter User Key
InvoiceIDFull body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices
try {
    SuccessInvoices result = apiInstance.getPaidInvoices(apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceDataApi#getPaidInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Enter User Key |
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRefundInvoices"></a>
# **getRefundInvoices**
> SuccessInvoices getRefundInvoices(apikey, body)

GET ALL REFUND INVOICES

Gets All Refund Invoice Details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceDataApi;


InvoiceDataApi apiInstance = new InvoiceDataApi();
String apikey = "apikey_example"; // String | Enter User Key
InvoiceIDFull body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices
try {
    SuccessInvoices result = apiInstance.getRefundInvoices(apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceDataApi#getRefundInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Enter User Key |
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUnprocessedInvoices"></a>
# **getUnprocessedInvoices**
> SuccessInvoices getUnprocessedInvoices(apikey, body)

GET ALL UNPROCESSED INVOICES

Gets All Unprocessed Invoice Details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InvoiceDataApi;


InvoiceDataApi apiInstance = new InvoiceDataApi();
String apikey = "apikey_example"; // String | Enter User Key
InvoiceIDFull body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices
try {
    SuccessInvoices result = apiInstance.getUnprocessedInvoices(apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceDataApi#getUnprocessedInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Enter User Key |
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

