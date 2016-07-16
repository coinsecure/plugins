# SwaggerClient::AccountActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1login**](AccountActionsApi.md#v1login) | **POST** /v1/login | Creates a Login Instance and returns an API Key.
[**v1logininitiate**](AccountActionsApi.md#v1logininitiate) | **POST** /v1/login/initiate | Initiate Login
[**v1loginpasswordforgot**](AccountActionsApi.md#v1loginpasswordforgot) | **POST** /v1/login/password/forgot | Sends an email with a password reset token
[**v1signup**](AccountActionsApi.md#v1signup) | **POST** /v1/signup | Creates a new Unverified Account.
[**v1userbankotp_number**](AccountActionsApi.md#v1userbankotp_number) | **GET** /v1/user/bank/otp/{number} | Send OTP for Bank Link
[**v1userexchangekyc**](AccountActionsApi.md#v1userexchangekyc) | **PUT** /v1/user/exchange/kyc | Submits a New Bank Link and initial KYC Documents.
[**v1usergcm_code**](AccountActionsApi.md#v1usergcm_code) | **DELETE** /v1/user/gcm/{code} | Delete GCM Code
[**v1userkycotp_number**](AccountActionsApi.md#v1userkycotp_number) | **GET** /v1/user/kyc/otp/{number} | Send OTP for KYC Link
[**v1userlogout**](AccountActionsApi.md#v1userlogout) | **DELETE** /v1/user/logout | Logout User
[**v1usernetkicreate**](AccountActionsApi.md#v1usernetkicreate) | **PUT** /v1/user/netki/create | Create Neki Wallet Name
[**v1usernetkiupdate**](AccountActionsApi.md#v1usernetkiupdate) | **PATCH** /v1/user/netki/update | Update Netki Address
[**v1userprofileimagedelete**](AccountActionsApi.md#v1userprofileimagedelete) | **POST** /v1/user/contact | Delete Profile Image
[**v1userprofileimageupdate**](AccountActionsApi.md#v1userprofileimageupdate) | **PATCH** /v1/user/profile/image/update | Update Profile Image
[**v1userprofilephone**](AccountActionsApi.md#v1userprofilephone) | **PUT** /v1/user/profile/phone/new | New Profile Phone
[**v1userprofilephone_number**](AccountActionsApi.md#v1userprofilephone_number) | **DELETE** /v1/user/profile/phone/delete | Delete Profile Phone Number
[**v1userprofilephoneotp_number**](AccountActionsApi.md#v1userprofilephoneotp_number) | **GET** /v1/user/profile/phone/otp/{number} | Send OTP for Profile Phone


# **v1login**
> StandardLoginResultData v1login(body, opts)

Creates a Login Instance and returns an API Key.

Creates a Login Instance and returns an API Key

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

body = SwaggerClient::LoginFormNew.new # LoginFormNew | Please send the form with valid inputs.

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Creates a Login Instance and returns an API Key.
  result = api_instance.v1login(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1login: #{e}"
end
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



# **v1logininitiate**
> StandardInitiateLoginResultData v1logininitiate(body, opts)

Initiate Login

Sends an Email with a Verification Link.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

body = SwaggerClient::LoginId.new # LoginId | Enter a valid Login ID. This method will send an email with a token to be used for login.

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Initiate Login
  result = api_instance.v1logininitiate(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1logininitiate: #{e}"
end
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



# **v1loginpasswordforgot**
> SuccessResult v1loginpasswordforgot(body, opts)

Sends an email with a password reset token

Sends an email with a password reset token

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

body = SwaggerClient::Email.new # Email | Enter a valid and registered Email ID.

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Sends an email with a password reset token
  result = api_instance.v1loginpasswordforgot(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1loginpasswordforgot: #{e}"
end
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



# **v1signup**
> SuccessResult v1signup(body, opts)

Creates a new Unverified Account.

Creates a new Unverified Account.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

body = SwaggerClient::SignupForm.new # SignupForm | Please send the form with valid inputs.

opts = { 
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Creates a new Unverified Account.
  result = api_instance.v1signup(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1signup: #{e}"
end
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



# **v1userbankotp_number**
> StandardInitiateLoginResultData v1userbankotp_number(number, opts)

Send OTP for Bank Link

Send OTP for an additional Bank Link.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

number = "number_example" # String | 

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Send OTP for Bank Link
  result = api_instance.v1userbankotp_number(number, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1userbankotp_number: #{e}"
end
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



# **v1userexchangekyc**
> SuccessResult v1userexchangekyc(pan_number, acct_nick, name, ban, ifsc, acct_type, ban_type, phone, otp, file, opts)

Submits a New Bank Link and initial KYC Documents.

Submits a New Bank Link and initial KYC Documents.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

pan_number = "pan_number_example" # String | Please enter your Pan Card Number

acct_nick = "acct_nick_example" # String | Please enter an Account NickName

name = "name_example" # String | Please enter your Name as it appears on your Bank account.

ban = "ban_example" # String | Please enter your Bank account number.

ifsc = "ifsc_example" # String | Please enter your IFSC Code.

acct_type = "acct_type_example" # String | Please enter your Coinsecure account type. Allowable Values are Personal or Company.

ban_type = "ban_type_example" # String | Please enter your Bank account type. Allowable Values are Savings or Current.

phone = "phone_example" # String | Please enter your Valid Phone Number.

otp = "otp_example" # String | Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number.

file = File.new("/path/to/file.txt") # File | Enter a valid image, pdf or zip file under 5 MB in size.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  message: "message_example", # String | Please enter an optional message if needed.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Submits a New Bank Link and initial KYC Documents.
  result = api_instance.v1userexchangekyc(pan_number, acct_nick, name, ban, ifsc, acct_type, ban_type, phone, otp, file, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1userexchangekyc: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pan_number** | **String**| Please enter your Pan Card Number | 
 **acct_nick** | **String**| Please enter an Account NickName | 
 **name** | **String**| Please enter your Name as it appears on your Bank account. | 
 **ban** | **String**| Please enter your Bank account number. | 
 **ifsc** | **String**| Please enter your IFSC Code. | 
 **acct_type** | **String**| Please enter your Coinsecure account type. Allowable Values are Personal or Company. | 
 **ban_type** | **String**| Please enter your Bank account type. Allowable Values are Savings or Current. | 
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



# **v1usergcm_code**
> SuccessResult v1usergcm_code(code, opts)

Delete GCM Code

Delete GCM Code and associated API Key.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

code = "code_example" # String | 

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Delete GCM Code
  result = api_instance.v1usergcm_code(code, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1usergcm_code: #{e}"
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



# **v1userkycotp_number**
> SuccessResult v1userkycotp_number(number, opts)

Send OTP for KYC Link

Send OTP for KYC Link.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

number = "number_example" # String | 

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Send OTP for KYC Link
  result = api_instance.v1userkycotp_number(number, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1userkycotp_number: #{e}"
end
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



# **v1userlogout**
> SuccessResult v1userlogout(opts)

Logout User

Logs out user and Deletes the api key and associated session data.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Logout User
  result = api_instance.v1userlogout(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1userlogout: #{e}"
end
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



# **v1usernetkicreate**
> SuccessResult v1usernetkicreate(body, opts)

Create Neki Wallet Name

Creates a new Netki Wallet Name.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

body = SwaggerClient::NetkiNameAddress.new # NetkiNameAddress | Enter a valid Netki name and Bitcoin address from Wallet or Exchange.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Create Neki Wallet Name
  result = api_instance.v1usernetkicreate(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1usernetkicreate: #{e}"
end
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



# **v1usernetkiupdate**
> SuccessResult v1usernetkiupdate(body, opts)

Update Netki Address

Updates the address on an existing wallet name.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

body = SwaggerClient::Address.new # Address | Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Update Netki Address
  result = api_instance.v1usernetkiupdate(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1usernetkiupdate: #{e}"
end
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



# **v1userprofileimagedelete**
> SuccessResult v1userprofileimagedelete(body, opts)

Delete Profile Image

Deletes a profile Image.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

body = SwaggerClient::NetkiName.new # NetkiName | Please enter a valid Netki name associated with your prfile Image.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Delete Profile Image
  result = api_instance.v1userprofileimagedelete(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1userprofileimagedelete: #{e}"
end
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



# **v1userprofileimageupdate**
> SuccessResult v1userprofileimageupdate(netki_name, is_public, file, opts)

Update Profile Image

Updates Profile Image and allows public or private options for netki profile page.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

netki_name = "netki_name_example" # String | Please enter your Netki Wallet Name.

is_public = true # BOOLEAN | Please enter if this image can be public.

file = File.new("/path/to/file.txt") # File | Enter a valid image, pdf or zip file under 5 MB in size.

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Update Profile Image
  result = api_instance.v1userprofileimageupdate(netki_name, is_public, file, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1userprofileimageupdate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netki_name** | **String**| Please enter your Netki Wallet Name. | 
 **is_public** | **BOOLEAN**| Please enter if this image can be public. | 
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



# **v1userprofilephone**
> SuccessResult v1userprofilephone(body, opts)

New Profile Phone

Set a New Profile Phone Number.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

body = SwaggerClient::NumberOtp.new # NumberOtp | You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number

opts = { 
  authorization: "authorization_example", # String | Enter a valid Api Key.
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #New Profile Phone
  result = api_instance.v1userprofilephone(body, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1userprofilephone: #{e}"
end
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



# **v1userprofilephone_number**
> SuccessResult v1userprofilephone_number(opts)

Delete Profile Phone Number

Delete Profile Phone Number.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Delete Profile Phone Number
  result = api_instance.v1userprofilephone_number(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1userprofilephone_number: #{e}"
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



# **v1userprofilephoneotp_number**
> SuccessResult v1userprofilephoneotp_number(number, opts)

Send OTP for Profile Phone

Send OTP for Profile Phone addition or updation.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AccountActionsApi.new

number = "number_example" # String | 

opts = { 
  authorization: "authorization_example", # String | API object to be added
  accept: "accept_example" # String | JSON, XML or CSV can be returned (Optional)
}

begin
  #Send OTP for Profile Phone
  result = api_instance.v1userprofilephoneotp_number(number, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AccountActionsApi->v1userprofilephoneotp_number: #{e}"
end
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



