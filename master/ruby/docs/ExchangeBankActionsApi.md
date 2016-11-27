# SwaggerClient::ExchangeBankActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankcoinwithdrawinitiate**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawinitiate) | **POST** /v1/user/exchange/bank/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**v1userexchangebankcoinwithdrawnew_verifycode**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawnew_verifycode) | **POST** /v1/user/exchange/bank/coin/withdraw/newVerifycode | Gets a Verification Code.
[**v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id) | **DELETE** /v1/user/exchange/bank/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
[**v1userexchangebankcoinwithdrawverify**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawverify) | **PUT** /v1/user/exchange/bank/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**v1userexchangebankfiataccountnew**](ExchangeBankActionsApi.md#v1userexchangebankfiataccountnew) | **PUT** /v1/user/exchange/bank/fiat/account/new | New Bank Link
[**v1userexchangebankfiatdepositcancel_deposit_id**](ExchangeBankActionsApi.md#v1userexchangebankfiatdepositcancel_deposit_id) | **DELETE** /v1/user/exchange/bank/fiat/deposit/cancel/{depositID} | Cancel Unverified Exchange Fiat Deposit
[**v1userexchangebankfiatdepositnew**](ExchangeBankActionsApi.md#v1userexchangebankfiatdepositnew) | **PUT** /v1/user/exchange/bank/fiat/deposit/new | New Exchange Fiat Deposit
[**v1userexchangebankfiatwithdrawinitiate**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawinitiate) | **POST** /v1/user/exchange/bank/fiat/withdraw/initiate | Initiate Fiat Withdrawal
[**v1userexchangebankfiatwithdrawnew_verifycode**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawnew_verifycode) | **POST** /v1/user/exchange/bank/fiat/withdraw/newVerifycode | Gets a Fiat Verification Code.
[**v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id) | **DELETE** /v1/user/exchange/bank/fiat/withdraw/unverified/cancel/{withdrawID} | Cancel Fiat Withdrawal
[**v1userexchangebankfiatwithdrawverify**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawverify) | **PUT** /v1/user/exchange/bank/fiat/withdraw/verify | Verify Fiat Withdrawal


# **v1userexchangebankcoinwithdrawinitiate**
> SuccessResult v1userexchangebankcoinwithdrawinitiate(body, opts)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

body = SwaggerClient::SendCoin.new # SendCoin | Please send the form with valid inputs.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Initiate Bitcoin Withdrawal
  result = api_instance.v1userexchangebankcoinwithdrawinitiate(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawinitiate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendCoin**](SendCoin.md)| Please send the form with valid inputs. | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoinwithdrawnew_verifycode**
> SuccessResult v1userexchangebankcoinwithdrawnew_verifycode(body, opts)

Gets a Verification Code.

Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

body = SwaggerClient::WithdrawID.new # WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/coin/withdraw/unverified

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Gets a Verification Code.
  result = api_instance.v1userexchangebankcoinwithdrawnew_verifycode(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawnew_verifycode: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawID**](WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified | 
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id**
> SuccessResult v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id(withdraw_id, opts)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

withdraw_id = "withdraw_id_example" # String | 

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancel Bitcoin Withdrawal
  result = api_instance.v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id(withdraw_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdraw_id** | **String**|  | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankcoinwithdrawverify**
> SuccessResult v1userexchangebankcoinwithdrawverify(body, opts)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

body = SwaggerClient::Code.new # Code | You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Verify Bitcoin Withdrawal
  result = api_instance.v1userexchangebankcoinwithdrawverify(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawverify: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode. | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiataccountnew**
> SuccessResult v1userexchangebankfiataccountnew(body, opts)

New Bank Link

Submits a New Bank Link on KYC Verified Accounts.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

body = SwaggerClient::NewBankForm.new # NewBankForm | Please send the form with valid inputs.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #New Bank Link
  result = api_instance.v1userexchangebankfiataccountnew(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankfiataccountnew: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewBankForm**](NewBankForm.md)| Please send the form with valid inputs. | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatdepositcancel_deposit_id**
> SuccessResult v1userexchangebankfiatdepositcancel_deposit_id(deposit_id, opts)

Cancel Unverified Exchange Fiat Deposit

Cancels an unverified Exchange Fiat Deposit.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

deposit_id = "deposit_id_example" # String | 

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancel Unverified Exchange Fiat Deposit
  result = api_instance.v1userexchangebankfiatdepositcancel_deposit_id(deposit_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatdepositcancel_deposit_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit_id** | **String**|  | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatdepositnew**
> SuccessResult v1userexchangebankfiatdepositnew(body, opts)

New Exchange Fiat Deposit

Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

body = SwaggerClient::NewFiatBankDeposit.new # NewFiatBankDeposit | Please send the form with valid inputs.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #New Exchange Fiat Deposit
  result = api_instance.v1userexchangebankfiatdepositnew(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatdepositnew: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewFiatBankDeposit**](NewFiatBankDeposit.md)| Please send the form with valid inputs. | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatwithdrawinitiate**
> SuccessResult v1userexchangebankfiatwithdrawinitiate(body, opts)

Initiate Fiat Withdrawal

The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

body = SwaggerClient::WithdrawFiat.new # WithdrawFiat | Please send the form with valid inputs.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Initiate Fiat Withdrawal
  result = api_instance.v1userexchangebankfiatwithdrawinitiate(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawinitiate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawFiat**](WithdrawFiat.md)| Please send the form with valid inputs. | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatwithdrawnew_verifycode**
> SuccessResult v1userexchangebankfiatwithdrawnew_verifycode(body, opts)

Gets a Fiat Verification Code.

Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

body = SwaggerClient::WithdrawID.new # WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/fiat/withdraw/unverified

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Gets a Fiat Verification Code.
  result = api_instance.v1userexchangebankfiatwithdrawnew_verifycode(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawnew_verifycode: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawID**](WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified | 
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id**
> SuccessResult v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id(withdraw_id, opts)

Cancel Fiat Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

withdraw_id = "withdraw_id_example" # String | 

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Cancel Fiat Withdrawal
  result = api_instance.v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id(withdraw_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdraw_id** | **String**|  | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



# **v1userexchangebankfiatwithdrawverify**
> SuccessResult v1userexchangebankfiatwithdrawverify(body, opts)

Verify Fiat Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::ExchangeBankActionsApi.new

body = SwaggerClient::Code.new # Code | You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Verify Fiat Withdrawal
  result = api_instance.v1userexchangebankfiatwithdrawverify(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawverify: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode | 
 **authorization** | **String**| Enter a valid Api Key. | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv



