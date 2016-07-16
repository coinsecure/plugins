# CoinMerchantApiDocumentation.InvoiceActionsApi

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
```javascript
var CoinMerchantApiDocumentation = require('coin-merchant-api-documentation');

var apiInstance = new CoinMerchantApiDocumentation.InvoiceActionsApi();

var apikey = "apikey_example"; // String | Enter User Key

var body = new CoinMerchantApiDocumentation.NewInvoice(); // NewInvoice | Enter details to create an Invoice


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createNewInvoice(apikey, body, callback);
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
```javascript
var CoinMerchantApiDocumentation = require('coin-merchant-api-documentation');

var apiInstance = new CoinMerchantApiDocumentation.InvoiceActionsApi();

var invoiceID = "invoiceID_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.loadInvoice(invoiceID, callback);
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

