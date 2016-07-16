# \ExchangeBankActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1UserExchangeBankCoinWithdrawInitiate**](ExchangeBankActionsApi.md#V1UserExchangeBankCoinWithdrawInitiate) | **Post** /v1/user/exchange/bank/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**V1UserExchangeBankCoinWithdrawNewVerifycode**](ExchangeBankActionsApi.md#V1UserExchangeBankCoinWithdrawNewVerifycode) | **Post** /v1/user/exchange/bank/coin/withdraw/newVerifycode | Gets a Verification Code.
[**V1UserExchangeBankCoinWithdrawUnverifiedCancel**](ExchangeBankActionsApi.md#V1UserExchangeBankCoinWithdrawUnverifiedCancel) | **Delete** /v1/user/exchange/bank/coin/withdraw/unverified/cancel | Cancel Bitcoin Withdrawal
[**V1UserExchangeBankCoinWithdrawVerify**](ExchangeBankActionsApi.md#V1UserExchangeBankCoinWithdrawVerify) | **Put** /v1/user/exchange/bank/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**V1UserExchangeBankFiatAccountNew**](ExchangeBankActionsApi.md#V1UserExchangeBankFiatAccountNew) | **Put** /v1/user/exchange/bank/fiat/account/new | New Bank Link
[**V1UserExchangeBankFiatDepositCancel**](ExchangeBankActionsApi.md#V1UserExchangeBankFiatDepositCancel) | **Delete** /v1/user/exchange/bank/fiat/deposit/cancel | Cancel Unverified Exchange Fiat Deposit
[**V1UserExchangeBankFiatDepositNew**](ExchangeBankActionsApi.md#V1UserExchangeBankFiatDepositNew) | **Put** /v1/user/exchange/bank/fiat/deposit/new | New Exchange Fiat Deposit
[**V1UserExchangeBankFiatWithdrawInitiate**](ExchangeBankActionsApi.md#V1UserExchangeBankFiatWithdrawInitiate) | **Post** /v1/user/exchange/bank/fiat/withdraw/initiate | Initiate Fiat Withdrawal
[**V1UserExchangeBankFiatWithdrawNewVerifycode**](ExchangeBankActionsApi.md#V1UserExchangeBankFiatWithdrawNewVerifycode) | **Post** /v1/user/exchange/bank/fiat/withdraw/newVerifycode | Gets a Fiat Verification Code.
[**V1UserExchangeBankFiatWithdrawUnverifiedCancel**](ExchangeBankActionsApi.md#V1UserExchangeBankFiatWithdrawUnverifiedCancel) | **Delete** /v1/user/exchange/bank/fiat/withdraw/unverified/cancel | Cancel Fiat Withdrawal
[**V1UserExchangeBankFiatWithdrawVerify**](ExchangeBankActionsApi.md#V1UserExchangeBankFiatWithdrawVerify) | **Put** /v1/user/exchange/bank/fiat/withdraw/verify | Verify Fiat Withdrawal


# **V1UserExchangeBankCoinWithdrawInitiate**
> SuccessResult V1UserExchangeBankCoinWithdrawInitiate($body, $authorization, $accept)

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

# **V1UserExchangeBankCoinWithdrawNewVerifycode**
> SuccessResult V1UserExchangeBankCoinWithdrawNewVerifycode($body, $authorization, $accept)

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

# **V1UserExchangeBankCoinWithdrawUnverifiedCancel**
> SuccessResult V1UserExchangeBankCoinWithdrawUnverifiedCancel($body, $authorization, $accept)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawId**](WithdrawId.md)| You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified. | 
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

# **V1UserExchangeBankCoinWithdrawVerify**
> SuccessResult V1UserExchangeBankCoinWithdrawVerify($body, $authorization, $accept)

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

# **V1UserExchangeBankFiatAccountNew**
> SuccessResult V1UserExchangeBankFiatAccountNew($body, $authorization, $accept)

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

# **V1UserExchangeBankFiatDepositCancel**
> SuccessResult V1UserExchangeBankFiatDepositCancel($body, $authorization, $accept)

Cancel Unverified Exchange Fiat Deposit

Cancels an unverified Exchange Fiat Deposit.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DepositId**](DepositId.md)| Please send the form with valid inputs. | 
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

# **V1UserExchangeBankFiatDepositNew**
> SuccessResult V1UserExchangeBankFiatDepositNew($body, $authorization, $accept)

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

# **V1UserExchangeBankFiatWithdrawInitiate**
> SuccessResult V1UserExchangeBankFiatWithdrawInitiate($body, $authorization, $accept)

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

# **V1UserExchangeBankFiatWithdrawNewVerifycode**
> SuccessResult V1UserExchangeBankFiatWithdrawNewVerifycode($body, $authorization, $accept)

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

# **V1UserExchangeBankFiatWithdrawUnverifiedCancel**
> SuccessResult V1UserExchangeBankFiatWithdrawUnverifiedCancel($body, $authorization, $accept)

Cancel Fiat Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawId**](WithdrawId.md)| You can get the code from /v1/user/exchange/bank/fiat/withdraw/unverified. | 
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

# **V1UserExchangeBankFiatWithdrawVerify**
> SuccessResult V1UserExchangeBankFiatWithdrawVerify($body, $authorization, $accept)

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

