# IO.Swagger.Api.AccountDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1exchangebanksummary**](AccountDataApi.md#v1exchangebanksummary) | **GET** /v1/user/exchange/bank/summary | Exchange Bank Summary
[**V1exchangeusercoinfee**](AccountDataApi.md#v1exchangeusercoinfee) | **GET** /v1/user/exchange/coin/fee | Users Coin Fee Percentage
[**V1exchangeuserfiatfee**](AccountDataApi.md#v1exchangeuserfiatfee) | **GET** /v1/user/exchange/fiat/fee | Users Fiat Fee Percentage
[**V1netkisearchNetkiName**](AccountDataApi.md#v1netkisearchnetkiname) | **GET** /v1/netki/search/{netkiName} | Coinsecure.me Netki Lookup
[**V1userexchangekycs**](AccountDataApi.md#v1userexchangekycs) | **GET** /v1/user/exchange/kycs | Gets KYC Status Details
[**V1userexchangereferralcoinpaid**](AccountDataApi.md#v1userexchangereferralcoinpaid) | **GET** /v1/user/exchange/referral/coin/paid | Users Paid Fiat Referrals
[**V1userexchangereferralcoinsuccessful**](AccountDataApi.md#v1userexchangereferralcoinsuccessful) | **GET** /v1/user/exchange/referral/coin/successful | Gets Users Successful Referral Links
[**V1userexchangereferralfiatpaid**](AccountDataApi.md#v1userexchangereferralfiatpaid) | **GET** /v1/user/exchange/referral/fiat/paid | Users Paid Fiat Referrals
[**V1userexchangereferrals**](AccountDataApi.md#v1userexchangereferrals) | **GET** /v1/user/exchange/referrals | Gets Users Referral Links
[**V1userexchangetradesummary**](AccountDataApi.md#v1userexchangetradesummary) | **GET** /v1/user/exchange/trade/summary | Exchange Trade Summary
[**V1userlogintokenToken**](AccountDataApi.md#v1userlogintokentoken) | **GET** /v1/user/login/token/{token} | Login Token Email
[**V1usersummary**](AccountDataApi.md#v1usersummary) | **GET** /v1/user/summary | Exchange Bank Summary
[**V1userwalletsummary**](AccountDataApi.md#v1userwalletsummary) | **GET** /v1/user/wallet/summary | Exchange Bank Summary


<a name="v1exchangebanksummary"></a>
# **V1exchangebanksummary**
> BankSummaryDataResponse V1exchangebanksummary (string authorization, string accept = null)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1exchangebanksummaryExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Exchange Bank Summary
                BankSummaryDataResponse result = apiInstance.V1exchangebanksummary(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1exchangebanksummary: " + e.Message );
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

[**BankSummaryDataResponse**](BankSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1exchangeusercoinfee"></a>
# **V1exchangeusercoinfee**
> DoubleDataResponse V1exchangeusercoinfee (string authorization = null, string accept = null)

Users Coin Fee Percentage

Returns the users coin fee percentage. The response is in percentage.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1exchangeusercoinfeeExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Users Coin Fee Percentage
                DoubleDataResponse result = apiInstance.V1exchangeusercoinfee(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1exchangeusercoinfee: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1exchangeuserfiatfee"></a>
# **V1exchangeuserfiatfee**
> DoubleDataResponse V1exchangeuserfiatfee (string authorization, string accept = null)

Users Fiat Fee Percentage

Returns the users fiat fee percentage. The response is in percentage.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1exchangeuserfiatfeeExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Users Fiat Fee Percentage
                DoubleDataResponse result = apiInstance.V1exchangeuserfiatfee(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1exchangeuserfiatfee: " + e.Message );
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

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1netkisearchnetkiname"></a>
# **V1netkisearchNetkiName**
> DoubleDataResponse V1netkisearchNetkiName (string netkiName, string accept = null)

Coinsecure.me Netki Lookup

Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1netkisearchNetkiNameExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var netkiName = netkiName_example;  // string | 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Coinsecure.me Netki Lookup
                DoubleDataResponse result = apiInstance.V1netkisearchNetkiName(netkiName, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1netkisearchNetkiName: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netkiName** | **string**|  | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangekycs"></a>
# **V1userexchangekycs**
> KYCDataResponse V1userexchangekycs (string authorization, string accept = null)

Gets KYC Status Details

Gets Users KYC Status Details.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangekycsExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Gets KYC Status Details
                KYCDataResponse result = apiInstance.V1userexchangekycs(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1userexchangekycs: " + e.Message );
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

[**KYCDataResponse**](KYCDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangereferralcoinpaid"></a>
# **V1userexchangereferralcoinpaid**
> SuccCoinRefDataResponse V1userexchangereferralcoinpaid (string authorization, string accept = null)

Users Paid Fiat Referrals

Returns the Users Paid Coin Referrals.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangereferralcoinpaidExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Users Paid Fiat Referrals
                SuccCoinRefDataResponse result = apiInstance.V1userexchangereferralcoinpaid(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1userexchangereferralcoinpaid: " + e.Message );
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

[**SuccCoinRefDataResponse**](SuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangereferralcoinsuccessful"></a>
# **V1userexchangereferralcoinsuccessful**
> SuccRefDataResponse V1userexchangereferralcoinsuccessful (string authorization, string accept = null)

Gets Users Successful Referral Links

Gets Users Successful Referral Links that can be used during signup.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangereferralcoinsuccessfulExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Gets Users Successful Referral Links
                SuccRefDataResponse result = apiInstance.V1userexchangereferralcoinsuccessful(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1userexchangereferralcoinsuccessful: " + e.Message );
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

[**SuccRefDataResponse**](SuccRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangereferralfiatpaid"></a>
# **V1userexchangereferralfiatpaid**
> SuccCoinRefDataResponse V1userexchangereferralfiatpaid (string authorization, string accept = null)

Users Paid Fiat Referrals

Returns the Users Paid Fiat Referrals.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangereferralfiatpaidExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Users Paid Fiat Referrals
                SuccCoinRefDataResponse result = apiInstance.V1userexchangereferralfiatpaid(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1userexchangereferralfiatpaid: " + e.Message );
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

[**SuccCoinRefDataResponse**](SuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangereferrals"></a>
# **V1userexchangereferrals**
> AllRefDataResponse V1userexchangereferrals (string authorization, string accept = null)

Gets Users Referral Links

Gets Users Referral Links that can be used during signup.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangereferralsExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Gets Users Referral Links
                AllRefDataResponse result = apiInstance.V1userexchangereferrals(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1userexchangereferrals: " + e.Message );
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

[**AllRefDataResponse**](AllRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangetradesummary"></a>
# **V1userexchangetradesummary**
> TradeSummaryDataResponse V1userexchangetradesummary (string authorization, string accept = null)

Exchange Trade Summary

Gets a Summary of Exchange Trade Data.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangetradesummaryExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Exchange Trade Summary
                TradeSummaryDataResponse result = apiInstance.V1userexchangetradesummary(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1userexchangetradesummary: " + e.Message );
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

[**TradeSummaryDataResponse**](TradeSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userlogintokentoken"></a>
# **V1userlogintokenToken**
> SuccessResult V1userlogintokenToken (string token, string accept = null)

Login Token Email

Retrieves details of a Login Token

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userlogintokenTokenExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var token = token_example;  // string | 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Login Token Email
                SuccessResult result = apiInstance.V1userlogintokenToken(token, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1userlogintokenToken: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1usersummary"></a>
# **V1usersummary**
> UserSummaryDataResponse V1usersummary (string authorization, string accept = null)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1usersummaryExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Exchange Bank Summary
                UserSummaryDataResponse result = apiInstance.V1usersummary(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1usersummary: " + e.Message );
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

[**UserSummaryDataResponse**](UserSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userwalletsummary"></a>
# **V1userwalletsummary**
> WalletSummaryDataResponse V1userwalletsummary (string authorization, string accept = null)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userwalletsummaryExample
    {
        public void main()
        {
            
            var apiInstance = new AccountDataApi();
            var authorization = authorization_example;  // string | API object to be added
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Exchange Bank Summary
                WalletSummaryDataResponse result = apiInstance.V1userwalletsummary(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountDataApi.V1userwalletsummary: " + e.Message );
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

[**WalletSummaryDataResponse**](WalletSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

