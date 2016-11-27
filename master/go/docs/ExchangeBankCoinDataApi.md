# \ExchangeBankCoinDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1userexchangebankcoinaddresses**](ExchangeBankCoinDataApi.md#V1userexchangebankcoinaddresses) | **Get** /v1/user/exchange/bank/coin/addresses | Exchange Coin Addresses
[**V1userexchangebankcoinbalanceavailable**](ExchangeBankCoinDataApi.md#V1userexchangebankcoinbalanceavailable) | **Get** /v1/user/exchange/bank/coin/balance/total | Available Exchange Coin Balance
[**V1userexchangebankcoinbalancepending**](ExchangeBankCoinDataApi.md#V1userexchangebankcoinbalancepending) | **Get** /v1/user/exchange/bank/coin/balance/pending | In Trade Coin Balance
[**V1userexchangebankcoinbalancetotal**](ExchangeBankCoinDataApi.md#V1userexchangebankcoinbalancetotal) | **Get** /v1/user/exchange/bank/coin/balance/available | Total Exchange Coin Balance
[**V1userexchangebankcoindepositcancelled**](ExchangeBankCoinDataApi.md#V1userexchangebankcoindepositcancelled) | **Get** /v1/user/exchange/bank/coin/deposit/cancelled | Cancelled Exchange Coin Deposits
[**V1userexchangebankcoindepositunverified**](ExchangeBankCoinDataApi.md#V1userexchangebankcoindepositunverified) | **Get** /v1/user/exchange/bank/coin/deposit/unverified | Unverified Exchange Coin Deposits
[**V1userexchangebankcoindepositverified**](ExchangeBankCoinDataApi.md#V1userexchangebankcoindepositverified) | **Get** /v1/user/exchange/bank/coin/deposit/verified | Verified Exchange Coin Deposits
[**V1userexchangebankcoinwithdrawcancelled**](ExchangeBankCoinDataApi.md#V1userexchangebankcoinwithdrawcancelled) | **Get** /v1/user/exchange/bank/coin/withdraw/cancelled | Cancelled Exchange Coin Withdrawals
[**V1userexchangebankcoinwithdrawcompleted**](ExchangeBankCoinDataApi.md#V1userexchangebankcoinwithdrawcompleted) | **Get** /v1/user/exchange/bank/coin/withdraw/completed | Completed Exchange Coin Withdrawals
[**V1userexchangebankcoinwithdrawunverified**](ExchangeBankCoinDataApi.md#V1userexchangebankcoinwithdrawunverified) | **Get** /v1/user/exchange/bank/coin/withdraw/unverified | Unverified Exchange Coin Withdrawals
[**V1userexchangebankcoinwithdrawverified**](ExchangeBankCoinDataApi.md#V1userexchangebankcoinwithdrawverified) | **Get** /v1/user/exchange/bank/coin/withdraw/verified | Verified Exchange Coin Withdrawals


# **V1userexchangebankcoinaddresses**
> TradeAddressDataResponse V1userexchangebankcoinaddresses($authorization, $accept)

Exchange Coin Addresses

Gets a List of Users Exchange Bitcoin Deposit Addresses.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**TradeAddressDataResponse**](TradeAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoinbalanceavailable**
> VolDataResponse V1userexchangebankcoinbalanceavailable($authorization, $accept)

Available Exchange Coin Balance

Returns balance which is in Available for Trades. The response is in satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoinbalancepending**
> VolDataResponse V1userexchangebankcoinbalancepending($authorization, $accept)

In Trade Coin Balance

Returns in-trade or pending coin balance in satoshi.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoinbalancetotal**
> VolDataResponse V1userexchangebankcoinbalancetotal($authorization, $accept)

Total Exchange Coin Balance

Returns users total coin balance in satoshis. Pending + Available


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoindepositcancelled**
> CoinDepDataResponse V1userexchangebankcoindepositcancelled($authorization, $from, $to, $max, $offset, $accept)

Cancelled Exchange Coin Deposits

Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.


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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoindepositunverified**
> CoinDepDataResponse V1userexchangebankcoindepositunverified($authorization, $from, $to, $max, $offset, $accept)

Unverified Exchange Coin Deposits

Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.


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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoindepositverified**
> CoinDepDataResponse V1userexchangebankcoindepositverified($authorization, $from, $to, $max, $offset, $accept)

Verified Exchange Coin Deposits

Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.


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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoinwithdrawcancelled**
> TradeCoinWithdrawDataResponse V1userexchangebankcoinwithdrawcancelled($authorization, $from, $to, $max, $offset, $accept)

Cancelled Exchange Coin Withdrawals

Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.


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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoinwithdrawcompleted**
> TradeCoinWithdrawDataResponse V1userexchangebankcoinwithdrawcompleted($authorization, $from, $to, $max, $offset, $accept)

Completed Exchange Coin Withdrawals

Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.


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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoinwithdrawunverified**
> TradeCoinWithdrawDataResponse V1userexchangebankcoinwithdrawunverified($authorization, $from, $to, $max, $offset, $accept)

Unverified Exchange Coin Withdrawals

Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.


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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoinwithdrawverified**
> TradeCoinWithdrawDataResponse V1userexchangebankcoinwithdrawverified($authorization, $from, $to, $max, $offset, $accept)

Verified Exchange Coin Withdrawals

Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.


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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

