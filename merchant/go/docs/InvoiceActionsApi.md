# \InvoiceActionsApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateNewInvoice**](InvoiceActionsApi.md#CreateNewInvoice) | **Post** /invoice/createNewInvoice | NEW INVOICE
[**LoadInvoice**](InvoiceActionsApi.md#LoadInvoice) | **Get** /invoice/{invoiceID} | 


# **CreateNewInvoice**
> SuccessInvoice CreateNewInvoice($apikey, $body)

NEW INVOICE

Allows user to create a new Invoice.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**NewInvoice**](NewInvoice.md)| Enter details to create an Invoice | 

### Return type

[**SuccessInvoice**](SuccessInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LoadInvoice**
> ActionAnyContent LoadInvoice($invoiceID)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceID** | **string**|  | 

### Return type

[**ActionAnyContent**](ActionAnyContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

