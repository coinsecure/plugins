# UserDataApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchant**](UserDataApi.md#getMerchant) | **GET** /user/getMerchant | GET MERCHANT


<a name="getMerchant"></a>
# **getMerchant**
> SuccessMerchant getMerchant(apiKey)

GET MERCHANT

Gets a Summary of Merchant Data.

### Example
```java
// Import classes:
//import io.swagger.client.api.UserDataApi;

UserDataApi apiInstance = new UserDataApi();
String apiKey = "apiKey_example"; // String | Enter User Key
try {
    SuccessMerchant result = apiInstance.getMerchant(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserDataApi#getMerchant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Enter User Key |

### Return type

[**SuccessMerchant**](SuccessMerchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

