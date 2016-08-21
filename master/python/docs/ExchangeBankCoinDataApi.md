# swagger_client.ExchangeBankCoinDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankcoinaddresses**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinaddresses) | **GET** /v1/user/exchange/bank/coin/addresses | Exchange Coin Addresses
[**v1userexchangebankcoinbalanceavailable**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalanceavailable) | **GET** /v1/user/exchange/bank/coin/balance/total | Available Exchange Coin Balance
[**v1userexchangebankcoinbalancepending**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancepending) | **GET** /v1/user/exchange/bank/coin/balance/pending | In Trade Coin Balance
[**v1userexchangebankcoinbalancetotal**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancetotal) | **GET** /v1/user/exchange/bank/coin/balance/available | Total Exchange Coin Balance
[**v1userexchangebankcoindepositcancelled**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositcancelled) | **GET** /v1/user/exchange/bank/coin/deposit/cancelled | Cancelled Exchange Coin Deposits
[**v1userexchangebankcoindepositunverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositunverified) | **GET** /v1/user/exchange/bank/coin/deposit/unverified | Unverified Exchange Coin Deposits
[**v1userexchangebankcoindepositverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositverified) | **GET** /v1/user/exchange/bank/coin/deposit/verified | Verified Exchange Coin Deposits
[**v1userexchangebankcoinwithdrawcancelled**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcancelled) | **GET** /v1/user/exchange/bank/coin/withdraw/cancelled | Cancelled Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawcompleted**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcompleted) | **GET** /v1/user/exchange/bank/coin/withdraw/completed | Completed Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawunverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawunverified) | **GET** /v1/user/exchange/bank/coin/withdraw/unverified | Unverified Exchange Coin Withdrawals
[**v1userexchangebankcoinwithdrawverified**](ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawverified) | **GET** /v1/user/exchange/bank/coin/withdraw/verified | Verified Exchange Coin Withdrawals


# **v1userexchangebankcoinaddresses**
> TradeAddressDataResponse v1userexchangebankcoinaddresses(authorization, accept=accept)

Exchange Coin Addresses

Gets a List of Users Exchange Bitcoin Deposit Addresses.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Exchange Coin Addresses
    api_response = api_instance.v1userexchangebankcoinaddresses(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinaddresses: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**TradeAddressDataResponse**](TradeAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinbalanceavailable**
> VolDataResponse v1userexchangebankcoinbalanceavailable(authorization, accept=accept)

Available Exchange Coin Balance

Returns balance which is in Available for Trades. The response is in satoshis.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Available Exchange Coin Balance
    api_response = api_instance.v1userexchangebankcoinbalanceavailable(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinbalanceavailable: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinbalancepending**
> VolDataResponse v1userexchangebankcoinbalancepending(authorization, accept=accept)

In Trade Coin Balance

Returns in-trade or pending coin balance in satoshi.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # In Trade Coin Balance
    api_response = api_instance.v1userexchangebankcoinbalancepending(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinbalancepending: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinbalancetotal**
> VolDataResponse v1userexchangebankcoinbalancetotal(authorization, accept=accept)

Total Exchange Coin Balance

Returns users total coin balance in satoshis. Pending + Available

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Total Exchange Coin Balance
    api_response = api_instance.v1userexchangebankcoinbalancetotal(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinbalancetotal: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoindepositcancelled**
> CoinDepDataResponse v1userexchangebankcoindepositcancelled(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Cancelled Exchange Coin Deposits

Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancelled Exchange Coin Deposits
    api_response = api_instance.v1userexchangebankcoindepositcancelled(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoindepositcancelled: %s\n" % e
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoindepositunverified**
> CoinDepDataResponse v1userexchangebankcoindepositunverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Unverified Exchange Coin Deposits

Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Unverified Exchange Coin Deposits
    api_response = api_instance.v1userexchangebankcoindepositunverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoindepositunverified: %s\n" % e
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoindepositverified**
> CoinDepDataResponse v1userexchangebankcoindepositverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Verified Exchange Coin Deposits

Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Verified Exchange Coin Deposits
    api_response = api_instance.v1userexchangebankcoindepositverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoindepositverified: %s\n" % e
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinwithdrawcancelled**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcancelled(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Cancelled Exchange Coin Withdrawals

Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancelled Exchange Coin Withdrawals
    api_response = api_instance.v1userexchangebankcoinwithdrawcancelled(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawcancelled: %s\n" % e
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinwithdrawcompleted**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcompleted(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Completed Exchange Coin Withdrawals

Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Completed Exchange Coin Withdrawals
    api_response = api_instance.v1userexchangebankcoinwithdrawcompleted(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawcompleted: %s\n" % e
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinwithdrawunverified**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawunverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Unverified Exchange Coin Withdrawals

Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Unverified Exchange Coin Withdrawals
    api_response = api_instance.v1userexchangebankcoinwithdrawunverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawunverified: %s\n" % e
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebankcoinwithdrawverified**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Verified Exchange Coin Withdrawals

Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankCoinDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Verified Exchange Coin Withdrawals
    api_response = api_instance.v1userexchangebankcoinwithdrawverified(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeBankCoinDataApi->v1userexchangebankcoinwithdrawverified: %s\n" % e
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

