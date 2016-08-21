# swagger_client.ExchangeTradeActionsApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangeaskcancel_order_id**](ExchangeTradeActionsApi.md#v1userexchangeaskcancel_order_id) | **DELETE** /v1/user/exchange/ask/cancel/{orderID} | Cancel Open Sell Order
[**v1userexchangeasknew**](ExchangeTradeActionsApi.md#v1userexchangeasknew) | **PUT** /v1/user/exchange/ask/new | BTC Sell Order
[**v1userexchangebidcancel_order_id**](ExchangeTradeActionsApi.md#v1userexchangebidcancel_order_id) | **DELETE** /v1/user/exchange/bid/cancel/{orderID} | Cancel Open Buy Order
[**v1userexchangebidnew**](ExchangeTradeActionsApi.md#v1userexchangebidnew) | **PUT** /v1/user/exchange/bid/new | BTC Buy Order
[**v1userexchangeinstantbuy**](ExchangeTradeActionsApi.md#v1userexchangeinstantbuy) | **PUT** /v1/user/exchange/instant/buy | Instantly Buy BTC
[**v1userexchangeinstantsell**](ExchangeTradeActionsApi.md#v1userexchangeinstantsell) | **PUT** /v1/user/exchange/instant/sell | Instantly Sell BTC


# **v1userexchangeaskcancel_order_id**
> SuccessCancelDataResponse v1userexchangeaskcancel_order_id(order_id, authorization=authorization)

Cancel Open Sell Order

Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeActionsApi()
order_id = 'order_id_example' # str | 
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)

try: 
    # Cancel Open Sell Order
    api_response = api_instance.v1userexchangeaskcancel_order_id(order_id, authorization=authorization)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeTradeActionsApi->v1userexchangeaskcancel_order_id: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **str**|  | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 

### Return type

[**SuccessCancelDataResponse**](SuccessCancelDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeasknew**
> SuccessOrderDataResponse v1userexchangeasknew(body, authorization=authorization, accept=accept)

BTC Sell Order

Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeActionsApi()
body = swagger_client.RateVolData() # RateVolData | Please send the form with valid inputs.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # BTC Sell Order
    api_response = api_instance.v1userexchangeasknew(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeTradeActionsApi->v1userexchangeasknew: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateVolData**](RateVolData.md)| Please send the form with valid inputs. | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebidcancel_order_id**
> SuccessCancelDataResponse v1userexchangebidcancel_order_id(order_id, authorization=authorization)

Cancel Open Buy Order

Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeActionsApi()
order_id = 'order_id_example' # str | 
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)

try: 
    # Cancel Open Buy Order
    api_response = api_instance.v1userexchangebidcancel_order_id(order_id, authorization=authorization)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeTradeActionsApi->v1userexchangebidcancel_order_id: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **str**|  | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 

### Return type

[**SuccessCancelDataResponse**](SuccessCancelDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangebidnew**
> SuccessOrderDataResponse v1userexchangebidnew(body, authorization=authorization, accept=accept)

BTC Buy Order

Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeActionsApi()
body = swagger_client.RateVolData() # RateVolData | Please send the form with valid inputs.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # BTC Buy Order
    api_response = api_instance.v1userexchangebidnew(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeTradeActionsApi->v1userexchangebidnew: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RateVolData**](RateVolData.md)| Please send the form with valid inputs. | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeinstantbuy**
> SuccessOrderDataResponse v1userexchangeinstantbuy(body, authorization=authorization, accept=accept)

Instantly Buy BTC

Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeActionsApi()
body = swagger_client.MinFiat() # MinFiat | Please send the form with valid inputs.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Instantly Buy BTC
    api_response = api_instance.v1userexchangeinstantbuy(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeTradeActionsApi->v1userexchangeinstantbuy: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MinFiat**](MinFiat.md)| Please send the form with valid inputs. | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userexchangeinstantsell**
> SuccessOrderDataResponse v1userexchangeinstantsell(body, authorization=authorization, accept=accept)

Instantly Sell BTC

Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeTradeActionsApi()
body = swagger_client.MaxVol() # MaxVol | Please send the form with valid inputs.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Instantly Sell BTC
    api_response = api_instance.v1userexchangeinstantsell(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ExchangeTradeActionsApi->v1userexchangeinstantsell: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MaxVol**](MaxVol.md)| Please send the form with valid inputs. | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessOrderDataResponse**](SuccessOrderDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

