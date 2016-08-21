# ExchangeBankFiatDataApi

All URIs are relative to *https://api.coinsecure.in*

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


<a name="v1userexchangebankfiataccounts"></a>
# **v1userexchangebankfiataccounts**
> FiatBankDataResponse v1userexchangebankfiataccounts(authorization, accept)

Exchange Bitcoin Deposit Addresses

Gets a List of Users Exchange Bitcoin Addresses.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    FiatBankDataResponse result = apiInstance.v1userexchangebankfiataccounts(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiataccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**FiatBankDataResponse**](FiatBankDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatbalanceavailable"></a>
# **v1userexchangebankfiatbalanceavailable**
> RateDataResponse v1userexchangebankfiatbalanceavailable(authorization, accept)

Available Exchange Fiat Balance

Returns balance which is in Available for Trades. The response is in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    RateDataResponse result = apiInstance.v1userexchangebankfiatbalanceavailable(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiatbalanceavailable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatbalancepending"></a>
# **v1userexchangebankfiatbalancepending**
> RateDataResponse v1userexchangebankfiatbalancepending(authorization, accept)

In Trade Coin Balance

Returns in-trade or pending fiat balance in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    RateDataResponse result = apiInstance.v1userexchangebankfiatbalancepending(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiatbalancepending");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatbalancetotal"></a>
# **v1userexchangebankfiatbalancetotal**
> RateDataResponse v1userexchangebankfiatbalancetotal(authorization, accept)

Total Exchange Fiat Balance

Returns users total fiat balance in paisa. Pending + Available

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    RateDataResponse result = apiInstance.v1userexchangebankfiatbalancetotal(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiatbalancetotal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**RateDataResponse**](RateDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatdepositcancelled"></a>
# **v1userexchangebankfiatdepositcancelled**
> FiatDepDataResponse v1userexchangebankfiatdepositcancelled(authorization, from, to, max, offset, accept)

Cancelled Exchange Fiat Deposits

Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    FiatDepDataResponse result = apiInstance.v1userexchangebankfiatdepositcancelled(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiatdepositcancelled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **from** | **Long**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **Long**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **Integer**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **Long**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatdepositunverified"></a>
# **v1userexchangebankfiatdepositunverified**
> FiatDepDataResponse v1userexchangebankfiatdepositunverified(authorization, from, to, max, offset, accept)

Unverified Exchange Fiat Deposits

Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    FiatDepDataResponse result = apiInstance.v1userexchangebankfiatdepositunverified(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiatdepositunverified");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **from** | **Long**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **Long**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **Integer**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **Long**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatdepositverified"></a>
# **v1userexchangebankfiatdepositverified**
> FiatDepDataResponse v1userexchangebankfiatdepositverified(authorization, from, to, max, offset, accept)

Verified Exchange Fiat Deposits

Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    FiatDepDataResponse result = apiInstance.v1userexchangebankfiatdepositverified(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiatdepositverified");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **from** | **Long**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **Long**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **Integer**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **Long**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**FiatDepDataResponse**](FiatDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatwithdrawcancelled"></a>
# **v1userexchangebankfiatwithdrawcancelled**
> FiatWithDataResponse v1userexchangebankfiatwithdrawcancelled(authorization, from, to, max, offset, accept)

Cancelled Exchange Fiat Withdrawals

Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    FiatWithDataResponse result = apiInstance.v1userexchangebankfiatwithdrawcancelled(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiatwithdrawcancelled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **from** | **Long**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **Long**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **Integer**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **Long**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatwithdrawcompleted"></a>
# **v1userexchangebankfiatwithdrawcompleted**
> FiatWithDataResponse v1userexchangebankfiatwithdrawcompleted(authorization, from, to, max, offset, accept)

Completed Exchange Fiat Withdrawals

Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    FiatWithDataResponse result = apiInstance.v1userexchangebankfiatwithdrawcompleted(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiatwithdrawcompleted");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **from** | **Long**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **Long**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **Integer**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **Long**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatwithdrawunverified"></a>
# **v1userexchangebankfiatwithdrawunverified**
> FiatWithDataResponse v1userexchangebankfiatwithdrawunverified(authorization, from, to, max, offset, accept)

Unverified Exchange Fiat Withdrawals

Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    FiatWithDataResponse result = apiInstance.v1userexchangebankfiatwithdrawunverified(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiatwithdrawunverified");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **from** | **Long**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **Long**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **Integer**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **Long**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankfiatwithdrawverified"></a>
# **v1userexchangebankfiatwithdrawverified**
> FiatWithDataResponse v1userexchangebankfiatwithdrawverified(authorization, from, to, max, offset, accept)

Verified Exchange Fiat Withdrawals

Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.api.ExchangeBankFiatDataApi;

ExchangeBankFiatDataApi apiInstance = new ExchangeBankFiatDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    FiatWithDataResponse result = apiInstance.v1userexchangebankfiatwithdrawverified(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankFiatDataApi#v1userexchangebankfiatwithdrawverified");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **from** | **Long**| From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) | [optional] [default to 0]
 **to** | **Long**| To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) | [optional] [default to 9223372036854776000]
 **max** | **Integer**| Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) | [optional] [default to 10]
 **offset** | **Long**| Offset defaults to 0 if input is invalid. (Optional) | [optional] [default to 0]
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**FiatWithDataResponse**](FiatWithDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

