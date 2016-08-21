# Swagger\Client\ExchangeBankCoinDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankcoinaddresses**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinaddresses) | **GET** /v1/user/exchange/bank/coin/addresses | Exchange Coin Addresses
[**v1userexchangebankcoinbalanceavailable**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalanceavailable) | **GET** /v1/user/exchange/bank/coin/balance/total | Available Exchange Coin Balance
[**v1userexchangebankcoinbalancepending**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancepending) | **GET** /v1/user/exchange/bank/coin/balance/pending | In Trade Coin Balance
[**v1userexchangebankcoinbalancetotal**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancetotal) | **GET** /v1/user/exchange/bank/coin/balance/available | Total Exchange Coin Balance
[**v1userexchangebankcoindepositcancelled**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositcancelled) | **GET** /v1/user/exchange/bank/coin/deposit/cancelled | Cancelled Exchange Coin Deposits
[**v1userexchangebankcoindepositunverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositunverified) | **GET** /v1/user/exchange/bank/coin/deposit/unverified | Unverified Exchange Coin Deposits
[**v1userexchangebankcoindepositverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositverified) | **GET** /v1/user/exchange/bank/coin/deposit/verified | Verified Exchange Coin Deposits
[**v1userexchangebankcoinwithdrawcancelled**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcancelled) | **GET** /v1/user/exchange/bank/coin/withdraw/cancelled | Cancelled Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawcompleted**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcompleted) | **GET** /v1/user/exchange/bank/coin/withdraw/completed | Completed Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawunverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawunverified) | **GET** /v1/user/exchange/bank/coin/withdraw/unverified | Unverified Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawverified) | **GET** /v1/user/exchange/bank/coin/withdraw/verified | Verified Exchange Coin Withdrawals


# **v1userexchangebankcoinaddresses**
> \Swagger\Client\Model\TradeAddressDataResponse v1userexchangebankcoinaddresses($authorization, $accept)

Exchange Coin Addresses

Gets a List of Users Exchange Bitcoin Deposit Addresses.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinaddresses($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinaddresses: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\TradeAddressDataResponse**](../Model/TradeAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoinbalanceavailable**
> \Swagger\Client\Model\VolDataResponse v1userexchangebankcoinbalanceavailable($authorization, $accept)

Available Exchange Coin Balance

Returns balance which is in Available for Trades. The response is in satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinbalanceavailable($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinbalanceavailable: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\VolDataResponse**](../Model/VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoinbalancepending**
> \Swagger\Client\Model\VolDataResponse v1userexchangebankcoinbalancepending($authorization, $accept)

In Trade Coin Balance

Returns in-trade or pending coin balance in satoshi.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinbalancepending($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinbalancepending: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\VolDataResponse**](../Model/VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoinbalancetotal**
> \Swagger\Client\Model\VolDataResponse v1userexchangebankcoinbalancetotal($authorization, $accept)

Total Exchange Coin Balance

Returns users total coin balance in satoshis. Pending + Available

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinbalancetotal($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinbalancetotal: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\VolDataResponse**](../Model/VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoindepositcancelled**
> \Swagger\Client\Model\CoinDepDataResponse v1userexchangebankcoindepositcancelled($authorization, $from, $to, $max, $offset, $accept)

Cancelled Exchange Coin Deposits

Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoindepositcancelled($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoindepositcancelled: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\CoinDepDataResponse**](../Model/CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoindepositunverified**
> \Swagger\Client\Model\CoinDepDataResponse v1userexchangebankcoindepositunverified($authorization, $from, $to, $max, $offset, $accept)

Unverified Exchange Coin Deposits

Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoindepositunverified($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoindepositunverified: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\CoinDepDataResponse**](../Model/CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoindepositverified**
> \Swagger\Client\Model\CoinDepDataResponse v1userexchangebankcoindepositverified($authorization, $from, $to, $max, $offset, $accept)

Verified Exchange Coin Deposits

Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoindepositverified($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoindepositverified: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\CoinDepDataResponse**](../Model/CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoinwithdrawcancelled**
> \Swagger\Client\Model\TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcancelled($authorization, $from, $to, $max, $offset, $accept)

Cancelled Exchange Coin Withdrawals

Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinwithdrawcancelled($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawcancelled: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\TradeCoinWithdrawDataResponse**](../Model/TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoinwithdrawcompleted**
> \Swagger\Client\Model\TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcompleted($authorization, $from, $to, $max, $offset, $accept)

Completed Exchange Coin Withdrawals

Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinwithdrawcompleted($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawcompleted: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\TradeCoinWithdrawDataResponse**](../Model/TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoinwithdrawunverified**
> \Swagger\Client\Model\TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawunverified($authorization, $from, $to, $max, $offset, $accept)

Unverified Exchange Coin Withdrawals

Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinwithdrawunverified($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawunverified: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\TradeCoinWithdrawDataResponse**](../Model/TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankcoinwithdrawverified**
> \Swagger\Client\Model\TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawverified($authorization, $from, $to, $max, $offset, $accept)

Verified Exchange Coin Withdrawals

Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankCoinDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankcoinwithdrawverified($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawverified: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\TradeCoinWithdrawDataResponse**](../Model/TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

