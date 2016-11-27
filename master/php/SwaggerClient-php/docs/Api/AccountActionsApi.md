# Swagger\Client\AccountActionsApi

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


# **v1login**
> \Swagger\Client\Model\StandardLoginResultData v1login($body, $accept)

Creates a Login Instance and returns an API Key.

Creates a Login Instance and returns an API Key

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$body = new \Swagger\Client\Model\LoginFormNew(); // \Swagger\Client\Model\LoginFormNew | Please send the form with valid inputs.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1login($body, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1login: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\LoginFormNew**](../Model/\Swagger\Client\Model\LoginFormNew.md)| Please send the form with valid inputs. |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\StandardLoginResultData**](../Model/StandardLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1logininitiate**
> \Swagger\Client\Model\StandardInitiateLoginResultData v1logininitiate($body, $accept)

Initiate Login

Sends an Email with a Verification Link.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$body = new \Swagger\Client\Model\LoginId(); // \Swagger\Client\Model\LoginId | Enter a valid Login ID. This method will send an email with a token to be used for login.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1logininitiate($body, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1logininitiate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\LoginId**](../Model/\Swagger\Client\Model\LoginId.md)| Enter a valid Login ID. This method will send an email with a token to be used for login. |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\StandardInitiateLoginResultData**](../Model/StandardInitiateLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1loginpasswordforgot**
> \Swagger\Client\Model\SuccessResult v1loginpasswordforgot($body, $accept)

Sends an email with a password reset token

Sends an email with a password reset token

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$body = new \Swagger\Client\Model\Email(); // \Swagger\Client\Model\Email | Enter a valid and registered Email ID.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1loginpasswordforgot($body, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1loginpasswordforgot: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Email**](../Model/\Swagger\Client\Model\Email.md)| Enter a valid and registered Email ID. |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1signup**
> \Swagger\Client\Model\SuccessResult v1signup($body, $accept)

Creates a new Unverified Account.

Creates a new Unverified Account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$body = new \Swagger\Client\Model\SignupForm(); // \Swagger\Client\Model\SignupForm | Please send the form with valid inputs.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1signup($body, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1signup: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\SignupForm**](../Model/\Swagger\Client\Model\SignupForm.md)| Please send the form with valid inputs. |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1signupverifyToken**
> \Swagger\Client\Model\StandardVerifySignupResultData v1signupverifyToken($token, $accept)

Verifies an Email token for Signup .

