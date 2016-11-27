# \BlockchainToolsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1bitcoinsearchAddress**](BlockchainToolsApi.md#V1bitcoinsearchAddress) | **Get** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
[**V1bitcoinsearchTxid**](BlockchainToolsApi.md#V1bitcoinsearchTxid) | **Get** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations


# **V1bitcoinsearchAddress**
> ValidAddressSearchDataResponse V1bitcoinsearchAddress($any, $accept)

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

# **V1bitcoinsearchTxid**
> ConfirmDataResponse V1bitcoinsearchTxid($txid, $accept)

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

