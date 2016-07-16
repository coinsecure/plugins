# SWGExchangeBankFiatDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankfiataccounts**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiataccounts) | **GET** /v1/user/exchange/bank/fiat/accounts | Exchange Bitcoin Deposit Addresses
[**v1userexchangebankfiatbalanceavailable**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiatbalanceavailable) | **GET** /v1/user/exchange/bank/fiat/balance/total | Available Exchange Fiat Balance
[**v1userexchangebankfiatbalancepending**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancepending) | **GET** /v1/user/exchange/bank/fiat/balance/pending | In Trade Coin Balance
[**v1userexchangebankfiatbalancetotal**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancetotal) | **GET** /v1/user/exchange/bank/fiat/balance/available | Total Exchange Fiat Balance
[**v1userexchangebankfiatdepositcancelled**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositcancelled) | **GET** /v1/user/exchange/bank/fiat/deposit/cancelled | Cancelled Exchange Fiat Deposits
[**v1userexchangebankfiatdepositunverified**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositunverified) | **GET** /v1/user/exchange/bank/fiat/deposit/unverified | Unverified Exchange Fiat Deposits
[**v1userexchangebankfiatdepositverified**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositverified) | **GET** /v1/user/exchange/bank/fiat/deposit/verified | Verified Exchange Fiat Deposits
[**v1userexchangebankfiatwithdrawcancelled**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcancelled) | **GET** /v1/user/exchange/bank/fiat/withdraw/cancelled | Cancelled Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawcompleted**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcompleted) | **GET** /v1/user/exchange/bank/fiat/withdraw/completed | Completed Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawunverified**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawunverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/unverified | Unverified Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawverified**](SWGExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/verified | Verified Exchange Fiat Withdrawals


# **v1userexchangebankfiataccounts**
```objc
-(NSNumber*) v1userexchangebankfiataccountsWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGFiatBankDataResponse* output, NSError* error)) handler;
```

Exchange Bitcoin Deposit Addresses

Gets a List of Users Exchange Bitcoin Addresses.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// Exchange Bitcoin Deposit Addresses
[apiInstance v1userexchangebankfiataccountsWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGFiatBankDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiataccounts: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGFiatBankDataResponse***](SWGFiatBankDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatbalanceavailable**
```objc
-(NSNumber*) v1userexchangebankfiatbalanceavailableWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGRateDataResponse* output, NSError* error)) handler;
```

Available Exchange Fiat Balance

Returns balance which is in Available for Trades. The response is in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// Available Exchange Fiat Balance
[apiInstance v1userexchangebankfiatbalanceavailableWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGRateDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiatbalanceavailable: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGRateDataResponse***](SWGRateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatbalancepending**
```objc
-(NSNumber*) v1userexchangebankfiatbalancependingWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGRateDataResponse* output, NSError* error)) handler;
```

In Trade Coin Balance

Returns in-trade or pending fiat balance in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// In Trade Coin Balance
[apiInstance v1userexchangebankfiatbalancependingWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGRateDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiatbalancepending: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGRateDataResponse***](SWGRateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatbalancetotal**
```objc
-(NSNumber*) v1userexchangebankfiatbalancetotalWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGRateDataResponse* output, NSError* error)) handler;
```

Total Exchange Fiat Balance

Returns users total fiat balance in paisa. Pending + Available

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// Total Exchange Fiat Balance
[apiInstance v1userexchangebankfiatbalancetotalWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGRateDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiatbalancetotal: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGRateDataResponse***](SWGRateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatdepositcancelled**
```objc
-(NSNumber*) v1userexchangebankfiatdepositcancelledWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGFiatDepDataResponse* output, NSError* error)) handler;
```

Cancelled Exchange Fiat Deposits

Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// Cancelled Exchange Fiat Deposits
[apiInstance v1userexchangebankfiatdepositcancelledWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGFiatDepDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiatdepositcancelled: %@", error);
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

[**SWGFiatDepDataResponse***](SWGFiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatdepositunverified**
```objc
-(NSNumber*) v1userexchangebankfiatdepositunverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGFiatDepDataResponse* output, NSError* error)) handler;
```

Unverified Exchange Fiat Deposits

Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// Unverified Exchange Fiat Deposits
[apiInstance v1userexchangebankfiatdepositunverifiedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGFiatDepDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiatdepositunverified: %@", error);
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

[**SWGFiatDepDataResponse***](SWGFiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatdepositverified**
```objc
-(NSNumber*) v1userexchangebankfiatdepositverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGFiatDepDataResponse* output, NSError* error)) handler;
```

Verified Exchange Fiat Deposits

Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// Verified Exchange Fiat Deposits
[apiInstance v1userexchangebankfiatdepositverifiedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGFiatDepDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiatdepositverified: %@", error);
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

[**SWGFiatDepDataResponse***](SWGFiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatwithdrawcancelled**
```objc
-(NSNumber*) v1userexchangebankfiatwithdrawcancelledWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGFiatWithDataResponse* output, NSError* error)) handler;
```

Cancelled Exchange Fiat Withdrawals

Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// Cancelled Exchange Fiat Withdrawals
[apiInstance v1userexchangebankfiatwithdrawcancelledWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGFiatWithDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawcancelled: %@", error);
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

[**SWGFiatWithDataResponse***](SWGFiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatwithdrawcompleted**
```objc
-(NSNumber*) v1userexchangebankfiatwithdrawcompletedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGFiatWithDataResponse* output, NSError* error)) handler;
```

Completed Exchange Fiat Withdrawals

Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// Completed Exchange Fiat Withdrawals
[apiInstance v1userexchangebankfiatwithdrawcompletedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGFiatWithDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawcompleted: %@", error);
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

[**SWGFiatWithDataResponse***](SWGFiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatwithdrawunverified**
```objc
-(NSNumber*) v1userexchangebankfiatwithdrawunverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGFiatWithDataResponse* output, NSError* error)) handler;
```

Unverified Exchange Fiat Withdrawals

Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// Unverified Exchange Fiat Withdrawals
[apiInstance v1userexchangebankfiatwithdrawunverifiedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGFiatWithDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawunverified: %@", error);
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

[**SWGFiatWithDataResponse***](SWGFiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatwithdrawverified**
```objc
-(NSNumber*) v1userexchangebankfiatwithdrawverifiedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGFiatWithDataResponse* output, NSError* error)) handler;
```

Verified Exchange Fiat Withdrawals

Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankFiatDataApi*apiInstance = [[SWGExchangeBankFiatDataApi alloc] init];

// Verified Exchange Fiat Withdrawals
[apiInstance v1userexchangebankfiatwithdrawverifiedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGFiatWithDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawverified: %@", error);
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

[**SWGFiatWithDataResponse***](SWGFiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

