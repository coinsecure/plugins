# IO.Swagger.Api.BlockchainToolsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1bitcoinsearchAddress**](BlockchainToolsApi.md#v1bitcoinsearchaddress) | **GET** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
[**V1bitcoinsearchTxid**](BlockchainToolsApi.md#v1bitcoinsearchtxid) | **GET** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations


# **V1bitcoinsearchAddress**
> ValidAddressSearchDataResponse V1bitcoinsearchAddress (string any, string accept = null)

Search Bitcoin Blockchain

Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1bitcoinsearchAddressExample
    {
        public void main()
        {
            
            var apiInstance = new BlockchainToolsApi();
            var any = any_example;  // string | 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Search Bitcoin Blockchain
                ValidAddressSearchDataResponse result = apiInstance.V1bitcoinsearchAddress(any, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BlockchainToolsApi.V1bitcoinsearchAddress: " + e.Message );
            }
        }
    }
}
```

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
> ConfirmDataResponse V1bitcoinsearchTxid (string txid, string accept = null)

Get Confirmations

Searches for a Number of Confirmations on a transaction ID.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1bitcoinsearchTxidExample
    {
        public void main()
        {
            
            var apiInstance = new BlockchainToolsApi();
            var txid = txid_example;  // string | 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Get Confirmations
                ConfirmDataResponse result = apiInstance.V1bitcoinsearchTxid(txid, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BlockchainToolsApi.V1bitcoinsearchTxid: " + e.Message );
            }
        }
    }
}
```

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

