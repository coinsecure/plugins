# IO.Swagger.Api.WalletActionsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1userwalletcoinaddressnew**](WalletActionsApi.md#v1userwalletcoinaddressnew) | **PUT** /v1/user/wallet/coin/address/new | New Bitcoin Address
[**V1userwalletcoinnew**](WalletActionsApi.md#v1userwalletcoinnew) | **PUT** /v1/user/wallet/coin/new | Create New Wallet
[**V1userwalletcoinwithdrawinitiate**](WalletActionsApi.md#v1userwalletcoinwithdrawinitiate) | **POST** /v1/user/wallet/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**V1userwalletcoinwithdrawsendToExchange**](WalletActionsApi.md#v1userwalletcoinwithdrawsendtoexchange) | **PUT** /v1/user/wallet/coin/withdraw/sendToExchange | Send to Exchange
[**V1userwalletcoinwithdrawunverifiedcancelWithdrawID**](WalletActionsApi.md#v1userwalletcoinwithdrawunverifiedcancelwithdrawid) | **DELETE** /v1/user/wallet/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
[**V1userwalletcoinwithdrawverify**](WalletActionsApi.md#v1userwalletcoinwithdrawverify) | **PUT** /v1/user/wallet/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**V1walletcoinwithdrawnewVerifycode**](WalletActionsApi.md#v1walletcoinwithdrawnewverifycode) | **POST** /v1/wallet/coin/withdraw/newVerifycode | Gets a Verification Code


<a name="v1userwalletcoinaddressnew"></a>
# **V1userwalletcoinaddressnew**
> WalletAddressDataResponse V1userwalletcoinaddressnew (NewAddress body, string authorization = null, string accept = null)

New Bitcoin Address

Generates a New Bitcoin Address to store coins.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userwalletcoinaddressnewExample
    {
        public void main()
        {
            
            var apiInstance = new WalletActionsApi();
            var body = new NewAddress(); // NewAddress | 
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // New Bitcoin Address
                WalletAddressDataResponse result = apiInstance.V1userwalletcoinaddressnew(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WalletActionsApi.V1userwalletcoinaddressnew: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewAddress**](NewAddress.md)|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userwalletcoinnew"></a>
# **V1userwalletcoinnew**
> WalletAddressDataResponse V1userwalletcoinnew (NewWallet body, string authorization = null, string accept = null)

Create New Wallet

Creates a New wallet to store addresses. This method also creates a single default address in each new wallet.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userwalletcoinnewExample
    {
        public void main()
        {
            
            var apiInstance = new WalletActionsApi();
            var body = new NewWallet(); // NewWallet | 
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Create New Wallet
                WalletAddressDataResponse result = apiInstance.V1userwalletcoinnew(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WalletActionsApi.V1userwalletcoinnew: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewWallet**](NewWallet.md)|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userwalletcoinwithdrawinitiate"></a>
# **V1userwalletcoinwithdrawinitiate**
> SuccessResult V1userwalletcoinwithdrawinitiate (SendCoinWallet body, string authorization = null, string accept = null)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userwalletcoinwithdrawinitiateExample
    {
        public void main()
        {
            
            var apiInstance = new WalletActionsApi();
            var body = new SendCoinWallet(); // SendCoinWallet | 
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Initiate Bitcoin Withdrawal
                SuccessResult result = apiInstance.V1userwalletcoinwithdrawinitiate(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WalletActionsApi.V1userwalletcoinwithdrawinitiate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendCoinWallet**](SendCoinWallet.md)|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userwalletcoinwithdrawsendtoexchange"></a>
# **V1userwalletcoinwithdrawsendToExchange**
> SuccessResult V1userwalletcoinwithdrawsendToExchange (SendExchange body, string authorization = null, string accept = null)

Send to Exchange

This function transfers funds to yout Exchange Balance without the need for any confirmations.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userwalletcoinwithdrawsendToExchangeExample
    {
        public void main()
        {
            
            var apiInstance = new WalletActionsApi();
            var body = new SendExchange(); // SendExchange | 
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Send to Exchange
                SuccessResult result = apiInstance.V1userwalletcoinwithdrawsendToExchange(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WalletActionsApi.V1userwalletcoinwithdrawsendToExchange: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendExchange**](SendExchange.md)|  | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userwalletcoinwithdrawunverifiedcancelwithdrawid"></a>
# **V1userwalletcoinwithdrawunverifiedcancelWithdrawID**
> SuccessResult V1userwalletcoinwithdrawunverifiedcancelWithdrawID (string withdrawID, string authorization, string accept = null)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userwalletcoinwithdrawunverifiedcancelWithdrawIDExample
    {
        public void main()
        {
            
            var apiInstance = new WalletActionsApi();
            var withdrawID = withdrawID_example;  // string | 
            var authorization = authorization_example;  // string | Enter a valid Api Key.
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Cancel Bitcoin Withdrawal
                SuccessResult result = apiInstance.V1userwalletcoinwithdrawunverifiedcancelWithdrawID(withdrawID, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WalletActionsApi.V1userwalletcoinwithdrawunverifiedcancelWithdrawID: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawID** | **string**|  | 
 **authorization** | **string**| Enter a valid Api Key. | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userwalletcoinwithdrawverify"></a>
# **V1userwalletcoinwithdrawverify**
> SuccessResult V1userwalletcoinwithdrawverify (string authorization, Code body, string accept = null)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userwalletcoinwithdrawverifyExample
    {
        public void main()
        {
            
            var apiInstance = new WalletActionsApi();
            var authorization = authorization_example;  // string | Enter a valid Api Key.
            var body = new Code(); // Code | 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Verify Bitcoin Withdrawal
                SuccessResult result = apiInstance.V1userwalletcoinwithdrawverify(authorization, body, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WalletActionsApi.V1userwalletcoinwithdrawverify: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Enter a valid Api Key. | 
 **body** | [**Code**](Code.md)|  | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1walletcoinwithdrawnewverifycode"></a>
# **V1walletcoinwithdrawnewVerifycode**
> SuccessResult V1walletcoinwithdrawnewVerifycode (WithdrawID body, string authorization = null, string accept = null)

Gets a Verification Code

Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1walletcoinwithdrawnewVerifycodeExample
    {
        public void main()
        {
            
            var apiInstance = new WalletActionsApi();
            var body = new WithdrawID(); // WithdrawID | You can get unverified withdraw ID's from /v1/exchange/bank/coin/withdrawVerifycode
            var authorization = authorization_example;  // string | API object to be added (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Gets a Verification Code
                SuccessResult result = apiInstance.V1walletcoinwithdrawnewVerifycode(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WalletActionsApi.V1walletcoinwithdrawnewVerifycode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawID**](WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/exchange/bank/coin/withdrawVerifycode | 
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

