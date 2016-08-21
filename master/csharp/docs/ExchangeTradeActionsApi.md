# IO.Swagger.Api.ExchangeTradeActionsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1userexchangeaskcancelOrderID**](ExchangeTradeActionsApi.md#v1userexchangeaskcancelorderid) | **DELETE** /v1/user/exchange/ask/cancel/{orderID} | Cancel Open Sell Order
[**V1userexchangeasknew**](ExchangeTradeActionsApi.md#v1userexchangeasknew) | **PUT** /v1/user/exchange/ask/new | BTC Sell Order
[**V1userexchangebidcancelOrderID**](ExchangeTradeActionsApi.md#v1userexchangebidcancelorderid) | **DELETE** /v1/user/exchange/bid/cancel/{orderID} | Cancel Open Buy Order
[**V1userexchangebidnew**](ExchangeTradeActionsApi.md#v1userexchangebidnew) | **PUT** /v1/user/exchange/bid/new | BTC Buy Order
[**V1userexchangeinstantbuy**](ExchangeTradeActionsApi.md#v1userexchangeinstantbuy) | **PUT** /v1/user/exchange/instant/buy | Instantly Buy BTC
[**V1userexchangeinstantsell**](ExchangeTradeActionsApi.md#v1userexchangeinstantsell) | **PUT** /v1/user/exchange/instant/sell | Instantly Sell BTC


<a name="v1userexchangeaskcancelorderid"></a>
# **V1userexchangeaskcancelOrderID**
> SuccessCancelDataResponse V1userexchangeaskcancelOrderID (string orderID, string authorization = null)

Cancel Open Sell Order

Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangeaskcancelOrderIDExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeTradeActionsApi();
            var orderID = orderID_example;  // string | 
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 

            try
            {
                // Cancel Open Sell Order
                SuccessCancelDataResponse result = apiInstance.V1userexchangeaskcancelOrderID(orderID, authorization);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeTradeActionsApi.V1userexchangeaskcancelOrderID: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **string**|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 

### Return type

[**SuccessCancelDataResponse**](SuccessCancelDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangeasknew"></a>
# **V1userexchangeasknew**
> SuccessOrderDataResponse V1userexchangeasknew (RateVolData body, string authorization = null, string accept = null)

BTC Sell Order

Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangeasknewExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeTradeActionsApi();
            var body = new RateVolData(); // RateVolData | Please send the form with valid inputs.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // BTC Sell Order
                SuccessOrderDataResponse result = apiInstance.V1userexchangeasknew(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeTradeActionsApi.V1userexchangeasknew: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateVolData**](RateVolData.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebidcancelorderid"></a>
# **V1userexchangebidcancelOrderID**
> SuccessCancelDataResponse V1userexchangebidcancelOrderID (string orderID, string authorization = null)

Cancel Open Buy Order

Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebidcancelOrderIDExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeTradeActionsApi();
            var orderID = orderID_example;  // string | 
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 

            try
            {
                // Cancel Open Buy Order
                SuccessCancelDataResponse result = apiInstance.V1userexchangebidcancelOrderID(orderID, authorization);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeTradeActionsApi.V1userexchangebidcancelOrderID: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **string**|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 

### Return type

[**SuccessCancelDataResponse**](SuccessCancelDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebidnew"></a>
# **V1userexchangebidnew**
> SuccessOrderDataResponse V1userexchangebidnew (RateVolData body, string authorization = null, string accept = null)

BTC Buy Order

Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebidnewExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeTradeActionsApi();
            var body = new RateVolData(); // RateVolData | Please send the form with valid inputs.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // BTC Buy Order
                SuccessOrderDataResponse result = apiInstance.V1userexchangebidnew(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeTradeActionsApi.V1userexchangebidnew: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateVolData**](RateVolData.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangeinstantbuy"></a>
# **V1userexchangeinstantbuy**
> SuccessOrderDataResponse V1userexchangeinstantbuy (MinFiat body, string authorization = null, string accept = null)

Instantly Buy BTC

Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangeinstantbuyExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeTradeActionsApi();
            var body = new MinFiat(); // MinFiat | Please send the form with valid inputs.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Instantly Buy BTC
                SuccessOrderDataResponse result = apiInstance.V1userexchangeinstantbuy(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeTradeActionsApi.V1userexchangeinstantbuy: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinFiat**](MinFiat.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangeinstantsell"></a>
# **V1userexchangeinstantsell**
> SuccessOrderDataResponse V1userexchangeinstantsell (MaxVol body, string authorization = null, string accept = null)

Instantly Sell BTC

Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangeinstantsellExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeTradeActionsApi();
            var body = new MaxVol(); // MaxVol | Please send the form with valid inputs.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Instantly Sell BTC
                SuccessOrderDataResponse result = apiInstance.V1userexchangeinstantsell(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeTradeActionsApi.V1userexchangeinstantsell: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MaxVol**](MaxVol.md)| Please send the form with valid inputs. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

