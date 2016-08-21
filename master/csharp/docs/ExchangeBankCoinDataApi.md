# IO.Swagger.Api.ExchangeBankCoinDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1userexchangebankcoinaddresses**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinaddresses) | **GET** /v1/user/exchange/bank/coin/addresses | Exchange Coin Addresses
[**V1userexchangebankcoinbalanceavailable**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalanceavailable) | **GET** /v1/user/exchange/bank/coin/balance/total | Available Exchange Coin Balance
[**V1userexchangebankcoinbalancepending**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancepending) | **GET** /v1/user/exchange/bank/coin/balance/pending | In Trade Coin Balance
[**V1userexchangebankcoinbalancetotal**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancetotal) | **GET** /v1/user/exchange/bank/coin/balance/available | Total Exchange Coin Balance
[**V1userexchangebankcoindepositcancelled**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositcancelled) | **GET** /v1/user/exchange/bank/coin/deposit/cancelled | Cancelled Exchange Coin Deposits
[**V1userexchangebankcoindepositunverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositunverified) | **GET** /v1/user/exchange/bank/coin/deposit/unverified | Unverified Exchange Coin Deposits
[**V1userexchangebankcoindepositverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositverified) | **GET** /v1/user/exchange/bank/coin/deposit/verified | Verified Exchange Coin Deposits
[**V1userexchangebankcoinwithdrawcancelled**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcancelled) | **GET** /v1/user/exchange/bank/coin/withdraw/cancelled | Cancelled Exchange Coin Withdrawals
[**V1userexchangebankcoinwithdrawcompleted**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcompleted) | **GET** /v1/user/exchange/bank/coin/withdraw/completed | Completed Exchange Coin Withdrawals
[**V1userexchangebankcoinwithdrawunverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawunverified) | **GET** /v1/user/exchange/bank/coin/withdraw/unverified | Unverified Exchange Coin Withdrawals
[**V1userexchangebankcoinwithdrawverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawverified) | **GET** /v1/user/exchange/bank/coin/withdraw/verified | Verified Exchange Coin Withdrawals


<a name="v1userexchangebankcoinaddresses"></a>
# **V1userexchangebankcoinaddresses**
> TradeAddressDataResponse V1userexchangebankcoinaddresses (string authorization, string accept = null)

Exchange Coin Addresses

Gets a List of Users Exchange Bitcoin Deposit Addresses.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinaddressesExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Exchange Coin Addresses
                TradeAddressDataResponse result = apiInstance.V1userexchangebankcoinaddresses(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoinaddresses: " + e.Message );
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

[**TradeAddressDataResponse**](TradeAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebankcoinbalanceavailable"></a>
# **V1userexchangebankcoinbalanceavailable**
> VolDataResponse V1userexchangebankcoinbalanceavailable (string authorization, string accept = null)

Available Exchange Coin Balance

Returns balance which is in Available for Trades. The response is in satoshis.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinbalanceavailableExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Available Exchange Coin Balance
                VolDataResponse result = apiInstance.V1userexchangebankcoinbalanceavailable(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoinbalanceavailable: " + e.Message );
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

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebankcoinbalancepending"></a>
# **V1userexchangebankcoinbalancepending**
> VolDataResponse V1userexchangebankcoinbalancepending (string authorization, string accept = null)

In Trade Coin Balance

Returns in-trade or pending coin balance in satoshi.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinbalancependingExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // In Trade Coin Balance
                VolDataResponse result = apiInstance.V1userexchangebankcoinbalancepending(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoinbalancepending: " + e.Message );
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

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebankcoinbalancetotal"></a>
# **V1userexchangebankcoinbalancetotal**
> VolDataResponse V1userexchangebankcoinbalancetotal (string authorization, string accept = null)

Total Exchange Coin Balance

Returns users total coin balance in satoshis. Pending + Available

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinbalancetotalExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Total Exchange Coin Balance
                VolDataResponse result = apiInstance.V1userexchangebankcoinbalancetotal(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoinbalancetotal: " + e.Message );
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

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebankcoindepositcancelled"></a>
# **V1userexchangebankcoindepositcancelled**
> CoinDepDataResponse V1userexchangebankcoindepositcancelled (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Cancelled Exchange Coin Deposits

Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoindepositcancelledExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Cancelled Exchange Coin Deposits
                CoinDepDataResponse result = apiInstance.V1userexchangebankcoindepositcancelled(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoindepositcancelled: " + e.Message );
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebankcoindepositunverified"></a>
# **V1userexchangebankcoindepositunverified**
> CoinDepDataResponse V1userexchangebankcoindepositunverified (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Unverified Exchange Coin Deposits

Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoindepositunverifiedExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Unverified Exchange Coin Deposits
                CoinDepDataResponse result = apiInstance.V1userexchangebankcoindepositunverified(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoindepositunverified: " + e.Message );
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebankcoindepositverified"></a>
# **V1userexchangebankcoindepositverified**
> CoinDepDataResponse V1userexchangebankcoindepositverified (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Verified Exchange Coin Deposits

Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoindepositverifiedExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Verified Exchange Coin Deposits
                CoinDepDataResponse result = apiInstance.V1userexchangebankcoindepositverified(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoindepositverified: " + e.Message );
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebankcoinwithdrawcancelled"></a>
# **V1userexchangebankcoinwithdrawcancelled**
> TradeCoinWithdrawDataResponse V1userexchangebankcoinwithdrawcancelled (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Cancelled Exchange Coin Withdrawals

Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinwithdrawcancelledExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Cancelled Exchange Coin Withdrawals
                TradeCoinWithdrawDataResponse result = apiInstance.V1userexchangebankcoinwithdrawcancelled(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoinwithdrawcancelled: " + e.Message );
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebankcoinwithdrawcompleted"></a>
# **V1userexchangebankcoinwithdrawcompleted**
> TradeCoinWithdrawDataResponse V1userexchangebankcoinwithdrawcompleted (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Completed Exchange Coin Withdrawals

Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinwithdrawcompletedExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Completed Exchange Coin Withdrawals
                TradeCoinWithdrawDataResponse result = apiInstance.V1userexchangebankcoinwithdrawcompleted(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoinwithdrawcompleted: " + e.Message );
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebankcoinwithdrawunverified"></a>
# **V1userexchangebankcoinwithdrawunverified**
> TradeCoinWithdrawDataResponse V1userexchangebankcoinwithdrawunverified (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Unverified Exchange Coin Withdrawals

Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinwithdrawunverifiedExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Unverified Exchange Coin Withdrawals
                TradeCoinWithdrawDataResponse result = apiInstance.V1userexchangebankcoinwithdrawunverified(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoinwithdrawunverified: " + e.Message );
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangebankcoinwithdrawverified"></a>
# **V1userexchangebankcoinwithdrawverified**
> TradeCoinWithdrawDataResponse V1userexchangebankcoinwithdrawverified (string authorization, long? from = null, long? to = null, int? max = null, long? offset = null, string accept = null)

Verified Exchange Coin Withdrawals

Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinwithdrawverifiedExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankCoinDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var from = 789;  // long? | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional)  (default to 0)
            var to = 789;  // long? | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional)  (default to 9223372036854776000)
            var max = 56;  // int? | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional)  (default to 10)
            var offset = 789;  // long? | Offset defaults to 0 if input is invalid. (Optional) (optional)  (default to 0)
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Verified Exchange Coin Withdrawals
                TradeCoinWithdrawDataResponse result = apiInstance.V1userexchangebankcoinwithdrawverified(authorization, from, to, max, offset, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankCoinDataApi.V1userexchangebankcoinwithdrawverified: " + e.Message );
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

