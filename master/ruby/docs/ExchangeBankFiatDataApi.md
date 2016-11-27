# SwaggerClient::ExchangeBankFiatDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankfiataccounts**](ExchangeBankFiatDataApi.md#v1userexchangebankfiataccounts) | **GET** /v1/user/exchange/bank/fiat/accounts | Exchange Bitcoin Deposit Addresses
[**v1userexchangebankfiatbalanceavailable**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalanceavailable) | **GET** /v1/user/exchange/bank/fiat/balance/total | Available Exchange Fiat Balance
[**v1userexchangebankfiatbalancepending**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancepending) | **GET** /v1/user/exchange/bank/fiat/balance/pending | In Trade Coin Balance
[**v1userexchangebankfiatbalancetotal**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancetotal) | **GET** /v1/user/exchange/bank/fiat/balance/available | Total Exchange Fiat Balance
[**v1userexchangebankfiatdepositcancelled**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositcancelled) | **GET** /v1/user/exchange/bank/fiat/deposit/cancelled | Cancelled Exchange Fiat Deposits
[**v1userexchangebankfiatdepositunverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositunverified) | **GET** /v1/user/exchange/bank/fiat/deposit/unverified | Unverified Exchange Fiat Deposits
[**v1userexchangebankfiatdepositverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositverified) | **GET** /v1/user/exchange/bank/fiat/deposit/verified | Verified Exchange Fiat Deposits
[**v1userexchangebankfiatwithdrawcancelled**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcancelled) | **GET** /v1/user/exchange/bank/fiat/withdraw/cancelled | Cancelled Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawcompleted**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcompleted) | **GET** /v1/user/exchange/bank/fiat/withdraw/completed | Completed Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawunverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawunverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/unverified | Unverified Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/verified | Verified Exchange Fiat Withdrawals


# **v1userexchangebankfiataccounts**
> FiatBankDataResponse v1userexchangebankfiataccounts(authorization, opts)

Exchange Bitcoin Deposit Addresses

Gets a List of Users Exchange Bitcoin Addresses.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Exchange Bitcoin Deposit Addresses
  result = api_instance.v1userexchangebankfiataccounts(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiataccounts: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatBankDataResponse**](FiatBankDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatbalanceavailable**
> RateDataResponse v1userexchangebankfiatbalanceavailable(authorization, opts)

Available Exchange Fiat Balance

Returns balance which is in Available for Trades. The response is in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Available Exchange Fiat Balance
  result = api_instance.v1userexchangebankfiatbalanceavailable(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatbalanceavailable: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatbalancepending**
> RateDataResponse v1userexchangebankfiatbalancepending(authorization, opts)

In Trade Coin Balance

Returns in-trade or pending fiat balance in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #In Trade Coin Balance
  result = api_instance.v1userexchangebankfiatbalancepending(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatbalancepending: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatbalancetotal**
> RateDataResponse v1userexchangebankfiatbalancetotal(authorization, opts)

Total Exchange Fiat Balance

Returns users total fiat balance in paisa. Pending + Available

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Total Exchange Fiat Balance
  result = api_instance.v1userexchangebankfiatbalancetotal(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatbalancetotal: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatdepositcancelled**
> FiatDepDataResponse v1userexchangebankfiatdepositcancelled(authorization, opts)

Cancelled Exchange Fiat Deposits

Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancelled Exchange Fiat Deposits
  result = api_instance.v1userexchangebankfiatdepositcancelled(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatdepositcancelled: #{e}"
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

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatdepositunverified**
> FiatDepDataResponse v1userexchangebankfiatdepositunverified(authorization, opts)

Unverified Exchange Fiat Deposits

Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Unverified Exchange Fiat Deposits
  result = api_instance.v1userexchangebankfiatdepositunverified(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatdepositunverified: #{e}"
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

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatdepositverified**
> FiatDepDataResponse v1userexchangebankfiatdepositverified(authorization, opts)

Verified Exchange Fiat Deposits

Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Verified Exchange Fiat Deposits
  result = api_instance.v1userexchangebankfiatdepositverified(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatdepositverified: #{e}"
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

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatwithdrawcancelled**
> FiatWithDataResponse v1userexchangebankfiatwithdrawcancelled(authorization, opts)

Cancelled Exchange Fiat Withdrawals

Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancelled Exchange Fiat Withdrawals
  result = api_instance.v1userexchangebankfiatwithdrawcancelled(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawcancelled: #{e}"
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

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatwithdrawcompleted**
> FiatWithDataResponse v1userexchangebankfiatwithdrawcompleted(authorization, opts)

Completed Exchange Fiat Withdrawals

Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Completed Exchange Fiat Withdrawals
  result = api_instance.v1userexchangebankfiatwithdrawcompleted(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawcompleted: #{e}"
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

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatwithdrawunverified**
> FiatWithDataResponse v1userexchangebankfiatwithdrawunverified(authorization, opts)

Unverified Exchange Fiat Withdrawals

Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Unverified Exchange Fiat Withdrawals
  result = api_instance.v1userexchangebankfiatwithdrawunverified(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawunverified: #{e}"
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

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatwithdrawverified**
> FiatWithDataResponse v1userexchangebankfiatwithdrawverified(authorization, opts)

Verified Exchange Fiat Withdrawals

Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankFiatDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  from: 0, # Integer | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  to: 9223372036854776000, # Integer | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  max: 10, # Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  offset: 0, # Integer | Offset defaults to 0 if input is invalid. (Optional)
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Verified Exchange Fiat Withdrawals
  result = api_instance.v1userexchangebankfiatwithdrawverified(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawverified: #{e}"
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

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



