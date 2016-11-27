# SwaggerClient::WalletActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userwalletcoinaddressnew**](WalletActionsApi.md#v1userwalletcoinaddressnew) | **PUT** /v1/user/wallet/coin/address/new | New Bitcoin Address
[**v1userwalletcoinnew**](WalletActionsApi.md#v1userwalletcoinnew) | **PUT** /v1/user/wallet/coin/new | Create New Wallet
[**v1userwalletcoinwithdrawinitiate**](WalletActionsApi.md#v1userwalletcoinwithdrawinitiate) | **POST** /v1/user/wallet/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**v1userwalletcoinwithdrawsend_to_exchange**](WalletActionsApi.md#v1userwalletcoinwithdrawsend_to_exchange) | **PUT** /v1/user/wallet/coin/withdraw/sendToExchange | Send to Exchange
[**v1userwalletcoinwithdrawunverifiedcancel_withdraw_id**](WalletActionsApi.md#v1userwalletcoinwithdrawunverifiedcancel_withdraw_id) | **DELETE** /v1/user/wallet/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
[**v1userwalletcoinwithdrawverify**](WalletActionsApi.md#v1userwalletcoinwithdrawverify) | **PUT** /v1/user/wallet/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**v1walletcoinwithdrawnew_verifycode**](WalletActionsApi.md#v1walletcoinwithdrawnew_verifycode) | **POST** /v1/wallet/coin/withdraw/newVerifycode | Gets a Verification Code


# **v1userwalletcoinaddressnew**
> WalletAddressDataResponse v1userwalletcoinaddressnew(body, opts)

New Bitcoin Address

Generates a New Bitcoin Address to store coins.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletActionsApi.new

body = SwaggerClient::NewAddress.new # NewAddress | 

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #New Bitcoin Address
  result = api_instance.v1userwalletcoinaddressnew(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletActionsApi->v1userwalletcoinaddressnew: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewAddress**](NewAddress.md)|  | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletcoinnew**
> WalletAddressDataResponse v1userwalletcoinnew(body, opts)

Create New Wallet

Creates a New wallet to store addresses. This method also creates a single default address in each new wallet.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletActionsApi.new

body = SwaggerClient::NewWallet.new # NewWallet | 

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Create New Wallet
  result = api_instance.v1userwalletcoinnew(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletActionsApi->v1userwalletcoinnew: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewWallet**](NewWallet.md)|  | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletcoinwithdrawinitiate**
> SuccessResult v1userwalletcoinwithdrawinitiate(body, opts)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletActionsApi.new

body = SwaggerClient::SendCoinWallet.new # SendCoinWallet | 

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Initiate Bitcoin Withdrawal
  result = api_instance.v1userwalletcoinwithdrawinitiate(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletActionsApi->v1userwalletcoinwithdrawinitiate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendCoinWallet**](SendCoinWallet.md)|  | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletcoinwithdrawsend_to_exchange**
> SuccessResult v1userwalletcoinwithdrawsend_to_exchange(body, opts)

Send to Exchange

This function transfers funds to yout Exchange Balance without the need for any confirmations.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletActionsApi.new

body = SwaggerClient::SendExchange.new # SendExchange | 

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Send to Exchange
  result = api_instance.v1userwalletcoinwithdrawsend_to_exchange(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletActionsApi->v1userwalletcoinwithdrawsend_to_exchange: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendExchange**](SendExchange.md)|  | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletcoinwithdrawunverifiedcancel_withdraw_id**
> SuccessResult v1userwalletcoinwithdrawunverifiedcancel_withdraw_id(withdraw_id, authorization, opts)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletActionsApi.new

withdraw_id = "withdraw_id_example" # String | 

authorization = "authorization_example" # String | Enter a valid Api Key.

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancel Bitcoin Withdrawal
  result = api_instance.v1userwalletcoinwithdrawunverifiedcancel_withdraw_id(withdraw_id, authorization, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletActionsApi->v1userwalletcoinwithdrawunverifiedcancel_withdraw_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdraw_id** | **String**|  | 
 **authorization** | **String**| Enter a valid Api Key. | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userwalletcoinwithdrawverify**
> SuccessResult v1userwalletcoinwithdrawverify(authorization, body, opts)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletActionsApi.new

authorization = "authorization_example" # String | Enter a valid Api Key.

body = SwaggerClient::Code.new # Code | 

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Verify Bitcoin Withdrawal
  result = api_instance.v1userwalletcoinwithdrawverify(authorization, body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletActionsApi->v1userwalletcoinwithdrawverify: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Enter a valid Api Key. | 
 **body** | [**Code**](Code.md)|  | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1walletcoinwithdrawnew_verifycode**
> SuccessResult v1walletcoinwithdrawnew_verifycode(body, opts)

Gets a Verification Code

Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::WalletActionsApi.new

body = SwaggerClient::WithdrawID.new # WithdrawID | You can get unverified withdraw ID's from /v1/exchange/bank/coin/withdrawVerifycode

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Gets a Verification Code
  result = api_instance.v1walletcoinwithdrawnew_verifycode(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling WalletActionsApi->v1walletcoinwithdrawnew_verifycode: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawID**](WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/exchange/bank/coin/withdrawVerifycode | 
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



