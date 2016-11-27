# SWGWalletDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userwalletcoinaddressWalletID**](SWGWalletDataApi.md#v1userwalletcoinaddresswalletid) | **GET** /v1/user/wallet/coin/address/{walletID} | Wallet Bitcoin Addresses
[**v1userwalletcoindepositconfirmedWalletID**](SWGWalletDataApi.md#v1userwalletcoindepositconfirmedwalletid) | **GET** /v1/user/wallet/coin/deposit/confirmed/{walletID} | Confirmed Wallet Transactions
[**v1userwalletcoindepositconfirmedall**](SWGWalletDataApi.md#v1userwalletcoindepositconfirmedall) | **GET** /v1/user/wallet/coin/deposit/confirmed/all | Confirmed Wallet Deposit
[**v1userwalletcoindepositunconfirmedWalletID**](SWGWalletDataApi.md#v1userwalletcoindepositunconfirmedwalletid) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/{walletID} | Unconfirmed Transactions in Wallet
[**v1userwalletcoindepositunconfirmedall**](SWGWalletDataApi.md#v1userwalletcoindepositunconfirmedall) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/all | All Unconfirmed Deposits
[**v1userwalletcoinwallets**](SWGWalletDataApi.md#v1userwalletcoinwallets) | **GET** /v1/user/wallet/coin/wallets | Wallet Details
[**v1walletwithdrawcancelled**](SWGWalletDataApi.md#v1walletwithdrawcancelled) | **GET** /v1/wallet/coin/withdraw/cancelled | Cancelled Coin Withdrawals
[**v1walletwithdrawcompleted**](SWGWalletDataApi.md#v1walletwithdrawcompleted) | **GET** /v1/wallet/coin/withdraw/completed | Completed Coin Withdrawals
[**v1walletwithdrawunverified**](SWGWalletDataApi.md#v1walletwithdrawunverified) | **GET** /v1/wallet/coin/withdraw/unverified | Unverified Coin Withdrawals
[**v1walletwithdrawverified**](SWGWalletDataApi.md#v1walletwithdrawverified) | **GET** /v1/wallet/coin/withdraw/verified | Verified Coin Withdrawals


# **v1userwalletcoinaddressWalletID**
```objc
-(NSNumber*) v1userwalletcoinaddressWalletIDWithWalletID: (NSString*) walletID
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletAddressDataResponse* output, NSError* error)) handler;
```

Wallet Bitcoin Addresses

Gets a List of Users Bitcoin Deposit Addresses.

### Example 
```objc

NSString* walletID = @"walletID_example"; // 
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletDataApi*apiInstance = [[SWGWalletDataApi alloc] init];

// Wallet Bitcoin Addresses
[apiInstance v1userwalletcoinaddressWalletIDWithWalletID:walletID
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletAddressDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletDataApi->v1userwalletcoinaddressWalletID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletID** | **NSString***|  | 
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletAddressDataResponse***](SWGWalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoindepositconfirmedWalletID**
```objc
-(NSNumber*) v1userwalletcoindepositconfirmedWalletIDWithWalletID: (NSString*) walletID
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletAddressDataResponse* output, NSError* error)) handler;
```

Confirmed Wallet Transactions

Gets your Confirmed Wallet Bitcoin Transactions.

### Example 
```objc

NSString* walletID = @"walletID_example"; // 
NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletDataApi*apiInstance = [[SWGWalletDataApi alloc] init];

// Confirmed Wallet Transactions
[apiInstance v1userwalletcoindepositconfirmedWalletIDWithWalletID:walletID
              authorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletAddressDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletDataApi->v1userwalletcoindepositconfirmedWalletID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletID** | **NSString***|  | 
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletAddressDataResponse***](SWGWalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoindepositconfirmedall**
```objc
-(NSNumber*) v1userwalletcoindepositconfirmedallWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletAddressDataResponse* output, NSError* error)) handler;
```

Confirmed Wallet Deposit

Gets the total confirmed transactions across all accounts and addresses

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletDataApi*apiInstance = [[SWGWalletDataApi alloc] init];

// Confirmed Wallet Deposit
[apiInstance v1userwalletcoindepositconfirmedallWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletAddressDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletDataApi->v1userwalletcoindepositconfirmedall: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletAddressDataResponse***](SWGWalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoindepositunconfirmedWalletID**
```objc
-(NSNumber*) v1userwalletcoindepositunconfirmedWalletIDWithWalletID: (NSString*) walletID
    authorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(NSError* error)) handler;
```

Unconfirmed Transactions in Wallet

Gets the unconfirmed transactions on an account/ wallet.

### Example 
```objc

NSString* walletID = @"walletID_example"; // 
NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletDataApi*apiInstance = [[SWGWalletDataApi alloc] init];

// Unconfirmed Transactions in Wallet
[apiInstance v1userwalletcoindepositunconfirmedWalletIDWithWalletID:walletID
              authorization:authorization
              accept:accept
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGWalletDataApi->v1userwalletcoindepositunconfirmedWalletID: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletID** | **NSString***|  | 
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoindepositunconfirmedall**
```objc
-(NSNumber*) v1userwalletcoindepositunconfirmedallWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(NSError* error)) handler;
```

All Unconfirmed Deposits

Gets the total unconfirmed transactions across all accounts and addresses

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletDataApi*apiInstance = [[SWGWalletDataApi alloc] init];

// All Unconfirmed Deposits
[apiInstance v1userwalletcoindepositunconfirmedallWithAuthorization:authorization
              accept:accept
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGWalletDataApi->v1userwalletcoindepositunconfirmedall: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoinwallets**
```objc
-(NSNumber*) v1userwalletcoinwalletsWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletsDataResponse* output, NSError* error)) handler;
```

Wallet Details

Gets a List of Users Wallets.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added (optional)
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletDataApi*apiInstance = [[SWGWalletDataApi alloc] init];

// Wallet Details
[apiInstance v1userwalletcoinwalletsWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletsDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletDataApi->v1userwalletcoinwallets: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | [optional] 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletsDataResponse***](SWGWalletsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1walletwithdrawcancelled**
```objc
-(NSNumber*) v1walletwithdrawcancelledWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletCoinWithdrawDataResponse* output, NSError* error)) handler;
```

Cancelled Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletDataApi*apiInstance = [[SWGWalletDataApi alloc] init];

// Cancelled Coin Withdrawals
[apiInstance v1walletwithdrawcancelledWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletCoinWithdrawDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletDataApi->v1walletwithdrawcancelled: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletCoinWithdrawDataResponse***](SWGWalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1walletwithdrawcompleted**
```objc
-(NSNumber*) v1walletwithdrawcompletedWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletCoinWithdrawDataResponse* output, NSError* error)) handler;
```

Completed Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletDataApi*apiInstance = [[SWGWalletDataApi alloc] init];

// Completed Coin Withdrawals
[apiInstance v1walletwithdrawcompletedWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletCoinWithdrawDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletDataApi->v1walletwithdrawcompleted: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletCoinWithdrawDataResponse***](SWGWalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1walletwithdrawunverified**
```objc
-(NSNumber*) v1walletwithdrawunverifiedWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletCoinWithdrawDataResponse* output, NSError* error)) handler;
```

Unverified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletDataApi*apiInstance = [[SWGWalletDataApi alloc] init];

// Unverified Coin Withdrawals
[apiInstance v1walletwithdrawunverifiedWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletCoinWithdrawDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletDataApi->v1walletwithdrawunverified: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletCoinWithdrawDataResponse***](SWGWalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1walletwithdrawverified**
```objc
-(NSNumber*) v1walletwithdrawverifiedWithAuthorization: (NSString*) authorization
    accept: (NSString*) accept
        completionHandler: (void (^)(SWGWalletCoinWithdrawDataResponse* output, NSError* error)) handler;
```

Verified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example 
```objc

NSString* authorization = @"authorization_example"; // API object to be added
NSString* accept = @"accept_example"; // JSON, XML or CSV can be returned (Optional) (optional)

SWGWalletDataApi*apiInstance = [[SWGWalletDataApi alloc] init];

// Verified Coin Withdrawals
[apiInstance v1walletwithdrawverifiedWithAuthorization:authorization
              accept:accept
          completionHandler: ^(SWGWalletCoinWithdrawDataResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGWalletDataApi->v1walletwithdrawverified: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **NSString***| API object to be added | 
 **accept** | **NSString***| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SWGWalletCoinWithdrawDataResponse***](SWGWalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

