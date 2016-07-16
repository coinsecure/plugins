# IO.Swagger.Api.InvoiceDataApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCancInvoices**](InvoiceDataApi.md#getcancinvoices) | **POST** /invoice/getCancInvoices | GET ALL CANCELLED INVOICES
[**GetCompleteInvoices**](InvoiceDataApi.md#getcompleteinvoices) | **POST** /invoice/getCompleteInvoices | GET ALL COMPLETED INVOICES
[**GetConfInvoices**](InvoiceDataApi.md#getconfinvoices) | **POST** /invoice/getConfInvoices | GET ALL CONFIRMED INVOICES
[**GetInvoiceFromID**](InvoiceDataApi.md#getinvoicefromid) | **GET** /invoice/getInvoiceFromID/{invoiceID} | GET INVOICE FROM ID
[**GetPaidInvoices**](InvoiceDataApi.md#getpaidinvoices) | **POST** /invoice/getPaidInvoices | GET ALL PAID INVOICES
[**GetRefundInvoices**](InvoiceDataApi.md#getrefundinvoices) | **POST** /invoice/getRefundInvoices | GET ALL REFUND INVOICES
[**GetUnprocessedInvoices**](InvoiceDataApi.md#getunprocessedinvoices) | **POST** /invoice/getUnprocessedInvoices | GET ALL UNPROCESSED INVOICES


# **GetCancInvoices**
> SuccessInvoices GetCancInvoices (string apikey, InvoiceIDFull body)

GET ALL CANCELLED INVOICES

Gets All Cancelled Invoice Details.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetCancInvoicesExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceDataApi();
            var apikey = apikey_example;  // string | Enter User Key
            var body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices

            try
            {
                // GET ALL CANCELLED INVOICES
                SuccessInvoices result = apiInstance.GetCancInvoices(apikey, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceDataApi.GetCancInvoices: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCompleteInvoices**
> SuccessInvoices GetCompleteInvoices (string apikey, InvoiceIDFull body)

GET ALL COMPLETED INVOICES

Gets All Completed Invoice Details.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetCompleteInvoicesExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceDataApi();
            var apikey = apikey_example;  // string | Enter User Key
            var body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices

            try
            {
                // GET ALL COMPLETED INVOICES
                SuccessInvoices result = apiInstance.GetCompleteInvoices(apikey, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceDataApi.GetCompleteInvoices: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetConfInvoices**
> SuccessInvoices GetConfInvoices (string apikey, InvoiceIDFull body)

GET ALL CONFIRMED INVOICES

Gets All Confirmed Invoice Details.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetConfInvoicesExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceDataApi();
            var apikey = apikey_example;  // string | Enter User Key
            var body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices

            try
            {
                // GET ALL CONFIRMED INVOICES
                SuccessInvoices result = apiInstance.GetConfInvoices(apikey, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceDataApi.GetConfInvoices: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetInvoiceFromID**
> SuccessInvoice GetInvoiceFromID (string invoiceID, string apikey)

GET INVOICE FROM ID

Gets Details of an Invoice ID.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetInvoiceFromIDExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceDataApi();
            var invoiceID = invoiceID_example;  // string | 
            var apikey = apikey_example;  // string | Enter User Key

            try
            {
                // GET INVOICE FROM ID
                SuccessInvoice result = apiInstance.GetInvoiceFromID(invoiceID, apikey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceDataApi.GetInvoiceFromID: " + e.Message );
            }
        }
    }
}
```

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
> SuccessInvoices GetPaidInvoices (string apikey, InvoiceIDFull body)

GET ALL PAID INVOICES

Gets All Paid Invoice Details.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetPaidInvoicesExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceDataApi();
            var apikey = apikey_example;  // string | Enter User Key
            var body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices

            try
            {
                // GET ALL PAID INVOICES
                SuccessInvoices result = apiInstance.GetPaidInvoices(apikey, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceDataApi.GetPaidInvoices: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetRefundInvoices**
> SuccessInvoices GetRefundInvoices (string apikey, InvoiceIDFull body)

GET ALL REFUND INVOICES

Gets All Refund Invoice Details.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetRefundInvoicesExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceDataApi();
            var apikey = apikey_example;  // string | Enter User Key
            var body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices

            try
            {
                // GET ALL REFUND INVOICES
                SuccessInvoices result = apiInstance.GetRefundInvoices(apikey, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceDataApi.GetRefundInvoices: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetUnprocessedInvoices**
> SuccessInvoices GetUnprocessedInvoices (string apikey, InvoiceIDFull body)

GET ALL UNPROCESSED INVOICES

Gets All Unprocessed Invoice Details.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetUnprocessedInvoicesExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceDataApi();
            var apikey = apikey_example;  // string | Enter User Key
            var body = new InvoiceIDFull(); // InvoiceIDFull | Enter details to query Invoices

            try
            {
                // GET ALL UNPROCESSED INVOICES
                SuccessInvoices result = apiInstance.GetUnprocessedInvoices(apikey, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceDataApi.GetUnprocessedInvoices: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

