# SWGExchangeTradeActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangeaskcancel**](SWGExchangeTradeActionsApi.md#v1userexchangeaskcancel) | **DELETE** /v1/user/exchange/ask/cancel | Cancel Open Sell Order
[**v1userexchangeasknew**](SWGExchangeTradeActionsApi.md#v1userexchangeasknew) | **PUT** /v1/user/exchange/ask/new | BTC Sell Order
[**v1userexchangebidcancel**](SWGExchangeTradeActionsApi.md#v1userexchangebidcancel) | **DELETE** /v1/user/exchange/bid/cancel | Cancel Open Buy Order
[**v1userexchangebidnew**](SWGExchangeTradeActionsApi.md#v1userexchangebidnew) | **PUT** /v1/user/exchange/bid/new | BTC Buy Order
[**v1userexchangeinstantbuy**](SWGExchangeTradeActionsApi.md#v1userexchangeinstantbuy) | **PUT** /v1/user/exchange/instant/buy | Instantly Buy BTC
[**v1userexchangeinstantsell**](SWGExchangeTradeActionsApi.md#v1userexchangeinstantsell) | **PUT** /v1/user/exchange/instant/sell | Instantly Sell BTC


# **v1userexchangeaskcancel**
```objc
-(NSNumber*) v1userexchangeaskcancelWithBody: (SWGAskID*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Cancel Open Sell Order

Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.

### Example 
```objc

SWGAskID* body = [[SWGAskID alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeActionsApi*apiInstance = [[SWGExchangeTradeActionsApi alloc] init];

// Cancel Open Sell Order
[apiInstance v1userexchangeaskcancelWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeActionsApi->v1userexchangeaskcancel: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGAskID***](SWGAskID*.md)| Please send the form with valid inputs. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeasknew**
```objc
-(NSNumber*) v1userexchangeasknewWithBody: (SWGRateVolData*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResultList* output, NSError* error)) handler;
```

BTC Sell Order

Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example 
```objc

SWGRateVolData* body = [[SWGRateVolData alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeActionsApi*apiInstance = [[SWGExchangeTradeActionsApi alloc] init];

// BTC Sell Order
[apiInstance v1userexchangeasknewWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResultList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeActionsApi->v1userexchangeasknew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGRateVolData***](SWGRateVolData*.md)| Please send the form with valid inputs. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResultList***](SWGSuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebidcancel**
```objc
-(NSNumber*) v1userexchangebidcancelWithBody: (SWGBidID*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Cancel Open Buy Order

Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.

### Example 
```objc

SWGBidID* body = [[SWGBidID alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeActionsApi*apiInstance = [[SWGExchangeTradeActionsApi alloc] init];

// Cancel Open Buy Order
[apiInstance v1userexchangebidcancelWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeActionsApi->v1userexchangebidcancel: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGBidID***](SWGBidID*.md)| Please send the form with valid inputs. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebidnew**
```objc
-(NSNumber*) v1userexchangebidnewWithBody: (SWGRateVolData*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResultList* output, NSError* error)) handler;
```

BTC Buy Order

Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example 
```objc

SWGRateVolData* body = [[SWGRateVolData alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeActionsApi*apiInstance = [[SWGExchangeTradeActionsApi alloc] init];

// BTC Buy Order
[apiInstance v1userexchangebidnewWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResultList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeActionsApi->v1userexchangebidnew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGRateVolData***](SWGRateVolData*.md)| Please send the form with valid inputs. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResultList***](SWGSuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeinstantbuy**
```objc
-(NSNumber*) v1userexchangeinstantbuyWithBody: (SWGMinFiat*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResultList* output, NSError* error)) handler;
```

Instantly Buy BTC

Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example 
```objc

SWGMinFiat* body = [[SWGMinFiat alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeActionsApi*apiInstance = [[SWGExchangeTradeActionsApi alloc] init];

// Instantly Buy BTC
[apiInstance v1userexchangeinstantbuyWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResultList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeActionsApi->v1userexchangeinstantbuy: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGMinFiat***](SWGMinFiat*.md)| Please send the form with valid inputs. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResultList***](SWGSuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeinstantsell**
```objc
-(NSNumber*) v1userexchangeinstantsellWithBody: (SWGMaxVol*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResultList* output, NSError* error)) handler;
```

Instantly Sell BTC

Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example 
```objc

SWGMaxVol* body = [[SWGMaxVol alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeTradeActionsApi*apiInstance = [[SWGExchangeTradeActionsApi alloc] init];

// Instantly Sell BTC
[apiInstance v1userexchangeinstantsellWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResultList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeTradeActionsApi->v1userexchangeinstantsell: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGMaxVol***](SWGMaxVol*.md)| Please send the form with valid inputs. | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResultList***](SWGSuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

