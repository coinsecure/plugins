# CoinsecureApiDocumentation.SecurityActionsApi

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
> SuccessResult v1mfaauthyinitiate(body, opts)

Initiate Authy Registration.

Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.SecurityActionsApi();

var body = new CoinsecureApiDocumentation.MethodCountryMobile(); // MethodCountryMobile | Please Send Valid Json as below.

var opts = { 
  'authorization': "authorization_example", // String | API object to be added
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1mfaauthyinitiate(body, opts, callback);
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
> SuccessResult v1mfagainitiate(opts)

Initiate GA Registration.

Returns the Google Authenticator Secret and a QR code URL.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.SecurityActionsApi();

var opts = { 
  'authorization': "authorization_example", // String | API object to be added
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1mfagainitiate(opts, callback);
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
> SuccessResult v1usermfaauthycall(opts)

Authy Call Code

Calls valid phone user with a code.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.SecurityActionsApi();

var opts = { 
  'authorization': "authorization_example", // String | Login Token or any Apikey to be added as Authorization in header
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1usermfaauthycall(opts, callback);
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
> SuccessResult v1usermfaauthydisableCode(code, opts)

Disable Authy

Disables users Authy

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.SecurityActionsApi();

var code = "code_example"; // String | 

var opts = { 
  'authorization': "authorization_example", // String | API object to be added
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1usermfaauthydisableCode(code, opts, callback);
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
> SuccessResult v1usermfaauthyinitiateenable(body, opts)

Verify Authy Registration

Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.SecurityActionsApi();

var body = new CoinsecureApiDocumentation.CodeCountryMobile(); // CodeCountryMobile | Please Send Valid Json as below.

var opts = { 
  'authorization': "authorization_example", // String | API object to be added
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1usermfaauthyinitiateenable(body, opts, callback);
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
> SuccessResult v1usermfaauthysms(opts)

Authy Sms Code

Disables users Authy

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.SecurityActionsApi();

var opts = { 
  'authorization': "authorization_example", // String | Login Token or any Apikey to be added as Authorization in header
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1usermfaauthysms(opts, callback);
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
> SuccessResult v1usermfagadisableCode(code, opts)

Disable Google Authenticator

Disables users Google Authenticator 2FA

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.SecurityActionsApi();

var code = "code_example"; // String | 

var opts = { 
  'authorization': "authorization_example", // String | API object to be added
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1usermfagadisableCode(code, opts, callback);
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
> SuccessResult v1usermfagainitiateenable(body, opts)

Enable Google Authenticator

Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.SecurityActionsApi();

var body = new CoinsecureApiDocumentation.Code(); // Code | Please Send Valid Json as below.

var opts = { 
  'authorization': "authorization_example", // String | API object to be added
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1usermfagainitiateenable(body, opts, callback);
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
> SuccessResult v1userpasswordchange(body, opts)

Change Password.

Changes an account Password.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.SecurityActionsApi();

var body = new CoinsecureApiDocumentation.ChangePassword(); // ChangePassword | 

var opts = { 
  'authorization': "authorization_example", // String | Enter a valid Api Key.
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userpasswordchange(body, opts, callback);
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
> SuccessResult v1userpasswordreset(body, opts)

Reset Password.

Resets an account Password. Use forgotPassword to generate a token.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.SecurityActionsApi();

var body = new CoinsecureApiDocumentation.ResetPassword(); // ResetPassword | Please Send Valid Json as below.

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userpasswordreset(body, opts, callback);
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

