# swagger_client.BlockchainToolsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1bitcoinsearch_address**](BlockchainToolsApi.md#v1bitcoinsearch_address) | **GET** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
[**v1bitcoinsearch_txid**](BlockchainToolsApi.md#v1bitcoinsearch_txid) | **GET** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations


# **v1bitcoinsearch_address**
> ValidAddressSearchDataResponse v1bitcoinsearch_address(any, accept=accept)

Search Bitcoin Blockchain

Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BlockchainToolsApi()
any = 'any_example' # str | 
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Search Bitcoin Blockchain
    api_response = api_instance.v1bitcoinsearch_address(any, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BlockchainToolsApi->v1bitcoinsearch_address: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **any** | **str**|  | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**ValidAddressSearchDataResponse**](ValidAddressSearchDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1bitcoinsearch_txid**
> ConfirmDataResponse v1bitcoinsearch_txid(txid, accept=accept)

Get Confirmations

Searches for a Number of Confirmations on a transaction ID.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BlockchainToolsApi()
txid = 'txid_example' # str | 
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Get Confirmations
    api_response = api_instance.v1bitcoinsearch_txid(txid, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BlockchainToolsApi->v1bitcoinsearch_txid: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **str**|  | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**ConfirmDataResponse**](ConfirmDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

