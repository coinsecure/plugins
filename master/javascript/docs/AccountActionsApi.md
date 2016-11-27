# CoinsecureApiDocumentation.AccountActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1login**](AccountActionsApi.md#v1login) | **POST** /v1/login | Creates a Login Instance and returns an API Key.
[**v1logininitiate**](AccountActionsApi.md#v1logininitiate) | **POST** /v1/login/initiate | Initiate Login
[**v1loginpasswordforgot**](AccountActionsApi.md#v1loginpasswordforgot) | **POST** /v1/login/password/forgot | Sends an email with a password reset token
[**v1signup**](AccountActionsApi.md#v1signup) | **POST** /v1/signup | Creates a new Unverified Account.
[**v1signupverifyToken**](AccountActionsApi.md#v1signupverifyToken) | **PUT** /v1/signup/verify/{token} | Verifies an Email token for Signup .
[**v1userbankotpNumber**](AccountActionsApi.md#v1userbankotpNumber) | **GET** /v1/user/bank/otp/{number} | Send OTP for Bank Link
[**v1userexchangekyc**](AccountActionsApi.md#v1userexchangekyc) | **PUT** /v1/user/exchange/kyc | Submits a New Bank Link and initial KYC Documents.
[**v1usergcmCode**](AccountActionsApi.md#v1usergcmCode) | **DELETE** /v1/user/gcm/{code} | Delete GCM Code
[**v1userkycotpNumber**](AccountActionsApi.md#v1userkycotpNumber) | **GET** /v1/user/kyc/otp/{number} | Send OTP for KYC Link
[**v1userlogout**](AccountActionsApi.md#v1userlogout) | **DELETE** /v1/user/logout | Logout User
[**v1usernetkicreate**](AccountActionsApi.md#v1usernetkicreate) | **PUT** /v1/user/netki/create | Create Neki Wallet Name
[**v1usernetkiupdate**](AccountActionsApi.md#v1usernetkiupdate) | **POST** /v1/user/netki/update | Update Netki Address
[**v1userprofileimagedeleteNetkiName**](AccountActionsApi.md#v1userprofileimagedeleteNetkiName) | **DELETE** /v1/user/profile/image/delete/{netkiName} | Delete Profile Image
[**v1userprofileimageupdate**](AccountActionsApi.md#v1userprofileimageupdate) | **POST** /v1/user/profile/image/update | Update Profile Image
[**v1userprofilephone**](AccountActionsApi.md#v1userprofilephone) | **PUT** /v1/user/profile/phone/new | New Profile Phone
[**v1userprofilephoneNumber**](AccountActionsApi.md#v1userprofilephoneNumber) | **DELETE** /v1/user/profile/phone/delete | Delete Profile Phone Number
[**v1userprofilephoneotpNumber**](AccountActionsApi.md#v1userprofilephoneotpNumber) | **GET** /v1/user/profile/phone/otp/{number} | Send OTP for Profile Phone


<a name="v1login"></a>
# **v1login**
> StandardLoginResultData v1login(body, opts)

Creates a Login Instance and returns an API Key.

Creates a Login Instance and returns an API Key

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var body = new CoinsecureApiDocumentation.LoginFormNew(); // LoginFormNew | Please send the form with valid inputs.

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
apiInstance.v1login(body, opts, callback);
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
> StandardInitiateLoginResultData v1logininitiate(body, opts)

Initiate Login

Sends an Email with a Verification Link.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var body = new CoinsecureApiDocumentation.LoginId(); // LoginId | Enter a valid Login ID. This method will send an email with a token to be used for login.

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
apiInstance.v1logininitiate(body, opts, callback);
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
> SuccessResult v1loginpasswordforgot(body, opts)

Sends an email with a password reset token

Sends an email with a password reset token

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var body = new CoinsecureApiDocumentation.Email(); // Email | Enter a valid and registered Email ID.

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
apiInstance.v1loginpasswordforgot(body, opts, callback);
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
> SuccessResult v1signup(body, opts)

Creates a new Unverified Account.

Creates a new Unverified Account.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var body = new CoinsecureApiDocumentation.SignupForm(); // SignupForm | Please send the form with valid inputs.

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
apiInstance.v1signup(body, opts, callback);
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

<a name="v1signupverifyToken"></a>
# **v1signupverifyToken**
> StandardVerifySignupResultData v1signupverifyToken(token, opts)

Verifies an Email token for Signup .

Creates a new Coinsecure Account.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var token = "token_example"; // String | 

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
apiInstance.v1signupverifyToken(token, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**StandardVerifySignupResultData**](StandardVerifySignupResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userbankotpNumber"></a>
# **v1userbankotpNumber**
> StandardInitiateLoginResultData v1userbankotpNumber(_number, opts)

Send OTP for Bank Link

Send OTP for an additional Bank Link.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var _number = "_number_example"; // String | 

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
apiInstance.v1userbankotpNumber(_number, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_number** | **String**|  | 
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
> SuccessResult v1userexchangekyc(panNumber, acctNick, name, ban, ifsc, acctType, banType, phone, otp, file, opts)

Submits a New Bank Link and initial KYC Documents.

Submits a New Bank Link and initial KYC Documents.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var panNumber = "panNumber_example"; // String | Please enter your Pan Card Number

var acctNick = "acctNick_example"; // String | Please enter an Account NickName

var name = "name_example"; // String | Please enter your Name as it appears on your Bank account.

var ban = "ban_example"; // String | Please enter your Bank account number.

var ifsc = "ifsc_example"; // String | Please enter your IFSC Code.

var acctType = "acctType_example"; // String | Please enter your Coinsecure account type. Allowable Values are Personal or Company.

var banType = "banType_example"; // String | Please enter your Bank account type. Allowable Values are Savings or Current.

var phone = "phone_example"; // String | Please enter your Valid Phone Number.

var otp = "otp_example"; // String | Please enter your OTP from SMS. The code can be requested from /v1/user/kyc/otp/:number.

var file = "/path/to/file.txt"; // File | Enter a valid image, pdf or zip file under 5 MB in size.

var opts = { 
  'authorization': "authorization_example", // String | Enter a valid Api Key.
  'message': "message_example", // String | Please enter an optional message if needed.
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangekyc(panNumber, acctNick, name, ban, ifsc, acctType, banType, phone, otp, file, opts, callback);
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
 **otp** | **String**| Please enter your OTP from SMS. The code can be requested from /v1/user/kyc/otp/:number. | 
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
> SuccessResult v1usergcmCode(code, opts)

Delete GCM Code

Delete GCM Code and associated API Key.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

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
apiInstance.v1usergcmCode(code, opts, callback);
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
> SuccessResult v1userkycotpNumber(_number, opts)

Send OTP for KYC Link

Send OTP for KYC Link.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var _number = "_number_example"; // String | 

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
apiInstance.v1userkycotpNumber(_number, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_number** | **String**|  | 
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
> SuccessResult v1userlogout(opts)

Logout User

Logs out user and Deletes the api key and associated session data.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

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
apiInstance.v1userlogout(opts, callback);
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
> SuccessResult v1usernetkicreate(body, opts)

Create Neki Wallet Name

Creates a new Netki Wallet Name.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var body = new CoinsecureApiDocumentation.NetkiNameAddress(); // NetkiNameAddress | Enter a valid Netki name and Bitcoin address from Wallet or Exchange.

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
apiInstance.v1usernetkicreate(body, opts, callback);
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
> SuccessResult v1usernetkiupdate(body, opts)

Update Netki Address

Updates the address on an existing wallet name.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var body = new CoinsecureApiDocumentation.Address(); // Address | Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name.

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
apiInstance.v1usernetkiupdate(body, opts, callback);
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

<a name="v1userprofileimagedeleteNetkiName"></a>
# **v1userprofileimagedeleteNetkiName**
> SuccessResult v1userprofileimagedeleteNetkiName(netkiName, opts)

Delete Profile Image

Deletes a profile Image.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var netkiName = "netkiName_example"; // String | 

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
apiInstance.v1userprofileimagedeleteNetkiName(netkiName, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netkiName** | **String**|  | 
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
> SuccessResult v1userprofileimageupdate(netkiName, isPublic, file, opts)

Update Profile Image

Updates Profile Image and allows public or private options for netki profile page.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var netkiName = "netkiName_example"; // String | Please enter your Netki Wallet Name.

var isPublic = true; // Boolean | Please enter if this image can be public.

var file = "/path/to/file.txt"; // File | Enter a valid image, pdf or zip file under 5 MB in size.

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
apiInstance.v1userprofileimageupdate(netkiName, isPublic, file, opts, callback);
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
> SuccessResult v1userprofilephone(body, opts)

New Profile Phone

Set a New Profile Phone Number.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var body = new CoinsecureApiDocumentation.NumberOtp(); // NumberOtp | You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number

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
apiInstance.v1userprofilephone(body, opts, callback);
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
> SuccessResult v1userprofilephoneNumber(opts)

Delete Profile Phone Number

Delete Profile Phone Number.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

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
apiInstance.v1userprofilephoneNumber(opts, callback);
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
> SuccessResult v1userprofilephoneotpNumber(_number, opts)

Send OTP for Profile Phone

Send OTP for Profile Phone addition or updation.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountActionsApi();

var _number = "_number_example"; // String | 

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
apiInstance.v1userprofilephoneotpNumber(_number, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_number** | **String**|  | 
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

