# \WalletDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1UserWalletCoinAddressWalletID**](WalletDataApi.md#V1UserWalletCoinAddressWalletID) | **Get** /v1/user/wallet/coin/address/{walletID} | Wallet Bitcoin Addresses
[**V1UserWalletCoinDepositConfirmedAll**](WalletDataApi.md#V1UserWalletCoinDepositConfirmedAll) | **Get** /v1/user/wallet/coin/deposit/confirmed/all | Confirmed Wallet Deposit
[**V1UserWalletCoinDepositConfirmedWalletID**](WalletDataApi.md#V1UserWalletCoinDepositConfirmedWalletID) | **Get** /v1/user/wallet/coin/deposit/confirmed/{walletID} | Confirmed Wallet Transactions
[**V1UserWalletCoinDepositUnconfirmedAll**](WalletDataApi.md#V1UserWalletCoinDepositUnconfirmedAll) | **Get** /v1/user/wallet/coin/deposit/unconfirmed/all | All Unconfirmed Deposits
[**V1UserWalletCoinDepositUnconfirmedWalletID**](WalletDataApi.md#V1UserWalletCoinDepositUnconfirmedWalletID) | **Get** /v1/user/wallet/coin/deposit/unconfirmed/{walletID} | Unconfirmed Transactions in Wallet
[**V1UserWalletCoinWallets**](WalletDataApi.md#V1UserWalletCoinWallets) | **Get** /v1/user/wallet/coin/wallets | Wallet Details
[**V1WalletWithdrawCancelled**](WalletDataApi.md#V1WalletWithdrawCancelled) | **Get** /v1/wallet/coin/withdraw/cancelled | Cancelled Coin Withdrawals
[**V1WalletWithdrawCompleted**](WalletDataApi.md#V1WalletWithdrawCompleted) | **Get** /v1/wallet/coin/withdraw/completed | Completed Coin Withdrawals
[**V1WalletWithdrawUnverified**](WalletDataApi.md#V1WalletWithdrawUnverified) | **Get** /v1/wallet/coin/withdraw/unverified | Unverified Coin Withdrawals
[**V1WalletWithdrawVerified**](WalletDataApi.md#V1WalletWithdrawVerified) | **Get** /v1/wallet/coin/withdraw/verified | Verified Coin Withdrawals


# **V1UserWalletCoinAddressWalletID**
> WalletAddressDataResponse V1UserWalletCoinAddressWalletID($walletID, $authorization, $accept)

Wallet Bitcoin Addresses

Gets a List of Users Bitcoin Deposit Addresses.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletID** | **string**|  | 
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserWalletCoinDepositConfirmedAll**
> WalletAddressDataResponse V1UserWalletCoinDepositConfirmedAll($authorization, $accept)

Confirmed Wallet Deposit

Gets the total confirmed transactions across all accounts and addresses


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserWalletCoinDepositConfirmedWalletID**
> WalletAddressDataResponse V1UserWalletCoinDepositConfirmedWalletID($walletID, $authorization, $accept)

Confirmed Wallet Transactions

Gets your Confirmed Wallet Bitcoin Transactions.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletID** | **string**|  | 
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserWalletCoinDepositUnconfirmedAll**
> V1UserWalletCoinDepositUnconfirmedAll($authorization, $accept)

All Unconfirmed Deposits

Gets the total unconfirmed transactions across all accounts and addresses


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserWalletCoinDepositUnconfirmedWalletID**
> V1UserWalletCoinDepositUnconfirmedWalletID($walletID, $authorization, $accept)

Unconfirmed Transactions in Wallet

Gets the unconfirmed transactions on an account/ wallet.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletID** | **string**|  | 
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserWalletCoinWallets**
> WalletsDataResponse V1UserWalletCoinWallets($authorization, $accept)

Wallet Details

Gets a List of Users Wallets.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletsDataResponse**](WalletsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1WalletWithdrawCancelled**
> WalletCoinWithdrawDataResponse V1WalletWithdrawCancelled($authorization, $accept)

Cancelled Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1WalletWithdrawCompleted**
> WalletCoinWithdrawDataResponse V1WalletWithdrawCompleted($authorization, $accept)

Completed Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1WalletWithdrawUnverified**
> WalletCoinWithdrawDataResponse V1WalletWithdrawUnverified($authorization, $accept)

Unverified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1WalletWithdrawVerified**
> WalletCoinWithdrawDataResponse V1WalletWithdrawVerified($authorization, $accept)

Verified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

