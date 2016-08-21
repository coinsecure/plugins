# SWGAccountDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1exchangebanksummary**](SWGAccountDataApi.md#v1exchangebanksummary) | **GET** /v1/user/exchange/bank/summary | Exchange Bank Summary
[**v1exchangeusercoinfee**](SWGAccountDataApi.md#v1exchangeusercoinfee) | **GET** /v1/user/exchange/coin/fee | Users Coin Fee Percentage
[**v1exchangeuserfiatfee**](SWGAccountDataApi.md#v1exchangeuserfiatfee) | **GET** /v1/user/exchange/fiat/fee | Users Fiat Fee Percentage
[**v1netkisearchNetkiName**](SWGAccountDataApi.md#v1netkisearchnetkiname) | **GET** /v1/netki/search/{netkiName} | Coinsecure.me Netki Lookup
[**v1userexchangekycs**](SWGAccountDataApi.md#v1userexchangekycs) | **GET** /v1/user/exchange/kycs | Gets KYC Status Details
[**v1userexchangereferralcoinpaid**](SWGAccountDataApi.md#v1userexchangereferralcoinpaid) | **GET** /v1/user/exchange/referral/coin/paid | Users Paid Fiat Referrals
[**v1userexchangereferralcoinsuccessful**](SWGAccountDataApi.md#v1userexchangereferralcoinsuccessful) | **GET** /v1/user/exchange/referral/coin/successful | Gets Users Successful Referral Links
[**v1userexchangereferralfiatpaid**](SWGAccountDataApi.md#v1userexchangereferralfiatpaid) | **GET** /v1/user/exchange/referral/fiat/paid | Users Paid Fiat Referrals
[**v1userexchangereferrals**](SWGAccountDataApi.md#v1userexchangereferrals) | **GET** /v1/user/exchange/referrals | Gets Users Referral Links
[**v1userexchangetradesummary**](SWGAccountDataApi.md#v1userexchangetradesummary) | **GET** /v1/user/exchange/trade/summary | Exchange Trade Summary
[**v1userlogintokenToken**](SWGAccountDataApi.md#v1userlogintokentoken) | **GET** /v1/user/login/token/{token} | Login Token Email
[**v1usersummary**](SWGAccountDataApi.md#v1usersummary) | **GET** /v1/user/summary | Exchange Bank Summary
[**v1userwalletsummary**](SWGAccountDataApi.md#v1userwalletsummary) | **GET** /v1/user/wallet/summary | Exchange Bank Summary


# **v1exchangebanksummary**
```objc
-(NSNumber*) v1exchangebanksummaryWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGBankSummaryDataResponse* output, NSError* error)) handler;
```

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Exchange Bank Summary
[apiInstance v1exchangebanksummaryWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGBankSummaryDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1exchangebanksummary: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGBankSummaryDataResponse***](SWGBankSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangeusercoinfee**
```objc
-(NSNumber*) v1exchangeusercoinfeeWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGDoubleDataResponse* output, NSError* error)) handler;
```

Users Coin Fee Percentage

Returns the users coin fee percentage. The response is in percentage.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Users Coin Fee Percentage
[apiInstance v1exchangeusercoinfeeWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGDoubleDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1exchangeusercoinfee: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGDoubleDataResponse***](SWGDoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangeuserfiatfee**
```objc
-(NSNumber*) v1exchangeuserfiatfeeWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGDoubleDataResponse* output, NSError* error)) handler;
```

Users Fiat Fee Percentage

Returns the users fiat fee percentage. The response is in percentage.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Users Fiat Fee Percentage
[apiInstance v1exchangeuserfiatfeeWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGDoubleDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1exchangeuserfiatfee: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGDoubleDataResponse***](SWGDoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1netkisearchNetkiName**
```objc
-(NSNumber*) v1netkisearchNetkiNameWithNetkiName: (NSString*) netkiName
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGDoubleDataResponse* output, NSError* error)) handler;
```

Coinsecure.me Netki Lookup

Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.

### Example 
```objc

NSString* netkiName = @"netkiName_example"; // 
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Coinsecure.me Netki Lookup
[apiInstance v1netkisearchNetkiNameWithNetkiName:netkiName
              accept:accept
          completionHandler: ^(SWGDoubleDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1netkisearchNetkiName: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netkiName** | **NSString***|  | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGDoubleDataResponse***](SWGDoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangekycs**
```objc
-(NSNumber*) v1userexchangekycsWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGKYCDataResponse* output, NSError* error)) handler;
```

Gets KYC Status Details

Gets Users KYC Status Details.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Gets KYC Status Details
[apiInstance v1userexchangekycsWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGKYCDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1userexchangekycs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGKYCDataResponse***](SWGKYCDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangereferralcoinpaid**
```objc
-(NSNumber*) v1userexchangereferralcoinpaidWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccCoinRefDataResponse* output, NSError* error)) handler;
```

Users Paid Fiat Referrals

Returns the Users Paid Coin Referrals.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Users Paid Fiat Referrals
[apiInstance v1userexchangereferralcoinpaidWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccCoinRefDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1userexchangereferralcoinpaid: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccCoinRefDataResponse***](SWGSuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangereferralcoinsuccessful**
```objc
-(NSNumber*) v1userexchangereferralcoinsuccessfulWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccRefDataResponse* output, NSError* error)) handler;
```

Gets Users Successful Referral Links

Gets Users Successful Referral Links that can be used during signup.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Gets Users Successful Referral Links
[apiInstance v1userexchangereferralcoinsuccessfulWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccRefDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1userexchangereferralcoinsuccessful: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccRefDataResponse***](SWGSuccRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangereferralfiatpaid**
```objc
-(NSNumber*) v1userexchangereferralfiatpaidWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccCoinRefDataResponse* output, NSError* error)) handler;
```

Users Paid Fiat Referrals

Returns the Users Paid Fiat Referrals.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Users Paid Fiat Referrals
[apiInstance v1userexchangereferralfiatpaidWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccCoinRefDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1userexchangereferralfiatpaid: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccCoinRefDataResponse***](SWGSuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangereferrals**
```objc
-(NSNumber*) v1userexchangereferralsWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGAllRefDataResponse* output, NSError* error)) handler;
```

Gets Users Referral Links

Gets Users Referral Links that can be used during signup.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Gets Users Referral Links
[apiInstance v1userexchangereferralsWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGAllRefDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1userexchangereferrals: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGAllRefDataResponse***](SWGAllRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangetradesummary**
```objc
-(NSNumber*) v1userexchangetradesummaryWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGTradeSummaryDataResponse* output, NSError* error)) handler;
```

Exchange Trade Summary

Gets a Summary of Exchange Trade Data.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Exchange Trade Summary
[apiInstance v1userexchangetradesummaryWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGTradeSummaryDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1userexchangetradesummary: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGTradeSummaryDataResponse***](SWGTradeSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userlogintokenToken**
```objc
-(NSNumber*) v1userlogintokenTokenWithToken: (NSString*) token
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Login Token Email

Retrieves details of a Login Token

### Example 
```objc

NSString* token = @"token_example"; // 
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Login Token Email
[apiInstance v1userlogintokenTokenWithToken:token
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1userlogintokenToken: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **NSString***|  | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usersummary**
```objc
-(NSNumber*) v1usersummaryWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGUserSummaryDataResponse* output, NSError* error)) handler;
```

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Exchange Bank Summary
[apiInstance v1usersummaryWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGUserSummaryDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1usersummary: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGUserSummaryDataResponse***](SWGUserSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletsummary**
```objc
-(NSNumber*) v1userwalletsummaryWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletSummaryDataResponse* output, NSError* error)) handler;
```

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGAccountDataApi*apiInstance = [[SWGAccountDataApi alloc] init];

// Exchange Bank Summary
[apiInstance v1userwalletsummaryWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletSummaryDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountDataApi->v1userwalletsummary: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletSummaryDataResponse***](SWGWalletSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

