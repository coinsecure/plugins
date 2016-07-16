# CoinsecureApiDocumentation.WalletActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userwalletcoinaddressnew**](WalletActionsApi.md#v1userwalletcoinaddressnew) | **PUT** /v1/user/wallet/coin/address/new | New Bitcoin Address
[**v1userwalletcoinnew**](WalletActionsApi.md#v1userwalletcoinnew) | **PUT** /v1/user/wallet/coin/new | Create New Wallet
[**v1userwalletcoinwithdrawinitiate**](WalletActionsApi.md#v1userwalletcoinwithdrawinitiate) | **POST** /v1/user/wallet/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**v1userwalletcoinwithdrawsendToExchange**](WalletActionsApi.md#v1userwalletcoinwithdrawsendToExchange) | **PUT** /v1/user/wallet/coin/withdraw/sendToExchange | Send to Exchange
[**v1userwalletcoinwithdrawunverifiedcancel**](WalletActionsApi.md#v1userwalletcoinwithdrawunverifiedcancel) | **DELETE** /v1/user/wallet/coin/withdraw/unverified/cancel | Cancel Bitcoin Withdrawal
[**v1userwalletcoinwithdrawverify**](WalletActionsApi.md#v1userwalletcoinwithdrawverify) | **PUT** /v1/user/wallet/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**v1walletcoinwithdrawnewVerifycode**](WalletActionsApi.md#v1walletcoinwithdrawnewVerifycode) | **POST** /v1/wallet/coin/withdraw/newVerifycode | Gets a Verification Code


<a name="v1userwalletcoinaddressnew"></a>
# **v1userwalletcoinaddressnew**
> WalletAddressDataResponse v1userwalletcoinaddressnew(body, opts)

New Bitcoin Address

Generates a New Bitcoin Address to store coins.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure-api-documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletActionsApi();

var body = new CoinsecureApiDocumentation.NewAddress(); // NewAddress | 

var opts = { 
  'authorization': "authorization_example", // String | Enter a valid Api Key.
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userwalletcoinaddressnew(body, opts, callback);
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
> WalletAddressDataResponse v1userwalletcoinnew(body, opts)

Create New Wallet

Creates a New wallet to store addresses. This method also creates a single default address in each new wallet.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure-api-documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletActionsApi();

var body = new CoinsecureApiDocumentation.NewWallet(); // NewWallet | 

var opts = { 
  'authorization': "authorization_example", // String | Enter a valid Api Key.
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userwalletcoinnew(body, opts, callback);
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
> SuccessResult v1userwalletcoinwithdrawinitiate(body, opts)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure-api-documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletActionsApi();

var body = new CoinsecureApiDocumentation.SendCoinWallet(); // SendCoinWallet | 

var opts = { 
  'authorization': "authorization_example", // String | Enter a valid Api Key.
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userwalletcoinwithdrawinitiate(body, opts, callback);
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
> SuccessResult v1userwalletcoinwithdrawsendToExchange(body, opts)

Send to Exchange

This function transfers funds to yout Exchange Balance without the need for any confirmations.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure-api-documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletActionsApi();

var body = new CoinsecureApiDocumentation.SendExchange(); // SendExchange | 

var opts = { 
  'authorization': "authorization_example", // String | Enter a valid Api Key.
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userwalletcoinwithdrawsendToExchange(body, opts, callback);
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

<a name="v1userwalletcoinwithdrawunverifiedcancel"></a>
# **v1userwalletcoinwithdrawunverifiedcancel**
> SuccessResult v1userwalletcoinwithdrawunverifiedcancel(authorization, body, opts)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure-api-documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletActionsApi();

var authorization = "authorization_example"; // String | Enter a valid Api Key.

var body = new CoinsecureApiDocumentation.WithdrawID(); // WithdrawID | 

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userwalletcoinwithdrawunverifiedcancel(authorization, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Enter a valid Api Key. | 
 **body** | [**WithdrawID**](WithdrawID.md)|  | 
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
> SuccessResult v1userwalletcoinwithdrawverify(authorization, body, opts)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure-api-documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletActionsApi();

var authorization = "authorization_example"; // String | Enter a valid Api Key.

var body = new CoinsecureApiDocumentation.Code(); // Code | 

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userwalletcoinwithdrawverify(authorization, body, opts, callback);
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
> SuccessResult v1walletcoinwithdrawnewVerifycode(body, opts)

Gets a Verification Code

Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure-api-documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletActionsApi();

var body = new CoinsecureApiDocumentation.WithdrawID(); // WithdrawID | You can get unverified withdraw ID's from /v1/exchange/bank/coin/withdrawVerifycode

var opts = { 
  'authorization': "authorization_example", // String | API object to be added
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1walletcoinwithdrawnewVerifycode(body, opts, callback);
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

