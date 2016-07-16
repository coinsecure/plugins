# SWGExchangeBankCoinDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankcoinaddresses**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoinaddresses) | **GET** /v1/user/exchange/bank/coin/addresses | Exchange Coin Addresses
[**v1userexchangebankcoinbalanceavailable**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoinbalanceavailable) | **GET** /v1/user/exchange/bank/coin/balance/total | Available Exchange Coin Balance
[**v1userexchangebankcoinbalancepending**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancepending) | **GET** /v1/user/exchange/bank/coin/balance/pending | In Trade Coin Balance
[**v1userexchangebankcoinbalancetotal**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancetotal) | **GET** /v1/user/exchange/bank/coin/balance/available | Total Exchange Coin Balance
[**v1userexchangebankcoindepositcancelled**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoindepositcancelled) | **GET** /v1/user/exchange/bank/coin/deposit/cancelled | Cancelled Exchange Coin Deposits
[**v1userexchangebankcoindepositunverified**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoindepositunverified) | **GET** /v1/user/exchange/bank/coin/deposit/unverified | Unverified Exchange Coin Deposits
[**v1userexchangebankcoindepositverified**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoindepositverified) | **GET** /v1/user/exchange/bank/coin/deposit/verified | Verified Exchange Coin Deposits
[**v1userexchangebankcoinwithdrawcancelled**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcancelled) | **GET** /v1/user/exchange/bank/coin/withdraw/cancelled | Cancelled Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawcompleted**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcompleted) | **GET** /v1/user/exchange/bank/coin/withdraw/completed | Completed Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawunverified**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawunverified) | **GET** /v1/user/exchange/bank/coin/withdraw/unverified | Unverified Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawverified**](SWGExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawverified) | **GET** /v1/user/exchange/bank/coin/withdraw/verified | Verified Exchange Coin Withdrawals


# **v1userexchangebankcoinaddresses**
```objc
-(NSNumber*) v1userexchangebankcoinaddressesWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGTradeAddressDataResponse* output, NSError* error)) handler;
```

Exchange Coin Addresses

Gets a List of Users Exchange Bitcoin Deposit Addresses.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// Exchange Coin Addresses
[apiInstance v1userexchangebankcoinaddressesWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGTradeAddressDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoinaddresses: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGTradeAddressDataResponse***](SWGTradeAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinbalanceavailable**
```objc
-(NSNumber*) v1userexchangebankcoinbalanceavailableWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGVolDataResponse* output, NSError* error)) handler;
```

Available Exchange Coin Balance

Returns balance which is in Available for Trades. The response is in satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// Available Exchange Coin Balance
[apiInstance v1userexchangebankcoinbalanceavailableWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGVolDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoinbalanceavailable: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGVolDataResponse***](SWGVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinbalancepending**
```objc
-(NSNumber*) v1userexchangebankcoinbalancependingWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGVolDataResponse* output, NSError* error)) handler;
```

In Trade Coin Balance

Returns in-trade or pending coin balance in satoshi.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// In Trade Coin Balance
[apiInstance v1userexchangebankcoinbalancependingWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGVolDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoinbalancepending: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGVolDataResponse***](SWGVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinbalancetotal**
```objc
-(NSNumber*) v1userexchangebankcoinbalancetotalWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGVolDataResponse* output, NSError* error)) handler;
```

Total Exchange Coin Balance

Returns users total coin balance in satoshis. Pending + Available

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// Total Exchange Coin Balance
[apiInstance v1userexchangebankcoinbalancetotalWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGVolDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoinbalancetotal: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGVolDataResponse***](SWGVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoindepositcancelled**
```objc
-(NSNumber*) v1userexchangebankcoindepositcancelledWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGCoinDepDataResponse* output, NSError* error)) handler;
```

Cancelled Exchange Coin Deposits

Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// Cancelled Exchange Coin Deposits
[apiInstance v1userexchangebankcoindepositcancelledWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGCoinDepDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoindepositcancelled: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **from** | **NSNumber***| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **NSNumber***| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **NSNumber***| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **NSNumber***| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGCoinDepDataResponse***](SWGCoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoindepositunverified**
```objc
-(NSNumber*) v1userexchangebankcoindepositunverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGCoinDepDataResponse* output, NSError* error)) handler;
```

Unverified Exchange Coin Deposits

Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// Unverified Exchange Coin Deposits
[apiInstance v1userexchangebankcoindepositunverifiedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGCoinDepDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoindepositunverified: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **from** | **NSNumber***| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **NSNumber***| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **NSNumber***| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **NSNumber***| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGCoinDepDataResponse***](SWGCoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoindepositverified**
```objc
-(NSNumber*) v1userexchangebankcoindepositverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGCoinDepDataResponse* output, NSError* error)) handler;
```

Verified Exchange Coin Deposits

Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// Verified Exchange Coin Deposits
[apiInstance v1userexchangebankcoindepositverifiedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGCoinDepDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoindepositverified: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **from** | **NSNumber***| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **NSNumber***| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **NSNumber***| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **NSNumber***| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGCoinDepDataResponse***](SWGCoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinwithdrawcancelled**
```objc
-(NSNumber*) v1userexchangebankcoinwithdrawcancelledWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGTradeCoinWithdrawDataResponse* output, NSError* error)) handler;
```

Cancelled Exchange Coin Withdrawals

Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// Cancelled Exchange Coin Withdrawals
[apiInstance v1userexchangebankcoinwithdrawcancelledWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGTradeCoinWithdrawDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawcancelled: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **from** | **NSNumber***| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **NSNumber***| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **NSNumber***| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **NSNumber***| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGTradeCoinWithdrawDataResponse***](SWGTradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinwithdrawcompleted**
```objc
-(NSNumber*) v1userexchangebankcoinwithdrawcompletedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGTradeCoinWithdrawDataResponse* output, NSError* error)) handler;
```

Completed Exchange Coin Withdrawals

Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// Completed Exchange Coin Withdrawals
[apiInstance v1userexchangebankcoinwithdrawcompletedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGTradeCoinWithdrawDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawcompleted: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **from** | **NSNumber***| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **NSNumber***| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **NSNumber***| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **NSNumber***| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGTradeCoinWithdrawDataResponse***](SWGTradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinwithdrawunverified**
```objc
-(NSNumber*) v1userexchangebankcoinwithdrawunverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGTradeCoinWithdrawDataResponse* output, NSError* error)) handler;
```

Unverified Exchange Coin Withdrawals

Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// Unverified Exchange Coin Withdrawals
[apiInstance v1userexchangebankcoinwithdrawunverifiedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGTradeCoinWithdrawDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawunverified: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **from** | **NSNumber***| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **NSNumber***| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **NSNumber***| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **NSNumber***| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGTradeCoinWithdrawDataResponse***](SWGTradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinwithdrawverified**
```objc
-(NSNumber*) v1userexchangebankcoinwithdrawverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGTradeCoinWithdrawDataResponse* output, NSError* error)) handler;
```

Verified Exchange Coin Withdrawals

Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankCoinDataApi*apiInstance = [[SWGExchangeBankCoinDataApi alloc] init];

// Verified Exchange Coin Withdrawals
[apiInstance v1userexchangebankcoinwithdrawverifiedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGTradeCoinWithdrawDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawverified: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **from** | **NSNumber***| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **NSNumber***| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **NSNumber***| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **NSNumber***| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGTradeCoinWithdrawDataResponse***](SWGTradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

