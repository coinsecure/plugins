# SWGExchangeBankActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankcoinwithdrawinitiate**](SWGExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawinitiate) | **POST** /v1/user/exchange/bank/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**v1userexchangebankcoinwithdrawnewVerifycode**](SWGExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawnewverifycode) | **POST** /v1/user/exchange/bank/coin/withdraw/newVerifycode | Gets a Verification Code.
[**v1userexchangebankcoinwithdrawunverifiedcancel**](SWGExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawunverifiedcancel) | **DELETE** /v1/user/exchange/bank/coin/withdraw/unverified/cancel | Cancel Bitcoin Withdrawal
[**v1userexchangebankcoinwithdrawverify**](SWGExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawverify) | **PUT** /v1/user/exchange/bank/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**v1userexchangebankfiataccountnew**](SWGExchangeBankActionsApi.md#v1userexchangebankfiataccountnew) | **PUT** /v1/user/exchange/bank/fiat/account/new | New Bank Link
[**v1userexchangebankfiatdepositcancel**](SWGExchangeBankActionsApi.md#v1userexchangebankfiatdepositcancel) | **DELETE** /v1/user/exchange/bank/fiat/deposit/cancel | Cancel Unverified Exchange Fiat Deposit
[**v1userexchangebankfiatdepositnew**](SWGExchangeBankActionsApi.md#v1userexchangebankfiatdepositnew) | **PUT** /v1/user/exchange/bank/fiat/deposit/new | New Exchange Fiat Deposit
[**v1userexchangebankfiatwithdrawinitiate**](SWGExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawinitiate) | **POST** /v1/user/exchange/bank/fiat/withdraw/initiate | Initiate Fiat Withdrawal
[**v1userexchangebankfiatwithdrawnewVerifycode**](SWGExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawnewverifycode) | **POST** /v1/user/exchange/bank/fiat/withdraw/newVerifycode | Gets a Fiat Verification Code.
[**v1userexchangebankfiatwithdrawunverifiedcancel**](SWGExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawunverifiedcancel) | **DELETE** /v1/user/exchange/bank/fiat/withdraw/unverified/cancel | Cancel Fiat Withdrawal
[**v1userexchangebankfiatwithdrawverify**](SWGExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawverify) | **PUT** /v1/user/exchange/bank/fiat/withdraw/verify | Verify Fiat Withdrawal


# **v1userexchangebankcoinwithdrawinitiate**
```objc
-(NSNumber*) v1userexchangebankcoinwithdrawinitiateWithBody: (SWGSendCoin*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example 
```objc

SWGSendCoin* body = [[SWGSendCoin alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// Initiate Bitcoin Withdrawal
[apiInstance v1userexchangebankcoinwithdrawinitiateWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankcoinwithdrawinitiate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGSendCoin***](SWGSendCoin*.md)| Please send the form with valid inputs. | 
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

# **v1userexchangebankcoinwithdrawnewVerifycode**
```objc
-(NSNumber*) v1userexchangebankcoinwithdrawnewVerifycodeWithBody: (SWGWithdrawID*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Gets a Verification Code.

Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.

### Example 
```objc

SWGWithdrawID* body = [[SWGWithdrawID alloc] init]; // You can get unverified withdraw ID's from /v1/user/exchange/bank/coin/withdraw/unverified
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// Gets a Verification Code.
[apiInstance v1userexchangebankcoinwithdrawnewVerifycodeWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankcoinwithdrawnewVerifycode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGWithdrawID***](SWGWithdrawID*.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified | 
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

# **v1userexchangebankcoinwithdrawunverifiedcancel**
```objc
-(NSNumber*) v1userexchangebankcoinwithdrawunverifiedcancelWithBody: (SWGWithdrawID*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.

### Example 
```objc

SWGWithdrawID* body = [[SWGWithdrawID alloc] init]; // You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// Cancel Bitcoin Withdrawal
[apiInstance v1userexchangebankcoinwithdrawunverifiedcancelWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankcoinwithdrawunverifiedcancel: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGWithdrawID***](SWGWithdrawID*.md)| You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified. | 
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

# **v1userexchangebankcoinwithdrawverify**
```objc
-(NSNumber*) v1userexchangebankcoinwithdrawverifyWithBody: (SWGCode*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.

### Example 
```objc

SWGCode* body = [[SWGCode alloc] init]; // You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// Verify Bitcoin Withdrawal
[apiInstance v1userexchangebankcoinwithdrawverifyWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankcoinwithdrawverify: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGCode***](SWGCode*.md)| You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode. | 
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

# **v1userexchangebankfiataccountnew**
```objc
-(NSNumber*) v1userexchangebankfiataccountnewWithBody: (SWGNewBankForm*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

New Bank Link

Submits a New Bank Link on KYC Verified Accounts.

### Example 
```objc

SWGNewBankForm* body = [[SWGNewBankForm alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// New Bank Link
[apiInstance v1userexchangebankfiataccountnewWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankfiataccountnew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGNewBankForm***](SWGNewBankForm*.md)| Please send the form with valid inputs. | 
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

# **v1userexchangebankfiatdepositcancel**
```objc
-(NSNumber*) v1userexchangebankfiatdepositcancelWithBody: (SWGDepositID*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Cancel Unverified Exchange Fiat Deposit

Cancels an unverified Exchange Fiat Deposit.

### Example 
```objc

SWGDepositID* body = [[SWGDepositID alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// Cancel Unverified Exchange Fiat Deposit
[apiInstance v1userexchangebankfiatdepositcancelWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankfiatdepositcancel: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGDepositID***](SWGDepositID*.md)| Please send the form with valid inputs. | 
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

# **v1userexchangebankfiatdepositnew**
```objc
-(NSNumber*) v1userexchangebankfiatdepositnewWithBody: (SWGNewFiatBankDeposit*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

New Exchange Fiat Deposit

Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.

### Example 
```objc

SWGNewFiatBankDeposit* body = [[SWGNewFiatBankDeposit alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// New Exchange Fiat Deposit
[apiInstance v1userexchangebankfiatdepositnewWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankfiatdepositnew: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGNewFiatBankDeposit***](SWGNewFiatBankDeposit*.md)| Please send the form with valid inputs. | 
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

# **v1userexchangebankfiatwithdrawinitiate**
```objc
-(NSNumber*) v1userexchangebankfiatwithdrawinitiateWithBody: (SWGWithdrawFiat*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Initiate Fiat Withdrawal

The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example 
```objc

SWGWithdrawFiat* body = [[SWGWithdrawFiat alloc] init]; // Please send the form with valid inputs.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// Initiate Fiat Withdrawal
[apiInstance v1userexchangebankfiatwithdrawinitiateWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankfiatwithdrawinitiate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGWithdrawFiat***](SWGWithdrawFiat*.md)| Please send the form with valid inputs. | 
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

# **v1userexchangebankfiatwithdrawnewVerifycode**
```objc
-(NSNumber*) v1userexchangebankfiatwithdrawnewVerifycodeWithBody: (SWGWithdrawID*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Gets a Fiat Verification Code.

Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.

### Example 
```objc

SWGWithdrawID* body = [[SWGWithdrawID alloc] init]; // You can get unverified withdraw ID's from /v1/user/exchange/bank/fiat/withdraw/unverified
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// Gets a Fiat Verification Code.
[apiInstance v1userexchangebankfiatwithdrawnewVerifycodeWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankfiatwithdrawnewVerifycode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGWithdrawID***](SWGWithdrawID*.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified | 
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

# **v1userexchangebankfiatwithdrawunverifiedcancel**
```objc
-(NSNumber*) v1userexchangebankfiatwithdrawunverifiedcancelWithBody: (SWGWithdrawID*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Cancel Fiat Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.

### Example 
```objc

SWGWithdrawID* body = [[SWGWithdrawID alloc] init]; // You can get the code from /v1/user/exchange/bank/fiat/withdraw/unverified.
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// Cancel Fiat Withdrawal
[apiInstance v1userexchangebankfiatwithdrawunverifiedcancelWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankfiatwithdrawunverifiedcancel: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGWithdrawID***](SWGWithdrawID*.md)| You can get the code from /v1/user/exchange/bank/fiat/withdraw/unverified. | 
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

# **v1userexchangebankfiatwithdrawverify**
```objc
-(NSNumber*) v1userexchangebankfiatwithdrawverifyWithBody: (SWGCode*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;
```

Verify Fiat Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.

### Example 
```objc

SWGCode* body = [[SWGCode alloc] init]; // You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode
NSString* authorization = @"authorization_example"; // Enter a valid Api Key. (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGExchangeBankActionsApi*apiInstance = [[SWGExchangeBankActionsApi alloc] init];

// Verify Fiat Withdrawal
[apiInstance v1userexchangebankfiatwithdrawverifyWithBody:body
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGSuccessResult* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGExchangeBankActionsApi->v1userexchangebankfiatwithdrawverify: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SWGCode***](SWGCode*.md)| You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode | 
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

