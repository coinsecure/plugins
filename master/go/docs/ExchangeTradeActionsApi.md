# \ExchangeTradeActionsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1userexchangeaskcancelOrderID**](ExchangeTradeActionsApi.md#V1userexchangeaskcancelOrderID) | **Delete** /v1/user/exchange/ask/cancel/{orderID} | Cancel Open Sell Order
[**V1userexchangeasknew**](ExchangeTradeActionsApi.md#V1userexchangeasknew) | **Put** /v1/user/exchange/ask/new | BTC Sell Order
[**V1userexchangebidcancelOrderID**](ExchangeTradeActionsApi.md#V1userexchangebidcancelOrderID) | **Delete** /v1/user/exchange/bid/cancel/{orderID} | Cancel Open Buy Order
[**V1userexchangebidnew**](ExchangeTradeActionsApi.md#V1userexchangebidnew) | **Put** /v1/user/exchange/bid/new | BTC Buy Order
[**V1userexchangeinstantbuy**](ExchangeTradeActionsApi.md#V1userexchangeinstantbuy) | **Put** /v1/user/exchange/instant/buy | Instantly Buy BTC
[**V1userexchangeinstantsell**](ExchangeTradeActionsApi.md#V1userexchangeinstantsell) | **Put** /v1/user/exchange/instant/sell | Instantly Sell BTC


# **V1userexchangeaskcancelOrderID**
> SuccessCancelDataResponse V1userexchangeaskcancelOrderID($orderID, $authorization)

Cancel Open Sell Order

Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **string**|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 

### Return type

[**SuccessCancelDataResponse**](SuccessCancelDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangeasknew**
> SuccessOrderDataResponse V1userexchangeasknew($body, $authorization, $accept)

BTC Sell Order

Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateVolData**](RateVolData.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebidcancelOrderID**
> SuccessCancelDataResponse V1userexchangebidcancelOrderID($orderID, $authorization)

Cancel Open Buy Order

Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **string**|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 

### Return type

[**SuccessCancelDataResponse**](SuccessCancelDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebidnew**
> SuccessOrderDataResponse V1userexchangebidnew($body, $authorization, $accept)

BTC Buy Order

Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateVolData**](RateVolData.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangeinstantbuy**
> SuccessOrderDataResponse V1userexchangeinstantbuy($body, $authorization, $accept)

Instantly Buy BTC

Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinFiat**](MinFiat.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangeinstantsell**
> SuccessOrderDataResponse V1userexchangeinstantsell($body, $authorization, $accept)

Instantly Sell BTC

Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MaxVol**](MaxVol.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

