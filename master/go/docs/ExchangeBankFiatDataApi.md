# \ExchangeBankFiatDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1userexchangebankfiataccounts**](ExchangeBankFiatDataApi.md#V1userexchangebankfiataccounts) | **Get** /v1/user/exchange/bank/fiat/accounts | Exchange Bitcoin Deposit Addresses
[**V1userexchangebankfiatbalanceavailable**](ExchangeBankFiatDataApi.md#V1userexchangebankfiatbalanceavailable) | **Get** /v1/user/exchange/bank/fiat/balance/total | Available Exchange Fiat Balance
[**V1userexchangebankfiatbalancepending**](ExchangeBankFiatDataApi.md#V1userexchangebankfiatbalancepending) | **Get** /v1/user/exchange/bank/fiat/balance/pending | In Trade Coin Balance
[**V1userexchangebankfiatbalancetotal**](ExchangeBankFiatDataApi.md#V1userexchangebankfiatbalancetotal) | **Get** /v1/user/exchange/bank/fiat/balance/available | Total Exchange Fiat Balance
[**V1userexchangebankfiatdepositcancelled**](ExchangeBankFiatDataApi.md#V1userexchangebankfiatdepositcancelled) | **Get** /v1/user/exchange/bank/fiat/deposit/cancelled | Cancelled Exchange Fiat Deposits
[**V1userexchangebankfiatdepositunverified**](ExchangeBankFiatDataApi.md#V1userexchangebankfiatdepositunverified) | **Get** /v1/user/exchange/bank/fiat/deposit/unverified | Unverified Exchange Fiat Deposits
[**V1userexchangebankfiatdepositverified**](ExchangeBankFiatDataApi.md#V1userexchangebankfiatdepositverified) | **Get** /v1/user/exchange/bank/fiat/deposit/verified | Verified Exchange Fiat Deposits
[**V1userexchangebankfiatwithdrawcancelled**](ExchangeBankFiatDataApi.md#V1userexchangebankfiatwithdrawcancelled) | **Get** /v1/user/exchange/bank/fiat/withdraw/cancelled | Cancelled Exchange Fiat Withdrawals
[**V1userexchangebankfiatwithdrawcompleted**](ExchangeBankFiatDataApi.md#V1userexchangebankfiatwithdrawcompleted) | **Get** /v1/user/exchange/bank/fiat/withdraw/completed | Completed Exchange Fiat Withdrawals
[**V1userexchangebankfiatwithdrawunverified**](ExchangeBankFiatDataApi.md#V1userexchangebankfiatwithdrawunverified) | **Get** /v1/user/exchange/bank/fiat/withdraw/unverified | Unverified Exchange Fiat Withdrawals
[**V1userexchangebankfiatwithdrawverified**](ExchangeBankFiatDataApi.md#V1userexchangebankfiatwithdrawverified) | **Get** /v1/user/exchange/bank/fiat/withdraw/verified | Verified Exchange Fiat Withdrawals


# **V1userexchangebankfiataccounts**
> FiatBankDataResponse V1userexchangebankfiataccounts($authorization, $accept)

Exchange Bitcoin Deposit Addresses

Gets a List of Users Exchange Bitcoin Addresses.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatBankDataResponse**](FiatBankDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatbalanceavailable**
> RateDataResponse V1userexchangebankfiatbalanceavailable($authorization, $accept)

Available Exchange Fiat Balance

Returns balance which is in Available for Trades. The response is in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatbalancepending**
> RateDataResponse V1userexchangebankfiatbalancepending($authorization, $accept)

In Trade Coin Balance

Returns in-trade or pending fiat balance in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatbalancetotal**
> RateDataResponse V1userexchangebankfiatbalancetotal($authorization, $accept)

Total Exchange Fiat Balance

Returns users total fiat balance in paisa. Pending + Available


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatdepositcancelled**
> FiatDepDataResponse V1userexchangebankfiatdepositcancelled($authorization, $from, $to, $max, $offset, $accept)

Cancelled Exchange Fiat Deposits

Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **int64**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int64**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int32**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int64**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatdepositunverified**
> FiatDepDataResponse V1userexchangebankfiatdepositunverified($authorization, $from, $to, $max, $offset, $accept)

Unverified Exchange Fiat Deposits

Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **int64**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int64**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int32**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int64**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatdepositverified**
> FiatDepDataResponse V1userexchangebankfiatdepositverified($authorization, $from, $to, $max, $offset, $accept)

Verified Exchange Fiat Deposits

Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **int64**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int64**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int32**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int64**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawcancelled**
> FiatWithDataResponse V1userexchangebankfiatwithdrawcancelled($authorization, $from, $to, $max, $offset, $accept)

Cancelled Exchange Fiat Withdrawals

Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **int64**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int64**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int32**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int64**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawcompleted**
> FiatWithDataResponse V1userexchangebankfiatwithdrawcompleted($authorization, $from, $to, $max, $offset, $accept)

Completed Exchange Fiat Withdrawals

Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **int64**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int64**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int32**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int64**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawunverified**
> FiatWithDataResponse V1userexchangebankfiatwithdrawunverified($authorization, $from, $to, $max, $offset, $accept)

Unverified Exchange Fiat Withdrawals

Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **int64**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int64**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int32**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int64**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawverified**
> FiatWithDataResponse V1userexchangebankfiatwithdrawverified($authorization, $from, $to, $max, $offset, $accept)

Verified Exchange Fiat Withdrawals

Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **int64**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int64**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int32**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int64**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

