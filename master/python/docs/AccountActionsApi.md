# swagger_client.AccountActionsApi

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
> StandardLoginResultData v1login(body, accept=accept)

Creates a Login Instance and returns an API Key.

Creates a Login Instance and returns an API Key

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
body = swagger_client.LoginFormNew() # LoginFormNew | Please send the form with valid inputs.
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Creates a Login Instance and returns an API Key.
    api_response = api_instance.v1login(body, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1login: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginFormNew**](LoginFormNew.md)| Please send the form with valid inputs. | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**StandardLoginResultData**](StandardLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1logininitiate**
> StandardInitiateLoginResultData v1logininitiate(body, accept=accept)

Initiate Login

Sends an Email with a Verification Link.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
body = swagger_client.LoginId() # LoginId | Enter a valid Login ID. This method will send an email with a token to be used for login.
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Initiate Login
    api_response = api_instance.v1logininitiate(body, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1logininitiate: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginId**](LoginId.md)| Enter a valid Login ID. This method will send an email with a token to be used for login. | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**StandardInitiateLoginResultData**](StandardInitiateLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1loginpasswordforgot**
> SuccessResult v1loginpasswordforgot(body, accept=accept)

Sends an email with a password reset token

Sends an email with a password reset token

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
body = swagger_client.Email() # Email | Enter a valid and registered Email ID.
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Sends an email with a password reset token
    api_response = api_instance.v1loginpasswordforgot(body, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1loginpasswordforgot: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Email**](Email.md)| Enter a valid and registered Email ID. | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1signup**
> SuccessResult v1signup(body, accept=accept)

Creates a new Unverified Account.

Creates a new Unverified Account.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
body = swagger_client.SignupForm() # SignupForm | Please send the form with valid inputs.
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Creates a new Unverified Account.
    api_response = api_instance.v1signup(body, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1signup: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SignupForm**](SignupForm.md)| Please send the form with valid inputs. | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userbankotp_number**
> StandardInitiateLoginResultData v1userbankotp_number(number, authorization=authorization, accept=accept)

Send OTP for Bank Link

Send OTP for an additional Bank Link.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
number = 'number_example' # str | 
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Send OTP for Bank Link
    api_response = api_instance.v1userbankotp_number(number, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1userbankotp_number: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **str**|  | 
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**StandardInitiateLoginResultData**](StandardInitiateLoginResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangekyc**
> SuccessResult v1userexchangekyc(pan_number, acct_nick, name, ban, ifsc, acct_type, ban_type, phone, otp, file, authorization=authorization, message=message, accept=accept)

Submits a New Bank Link and initial KYC Documents.

Submits a New Bank Link and initial KYC Documents.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
pan_number = 'pan_number_example' # str | Please enter your Pan Card Number
acct_nick = 'acct_nick_example' # str | Please enter an Account NickName
name = 'name_example' # str | Please enter your Name as it appears on your Bank account.
ban = 'ban_example' # str | Please enter your Bank account number.
ifsc = 'ifsc_example' # str | Please enter your IFSC Code.
acct_type = 'acct_type_example' # str | Please enter your Coinsecure account type. Allowable Values are Personal or Company.
ban_type = 'ban_type_example' # str | Please enter your Bank account type. Allowable Values are Savings or Current.
phone = 'phone_example' # str | Please enter your Valid Phone Number.
otp = 'otp_example' # str | Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number.
file = '/path/to/file.txt' # file | Enter a valid image, pdf or zip file under 5 MB in size.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
message = 'message_example' # str | Please enter an optional message if needed. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Submits a New Bank Link and initial KYC Documents.
    api_response = api_instance.v1userexchangekyc(pan_number, acct_nick, name, ban, ifsc, acct_type, ban_type, phone, otp, file, authorization=authorization, message=message, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1userexchangekyc: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pan_number** | **str**| Please enter your Pan Card Number | 
 **acct_nick** | **str**| Please enter an Account NickName | 
 **name** | **str**| Please enter your Name as it appears on your Bank account. | 
 **ban** | **str**| Please enter your Bank account number. | 
 **ifsc** | **str**| Please enter your IFSC Code. | 
 **acct_type** | **str**| Please enter your Coinsecure account type. Allowable Values are Personal or Company. | 
 **ban_type** | **str**| Please enter your Bank account type. Allowable Values are Savings or Current. | 
 **phone** | **str**| Please enter your Valid Phone Number. | 
 **otp** | **str**| Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number. | 
 **file** | **file**| Enter a valid image, pdf or zip file under 5 MB in size. | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **message** | **str**| Please enter an optional message if needed. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usergcm_code**
> SuccessResult v1usergcm_code(code, authorization=authorization, accept=accept)

Delete GCM Code

Delete GCM Code and associated API Key.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
code = 'code_example' # str | 
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Delete GCM Code
    api_response = api_instance.v1usergcm_code(code, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1usergcm_code: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**|  | 
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userkycotp_number**
> SuccessResult v1userkycotp_number(number, authorization=authorization, accept=accept)

Send OTP for KYC Link

Send OTP for KYC Link.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
number = 'number_example' # str | 
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Send OTP for KYC Link
    api_response = api_instance.v1userkycotp_number(number, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1userkycotp_number: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **str**|  | 
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userlogout**
> SuccessResult v1userlogout(authorization=authorization, accept=accept)

Logout User

Logs out user and Deletes the api key and associated session data.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Logout User
    api_response = api_instance.v1userlogout(authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1userlogout: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usernetkicreate**
> SuccessResult v1usernetkicreate(body, authorization=authorization, accept=accept)

Create Neki Wallet Name

Creates a new Netki Wallet Name.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
body = swagger_client.NetkiNameAddress() # NetkiNameAddress | Enter a valid Netki name and Bitcoin address from Wallet or Exchange.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Create Neki Wallet Name
    api_response = api_instance.v1usernetkicreate(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1usernetkicreate: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetkiNameAddress**](NetkiNameAddress.md)| Enter a valid Netki name and Bitcoin address from Wallet or Exchange. | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usernetkiupdate**
> SuccessResult v1usernetkiupdate(body, authorization=authorization, accept=accept)

Update Netki Address

Updates the address on an existing wallet name.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
body = swagger_client.Address() # Address | Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Update Netki Address
    api_response = api_instance.v1usernetkiupdate(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1usernetkiupdate: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Address**](Address.md)| Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name. | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userprofileimagedelete**
> SuccessResult v1userprofileimagedelete(body, authorization=authorization, accept=accept)

Delete Profile Image

Deletes a profile Image.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
body = swagger_client.NetkiName() # NetkiName | Please enter a valid Netki name associated with your prfile Image.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Delete Profile Image
    api_response = api_instance.v1userprofileimagedelete(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1userprofileimagedelete: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetkiName**](NetkiName.md)| Please enter a valid Netki name associated with your prfile Image. | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userprofileimageupdate**
> SuccessResult v1userprofileimageupdate(netki_name, is_public, file, authorization=authorization, accept=accept)

Update Profile Image

Updates Profile Image and allows public or private options for netki profile page.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
netki_name = 'netki_name_example' # str | Please enter your Netki Wallet Name.
is_public = true # bool | Please enter if this image can be public.
file = '/path/to/file.txt' # file | Enter a valid image, pdf or zip file under 5 MB in size.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Update Profile Image
    api_response = api_instance.v1userprofileimageupdate(netki_name, is_public, file, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1userprofileimageupdate: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netki_name** | **str**| Please enter your Netki Wallet Name. | 
 **is_public** | **bool**| Please enter if this image can be public. | 
 **file** | **file**| Enter a valid image, pdf or zip file under 5 MB in size. | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userprofilephone**
> SuccessResult v1userprofilephone(body, authorization=authorization, accept=accept)

New Profile Phone

Set a New Profile Phone Number.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
body = swagger_client.NumberOtp() # NumberOtp | You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # New Profile Phone
    api_response = api_instance.v1userprofilephone(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1userprofilephone: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NumberOtp**](NumberOtp.md)| You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userprofilephone_number**
> SuccessResult v1userprofilephone_number(authorization=authorization, accept=accept)

Delete Profile Phone Number

Delete Profile Phone Number.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Delete Profile Phone Number
    api_response = api_instance.v1userprofilephone_number(authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1userprofilephone_number: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userprofilephoneotp_number**
> SuccessResult v1userprofilephoneotp_number(number, authorization=authorization, accept=accept)

Send OTP for Profile Phone

Send OTP for Profile Phone addition or updation.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountActionsApi()
number = 'number_example' # str | 
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Send OTP for Profile Phone
    api_response = api_instance.v1userprofilephoneotp_number(number, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling AccountActionsApi->v1userprofilephoneotp_number: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **str**|  | 
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

