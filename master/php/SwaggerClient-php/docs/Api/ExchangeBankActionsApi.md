# Swagger\Client\ExchangeBankActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankcoinwithdrawinitiate**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawinitiate) | **POST** /v1/user/exchange/bank/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**v1userexchangebankcoinwithdrawnewVerifycode**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawnewVerifycode) | **POST** /v1/user/exchange/bank/coin/withdraw/newVerifycode | Gets a Verification Code.
[**v1userexchangebankcoinwithdrawunverifiedcancel**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawunverifiedcancel) | **DELETE** /v1/user/exchange/bank/coin/withdraw/unverified/cancel | Cancel Bitcoin Withdrawal
[**v1userexchangebankcoinwithdrawverify**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawverify) | **PUT** /v1/user/exchange/bank/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**v1userexchangebankfiataccountnew**](ExchangeBankActionsApi.md#v1userexchangebankfiataccountnew) | **PUT** /v1/user/exchange/bank/fiat/account/new | New Bank Link
[**v1userexchangebankfiatdepositcancel**](ExchangeBankActionsApi.md#v1userexchangebankfiatdepositcancel) | **DELETE** /v1/user/exchange/bank/fiat/deposit/cancel | Cancel Unverified Exchange Fiat Deposit
[**v1userexchangebankfiatdepositnew**](ExchangeBankActionsApi.md#v1userexchangebankfiatdepositnew) | **PUT** /v1/user/exchange/bank/fiat/deposit/new | New Exchange Fiat Deposit
[**v1userexchangebankfiatwithdrawinitiate**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawinitiate) | **POST** /v1/user/exchange/bank/fiat/withdraw/initiate | Initiate Fiat Withdrawal
[**v1userexchangebankfiatwithdrawnewVerifycode**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawnewVerifycode) | **POST** /v1/user/exchange/bank/fiat/withdraw/newVerifycode | Gets a Fiat Verification Code.
[**v1userexchangebankfiatwithdrawunverifiedcancel**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawunverifiedcancel) | **DELETE** /v1/user/exchange/bank/fiat/withdraw/unverified/cancel | Cancel Fiat Withdrawal
[**v1userexchangebankfiatwithdrawverify**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawverify) | **PUT** /v1/user/exchange/bank/fiat/withdraw/verify | Verify Fiat Withdrawal


# **v1userexchangebankcoinwithdrawinitiate**
> \Swagger\Client\Model\SuccessResult v1userexchangebankcoinwithdrawinitiate($body, $authorization, $accept)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\SendCoin(); // \Swagger\Client\Model\SendCoin | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinwithdrawinitiate($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawinitiate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\SendCoin**](../Model/\Swagger\Client\Model\SendCoin.md)| Please send the form with valid inputs. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoinwithdrawnewVerifycode**
> \Swagger\Client\Model\SuccessResult v1userexchangebankcoinwithdrawnewVerifycode($body, $authorization, $accept)

Gets a Verification Code.

Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\WithdrawID(); // \Swagger\Client\Model\WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/coin/withdraw/unverified
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinwithdrawnewVerifycode($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawnewVerifycode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\WithdrawID**](../Model/\Swagger\Client\Model\WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified |
 **authorization** | **string**| API object to be added | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoinwithdrawunverifiedcancel**
> \Swagger\Client\Model\SuccessResult v1userexchangebankcoinwithdrawunverifiedcancel($body, $authorization, $accept)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\WithdrawID(); // \Swagger\Client\Model\WithdrawID | You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinwithdrawunverifiedcancel($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawunverifiedcancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\WithdrawID**](../Model/\Swagger\Client\Model\WithdrawID.md)| You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoinwithdrawverify**
> \Swagger\Client\Model\SuccessResult v1userexchangebankcoinwithdrawverify($body, $authorization, $accept)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\Code(); // \Swagger\Client\Model\Code | You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinwithdrawverify($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawverify: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Code**](../Model/\Swagger\Client\Model\Code.md)| You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiataccountnew**
> \Swagger\Client\Model\SuccessResult v1userexchangebankfiataccountnew($body, $authorization, $accept)

New Bank Link

Submits a New Bank Link on KYC Verified Accounts.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\NewBankForm(); // \Swagger\Client\Model\NewBankForm | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiataccountnew($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankfiataccountnew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\NewBankForm**](../Model/\Swagger\Client\Model\NewBankForm.md)| Please send the form with valid inputs. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatdepositcancel**
> \Swagger\Client\Model\SuccessResult v1userexchangebankfiatdepositcancel($body, $authorization, $accept)

Cancel Unverified Exchange Fiat Deposit

Cancels an unverified Exchange Fiat Deposit.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\DepositID(); // \Swagger\Client\Model\DepositID | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatdepositcancel($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatdepositcancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\DepositID**](../Model/\Swagger\Client\Model\DepositID.md)| Please send the form with valid inputs. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatdepositnew**
> \Swagger\Client\Model\SuccessResult v1userexchangebankfiatdepositnew($body, $authorization, $accept)

New Exchange Fiat Deposit

Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\NewFiatBankDeposit(); // \Swagger\Client\Model\NewFiatBankDeposit | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatdepositnew($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatdepositnew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\NewFiatBankDeposit**](../Model/\Swagger\Client\Model\NewFiatBankDeposit.md)| Please send the form with valid inputs. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatwithdrawinitiate**
> \Swagger\Client\Model\SuccessResult v1userexchangebankfiatwithdrawinitiate($body, $authorization, $accept)

Initiate Fiat Withdrawal

The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\WithdrawFiat(); // \Swagger\Client\Model\WithdrawFiat | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatwithdrawinitiate($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawinitiate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\WithdrawFiat**](../Model/\Swagger\Client\Model\WithdrawFiat.md)| Please send the form with valid inputs. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatwithdrawnewVerifycode**
> \Swagger\Client\Model\SuccessResult v1userexchangebankfiatwithdrawnewVerifycode($body, $authorization, $accept)

Gets a Fiat Verification Code.

Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\WithdrawID(); // \Swagger\Client\Model\WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/fiat/withdraw/unverified
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatwithdrawnewVerifycode($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawnewVerifycode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\WithdrawID**](../Model/\Swagger\Client\Model\WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified |
 **authorization** | **string**| API object to be added | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatwithdrawunverifiedcancel**
> \Swagger\Client\Model\SuccessResult v1userexchangebankfiatwithdrawunverifiedcancel($body, $authorization, $accept)

Cancel Fiat Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\WithdrawID(); // \Swagger\Client\Model\WithdrawID | You can get the code from /v1/user/exchange/bank/fiat/withdraw/unverified.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatwithdrawunverifiedcancel($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawunverifiedcancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\WithdrawID**](../Model/\Swagger\Client\Model\WithdrawID.md)| You can get the code from /v1/user/exchange/bank/fiat/withdraw/unverified. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatwithdrawverify**
> \Swagger\Client\Model\SuccessResult v1userexchangebankfiatwithdrawverify($body, $authorization, $accept)

Verify Fiat Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankActionsApi();
$body = new \Swagger\Client\Model\Code(); // \Swagger\Client\Model\Code | You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatwithdrawverify($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawverify: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Code**](../Model/\Swagger\Client\Model\Code.md)| You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

