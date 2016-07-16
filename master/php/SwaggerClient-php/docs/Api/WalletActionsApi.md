# Swagger\Client\WalletActionsApi

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


# **v1userwalletcoinaddressnew**
> \Swagger\Client\Model\WalletAddressDataResponse v1userwalletcoinaddressnew($body, $authorization, $accept)

New Bitcoin Address

Generates a New Bitcoin Address to store coins.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\WalletActionsApi();
$body = new \Swagger\Client\Model\NewAddress(); // \Swagger\Client\Model\NewAddress | 
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userwalletcoinaddressnew($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletActionsApi->v1userwalletcoinaddressnew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\NewAddress**](../Model/\Swagger\Client\Model\NewAddress.md)|  |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\WalletAddressDataResponse**](../Model/WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userwalletcoinnew**
> \Swagger\Client\Model\WalletAddressDataResponse v1userwalletcoinnew($body, $authorization, $accept)

Create New Wallet

Creates a New wallet to store addresses. This method also creates a single default address in each new wallet.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\WalletActionsApi();
$body = new \Swagger\Client\Model\NewWallet(); // \Swagger\Client\Model\NewWallet | 
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userwalletcoinnew($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletActionsApi->v1userwalletcoinnew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\NewWallet**](../Model/\Swagger\Client\Model\NewWallet.md)|  |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\WalletAddressDataResponse**](../Model/WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userwalletcoinwithdrawinitiate**
> \Swagger\Client\Model\SuccessResult v1userwalletcoinwithdrawinitiate($body, $authorization, $accept)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\WalletActionsApi();
$body = new \Swagger\Client\Model\SendCoinWallet(); // \Swagger\Client\Model\SendCoinWallet | 
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userwalletcoinwithdrawinitiate($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletActionsApi->v1userwalletcoinwithdrawinitiate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\SendCoinWallet**](../Model/\Swagger\Client\Model\SendCoinWallet.md)|  |
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

# **v1userwalletcoinwithdrawsendToExchange**
> \Swagger\Client\Model\SuccessResult v1userwalletcoinwithdrawsendToExchange($body, $authorization, $accept)

Send to Exchange

This function transfers funds to yout Exchange Balance without the need for any confirmations.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\WalletActionsApi();
$body = new \Swagger\Client\Model\SendExchange(); // \Swagger\Client\Model\SendExchange | 
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userwalletcoinwithdrawsendToExchange($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletActionsApi->v1userwalletcoinwithdrawsendToExchange: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\SendExchange**](../Model/\Swagger\Client\Model\SendExchange.md)|  |
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

# **v1userwalletcoinwithdrawunverifiedcancel**
> \Swagger\Client\Model\SuccessResult v1userwalletcoinwithdrawunverifiedcancel($authorization, $body, $accept)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\WalletActionsApi();
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$body = new \Swagger\Client\Model\WithdrawID(); // \Swagger\Client\Model\WithdrawID | 
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userwalletcoinwithdrawunverifiedcancel($authorization, $body, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletActionsApi->v1userwalletcoinwithdrawunverifiedcancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Enter a valid Api Key. |
 **body** | [**\Swagger\Client\Model\WithdrawID**](../Model/\Swagger\Client\Model\WithdrawID.md)|  |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userwalletcoinwithdrawverify**
> \Swagger\Client\Model\SuccessResult v1userwalletcoinwithdrawverify($authorization, $body, $accept)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\WalletActionsApi();
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$body = new \Swagger\Client\Model\Code(); // \Swagger\Client\Model\Code | 
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userwalletcoinwithdrawverify($authorization, $body, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletActionsApi->v1userwalletcoinwithdrawverify: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Enter a valid Api Key. |
 **body** | [**\Swagger\Client\Model\Code**](../Model/\Swagger\Client\Model\Code.md)|  |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1walletcoinwithdrawnewVerifycode**
> \Swagger\Client\Model\SuccessResult v1walletcoinwithdrawnewVerifycode($body, $authorization, $accept)

Gets a Verification Code

Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\WalletActionsApi();
$body = new \Swagger\Client\Model\WithdrawID(); // \Swagger\Client\Model\WithdrawID | You can get unverified withdraw ID's from /v1/exchange/bank/coin/withdrawVerifycode
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1walletcoinwithdrawnewVerifycode($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletActionsApi->v1walletcoinwithdrawnewVerifycode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\WithdrawID**](../Model/\Swagger\Client\Model\WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/exchange/bank/coin/withdrawVerifycode |
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

