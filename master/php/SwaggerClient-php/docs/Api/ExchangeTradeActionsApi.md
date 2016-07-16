# Swagger\Client\ExchangeTradeActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangeaskcancel**](ExchangeTradeActionsApi.md#v1userexchangeaskcancel) | **DELETE** /v1/user/exchange/ask/cancel | Cancel Open Sell Order
[**v1userexchangeasknew**](ExchangeTradeActionsApi.md#v1userexchangeasknew) | **PUT** /v1/user/exchange/ask/new | BTC Sell Order
[**v1userexchangebidcancel**](ExchangeTradeActionsApi.md#v1userexchangebidcancel) | **DELETE** /v1/user/exchange/bid/cancel | Cancel Open Buy Order
[**v1userexchangebidnew**](ExchangeTradeActionsApi.md#v1userexchangebidnew) | **PUT** /v1/user/exchange/bid/new | BTC Buy Order
[**v1userexchangeinstantbuy**](ExchangeTradeActionsApi.md#v1userexchangeinstantbuy) | **PUT** /v1/user/exchange/instant/buy | Instantly Buy BTC
[**v1userexchangeinstantsell**](ExchangeTradeActionsApi.md#v1userexchangeinstantsell) | **PUT** /v1/user/exchange/instant/sell | Instantly Sell BTC


# **v1userexchangeaskcancel**
> \Swagger\Client\Model\SuccessResult v1userexchangeaskcancel($body, $authorization, $accept)

Cancel Open Sell Order

Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeActionsApi();
$body = new \Swagger\Client\Model\AskID(); // \Swagger\Client\Model\AskID | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangeaskcancel($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeActionsApi->v1userexchangeaskcancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\AskID**](../Model/\Swagger\Client\Model\AskID.md)| Please send the form with valid inputs. |
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

# **v1userexchangeasknew**
> \Swagger\Client\Model\SuccessResultList v1userexchangeasknew($body, $authorization, $accept)

BTC Sell Order

Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeActionsApi();
$body = new \Swagger\Client\Model\RateVolData(); // \Swagger\Client\Model\RateVolData | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangeasknew($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeActionsApi->v1userexchangeasknew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\RateVolData**](../Model/\Swagger\Client\Model\RateVolData.md)| Please send the form with valid inputs. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResultList**](../Model/SuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangebidcancel**
> \Swagger\Client\Model\SuccessResult v1userexchangebidcancel($body, $authorization, $accept)

Cancel Open Buy Order

Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeActionsApi();
$body = new \Swagger\Client\Model\BidID(); // \Swagger\Client\Model\BidID | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebidcancel($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeActionsApi->v1userexchangebidcancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\BidID**](../Model/\Swagger\Client\Model\BidID.md)| Please send the form with valid inputs. |
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

# **v1userexchangebidnew**
> \Swagger\Client\Model\SuccessResultList v1userexchangebidnew($body, $authorization, $accept)

BTC Buy Order

Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeActionsApi();
$body = new \Swagger\Client\Model\RateVolData(); // \Swagger\Client\Model\RateVolData | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangebidnew($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeActionsApi->v1userexchangebidnew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\RateVolData**](../Model/\Swagger\Client\Model\RateVolData.md)| Please send the form with valid inputs. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResultList**](../Model/SuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangeinstantbuy**
> \Swagger\Client\Model\SuccessResultList v1userexchangeinstantbuy($body, $authorization, $accept)

Instantly Buy BTC

Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeActionsApi();
$body = new \Swagger\Client\Model\MinFiat(); // \Swagger\Client\Model\MinFiat | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangeinstantbuy($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeActionsApi->v1userexchangeinstantbuy: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\MinFiat**](../Model/\Swagger\Client\Model\MinFiat.md)| Please send the form with valid inputs. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResultList**](../Model/SuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangeinstantsell**
> \Swagger\Client\Model\SuccessResultList v1userexchangeinstantsell($body, $authorization, $accept)

Instantly Sell BTC

Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ExchangeTradeActionsApi();
$body = new \Swagger\Client\Model\MaxVol(); // \Swagger\Client\Model\MaxVol | Please send the form with valid inputs.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangeinstantsell($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExchangeTradeActionsApi->v1userexchangeinstantsell: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\MaxVol**](../Model/\Swagger\Client\Model\MaxVol.md)| Please send the form with valid inputs. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResultList**](../Model/SuccessResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

