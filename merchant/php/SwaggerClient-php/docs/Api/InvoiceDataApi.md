# Swagger\Client\InvoiceDataApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCancInvoices**](InvoiceDataApi.md#getCancInvoices) | **POST** /invoice/getCancInvoices | GET ALL CANCELLED INVOICES
[**getCompleteInvoices**](InvoiceDataApi.md#getCompleteInvoices) | **POST** /invoice/getCompleteInvoices | GET ALL COMPLETED INVOICES
[**getConfInvoices**](InvoiceDataApi.md#getConfInvoices) | **POST** /invoice/getConfInvoices | GET ALL CONFIRMED INVOICES
[**getInvoiceFromID**](InvoiceDataApi.md#getInvoiceFromID) | **GET** /invoice/getInvoiceFromID/{invoiceID} | GET INVOICE FROM ID
[**getPaidInvoices**](InvoiceDataApi.md#getPaidInvoices) | **POST** /invoice/getPaidInvoices | GET ALL PAID INVOICES
[**getRefundInvoices**](InvoiceDataApi.md#getRefundInvoices) | **POST** /invoice/getRefundInvoices | GET ALL REFUND INVOICES
[**getUnprocessedInvoices**](InvoiceDataApi.md#getUnprocessedInvoices) | **POST** /invoice/getUnprocessedInvoices | GET ALL UNPROCESSED INVOICES


# **getCancInvoices**
> \Swagger\Client\Model\SuccessInvoices getCancInvoices($apikey, $body)

GET ALL CANCELLED INVOICES

Gets All Cancelled Invoice Details.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceDataApi();
$apikey = "apikey_example"; // string | Enter User Key
$body = new \Swagger\Client\Model\InvoiceIDFull(); // \Swagger\Client\Model\InvoiceIDFull | Enter details to query Invoices

try {
    $result = $api_instance->getCancInvoices($apikey, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceDataApi->getCancInvoices: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key |
 **body** | [**\Swagger\Client\Model\InvoiceIDFull**](../Model/\Swagger\Client\Model\InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**\Swagger\Client\Model\SuccessInvoices**](../Model/SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCompleteInvoices**
> \Swagger\Client\Model\SuccessInvoices getCompleteInvoices($apikey, $body)

GET ALL COMPLETED INVOICES

Gets All Completed Invoice Details.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceDataApi();
$apikey = "apikey_example"; // string | Enter User Key
$body = new \Swagger\Client\Model\InvoiceIDFull(); // \Swagger\Client\Model\InvoiceIDFull | Enter details to query Invoices

try {
    $result = $api_instance->getCompleteInvoices($apikey, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceDataApi->getCompleteInvoices: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key |
 **body** | [**\Swagger\Client\Model\InvoiceIDFull**](../Model/\Swagger\Client\Model\InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**\Swagger\Client\Model\SuccessInvoices**](../Model/SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getConfInvoices**
> \Swagger\Client\Model\SuccessInvoices getConfInvoices($apikey, $body)

GET ALL CONFIRMED INVOICES

Gets All Confirmed Invoice Details.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceDataApi();
$apikey = "apikey_example"; // string | Enter User Key
$body = new \Swagger\Client\Model\InvoiceIDFull(); // \Swagger\Client\Model\InvoiceIDFull | Enter details to query Invoices

try {
    $result = $api_instance->getConfInvoices($apikey, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceDataApi->getConfInvoices: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key |
 **body** | [**\Swagger\Client\Model\InvoiceIDFull**](../Model/\Swagger\Client\Model\InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**\Swagger\Client\Model\SuccessInvoices**](../Model/SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getInvoiceFromID**
> \Swagger\Client\Model\SuccessInvoice getInvoiceFromID($invoice_id, $apikey)

GET INVOICE FROM ID

Gets Details of an Invoice ID.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceDataApi();
$invoice_id = "invoice_id_example"; // string | 
$apikey = "apikey_example"; // string | Enter User Key

try {
    $result = $api_instance->getInvoiceFromID($invoice_id, $apikey);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceDataApi->getInvoiceFromID: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | **string**|  |
 **apikey** | **string**| Enter User Key |

### Return type

[**\Swagger\Client\Model\SuccessInvoice**](../Model/SuccessInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPaidInvoices**
> \Swagger\Client\Model\SuccessInvoices getPaidInvoices($apikey, $body)

GET ALL PAID INVOICES

Gets All Paid Invoice Details.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceDataApi();
$apikey = "apikey_example"; // string | Enter User Key
$body = new \Swagger\Client\Model\InvoiceIDFull(); // \Swagger\Client\Model\InvoiceIDFull | Enter details to query Invoices

try {
    $result = $api_instance->getPaidInvoices($apikey, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceDataApi->getPaidInvoices: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key |
 **body** | [**\Swagger\Client\Model\InvoiceIDFull**](../Model/\Swagger\Client\Model\InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**\Swagger\Client\Model\SuccessInvoices**](../Model/SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getRefundInvoices**
> \Swagger\Client\Model\SuccessInvoices getRefundInvoices($apikey, $body)

GET ALL REFUND INVOICES

Gets All Refund Invoice Details.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceDataApi();
$apikey = "apikey_example"; // string | Enter User Key
$body = new \Swagger\Client\Model\InvoiceIDFull(); // \Swagger\Client\Model\InvoiceIDFull | Enter details to query Invoices

try {
    $result = $api_instance->getRefundInvoices($apikey, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceDataApi->getRefundInvoices: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key |
 **body** | [**\Swagger\Client\Model\InvoiceIDFull**](../Model/\Swagger\Client\Model\InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**\Swagger\Client\Model\SuccessInvoices**](../Model/SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getUnprocessedInvoices**
> \Swagger\Client\Model\SuccessInvoices getUnprocessedInvoices($apikey, $body)

GET ALL UNPROCESSED INVOICES

Gets All Unprocessed Invoice Details.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\InvoiceDataApi();
$apikey = "apikey_example"; // string | Enter User Key
$body = new \Swagger\Client\Model\InvoiceIDFull(); // \Swagger\Client\Model\InvoiceIDFull | Enter details to query Invoices

try {
    $result = $api_instance->getUnprocessedInvoices($apikey, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InvoiceDataApi->getUnprocessedInvoices: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key |
 **body** | [**\Swagger\Client\Model\InvoiceIDFull**](../Model/\Swagger\Client\Model\InvoiceIDFull.md)| Enter details to query Invoices |

### Return type

[**\Swagger\Client\Model\SuccessInvoices**](../Model/SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

