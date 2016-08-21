# SwaggerClient::ExchangeBankCoinDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankcoinaddresses**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinaddresses) | **GET** /v1/user/exchange/bank/coin/addresses | Exchange Coin Addresses
[**v1userexchangebankcoinbalanceavailable**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalanceavailable) | **GET** /v1/user/exchange/bank/coin/balance/total | Available Exchange Coin Balance
[**v1userexchangebankcoinbalancepending**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancepending) | **GET** /v1/user/exchange/bank/coin/balance/pending | In Trade Coin Balance
[**v1userexchangebankcoinbalancetotal**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancetotal) | **GET** /v1/user/exchange/bank/coin/balance/available | Total Exchange Coin Balance
[**v1userexchangebankcoindepositcancelled**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositcancelled) | **GET** /v1/user/exchange/bank/coin/deposit/cancelled | Cancelled Exchange Coin Deposits
[**v1userexchangebankcoindepositunverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositunverified) | **GET** /v1/user/exchange/bank/coin/deposit/unverified | Unverified Exchange Coin Deposits
[**v1userexchangebankcoindepositverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositverified) | **GET** /v1/user/exchange/bank/coin/deposit/verified | Verified Exchange Coin Deposits
[**v1userexchangebankcoinwithdrawcancelled**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcancelled) | **GET** /v1/user/exchange/bank/coin/withdraw/cancelled | Cancelled Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawcompleted**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcompleted) | **GET** /v1/user/exchange/bank/coin/withdraw/completed | Completed Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawunverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawunverified) | **GET** /v1/user/exchange/bank/coin/withdraw/unverified | Unverified Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawverified) | **GET** /v1/user/exchange/bank/coin/withdraw/verified | Verified Exchange Coin Withdrawals


# **v1userexchangebankcoinaddresses**
> TradeAddressDataResponse v1userexchangebankcoinaddresses(authorization, opts)

Exchange Coin Addresses

Gets a List of Users Exchange Bitcoin Deposit Addresses.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Exchange Coin Addresses
  result = api_instance.v1userexchangebankcoinaddresses(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinaddresses: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**TradeAddressDataResponse**](TradeAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoinbalanceavailable**
> VolDataResponse v1userexchangebankcoinbalanceavailable(authorization, opts)

Available Exchange Coin Balance

Returns balance which is in Available for Trades. The response is in satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Available Exchange Coin Balance
  result = api_instance.v1userexchangebankcoinbalanceavailable(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinbalanceavailable: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoinbalancepending**
> VolDataResponse v1userexchangebankcoinbalancepending(authorization, opts)

In Trade Coin Balance

Returns in-trade or pending coin balance in satoshi.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #In Trade Coin Balance
  result = api_instance.v1userexchangebankcoinbalancepending(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinbalancepending: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoinbalancetotal**
> VolDataResponse v1userexchangebankcoinbalancetotal(authorization, opts)

Total Exchange Coin Balance

Returns users total coin balance in satoshis. Pending + Available

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Total Exchange Coin Balance
  result = api_instance.v1userexchangebankcoinbalancetotal(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinbalancetotal: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoindepositcancelled**
> CoinDepDataResponse v1userexchangebankcoindepositcancelled(authorization, opts)

Cancelled Exchange Coin Deposits

Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancelled Exchange Coin Deposits
  result = api_instance.v1userexchangebankcoindepositcancelled(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoindepositcancelled: #{e}"
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoindepositunverified**
> CoinDepDataResponse v1userexchangebankcoindepositunverified(authorization, opts)

Unverified Exchange Coin Deposits

Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Unverified Exchange Coin Deposits
  result = api_instance.v1userexchangebankcoindepositunverified(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoindepositunverified: #{e}"
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoindepositverified**
> CoinDepDataResponse v1userexchangebankcoindepositverified(authorization, opts)

Verified Exchange Coin Deposits

Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Verified Exchange Coin Deposits
  result = api_instance.v1userexchangebankcoindepositverified(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoindepositverified: #{e}"
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoinwithdrawcancelled**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcancelled(authorization, opts)

Cancelled Exchange Coin Withdrawals

Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancelled Exchange Coin Withdrawals
  result = api_instance.v1userexchangebankcoinwithdrawcancelled(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawcancelled: #{e}"
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoinwithdrawcompleted**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcompleted(authorization, opts)

Completed Exchange Coin Withdrawals

Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Completed Exchange Coin Withdrawals
  result = api_instance.v1userexchangebankcoinwithdrawcompleted(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawcompleted: #{e}"
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoinwithdrawunverified**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawunverified(authorization, opts)

Unverified Exchange Coin Withdrawals

Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Unverified Exchange Coin Withdrawals
  result = api_instance.v1userexchangebankcoinwithdrawunverified(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawunverified: #{e}"
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoinwithdrawverified**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawverified(authorization, opts)

Verified Exchange Coin Withdrawals

Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankCoinDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Verified Exchange Coin Withdrawals
  result = api_instance.v1userexchangebankcoinwithdrawverified(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawverified: #{e}"
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



