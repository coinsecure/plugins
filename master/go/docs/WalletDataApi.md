# \WalletDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1userwalletcoinaddressWalletID**](WalletDataApi.md#V1userwalletcoinaddressWalletID) | **Get** /v1/user/wallet/coin/address/{walletID} | Wallet Bitcoin Addresses
[**V1userwalletcoindepositconfirmedWalletID**](WalletDataApi.md#V1userwalletcoindepositconfirmedWalletID) | **Get** /v1/user/wallet/coin/deposit/confirmed/{walletID} | Confirmed Wallet Transactions
[**V1userwalletcoindepositconfirmedall**](WalletDataApi.md#V1userwalletcoindepositconfirmedall) | **Get** /v1/user/wallet/coin/deposit/confirmed/all | Confirmed Wallet Deposit
[**V1userwalletcoindepositunconfirmedWalletID**](WalletDataApi.md#V1userwalletcoindepositunconfirmedWalletID) | **Get** /v1/user/wallet/coin/deposit/unconfirmed/{walletID} | Unconfirmed Transactions in Wallet
[**V1userwalletcoindepositunconfirmedall**](WalletDataApi.md#V1userwalletcoindepositunconfirmedall) | **Get** /v1/user/wallet/coin/deposit/unconfirmed/all | All Unconfirmed Deposits
[**V1userwalletcoinwallets**](WalletDataApi.md#V1userwalletcoinwallets) | **Get** /v1/user/wallet/coin/wallets | Wallet Details
[**V1walletwithdrawcancelled**](WalletDataApi.md#V1walletwithdrawcancelled) | **Get** /v1/wallet/coin/withdraw/cancelled | Cancelled Coin Withdrawals
[**V1walletwithdrawcompleted**](WalletDataApi.md#V1walletwithdrawcompleted) | **Get** /v1/wallet/coin/withdraw/completed | Completed Coin Withdrawals
[**V1walletwithdrawunverified**](WalletDataApi.md#V1walletwithdrawunverified) | **Get** /v1/wallet/coin/withdraw/unverified | Unverified Coin Withdrawals
[**V1walletwithdrawverified**](WalletDataApi.md#V1walletwithdrawverified) | **Get** /v1/wallet/coin/withdraw/verified | Verified Coin Withdrawals


# **V1userwalletcoinaddressWalletID**
> WalletAddressDataResponse V1userwalletcoinaddressWalletID($walletID, $authorization, $accept)

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

# **V1userwalletcoindepositconfirmedWalletID**
> WalletAddressDataResponse V1userwalletcoindepositconfirmedWalletID($walletID, $authorization, $accept)

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

# **V1userwalletcoindepositconfirmedall**
> WalletAddressDataResponse V1userwalletcoindepositconfirmedall($authorization, $accept)

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

# **V1userwalletcoindepositunconfirmedWalletID**
> V1userwalletcoindepositunconfirmedWalletID($walletID, $authorization, $accept)

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

# **V1userwalletcoindepositunconfirmedall**
> V1userwalletcoindepositunconfirmedall($authorization, $accept)

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

# **V1userwalletcoinwallets**
> WalletsDataResponse V1userwalletcoinwallets($authorization, $accept)

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

# **V1walletwithdrawcancelled**
> WalletCoinWithdrawDataResponse V1walletwithdrawcancelled($authorization, $accept)

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

# **V1walletwithdrawcompleted**
> WalletCoinWithdrawDataResponse V1walletwithdrawcompleted($authorization, $accept)

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

# **V1walletwithdrawunverified**
> WalletCoinWithdrawDataResponse V1walletwithdrawunverified($authorization, $accept)

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

# **V1walletwithdrawverified**
> WalletCoinWithdrawDataResponse V1walletwithdrawverified($authorization, $accept)

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

