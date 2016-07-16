# \BlockchainToolsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1BitcoinSearchAddress**](BlockchainToolsApi.md#V1BitcoinSearchAddress) | **Get** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
[**V1BitcoinSearchTxid**](BlockchainToolsApi.md#V1BitcoinSearchTxid) | **Get** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations


# **V1BitcoinSearchAddress**
> ValidAddressSearchDataResponse V1BitcoinSearchAddress($any, $accept)

Search Bitcoin Blockchain

Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **any** | **string**|  | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**ValidAddressSearchDataResponse**](ValidAddressSearchDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1BitcoinSearchTxid**
> ConfirmDataResponse V1BitcoinSearchTxid($txid, $accept)

Get Confirmations

Searches for a Number of Confirmations on a transaction ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **string**|  | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**ConfirmDataResponse**](ConfirmDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

