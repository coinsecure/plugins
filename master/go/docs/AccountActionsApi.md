# \AccountActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1Login**](AccountActionsApi.md#V1Login) | **Post** /v1/login | Creates a Login Instance and returns an API Key.
[**V1LoginInitiate**](AccountActionsApi.md#V1LoginInitiate) | **Post** /v1/login/initiate | Initiate Login
[**V1LoginPasswordForgot**](AccountActionsApi.md#V1LoginPasswordForgot) | **Post** /v1/login/password/forgot | Sends an email with a password reset token
[**V1Signup**](AccountActionsApi.md#V1Signup) | **Post** /v1/signup | Creates a new Unverified Account.
[**V1UserBankOtpNumber**](AccountActionsApi.md#V1UserBankOtpNumber) | **Get** /v1/user/bank/otp/{number} | Send OTP for Bank Link
[**V1UserExchangeKyc**](AccountActionsApi.md#V1UserExchangeKyc) | **Put** /v1/user/exchange/kyc | Submits a New Bank Link and initial KYC Documents.
[**V1UserGcmCode**](AccountActionsApi.md#V1UserGcmCode) | **Delete** /v1/user/gcm/{code} | Delete GCM Code
[**V1UserKycOtpNumber**](AccountActionsApi.md#V1UserKycOtpNumber) | **Get** /v1/user/kyc/otp/{number} | Send OTP for KYC Link
[**V1UserLogout**](AccountActionsApi.md#V1UserLogout) | **Delete** /v1/user/logout | Logout User
[**V1UserNetkiCreate**](AccountActionsApi.md#V1UserNetkiCreate) | **Put** /v1/user/netki/create | Create Neki Wallet Name
[**V1UserNetkiUpdate**](AccountActionsApi.md#V1UserNetkiUpdate) | **Patch** /v1/user/netki/update | Update Netki Address
[**V1UserProfileImageDelete**](AccountActionsApi.md#V1UserProfileImageDelete) | **Post** /v1/user/contact | Delete Profile Image
[**V1UserProfileImageUpdate**](AccountActionsApi.md#V1UserProfileImageUpdate) | **Patch** /v1/user/profile/image/update | Update Profile Image
[**V1UserProfilePhone**](AccountActionsApi.md#V1UserProfilePhone) | **Put** /v1/user/profile/phone/new | New Profile Phone
[**V1UserProfilePhoneNumber**](AccountActionsApi.md#V1UserProfilePhoneNumber) | **Delete** /v1/user/profile/phone/delete | Delete Profile Phone Number
[**V1UserProfilePhoneOtpNumber**](AccountActionsApi.md#V1UserProfilePhoneOtpNumber) | **Get** /v1/user/profile/phone/otp/{number} | Send OTP for Profile Phone


# **V1Login**
> StandardLoginResultData V1Login($body, $accept)

Creates a Login Instance and returns an API Key.

Creates a Login Instance and returns an API Key


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

# **V1LoginInitiate**
> StandardInitiateLoginResultData V1LoginInitiate($body, $accept)

Initiate Login

Sends an Email with a Verification Link.


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

# **V1LoginPasswordForgot**
> SuccessResult V1LoginPasswordForgot($body, $accept)

Sends an email with a password reset token

Sends an email with a password reset token


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

# **V1Signup**
> SuccessResult V1Signup($body, $accept)

Creates a new Unverified Account.

Creates a new Unverified Account.


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

# **V1UserBankOtpNumber**
> StandardInitiateLoginResultData V1UserBankOtpNumber($number, $authorization, $accept)

Send OTP for Bank Link

Send OTP for an additional Bank Link.


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

# **V1UserExchangeKyc**
> SuccessResult V1UserExchangeKyc($panNumber, $acctNick, $name, $ban, $ifsc, $acctType, $banType, $phone, $otp, $file, $authorization, $message, $accept)

Submits a New Bank Link and initial KYC Documents.

Submits a New Bank Link and initial KYC Documents.


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
 **file** | ***os.File**| Enter a valid image, pdf or zip file under 5 MB in size. | 
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

# **V1UserGcmCode**
> SuccessResult V1UserGcmCode($code, $authorization, $accept)

Delete GCM Code

Delete GCM Code and associated API Key.


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

# **V1UserKycOtpNumber**
> SuccessResult V1UserKycOtpNumber($number, $authorization, $accept)

Send OTP for KYC Link

Send OTP for KYC Link.


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

# **V1UserLogout**
> SuccessResult V1UserLogout($authorization, $accept)

Logout User

Logs out user and Deletes the api key and associated session data.


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

# **V1UserNetkiCreate**
> SuccessResult V1UserNetkiCreate($body, $authorization, $accept)

Create Neki Wallet Name

Creates a new Netki Wallet Name.


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

# **V1UserNetkiUpdate**
> SuccessResult V1UserNetkiUpdate($body, $authorization, $accept)

Update Netki Address

Updates the address on an existing wallet name.


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

# **V1UserProfileImageDelete**
> SuccessResult V1UserProfileImageDelete($body, $authorization, $accept)

Delete Profile Image

Deletes a profile Image.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetkiName**](NetkiName.md)| Please enter a valid Netki name associated with your prfile Image. | 
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

# **V1UserProfileImageUpdate**
> SuccessResult V1UserProfileImageUpdate($netkiName, $isPublic, $file, $authorization, $accept)

Update Profile Image

Updates Profile Image and allows public or private options for netki profile page.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netkiName** | **string**| Please enter your Netki Wallet Name. | 
 **isPublic** | **bool**| Please enter if this image can be public. | 
 **file** | ***os.File**| Enter a valid image, pdf or zip file under 5 MB in size. | 
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

# **V1UserProfilePhone**
> SuccessResult V1UserProfilePhone($body, $authorization, $accept)

New Profile Phone

Set a New Profile Phone Number.


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

# **V1UserProfilePhoneNumber**
> SuccessResult V1UserProfilePhoneNumber($authorization, $accept)

Delete Profile Phone Number

Delete Profile Phone Number.


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

# **V1UserProfilePhoneOtpNumber**
> SuccessResult V1UserProfilePhoneOtpNumber($number, $authorization, $accept)

Send OTP for Profile Phone

Send OTP for Profile Phone addition or updation.


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

