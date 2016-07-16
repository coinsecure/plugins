# \AccountDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1ExchangeBankSummary**](AccountDataApi.md#V1ExchangeBankSummary) | **Get** /v1/user/exchange/bank/summary | Exchange Bank Summary
[**V1ExchangeUserCoinFee**](AccountDataApi.md#V1ExchangeUserCoinFee) | **Get** /v1/user/exchange/coin/fee | Users Coin Fee Percentage
[**V1ExchangeUserFiatFee**](AccountDataApi.md#V1ExchangeUserFiatFee) | **Get** /v1/user/exchange/fiat/fee | Users Fiat Fee Percentage
[**V1NetkiSearchNetkiName**](AccountDataApi.md#V1NetkiSearchNetkiName) | **Get** /v1/netki/search/{netkiName} | Coinsecure.me Netki Lookup
[**V1UserExchangeKycs**](AccountDataApi.md#V1UserExchangeKycs) | **Get** /v1/user/exchange/kycs | Gets KYC Status Details
[**V1UserExchangeReferralCoinPaid**](AccountDataApi.md#V1UserExchangeReferralCoinPaid) | **Get** /v1/user/exchange/referral/coin/paid | Users Paid Fiat Referrals
[**V1UserExchangeReferralCoinSuccessful**](AccountDataApi.md#V1UserExchangeReferralCoinSuccessful) | **Get** /v1/user/exchange/referral/coin/successful | Gets Users Successful Referral Links
[**V1UserExchangeReferralFiatPaid**](AccountDataApi.md#V1UserExchangeReferralFiatPaid) | **Get** /v1/user/exchange/referral/fiat/paid | Users Paid Fiat Referrals
[**V1UserExchangeReferrals**](AccountDataApi.md#V1UserExchangeReferrals) | **Get** /v1/user/exchange/referrals | Gets Users Referral Links
[**V1UserExchangeTradeSummary**](AccountDataApi.md#V1UserExchangeTradeSummary) | **Get** /v1/user/exchange/trade/summary | Exchange Trade Summary
[**V1UserLoginTokenToken**](AccountDataApi.md#V1UserLoginTokenToken) | **Get** /v1/user/login/token/{token} | Login Token Email
[**V1UserSummary**](AccountDataApi.md#V1UserSummary) | **Get** /v1/user/summary | Exchange Bank Summary
[**V1UserWalletSummary**](AccountDataApi.md#V1UserWalletSummary) | **Get** /v1/user/wallet/summary | Exchange Bank Summary


# **V1ExchangeBankSummary**
> BankSummaryDataResponse V1ExchangeBankSummary($authorization, $accept)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**BankSummaryDataResponse**](BankSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1ExchangeUserCoinFee**
> DoubleDataResponse V1ExchangeUserCoinFee($authorization, $accept)

Users Coin Fee Percentage

Returns the users coin fee percentage. The response is in percentage.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1ExchangeUserFiatFee**
> DoubleDataResponse V1ExchangeUserFiatFee($authorization, $accept)

Users Fiat Fee Percentage

Returns the users fiat fee percentage. The response is in percentage.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1NetkiSearchNetkiName**
> DoubleDataResponse V1NetkiSearchNetkiName($netkiName, $accept)

Coinsecure.me Netki Lookup

Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netkiName** | **string**|  | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserExchangeKycs**
> KycDataResponse V1UserExchangeKycs($authorization, $accept)

Gets KYC Status Details

Gets Users KYC Status Details.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**KycDataResponse**](KYCDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserExchangeReferralCoinPaid**
> SuccCoinRefDataResponse V1UserExchangeReferralCoinPaid($authorization, $accept)

Users Paid Fiat Referrals

Returns the Users Paid Coin Referrals.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccCoinRefDataResponse**](SuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserExchangeReferralCoinSuccessful**
> SuccRefDataResponse V1UserExchangeReferralCoinSuccessful($authorization, $accept)

Gets Users Successful Referral Links

Gets Users Successful Referral Links that can be used during signup.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccRefDataResponse**](SuccRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserExchangeReferralFiatPaid**
> SuccCoinRefDataResponse V1UserExchangeReferralFiatPaid($authorization, $accept)

Users Paid Fiat Referrals

Returns the Users Paid Fiat Referrals.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccCoinRefDataResponse**](SuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserExchangeReferrals**
> AllRefDataResponse V1UserExchangeReferrals($authorization, $accept)

Gets Users Referral Links

Gets Users Referral Links that can be used during signup.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**AllRefDataResponse**](AllRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserExchangeTradeSummary**
> TradeSummaryDataResponse V1UserExchangeTradeSummary($authorization, $accept)

Exchange Trade Summary

Gets a Summary of Exchange Trade Data.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**TradeSummaryDataResponse**](TradeSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserLoginTokenToken**
> SuccessResult V1UserLoginTokenToken($token, $accept)

Login Token Email

Retrieves details of a Login Token


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserSummary**
> UserSummaryDataResponse V1UserSummary($authorization, $accept)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**UserSummaryDataResponse**](UserSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1UserWalletSummary**
> WalletSummaryDataResponse V1UserWalletSummary($authorization, $accept)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletSummaryDataResponse**](WalletSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

