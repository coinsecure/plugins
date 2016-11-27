# ExchangeBankActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankcoinwithdrawinitiate**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawinitiate) | **POST** /v1/user/exchange/bank/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**v1userexchangebankcoinwithdrawnewVerifycode**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawnewVerifycode) | **POST** /v1/user/exchange/bank/coin/withdraw/newVerifycode | Gets a Verification Code.
[**v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID) | **DELETE** /v1/user/exchange/bank/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
[**v1userexchangebankcoinwithdrawverify**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawverify) | **PUT** /v1/user/exchange/bank/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**v1userexchangebankfiataccountnew**](ExchangeBankActionsApi.md#v1userexchangebankfiataccountnew) | **PUT** /v1/user/exchange/bank/fiat/account/new | New Bank Link
[**v1userexchangebankfiatdepositcancelDepositID**](ExchangeBankActionsApi.md#v1userexchangebankfiatdepositcancelDepositID) | **DELETE** /v1/user/exchange/bank/fiat/deposit/cancel/{depositID} | Cancel Unverified Exchange Fiat Deposit
[**v1userexchangebankfiatdepositnew**](ExchangeBankActionsApi.md#v1userexchangebankfiatdepositnew) | **PUT** /v1/user/exchange/bank/fiat/deposit/new | New Exchange Fiat Deposit
[**v1userexchangebankfiatwithdrawinitiate**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawinitiate) | **POST** /v1/user/exchange/bank/fiat/withdraw/initiate | Initiate Fiat Withdrawal
[**v1userexchangebankfiatwithdrawnewVerifycode**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawnewVerifycode) | **POST** /v1/user/exchange/bank/fiat/withdraw/newVerifycode | Gets a Fiat Verification Code.
[**v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID) | **DELETE** /v1/user/exchange/bank/fiat/withdraw/unverified/cancel/{withdrawID} | Cancel Fiat Withdrawal
[**v1userexchangebankfiatwithdrawverify**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawverify) | **PUT** /v1/user/exchange/bank/fiat/withdraw/verify | Verify Fiat Withdrawal


<a name="v1userexchangebankcoinwithdrawinitiate"></a>
# **v1userexchangebankcoinwithdrawinitiate**
> SuccessResult v1userexchangebankcoinwithdrawinitiate(body, authorization, accept)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
SendCoin body = new SendCoin(); // SendCoin | Please send the form with valid inputs.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankcoinwithdrawinitiate(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankcoinwithdrawinitiate");
    e.printStackTrace();
}
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

<a name="v1userexchangebankcoinwithdrawnewVerifycode"></a>
# **v1userexchangebankcoinwithdrawnewVerifycode**
> SuccessResult v1userexchangebankcoinwithdrawnewVerifycode(body, authorization, accept)

Gets a Verification Code.

Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
WithdrawID body = new WithdrawID(); // WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/coin/withdraw/unverified
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankcoinwithdrawnewVerifycode(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankcoinwithdrawnewVerifycode");
    e.printStackTrace();
}
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

<a name="v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID"></a>
# **v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID**
> SuccessResult v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID(withdrawID, authorization, accept)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
String withdrawID = "withdrawID_example"; // String | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID(withdrawID, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawID** | **String**|  |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoinwithdrawverify"></a>
# **v1userexchangebankcoinwithdrawverify**
> SuccessResult v1userexchangebankcoinwithdrawverify(body, authorization, accept)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
Code body = new Code(); // Code | You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankcoinwithdrawverify(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankcoinwithdrawverify");
    e.printStackTrace();
}
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

<a name="v1userexchangebankfiataccountnew"></a>
# **v1userexchangebankfiataccountnew**
> SuccessResult v1userexchangebankfiataccountnew(body, authorization, accept)

New Bank Link

Submits a New Bank Link on KYC Verified Accounts.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
NewBankForm body = new NewBankForm(); // NewBankForm | Please send the form with valid inputs.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankfiataccountnew(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankfiataccountnew");
    e.printStackTrace();
}
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

<a name="v1userexchangebankfiatdepositcancelDepositID"></a>
# **v1userexchangebankfiatdepositcancelDepositID**
> SuccessResult v1userexchangebankfiatdepositcancelDepositID(depositID, authorization, accept)

Cancel Unverified Exchange Fiat Deposit

Cancels an unverified Exchange Fiat Deposit.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
String depositID = "depositID_example"; // String | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankfiatdepositcancelDepositID(depositID, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankfiatdepositcancelDepositID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositID** | **String**|  |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatdepositnew"></a>
# **v1userexchangebankfiatdepositnew**
> SuccessResult v1userexchangebankfiatdepositnew(body, authorization, accept)

New Exchange Fiat Deposit

Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
NewFiatBankDeposit body = new NewFiatBankDeposit(); // NewFiatBankDeposit | Please send the form with valid inputs.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankfiatdepositnew(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankfiatdepositnew");
    e.printStackTrace();
}
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

<a name="v1userexchangebankfiatwithdrawinitiate"></a>
# **v1userexchangebankfiatwithdrawinitiate**
> SuccessResult v1userexchangebankfiatwithdrawinitiate(body, authorization, accept)

Initiate Fiat Withdrawal

The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
WithdrawFiat body = new WithdrawFiat(); // WithdrawFiat | Please send the form with valid inputs.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankfiatwithdrawinitiate(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankfiatwithdrawinitiate");
    e.printStackTrace();
}
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

<a name="v1userexchangebankfiatwithdrawnewVerifycode"></a>
# **v1userexchangebankfiatwithdrawnewVerifycode**
> SuccessResult v1userexchangebankfiatwithdrawnewVerifycode(body, authorization, accept)

Gets a Fiat Verification Code.

Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
WithdrawID body = new WithdrawID(); // WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/fiat/withdraw/unverified
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankfiatwithdrawnewVerifycode(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankfiatwithdrawnewVerifycode");
    e.printStackTrace();
}
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

<a name="v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID"></a>
# **v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID**
> SuccessResult v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID(withdrawID, authorization, accept)

Cancel Fiat Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
String withdrawID = "withdrawID_example"; // String | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID(withdrawID, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawID** | **String**|  |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatwithdrawverify"></a>
# **v1userexchangebankfiatwithdrawverify**
> SuccessResult v1userexchangebankfiatwithdrawverify(body, authorization, accept)

Verify Fiat Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankActionsApi;

ExchangeBankActionsApi apiInstance = new ExchangeBankActionsApi();
Code body = new Code(); // Code | You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangebankfiatwithdrawverify(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankActionsApi#v1userexchangebankfiatwithdrawverify");
    e.printStackTrace();
}
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

