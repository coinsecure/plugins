# WalletActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userwalletcoinaddressnew**](WalletActionsApi.md#v1userwalletcoinaddressnew) | **PUT** /v1/user/wallet/coin/address/new | New Bitcoin Address
[**v1userwalletcoinnew**](WalletActionsApi.md#v1userwalletcoinnew) | **PUT** /v1/user/wallet/coin/new | Create New Wallet
[**v1userwalletcoinwithdrawinitiate**](WalletActionsApi.md#v1userwalletcoinwithdrawinitiate) | **POST** /v1/user/wallet/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**v1userwalletcoinwithdrawsendToExchange**](WalletActionsApi.md#v1userwalletcoinwithdrawsendToExchange) | **PUT** /v1/user/wallet/coin/withdraw/sendToExchange | Send to Exchange
[**v1userwalletcoinwithdrawunverifiedcancelWithdrawID**](WalletActionsApi.md#v1userwalletcoinwithdrawunverifiedcancelWithdrawID) | **DELETE** /v1/user/wallet/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
[**v1userwalletcoinwithdrawverify**](WalletActionsApi.md#v1userwalletcoinwithdrawverify) | **PUT** /v1/user/wallet/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**v1walletcoinwithdrawnewVerifycode**](WalletActionsApi.md#v1walletcoinwithdrawnewVerifycode) | **POST** /v1/wallet/coin/withdraw/newVerifycode | Gets a Verification Code


<a name="v1userwalletcoinaddressnew"></a>
# **v1userwalletcoinaddressnew**
> WalletAddressDataResponse v1userwalletcoinaddressnew(body, authorization, accept)

New Bitcoin Address

Generates a New Bitcoin Address to store coins.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletActionsApi;

WalletActionsApi apiInstance = new WalletActionsApi();
NewAddress body = new NewAddress(); // NewAddress | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    WalletAddressDataResponse result = apiInstance.v1userwalletcoinaddressnew(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletActionsApi#v1userwalletcoinaddressnew");
    e.printStackTrace();
}
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

<a name="v1userwalletcoinnew"></a>
# **v1userwalletcoinnew**
> WalletAddressDataResponse v1userwalletcoinnew(body, authorization, accept)

Create New Wallet

Creates a New wallet to store addresses. This method also creates a single default address in each new wallet.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletActionsApi;

WalletActionsApi apiInstance = new WalletActionsApi();
NewWallet body = new NewWallet(); // NewWallet | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    WalletAddressDataResponse result = apiInstance.v1userwalletcoinnew(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletActionsApi#v1userwalletcoinnew");
    e.printStackTrace();
}
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

<a name="v1userwalletcoinwithdrawinitiate"></a>
# **v1userwalletcoinwithdrawinitiate**
> SuccessResult v1userwalletcoinwithdrawinitiate(body, authorization, accept)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletActionsApi;

WalletActionsApi apiInstance = new WalletActionsApi();
SendCoinWallet body = new SendCoinWallet(); // SendCoinWallet | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userwalletcoinwithdrawinitiate(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletActionsApi#v1userwalletcoinwithdrawinitiate");
    e.printStackTrace();
}
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

<a name="v1userwalletcoinwithdrawsendToExchange"></a>
# **v1userwalletcoinwithdrawsendToExchange**
> SuccessResult v1userwalletcoinwithdrawsendToExchange(body, authorization, accept)

Send to Exchange

This function transfers funds to yout Exchange Balance without the need for any confirmations.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletActionsApi;

WalletActionsApi apiInstance = new WalletActionsApi();
SendExchange body = new SendExchange(); // SendExchange | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userwalletcoinwithdrawsendToExchange(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletActionsApi#v1userwalletcoinwithdrawsendToExchange");
    e.printStackTrace();
}
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

<a name="v1userwalletcoinwithdrawunverifiedcancelWithdrawID"></a>
# **v1userwalletcoinwithdrawunverifiedcancelWithdrawID**
> SuccessResult v1userwalletcoinwithdrawunverifiedcancelWithdrawID(withdrawID, authorization, accept)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletActionsApi;

WalletActionsApi apiInstance = new WalletActionsApi();
String withdrawID = "withdrawID_example"; // String | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userwalletcoinwithdrawunverifiedcancelWithdrawID(withdrawID, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletActionsApi#v1userwalletcoinwithdrawunverifiedcancelWithdrawID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawID** | **String**|  |
 **authorization** | **String**| Enter a valid Api Key. |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userwalletcoinwithdrawverify"></a>
# **v1userwalletcoinwithdrawverify**
> SuccessResult v1userwalletcoinwithdrawverify(authorization, body, accept)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletActionsApi;

WalletActionsApi apiInstance = new WalletActionsApi();
String authorization = "authorization_example"; // String | Enter a valid Api Key.
Code body = new Code(); // Code | 
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userwalletcoinwithdrawverify(authorization, body, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletActionsApi#v1userwalletcoinwithdrawverify");
    e.printStackTrace();
}
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

<a name="v1walletcoinwithdrawnewVerifycode"></a>
# **v1walletcoinwithdrawnewVerifycode**
> SuccessResult v1walletcoinwithdrawnewVerifycode(body, authorization, accept)

Gets a Verification Code

Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletActionsApi;

WalletActionsApi apiInstance = new WalletActionsApi();
WithdrawID body = new WithdrawID(); // WithdrawID | You can get unverified withdraw ID's from /v1/exchange/bank/coin/withdrawVerifycode
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1walletcoinwithdrawnewVerifycode(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletActionsApi#v1walletcoinwithdrawnewVerifycode");
    e.printStackTrace();
}
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

