# swagger_client.InvoiceDataApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_canc_invoices**](InvoiceDataApi.md#get_canc_invoices) | **POST** /invoice/getCancInvoices | GET ALL CANCELLED INVOICES
[**get_complete_invoices**](InvoiceDataApi.md#get_complete_invoices) | **POST** /invoice/getCompleteInvoices | GET ALL COMPLETED INVOICES
[**get_conf_invoices**](InvoiceDataApi.md#get_conf_invoices) | **POST** /invoice/getConfInvoices | GET ALL CONFIRMED INVOICES
[**get_invoice_from_id**](InvoiceDataApi.md#get_invoice_from_id) | **GET** /invoice/getInvoiceFromID/{invoiceID} | GET INVOICE FROM ID
[**get_paid_invoices**](InvoiceDataApi.md#get_paid_invoices) | **POST** /invoice/getPaidInvoices | GET ALL PAID INVOICES
[**get_refund_invoices**](InvoiceDataApi.md#get_refund_invoices) | **POST** /invoice/getRefundInvoices | GET ALL REFUND INVOICES
[**get_unprocessed_invoices**](InvoiceDataApi.md#get_unprocessed_invoices) | **POST** /invoice/getUnprocessedInvoices | GET ALL UNPROCESSED INVOICES


# **get_canc_invoices**
> SuccessInvoices get_canc_invoices(apikey, body)

GET ALL CANCELLED INVOICES

Gets All Cancelled Invoice Details.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceDataApi()
apikey = 'apikey_example' # str | Enter User Key
body = swagger_client.InvoiceIDFull() # InvoiceIDFull | Enter details to query Invoices

try: 
    # GET ALL CANCELLED INVOICES
    api_response = api_instance.get_canc_invoices(apikey, body)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling InvoiceDataApi->get_canc_invoices: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_complete_invoices**
> SuccessInvoices get_complete_invoices(apikey, body)

GET ALL COMPLETED INVOICES

Gets All Completed Invoice Details.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceDataApi()
apikey = 'apikey_example' # str | Enter User Key
body = swagger_client.InvoiceIDFull() # InvoiceIDFull | Enter details to query Invoices

try: 
    # GET ALL COMPLETED INVOICES
    api_response = api_instance.get_complete_invoices(apikey, body)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling InvoiceDataApi->get_complete_invoices: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_conf_invoices**
> SuccessInvoices get_conf_invoices(apikey, body)

GET ALL CONFIRMED INVOICES

Gets All Confirmed Invoice Details.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceDataApi()
apikey = 'apikey_example' # str | Enter User Key
body = swagger_client.InvoiceIDFull() # InvoiceIDFull | Enter details to query Invoices

try: 
    # GET ALL CONFIRMED INVOICES
    api_response = api_instance.get_conf_invoices(apikey, body)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling InvoiceDataApi->get_conf_invoices: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_invoice_from_id**
> SuccessInvoice get_invoice_from_id(invoice_id, apikey)

GET INVOICE FROM ID

Gets Details of an Invoice ID.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceDataApi()
invoice_id = 'invoice_id_example' # str | 
apikey = 'apikey_example' # str | Enter User Key

try: 
    # GET INVOICE FROM ID
    api_response = api_instance.get_invoice_from_id(invoice_id, apikey)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling InvoiceDataApi->get_invoice_from_id: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | **str**|  | 
 **apikey** | **str**| Enter User Key | 

### Return type

[**SuccessInvoice**](SuccessInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_paid_invoices**
> SuccessInvoices get_paid_invoices(apikey, body)

GET ALL PAID INVOICES

Gets All Paid Invoice Details.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceDataApi()
apikey = 'apikey_example' # str | Enter User Key
body = swagger_client.InvoiceIDFull() # InvoiceIDFull | Enter details to query Invoices

try: 
    # GET ALL PAID INVOICES
    api_response = api_instance.get_paid_invoices(apikey, body)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling InvoiceDataApi->get_paid_invoices: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_refund_invoices**
> SuccessInvoices get_refund_invoices(apikey, body)

GET ALL REFUND INVOICES

Gets All Refund Invoice Details.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceDataApi()
apikey = 'apikey_example' # str | Enter User Key
body = swagger_client.InvoiceIDFull() # InvoiceIDFull | Enter details to query Invoices

try: 
    # GET ALL REFUND INVOICES
    api_response = api_instance.get_refund_invoices(apikey, body)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling InvoiceDataApi->get_refund_invoices: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_unprocessed_invoices**
> SuccessInvoices get_unprocessed_invoices(apikey, body)

GET ALL UNPROCESSED INVOICES

Gets All Unprocessed Invoice Details.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceDataApi()
apikey = 'apikey_example' # str | Enter User Key
body = swagger_client.InvoiceIDFull() # InvoiceIDFull | Enter details to query Invoices

try: 
    # GET ALL UNPROCESSED INVOICES
    api_response = api_instance.get_unprocessed_invoices(apikey, body)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling InvoiceDataApi->get_unprocessed_invoices: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Enter User Key | 
 **body** | [**InvoiceIDFull**](InvoiceIDFull.md)| Enter details to query Invoices | 

### Return type

[**SuccessInvoices**](SuccessInvoices.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

