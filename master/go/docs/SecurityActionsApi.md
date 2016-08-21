# \SecurityActionsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1mfaauthyinitiate**](SecurityActionsApi.md#V1mfaauthyinitiate) | **Post** /v1/mfa/authy/initiate | Initiate Authy Registration.
[**V1mfagainitiate**](SecurityActionsApi.md#V1mfagainitiate) | **Post** /v1/mfa/ga/initiate | Initiate GA Registration.
[**V1usermfaauthycall**](SecurityActionsApi.md#V1usermfaauthycall) | **Get** /v1/mfa/authy/call | Authy Call Code
[**V1usermfaauthydisableCode**](SecurityActionsApi.md#V1usermfaauthydisableCode) | **Delete** /v1/user/mfa/authy/disable/{code} | Disable Authy
[**V1usermfaauthyinitiateenable**](SecurityActionsApi.md#V1usermfaauthyinitiateenable) | **Put** /v1/user/mfa/authy/initiate/enable | Verify Authy Registration
[**V1usermfaauthysms**](SecurityActionsApi.md#V1usermfaauthysms) | **Get** /v1/mfa/authy/sms | Authy Sms Code
[**V1usermfagadisableCode**](SecurityActionsApi.md#V1usermfagadisableCode) | **Delete** /v1/user/mfa/ga/disable/{code} | Disable Google Authenticator
[**V1usermfagainitiateenable**](SecurityActionsApi.md#V1usermfagainitiateenable) | **Put** /v1/user/mfa/ga/initiate/enable | Enable Google Authenticator
[**V1userpasswordchange**](SecurityActionsApi.md#V1userpasswordchange) | **Post** /v1/user/password/change | Change Password.
[**V1userpasswordreset**](SecurityActionsApi.md#V1userpasswordreset) | **Post** /v1/user/password/reset | Reset Password.


# **V1mfaauthyinitiate**
> SuccessResult V1mfaauthyinitiate($body, $authorization, $accept)

Initiate Authy Registration.

Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MethodCountryMobile**](MethodCountryMobile.md)| Please Send Valid Json as below. | 
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

# **V1mfagainitiate**
> SuccessResult V1mfagainitiate($authorization, $accept)

Initiate GA Registration.

Returns the Google Authenticator Secret and a QR code URL.


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

# **V1usermfaauthycall**
> SuccessResult V1usermfaauthycall($authorization, $accept)

Authy Call Code

Calls valid phone user with a code.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Login Token or any Apikey to be added as Authorization in header | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1usermfaauthydisableCode**
> SuccessResult V1usermfaauthydisableCode($code, $authorization, $accept)

Disable Authy

Disables users Authy


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

# **V1usermfaauthyinitiateenable**
> SuccessResult V1usermfaauthyinitiateenable($body, $authorization, $accept)

Verify Authy Registration

Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CodeCountryMobile**](CodeCountryMobile.md)| Please Send Valid Json as below. | 
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

# **V1usermfaauthysms**
> SuccessResult V1usermfaauthysms($authorization, $accept)

Authy Sms Code

Disables users Authy


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Login Token or any Apikey to be added as Authorization in header | [optional] 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1usermfagadisableCode**
> SuccessResult V1usermfagadisableCode($code, $authorization, $accept)

Disable Google Authenticator

Disables users Google Authenticator 2FA


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

# **V1usermfagainitiateenable**
> SuccessResult V1usermfagainitiateenable($body, $authorization, $accept)

Enable Google Authenticator

Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| Please Send Valid Json as below. | 
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

# **V1userpasswordchange**
> SuccessResult V1userpasswordchange($body, $authorization, $accept)

Change Password.

Changes an account Password.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChangePassword**](ChangePassword.md)|  | 
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

# **V1userpasswordreset**
> SuccessResult V1userpasswordreset($body, $accept)

Reset Password.

Resets an account Password. Use forgotPassword to generate a token.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResetPassword**](ResetPassword.md)| Please Send Valid Json as below. | 
 **accept** | **string**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

