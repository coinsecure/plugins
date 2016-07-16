# BlockchainToolsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1bitcoinsearchAddress**](BlockchainToolsApi.md#v1bitcoinsearchAddress) | **GET** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
[**v1bitcoinsearchTxid**](BlockchainToolsApi.md#v1bitcoinsearchTxid) | **GET** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations


<a name="v1bitcoinsearchAddress"></a>
# **v1bitcoinsearchAddress**
> ValidAddressSearchDataResponse v1bitcoinsearchAddress(any, accept)

Search Bitcoin Blockchain

Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockchainToolsApi;


BlockchainToolsApi apiInstance = new BlockchainToolsApi();
String any = "any_example"; // String | 
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    ValidAddressSearchDataResponse result = apiInstance.v1bitcoinsearchAddress(any, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainToolsApi#v1bitcoinsearchAddress");
    e.printStackTrace();
}
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
> ConfirmDataResponse v1bitcoinsearchTxid(txid, accept)

Get Confirmations

Searches for a Number of Confirmations on a transaction ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockchainToolsApi;


BlockchainToolsApi apiInstance = new BlockchainToolsApi();
String txid = "txid_example"; // String | 
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    ConfirmDataResponse result = apiInstance.v1bitcoinsearchTxid(txid, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockchainToolsApi#v1bitcoinsearchTxid");
    e.printStackTrace();
}
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

