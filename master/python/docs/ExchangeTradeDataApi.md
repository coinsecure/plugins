# swagger_client.ExchangeTradeDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1exchangeasklow**](ExchangeTradeDataApi.md#v1exchangeasklow) | **GET** /v1/exchange/ask/low | Lowest Ask
[**v1exchangeaskorders**](ExchangeTradeDataApi.md#v1exchangeaskorders) | **GET** /v1/exchange/ask/orders | All Sell Orders
[**v1exchangebidhigh**](ExchangeTradeDataApi.md#v1exchangebidhigh) | **GET** /v1/exchange/bid/high | Returns the Highest Bid in the Order Book
[**v1exchangebidorders**](ExchangeTradeDataApi.md#v1exchangebidorders) | **GET** /v1/exchange/bid/orders | All Buy Orders
[**v1exchangelast_trade**](ExchangeTradeDataApi.md#v1exchangelast_trade) | **GET** /v1/exchange/lastTrade | Last Trade
[**v1exchangemax24_hr**](ExchangeTradeDataApi.md#v1exchangemax24_hr) | **GET** /v1/exchange/max24Hr | Max 24 Hour Rate
[**v1exchangemin24_hr**](ExchangeTradeDataApi.md#v1exchangemin24_hr) | **GET** /v1/exchange/min24Hr | Min 24 Hour Rate
[**v1exchangeticker**](ExchangeTradeDataApi.md#v1exchangeticker) | **GET** /v1/exchange/ticker | Exchange Ticker
[**v1userexchangeaskcancelled**](ExchangeTradeDataApi.md#v1userexchangeaskcancelled) | **GET** /v1/user/exchange/ask/cancelled | Cancelled User Sell Orders
[**v1userexchangeaskcompleted**](ExchangeTradeDataApi.md#v1userexchangeaskcompleted) | **GET** /v1/user/exchange/ask/completed | Completed User Sell Orders
[**v1userexchangeaskpending**](ExchangeTradeDataApi.md#v1userexchangeaskpending) | **GET** /v1/user/exchange/ask/pending | Pending User Sell Orders
[**v1userexchangebidcancelled**](ExchangeTradeDataApi.md#v1userexchangebidcancelled) | **GET** /v1/user/exchange/bid/cancelled | Cancelled User Buy Orders
[**v1userexchangebidcompleted**](ExchangeTradeDataApi.md#v1userexchangebidcompleted) | **GET** /v1/user/exchange/bid/completed | Completed User Buy Orders
[**v1userexchangebidpending**](ExchangeTradeDataApi.md#v1userexchangebidpending) | **GET** /v1/user/exchange/bid/pending | Pending User Buy Orders
[**v1userexchangetrades**](ExchangeTradeDataApi.md#v1userexchangetrades) | **GET** /v1/exchange/trades | Completed Exchange Trades


# **v1exchangeasklow**
> RateDataResponse v1exchangeasklow(accept=accept)

Lowest Ask

Returns the Lowest Ask Rate in Json. The Amount is in Paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Lowest Ask
    api_response = api_instance.v1exchangeasklow(accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1exchangeasklow: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangeaskorders**
> RateVolDataResponse v1exchangeaskorders(accept=accept)

All Sell Orders

Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # All Sell Orders
    api_response = api_instance.v1exchangeaskorders(accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1exchangeaskorders: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateVolDataResponse**](RateVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangebidhigh**
> RateDataResponse v1exchangebidhigh(accept=accept)

Returns the Highest Bid in the Order Book

Highest Bid.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Returns the Highest Bid in the Order Book
    api_response = api_instance.v1exchangebidhigh(accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1exchangebidhigh: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangebidorders**
> RateVolDataResponse v1exchangebidorders(accept=accept)

All Buy Orders

Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # All Buy Orders
    api_response = api_instance.v1exchangebidorders(accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1exchangebidorders: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateVolDataResponse**](RateVolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangelast_trade**
> LastTradeDataResponse v1exchangelast_trade(accept=accept)

Last Trade

Returns a summary of data from the Exchange.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Last Trade
    api_response = api_instance.v1exchangelast_trade(accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1exchangelast_trade: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**LastTradeDataResponse**](LastTradeDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangemax24_hr**
> RateDiffDataResponse v1exchangemax24_hr(accept=accept)

Max 24 Hour Rate

Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Max 24 Hour Rate
    api_response = api_instance.v1exchangemax24_hr(accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1exchangemax24_hr: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDiffDataResponse**](RateDiffDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangemin24_hr**
> RateDiffDataResponse v1exchangemin24_hr(accept=accept)

Min 24 Hour Rate

Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Min 24 Hour Rate
    api_response = api_instance.v1exchangemin24_hr(accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1exchangemin24_hr: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateDiffDataResponse**](RateDiffDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1exchangeticker**
> StandardTickerResultData v1exchangeticker(accept=accept)

Exchange Ticker

Returns a summary of data from the Exchange.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Exchange Ticker
    api_response = api_instance.v1exchangeticker(accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1exchangeticker: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**StandardTickerResultData**](StandardTickerResultData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeaskcancelled**
> OrderDataResponse v1userexchangeaskcancelled(authorization, accept=accept)

Cancelled User Sell Orders

Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancelled User Sell Orders
    api_response = api_instance.v1userexchangeaskcancelled(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1userexchangeaskcancelled: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeaskcompleted**
> OrderDataResponse v1userexchangeaskcompleted(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)

Completed User Sell Orders

Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
authorization = 'authorization_example' # str | API object to be added
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Completed User Sell Orders
    api_response = api_instance.v1userexchangeaskcompleted(authorization, _from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1userexchangeaskcompleted: %s\n" % e)
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

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeaskpending**
> OrderDataResponse v1userexchangeaskpending(authorization, accept=accept)

Pending User Sell Orders

Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Pending User Sell Orders
    api_response = api_instance.v1userexchangeaskpending(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1userexchangeaskpending: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebidcancelled**
> OrderDataResponse v1userexchangebidcancelled(authorization, accept=accept)

Cancelled User Buy Orders

Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancelled User Buy Orders
    api_response = api_instance.v1userexchangebidcancelled(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1userexchangebidcancelled: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebidcompleted**
> OrderDataResponse v1userexchangebidcompleted(authorization, accept=accept)

Completed User Buy Orders

Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Completed User Buy Orders
    api_response = api_instance.v1userexchangebidcompleted(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1userexchangebidcompleted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebidpending**
> OrderDataResponse v1userexchangebidpending(authorization, accept=accept)

Pending User Buy Orders

Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Pending User Buy Orders
    api_response = api_instance.v1userexchangebidpending(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1userexchangebidpending: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**OrderDataResponse**](OrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangetrades**
> RateVolTimeTypeDataResponse v1userexchangetrades(_from=_from, to=to, max=max, offset=offset, accept=accept)

Completed Exchange Trades

Returns all completed Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeDataApi()
_from = 0 # int | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional) (default to 0)
to = 9223372036854776000 # int | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional) (default to 9223372036854776000)
max = 10 # int | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional) (default to 10)
offset = 0 # int | Offset defaults to 0 if input is invalid. (Optional) (optional) (default to 0)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Completed Exchange Trades
    api_response = api_instance.v1userexchangetrades(_from=_from, to=to, max=max, offset=offset, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeTradeDataApi->v1userexchangetrades: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_from** | **int**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **int**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **int**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **int**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**RateVolTimeTypeDataResponse**](RateVolTimeTypeDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