Creates a new Coinsecure Account.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$token = "token_example"; // string | 
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1signupverifyToken($token, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1signupverifyToken: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**|  |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\StandardVerifySignupResultData**](../Model/StandardVerifySignupResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userbankotpNumber**
> \Swagger\Client\Model\StandardInitiateLoginResultData v1userbankotpNumber($number, $authorization, $accept)

Send OTP for Bank Link

Send OTP for an additional Bank Link.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$number = "number_example"; // string | 
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userbankotpNumber($number, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1userbankotpNumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **string**|  |
 **authorization** | **string**| API object to be added | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\StandardInitiateLoginResultData**](../Model/StandardInitiateLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userexchangekyc**
> \Swagger\Client\Model\SuccessResult v1userexchangekyc($pan_number, $acct_nick, $name, $ban, $ifsc, $acct_type, $ban_type, $phone, $otp, $file, $authorization, $message, $accept)

Submits a New Bank Link and initial KYC Documents.

Submits a New Bank Link and initial KYC Documents.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$pan_number = "pan_number_example"; // string | Please enter your Pan Card Number
$acct_nick = "acct_nick_example"; // string | Please enter an Account NickName
$name = "name_example"; // string | Please enter your Name as it appears on your Bank account.
$ban = "ban_example"; // string | Please enter your Bank account number.
$ifsc = "ifsc_example"; // string | Please enter your IFSC Code.
$acct_type = "acct_type_example"; // string | Please enter your Coinsecure account type. Allowable Values are Personal or Company.
$ban_type = "ban_type_example"; // string | Please enter your Bank account type. Allowable Values are Savings or Current.
$phone = "phone_example"; // string | Please enter your Valid Phone Number.
$otp = "otp_example"; // string | Please enter your OTP from SMS. The code can be requested from /v1/user/kyc/otp/:number.
$file = "/path/to/file.txt"; // \SplFileObject | Enter a valid image, pdf or zip file under 5 MB in size.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$message = "message_example"; // string | Please enter an optional message if needed.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userexchangekyc($pan_number, $acct_nick, $name, $ban, $ifsc, $acct_type, $ban_type, $phone, $otp, $file, $authorization, $message, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1userexchangekyc: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pan_number** | **string**| Please enter your Pan Card Number |
 **acct_nick** | **string**| Please enter an Account NickName |
 **name** | **string**| Please enter your Name as it appears on your Bank account. |
 **ban** | **string**| Please enter your Bank account number. |
 **ifsc** | **string**| Please enter your IFSC Code. |
 **acct_type** | **string**| Please enter your Coinsecure account type. Allowable Values are Personal or Company. |
 **ban_type** | **string**| Please enter your Bank account type. Allowable Values are Savings or Current. |
 **phone** | **string**| Please enter your Valid Phone Number. |
 **otp** | **string**| Please enter your OTP from SMS. The code can be requested from /v1/user/kyc/otp/:number. |
 **file** | **\SplFileObject**| Enter a valid image, pdf or zip file under 5 MB in size. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **message** | **string**| Please enter an optional message if needed. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1usergcmCode**
> \Swagger\Client\Model\SuccessResult v1usergcmCode($code, $authorization, $accept)

Delete GCM Code

Delete GCM Code and associated API Key.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$code = "code_example"; // string | 
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1usergcmCode($code, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1usergcmCode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**|  |
 **authorization** | **string**| API object to be added | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userkycotpNumber**
> \Swagger\Client\Model\SuccessResult v1userkycotpNumber($number, $authorization, $accept)

Send OTP for KYC Link

Send OTP for KYC Link.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$number = "number_example"; // string | 
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userkycotpNumber($number, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1userkycotpNumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **string**|  |
 **authorization** | **string**| API object to be added | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userlogout**
> \Swagger\Client\Model\SuccessResult v1userlogout($authorization, $accept)

Logout User

Logs out user and Deletes the api key and associated session data.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userlogout($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1userlogout: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1usernetkicreate**
> \Swagger\Client\Model\SuccessResult v1usernetkicreate($body, $authorization, $accept)

Create Neki Wallet Name

Creates a new Netki Wallet Name.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$body = new \Swagger\Client\Model\NetkiNameAddress(); // \Swagger\Client\Model\NetkiNameAddress | Enter a valid Netki name and Bitcoin address from Wallet or Exchange.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1usernetkicreate($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1usernetkicreate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\NetkiNameAddress**](../Model/\Swagger\Client\Model\NetkiNameAddress.md)| Enter a valid Netki name and Bitcoin address from Wallet or Exchange. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1usernetkiupdate**
> \Swagger\Client\Model\SuccessResult v1usernetkiupdate($body, $authorization, $accept)

Update Netki Address

Updates the address on an existing wallet name.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$body = new \Swagger\Client\Model\Address(); // \Swagger\Client\Model\Address | Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1usernetkiupdate($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1usernetkiupdate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Address**](../Model/\Swagger\Client\Model\Address.md)| Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userprofileimagedeleteNetkiName**
> \Swagger\Client\Model\SuccessResult v1userprofileimagedeleteNetkiName($netki_name, $authorization, $accept)

Delete Profile Image

Deletes a profile Image.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$netki_name = "netki_name_example"; // string | 
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userprofileimagedeleteNetkiName($netki_name, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1userprofileimagedeleteNetkiName: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netki_name** | **string**|  |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userprofileimageupdate**
> \Swagger\Client\Model\SuccessResult v1userprofileimageupdate($netki_name, $is_public, $file, $authorization, $accept)

Update Profile Image

Updates Profile Image and allows public or private options for netki profile page.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$netki_name = "netki_name_example"; // string | Please enter your Netki Wallet Name.
$is_public = true; // bool | Please enter if this image can be public.
$file = "/path/to/file.txt"; // \SplFileObject | Enter a valid image, pdf or zip file under 5 MB in size.
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userprofileimageupdate($netki_name, $is_public, $file, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1userprofileimageupdate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netki_name** | **string**| Please enter your Netki Wallet Name. |
 **is_public** | **bool**| Please enter if this image can be public. |
 **file** | **\SplFileObject**| Enter a valid image, pdf or zip file under 5 MB in size. |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userprofilephone**
> \Swagger\Client\Model\SuccessResult v1userprofilephone($body, $authorization, $accept)

New Profile Phone

Set a New Profile Phone Number.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$body = new \Swagger\Client\Model\NumberOtp(); // \Swagger\Client\Model\NumberOtp | You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userprofilephone($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1userprofilephone: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\NumberOtp**](../Model/\Swagger\Client\Model\NumberOtp.md)| You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number |
 **authorization** | **string**| Enter a valid Api Key. | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userprofilephoneNumber**
> \Swagger\Client\Model\SuccessResult v1userprofilephoneNumber($authorization, $accept)

Delete Profile Phone Number

Delete Profile Phone Number.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userprofilephoneNumber($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1userprofilephoneNumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| API object to be added | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1userprofilephoneotpNumber**
> \Swagger\Client\Model\SuccessResult v1userprofilephoneotpNumber($number, $authorization, $accept)

Send OTP for Profile Phone

Send OTP for Profile Phone addition or updation.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AccountActionsApi();
$number = "number_example"; // string | 
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userprofilephoneotpNumber($number, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountActionsApi->v1userprofilephoneotpNumber: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **string**|  |
 **authorization** | **string**| API object to be added | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

