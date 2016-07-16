# \InvoiceDataApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCancInvoices**](InvoiceDataApi.md#GetCancInvoices) | **Post** /invoice/getCancInvoices | GET ALL CANCELLED INVOICES
[**GetCompleteInvoices**](InvoiceDataApi.md#GetCompleteInvoices) | **Post** /invoice/getCompleteInvoices | GET ALL COMPLETED INVOICES
[**GetConfInvoices**](InvoiceDataApi.md#GetConfInvoices) | **Post** /invoice/getConfInvoices | GET ALL CONFIRMED INVOICES
[**GetInvoiceFromID**](InvoiceDataApi.md#GetInvoiceFromID) | **Get** /invoice/getInvoiceFromID/{invoiceID} | GET INVOICE FROM ID
[**GetPaidInvoices**](InvoiceDataApi.md#GetPaidInvoices) | **Post** /invoice/getPaidInvoices | GET ALL PAID INVOICES
[**GetRefundInvoices**](InvoiceDataApi.md#GetRefundInvoices) | **Post** /invoice/getRefundInvoices | GET ALL REFUND INVOICES
[**GetUnprocessedInvoices**](InvoiceDataApi.md#GetUnprocessedInvoices) | **Post** /invoice/getUnprocessedInvoices | GET ALL UNPROCESSED INVOICES


# **GetCancInvoices**
> SuccessInvoices GetCancInvoices($apikey, $body)

GET ALL CANCELLED INVOICES

Gets All Cancelled Invoice Details.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIdFull**](InvoiceIdFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCompleteInvoices**
> SuccessInvoices GetCompleteInvoices($apikey, $body)

GET ALL COMPLETED INVOICES

Gets All Completed Invoice Details.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIdFull**](InvoiceIdFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetConfInvoices**
> SuccessInvoices GetConfInvoices($apikey, $body)

GET ALL CONFIRMED INVOICES

Gets All Confirmed Invoice Details.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIdFull**](InvoiceIdFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetInvoiceFromID**
> SuccessInvoice GetInvoiceFromID($invoiceID, $apikey)

GET INVOICE FROM ID

Gets Details of an Invoice ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceID** | **string**|  | 
 **apikey** | **string**| Enter User Key | 

### Return type

[**SuccessInvoice**](SuccessInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetPaidInvoices**
> SuccessInvoices GetPaidInvoices($apikey, $body)

GET ALL PAID INVOICES

Gets All Paid Invoice Details.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIdFull**](InvoiceIdFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetRefundInvoices**
> SuccessInvoices GetRefundInvoices($apikey, $body)

GET ALL REFUND INVOICES

Gets All Refund Invoice Details.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIdFull**](InvoiceIdFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetUnprocessedInvoices**
> SuccessInvoices GetUnprocessedInvoices($apikey, $body)

GET ALL UNPROCESSED INVOICES

Gets All Unprocessed Invoice Details.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIdFull**](InvoiceIdFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

