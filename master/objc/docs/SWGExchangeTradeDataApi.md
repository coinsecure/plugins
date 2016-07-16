# SWGExchangeTradeDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1exchangeasklow**](SWGExchangeTradeDataApi.md#v1exchangeasklow) | **GET** /v1/exchange/ask/low | Lowest Ask
[**v1exchangeaskorders**](SWGExchangeTradeDataApi.md#v1exchangeaskorders) | **GET** /v1/exchange/ask/orders | All Sell Orders
[**v1exchangebidhigh**](SWGExchangeTradeDataApi.md#v1exchangebidhigh) | **GET** /v1/exchange/bid/high | Returns the Highest Bid in the Order Book
[**v1exchangebidorders**](SWGExchangeTradeDataApi.md#v1exchangebidorders) | **GET** /v1/exchange/bid/orders | All Buy Orders
[**v1exchangelastTrade**](SWGExchangeTradeDataApi.md#v1exchangelasttrade) | **GET** /v1/exchange/lastTrade | Last Trade
[**v1exchangemax24Hr**](SWGExchangeTradeDataApi.md#v1exchangemax24hr) | **GET** /v1/exchange/max24Hr | Max 24 Hour Rate
[**v1exchangemin24Hr**](SWGExchangeTradeDataApi.md#v1exchangemin24hr) | **GET** /v1/exchange/min24Hr | Min 24 Hour Rate
[**v1exchangeticker**](SWGExchangeTradeDataApi.md#v1exchangeticker) | **GET** /v1/exchange/ticker | Exchange Ticker
[**v1userexchangeaskcancelled**](SWGExchangeTradeDataApi.md#v1userexchangeaskcancelled) | **GET** /v1/user/exchange/ask/cancelled | Cancelled User Sell Orders
[**v1userexchangeaskcompleted**](SWGExchangeTradeDataApi.md#v1userexchangeaskcompleted) | **GET** /v1/user/exchange/ask/completed | Completed User Sell Orders
[**v1userexchangeaskpending**](SWGExchangeTradeDataApi.md#v1userexchangeaskpending) | **GET** /v1/user/exchange/ask/pending | Pending User Sell Orders
[**v1userexchangebidcancelled**](SWGExchangeTradeDataApi.md#v1userexchangebidcancelled) | **GET** /v1/user/exchange/bid/cancelled | Cancelled User Buy Orders
[**v1userexchangebidcompleted**](SWGExchangeTradeDataApi.md#v1userexchangebidcompleted) | **GET** /v1/user/exchange/bid/completed | Completed User Buy Orders
[**v1userexchangebidpending**](SWGExchangeTradeDataApi.md#v1userexchangebidpending) | **GET** /v1/user/exchange/bid/pending | Pending User Buy Orders


# **v1exchangeasklow**
```objc
-(NSNumber*) v1exchangeasklowWithAccept: (NSString*) accept
        completionHandler: (void (^)(SWGRateDataResponse* output, NSError* error)) handler;
```

Lowest Ask

Returns the Lowest Ask Rate in Json. The Amount is in Paisa.

### Example 
```objc

NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Lowest Ask
[apiInstance v1exchangeasklowWithAccept:accept
          completionHandler: ^(SWGRateDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1exchangeasklow: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGRateDataResponse***](SWGRateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangeaskorders**
```objc
-(NSNumber*) v1exchangeaskordersWithAccept: (NSString*) accept
        completionHandler: (void (^)(SWGRateVolDataResponse* output, NSError* error)) handler;
```

All Sell Orders

Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```objc

NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// All Sell Orders
[apiInstance v1exchangeaskordersWithAccept:accept
          completionHandler: ^(SWGRateVolDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1exchangeaskorders: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGRateVolDataResponse***](SWGRateVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangebidhigh**
```objc
-(NSNumber*) v1exchangebidhighWithAccept: (NSString*) accept
        completionHandler: (void (^)(SWGRateDataResponse* output, NSError* error)) handler;
```

Returns the Highest Bid in the Order Book

Highest Bid.

### Example 
```objc

NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Returns the Highest Bid in the Order Book
[apiInstance v1exchangebidhighWithAccept:accept
          completionHandler: ^(SWGRateDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1exchangebidhigh: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGRateDataResponse***](SWGRateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangebidorders**
```objc
-(NSNumber*) v1exchangebidordersWithAccept: (NSString*) accept
        completionHandler: (void (^)(SWGRateVolDataResponse* output, NSError* error)) handler;
```

All Buy Orders

Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```objc

NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// All Buy Orders
[apiInstance v1exchangebidordersWithAccept:accept
          completionHandler: ^(SWGRateVolDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1exchangebidorders: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGRateVolDataResponse***](SWGRateVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangelastTrade**
```objc
-(NSNumber*) v1exchangelastTradeWithAccept: (NSString*) accept
        completionHandler: (void (^)(SWGLastTradeDataResponse* output, NSError* error)) handler;
```

Last Trade

Returns a summary of data from the Exchange.

### Example 
```objc

NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Last Trade
[apiInstance v1exchangelastTradeWithAccept:accept
          completionHandler: ^(SWGLastTradeDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1exchangelastTrade: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGLastTradeDataResponse***](SWGLastTradeDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangemax24Hr**
```objc
-(NSNumber*) v1exchangemax24HrWithAccept: (NSString*) accept
        completionHandler: (void (^)(SWGRateDiffDataResponse* output, NSError* error)) handler;
```

Max 24 Hour Rate

Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.

### Example 
```objc

NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Max 24 Hour Rate
[apiInstance v1exchangemax24HrWithAccept:accept
          completionHandler: ^(SWGRateDiffDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1exchangemax24Hr: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGRateDiffDataResponse***](SWGRateDiffDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangemin24Hr**
```objc
-(NSNumber*) v1exchangemin24HrWithAccept: (NSString*) accept
        completionHandler: (void (^)(SWGRateDiffDataResponse* output, NSError* error)) handler;
```

Min 24 Hour Rate

Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.

### Example 
```objc

NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Min 24 Hour Rate
[apiInstance v1exchangemin24HrWithAccept:accept
          completionHandler: ^(SWGRateDiffDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1exchangemin24Hr: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGRateDiffDataResponse***](SWGRateDiffDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangeticker**
```objc
-(NSNumber*) v1exchangetickerWithAccept: (NSString*) accept
        completionHandler: (void (^)(SWGStandardTickerResultData* output, NSError* error)) handler;
```

Exchange Ticker

Returns a summary of data from the Exchange.

### Example 
```objc

NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Exchange Ticker
[apiInstance v1exchangetickerWithAccept:accept
          completionHandler: ^(SWGStandardTickerResultData* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1exchangeticker: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGStandardTickerResultData***](SWGStandardTickerResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeaskcancelled**
```objc
-(NSNumber*) v1userexchangeaskcancelledWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGOrderDataResponse* output, NSError* error)) handler;
```

Cancelled User Sell Orders

Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Cancelled User Sell Orders
[apiInstance v1userexchangeaskcancelledWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGOrderDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1userexchangeaskcancelled: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGOrderDataResponse***](SWGOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeaskcompleted**
```objc
-(NSNumber*) v1userexchangeaskcompletedWithAuthorization: (NSString*) authorization
    from: (NSNumber*) from
    to: (NSNumber*) to
    max: (NSNumber*) max
    offset: (NSNumber*) offset
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGOrderDataResponse* output, NSError* error)) handler;
```

Completed User Sell Orders

Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSNumber* from = @0; // From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
NSNumber* to = @9223372036854776000; // To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
NSNumber* max = @10; // Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
NSNumber* offset = @0; // Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Completed User Sell Orders
[apiInstance v1userexchangeaskcompletedWithAuthorization:authorization
              from:from
              to:to
              max:max
              offset:offset
              accept:accept
          completionHandler: ^(SWGOrderDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1userexchangeaskcompleted: %@", error);
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

[**SWGOrderDataResponse***](SWGOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeaskpending**
```objc
-(NSNumber*) v1userexchangeaskpendingWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGOrderDataResponse* output, NSError* error)) handler;
```

Pending User Sell Orders

Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Pending User Sell Orders
[apiInstance v1userexchangeaskpendingWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGOrderDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1userexchangeaskpending: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGOrderDataResponse***](SWGOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebidcancelled**
```objc
-(NSNumber*) v1userexchangebidcancelledWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGOrderDataResponse* output, NSError* error)) handler;
```

Cancelled User Buy Orders

Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Cancelled User Buy Orders
[apiInstance v1userexchangebidcancelledWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGOrderDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1userexchangebidcancelled: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGOrderDataResponse***](SWGOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebidcompleted**
```objc
-(NSNumber*) v1userexchangebidcompletedWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGOrderDataResponse* output, NSError* error)) handler;
```

Completed User Buy Orders

Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Completed User Buy Orders
[apiInstance v1userexchangebidcompletedWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGOrderDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1userexchangebidcompleted: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGOrderDataResponse***](SWGOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebidpending**
```objc
-(NSNumber*) v1userexchangebidpendingWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGOrderDataResponse* output, NSError* error)) handler;
```

Pending User Buy Orders

Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeDataApi*apiInstance = [[SWGExchangeTradeDataApi alloc] init];

// Pending User Buy Orders
[apiInstance v1userexchangebidpendingWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGOrderDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeDataApi->v1userexchangebidpending: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGOrderDataResponse***](SWGOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

