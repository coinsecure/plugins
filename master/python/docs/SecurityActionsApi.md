# swagger_client.SecurityActionsApi

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
> SuccessResult v1mfaauthyinitiate(body, authorization=authorization, accept=accept)

Initiate Authy Registration.

Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SecurityActionsApi()
body = swagger_client.MethodCountryMobile() # MethodCountryMobile | Please Send Valid Json as below.
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Initiate Authy Registration.
    api_response = api_instance.v1mfaauthyinitiate(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SecurityActionsApi->v1mfaauthyinitiate: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MethodCountryMobile**](MethodCountryMobile.md)| Please Send Valid Json as below. | 
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

# **v1mfagainitiate**
> SuccessResult v1mfagainitiate(authorization=authorization, accept=accept)

Initiate GA Registration.

Returns the Google Authenticator Secret and a QR code URL.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SecurityActionsApi()
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Initiate GA Registration.
    api_response = api_instance.v1mfagainitiate(authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SecurityActionsApi->v1mfagainitiate: %s\n" % e
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

# **v1usermfaauthycall**
> SuccessResult v1usermfaauthycall(authorization=authorization, accept=accept)

Authy Call Code

Calls valid phone user with a code.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SecurityActionsApi()
authorization = 'authorization_example' # str | Login Token or any Apikey to be added as Authorization in header (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Authy Call Code
    api_response = api_instance.v1usermfaauthycall(authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SecurityActionsApi->v1usermfaauthycall: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Login Token or any Apikey to be added as Authorization in header | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usermfaauthydisable_code**
> SuccessResult v1usermfaauthydisable_code(code, authorization=authorization, accept=accept)

Disable Authy

Disables users Authy

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SecurityActionsApi()
code = 'code_example' # str | 
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Disable Authy
    api_response = api_instance.v1usermfaauthydisable_code(code, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SecurityActionsApi->v1usermfaauthydisable_code: %s\n" % e
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

# **v1usermfaauthyinitiateenable**
> SuccessResult v1usermfaauthyinitiateenable(body, authorization=authorization, accept=accept)

Verify Authy Registration

Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SecurityActionsApi()
body = swagger_client.CodeCountryMobile() # CodeCountryMobile | Please Send Valid Json as below.
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Verify Authy Registration
    api_response = api_instance.v1usermfaauthyinitiateenable(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SecurityActionsApi->v1usermfaauthyinitiateenable: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CodeCountryMobile**](CodeCountryMobile.md)| Please Send Valid Json as below. | 
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

# **v1usermfaauthysms**
> SuccessResult v1usermfaauthysms(authorization=authorization, accept=accept)

Authy Sms Code

Disables users Authy

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SecurityActionsApi()
authorization = 'authorization_example' # str | Login Token or any Apikey to be added as Authorization in header (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Authy Sms Code
    api_response = api_instance.v1usermfaauthysms(authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SecurityActionsApi->v1usermfaauthysms: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Login Token or any Apikey to be added as Authorization in header | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usermfagadisable_code**
> SuccessResult v1usermfagadisable_code(code, authorization=authorization, accept=accept)

Disable Google Authenticator

Disables users Google Authenticator 2FA

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SecurityActionsApi()
code = 'code_example' # str | 
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Disable Google Authenticator
    api_response = api_instance.v1usermfagadisable_code(code, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SecurityActionsApi->v1usermfagadisable_code: %s\n" % e
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

# **v1usermfagainitiateenable**
> SuccessResult v1usermfagainitiateenable(body, authorization=authorization, accept=accept)

Enable Google Authenticator

Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SecurityActionsApi()
body = swagger_client.Code() # Code | Please Send Valid Json as below.
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Enable Google Authenticator
    api_response = api_instance.v1usermfagainitiateenable(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SecurityActionsApi->v1usermfagainitiateenable: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| Please Send Valid Json as below. | 
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

# **v1userpasswordchange**
> SuccessResult v1userpasswordchange(body, authorization=authorization, accept=accept)

Change Password.

Changes an account Password.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SecurityActionsApi()
body = swagger_client.ChangePassword() # ChangePassword | 
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Change Password.
    api_response = api_instance.v1userpasswordchange(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SecurityActionsApi->v1userpasswordchange: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChangePassword**](ChangePassword.md)|  | 
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

# **v1userpasswordreset**
> SuccessResult v1userpasswordreset(body, accept=accept)

Reset Password.

Resets an account Password. Use forgotPassword to generate a token.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SecurityActionsApi()
body = swagger_client.ResetPassword() # ResetPassword | Please Send Valid Json as below.
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Reset Password.
    api_response = api_instance.v1userpasswordreset(body, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SecurityActionsApi->v1userpasswordreset: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResetPassword**](ResetPassword.md)| Please Send Valid Json as below. | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

