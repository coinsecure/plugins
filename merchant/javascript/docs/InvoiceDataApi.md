# CoinMerchantApiDocumentation.InvoiceDataApi

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
```javascript
var CoinMerchantApiDocumentation = require('coin-merchant-api-documentation');

var apiInstance = new CoinMerchantApiDocumentation.InvoiceDataApi();

var apikey = "apikey_example"; // String | Enter User Key

var body = new CoinMerchantApiDocumentation.InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCancInvoices(apikey, body, callback);
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
```javascript
var CoinMerchantApiDocumentation = require('coin-merchant-api-documentation');

var apiInstance = new CoinMerchantApiDocumentation.InvoiceDataApi();

var apikey = "apikey_example"; // String | Enter User Key

var body = new CoinMerchantApiDocumentation.InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompleteInvoices(apikey, body, callback);
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
```javascript
var CoinMerchantApiDocumentation = require('coin-merchant-api-documentation');

var apiInstance = new CoinMerchantApiDocumentation.InvoiceDataApi();

var apikey = "apikey_example"; // String | Enter User Key

var body = new CoinMerchantApiDocumentation.InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getConfInvoices(apikey, body, callback);
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
```javascript
var CoinMerchantApiDocumentation = require('coin-merchant-api-documentation');

var apiInstance = new CoinMerchantApiDocumentation.InvoiceDataApi();

var invoiceID = "invoiceID_example"; // String | 

var apikey = "apikey_example"; // String | Enter User Key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getInvoiceFromID(invoiceID, apikey, callback);
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
```javascript
var CoinMerchantApiDocumentation = require('coin-merchant-api-documentation');

var apiInstance = new CoinMerchantApiDocumentation.InvoiceDataApi();

var apikey = "apikey_example"; // String | Enter User Key

var body = new CoinMerchantApiDocumentation.InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPaidInvoices(apikey, body, callback);
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
```javascript
var CoinMerchantApiDocumentation = require('coin-merchant-api-documentation');

var apiInstance = new CoinMerchantApiDocumentation.InvoiceDataApi();

var apikey = "apikey_example"; // String | Enter User Key

var body = new CoinMerchantApiDocumentation.InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getRefundInvoices(apikey, body, callback);
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
```javascript
var CoinMerchantApiDocumentation = require('coin-merchant-api-documentation');

var apiInstance = new CoinMerchantApiDocumentation.InvoiceDataApi();

var apikey = "apikey_example"; // String | Enter User Key

var body = new CoinMerchantApiDocumentation.InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getUnprocessedInvoices(apikey, body, callback);
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

