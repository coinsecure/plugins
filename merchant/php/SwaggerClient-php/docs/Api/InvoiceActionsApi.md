# Swagger\Client\InvoiceActionsApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewInvoice**](InvoiceActionsApi.md#createNewInvoice) | **POST** /invoice/createNewInvoice | NEW INVOICE
[**loadInvoice**](InvoiceActionsApi.md#loadInvoice) | **GET** /invoice/{invoiceID} | 


# **createNewInvoice**
> \Swagger\Client\Model\SuccessInvoice createNewInvoice($apikey, $body)

NEW INVOICE

Allows user to create a new Invoice.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceActionsApi();
$apikey = "apikey_example"; // string | Enter User Key
$body = new \Swagger\Client\Model\NewInvoice(); // \Swagger\Client\Model\NewInvoice | Enter details to create an Invoice

try {
    $result = $api_instance->createNewInvoice($apikey, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceActionsApi->createNewInvoice: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key |
 **body** | [**\Swagger\Client\Model\NewInvoice**](../Model/\Swagger\Client\Model\NewInvoice.md)| Enter details to create an Invoice |

### Return type

[**\Swagger\Client\Model\SuccessInvoice**](../Model/SuccessInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **loadInvoice**
> \Swagger\Client\Model\ActionAnyContent loadInvoice($invoice_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceActionsApi();
$invoice_id = "invoice_id_example"; // string | 

try {
    $result = $api_instance->loadInvoice($invoice_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceActionsApi->loadInvoice: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | **string**|  |

### Return type

[**\Swagger\Client\Model\ActionAnyContent**](../Model/ActionAnyContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

