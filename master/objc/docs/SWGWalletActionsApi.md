# SWGWalletActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userwalletcoinaddressnew**](SWGWalletActionsApi.md#v1userwalletcoinaddressnew) | **PUT** /v1/user/wallet/coin/address/new | New Bitcoin Address
[**v1userwalletcoinnew**](SWGWalletActionsApi.md#v1userwalletcoinnew) | **PUT** /v1/user/wallet/coin/new | Create New Wallet
[**v1userwalletcoinwithdrawinitiate**](SWGWalletActionsApi.md#v1userwalletcoinwithdrawinitiate) | **POST** /v1/user/wallet/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**v1userwalletcoinwithdrawsendToExchange**](SWGWalletActionsApi.md#v1userwalletcoinwithdrawsendtoexchange) | **PUT** /v1/user/wallet/coin/withdraw/sendToExchange | Send to Exchange
[**v1userwalletcoinwithdrawunverifiedcancelWithdrawID**](SWGWalletActionsApi.md#v1userwalletcoinwithdrawunverifiedcancelwithdrawid) | **DELETE** /v1/user/wallet/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
[**v1userwalletcoinwithdrawverify**](SWGWalletActionsApi.md#v1userwalletcoinwithdrawverify) | **PUT** /v1/user/wallet/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**v1walletcoinwithdrawnewVerifycode**](SWGWalletActionsApi.md#v1walletcoinwithdrawnewverifycode) | **POST** /v1/wallet/coin/withdraw/newVerifycode | Gets a Verification Code


# **v1userwalletcoinaddressnew**
```objc
-(NSNumber*) v1userwalletcoinaddressnewWithBody: (SWGNewAddress*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletAddressDataResponse* output, NSError* error)) handler;
```

New Bitcoin Address

Generates a New Bitcoin Address to store coins.

### Example 
```objc

SWGNewAddress* body = [[SWGNewAddress alloc] init]; // 
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletActionsApi*apiInstance = [[SWGWalletActionsApi alloc] init];

// New Bitcoin Address
[apiInstance v1userwalletcoinaddressnewWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletAddressDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletActionsApi->v1userwalletcoinaddressnew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGNewAddress***](SWGNewAddress*.md)|  | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletAddressDataResponse***](SWGWalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoinnew**
```objc
-(NSNumber*) v1userwalletcoinnewWithBody: (SWGNewWallet*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletAddressDataResponse* output, NSError* error)) handler;
```

Create New Wallet

Creates a New wallet to store addresses. This method also creates a single default address in each new wallet.

### Example 
```objc

SWGNewWallet* body = [[SWGNewWallet alloc] init]; // 
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletActionsApi*apiInstance = [[SWGWalletActionsApi alloc] init];

// Create New Wallet
[apiInstance v1userwalletcoinnewWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletAddressDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletActionsApi->v1userwalletcoinnew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGNewWallet***](SWGNewWallet*.md)|  | 
 **authorization** | **NSString***| Enter a valid Api Key. | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletAddressDataResponse***](SWGWalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoinwithdrawinitiate**
```objc
-(NSNumber*) v1userwalletcoinwithdrawinitiateWithBody: (SWGSendCoinWallet*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example 
```objc

SWGSendCoinWallet* body = [[SWGSendCoinWallet alloc] init]; // 
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletActionsApi*apiInstance = [[SWGWalletActionsApi alloc] init];

// Initiate Bitcoin Withdrawal
[apiInstance v1userwalletcoinwithdrawinitiateWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletActionsApi->v1userwalletcoinwithdrawinitiate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGSendCoinWallet***](SWGSendCoinWallet*.md)|  | 
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

# **v1userwalletcoinwithdrawsendToExchange**
```objc
-(NSNumber*) v1userwalletcoinwithdrawsendToExchangeWithBody: (SWGSendExchange*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Send to Exchange

This function transfers funds to yout Exchange Balance without the need for any confirmations.

### Example 
```objc

SWGSendExchange* body = [[SWGSendExchange alloc] init]; // 
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletActionsApi*apiInstance = [[SWGWalletActionsApi alloc] init];

// Send to Exchange
[apiInstance v1userwalletcoinwithdrawsendToExchangeWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletActionsApi->v1userwalletcoinwithdrawsendToExchange: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGSendExchange***](SWGSendExchange*.md)|  | 
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

# **v1userwalletcoinwithdrawunverifiedcancelWithdrawID**
```objc
-(NSNumber*) v1userwalletcoinwithdrawunverifiedcancelWithdrawIDWithWithdrawID: (NSString*) withdrawID
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws.

### Example 
```objc

NSString* withdrawID = @"withdrawID_example"; // 
NSString* authorization = @"authorization_example"; // Enter a valid Api Key.
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletActionsApi*apiInstance = [[SWGWalletActionsApi alloc] init];

// Cancel Bitcoin Withdrawal
[apiInstance v1userwalletcoinwithdrawunverifiedcancelWithdrawIDWithWithdrawID:withdrawID
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletActionsApi->v1userwalletcoinwithdrawunverifiedcancelWithdrawID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawID** | **NSString***|  | 
 **authorization** | **NSString***| Enter a valid Api Key. | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoinwithdrawverify**
```objc
-(NSNumber*) v1userwalletcoinwithdrawverifyWithAuthorization: (NSString*) authorization
    body: (SWGCode*) body
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode.

### Example 
```objc

NSString* authorization = @"authorization_example"; // Enter a valid Api Key.
SWGCode* body = [[SWGCode alloc] init]; // 
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletActionsApi*apiInstance = [[SWGWalletActionsApi alloc] init];

// Verify Bitcoin Withdrawal
[apiInstance v1userwalletcoinwithdrawverifyWithAuthorization:authorization
              body:body
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletActionsApi->v1userwalletcoinwithdrawverify: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| Enter a valid Api Key. | 
 **body** | [**SWGCode***](SWGCode*.md)|  | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1walletcoinwithdrawnewVerifycode**
```objc
-(NSNumber*) v1walletcoinwithdrawnewVerifycodeWithBody: (SWGWithdrawID*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Gets a Verification Code

Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified.

### Example 
```objc

SWGWithdrawID* body = [[SWGWithdrawID alloc] init]; // You can get unverified withdraw ID's from /v1/exchange/bank/coin/withdrawVerifycode
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletActionsApi*apiInstance = [[SWGWalletActionsApi alloc] init];

// Gets a Verification Code
[apiInstance v1walletcoinwithdrawnewVerifycodeWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletActionsApi->v1walletcoinwithdrawnewVerifycode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGWithdrawID***](SWGWithdrawID*.md)| You can get unverified withdraw ID&#39;s from /v1/exchange/bank/coin/withdrawVerifycode | 
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGSuccessResult***](SWGSuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

