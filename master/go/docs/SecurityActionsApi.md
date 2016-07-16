# \SecurityActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1MfaAuthyInitiate**](SecurityActionsApi.md#V1MfaAuthyInitiate) | **Post** /v1/mfa/authy/initiate | Initiate Authy Registration.
[**V1MfaGaInitiate**](SecurityActionsApi.md#V1MfaGaInitiate) | **Post** /v1/mfa/ga/initiate | Initiate GA Registration.
[**V1UserMfaAuthyCall**](SecurityActionsApi.md#V1UserMfaAuthyCall) | **Get** /v1/mfa/authy/call | Authy Call Code
[**V1UserMfaAuthyDisable**](SecurityActionsApi.md#V1UserMfaAuthyDisable) | **Delete** /v1/user/mfa/authy/disable | Disable Authy
[**V1UserMfaAuthyInitiateEnable**](SecurityActionsApi.md#V1UserMfaAuthyInitiateEnable) | **Put** /v1/user/mfa/authy/initiate/enable | Verify Authy Registration
[**V1UserMfaAuthySms**](SecurityActionsApi.md#V1UserMfaAuthySms) | **Get** /v1/mfa/authy/sms | Authy Sms Code
[**V1UserMfaGaDisable**](SecurityActionsApi.md#V1UserMfaGaDisable) | **Delete** /v1/user/mfa/ga/disable | Disable Google Authenticator
[**V1UserMfaGaInitiateEnable**](SecurityActionsApi.md#V1UserMfaGaInitiateEnable) | **Put** /v1/user/mfa/ga/initiate/enable | Enable Google Authenticator
[**V1UserPasswordChange**](SecurityActionsApi.md#V1UserPasswordChange) | **Patch** /v1/user/password/change | Change Password.
[**V1UserPasswordReset**](SecurityActionsApi.md#V1UserPasswordReset) | **Patch** /v1/user/password/reset | Reset Password.


# **V1MfaAuthyInitiate**
> SuccessResult V1MfaAuthyInitiate($body, $authorization, $accept)

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

# **V1MfaGaInitiate**
> SuccessResult V1MfaGaInitiate($body, $authorization, $accept)

Initiate GA Registration.

Returns the Google Authenticator Secret and a QR code URL.


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

# **V1UserMfaAuthyCall**
> SuccessResult V1UserMfaAuthyCall($authorization, $accept)

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

# **V1UserMfaAuthyDisable**
> SuccessResult V1UserMfaAuthyDisable($body, $authorization, $accept)

Disable Authy

Disables users Authy


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

# **V1UserMfaAuthyInitiateEnable**
> SuccessResult V1UserMfaAuthyInitiateEnable($body, $authorization, $accept)

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

# **V1UserMfaAuthySms**
> SuccessResult V1UserMfaAuthySms($authorization, $accept)

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

# **V1UserMfaGaDisable**
> SuccessResult V1UserMfaGaDisable($body, $authorization, $accept)

Disable Google Authenticator

Disables users Google Authenticator 2FA


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

# **V1UserMfaGaInitiateEnable**
> SuccessResult V1UserMfaGaInitiateEnable($body, $authorization, $accept)

Enable Google Authenticator

Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.


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

# **V1UserPasswordChange**
> SuccessResult V1UserPasswordChange($body, $authorization, $accept)

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

# **V1UserPasswordReset**
> SuccessResult V1UserPasswordReset($body, $accept)

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

