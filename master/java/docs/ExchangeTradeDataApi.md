# ExchangeTradeDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1exchangeasklow**](ExchangeTradeDataApi.md#v1exchangeasklow) | **GET** /v1/exchange/ask/low | Lowest Ask
[**v1exchangeaskorders**](ExchangeTradeDataApi.md#v1exchangeaskorders) | **GET** /v1/exchange/ask/orders | All Sell Orders
[**v1exchangebidhigh**](ExchangeTradeDataApi.md#v1exchangebidhigh) | **GET** /v1/exchange/bid/high | Returns the Highest Bid in the Order Book
[**v1exchangebidorders**](ExchangeTradeDataApi.md#v1exchangebidorders) | **GET** /v1/exchange/bid/orders | All Buy Orders
[**v1exchangelastTrade**](ExchangeTradeDataApi.md#v1exchangelastTrade) | **GET** /v1/exchange/lastTrade | Last Trade
[**v1exchangemax24Hr**](ExchangeTradeDataApi.md#v1exchangemax24Hr) | **GET** /v1/exchange/max24Hr | Max 24 Hour Rate
[**v1exchangemin24Hr**](ExchangeTradeDataApi.md#v1exchangemin24Hr) | **GET** /v1/exchange/min24Hr | Min 24 Hour Rate
[**v1exchangeticker**](ExchangeTradeDataApi.md#v1exchangeticker) | **GET** /v1/exchange/ticker | Exchange Ticker
[**v1userexchangeaskcancelled**](ExchangeTradeDataApi.md#v1userexchangeaskcancelled) | **GET** /v1/user/exchange/ask/cancelled | Cancelled User Sell Orders
[**v1userexchangeaskcompleted**](ExchangeTradeDataApi.md#v1userexchangeaskcompleted) | **GET** /v1/user/exchange/ask/completed | Completed User Sell Orders
[**v1userexchangeaskpending**](ExchangeTradeDataApi.md#v1userexchangeaskpending) | **GET** /v1/user/exchange/ask/pending | Pending User Sell Orders
[**v1userexchangebidcancelled**](ExchangeTradeDataApi.md#v1userexchangebidcancelled) | **GET** /v1/user/exchange/bid/cancelled | Cancelled User Buy Orders
[**v1userexchangebidcompleted**](ExchangeTradeDataApi.md#v1userexchangebidcompleted) | **GET** /v1/user/exchange/bid/completed | Completed User Buy Orders
[**v1userexchangebidpending**](ExchangeTradeDataApi.md#v1userexchangebidpending) | **GET** /v1/user/exchange/bid/pending | Pending User Buy Orders
[**v1userexchangetrades**](ExchangeTradeDataApi.md#v1userexchangetrades) | **GET** /v1/exchange/trades | Completed Exchange Trades


<a name="v1exchangeasklow"></a>
# **v1exchangeasklow**
> RateDataResponse v1exchangeasklow(accept)

Lowest Ask

Returns the Lowest Ask Rate in Json. The Amount is in Paisa.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    RateDataResponse result = apiInstance.v1exchangeasklow(accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1exchangeasklow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1exchangeaskorders"></a>
# **v1exchangeaskorders**
> RateVolDataResponse v1exchangeaskorders(accept)

All Sell Orders

Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    RateVolDataResponse result = apiInstance.v1exchangeaskorders(accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1exchangeaskorders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**RateVolDataResponse**](RateVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1exchangebidhigh"></a>
# **v1exchangebidhigh**
> RateDataResponse v1exchangebidhigh(accept)

Returns the Highest Bid in the Order Book

Highest Bid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    RateDataResponse result = apiInstance.v1exchangebidhigh(accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1exchangebidhigh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1exchangebidorders"></a>
# **v1exchangebidorders**
> RateVolDataResponse v1exchangebidorders(accept)

All Buy Orders

Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    RateVolDataResponse result = apiInstance.v1exchangebidorders(accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1exchangebidorders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**RateVolDataResponse**](RateVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1exchangelastTrade"></a>
# **v1exchangelastTrade**
> LastTradeDataResponse v1exchangelastTrade(accept)

Last Trade

Returns a summary of data from the Exchange.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    LastTradeDataResponse result = apiInstance.v1exchangelastTrade(accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1exchangelastTrade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**LastTradeDataResponse**](LastTradeDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1exchangemax24Hr"></a>
# **v1exchangemax24Hr**
> RateDiffDataResponse v1exchangemax24Hr(accept)

Max 24 Hour Rate

Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    RateDiffDataResponse result = apiInstance.v1exchangemax24Hr(accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1exchangemax24Hr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**RateDiffDataResponse**](RateDiffDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1exchangemin24Hr"></a>
# **v1exchangemin24Hr**
> RateDiffDataResponse v1exchangemin24Hr(accept)

Min 24 Hour Rate

Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    RateDiffDataResponse result = apiInstance.v1exchangemin24Hr(accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1exchangemin24Hr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**RateDiffDataResponse**](RateDiffDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1exchangeticker"></a>
# **v1exchangeticker**
> StandardTickerResultData v1exchangeticker(accept)

Exchange Ticker

Returns a summary of data from the Exchange.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    StandardTickerResultData result = apiInstance.v1exchangeticker(accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1exchangeticker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**StandardTickerResultData**](StandardTickerResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangeaskcancelled"></a>
# **v1userexchangeaskcancelled**
> OrderDataResponse v1userexchangeaskcancelled(authorization, accept)

Cancelled User Sell Orders

Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    OrderDataResponse result = apiInstance.v1userexchangeaskcancelled(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1userexchangeaskcancelled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangeaskcompleted"></a>
# **v1userexchangeaskcompleted**
> OrderDataResponse v1userexchangeaskcompleted(authorization, from, to, max, offset, accept)

Completed User Sell Orders

Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    OrderDataResponse result = apiInstance.v1userexchangeaskcompleted(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1userexchangeaskcompleted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **from** | **Long**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **Long**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **Integer**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **Long**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangeaskpending"></a>
# **v1userexchangeaskpending**
> OrderDataResponse v1userexchangeaskpending(authorization, accept)

Pending User Sell Orders

Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    OrderDataResponse result = apiInstance.v1userexchangeaskpending(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1userexchangeaskpending");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebidcancelled"></a>
# **v1userexchangebidcancelled**
> OrderDataResponse v1userexchangebidcancelled(authorization, accept)

Cancelled User Buy Orders

Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    OrderDataResponse result = apiInstance.v1userexchangebidcancelled(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1userexchangebidcancelled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebidcompleted"></a>
# **v1userexchangebidcompleted**
> OrderDataResponse v1userexchangebidcompleted(authorization, accept)

Completed User Buy Orders

Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    OrderDataResponse result = apiInstance.v1userexchangebidcompleted(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1userexchangebidcompleted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebidpending"></a>
# **v1userexchangebidpending**
> OrderDataResponse v1userexchangebidpending(authorization, accept)

Pending User Buy Orders

Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    OrderDataResponse result = apiInstance.v1userexchangebidpending(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1userexchangebidpending");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangetrades"></a>
# **v1userexchangetrades**
> RateVolTimeTypeDataResponse v1userexchangetrades(from, to, max, offset, accept)

Completed Exchange Trades

Returns all completed Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeTradeDataApi;


ExchangeTradeDataApi apiInstance = new ExchangeTradeDataApi();
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    RateVolTimeTypeDataResponse result = apiInstance.v1userexchangetrades(from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeTradeDataApi#v1userexchangetrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **Long**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **Long**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **Integer**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **Long**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**RateVolTimeTypeDataResponse**](RateVolTimeTypeDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

