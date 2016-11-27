# ExchangeBankCoinDataApi

All URIs are relative to *https://api.coinsecure.in/*

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


<a name="v1userexchangebankcoinaddresses"></a>
# **v1userexchangebankcoinaddresses**
> TradeAddressDataResponse v1userexchangebankcoinaddresses(authorization, accept)

Exchange Coin Addresses

Gets a List of Users Exchange Bitcoin Deposit Addresses.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    TradeAddressDataResponse result = apiInstance.v1userexchangebankcoinaddresses(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoinaddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**TradeAddressDataResponse**](TradeAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoinbalanceavailable"></a>
# **v1userexchangebankcoinbalanceavailable**
> VolDataResponse v1userexchangebankcoinbalanceavailable(authorization, accept)

Available Exchange Coin Balance

Returns balance which is in Available for Trades. The response is in satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    VolDataResponse result = apiInstance.v1userexchangebankcoinbalanceavailable(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoinbalanceavailable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoinbalancepending"></a>
# **v1userexchangebankcoinbalancepending**
> VolDataResponse v1userexchangebankcoinbalancepending(authorization, accept)

In Trade Coin Balance

Returns in-trade or pending coin balance in satoshi.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    VolDataResponse result = apiInstance.v1userexchangebankcoinbalancepending(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoinbalancepending");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoinbalancetotal"></a>
# **v1userexchangebankcoinbalancetotal**
> VolDataResponse v1userexchangebankcoinbalancetotal(authorization, accept)

Total Exchange Coin Balance

Returns users total coin balance in satoshis. Pending + Available

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    VolDataResponse result = apiInstance.v1userexchangebankcoinbalancetotal(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoinbalancetotal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added |
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional]

### Return type

[**VolDataResponse**](VolDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoindepositcancelled"></a>
# **v1userexchangebankcoindepositcancelled**
> CoinDepDataResponse v1userexchangebankcoindepositcancelled(authorization, from, to, max, offset, accept)

Cancelled Exchange Coin Deposits

Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    CoinDepDataResponse result = apiInstance.v1userexchangebankcoindepositcancelled(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoindepositcancelled");
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoindepositunverified"></a>
# **v1userexchangebankcoindepositunverified**
> CoinDepDataResponse v1userexchangebankcoindepositunverified(authorization, from, to, max, offset, accept)

Unverified Exchange Coin Deposits

Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    CoinDepDataResponse result = apiInstance.v1userexchangebankcoindepositunverified(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoindepositunverified");
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoindepositverified"></a>
# **v1userexchangebankcoindepositverified**
> CoinDepDataResponse v1userexchangebankcoindepositverified(authorization, from, to, max, offset, accept)

Verified Exchange Coin Deposits

Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    CoinDepDataResponse result = apiInstance.v1userexchangebankcoindepositverified(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoindepositverified");
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

[**CoinDepDataResponse**](CoinDepDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoinwithdrawcancelled"></a>
# **v1userexchangebankcoinwithdrawcancelled**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcancelled(authorization, from, to, max, offset, accept)

Cancelled Exchange Coin Withdrawals

Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    TradeCoinWithdrawDataResponse result = apiInstance.v1userexchangebankcoinwithdrawcancelled(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoinwithdrawcancelled");
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoinwithdrawcompleted"></a>
# **v1userexchangebankcoinwithdrawcompleted**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcompleted(authorization, from, to, max, offset, accept)

Completed Exchange Coin Withdrawals

Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    TradeCoinWithdrawDataResponse result = apiInstance.v1userexchangebankcoinwithdrawcompleted(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoinwithdrawcompleted");
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoinwithdrawunverified"></a>
# **v1userexchangebankcoinwithdrawunverified**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawunverified(authorization, from, to, max, offset, accept)

Unverified Exchange Coin Withdrawals

Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    TradeCoinWithdrawDataResponse result = apiInstance.v1userexchangebankcoinwithdrawunverified(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoinwithdrawunverified");
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangebankcoinwithdrawverified"></a>
# **v1userexchangebankcoinwithdrawverified**
> TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawverified(authorization, from, to, max, offset, accept)

Verified Exchange Coin Withdrawals

Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExchangeBankCoinDataApi;


ExchangeBankCoinDataApi apiInstance = new ExchangeBankCoinDataApi();
String authorization = "authorization_example"; // String | API object to be added
Long from = 0L; // Long | From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
Long to = 9223372036854776000L; // Long | To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
Integer max = 10; // Integer | Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
Long offset = 0L; // Long | Offset defaults to 0 if input is invalid. (Optional)
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    TradeCoinWithdrawDataResponse result = apiInstance.v1userexchangebankcoinwithdrawverified(authorization, from, to, max, offset, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExchangeBankCoinDataApi#v1userexchangebankcoinwithdrawverified");
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

[**TradeCoinWithdrawDataResponse**](TradeCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

