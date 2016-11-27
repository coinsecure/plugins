# IO.Swagger.Api.ExchangeBankActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1userexchangebankcoinwithdrawinitiate**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawinitiate) | **POST** /v1/user/exchange/bank/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**V1userexchangebankcoinwithdrawnewVerifycode**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawnewverifycode) | **POST** /v1/user/exchange/bank/coin/withdraw/newVerifycode | Gets a Verification Code.
[**V1userexchangebankcoinwithdrawunverifiedcancelWithdrawID**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawunverifiedcancelwithdrawid) | **DELETE** /v1/user/exchange/bank/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
[**V1userexchangebankcoinwithdrawverify**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawverify) | **PUT** /v1/user/exchange/bank/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**V1userexchangebankfiataccountnew**](ExchangeBankActionsApi.md#v1userexchangebankfiataccountnew) | **PUT** /v1/user/exchange/bank/fiat/account/new | New Bank Link
[**V1userexchangebankfiatdepositcancelDepositID**](ExchangeBankActionsApi.md#v1userexchangebankfiatdepositcanceldepositid) | **DELETE** /v1/user/exchange/bank/fiat/deposit/cancel/{depositID} | Cancel Unverified Exchange Fiat Deposit
[**V1userexchangebankfiatdepositnew**](ExchangeBankActionsApi.md#v1userexchangebankfiatdepositnew) | **PUT** /v1/user/exchange/bank/fiat/deposit/new | New Exchange Fiat Deposit
[**V1userexchangebankfiatwithdrawinitiate**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawinitiate) | **POST** /v1/user/exchange/bank/fiat/withdraw/initiate | Initiate Fiat Withdrawal
[**V1userexchangebankfiatwithdrawnewVerifycode**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawnewverifycode) | **POST** /v1/user/exchange/bank/fiat/withdraw/newVerifycode | Gets a Fiat Verification Code.
[**V1userexchangebankfiatwithdrawunverifiedcancelWithdrawID**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawunverifiedcancelwithdrawid) | **DELETE** /v1/user/exchange/bank/fiat/withdraw/unverified/cancel/{withdrawID} | Cancel Fiat Withdrawal
[**V1userexchangebankfiatwithdrawverify**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawverify) | **PUT** /v1/user/exchange/bank/fiat/withdraw/verify | Verify Fiat Withdrawal


<a name="v1userexchangebankcoinwithdrawinitiate"></a>
# **V1userexchangebankcoinwithdrawinitiate**
> SuccessResult V1userexchangebankcoinwithdrawinitiate (SendCoin body, string authorization = null, string accept = null)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinwithdrawinitiateExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var body = new SendCoin(); // SendCoin | Please send the form with valid inputs.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Initiate Bitcoin Withdrawal
                SuccessResult result = apiInstance.V1userexchangebankcoinwithdrawinitiate(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankcoinwithdrawinitiate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendCoin**](SendCoin.md)| Please send the form with valid inputs. | 
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

<a name="v1userexchangebankcoinwithdrawnewverifycode"></a>
# **V1userexchangebankcoinwithdrawnewVerifycode**
> SuccessResult V1userexchangebankcoinwithdrawnewVerifycode (WithdrawID body, string authorization = null, string accept = null)

Gets a Verification Code.

Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinwithdrawnewVerifycodeExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var body = new WithdrawID(); // WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/coin/withdraw/unverified
            var authorization = authorization_example;  // string | API object to be added (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Gets a Verification Code.
                SuccessResult result = apiInstance.V1userexchangebankcoinwithdrawnewVerifycode(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankcoinwithdrawnewVerifycode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawID**](WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified | 
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

<a name="v1userexchangebankcoinwithdrawunverifiedcancelwithdrawid"></a>
# **V1userexchangebankcoinwithdrawunverifiedcancelWithdrawID**
> SuccessResult V1userexchangebankcoinwithdrawunverifiedcancelWithdrawID (string withdrawID, string authorization = null, string accept = null)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinwithdrawunverifiedcancelWithdrawIDExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var withdrawID = withdrawID_example;  // string | 
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Cancel Bitcoin Withdrawal
                SuccessResult result = apiInstance.V1userexchangebankcoinwithdrawunverifiedcancelWithdrawID(withdrawID, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankcoinwithdrawunverifiedcancelWithdrawID: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawID** | **string**|  | 
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

<a name="v1userexchangebankcoinwithdrawverify"></a>
# **V1userexchangebankcoinwithdrawverify**
> SuccessResult V1userexchangebankcoinwithdrawverify (Code body, string authorization = null, string accept = null)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankcoinwithdrawverifyExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var body = new Code(); // Code | You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Verify Bitcoin Withdrawal
                SuccessResult result = apiInstance.V1userexchangebankcoinwithdrawverify(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankcoinwithdrawverify: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode. | 
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

<a name="v1userexchangebankfiataccountnew"></a>
# **V1userexchangebankfiataccountnew**
> SuccessResult V1userexchangebankfiataccountnew (NewBankForm body, string authorization = null, string accept = null)

New Bank Link

Submits a New Bank Link on KYC Verified Accounts.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiataccountnewExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var body = new NewBankForm(); // NewBankForm | Please send the form with valid inputs.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // New Bank Link
                SuccessResult result = apiInstance.V1userexchangebankfiataccountnew(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankfiataccountnew: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewBankForm**](NewBankForm.md)| Please send the form with valid inputs. | 
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

<a name="v1userexchangebankfiatdepositcanceldepositid"></a>
# **V1userexchangebankfiatdepositcancelDepositID**
> SuccessResult V1userexchangebankfiatdepositcancelDepositID (string depositID, string authorization = null, string accept = null)

Cancel Unverified Exchange Fiat Deposit

Cancels an unverified Exchange Fiat Deposit.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatdepositcancelDepositIDExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var depositID = depositID_example;  // string | 
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Cancel Unverified Exchange Fiat Deposit
                SuccessResult result = apiInstance.V1userexchangebankfiatdepositcancelDepositID(depositID, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankfiatdepositcancelDepositID: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositID** | **string**|  | 
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

<a name="v1userexchangebankfiatdepositnew"></a>
# **V1userexchangebankfiatdepositnew**
> SuccessResult V1userexchangebankfiatdepositnew (NewFiatBankDeposit body, string authorization = null, string accept = null)

New Exchange Fiat Deposit

Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatdepositnewExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var body = new NewFiatBankDeposit(); // NewFiatBankDeposit | Please send the form with valid inputs.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // New Exchange Fiat Deposit
                SuccessResult result = apiInstance.V1userexchangebankfiatdepositnew(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankfiatdepositnew: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewFiatBankDeposit**](NewFiatBankDeposit.md)| Please send the form with valid inputs. | 
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

<a name="v1userexchangebankfiatwithdrawinitiate"></a>
# **V1userexchangebankfiatwithdrawinitiate**
> SuccessResult V1userexchangebankfiatwithdrawinitiate (WithdrawFiat body, string authorization = null, string accept = null)

Initiate Fiat Withdrawal

The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatwithdrawinitiateExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var body = new WithdrawFiat(); // WithdrawFiat | Please send the form with valid inputs.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Initiate Fiat Withdrawal
                SuccessResult result = apiInstance.V1userexchangebankfiatwithdrawinitiate(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankfiatwithdrawinitiate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawFiat**](WithdrawFiat.md)| Please send the form with valid inputs. | 
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

<a name="v1userexchangebankfiatwithdrawnewverifycode"></a>
# **V1userexchangebankfiatwithdrawnewVerifycode**
> SuccessResult V1userexchangebankfiatwithdrawnewVerifycode (WithdrawID body, string authorization = null, string accept = null)

Gets a Fiat Verification Code.

Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatwithdrawnewVerifycodeExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var body = new WithdrawID(); // WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/fiat/withdraw/unverified
            var authorization = authorization_example;  // string | API object to be added (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Gets a Fiat Verification Code.
                SuccessResult result = apiInstance.V1userexchangebankfiatwithdrawnewVerifycode(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankfiatwithdrawnewVerifycode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawID**](WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified | 
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

<a name="v1userexchangebankfiatwithdrawunverifiedcancelwithdrawid"></a>
# **V1userexchangebankfiatwithdrawunverifiedcancelWithdrawID**
> SuccessResult V1userexchangebankfiatwithdrawunverifiedcancelWithdrawID (string withdrawID, string authorization = null, string accept = null)

Cancel Fiat Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatwithdrawunverifiedcancelWithdrawIDExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var withdrawID = withdrawID_example;  // string | 
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Cancel Fiat Withdrawal
                SuccessResult result = apiInstance.V1userexchangebankfiatwithdrawunverifiedcancelWithdrawID(withdrawID, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankfiatwithdrawunverifiedcancelWithdrawID: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawID** | **string**|  | 
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

<a name="v1userexchangebankfiatwithdrawverify"></a>
# **V1userexchangebankfiatwithdrawverify**
> SuccessResult V1userexchangebankfiatwithdrawverify (Code body, string authorization = null, string accept = null)

Verify Fiat Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangebankfiatwithdrawverifyExample
    {
        public void main()
        {
            
            var apiInstance = new ExchangeBankActionsApi();
            var body = new Code(); // Code | You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Verify Fiat Withdrawal
                SuccessResult result = apiInstance.V1userexchangebankfiatwithdrawverify(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExchangeBankActionsApi.V1userexchangebankfiatwithdrawverify: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode | 
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

