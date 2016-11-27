# Swagger\Client\BlockchainToolsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1bitcoinsearchAddress**](BlockchainToolsApi.md#v1bitcoinsearchAddress) | **GET** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
[**v1bitcoinsearchTxid**](BlockchainToolsApi.md#v1bitcoinsearchTxid) | **GET** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations


# **v1bitcoinsearchAddress**
> \Swagger\Client\Model\ValidAddressSearchDataResponse v1bitcoinsearchAddress($any, $accept)

Search Bitcoin Blockchain

Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BlockchainToolsApi();
$any = "any_example"; // string | 
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1bitcoinsearchAddress($any, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockchainToolsApi->v1bitcoinsearchAddress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **any** | **string**|  |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\ValidAddressSearchDataResponse**](../Model/ValidAddressSearchDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1bitcoinsearchTxid**
> \Swagger\Client\Model\ConfirmDataResponse v1bitcoinsearchTxid($txid, $accept)

Get Confirmations

Searches for a Number of Confirmations on a transaction ID.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BlockchainToolsApi();
$txid = "txid_example"; // string | 
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1bitcoinsearchTxid($txid, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BlockchainToolsApi->v1bitcoinsearchTxid: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **string**|  |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\ConfirmDataResponse**](../Model/ConfirmDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

