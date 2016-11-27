# SecurityActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1mfaauthyinitiate**](SecurityActionsApi.md#v1mfaauthyinitiate) | **POST** /v1/mfa/authy/initiate | Initiate Authy Registration.
[**v1mfagainitiate**](SecurityActionsApi.md#v1mfagainitiate) | **POST** /v1/mfa/ga/initiate | Initiate GA Registration.
[**v1usermfaauthycall**](SecurityActionsApi.md#v1usermfaauthycall) | **GET** /v1/mfa/authy/call | Authy Call Code
[**v1usermfaauthydisableCode**](SecurityActionsApi.md#v1usermfaauthydisableCode) | **DELETE** /v1/user/mfa/authy/disable/{code} | Disable Authy
[**v1usermfaauthyinitiateenable**](SecurityActionsApi.md#v1usermfaauthyinitiateenable) | **PUT** /v1/user/mfa/authy/initiate/enable | Verify Authy Registration
[**v1usermfaauthysms**](SecurityActionsApi.md#v1usermfaauthysms) | **GET** /v1/mfa/authy/sms | Authy Sms Code
[**v1usermfagadisableCode**](SecurityActionsApi.md#v1usermfagadisableCode) | **DELETE** /v1/user/mfa/ga/disable/{code} | Disable Google Authenticator
[**v1usermfagainitiateenable**](SecurityActionsApi.md#v1usermfagainitiateenable) | **PUT** /v1/user/mfa/ga/initiate/enable | Enable Google Authenticator
[**v1userpasswordchange**](SecurityActionsApi.md#v1userpasswordchange) | **POST** /v1/user/password/change | Change Password.
[**v1userpasswordreset**](SecurityActionsApi.md#v1userpasswordreset) | **POST** /v1/user/password/reset | Reset Password.


<a name="v1mfaauthyinitiate"></a>
# **v1mfaauthyinitiate**
> SuccessResult v1mfaauthyinitiate(body, authorization, accept)

Initiate Authy Registration.

Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityActionsApi;


SecurityActionsApi apiInstance = new SecurityActionsApi();
MethodCountryMobile body = new MethodCountryMobile(); // MethodCountryMobile | Please Send Valid Json as below.
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1mfaauthyinitiate(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityActionsApi#v1mfaauthyinitiate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MethodCountryMobile**](MethodCountryMobile.md)| Please Send Valid Json as below. |
 **authorization** | **String**| API object to be added | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1mfagainitiate"></a>
# **v1mfagainitiate**
> SuccessResult v1mfagainitiate(authorization, accept)

Initiate GA Registration.

Returns the Google Authenticator Secret and a QR code URL.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityActionsApi;


SecurityActionsApi apiInstance = new SecurityActionsApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1mfagainitiate(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityActionsApi#v1mfagainitiate");
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

<a name="v1usermfaauthycall"></a>
# **v1usermfaauthycall**
> SuccessResult v1usermfaauthycall(authorization, accept)

Authy Call Code

Calls valid phone user with a code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityActionsApi;


SecurityActionsApi apiInstance = new SecurityActionsApi();
String authorization = "authorization_example"; // String | Login Token or any Apikey to be added as Authorization in header
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1usermfaauthycall(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityActionsApi#v1usermfaauthycall");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Login Token or any Apikey to be added as Authorization in header | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1usermfaauthydisableCode"></a>
# **v1usermfaauthydisableCode**
> SuccessResult v1usermfaauthydisableCode(code, authorization, accept)

Disable Authy

Disables users Authy

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityActionsApi;


SecurityActionsApi apiInstance = new SecurityActionsApi();
String code = "code_example"; // String | 
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1usermfaauthydisableCode(code, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityActionsApi#v1usermfaauthydisableCode");
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

<a name="v1usermfaauthyinitiateenable"></a>
# **v1usermfaauthyinitiateenable**
> SuccessResult v1usermfaauthyinitiateenable(body, authorization, accept)

Verify Authy Registration

Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityActionsApi;


SecurityActionsApi apiInstance = new SecurityActionsApi();
CodeCountryMobile body = new CodeCountryMobile(); // CodeCountryMobile | Please Send Valid Json as below.
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1usermfaauthyinitiateenable(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityActionsApi#v1usermfaauthyinitiateenable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CodeCountryMobile**](CodeCountryMobile.md)| Please Send Valid Json as below. |
 **authorization** | **String**| API object to be added | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1usermfaauthysms"></a>
# **v1usermfaauthysms**
> SuccessResult v1usermfaauthysms(authorization, accept)

Authy Sms Code

Disables users Authy

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityActionsApi;


SecurityActionsApi apiInstance = new SecurityActionsApi();
String authorization = "authorization_example"; // String | Login Token or any Apikey to be added as Authorization in header
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1usermfaauthysms(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityActionsApi#v1usermfaauthysms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Login Token or any Apikey to be added as Authorization in header | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1usermfagadisableCode"></a>
# **v1usermfagadisableCode**
> SuccessResult v1usermfagadisableCode(code, authorization, accept)

Disable Google Authenticator

Disables users Google Authenticator 2FA

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityActionsApi;


SecurityActionsApi apiInstance = new SecurityActionsApi();
String code = "code_example"; // String | 
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1usermfagadisableCode(code, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityActionsApi#v1usermfagadisableCode");
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

<a name="v1usermfagainitiateenable"></a>
# **v1usermfagainitiateenable**
> SuccessResult v1usermfagainitiateenable(body, authorization, accept)

Enable Google Authenticator

Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityActionsApi;


SecurityActionsApi apiInstance = new SecurityActionsApi();
Code body = new Code(); // Code | Please Send Valid Json as below.
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1usermfagainitiateenable(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityActionsApi#v1usermfagainitiateenable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| Please Send Valid Json as below. |
 **authorization** | **String**| API object to be added | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userpasswordchange"></a>
# **v1userpasswordchange**
> SuccessResult v1userpasswordchange(body, authorization, accept)

Change Password.

Changes an account Password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityActionsApi;


SecurityActionsApi apiInstance = new SecurityActionsApi();
ChangePassword body = new ChangePassword(); // ChangePassword | 
String authorization = "authorization_example"; // String | Enter a valid Api Key.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userpasswordchange(body, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityActionsApi#v1userpasswordchange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChangePassword**](ChangePassword.md)|  |
 **authorization** | **String**| Enter a valid Api Key. | [optional]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userpasswordreset"></a>
# **v1userpasswordreset**
> SuccessResult v1userpasswordreset(body, accept)

Reset Password.

Resets an account Password. Use forgotPassword to generate a token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityActionsApi;


SecurityActionsApi apiInstance = new SecurityActionsApi();
ResetPassword body = new ResetPassword(); // ResetPassword | Please Send Valid Json as below.
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    SuccessResult result = apiInstance.v1userpasswordreset(body, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityActionsApi#v1userpasswordreset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResetPassword**](ResetPassword.md)| Please Send Valid Json as below. |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

