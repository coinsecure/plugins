# \ExchangeBankActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1userexchangebankcoinwithdrawinitiate**](ExchangeBankActionsApi.md#V1userexchangebankcoinwithdrawinitiate) | **Post** /v1/user/exchange/bank/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**V1userexchangebankcoinwithdrawnewVerifycode**](ExchangeBankActionsApi.md#V1userexchangebankcoinwithdrawnewVerifycode) | **Post** /v1/user/exchange/bank/coin/withdraw/newVerifycode | Gets a Verification Code.
[**V1userexchangebankcoinwithdrawunverifiedcancelWithdrawID**](ExchangeBankActionsApi.md#V1userexchangebankcoinwithdrawunverifiedcancelWithdrawID) | **Delete** /v1/user/exchange/bank/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
[**V1userexchangebankcoinwithdrawverify**](ExchangeBankActionsApi.md#V1userexchangebankcoinwithdrawverify) | **Put** /v1/user/exchange/bank/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**V1userexchangebankfiataccountnew**](ExchangeBankActionsApi.md#V1userexchangebankfiataccountnew) | **Put** /v1/user/exchange/bank/fiat/account/new | New Bank Link
[**V1userexchangebankfiatdepositcancelDepositID**](ExchangeBankActionsApi.md#V1userexchangebankfiatdepositcancelDepositID) | **Delete** /v1/user/exchange/bank/fiat/deposit/cancel/{depositID} | Cancel Unverified Exchange Fiat Deposit
[**V1userexchangebankfiatdepositnew**](ExchangeBankActionsApi.md#V1userexchangebankfiatdepositnew) | **Put** /v1/user/exchange/bank/fiat/deposit/new | New Exchange Fiat Deposit
[**V1userexchangebankfiatwithdrawinitiate**](ExchangeBankActionsApi.md#V1userexchangebankfiatwithdrawinitiate) | **Post** /v1/user/exchange/bank/fiat/withdraw/initiate | Initiate Fiat Withdrawal
[**V1userexchangebankfiatwithdrawnewVerifycode**](ExchangeBankActionsApi.md#V1userexchangebankfiatwithdrawnewVerifycode) | **Post** /v1/user/exchange/bank/fiat/withdraw/newVerifycode | Gets a Fiat Verification Code.
[**V1userexchangebankfiatwithdrawunverifiedcancelWithdrawID**](ExchangeBankActionsApi.md#V1userexchangebankfiatwithdrawunverifiedcancelWithdrawID) | **Delete** /v1/user/exchange/bank/fiat/withdraw/unverified/cancel/{withdrawID} | Cancel Fiat Withdrawal
[**V1userexchangebankfiatwithdrawverify**](ExchangeBankActionsApi.md#V1userexchangebankfiatwithdrawverify) | **Put** /v1/user/exchange/bank/fiat/withdraw/verify | Verify Fiat Withdrawal


# **V1userexchangebankcoinwithdrawinitiate**
> SuccessResult V1userexchangebankcoinwithdrawinitiate($body, $authorization, $accept)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendCoin**](SendCoin.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoinwithdrawnewVerifycode**
> SuccessResult V1userexchangebankcoinwithdrawnewVerifycode($body, $authorization, $accept)

Gets a Verification Code.

Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawId**](WithdrawId.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified | 
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoinwithdrawunverifiedcancelWithdrawID**
> SuccessResult V1userexchangebankcoinwithdrawunverifiedcancelWithdrawID($withdrawID, $authorization, $accept)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawID** | **string**|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankcoinwithdrawverify**
> SuccessResult V1userexchangebankcoinwithdrawverify($body, $authorization, $accept)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiataccountnew**
> SuccessResult V1userexchangebankfiataccountnew($body, $authorization, $accept)

New Bank Link

Submits a New Bank Link on KYC Verified Accounts.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewBankForm**](NewBankForm.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatdepositcancelDepositID**
> SuccessResult V1userexchangebankfiatdepositcancelDepositID($depositID, $authorization, $accept)

Cancel Unverified Exchange Fiat Deposit

Cancels an unverified Exchange Fiat Deposit.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositID** | **string**|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatdepositnew**
> SuccessResult V1userexchangebankfiatdepositnew($body, $authorization, $accept)

New Exchange Fiat Deposit

Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewFiatBankDeposit**](NewFiatBankDeposit.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawinitiate**
> SuccessResult V1userexchangebankfiatwithdrawinitiate($body, $authorization, $accept)

Initiate Fiat Withdrawal

The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawFiat**](WithdrawFiat.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawnewVerifycode**
> SuccessResult V1userexchangebankfiatwithdrawnewVerifycode($body, $authorization, $accept)

Gets a Fiat Verification Code.

Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawId**](WithdrawId.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified | 
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawunverifiedcancelWithdrawID**
> SuccessResult V1userexchangebankfiatwithdrawunverifiedcancelWithdrawID($withdrawID, $authorization, $accept)

Cancel Fiat Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawID** | **string**|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawverify**
> SuccessResult V1userexchangebankfiatwithdrawverify($body, $authorization, $accept)

Verify Fiat Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

