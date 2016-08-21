# IO.Swagger.Api.AccountActionsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1login**](AccountActionsApi.md#v1login) | **POST** /v1/login | Creates a Login Instance and returns an API Key.
[**V1logininitiate**](AccountActionsApi.md#v1logininitiate) | **POST** /v1/login/initiate | Initiate Login
[**V1loginpasswordforgot**](AccountActionsApi.md#v1loginpasswordforgot) | **POST** /v1/login/password/forgot | Sends an email with a password reset token
[**V1signup**](AccountActionsApi.md#v1signup) | **POST** /v1/signup | Creates a new Unverified Account.
[**V1userbankotpNumber**](AccountActionsApi.md#v1userbankotpnumber) | **GET** /v1/user/bank/otp/{number} | Send OTP for Bank Link
[**V1userexchangekyc**](AccountActionsApi.md#v1userexchangekyc) | **PUT** /v1/user/exchange/kyc | Submits a New Bank Link and initial KYC Documents.
[**V1usergcmCode**](AccountActionsApi.md#v1usergcmcode) | **DELETE** /v1/user/gcm/{code} | Delete GCM Code
[**V1userkycotpNumber**](AccountActionsApi.md#v1userkycotpnumber) | **GET** /v1/user/kyc/otp/{number} | Send OTP for KYC Link
[**V1userlogout**](AccountActionsApi.md#v1userlogout) | **DELETE** /v1/user/logout | Logout User
[**V1usernetkicreate**](AccountActionsApi.md#v1usernetkicreate) | **PUT** /v1/user/netki/create | Create Neki Wallet Name
[**V1usernetkiupdate**](AccountActionsApi.md#v1usernetkiupdate) | **POST** /v1/user/netki/update | Update Netki Address
[**V1userprofileimagedeleteNetkiName**](AccountActionsApi.md#v1userprofileimagedeletenetkiname) | **DELETE** /v1/user/profile/image/delete/{netkiName} | Delete Profile Image
[**V1userprofileimageupdate**](AccountActionsApi.md#v1userprofileimageupdate) | **POST** /v1/user/profile/image/update | Update Profile Image
[**V1userprofilephone**](AccountActionsApi.md#v1userprofilephone) | **PUT** /v1/user/profile/phone/new | New Profile Phone
[**V1userprofilephoneNumber**](AccountActionsApi.md#v1userprofilephonenumber) | **DELETE** /v1/user/profile/phone/delete | Delete Profile Phone Number
[**V1userprofilephoneotpNumber**](AccountActionsApi.md#v1userprofilephoneotpnumber) | **GET** /v1/user/profile/phone/otp/{number} | Send OTP for Profile Phone


<a name="v1login"></a>
# **V1login**
> StandardLoginResultData V1login (LoginFormNew body, string accept = null)

Creates a Login Instance and returns an API Key.

Creates a Login Instance and returns an API Key

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1loginExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var body = new LoginFormNew(); // LoginFormNew | Please send the form with valid inputs.
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Creates a Login Instance and returns an API Key.
                StandardLoginResultData result = apiInstance.V1login(body, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1login: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginFormNew**](LoginFormNew.md)| Please send the form with valid inputs. | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**StandardLoginResultData**](StandardLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1logininitiate"></a>
# **V1logininitiate**
> StandardInitiateLoginResultData V1logininitiate (LoginId body, string accept = null)

Initiate Login

Sends an Email with a Verification Link.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1logininitiateExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var body = new LoginId(); // LoginId | Enter a valid Login ID. This method will send an email with a token to be used for login.
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Initiate Login
                StandardInitiateLoginResultData result = apiInstance.V1logininitiate(body, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1logininitiate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginId**](LoginId.md)| Enter a valid Login ID. This method will send an email with a token to be used for login. | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**StandardInitiateLoginResultData**](StandardInitiateLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1loginpasswordforgot"></a>
# **V1loginpasswordforgot**
> SuccessResult V1loginpasswordforgot (Email body, string accept = null)

Sends an email with a password reset token

Sends an email with a password reset token

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1loginpasswordforgotExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var body = new Email(); // Email | Enter a valid and registered Email ID.
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Sends an email with a password reset token
                SuccessResult result = apiInstance.V1loginpasswordforgot(body, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1loginpasswordforgot: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Email**](Email.md)| Enter a valid and registered Email ID. | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1signup"></a>
# **V1signup**
> SuccessResult V1signup (SignupForm body, string accept = null)

Creates a new Unverified Account.

Creates a new Unverified Account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1signupExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var body = new SignupForm(); // SignupForm | Please send the form with valid inputs.
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Creates a new Unverified Account.
                SuccessResult result = apiInstance.V1signup(body, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1signup: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SignupForm**](SignupForm.md)| Please send the form with valid inputs. | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userbankotpnumber"></a>
# **V1userbankotpNumber**
> StandardInitiateLoginResultData V1userbankotpNumber (string number, string authorization = null, string accept = null)

Send OTP for Bank Link

Send OTP for an additional Bank Link.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userbankotpNumberExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var number = number_example;  // string | 
            var authorization = authorization_example;  // string | API object to be added (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Send OTP for Bank Link
                StandardInitiateLoginResultData result = apiInstance.V1userbankotpNumber(number, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1userbankotpNumber: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **string**|  | 
 **authorization** | **string**| API object to be added | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**StandardInitiateLoginResultData**](StandardInitiateLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userexchangekyc"></a>
# **V1userexchangekyc**
> SuccessResult V1userexchangekyc (string panNumber, string acctNick, string name, string ban, string ifsc, string acctType, string banType, string phone, string otp, System.IO.Stream file, string authorization = null, string message = null, string accept = null)

Submits a New Bank Link and initial KYC Documents.

Submits a New Bank Link and initial KYC Documents.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userexchangekycExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var panNumber = panNumber_example;  // string | Please enter your Pan Card Number
            var acctNick = acctNick_example;  // string | Please enter an Account NickName
            var name = name_example;  // string | Please enter your Name as it appears on your Bank account.
            var ban = ban_example;  // string | Please enter your Bank account number.
            var ifsc = ifsc_example;  // string | Please enter your IFSC Code.
            var acctType = acctType_example;  // string | Please enter your Coinsecure account type. Allowable Values are Personal or Company.
            var banType = banType_example;  // string | Please enter your Bank account type. Allowable Values are Savings or Current.
            var phone = phone_example;  // string | Please enter your Valid Phone Number.
            var otp = otp_example;  // string | Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number.
            var file = new System.IO.Stream(); // System.IO.Stream | Enter a valid image, pdf or zip file under 5 MB in size.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var message = message_example;  // string | Please enter an optional message if needed. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Submits a New Bank Link and initial KYC Documents.
                SuccessResult result = apiInstance.V1userexchangekyc(panNumber, acctNick, name, ban, ifsc, acctType, banType, phone, otp, file, authorization, message, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1userexchangekyc: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **panNumber** | **string**| Please enter your Pan Card Number | 
 **acctNick** | **string**| Please enter an Account NickName | 
 **name** | **string**| Please enter your Name as it appears on your Bank account. | 
 **ban** | **string**| Please enter your Bank account number. | 
 **ifsc** | **string**| Please enter your IFSC Code. | 
 **acctType** | **string**| Please enter your Coinsecure account type. Allowable Values are Personal or Company. | 
 **banType** | **string**| Please enter your Bank account type. Allowable Values are Savings or Current. | 
 **phone** | **string**| Please enter your Valid Phone Number. | 
 **otp** | **string**| Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number. | 
 **file** | **System.IO.Stream**| Enter a valid image, pdf or zip file under 5 MB in size. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **message** | **string**| Please enter an optional message if needed. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1usergcmcode"></a>
# **V1usergcmCode**
> SuccessResult V1usergcmCode (string code, string authorization = null, string accept = null)

Delete GCM Code

Delete GCM Code and associated API Key.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1usergcmCodeExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var code = code_example;  // string | 
            var authorization = authorization_example;  // string | API object to be added (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Delete GCM Code
                SuccessResult result = apiInstance.V1usergcmCode(code, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1usergcmCode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**|  | 
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

<a name="v1userkycotpnumber"></a>
# **V1userkycotpNumber**
> SuccessResult V1userkycotpNumber (string number, string authorization = null, string accept = null)

Send OTP for KYC Link

Send OTP for KYC Link.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userkycotpNumberExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var number = number_example;  // string | 
            var authorization = authorization_example;  // string | API object to be added (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Send OTP for KYC Link
                SuccessResult result = apiInstance.V1userkycotpNumber(number, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1userkycotpNumber: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **string**|  | 
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

<a name="v1userlogout"></a>
# **V1userlogout**
> SuccessResult V1userlogout (string authorization = null, string accept = null)

Logout User

Logs out user and Deletes the api key and associated session data.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userlogoutExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Logout User
                SuccessResult result = apiInstance.V1userlogout(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1userlogout: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="v1usernetkicreate"></a>
# **V1usernetkicreate**
> SuccessResult V1usernetkicreate (NetkiNameAddress body, string authorization = null, string accept = null)

Create Neki Wallet Name

Creates a new Netki Wallet Name.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1usernetkicreateExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var body = new NetkiNameAddress(); // NetkiNameAddress | Enter a valid Netki name and Bitcoin address from Wallet or Exchange.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Create Neki Wallet Name
                SuccessResult result = apiInstance.V1usernetkicreate(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1usernetkicreate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetkiNameAddress**](NetkiNameAddress.md)| Enter a valid Netki name and Bitcoin address from Wallet or Exchange. | 
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

<a name="v1usernetkiupdate"></a>
# **V1usernetkiupdate**
> SuccessResult V1usernetkiupdate (Address body, string authorization = null, string accept = null)

Update Netki Address

Updates the address on an existing wallet name.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1usernetkiupdateExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var body = new Address(); // Address | Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Update Netki Address
                SuccessResult result = apiInstance.V1usernetkiupdate(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1usernetkiupdate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Address**](Address.md)| Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name. | 
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

<a name="v1userprofileimagedeletenetkiname"></a>
# **V1userprofileimagedeleteNetkiName**
> SuccessResult V1userprofileimagedeleteNetkiName (string netkiName, string authorization = null, string accept = null)

Delete Profile Image

Deletes a profile Image.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userprofileimagedeleteNetkiNameExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var netkiName = netkiName_example;  // string | 
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Delete Profile Image
                SuccessResult result = apiInstance.V1userprofileimagedeleteNetkiName(netkiName, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1userprofileimagedeleteNetkiName: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netkiName** | **string**|  | 
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

<a name="v1userprofileimageupdate"></a>
# **V1userprofileimageupdate**
> SuccessResult V1userprofileimageupdate (string netkiName, bool? isPublic, System.IO.Stream file, string authorization = null, string accept = null)

Update Profile Image

Updates Profile Image and allows public or private options for netki profile page.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userprofileimageupdateExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var netkiName = netkiName_example;  // string | Please enter your Netki Wallet Name.
            var isPublic = true;  // bool? | Please enter if this image can be public.
            var file = new System.IO.Stream(); // System.IO.Stream | Enter a valid image, pdf or zip file under 5 MB in size.
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Update Profile Image
                SuccessResult result = apiInstance.V1userprofileimageupdate(netkiName, isPublic, file, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1userprofileimageupdate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netkiName** | **string**| Please enter your Netki Wallet Name. | 
 **isPublic** | **bool?**| Please enter if this image can be public. | 
 **file** | **System.IO.Stream**| Enter a valid image, pdf or zip file under 5 MB in size. | 
 **authorization** | **string**| Enter a valid Api Key. | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userprofilephone"></a>
# **V1userprofilephone**
> SuccessResult V1userprofilephone (NumberOtp body, string authorization = null, string accept = null)

New Profile Phone

Set a New Profile Phone Number.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userprofilephoneExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var body = new NumberOtp(); // NumberOtp | You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number
            var authorization = authorization_example;  // string | Enter a valid Api Key. (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // New Profile Phone
                SuccessResult result = apiInstance.V1userprofilephone(body, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1userprofilephone: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NumberOtp**](NumberOtp.md)| You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number | 
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

<a name="v1userprofilephonenumber"></a>
# **V1userprofilephoneNumber**
> SuccessResult V1userprofilephoneNumber (string authorization = null, string accept = null)

Delete Profile Phone Number

Delete Profile Phone Number.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userprofilephoneNumberExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var authorization = authorization_example;  // string | API object to be added (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Delete Profile Phone Number
                SuccessResult result = apiInstance.V1userprofilephoneNumber(authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1userprofilephoneNumber: " + e.Message );
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

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1userprofilephoneotpnumber"></a>
# **V1userprofilephoneotpNumber**
> SuccessResult V1userprofilephoneotpNumber (string number, string authorization = null, string accept = null)

Send OTP for Profile Phone

Send OTP for Profile Phone addition or updation.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class V1userprofilephoneotpNumberExample
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var number = number_example;  // string | 
            var authorization = authorization_example;  // string | API object to be added (optional) 
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Send OTP for Profile Phone
                SuccessResult result = apiInstance.V1userprofilephoneotpNumber(number, authorization, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1userprofilephoneotpNumber: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **string**|  | 
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

