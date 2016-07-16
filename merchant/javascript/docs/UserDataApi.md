# CoinMerchantApiDocumentation.UserDataApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchant**](UserDataApi.md#getMerchant) | **GET** /user/getMerchant | GET MERCHANT


<a name="getMerchant"></a>
# **getMerchant**
> SuccessMerchant getMerchant(apiKey)

GET MERCHANT

Gets a Summary of Merchant Data.

### Example
```javascript
var CoinMerchantApiDocumentation = require('coin-merchant-api-documentation');

var apiInstance = new CoinMerchantApiDocumentation.UserDataApi();

var apiKey = "apiKey_example"; // String | Enter User Key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getMerchant(apiKey, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Enter User Key | 

### Return type

[**SuccessMerchant**](SuccessMerchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

