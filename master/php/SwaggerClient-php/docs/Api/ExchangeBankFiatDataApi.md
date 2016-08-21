# Swagger\Client\ExchangeBankFiatDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankfiataccounts**](ExchangeBankFiatDataApi.md#v1userexchangebankfiataccounts) | **GET** /v1/user/exchange/bank/fiat/accounts | Exchange Bitcoin Deposit Addresses
[**v1userexchangebankfiatbalanceavailable**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalanceavailable) | **GET** /v1/user/exchange/bank/fiat/balance/total | Available Exchange Fiat Balance
[**v1userexchangebankfiatbalancepending**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancepending) | **GET** /v1/user/exchange/bank/fiat/balance/pending | In Trade Coin Balance
[**v1userexchangebankfiatbalancetotal**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancetotal) | **GET** /v1/user/exchange/bank/fiat/balance/available | Total Exchange Fiat Balance
[**v1userexchangebankfiatdepositcancelled**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositcancelled) | **GET** /v1/user/exchange/bank/fiat/deposit/cancelled | Cancelled Exchange Fiat Deposits
[**v1userexchangebankfiatdepositunverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositunverified) | **GET** /v1/user/exchange/bank/fiat/deposit/unverified | Unverified Exchange Fiat Deposits
[**v1userexchangebankfiatdepositverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositverified) | **GET** /v1/user/exchange/bank/fiat/deposit/verified | Verified Exchange Fiat Deposits
[**v1userexchangebankfiatwithdrawcancelled**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcancelled) | **GET** /v1/user/exchange/bank/fiat/withdraw/cancelled | Cancelled Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawcompleted**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcompleted) | **GET** /v1/user/exchange/bank/fiat/withdraw/completed | Completed Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawunverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawunverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/unverified | Unverified Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/verified | Verified Exchange Fiat Withdrawals


# **v1userexchangebankfiataccounts**
> \Swagger\Client\Model\FiatBankDataResponse v1userexchangebankfiataccounts($authorization, $accept)

Exchange Bitcoin Deposit Addresses

Gets a List of Users Exchange Bitcoin Addresses.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiataccounts($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiataccounts: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\FiatBankDataResponse**](../Model/FiatBankDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatbalanceavailable**
> \Swagger\Client\Model\RateDataResponse v1userexchangebankfiatbalanceavailable($authorization, $accept)

Available Exchange Fiat Balance

Returns balance which is in Available for Trades. The response is in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatbalanceavailable($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatbalanceavailable: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\RateDataResponse**](../Model/RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatbalancepending**
> \Swagger\Client\Model\RateDataResponse v1userexchangebankfiatbalancepending($authorization, $accept)

In Trade Coin Balance

Returns in-trade or pending fiat balance in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatbalancepending($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatbalancepending: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\RateDataResponse**](../Model/RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatbalancetotal**
> \Swagger\Client\Model\RateDataResponse v1userexchangebankfiatbalancetotal($authorization, $accept)

Total Exchange Fiat Balance

Returns users total fiat balance in paisa. Pending + Available

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatbalancetotal($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatbalancetotal: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\RateDataResponse**](../Model/RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatdepositcancelled**
> \Swagger\Client\Model\FiatDepDataResponse v1userexchangebankfiatdepositcancelled($authorization, $from, $to, $max, $offset, $accept)

Cancelled Exchange Fiat Deposits

Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatdepositcancelled($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatdepositcancelled: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\FiatDepDataResponse**](../Model/FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatdepositunverified**
> \Swagger\Client\Model\FiatDepDataResponse v1userexchangebankfiatdepositunverified($authorization, $from, $to, $max, $offset, $accept)

Unverified Exchange Fiat Deposits

Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatdepositunverified($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatdepositunverified: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\FiatDepDataResponse**](../Model/FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatdepositverified**
> \Swagger\Client\Model\FiatDepDataResponse v1userexchangebankfiatdepositverified($authorization, $from, $to, $max, $offset, $accept)

Verified Exchange Fiat Deposits

Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatdepositverified($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatdepositverified: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\FiatDepDataResponse**](../Model/FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatwithdrawcancelled**
> \Swagger\Client\Model\FiatWithDataResponse v1userexchangebankfiatwithdrawcancelled($authorization, $from, $to, $max, $offset, $accept)

Cancelled Exchange Fiat Withdrawals

Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatwithdrawcancelled($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawcancelled: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\FiatWithDataResponse**](../Model/FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatwithdrawcompleted**
> \Swagger\Client\Model\FiatWithDataResponse v1userexchangebankfiatwithdrawcompleted($authorization, $from, $to, $max, $offset, $accept)

Completed Exchange Fiat Withdrawals

Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatwithdrawcompleted($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawcompleted: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\FiatWithDataResponse**](../Model/FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatwithdrawunverified**
> \Swagger\Client\Model\FiatWithDataResponse v1userexchangebankfiatwithdrawunverified($authorization, $from, $to, $max, $offset, $accept)

Unverified Exchange Fiat Withdrawals

Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatwithdrawunverified($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawunverified: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\FiatWithDataResponse**](../Model/FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebankfiatwithdrawverified**
> \Swagger\Client\Model\FiatWithDataResponse v1userexchangebankfiatwithdrawverified($authorization, $from, $to, $max, $offset, $accept)

Verified Exchange Fiat Withdrawals

Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeBankFiatDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebankfiatwithdrawverified($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawverified: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\FiatWithDataResponse**](../Model/FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

