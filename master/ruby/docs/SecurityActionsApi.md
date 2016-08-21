# SwaggerClient::SecurityActionsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1mfaauthyinitiate**](SecurityActionsApi.md#v1mfaauthyinitiate) | **POST** /v1/mfa/authy/initiate | Initiate Authy Registration.
[**v1mfagainitiate**](SecurityActionsApi.md#v1mfagainitiate) | **POST** /v1/mfa/ga/initiate | Initiate GA Registration.
[**v1usermfaauthycall**](SecurityActionsApi.md#v1usermfaauthycall) | **GET** /v1/mfa/authy/call | Authy Call Code
[**v1usermfaauthydisable_code**](SecurityActionsApi.md#v1usermfaauthydisable_code) | **DELETE** /v1/user/mfa/authy/disable/{code} | Disable Authy
[**v1usermfaauthyinitiateenable**](SecurityActionsApi.md#v1usermfaauthyinitiateenable) | **PUT** /v1/user/mfa/authy/initiate/enable | Verify Authy Registration
[**v1usermfaauthysms**](SecurityActionsApi.md#v1usermfaauthysms) | **GET** /v1/mfa/authy/sms | Authy Sms Code
[**v1usermfagadisable_code**](SecurityActionsApi.md#v1usermfagadisable_code) | **DELETE** /v1/user/mfa/ga/disable/{code} | Disable Google Authenticator
[**v1usermfagainitiateenable**](SecurityActionsApi.md#v1usermfagainitiateenable) | **PUT** /v1/user/mfa/ga/initiate/enable | Enable Google Authenticator
[**v1userpasswordchange**](SecurityActionsApi.md#v1userpasswordchange) | **POST** /v1/user/password/change | Change Password.
[**v1userpasswordreset**](SecurityActionsApi.md#v1userpasswordreset) | **POST** /v1/user/password/reset | Reset Password.


# **v1mfaauthyinitiate**
> SuccessResult v1mfaauthyinitiate(body, opts)

Initiate Authy Registration.

Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SecurityActionsApi.new

body = SwaggerClient::MethodCountryMobile.new # MethodCountryMobile | Please Send Valid Json as below.

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Initiate Authy Registration.
  result = api_instance.v1mfaauthyinitiate(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecurityActionsApi->v1mfaauthyinitiate: #{e}"
end
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



# **v1mfagainitiate**
> SuccessResult v1mfagainitiate(opts)

Initiate GA Registration.

Returns the Google Authenticator Secret and a QR code URL.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SecurityActionsApi.new

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Initiate GA Registration.
  result = api_instance.v1mfagainitiate(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecurityActionsApi->v1mfagainitiate: #{e}"
end
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



# **v1usermfaauthycall**
> SuccessResult v1usermfaauthycall(opts)

Authy Call Code

Calls valid phone user with a code.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SecurityActionsApi.new

opts = { 
  authorization: "authorization_example", # String | Login Token or any Apikey to be added as Authorization in header
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Authy Call Code
  result = api_instance.v1usermfaauthycall(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecurityActionsApi->v1usermfaauthycall: #{e}"
end
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



# **v1usermfaauthydisable_code**
> SuccessResult v1usermfaauthydisable_code(code, opts)

Disable Authy

Disables users Authy

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SecurityActionsApi.new

code = "code_example" # String | 

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Disable Authy
  result = api_instance.v1usermfaauthydisable_code(code, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecurityActionsApi->v1usermfaauthydisable_code: #{e}"
end
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



# **v1usermfaauthyinitiateenable**
> SuccessResult v1usermfaauthyinitiateenable(body, opts)

Verify Authy Registration

Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SecurityActionsApi.new

body = SwaggerClient::CodeCountryMobile.new # CodeCountryMobile | Please Send Valid Json as below.

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Verify Authy Registration
  result = api_instance.v1usermfaauthyinitiateenable(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecurityActionsApi->v1usermfaauthyinitiateenable: #{e}"
end
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



# **v1usermfaauthysms**
> SuccessResult v1usermfaauthysms(opts)

Authy Sms Code

Disables users Authy

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SecurityActionsApi.new

opts = { 
  authorization: "authorization_example", # String | Login Token or any Apikey to be added as Authorization in header
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Authy Sms Code
  result = api_instance.v1usermfaauthysms(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecurityActionsApi->v1usermfaauthysms: #{e}"
end
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



# **v1usermfagadisable_code**
> SuccessResult v1usermfagadisable_code(code, opts)

Disable Google Authenticator

Disables users Google Authenticator 2FA

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SecurityActionsApi.new

code = "code_example" # String | 

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Disable Google Authenticator
  result = api_instance.v1usermfagadisable_code(code, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecurityActionsApi->v1usermfagadisable_code: #{e}"
end
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



# **v1usermfagainitiateenable**
> SuccessResult v1usermfagainitiateenable(body, opts)

Enable Google Authenticator

Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SecurityActionsApi.new

body = SwaggerClient::Code.new # Code | Please Send Valid Json as below.

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Enable Google Authenticator
  result = api_instance.v1usermfagainitiateenable(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecurityActionsApi->v1usermfagainitiateenable: #{e}"
end
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



# **v1userpasswordchange**
> SuccessResult v1userpasswordchange(body, opts)

Change Password.

Changes an account Password.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SecurityActionsApi.new

body = SwaggerClient::ChangePassword.new # ChangePassword | 

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Change Password.
  result = api_instance.v1userpasswordchange(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecurityActionsApi->v1userpasswordchange: #{e}"
end
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



# **v1userpasswordreset**
> SuccessResult v1userpasswordreset(body, opts)

Reset Password.

Resets an account Password. Use forgotPassword to generate a token.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SecurityActionsApi.new

body = SwaggerClient::ResetPassword.new # ResetPassword | Please Send Valid Json as below.

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Reset Password.
  result = api_instance.v1userpasswordreset(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SecurityActionsApi->v1userpasswordreset: #{e}"
end
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



