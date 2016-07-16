# IO.Swagger.Api.ExchangeBankFiatDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1userexchangebankfiataccounts**](ExchangeBankFiatDataApi.md#v1userexchangebankfiataccounts) | **GET** /v1/user/exchange/bank/fiat/accounts | Exchange Bitcoin Deposit Addresses
[**V1userexchangebankfiatbalanceavailable**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalanceavailable) | **GET** /v1/user/exchange/bank/fiat/balance/total | Available Exchange Fiat Balance
[**V1userexchangebankfiatbalancepending**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancepending) | **GET** /v1/user/exchange/bank/fiat/balance/pending | In Trade Coin Balance
[**V1userexchangebankfiatbalancetotal**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancetotal) | **GET** /v1/user/exchange/bank/fiat/balance/available | Total Exchange Fiat Balance
[**V1userexchangebankfiatdepositcancelled**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositcancelled) | **GET** /v1/user/exchange/bank/fiat/deposit/cancelled | Cancelled Exchange Fiat Deposits
[**V1userexchangebankfiatdepositunverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositunverified) | **GET** /v1/user/exchange/bank/fiat/deposit/unverified | Unverified Exchange Fiat Deposits
[**V1userexchangebankfiatdepositverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositverified) | **GET** /v1/user/exchange/bank/fiat/deposit/verified | Verified Exchange Fiat Deposits
[**V1userexchangebankfiatwithdrawcancelled**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcancelled) | **GET** /v1/user/exchange/bank/fiat/withdraw/cancelled | Cancelled Exchange Fiat Withdrawals
[**V1userexchangebankfiatwithdrawcompleted**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcompleted) | **GET** /v1/user/exchange/bank/fiat/withdraw/completed | Completed Exchange Fiat Withdrawals
[**V1userexchangebankfiatwithdrawunverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawunverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/unverified | Unverified Exchange Fiat Withdrawals
[**V1userexchangebankfiatwithdrawverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/verified | Verified Exchange Fiat Withdrawals


# **V1userexchangebankfiataccounts**
> FiatBankDataResponse V1userexchangebankfiataccounts (string authorization, string accept = null)

Exchange Bitcoin Deposit Addresses

Gets a List of Users Exchange Bitcoin Addresses.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiataccountsExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Exchange Bitcoin Deposit Addresses
                FiatBankDataResponse result = apiInstance.V1userexchangebankfiataccounts(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiataccounts: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatBankDataResponse**](FiatBankDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatbalanceavailable**
> RateDataResponse V1userexchangebankfiatbalanceavailable (string authorization, string accept = null)

Available Exchange Fiat Balance

Returns balance which is in Available for Trades. The response is in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatbalanceavailableExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Available Exchange Fiat Balance
                RateDataResponse result = apiInstance.V1userexchangebankfiatbalanceavailable(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiatbalanceavailable: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatbalancepending**
> RateDataResponse V1userexchangebankfiatbalancepending (string authorization, string accept = null)

In Trade Coin Balance

Returns in-trade or pending fiat balance in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatbalancependingExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // In Trade Coin Balance
                RateDataResponse result = apiInstance.V1userexchangebankfiatbalancepending(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiatbalancepending: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatbalancetotal**
> RateDataResponse V1userexchangebankfiatbalancetotal (string authorization, string accept = null)

Total Exchange Fiat Balance

Returns users total fiat balance in paisa. Pending + Available

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatbalancetotalExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Total Exchange Fiat Balance
                RateDataResponse result = apiInstance.V1userexchangebankfiatbalancetotal(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiatbalancetotal: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatdepositcancelled**
> FiatDepDataResponse V1userexchangebankfiatdepositcancelled (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Cancelled Exchange Fiat Deposits

Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatdepositcancelledExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Cancelled Exchange Fiat Deposits
                FiatDepDataResponse result = apiInstance.V1userexchangebankfiatdepositcancelled(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiatdepositcancelled: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **long?**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **long?**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int?**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **long?**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatdepositunverified**
> FiatDepDataResponse V1userexchangebankfiatdepositunverified (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Unverified Exchange Fiat Deposits

Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatdepositunverifiedExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Unverified Exchange Fiat Deposits
                FiatDepDataResponse result = apiInstance.V1userexchangebankfiatdepositunverified(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiatdepositunverified: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **long?**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **long?**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int?**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **long?**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatdepositverified**
> FiatDepDataResponse V1userexchangebankfiatdepositverified (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Verified Exchange Fiat Deposits

Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatdepositverifiedExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Verified Exchange Fiat Deposits
                FiatDepDataResponse result = apiInstance.V1userexchangebankfiatdepositverified(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiatdepositverified: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **long?**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **long?**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int?**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **long?**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawcancelled**
> FiatWithDataResponse V1userexchangebankfiatwithdrawcancelled (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Cancelled Exchange Fiat Withdrawals

Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatwithdrawcancelledExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Cancelled Exchange Fiat Withdrawals
                FiatWithDataResponse result = apiInstance.V1userexchangebankfiatwithdrawcancelled(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiatwithdrawcancelled: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **long?**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **long?**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int?**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **long?**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawcompleted**
> FiatWithDataResponse V1userexchangebankfiatwithdrawcompleted (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Completed Exchange Fiat Withdrawals

Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatwithdrawcompletedExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Completed Exchange Fiat Withdrawals
                FiatWithDataResponse result = apiInstance.V1userexchangebankfiatwithdrawcompleted(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiatwithdrawcompleted: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **long?**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **long?**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int?**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **long?**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawunverified**
> FiatWithDataResponse V1userexchangebankfiatwithdrawunverified (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Unverified Exchange Fiat Withdrawals

Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatwithdrawunverifiedExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Unverified Exchange Fiat Withdrawals
                FiatWithDataResponse result = apiInstance.V1userexchangebankfiatwithdrawunverified(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiatwithdrawunverified: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **long?**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **long?**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int?**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **long?**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1userexchangebankfiatwithdrawverified**
> FiatWithDataResponse V1userexchangebankfiatwithdrawverified (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Verified Exchange Fiat Withdrawals

Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatwithdrawverifiedExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankFiatDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Verified Exchange Fiat Withdrawals
                FiatWithDataResponse result = apiInstance.V1userexchangebankfiatwithdrawverified(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankFiatDataApi.V1userexchangebankfiatwithdrawverified: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | 
 **from** | **long?**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **long?**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int?**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **long?**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

