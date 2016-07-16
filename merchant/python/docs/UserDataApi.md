# swagger_client.UserDataApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_merchant**](UserDataApi.md#get_merchant) | **GET** /user/getMerchant | GET MERCHANT


# **get_merchant**
> SuccessMerchant get_merchant(api_key)

GET MERCHANT

Gets a Summary of Merchant Data.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.UserDataApi()
api_key = 'api_key_example' # str | Enter User Key

try: 
    # GET MERCHANT
    api_response = api_instance.get_merchant(api_key)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling UserDataApi->get_merchant: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Enter User Key | 

### Return type

[**SuccessMerchant**](SuccessMerchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

