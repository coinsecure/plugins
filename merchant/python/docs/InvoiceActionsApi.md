# swagger_client.InvoiceActionsApi

All URIs are relative to *https://pay.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_new_invoice**](InvoiceActionsApi.md#create_new_invoice) | **POST** /invoice/createNewInvoice | NEW INVOICE
[**load_invoice**](InvoiceActionsApi.md#load_invoice) | **GET** /invoice/{invoiceID} | 


# **create_new_invoice**
> SuccessInvoice create_new_invoice(apikey, body)

NEW INVOICE

Allows user to create a new Invoice.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceActionsApi()
apikey = 'apikey_example' # str | Enter User Key
body = swagger_client.NewInvoice() # NewInvoice | Enter details to create an Invoice

try: 
    # NEW INVOICE
    api_response = api_instance.create_new_invoice(apikey, body)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling InvoiceActionsApi->create_new_invoice: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Enter User Key | 
 **body** | [**NewInvoice**](NewInvoice.md)| Enter details to create an Invoice | 

### Return type

[**SuccessInvoice**](SuccessInvoice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **load_invoice**
> ActionAnyContent load_invoice(invoice_id)



### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InvoiceActionsApi()
invoice_id = 'invoice_id_example' # str | 

try: 
    api_response = api_instance.load_invoice(invoice_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling InvoiceActionsApi->load_invoice: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice_id** | **str**|  | 

### Return type

[**ActionAnyContent**](ActionAnyContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

