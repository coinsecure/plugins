# SwaggerClient::ExchangeTradeDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1exchangeasklow**](ExchangeTradeDataApi.md#v1exchangeasklow) | **GET** /v1/exchange/ask/low | Lowest Ask
[**v1exchangeaskorders**](ExchangeTradeDataApi.md#v1exchangeaskorders) | **GET** /v1/exchange/ask/orders | All Sell Orders
[**v1exchangebidhigh**](ExchangeTradeDataApi.md#v1exchangebidhigh) | **GET** /v1/exchange/bid/high | Returns the Highest Bid in the Order Book
[**v1exchangebidorders**](ExchangeTradeDataApi.md#v1exchangebidorders) | **GET** /v1/exchange/bid/orders | All Buy Orders
[**v1exchangelast_trade**](ExchangeTradeDataApi.md#v1exchangelast_trade) | **GET** /v1/exchange/lastTrade | Last Trade
[**v1exchangemax24_hr**](ExchangeTradeDataApi.md#v1exchangemax24_hr) | **GET** /v1/exchange/max24Hr | Max 24 Hour Rate
[**v1exchangemin24_hr**](ExchangeTradeDataApi.md#v1exchangemin24_hr) | **GET** /v1/exchange/min24Hr | Min 24 Hour Rate
[**v1exchangeticker**](ExchangeTradeDataApi.md#v1exchangeticker) | **GET** /v1/exchange/ticker | Exchange Ticker
[**v1userexchangeaskcancelled**](ExchangeTradeDataApi.md#v1userexchangeaskcancelled) | **GET** /v1/user/exchange/ask/cancelled | Cancelled User Sell Orders
[**v1userexchangeaskcompleted**](ExchangeTradeDataApi.md#v1userexchangeaskcompleted) | **GET** /v1/user/exchange/ask/completed | Completed User Sell Orders
[**v1userexchangeaskpending**](ExchangeTradeDataApi.md#v1userexchangeaskpending) | **GET** /v1/user/exchange/ask/pending | Pending User Sell Orders
[**v1userexchangebidcancelled**](ExchangeTradeDataApi.md#v1userexchangebidcancelled) | **GET** /v1/user/exchange/bid/cancelled | Cancelled User Buy Orders
[**v1userexchangebidcompleted**](ExchangeTradeDataApi.md#v1userexchangebidcompleted) | **GET** /v1/user/exchange/bid/completed | Completed User Buy Orders
[**v1userexchangebidpending**](ExchangeTradeDataApi.md#v1userexchangebidpending) | **GET** /v1/user/exchange/bid/pending | Pending User Buy Orders


# **v1exchangeasklow**
> RateDataResponse v1exchangeasklow(opts)

Lowest Ask

Returns the Lowest Ask Rate in Json. The Amount is in Paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Lowest Ask
  result = api_instance.v1exchangeasklow(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1exchangeasklow: #{e}"
end
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



# **v1exchangeaskorders**
> RateVolDataResponse v1exchangeaskorders(opts)

All Sell Orders

Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #All Sell Orders
  result = api_instance.v1exchangeaskorders(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1exchangeaskorders: #{e}"
end
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



# **v1exchangebidhigh**
> RateDataResponse v1exchangebidhigh(opts)

Returns the Highest Bid in the Order Book

Highest Bid.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Returns the Highest Bid in the Order Book
  result = api_instance.v1exchangebidhigh(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1exchangebidhigh: #{e}"
end
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



# **v1exchangebidorders**
> RateVolDataResponse v1exchangebidorders(opts)

All Buy Orders

Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #All Buy Orders
  result = api_instance.v1exchangebidorders(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1exchangebidorders: #{e}"
end
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



# **v1exchangelast_trade**
> LastTradeDataResponse v1exchangelast_trade(opts)

Last Trade

Returns a summary of data from the Exchange.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Last Trade
  result = api_instance.v1exchangelast_trade(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1exchangelast_trade: #{e}"
end
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



# **v1exchangemax24_hr**
> RateDiffDataResponse v1exchangemax24_hr(opts)

Max 24 Hour Rate

Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Max 24 Hour Rate
  result = api_instance.v1exchangemax24_hr(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1exchangemax24_hr: #{e}"
end
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



# **v1exchangemin24_hr**
> RateDiffDataResponse v1exchangemin24_hr(opts)

Min 24 Hour Rate

Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Min 24 Hour Rate
  result = api_instance.v1exchangemin24_hr(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1exchangemin24_hr: #{e}"
end
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



# **v1exchangeticker**
> StandardTickerResultData v1exchangeticker(opts)

Exchange Ticker

Returns a summary of data from the Exchange.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Exchange Ticker
  result = api_instance.v1exchangeticker(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1exchangeticker: #{e}"
end
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



# **v1userexchangeaskcancelled**
> OrderDataResponse v1userexchangeaskcancelled(authorization, opts)

Cancelled User Sell Orders

Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancelled User Sell Orders
  result = api_instance.v1userexchangeaskcancelled(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1userexchangeaskcancelled: #{e}"
end
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



# **v1userexchangeaskcompleted**
> OrderDataResponse v1userexchangeaskcompleted(authorization, opts)

Completed User Sell Orders

Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Completed User Sell Orders
  result = api_instance.v1userexchangeaskcompleted(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1userexchangeaskcompleted: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **from** | **Integer**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **Integer**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **Integer**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **Integer**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangeaskpending**
> OrderDataResponse v1userexchangeaskpending(authorization, opts)

Pending User Sell Orders

Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Pending User Sell Orders
  result = api_instance.v1userexchangeaskpending(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1userexchangeaskpending: #{e}"
end
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



# **v1userexchangebidcancelled**
> OrderDataResponse v1userexchangebidcancelled(authorization, opts)

Cancelled User Buy Orders

Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancelled User Buy Orders
  result = api_instance.v1userexchangebidcancelled(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1userexchangebidcancelled: #{e}"
end
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



# **v1userexchangebidcompleted**
> OrderDataResponse v1userexchangebidcompleted(authorization, opts)

Completed User Buy Orders

Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Completed User Buy Orders
  result = api_instance.v1userexchangebidcompleted(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1userexchangebidcompleted: #{e}"
end
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



# **v1userexchangebidpending**
> OrderDataResponse v1userexchangebidpending(authorization, opts)

Pending User Buy Orders

Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeTradeDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Pending User Buy Orders
  result = api_instance.v1userexchangebidpending(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeTradeDataApi->v1userexchangebidpending: #{e}"
end
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



