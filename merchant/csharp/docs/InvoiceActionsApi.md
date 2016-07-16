# IO.Swagger.Api.InvoiceActionsApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateNewInvoice**](InvoiceActionsApi.md#createnewinvoice) | **POST** /invoice/createNewInvoice | NEW INVOICE
[**LoadInvoice**](InvoiceActionsApi.md#loadinvoice) | **GET** /invoice/{invoiceID} | 


# **CreateNewInvoice**
> SuccessInvoice CreateNewInvoice (string apikey, NewInvoice body)

NEW INVOICE

Allows user to create a new Invoice.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateNewInvoiceExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceActionsApi();
            var apikey = apikey_example;  // string | Enter User Key
            var body = new NewInvoice(); // NewInvoice | Enter details to create an Invoice

            try
            {
                // NEW INVOICE
                SuccessInvoice result = apiInstance.CreateNewInvoice(apikey, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceActionsApi.CreateNewInvoice: " + e.Message );
            }
        }
    }
}
```

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
> ActionAnyContent LoadInvoice (string invoiceID)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class LoadInvoiceExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceActionsApi();
            var invoiceID = invoiceID_example;  // string | 

            try
            {
                ActionAnyContent result = apiInstance.LoadInvoice(invoiceID);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceActionsApi.LoadInvoice: " + e.Message );
            }
        }
    }
}
```

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

