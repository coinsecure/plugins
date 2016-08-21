# \ExchangeTradeDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1exchangeasklow**](ExchangeTradeDataApi.md#V1exchangeasklow) | **Get** /v1/exchange/ask/low | Lowest Ask
[**V1exchangeaskorders**](ExchangeTradeDataApi.md#V1exchangeaskorders) | **Get** /v1/exchange/ask/orders | All Sell Orders
[**V1exchangebidhigh**](ExchangeTradeDataApi.md#V1exchangebidhigh) | **Get** /v1/exchange/bid/high | Returns the Highest Bid in the Order Book
[**V1exchangebidorders**](ExchangeTradeDataApi.md#V1exchangebidorders) | **Get** /v1/exchange/bid/orders | All Buy Orders
[**V1exchangelastTrade**](ExchangeTradeDataApi.md#V1exchangelastTrade) | **Get** /v1/exchange/lastTrade | Last Trade
[**V1exchangemax24Hr**](ExchangeTradeDataApi.md#V1exchangemax24Hr) | **Get** /v1/exchange/max24Hr | Max 24 Hour Rate
[**V1exchangemin24Hr**](ExchangeTradeDataApi.md#V1exchangemin24Hr) | **Get** /v1/exchange/min24Hr | Min 24 Hour Rate
[**V1exchangeticker**](ExchangeTradeDataApi.md#V1exchangeticker) | **Get** /v1/exchange/ticker | Exchange Ticker
[**V1userexchangeaskcancelled**](ExchangeTradeDataApi.md#V1userexchangeaskcancelled) | **Get** /v1/user/exchange/ask/cancelled | Cancelled User Sell Orders
[**V1userexchangeaskcompleted**](ExchangeTradeDataApi.md#V1userexchangeaskcompleted) | **Get** /v1/user/exchange/ask/completed | Completed User Sell Orders
[**V1userexchangeaskpending**](ExchangeTradeDataApi.md#V1userexchangeaskpending) | **Get** /v1/user/exchange/ask/pending | Pending User Sell Orders
[**V1userexchangebidcancelled**](ExchangeTradeDataApi.md#V1userexchangebidcancelled) | **Get** /v1/user/exchange/bid/cancelled | Cancelled User Buy Orders
[**V1userexchangebidcompleted**](ExchangeTradeDataApi.md#V1userexchangebidcompleted) | **Get** /v1/user/exchange/bid/completed | Completed User Buy Orders
[**V1userexchangebidpending**](ExchangeTradeDataApi.md#V1userexchangebidpending) | **Get** /v1/user/exchange/bid/pending | Pending User Buy Orders


# **V1exchangeasklow**
> RateDataResponse V1exchangeasklow($accept)

Lowest Ask

Returns the Lowest Ask Rate in Json. The Amount is in Paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1exchangeaskorders**
> RateVolDataResponse V1exchangeaskorders($accept)

All Sell Orders

Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateVolDataResponse**](RateVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1exchangebidhigh**
> RateDataResponse V1exchangebidhigh($accept)

Returns the Highest Bid in the Order Book

Highest Bid.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1exchangebidorders**
> RateVolDataResponse V1exchangebidorders($accept)

All Buy Orders

Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateVolDataResponse**](RateVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1exchangelastTrade**
> LastTradeDataResponse V1exchangelastTrade($accept)

Last Trade

Returns a summary of data from the Exchange.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**LastTradeDataResponse**](LastTradeDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1exchangemax24Hr**
> RateDiffDataResponse V1exchangemax24Hr($accept)

Max 24 Hour Rate

Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDiffDataResponse**](RateDiffDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1exchangemin24Hr**
> RateDiffDataResponse V1exchangemin24Hr($accept)

Min 24 Hour Rate

Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDiffDataResponse**](RateDiffDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1exchangeticker**
> StandardTickerResultData V1exchangeticker($accept)

Exchange Ticker

Returns a summary of data from the Exchange.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**StandardTickerResultData**](StandardTickerResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangeaskcancelled**
> OrderDataResponse V1userexchangeaskcancelled($authorization, $accept)

Cancelled User Sell Orders

Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangeaskcompleted**
> OrderDataResponse V1userexchangeaskcompleted($authorization, $from, $to, $max, $offset, $accept)

Completed User Sell Orders

Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.


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

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangeaskpending**
> OrderDataResponse V1userexchangeaskpending($authorization, $accept)

Pending User Sell Orders

Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebidcancelled**
> OrderDataResponse V1userexchangebidcancelled($authorization, $accept)

Cancelled User Buy Orders

Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebidcompleted**
> OrderDataResponse V1userexchangebidcompleted($authorization, $accept)

Completed User Buy Orders

Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebidpending**
> OrderDataResponse V1userexchangebidpending($authorization, $accept)

Pending User Buy Orders

Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

