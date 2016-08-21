# Swagger\Client\ExchangeTradeDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1exchangeasklow**](ExchangeTradeDataApi.md#v1exchangeasklow) | **GET** /v1/exchange/ask/low | Lowest Ask
[**v1exchangeaskorders**](ExchangeTradeDataApi.md#v1exchangeaskorders) | **GET** /v1/exchange/ask/orders | All Sell Orders
[**v1exchangebidhigh**](ExchangeTradeDataApi.md#v1exchangebidhigh) | **GET** /v1/exchange/bid/high | Returns the Highest Bid in the Order Book
[**v1exchangebidorders**](ExchangeTradeDataApi.md#v1exchangebidorders) | **GET** /v1/exchange/bid/orders | All Buy Orders
[**v1exchangelastTrade**](ExchangeTradeDataApi.md#v1exchangelastTrade) | **GET** /v1/exchange/lastTrade | Last Trade
[**v1exchangemax24Hr**](ExchangeTradeDataApi.md#v1exchangemax24Hr) | **GET** /v1/exchange/max24Hr | Max 24 Hour Rate
[**v1exchangemin24Hr**](ExchangeTradeDataApi.md#v1exchangemin24Hr) | **GET** /v1/exchange/min24Hr | Min 24 Hour Rate
[**v1exchangeticker**](ExchangeTradeDataApi.md#v1exchangeticker) | **GET** /v1/exchange/ticker | Exchange Ticker
[**v1userexchangeaskcancelled**](ExchangeTradeDataApi.md#v1userexchangeaskcancelled) | **GET** /v1/user/exchange/ask/cancelled | Cancelled User Sell Orders
[**v1userexchangeaskcompleted**](ExchangeTradeDataApi.md#v1userexchangeaskcompleted) | **GET** /v1/user/exchange/ask/completed | Completed User Sell Orders
[**v1userexchangeaskpending**](ExchangeTradeDataApi.md#v1userexchangeaskpending) | **GET** /v1/user/exchange/ask/pending | Pending User Sell Orders
[**v1userexchangebidcancelled**](ExchangeTradeDataApi.md#v1userexchangebidcancelled) | **GET** /v1/user/exchange/bid/cancelled | Cancelled User Buy Orders
[**v1userexchangebidcompleted**](ExchangeTradeDataApi.md#v1userexchangebidcompleted) | **GET** /v1/user/exchange/bid/completed | Completed User Buy Orders
[**v1userexchangebidpending**](ExchangeTradeDataApi.md#v1userexchangebidpending) | **GET** /v1/user/exchange/bid/pending | Pending User Buy Orders


# **v1exchangeasklow**
> \Swagger\Client\Model\RateDataResponse v1exchangeasklow($accept)

Lowest Ask

Returns the Lowest Ask Rate in Json. The Amount is in Paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1exchangeasklow($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1exchangeasklow: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\RateDataResponse**](../Model/RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1exchangeaskorders**
> \Swagger\Client\Model\RateVolDataResponse v1exchangeaskorders($accept)

All Sell Orders

Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1exchangeaskorders($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1exchangeaskorders: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\RateVolDataResponse**](../Model/RateVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1exchangebidhigh**
> \Swagger\Client\Model\RateDataResponse v1exchangebidhigh($accept)

Returns the Highest Bid in the Order Book

Highest Bid.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1exchangebidhigh($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1exchangebidhigh: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\RateDataResponse**](../Model/RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1exchangebidorders**
> \Swagger\Client\Model\RateVolDataResponse v1exchangebidorders($accept)

All Buy Orders

Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1exchangebidorders($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1exchangebidorders: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\RateVolDataResponse**](../Model/RateVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1exchangelastTrade**
> \Swagger\Client\Model\LastTradeDataResponse v1exchangelastTrade($accept)

Last Trade

Returns a summary of data from the Exchange.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1exchangelastTrade($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1exchangelastTrade: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\LastTradeDataResponse**](../Model/LastTradeDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1exchangemax24Hr**
> \Swagger\Client\Model\RateDiffDataResponse v1exchangemax24Hr($accept)

Max 24 Hour Rate

Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1exchangemax24Hr($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1exchangemax24Hr: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\RateDiffDataResponse**](../Model/RateDiffDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1exchangemin24Hr**
> \Swagger\Client\Model\RateDiffDataResponse v1exchangemin24Hr($accept)

Min 24 Hour Rate

Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1exchangemin24Hr($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1exchangemin24Hr: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\RateDiffDataResponse**](../Model/RateDiffDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1exchangeticker**
> \Swagger\Client\Model\StandardTickerResultData v1exchangeticker($accept)

Exchange Ticker

Returns a summary of data from the Exchange.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1exchangeticker($accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1exchangeticker: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\StandardTickerResultData**](../Model/StandardTickerResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangeaskcancelled**
> \Swagger\Client\Model\OrderDataResponse v1userexchangeaskcancelled($authorization, $accept)

Cancelled User Sell Orders

Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangeaskcancelled($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1userexchangeaskcancelled: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\OrderDataResponse**](../Model/OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangeaskcompleted**
> \Swagger\Client\Model\OrderDataResponse v1userexchangeaskcompleted($authorization, $from, $to, $max, $offset, $accept)

Completed User Sell Orders

Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$authorization = "authorization_example"; // string | API object to be added
$from = 0; // int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
$to = 9223372036854776000; // int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
$max = 10; // int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
$offset = 0; // int | Offset defaults to 0 if input is invalid. (Optional)
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangeaskcompleted($authorization, $from, $to, $max, $offset, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1userexchangeaskcompleted: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\OrderDataResponse**](../Model/OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangeaskpending**
> \Swagger\Client\Model\OrderDataResponse v1userexchangeaskpending($authorization, $accept)

Pending User Sell Orders

Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangeaskpending($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1userexchangeaskpending: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\OrderDataResponse**](../Model/OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebidcancelled**
> \Swagger\Client\Model\OrderDataResponse v1userexchangebidcancelled($authorization, $accept)

Cancelled User Buy Orders

Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebidcancelled($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1userexchangebidcancelled: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\OrderDataResponse**](../Model/OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebidcompleted**
> \Swagger\Client\Model\OrderDataResponse v1userexchangebidcompleted($authorization, $accept)

Completed User Buy Orders

Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebidcompleted($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1userexchangebidcompleted: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\OrderDataResponse**](../Model/OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebidpending**
> \Swagger\Client\Model\OrderDataResponse v1userexchangebidpending($authorization, $accept)

Pending User Buy Orders

Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeDataApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebidpending($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeDataApi->v1userexchangebidpending: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\OrderDataResponse**](../Model/OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

