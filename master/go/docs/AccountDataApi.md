# \AccountDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1exchangebanksummary**](AccountDataApi.md#V1exchangebanksummary) | **Get** /v1/user/exchange/bank/summary | Exchange Bank Summary
[**V1exchangeusercoinfee**](AccountDataApi.md#V1exchangeusercoinfee) | **Get** /v1/user/exchange/coin/fee | Users Coin Fee Percentage
[**V1exchangeuserfiatfee**](AccountDataApi.md#V1exchangeuserfiatfee) | **Get** /v1/user/exchange/fiat/fee | Users Fiat Fee Percentage
[**V1netkisearchNetkiName**](AccountDataApi.md#V1netkisearchNetkiName) | **Get** /v1/netki/search/{netkiName} | Coinsecure.me Netki Lookup
[**V1userexchangekycs**](AccountDataApi.md#V1userexchangekycs) | **Get** /v1/user/exchange/kycs | Gets KYC Status Details
[**V1userexchangereferralcoinpaid**](AccountDataApi.md#V1userexchangereferralcoinpaid) | **Get** /v1/user/exchange/referral/coin/paid | Users Paid Fiat Referrals
[**V1userexchangereferralcoinsuccessful**](AccountDataApi.md#V1userexchangereferralcoinsuccessful) | **Get** /v1/user/exchange/referral/coin/successful | Gets Users Successful Referral Links
[**V1userexchangereferralfiatpaid**](AccountDataApi.md#V1userexchangereferralfiatpaid) | **Get** /v1/user/exchange/referral/fiat/paid | Users Paid Fiat Referrals
[**V1userexchangereferrals**](AccountDataApi.md#V1userexchangereferrals) | **Get** /v1/user/exchange/referrals | Gets Users Referral Links
[**V1userexchangetradesummary**](AccountDataApi.md#V1userexchangetradesummary) | **Get** /v1/user/exchange/trade/summary | Exchange Trade Summary
[**V1userlogintokenToken**](AccountDataApi.md#V1userlogintokenToken) | **Get** /v1/user/login/token/{token} | Login Token Email
[**V1usersummary**](AccountDataApi.md#V1usersummary) | **Get** /v1/user/summary | Exchange Bank Summary
[**V1userwalletsummary**](AccountDataApi.md#V1userwalletsummary) | **Get** /v1/user/wallet/summary | Exchange Bank Summary


# **V1exchangebanksummary**
> BankSummaryDataResponse V1exchangebanksummary($authorization, $accept)

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

# **V1exchangeusercoinfee**
> DoubleDataResponse V1exchangeusercoinfee($authorization, $accept)

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

# **V1exchangeuserfiatfee**
> DoubleDataResponse V1exchangeuserfiatfee($authorization, $accept)

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

# **V1netkisearchNetkiName**
> DoubleDataResponse V1netkisearchNetkiName($netkiName, $accept)

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

# **V1userexchangekycs**
> KycDataResponse V1userexchangekycs($authorization, $accept)

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

# **V1userexchangereferralcoinpaid**
> SuccCoinRefDataResponse V1userexchangereferralcoinpaid($authorization, $accept)

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

# **V1userexchangereferralcoinsuccessful**
> SuccRefDataResponse V1userexchangereferralcoinsuccessful($authorization, $accept)

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

# **V1userexchangereferralfiatpaid**
> SuccCoinRefDataResponse V1userexchangereferralfiatpaid($authorization, $accept)

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

# **V1userexchangereferrals**
> AllRefDataResponse V1userexchangereferrals($authorization, $accept)

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

# **V1userexchangetradesummary**
> TradeSummaryDataResponse V1userexchangetradesummary($authorization, $accept)

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

# **V1userlogintokenToken**
> SuccessResult V1userlogintokenToken($token, $accept)

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

# **V1usersummary**
> UserSummaryDataResponse V1usersummary($authorization, $accept)

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

# **V1userwalletsummary**
> WalletSummaryDataResponse V1userwalletsummary($authorization, $accept)

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

