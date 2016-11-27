# CoinsecureApiDocumentation.AccountDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1exchangebanksummary**](AccountDataApi.md#v1exchangebanksummary) | **GET** /v1/user/exchange/bank/summary | Exchange Bank Summary
[**v1exchangeusercoinfee**](AccountDataApi.md#v1exchangeusercoinfee) | **GET** /v1/user/exchange/coin/fee | Users Coin Fee Percentage
[**v1exchangeuserfiatfee**](AccountDataApi.md#v1exchangeuserfiatfee) | **GET** /v1/user/exchange/fiat/fee | Users Fiat Fee Percentage
[**v1netkisearchNetkiName**](AccountDataApi.md#v1netkisearchNetkiName) | **GET** /v1/netki/search/{netkiName} | Coinsecure.me Netki Lookup
[**v1userexchangekycs**](AccountDataApi.md#v1userexchangekycs) | **GET** /v1/user/exchange/kycs | Gets KYC Status Details
[**v1userexchangereferralcoinpaid**](AccountDataApi.md#v1userexchangereferralcoinpaid) | **GET** /v1/user/exchange/referral/coin/paid | Users Paid Fiat Referrals
[**v1userexchangereferralcoinsuccessful**](AccountDataApi.md#v1userexchangereferralcoinsuccessful) | **GET** /v1/user/exchange/referral/coin/successful | Gets Users Successful Referral Links
[**v1userexchangereferralfiatpaid**](AccountDataApi.md#v1userexchangereferralfiatpaid) | **GET** /v1/user/exchange/referral/fiat/paid | Users Paid Fiat Referrals
[**v1userexchangereferrals**](AccountDataApi.md#v1userexchangereferrals) | **GET** /v1/user/exchange/referrals | Gets Users Referral Links
[**v1userexchangetradesummary**](AccountDataApi.md#v1userexchangetradesummary) | **GET** /v1/user/exchange/trade/summary | Exchange Trade Summary
[**v1userlogintokenToken**](AccountDataApi.md#v1userlogintokenToken) | **GET** /v1/user/login/token/{token} | Login Token Email
[**v1usersummary**](AccountDataApi.md#v1usersummary) | **GET** /v1/user/summary | Exchange Bank Summary
[**v1userwalletsummary**](AccountDataApi.md#v1userwalletsummary) | **GET** /v1/user/wallet/summary | Exchange Bank Summary


<a name="v1exchangebanksummary"></a>
# **v1exchangebanksummary**
> BankSummaryDataResponse v1exchangebanksummary(authorization, opts)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1exchangebanksummary(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**BankSummaryDataResponse**](BankSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1exchangeusercoinfee"></a>
# **v1exchangeusercoinfee**
> DoubleDataResponse v1exchangeusercoinfee(opts)

Users Coin Fee Percentage

Returns the users coin fee percentage. The response is in percentage.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var opts = { 
  'authorization': "authorization_example", // String | API object to be added
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1exchangeusercoinfee(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1exchangeuserfiatfee"></a>
# **v1exchangeuserfiatfee**
> DoubleDataResponse v1exchangeuserfiatfee(authorization, opts)

Users Fiat Fee Percentage

Returns the users fiat fee percentage. The response is in percentage.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1exchangeuserfiatfee(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1netkisearchNetkiName"></a>
# **v1netkisearchNetkiName**
> DoubleDataResponse v1netkisearchNetkiName(netkiName, opts)

Coinsecure.me Netki Lookup

Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var netkiName = "netkiName_example"; // String | 

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1netkisearchNetkiName(netkiName, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **netkiName** | **String**|  | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**DoubleDataResponse**](DoubleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangekycs"></a>
# **v1userexchangekycs**
> KYCDataResponse v1userexchangekycs(authorization, opts)

Gets KYC Status Details

Gets Users KYC Status Details.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangekycs(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**KYCDataResponse**](KYCDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangereferralcoinpaid"></a>
# **v1userexchangereferralcoinpaid**
> SuccCoinRefDataResponse v1userexchangereferralcoinpaid(authorization, opts)

Users Paid Fiat Referrals

Returns the Users Paid Coin Referrals.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangereferralcoinpaid(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccCoinRefDataResponse**](SuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangereferralcoinsuccessful"></a>
# **v1userexchangereferralcoinsuccessful**
> SuccRefDataResponse v1userexchangereferralcoinsuccessful(authorization, opts)

Gets Users Successful Referral Links

Gets Users Successful Referral Links that can be used during signup.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangereferralcoinsuccessful(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccRefDataResponse**](SuccRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangereferralfiatpaid"></a>
# **v1userexchangereferralfiatpaid**
> SuccCoinRefDataResponse v1userexchangereferralfiatpaid(authorization, opts)

Users Paid Fiat Referrals

Returns the Users Paid Fiat Referrals.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangereferralfiatpaid(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccCoinRefDataResponse**](SuccCoinRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangereferrals"></a>
# **v1userexchangereferrals**
> AllRefDataResponse v1userexchangereferrals(authorization, opts)

Gets Users Referral Links

Gets Users Referral Links that can be used during signup.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangereferrals(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**AllRefDataResponse**](AllRefDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userexchangetradesummary"></a>
# **v1userexchangetradesummary**
> TradeSummaryDataResponse v1userexchangetradesummary(authorization, opts)

Exchange Trade Summary

Gets a Summary of Exchange Trade Data.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userexchangetradesummary(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**TradeSummaryDataResponse**](TradeSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userlogintokenToken"></a>
# **v1userlogintokenToken**
> SuccessResult v1userlogintokenToken(token, opts)

Login Token Email

Retrieves details of a Login Token

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var token = "token_example"; // String | 

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userlogintokenToken(token, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1usersummary"></a>
# **v1usersummary**
> UserSummaryDataResponse v1usersummary(authorization, opts)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1usersummary(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**UserSummaryDataResponse**](UserSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userwalletsummary"></a>
# **v1userwalletsummary**
> WalletSummaryDataResponse v1userwalletsummary(authorization, opts)

Exchange Bank Summary

Gets a Summary of Exchange Bank Data and Balances.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.AccountDataApi();

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v1userwalletsummary(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletSummaryDataResponse**](WalletSummaryDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

