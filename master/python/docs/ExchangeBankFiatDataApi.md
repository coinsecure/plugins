# swagger_client.ExchangeBankFiatDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankfiataccounts**](ExchangeBankFiatDataApi.md#v1userexchangebankfiataccounts) | **GET** /v1/user/exchange/bank/fiat/accounts | Exchange Bitcoin Deposit Addresses
[**v1userexchangebankfiatbalanceavailable**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalanceavailable) | **GET** /v1/user/exchange/bank/fiat/balance/total | Available Exchange Fiat Balance
[**v1userexchangebankfiatbalancepending**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancepending) | **GET** /v1/user/exchange/bank/fiat/balance/pending | In Trade Coin Balance
[**v1userexchangebankfiatbalancetotal**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancetotal) | **GET** /v1/user/exchange/bank/fiat/balance/available | Total Exchange Fiat Balance
[**v1userexchangebankfiatdepositcancelled**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositcancelled) | **GET** /v1/user/exchange/bank/fiat/deposit/cancelled | Cancelled Exchange Fiat Deposits
[**v1userexchangebankfiatdepositunverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositunverified) | **GET** /v1/user/exchange/bank/fiat/deposit/unverified | Unverified Exchange Fiat Deposits
[**v1userexchangebankfiatdepositverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositverified) | **GET** /v1/user/exchange/bank/fiat/deposit/verified | Verified Exchange Fiat Deposits
[**v1userexchangebankfiatwithdrawcancelled**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcancelled) | **GET** /v1/user/exchange/bank/fiat/withdraw/cancelled | Cancelled Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawcompleted**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcompleted) | **GET** /v1/user/exchange/bank/fiat/withdraw/completed | Completed Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawunverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawunverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/unverified | Unverified Exchange Fiat Withdrawals
[**v1userexchangebankfiatwithdrawverified**](ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/verified | Verified Exchange Fiat Withdrawals


# **v1userexchangebankfiataccounts**
> FiatBankDataResponse v1userexchangebankfiataccounts(authorization, accept=accept)

Exchange Bitcoin Deposit Addresses

Gets a List of Users Exchange Bitcoin Addresses.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Exchange Bitcoin Deposit Addresses
    api_response = api_instance.v1userexchangebankfiataccounts(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiataccounts: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatBankDataResponse**](FiatBankDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatbalanceavailable**
> RateDataResponse v1userexchangebankfiatbalanceavailable(authorization, accept=accept)

Available Exchange Fiat Balance

Returns balance which is in Available for Trades. The response is in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Available Exchange Fiat Balance
    api_response = api_instance.v1userexchangebankfiatbalanceavailable(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatbalanceavailable: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatbalancepending**
> RateDataResponse v1userexchangebankfiatbalancepending(authorization, accept=accept)

In Trade Coin Balance

Returns in-trade or pending fiat balance in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # In Trade Coin Balance
    api_response = api_instance.v1userexchangebankfiatbalancepending(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatbalancepending: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatbalancetotal**
> RateDataResponse v1userexchangebankfiatbalancetotal(authorization, accept=accept)

Total Exchange Fiat Balance

Returns users total fiat balance in paisa. Pending + Available

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Total Exchange Fiat Balance
    api_response = api_instance.v1userexchangebankfiatbalancetotal(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatbalancetotal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatdepositcancelled**
> FiatDepDataResponse v1userexchangebankfiatdepositcancelled(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Cancelled Exchange Fiat Deposits

Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancelled Exchange Fiat Deposits
    api_response = api_instance.v1userexchangebankfiatdepositcancelled(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatdepositcancelled: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **_from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatdepositunverified**
> FiatDepDataResponse v1userexchangebankfiatdepositunverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Unverified Exchange Fiat Deposits

Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Unverified Exchange Fiat Deposits
    api_response = api_instance.v1userexchangebankfiatdepositunverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatdepositunverified: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **_from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatdepositverified**
> FiatDepDataResponse v1userexchangebankfiatdepositverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Verified Exchange Fiat Deposits

Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Verified Exchange Fiat Deposits
    api_response = api_instance.v1userexchangebankfiatdepositverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatdepositverified: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **_from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatwithdrawcancelled**
> FiatWithDataResponse v1userexchangebankfiatwithdrawcancelled(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Cancelled Exchange Fiat Withdrawals

Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancelled Exchange Fiat Withdrawals
    api_response = api_instance.v1userexchangebankfiatwithdrawcancelled(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawcancelled: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **_from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatwithdrawcompleted**
> FiatWithDataResponse v1userexchangebankfiatwithdrawcompleted(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Completed Exchange Fiat Withdrawals

Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Completed Exchange Fiat Withdrawals
    api_response = api_instance.v1userexchangebankfiatwithdrawcompleted(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawcompleted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **_from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatwithdrawunverified**
> FiatWithDataResponse v1userexchangebankfiatwithdrawunverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Unverified Exchange Fiat Withdrawals

Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Unverified Exchange Fiat Withdrawals
    api_response = api_instance.v1userexchangebankfiatwithdrawunverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawunverified: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **_from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankfiatwithdrawverified**
> FiatWithDataResponse v1userexchangebankfiatwithdrawverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Verified Exchange Fiat Withdrawals

Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankFiatDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Verified Exchange Fiat Withdrawals
    api_response = api_instance.v1userexchangebankfiatwithdrawverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankFiatDataApi->v1userexchangebankfiatwithdrawverified: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **_from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

