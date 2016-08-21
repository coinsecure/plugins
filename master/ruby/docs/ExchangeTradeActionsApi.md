# SwaggerClient::ExchangeTradeActionsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangeaskcancel_order_id**](ExchangeTradeActionsApi.md#v1userexchangeaskcancel_order_id) | **DELETE** /v1/user/exchange/ask/cancel/{orderID} | Cancel Open Sell Order
[**v1userexchangeasknew**](ExchangeTradeActionsApi.md#v1userexchangeasknew) | **PUT** /v1/user/exchange/ask/new | BTC Sell Order
[**v1userexchangebidcancel_order_id**](ExchangeTradeActionsApi.md#v1userexchangebidcancel_order_id) | **DELETE** /v1/user/exchange/bid/cancel/{orderID} | Cancel Open Buy Order
[**v1userexchangebidnew**](ExchangeTradeActionsApi.md#v1userexchangebidnew) | **PUT** /v1/user/exchange/bid/new | BTC Buy Order
[**v1userexchangeinstantbuy**](ExchangeTradeActionsApi.md#v1userexchangeinstantbuy) | **PUT** /v1/user/exchange/instant/buy | Instantly Buy BTC
[**v1userexchangeinstantsell**](ExchangeTradeActionsApi.md#v1userexchangeinstantsell) | **PUT** /v1/user/exchange/instant/sell | Instantly Sell BTC


# **v1userexchangeaskcancel_order_id**
> SuccessCancelDataResponse v1userexchangeaskcancel_order_id(order_id, opts)

Cancel Open Sell Order

Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeActionsApi.new

order_id = "order_id_example" # String | 

opts = { 
  authorization: "authorization_example" # String | Enter a valid Api Key.
}

begin
  #Cancel Open Sell Order
  result = api_instance.v1userexchangeaskcancel_order_id(order_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeActionsApi->v1userexchangeaskcancel_order_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **String**|  | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 

### Return type

[**SuccessCancelDataResponse**](SuccessCancelDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangeasknew**
> SuccessOrderDataResponse v1userexchangeasknew(body, opts)

BTC Sell Order

Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeActionsApi.new

body = SwaggerClient::RateVolData.new # RateVolData | Please send the form with valid inputs.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #BTC Sell Order
  result = api_instance.v1userexchangeasknew(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeActionsApi->v1userexchangeasknew: #{e}"
end
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



# **v1userexchangebidcancel_order_id**
> SuccessCancelDataResponse v1userexchangebidcancel_order_id(order_id, opts)

Cancel Open Buy Order

Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeActionsApi.new

order_id = "order_id_example" # String | 

opts = { 
  authorization: "authorization_example" # String | Enter a valid Api Key.
}

begin
  #Cancel Open Buy Order
  result = api_instance.v1userexchangebidcancel_order_id(order_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeActionsApi->v1userexchangebidcancel_order_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **String**|  | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 

### Return type

[**SuccessCancelDataResponse**](SuccessCancelDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebidnew**
> SuccessOrderDataResponse v1userexchangebidnew(body, opts)

BTC Buy Order

Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeActionsApi.new

body = SwaggerClient::RateVolData.new # RateVolData | Please send the form with valid inputs.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #BTC Buy Order
  result = api_instance.v1userexchangebidnew(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeActionsApi->v1userexchangebidnew: #{e}"
end
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



# **v1userexchangeinstantbuy**
> SuccessOrderDataResponse v1userexchangeinstantbuy(body, opts)

Instantly Buy BTC

Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeActionsApi.new

body = SwaggerClient::MinFiat.new # MinFiat | Please send the form with valid inputs.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Instantly Buy BTC
  result = api_instance.v1userexchangeinstantbuy(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeActionsApi->v1userexchangeinstantbuy: #{e}"
end
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



# **v1userexchangeinstantsell**
> SuccessOrderDataResponse v1userexchangeinstantsell(body, opts)

Instantly Sell BTC

Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeActionsApi.new

body = SwaggerClient::MaxVol.new # MaxVol | Please send the form with valid inputs.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Instantly Sell BTC
  result = api_instance.v1userexchangeinstantsell(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeActionsApi->v1userexchangeinstantsell: #{e}"
end
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



