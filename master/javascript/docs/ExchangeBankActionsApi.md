# CoinsecureApiDocumentation.ExchangeBankActionsApi

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
> SuccessResult v1userexchangebankcoinwithdrawinitiate(body, opts)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var body = new CoinsecureApiDocumentation.SendCoin(); // SendCoin | Please send the form with valid inputs.

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
apiInstance.v1userexchangebankcoinwithdrawinitiate(body, opts, callback);
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
> SuccessResult v1userexchangebankcoinwithdrawnewVerifycode(body, opts)

Gets a Verification Code.

Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var body = new CoinsecureApiDocumentation.WithdrawID(); // WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/coin/withdraw/unverified

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
apiInstance.v1userexchangebankcoinwithdrawnewVerifycode(body, opts, callback);
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
> SuccessResult v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID(withdrawID, opts)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var withdrawID = "withdrawID_example"; // String | 

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
apiInstance.v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID(withdrawID, opts, callback);
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
> SuccessResult v1userexchangebankcoinwithdrawverify(body, opts)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var body = new CoinsecureApiDocumentation.Code(); // Code | You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.

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
apiInstance.v1userexchangebankcoinwithdrawverify(body, opts, callback);
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
> SuccessResult v1userexchangebankfiataccountnew(body, opts)

New Bank Link

Submits a New Bank Link on KYC Verified Accounts.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var body = new CoinsecureApiDocumentation.NewBankForm(); // NewBankForm | Please send the form with valid inputs.

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
apiInstance.v1userexchangebankfiataccountnew(body, opts, callback);
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
> SuccessResult v1userexchangebankfiatdepositcancelDepositID(depositID, opts)

Cancel Unverified Exchange Fiat Deposit

Cancels an unverified Exchange Fiat Deposit.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var depositID = "depositID_example"; // String | 

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
apiInstance.v1userexchangebankfiatdepositcancelDepositID(depositID, opts, callback);
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
> SuccessResult v1userexchangebankfiatdepositnew(body, opts)

New Exchange Fiat Deposit

Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var body = new CoinsecureApiDocumentation.NewFiatBankDeposit(); // NewFiatBankDeposit | Please send the form with valid inputs.

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
apiInstance.v1userexchangebankfiatdepositnew(body, opts, callback);
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
> SuccessResult v1userexchangebankfiatwithdrawinitiate(body, opts)

Initiate Fiat Withdrawal

The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var body = new CoinsecureApiDocumentation.WithdrawFiat(); // WithdrawFiat | Please send the form with valid inputs.

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
apiInstance.v1userexchangebankfiatwithdrawinitiate(body, opts, callback);
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
> SuccessResult v1userexchangebankfiatwithdrawnewVerifycode(body, opts)

Gets a Fiat Verification Code.

Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var body = new CoinsecureApiDocumentation.WithdrawID(); // WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/fiat/withdraw/unverified

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
apiInstance.v1userexchangebankfiatwithdrawnewVerifycode(body, opts, callback);
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
> SuccessResult v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID(withdrawID, opts)

Cancel Fiat Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var withdrawID = "withdrawID_example"; // String | 

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
apiInstance.v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID(withdrawID, opts, callback);
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
> SuccessResult v1userexchangebankfiatwithdrawverify(body, opts)

Verify Fiat Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.ExchangeBankActionsApi();

var body = new CoinsecureApiDocumentation.Code(); // Code | You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode

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
apiInstance.v1userexchangebankfiatwithdrawverify(body, opts, callback);
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

