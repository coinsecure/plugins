# Swagger\Client\SecurityActionsApi

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


# **v1mfaauthyinitiate**
> \Swagger\Client\Model\SuccessResult v1mfaauthyinitiate($body, $authorization, $accept)

Initiate Authy Registration.

Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SecurityActionsApi();
$body = new \Swagger\Client\Model\MethodCountryMobile(); // \Swagger\Client\Model\MethodCountryMobile | Please Send Valid Json as below.
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1mfaauthyinitiate($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityActionsApi->v1mfaauthyinitiate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\MethodCountryMobile**](../Model/\Swagger\Client\Model\MethodCountryMobile.md)| Please Send Valid Json as below. |
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

# **v1mfagainitiate**
> \Swagger\Client\Model\SuccessResult v1mfagainitiate($authorization, $accept)

Initiate GA Registration.

Returns the Google Authenticator Secret and a QR code URL.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SecurityActionsApi();
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1mfagainitiate($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityActionsApi->v1mfagainitiate: ', $e->getMessage(), PHP_EOL;
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

# **v1usermfaauthycall**
> \Swagger\Client\Model\SuccessResult v1usermfaauthycall($authorization, $accept)

Authy Call Code

Calls valid phone user with a code.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SecurityActionsApi();
$authorization = "authorization_example"; // string | Login Token or any Apikey to be added as Authorization in header
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1usermfaauthycall($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityActionsApi->v1usermfaauthycall: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Login Token or any Apikey to be added as Authorization in header | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1usermfaauthydisableCode**
> \Swagger\Client\Model\SuccessResult v1usermfaauthydisableCode($code, $authorization, $accept)

Disable Authy

Disables users Authy

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SecurityActionsApi();
$code = "code_example"; // string | 
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1usermfaauthydisableCode($code, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityActionsApi->v1usermfaauthydisableCode: ', $e->getMessage(), PHP_EOL;
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

# **v1usermfaauthyinitiateenable**
> \Swagger\Client\Model\SuccessResult v1usermfaauthyinitiateenable($body, $authorization, $accept)

Verify Authy Registration

Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SecurityActionsApi();
$body = new \Swagger\Client\Model\CodeCountryMobile(); // \Swagger\Client\Model\CodeCountryMobile | Please Send Valid Json as below.
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1usermfaauthyinitiateenable($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityActionsApi->v1usermfaauthyinitiateenable: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\CodeCountryMobile**](../Model/\Swagger\Client\Model\CodeCountryMobile.md)| Please Send Valid Json as below. |
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

# **v1usermfaauthysms**
> \Swagger\Client\Model\SuccessResult v1usermfaauthysms($authorization, $accept)

Authy Sms Code

Disables users Authy

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SecurityActionsApi();
$authorization = "authorization_example"; // string | Login Token or any Apikey to be added as Authorization in header
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1usermfaauthysms($authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityActionsApi->v1usermfaauthysms: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Login Token or any Apikey to be added as Authorization in header | [optional]
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **v1usermfagadisableCode**
> \Swagger\Client\Model\SuccessResult v1usermfagadisableCode($code, $authorization, $accept)

Disable Google Authenticator

Disables users Google Authenticator 2FA

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SecurityActionsApi();
$code = "code_example"; // string | 
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1usermfagadisableCode($code, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityActionsApi->v1usermfagadisableCode: ', $e->getMessage(), PHP_EOL;
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

# **v1usermfagainitiateenable**
> \Swagger\Client\Model\SuccessResult v1usermfagainitiateenable($body, $authorization, $accept)

Enable Google Authenticator

Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SecurityActionsApi();
$body = new \Swagger\Client\Model\Code(); // \Swagger\Client\Model\Code | Please Send Valid Json as below.
$authorization = "authorization_example"; // string | API object to be added
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1usermfagainitiateenable($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityActionsApi->v1usermfagainitiateenable: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\Code**](../Model/\Swagger\Client\Model\Code.md)| Please Send Valid Json as below. |
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

# **v1userpasswordchange**
> \Swagger\Client\Model\SuccessResult v1userpasswordchange($body, $authorization, $accept)

Change Password.

Changes an account Password.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SecurityActionsApi();
$body = new \Swagger\Client\Model\ChangePassword(); // \Swagger\Client\Model\ChangePassword | 
$authorization = "authorization_example"; // string | Enter a valid Api Key.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userpasswordchange($body, $authorization, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityActionsApi->v1userpasswordchange: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\ChangePassword**](../Model/\Swagger\Client\Model\ChangePassword.md)|  |
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

# **v1userpasswordreset**
> \Swagger\Client\Model\SuccessResult v1userpasswordreset($body, $accept)

Reset Password.

Resets an account Password. Use forgotPassword to generate a token.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SecurityActionsApi();
$body = new \Swagger\Client\Model\ResetPassword(); // \Swagger\Client\Model\ResetPassword | Please Send Valid Json as below.
$accept = "accept_example"; // string | JSON, XML or CSV can be returned (Optional)

try {
    $result = $api_instance->v1userpasswordreset($body, $accept);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityActionsApi->v1userpasswordreset: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\ResetPassword**](../Model/\Swagger\Client\Model\ResetPassword.md)| Please Send Valid Json as below. |
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**\Swagger\Client\Model\SuccessResult**](../Model/SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

