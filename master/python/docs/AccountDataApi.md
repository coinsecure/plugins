# swagger_client.AccountDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1exchangebanksummary**](AccountDataApi.md#v1exchangebanksummary) | **GET** /v1/user/exchange/bank/summary | Exchange Bank Summary
[**v1exchangeusercoinfee**](AccountDataApi.md#v1exchangeusercoinfee) | **GET** /v1/user/exchange/coin/fee | Users Coin Fee Percentage
[**v1exchangeuserfiatfee**](AccountDataApi.md#v1exchangeuserfiatfee) | **GET** /v1/user/exchange/fiat/fee | Users Fiat Fee Percentage
[**v1netkisearch_netki_name**](AccountDataApi.md#v1netkisearch_netki_name) | **GET** /v1/netki/search/{netkiName} | Coinsecure.me Netki Lookup
[**v1userexchangekycs**](AccountDataApi.md#v1userexchangekycs) | **GET** /v1/user/exchange/kycs | Gets KYC Status Details
[**v1userexchangereferralcoinpaid**](AccountDataApi.md#v1userexchangereferralcoinpaid) | **GET** /v1/user/exchange/referral/coin/paid | Users Paid Fiat Referrals
[**v1userexchangereferralcoinsuccessful**](AccountDataApi.md#v1userexchangereferralcoinsuccessful) | **GET** /v1/user/exchange/referral/coin/successful | Gets Users Successful Referral Links
[**v1userexchangereferralfiatpaid**](AccountDataApi.md#v1userexchangereferralfiatpaid) | **GET** /v1/user/exchange/referral/fiat/paid | Users Paid Fiat Referrals
[**v1userexchangereferrals**](AccountDataApi.md#v1userexchangereferrals) | **GET** /v1/user/exchange/referrals | Gets Users Referral Links
[**v1userexchangetradesummary**](AccountDataApi.md#v1userexchangetradesummary) | **GET** /v1/user/exchange/trade/summary | Exchange Trade Summary
[**v1userlogintoken_token**](AccountDataApi.md#v1userlogintoken_token) | **GET** /v1/user/login/token/{token} | Login Token Email
[**v1usersummary**](AccountDataApi.md#v1usersummary) | **GET** /v1/user/summary | Exchange Bank Summary
[**v1userwalletsummary**](AccountDataApi.md#v1userwalletsummary) | **GET** /v1/user/wallet/summary | Exchange Bank Summary


# **v1exchangebanksummary**
> BankSummaryDataResponse v1exchangebanksummary(authorization, accept=accept)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Exchange Bank Summary
    api_response = api_instance.v1exchangebanksummary(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1exchangebanksummary: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**BankSummaryDataResponse**](BankSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangeusercoinfee**
> DoubleDataResponse v1exchangeusercoinfee(authorization=authorization, accept=accept)

Users Coin Fee Percentage

Returns the users coin fee percentage. The response is in percentage.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Users Coin Fee Percentage
    api_response = api_instance.v1exchangeusercoinfee(authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1exchangeusercoinfee: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangeuserfiatfee**
> DoubleDataResponse v1exchangeuserfiatfee(authorization, accept=accept)

Users Fiat Fee Percentage

Returns the users fiat fee percentage. The response is in percentage.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Users Fiat Fee Percentage
    api_response = api_instance.v1exchangeuserfiatfee(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1exchangeuserfiatfee: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1netkisearch_netki_name**
> DoubleDataResponse v1netkisearch_netki_name(netki_name, accept=accept)

Coinsecure.me Netki Lookup

Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
netki_name = 'netki_name_example' # str | 
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Coinsecure.me Netki Lookup
    api_response = api_instance.v1netkisearch_netki_name(netki_name, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1netkisearch_netki_name: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netki_name** | **str**|  | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangekycs**
> KYCDataResponse v1userexchangekycs(authorization, accept=accept)

Gets KYC Status Details

Gets Users KYC Status Details.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Gets KYC Status Details
    api_response = api_instance.v1userexchangekycs(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1userexchangekycs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**KYCDataResponse**](KYCDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangereferralcoinpaid**
> SuccCoinRefDataResponse v1userexchangereferralcoinpaid(authorization, accept=accept)

Users Paid Fiat Referrals

Returns the Users Paid Coin Referrals.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Users Paid Fiat Referrals
    api_response = api_instance.v1userexchangereferralcoinpaid(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1userexchangereferralcoinpaid: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccCoinRefDataResponse**](SuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangereferralcoinsuccessful**
> SuccRefDataResponse v1userexchangereferralcoinsuccessful(authorization, accept=accept)

Gets Users Successful Referral Links

Gets Users Successful Referral Links that can be used during signup.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Gets Users Successful Referral Links
    api_response = api_instance.v1userexchangereferralcoinsuccessful(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1userexchangereferralcoinsuccessful: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccRefDataResponse**](SuccRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangereferralfiatpaid**
> SuccCoinRefDataResponse v1userexchangereferralfiatpaid(authorization, accept=accept)

Users Paid Fiat Referrals

Returns the Users Paid Fiat Referrals.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Users Paid Fiat Referrals
    api_response = api_instance.v1userexchangereferralfiatpaid(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1userexchangereferralfiatpaid: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccCoinRefDataResponse**](SuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangereferrals**
> AllRefDataResponse v1userexchangereferrals(authorization, accept=accept)

Gets Users Referral Links

Gets Users Referral Links that can be used during signup.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Gets Users Referral Links
    api_response = api_instance.v1userexchangereferrals(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1userexchangereferrals: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**AllRefDataResponse**](AllRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangetradesummary**
> TradeSummaryDataResponse v1userexchangetradesummary(authorization, accept=accept)

Exchange Trade Summary

Gets a Summary of Exchange Trade Data.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Exchange Trade Summary
    api_response = api_instance.v1userexchangetradesummary(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1userexchangetradesummary: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**TradeSummaryDataResponse**](TradeSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userlogintoken_token**
> SuccessResult v1userlogintoken_token(token, accept=accept)

Login Token Email

Retrieves details of a Login Token

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
token = 'token_example' # str | 
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Login Token Email
    api_response = api_instance.v1userlogintoken_token(token, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1userlogintoken_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**|  | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1usersummary**
> UserSummaryDataResponse v1usersummary(authorization, accept=accept)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Exchange Bank Summary
    api_response = api_instance.v1usersummary(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1usersummary: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**UserSummaryDataResponse**](UserSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletsummary**
> WalletSummaryDataResponse v1userwalletsummary(authorization, accept=accept)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccountDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Exchange Bank Summary
    api_response = api_instance.v1userwalletsummary(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountDataApi->v1userwalletsummary: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletSummaryDataResponse**](WalletSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

