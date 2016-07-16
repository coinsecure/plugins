# Swagger\Client\UserDataApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchant**](UserDataApi.md#getMerchant) | **GET** /user/getMerchant | GET MERCHANT


# **getMerchant**
> \Swagger\Client\Model\SuccessMerchant getMerchant($api_key)

GET MERCHANT

Gets a Summary of Merchant Data.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserDataApi();
$api_key = "api_key_example"; // string | Enter User Key

try {
    $result = $api_instance->getMerchant($api_key);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserDataApi->getMerchant: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **string**| Enter User Key |

### Return type

[**\Swagger\Client\Model\SuccessMerchant**](../Model/SuccessMerchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

