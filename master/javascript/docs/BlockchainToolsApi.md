# CoinsecureApiDocumentation.BlockchainToolsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1bitcoinsearchAddress**](BlockchainToolsApi.md#v1bitcoinsearchAddress) | **GET** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
[**v1bitcoinsearchTxid**](BlockchainToolsApi.md#v1bitcoinsearchTxid) | **GET** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations


<a name="v1bitcoinsearchAddress"></a>
# **v1bitcoinsearchAddress**
> ValidAddressSearchDataResponse v1bitcoinsearchAddress(any, opts)

Search Bitcoin Blockchain

Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.BlockchainToolsApi();

var any = "any_example"; // String | 

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1bitcoinsearchAddress(any, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **any** | **String**|  | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**ValidAddressSearchDataResponse**](ValidAddressSearchDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1bitcoinsearchTxid"></a>
# **v1bitcoinsearchTxid**
> ConfirmDataResponse v1bitcoinsearchTxid(txid, opts)

Get Confirmations

Searches for a Number of Confirmations on a transaction ID.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.BlockchainToolsApi();

var txid = "txid_example"; // String | 

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1bitcoinsearchTxid(txid, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **String**|  | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**ConfirmDataResponse**](ConfirmDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

