# SwaggerClient::BlockchainToolsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1bitcoinsearch_address**](BlockchainToolsApi.md#v1bitcoinsearch_address) | **GET** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
[**v1bitcoinsearch_txid**](BlockchainToolsApi.md#v1bitcoinsearch_txid) | **GET** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations


# **v1bitcoinsearch_address**
> ValidAddressSearchDataResponse v1bitcoinsearch_address(any, opts)

Search Bitcoin Blockchain

Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BlockchainToolsApi.new

any = "any_example" # String | 

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Search Bitcoin Blockchain
  result = api_instance.v1bitcoinsearch_address(any, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BlockchainToolsApi->v1bitcoinsearch_address: #{e}"
end
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



# **v1bitcoinsearch_txid**
> ConfirmDataResponse v1bitcoinsearch_txid(txid, opts)

Get Confirmations

Searches for a Number of Confirmations on a transaction ID.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BlockchainToolsApi.new

txid = "txid_example" # String | 

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Get Confirmations
  result = api_instance.v1bitcoinsearch_txid(txid, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BlockchainToolsApi->v1bitcoinsearch_txid: #{e}"
end
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



