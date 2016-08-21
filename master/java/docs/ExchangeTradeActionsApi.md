# ExchangeTradeActionsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangeaskcancelOrderID**](ExchangeTradeActionsApi.md#v1userexchangeaskcancelOrderID) | **DELETE** /v1/user/exchange/ask/cancel/{orderID} | Cancel Open Sell Order
[**v1userexchangeasknew**](ExchangeTradeActionsApi.md#v1userexchangeasknew) | **PUT** /v1/user/exchange/ask/new | BTC Sell Order
[**v1userexchangebidcancelOrderID**](ExchangeTradeActionsApi.md#v1userexchangebidcancelOrderID) | **DELETE** /v1/user/exchange/bid/cancel/{orderID} | Cancel Open Buy Order
[**v1userexchangebidnew**](ExchangeTradeActionsApi.md#v1userexchangebidnew) | **PUT** /v1/user/exchange/bid/new | BTC Buy Order
[**v1userexchangeinstantbuy**](ExchangeTradeActionsApi.md#v1userexchangeinstantbuy) | **PUT** /v1/user/exchange/instant/buy | Instantly Buy BTC
[**v1userexchangeinstantsell**](ExchangeTradeActionsApi.md#v1userexchangeinstantsell) | **PUT** /v1/user/exchange/instant/sell | Instantly Sell BTC


<a name="v1userexchangeaskcancelOrderID"></a>
# **v1userexchangeaskcancelOrderID**
> SuccessCancelDataResponse v1userexchangeaskcancelOrderID(orderID, authorization)

Cancel Open Sell Order

Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeActionsApi;


ExchangeTradeActionsApi apiInstance = new ExchangeTradeActionsApi();
String orderID = "orderID_example"; // String | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
try {
    SuccessCancelDataResponse result = apiInstance.v1userexchangeaskcancelOrderID(orderID, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeActionsApi#v1userexchangeaskcancelOrderID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **String**|  |
 **authorization** | **String**| Enter a valid Api Key. | [optional]

### Return type

[**SuccessCancelDataResponse**](SuccessCancelDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangeasknew"></a>
# **v1userexchangeasknew**
> SuccessOrderDataResponse v1userexchangeasknew(body, authorization, accept)

BTC Sell Order

Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeActionsApi;


ExchangeTradeActionsApi apiInstance = new ExchangeTradeActionsApi();
RateVolData body = new RateVolData(); // RateVolData | Please send the form with valid inputs.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessOrderDataResponse result = apiInstance.v1userexchangeasknew(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeActionsApi#v1userexchangeasknew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateVolData**](RateVolData.md)| Please send the form with valid inputs. |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebidcancelOrderID"></a>
# **v1userexchangebidcancelOrderID**
> SuccessCancelDataResponse v1userexchangebidcancelOrderID(orderID, authorization)

Cancel Open Buy Order

Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeActionsApi;


ExchangeTradeActionsApi apiInstance = new ExchangeTradeActionsApi();
String orderID = "orderID_example"; // String | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
try {
    SuccessCancelDataResponse result = apiInstance.v1userexchangebidcancelOrderID(orderID, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeActionsApi#v1userexchangebidcancelOrderID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **String**|  |
 **authorization** | **String**| Enter a valid Api Key. | [optional]

### Return type

[**SuccessCancelDataResponse**](SuccessCancelDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebidnew"></a>
# **v1userexchangebidnew**
> SuccessOrderDataResponse v1userexchangebidnew(body, authorization, accept)

BTC Buy Order

Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeActionsApi;


ExchangeTradeActionsApi apiInstance = new ExchangeTradeActionsApi();
RateVolData body = new RateVolData(); // RateVolData | Please send the form with valid inputs.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessOrderDataResponse result = apiInstance.v1userexchangebidnew(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeActionsApi#v1userexchangebidnew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateVolData**](RateVolData.md)| Please send the form with valid inputs. |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangeinstantbuy"></a>
# **v1userexchangeinstantbuy**
> SuccessOrderDataResponse v1userexchangeinstantbuy(body, authorization, accept)

Instantly Buy BTC

Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeActionsApi;


ExchangeTradeActionsApi apiInstance = new ExchangeTradeActionsApi();
MinFiat body = new MinFiat(); // MinFiat | Please send the form with valid inputs.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessOrderDataResponse result = apiInstance.v1userexchangeinstantbuy(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeActionsApi#v1userexchangeinstantbuy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinFiat**](MinFiat.md)| Please send the form with valid inputs. |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangeinstantsell"></a>
# **v1userexchangeinstantsell**
> SuccessOrderDataResponse v1userexchangeinstantsell(body, authorization, accept)

Instantly Sell BTC

Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeActionsApi;


ExchangeTradeActionsApi apiInstance = new ExchangeTradeActionsApi();
MaxVol body = new MaxVol(); // MaxVol | Please send the form with valid inputs.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessOrderDataResponse result = apiInstance.v1userexchangeinstantsell(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeActionsApi#v1userexchangeinstantsell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MaxVol**](MaxVol.md)| Please send the form with valid inputs. |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

