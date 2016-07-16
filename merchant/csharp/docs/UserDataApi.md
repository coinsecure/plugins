# IO.Swagger.Api.UserDataApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetMerchant**](UserDataApi.md#getmerchant) | **GET** /user/getMerchant | GET MERCHANT


# **GetMerchant**
> SuccessMerchant GetMerchant (string apiKey)

GET MERCHANT

Gets a Summary of Merchant Data.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetMerchantExample
    {
        public void main()
        {
            
            var apiInstance = new UserDataApi();
            var apiKey = apiKey_example;  // string | Enter User Key

            try
            {
                // GET MERCHANT
                SuccessMerchant result = apiInstance.GetMerchant(apiKey);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserDataApi.GetMerchant: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **string**| Enter User Key | 

### Return type

[**SuccessMerchant**](SuccessMerchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

