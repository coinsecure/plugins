# SWGBlockchainToolsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1bitcoinsearchAddress**](SWGBlockchainToolsApi.md#v1bitcoinsearchaddress) | **GET** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
[**v1bitcoinsearchTxid**](SWGBlockchainToolsApi.md#v1bitcoinsearchtxid) | **GET** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations


# **v1bitcoinsearchAddress**
```objc
-(NSNumber*) v1bitcoinsearchAddressWithAny: (NSString*) any
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGValidAddressSearchDataResponse* output, NSError* error)) handler;
```

Search Bitcoin Blockchain

Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.

### Example 
```objc

NSString* any = @"any_example"; // 
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGBlockchainToolsApi*apiInstance = [[SWGBlockchainToolsApi alloc] init];

// Search Bitcoin Blockchain
[apiInstance v1bitcoinsearchAddressWithAny:any
              accept:accept
          completionHandler: ^(SWGValidAddressSearchDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGBlockchainToolsApi->v1bitcoinsearchAddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **any** | **NSString***|  | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGValidAddressSearchDataResponse***](SWGValidAddressSearchDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1bitcoinsearchTxid**
```objc
-(NSNumber*) v1bitcoinsearchTxidWithTxid: (NSString*) txid
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGConfirmDataResponse* output, NSError* error)) handler;
```

Get Confirmations

Searches for a Number of Confirmations on a transaction ID.

### Example 
```objc

NSString* txid = @"txid_example"; // 
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGBlockchainToolsApi*apiInstance = [[SWGBlockchainToolsApi alloc] init];

// Get Confirmations
[apiInstance v1bitcoinsearchTxidWithTxid:txid
              accept:accept
          completionHandler: ^(SWGConfirmDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGBlockchainToolsApi->v1bitcoinsearchTxid: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **NSString***|  | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGConfirmDataResponse***](SWGConfirmDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

