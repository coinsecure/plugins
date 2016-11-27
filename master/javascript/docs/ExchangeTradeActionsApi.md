# CoinsecureApiDocumentation.ExchangeTradeActionsApi

All URIs are relative to *https://api.coinsecure.in/*

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
> SuccessCancelDataResponse v1userexchangeaskcancelOrderID(orderID, opts)

Cancel Open Sell Order

Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeTradeActionsApi();

var orderID = "orderID_example"; // String | 

var opts = { 
  'authorization': "authorization_example" // String | Enter a valid Api Key.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangeaskcancelOrderID(orderID, opts, callback);
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
> SuccessOrderDataResponse v1userexchangeasknew(body, opts)

BTC Sell Order

Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeTradeActionsApi();

var body = new CoinsecureApiDocumentation.RateVolData(); // RateVolData | Please send the form with valid inputs.

var opts = { 
  'authorization': "authorization_example", // String | Enter a valid Api Key.
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangeasknew(body, opts, callback);
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
> SuccessCancelDataResponse v1userexchangebidcancelOrderID(orderID, opts)

Cancel Open Buy Order

Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeTradeActionsApi();

var orderID = "orderID_example"; // String | 

var opts = { 
  'authorization': "authorization_example" // String | Enter a valid Api Key.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangebidcancelOrderID(orderID, opts, callback);
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
> SuccessOrderDataResponse v1userexchangebidnew(body, opts)

BTC Buy Order

Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeTradeActionsApi();

var body = new CoinsecureApiDocumentation.RateVolData(); // RateVolData | Please send the form with valid inputs.

var opts = { 
  'authorization': "authorization_example", // String | Enter a valid Api Key.
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangebidnew(body, opts, callback);
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
> SuccessOrderDataResponse v1userexchangeinstantbuy(body, opts)

Instantly Buy BTC

Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeTradeActionsApi();

var body = new CoinsecureApiDocumentation.MinFiat(); // MinFiat | Please send the form with valid inputs.

var opts = { 
  'authorization': "authorization_example", // String | Enter a valid Api Key.
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangeinstantbuy(body, opts, callback);
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
> SuccessOrderDataResponse v1userexchangeinstantsell(body, opts)

Instantly Sell BTC

Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeTradeActionsApi();

var body = new CoinsecureApiDocumentation.MaxVol(); // MaxVol | Please send the form with valid inputs.

var opts = { 
  'authorization': "authorization_example", // String | Enter a valid Api Key.
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangeinstantsell(body, opts, callback);
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

