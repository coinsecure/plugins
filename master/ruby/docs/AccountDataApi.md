# SwaggerClient::AccountDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1exchangebanksummary**](AccountDataApi.md#v1exchangebanksummary) | **GET** /v1/user/exchange/bank/summary | Exchange Bank Summary
[**v1exchangeusercoinfee**](AccountDataApi.md#v1exchangeusercoinfee) | **GET** /v1/user/exchange/coin/fee | Users Coin Fee Percentage
[**v1exchangeuserfiatfee**](AccountDataApi.md#v1exchangeuserfiatfee) | **GET** /v1/user/exchange/fiat/fee | Users Fiat Fee Percentage
[**v1netkisearch_netki_name**](AccountDataApi.md#v1netkisearch_netki_name) | **GET** /v1/netki/search/{netkiName} | Coinsecure.me Netki Lookup
[**v1userexchangekycs**](AccountDataApi.md#v1userexchangekycs) | **GET** /v1/user/exchange/kycs | Gets KYC Status Details
[**v1userexchangereferralcoinpaid**](AccountDataApi.md#v1userexchangereferralcoinpaid) | **GET** /v1/user/exchange/referral/coin/paid | Users Paid Fiat Referrals
[**v1userexchangereferralcoinsuccessful**](AccountDataApi.md#v1userexchangereferralcoinsuccessful) | **GET** /v1/user/exchange/referral/coin/successful | Gets Users Successful Referral Links
[**v1userexchangereferralfiatpaid**](AccountDataApi.md#v1userexchangereferralfiatpaid) | **GET** /v1/user/exchange/referral/fiat/paid | Users Paid Fiat Referrals
[**v1userexchangereferrals**](AccountDataApi.md#v1userexchangereferrals) | **GET** /v1/user/exchange/referrals | Gets Users Referral Links
[**v1userexchangetradesummary**](AccountDataApi.md#v1userexchangetradesummary) | **GET** /v1/user/exchange/trade/summary | Exchange Trade Summary
[**v1userlogintoken_token**](AccountDataApi.md#v1userlogintoken_token) | **GET** /v1/user/login/token/{token} | Login Token Email
[**v1usersummary**](AccountDataApi.md#v1usersummary) | **GET** /v1/user/summary | Exchange Bank Summary
[**v1userwalletsummary**](AccountDataApi.md#v1userwalletsummary) | **GET** /v1/user/wallet/summary | Exchange Bank Summary


# **v1exchangebanksummary**
> BankSummaryDataResponse v1exchangebanksummary(authorization, opts)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Exchange Bank Summary
  result = api_instance.v1exchangebanksummary(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1exchangebanksummary: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**BankSummaryDataResponse**](BankSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1exchangeusercoinfee**
> DoubleDataResponse v1exchangeusercoinfee(opts)

Users Coin Fee Percentage

Returns the users coin fee percentage. The response is in percentage.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Users Coin Fee Percentage
  result = api_instance.v1exchangeusercoinfee(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1exchangeusercoinfee: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1exchangeuserfiatfee**
> DoubleDataResponse v1exchangeuserfiatfee(authorization, opts)

Users Fiat Fee Percentage

Returns the users fiat fee percentage. The response is in percentage.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Users Fiat Fee Percentage
  result = api_instance.v1exchangeuserfiatfee(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1exchangeuserfiatfee: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1netkisearch_netki_name**
> DoubleDataResponse v1netkisearch_netki_name(netki_name, opts)

Coinsecure.me Netki Lookup

Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

netki_name = "netki_name_example" # String | 

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Coinsecure.me Netki Lookup
  result = api_instance.v1netkisearch_netki_name(netki_name, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1netkisearch_netki_name: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netki_name** | **String**|  | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangekycs**
> KYCDataResponse v1userexchangekycs(authorization, opts)

Gets KYC Status Details

Gets Users KYC Status Details.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Gets KYC Status Details
  result = api_instance.v1userexchangekycs(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1userexchangekycs: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**KYCDataResponse**](KYCDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangereferralcoinpaid**
> SuccCoinRefDataResponse v1userexchangereferralcoinpaid(authorization, opts)

Users Paid Fiat Referrals

Returns the Users Paid Coin Referrals.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Users Paid Fiat Referrals
  result = api_instance.v1userexchangereferralcoinpaid(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1userexchangereferralcoinpaid: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccCoinRefDataResponse**](SuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangereferralcoinsuccessful**
> SuccRefDataResponse v1userexchangereferralcoinsuccessful(authorization, opts)

Gets Users Successful Referral Links

Gets Users Successful Referral Links that can be used during signup.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Gets Users Successful Referral Links
  result = api_instance.v1userexchangereferralcoinsuccessful(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1userexchangereferralcoinsuccessful: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccRefDataResponse**](SuccRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangereferralfiatpaid**
> SuccCoinRefDataResponse v1userexchangereferralfiatpaid(authorization, opts)

Users Paid Fiat Referrals

Returns the Users Paid Fiat Referrals.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Users Paid Fiat Referrals
  result = api_instance.v1userexchangereferralfiatpaid(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1userexchangereferralfiatpaid: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccCoinRefDataResponse**](SuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangereferrals**
> AllRefDataResponse v1userexchangereferrals(authorization, opts)

Gets Users Referral Links

Gets Users Referral Links that can be used during signup.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Gets Users Referral Links
  result = api_instance.v1userexchangereferrals(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1userexchangereferrals: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**AllRefDataResponse**](AllRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangetradesummary**
> TradeSummaryDataResponse v1userexchangetradesummary(authorization, opts)

Exchange Trade Summary

Gets a Summary of Exchange Trade Data.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Exchange Trade Summary
  result = api_instance.v1userexchangetradesummary(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1userexchangetradesummary: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**TradeSummaryDataResponse**](TradeSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userlogintoken_token**
> SuccessResult v1userlogintoken_token(token, opts)

Login Token Email

Retrieves details of a Login Token

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

token = "token_example" # String | 

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Login Token Email
  result = api_instance.v1userlogintoken_token(token, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1userlogintoken_token: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1usersummary**
> UserSummaryDataResponse v1usersummary(authorization, opts)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Exchange Bank Summary
  result = api_instance.v1usersummary(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1usersummary: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**UserSummaryDataResponse**](UserSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletsummary**
> WalletSummaryDataResponse v1userwalletsummary(authorization, opts)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Exchange Bank Summary
  result = api_instance.v1userwalletsummary(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountDataApi->v1userwalletsummary: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletSummaryDataResponse**](WalletSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



