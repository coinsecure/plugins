# AccountActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1login**](AccountActionsApi.md#v1login) | **POST** /v1/login | Creates a Login Instance and returns an API Key.
[**v1logininitiate**](AccountActionsApi.md#v1logininitiate) | **POST** /v1/login/initiate | Initiate Login
[**v1loginpasswordforgot**](AccountActionsApi.md#v1loginpasswordforgot) | **POST** /v1/login/password/forgot | Sends an email with a password reset token
[**v1signup**](AccountActionsApi.md#v1signup) | **POST** /v1/signup | Creates a new Unverified Account.
[**v1userbankotpNumber**](AccountActionsApi.md#v1userbankotpNumber) | **GET** /v1/user/bank/otp/{number} | Send OTP for Bank Link
[**v1userexchangekyc**](AccountActionsApi.md#v1userexchangekyc) | **PUT** /v1/user/exchange/kyc | Submits a New Bank Link and initial KYC Documents.
[**v1usergcmCode**](AccountActionsApi.md#v1usergcmCode) | **DELETE** /v1/user/gcm/{code} | Delete GCM Code
[**v1userkycotpNumber**](AccountActionsApi.md#v1userkycotpNumber) | **GET** /v1/user/kyc/otp/{number} | Send OTP for KYC Link
[**v1userlogout**](AccountActionsApi.md#v1userlogout) | **DELETE** /v1/user/logout | Logout User
[**v1usernetkicreate**](AccountActionsApi.md#v1usernetkicreate) | **PUT** /v1/user/netki/create | Create Neki Wallet Name
[**v1usernetkiupdate**](AccountActionsApi.md#v1usernetkiupdate) | **PATCH** /v1/user/netki/update | Update Netki Address
[**v1userprofileimagedelete**](AccountActionsApi.md#v1userprofileimagedelete) | **POST** /v1/user/contact | Delete Profile Image
[**v1userprofileimageupdate**](AccountActionsApi.md#v1userprofileimageupdate) | **PATCH** /v1/user/profile/image/update | Update Profile Image
[**v1userprofilephone**](AccountActionsApi.md#v1userprofilephone) | **PUT** /v1/user/profile/phone/new | New Profile Phone
[**v1userprofilephoneNumber**](AccountActionsApi.md#v1userprofilephoneNumber) | **DELETE** /v1/user/profile/phone/delete | Delete Profile Phone Number
[**v1userprofilephoneotpNumber**](AccountActionsApi.md#v1userprofilephoneotpNumber) | **GET** /v1/user/profile/phone/otp/{number} | Send OTP for Profile Phone


<a name="v1login"></a>
# **v1login**
> StandardLoginResultData v1login(body, accept)

Creates a Login Instance and returns an API Key.

Creates a Login Instance and returns an API Key

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
LoginFormNew body = new LoginFormNew(); // LoginFormNew | Please send the form with valid inputs.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    StandardLoginResultData result = apiInstance.v1login(body, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginFormNew**](LoginFormNew.md)| Please send the form with valid inputs. |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**StandardLoginResultData**](StandardLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1logininitiate"></a>
# **v1logininitiate**
> StandardInitiateLoginResultData v1logininitiate(body, accept)

Initiate Login

Sends an Email with a Verification Link.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
LoginId body = new LoginId(); // LoginId | Enter a valid Login ID. This method will send an email with a token to be used for login.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    StandardInitiateLoginResultData result = apiInstance.v1logininitiate(body, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1logininitiate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginId**](LoginId.md)| Enter a valid Login ID. This method will send an email with a token to be used for login. |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**StandardInitiateLoginResultData**](StandardInitiateLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1loginpasswordforgot"></a>
# **v1loginpasswordforgot**
> SuccessResult v1loginpasswordforgot(body, accept)

Sends an email with a password reset token

Sends an email with a password reset token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
Email body = new Email(); // Email | Enter a valid and registered Email ID.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1loginpasswordforgot(body, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1loginpasswordforgot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Email**](Email.md)| Enter a valid and registered Email ID. |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1signup"></a>
# **v1signup**
> SuccessResult v1signup(body, accept)

Creates a new Unverified Account.

Creates a new Unverified Account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
SignupForm body = new SignupForm(); // SignupForm | Please send the form with valid inputs.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1signup(body, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1signup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SignupForm**](SignupForm.md)| Please send the form with valid inputs. |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userbankotpNumber"></a>
# **v1userbankotpNumber**
> StandardInitiateLoginResultData v1userbankotpNumber(number, authorization, accept)

Send OTP for Bank Link

Send OTP for an additional Bank Link.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
String number = "number_example"; // String | 
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    StandardInitiateLoginResultData result = apiInstance.v1userbankotpNumber(number, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1userbankotpNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |
 **authorization** | **String**| API object to be added | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**StandardInitiateLoginResultData**](StandardInitiateLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangekyc"></a>
# **v1userexchangekyc**
> SuccessResult v1userexchangekyc(panNumber, acctNick, name, ban, ifsc, acctType, banType, phone, otp, file, authorization, message, accept)

Submits a New Bank Link and initial KYC Documents.

Submits a New Bank Link and initial KYC Documents.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
String panNumber = "panNumber_example"; // String | Please enter your Pan Card Number
String acctNick = "acctNick_example"; // String | Please enter an Account NickName
String name = "name_example"; // String | Please enter your Name as it appears on your Bank account.
String ban = "ban_example"; // String | Please enter your Bank account number.
String ifsc = "ifsc_example"; // String | Please enter your IFSC Code.
String acctType = "acctType_example"; // String | Please enter your Coinsecure account type. Allowable Values are Personal or Company.
String banType = "banType_example"; // String | Please enter your Bank account type. Allowable Values are Savings or Current.
String phone = "phone_example"; // String | Please enter your Valid Phone Number.
String otp = "otp_example"; // String | Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number.
File file = new File("/path/to/file.txt"); // File | Enter a valid image, pdf or zip file under 5 MB in size.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String message = "message_example"; // String | Please enter an optional message if needed.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userexchangekyc(panNumber, acctNick, name, ban, ifsc, acctType, banType, phone, otp, file, authorization, message, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1userexchangekyc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **panNumber** | **String**| Please enter your Pan Card Number |
 **acctNick** | **String**| Please enter an Account NickName |
 **name** | **String**| Please enter your Name as it appears on your Bank account. |
 **ban** | **String**| Please enter your Bank account number. |
 **ifsc** | **String**| Please enter your IFSC Code. |
 **acctType** | **String**| Please enter your Coinsecure account type. Allowable Values are Personal or Company. |
 **banType** | **String**| Please enter your Bank account type. Allowable Values are Savings or Current. |
 **phone** | **String**| Please enter your Valid Phone Number. |
 **otp** | **String**| Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number. |
 **file** | **File**| Enter a valid image, pdf or zip file under 5 MB in size. |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **message** | **String**| Please enter an optional message if needed. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, application/csv

<a name="v1usergcmCode"></a>
# **v1usergcmCode**
> SuccessResult v1usergcmCode(code, authorization, accept)

Delete GCM Code

Delete GCM Code and associated API Key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
String code = "code_example"; // String | 
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1usergcmCode(code, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1usergcmCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  |
 **authorization** | **String**| API object to be added | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userkycotpNumber"></a>
# **v1userkycotpNumber**
> SuccessResult v1userkycotpNumber(number, authorization, accept)

Send OTP for KYC Link

Send OTP for KYC Link.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
String number = "number_example"; // String | 
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userkycotpNumber(number, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1userkycotpNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |
 **authorization** | **String**| API object to be added | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userlogout"></a>
# **v1userlogout**
> SuccessResult v1userlogout(authorization, accept)

Logout User

Logs out user and Deletes the api key and associated session data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userlogout(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1userlogout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1usernetkicreate"></a>
# **v1usernetkicreate**
> SuccessResult v1usernetkicreate(body, authorization, accept)

Create Neki Wallet Name

Creates a new Netki Wallet Name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
NetkiNameAddress body = new NetkiNameAddress(); // NetkiNameAddress | Enter a valid Netki name and Bitcoin address from Wallet or Exchange.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1usernetkicreate(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1usernetkicreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetkiNameAddress**](NetkiNameAddress.md)| Enter a valid Netki name and Bitcoin address from Wallet or Exchange. |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1usernetkiupdate"></a>
# **v1usernetkiupdate**
> SuccessResult v1usernetkiupdate(body, authorization, accept)

Update Netki Address

Updates the address on an existing wallet name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
Address body = new Address(); // Address | Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1usernetkiupdate(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1usernetkiupdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Address**](Address.md)| Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name. |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userprofileimagedelete"></a>
# **v1userprofileimagedelete**
> SuccessResult v1userprofileimagedelete(body, authorization, accept)

Delete Profile Image

Deletes a profile Image.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
NetkiName body = new NetkiName(); // NetkiName | Please enter a valid Netki name associated with your prfile Image.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userprofileimagedelete(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1userprofileimagedelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetkiName**](NetkiName.md)| Please enter a valid Netki name associated with your prfile Image. |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userprofileimageupdate"></a>
# **v1userprofileimageupdate**
> SuccessResult v1userprofileimageupdate(netkiName, isPublic, file, authorization, accept)

Update Profile Image

Updates Profile Image and allows public or private options for netki profile page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
String netkiName = "netkiName_example"; // String | Please enter your Netki Wallet Name.
Boolean isPublic = true; // Boolean | Please enter if this image can be public.
File file = new File("/path/to/file.txt"); // File | Enter a valid image, pdf or zip file under 5 MB in size.
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userprofileimageupdate(netkiName, isPublic, file, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1userprofileimageupdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netkiName** | **String**| Please enter your Netki Wallet Name. |
 **isPublic** | **Boolean**| Please enter if this image can be public. |
 **file** | **File**| Enter a valid image, pdf or zip file under 5 MB in size. |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userprofilephone"></a>
# **v1userprofilephone**
> SuccessResult v1userprofilephone(body, authorization, accept)

New Profile Phone

Set a New Profile Phone Number.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
NumberOtp body = new NumberOtp(); // NumberOtp | You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userprofilephone(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1userprofilephone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NumberOtp**](NumberOtp.md)| You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userprofilephoneNumber"></a>
# **v1userprofilephoneNumber**
> SuccessResult v1userprofilephoneNumber(authorization, accept)

Delete Profile Phone Number

Delete Profile Phone Number.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userprofilephoneNumber(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1userprofilephoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userprofilephoneotpNumber"></a>
# **v1userprofilephoneotpNumber**
> SuccessResult v1userprofilephoneotpNumber(number, authorization, accept)

Send OTP for Profile Phone

Send OTP for Profile Phone addition or updation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountActionsApi;


AccountActionsApi apiInstance = new AccountActionsApi();
String number = "number_example"; // String | 
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userprofilephoneotpNumber(number, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountActionsApi#v1userprofilephoneotpNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**|  |
 **authorization** | **String**| API object to be added | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

