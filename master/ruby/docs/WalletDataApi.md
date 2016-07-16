# SwaggerClient::WalletDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userwalletcoinaddress_wallet_id**](WalletDataApi.md#v1userwalletcoinaddress_wallet_id) | **GET** /v1/user/wallet/coin/address/{walletID} | Wallet Bitcoin Addresses
[**v1userwalletcoindepositconfirmed_wallet_id**](WalletDataApi.md#v1userwalletcoindepositconfirmed_wallet_id) | **GET** /v1/user/wallet/coin/deposit/confirmed/{walletID} | Confirmed Wallet Transactions
[**v1userwalletcoindepositconfirmedall**](WalletDataApi.md#v1userwalletcoindepositconfirmedall) | **GET** /v1/user/wallet/coin/deposit/confirmed/all | Confirmed Wallet Deposit
[**v1userwalletcoindepositunconfirmed_wallet_id**](WalletDataApi.md#v1userwalletcoindepositunconfirmed_wallet_id) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/{walletID} | Unconfirmed Transactions in Wallet
[**v1userwalletcoindepositunconfirmedall**](WalletDataApi.md#v1userwalletcoindepositunconfirmedall) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/all | All Unconfirmed Deposits
[**v1userwalletcoinwallets**](WalletDataApi.md#v1userwalletcoinwallets) | **GET** /v1/user/wallet/coin/wallets | Wallet Details
[**v1walletwithdrawcancelled**](WalletDataApi.md#v1walletwithdrawcancelled) | **GET** /v1/wallet/coin/withdraw/cancelled | Cancelled Coin Withdrawals
[**v1walletwithdrawcompleted**](WalletDataApi.md#v1walletwithdrawcompleted) | **GET** /v1/wallet/coin/withdraw/completed | Completed Coin Withdrawals
[**v1walletwithdrawunverified**](WalletDataApi.md#v1walletwithdrawunverified) | **GET** /v1/wallet/coin/withdraw/unverified | Unverified Coin Withdrawals
[**v1walletwithdrawverified**](WalletDataApi.md#v1walletwithdrawverified) | **GET** /v1/wallet/coin/withdraw/verified | Verified Coin Withdrawals


# **v1userwalletcoinaddress_wallet_id**
> WalletAddressDataResponse v1userwalletcoinaddress_wallet_id(wallet_id, opts)

Wallet Bitcoin Addresses

Gets a List of Users Bitcoin Deposit Addresses.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletDataApi.new

wallet_id = "wallet_id_example" # String | 

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Wallet Bitcoin Addresses
  result = api_instance.v1userwalletcoinaddress_wallet_id(wallet_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletDataApi->v1userwalletcoinaddress_wallet_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | **String**|  | 
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletcoindepositconfirmed_wallet_id**
> WalletAddressDataResponse v1userwalletcoindepositconfirmed_wallet_id(wallet_id, opts)

Confirmed Wallet Transactions

Gets your Confirmed Wallet Bitcoin Transactions.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletDataApi.new

wallet_id = "wallet_id_example" # String | 

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Confirmed Wallet Transactions
  result = api_instance.v1userwalletcoindepositconfirmed_wallet_id(wallet_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletDataApi->v1userwalletcoindepositconfirmed_wallet_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | **String**|  | 
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletcoindepositconfirmedall**
> WalletAddressDataResponse v1userwalletcoindepositconfirmedall(opts)

Confirmed Wallet Deposit

Gets the total confirmed transactions across all accounts and addresses

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletDataApi.new

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Confirmed Wallet Deposit
  result = api_instance.v1userwalletcoindepositconfirmedall(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletDataApi->v1userwalletcoindepositconfirmedall: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletcoindepositunconfirmed_wallet_id**
> v1userwalletcoindepositunconfirmed_wallet_id(wallet_id, authorization, opts)

Unconfirmed Transactions in Wallet

Gets the unconfirmed transactions on an account/ wallet.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletDataApi.new

wallet_id = "wallet_id_example" # String | 

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Unconfirmed Transactions in Wallet
  api_instance.v1userwalletcoindepositunconfirmed_wallet_id(wallet_id, authorization, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletDataApi->v1userwalletcoindepositunconfirmed_wallet_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | **String**|  | 
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletcoindepositunconfirmedall**
> v1userwalletcoindepositunconfirmedall(opts)

All Unconfirmed Deposits

Gets the total unconfirmed transactions across all accounts and addresses

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletDataApi.new

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #All Unconfirmed Deposits
  api_instance.v1userwalletcoindepositunconfirmedall(opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletDataApi->v1userwalletcoindepositunconfirmedall: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletcoinwallets**
> WalletsDataResponse v1userwalletcoinwallets(opts)

Wallet Details

Gets a List of Users Wallets.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletDataApi.new

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Wallet Details
  result = api_instance.v1userwalletcoinwallets(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletDataApi->v1userwalletcoinwallets: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletsDataResponse**](WalletsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1walletwithdrawcancelled**
> WalletCoinWithdrawDataResponse v1walletwithdrawcancelled(authorization, opts)

Cancelled Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancelled Coin Withdrawals
  result = api_instance.v1walletwithdrawcancelled(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletDataApi->v1walletwithdrawcancelled: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1walletwithdrawcompleted**
> WalletCoinWithdrawDataResponse v1walletwithdrawcompleted(authorization, opts)

Completed Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Completed Coin Withdrawals
  result = api_instance.v1walletwithdrawcompleted(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletDataApi->v1walletwithdrawcompleted: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1walletwithdrawunverified**
> WalletCoinWithdrawDataResponse v1walletwithdrawunverified(authorization, opts)

Unverified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Unverified Coin Withdrawals
  result = api_instance.v1walletwithdrawunverified(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletDataApi->v1walletwithdrawunverified: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1walletwithdrawverified**
> WalletCoinWithdrawDataResponse v1walletwithdrawverified(authorization, opts)

Verified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletDataApi.new

authorization = "authorization_example" # String | API object to be added

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Verified Coin Withdrawals
  result = api_instance.v1walletwithdrawverified(authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletDataApi->v1walletwithdrawverified: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



