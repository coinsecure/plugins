# CoinsecureApiDocumentation.WalletDataApi

All URIs are relative to *https://api.coinsecure.in*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userwalletcoinaddressWalletID**](WalletDataApi.md#v1userwalletcoinaddressWalletID) | **GET** /v1/user/wallet/coin/address/{walletID} | Wallet Bitcoin Addresses
[**v1userwalletcoindepositconfirmedWalletID**](WalletDataApi.md#v1userwalletcoindepositconfirmedWalletID) | **GET** /v1/user/wallet/coin/deposit/confirmed/{walletID} | Confirmed Wallet Transactions
[**v1userwalletcoindepositconfirmedall**](WalletDataApi.md#v1userwalletcoindepositconfirmedall) | **GET** /v1/user/wallet/coin/deposit/confirmed/all | Confirmed Wallet Deposit
[**v1userwalletcoindepositunconfirmedWalletID**](WalletDataApi.md#v1userwalletcoindepositunconfirmedWalletID) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/{walletID} | Unconfirmed Transactions in Wallet
[**v1userwalletcoindepositunconfirmedall**](WalletDataApi.md#v1userwalletcoindepositunconfirmedall) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/all | All Unconfirmed Deposits
[**v1userwalletcoinwallets**](WalletDataApi.md#v1userwalletcoinwallets) | **GET** /v1/user/wallet/coin/wallets | Wallet Details
[**v1walletwithdrawcancelled**](WalletDataApi.md#v1walletwithdrawcancelled) | **GET** /v1/wallet/coin/withdraw/cancelled | Cancelled Coin Withdrawals
[**v1walletwithdrawcompleted**](WalletDataApi.md#v1walletwithdrawcompleted) | **GET** /v1/wallet/coin/withdraw/completed | Completed Coin Withdrawals
[**v1walletwithdrawunverified**](WalletDataApi.md#v1walletwithdrawunverified) | **GET** /v1/wallet/coin/withdraw/unverified | Unverified Coin Withdrawals
[**v1walletwithdrawverified**](WalletDataApi.md#v1walletwithdrawverified) | **GET** /v1/wallet/coin/withdraw/verified | Verified Coin Withdrawals


<a name="v1userwalletcoinaddressWalletID"></a>
# **v1userwalletcoinaddressWalletID**
> WalletAddressDataResponse v1userwalletcoinaddressWalletID(walletID, opts)

Wallet Bitcoin Addresses

Gets a List of Users Bitcoin Deposit Addresses.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletDataApi();

var walletID = "walletID_example"; // String | 

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
apiInstance.v1userwalletcoinaddressWalletID(walletID, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletID** | **String**|  | 
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userwalletcoindepositconfirmedWalletID"></a>
# **v1userwalletcoindepositconfirmedWalletID**
> WalletAddressDataResponse v1userwalletcoindepositconfirmedWalletID(walletID, opts)

Confirmed Wallet Transactions

Gets your Confirmed Wallet Bitcoin Transactions.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletDataApi();

var walletID = "walletID_example"; // String | 

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
apiInstance.v1userwalletcoindepositconfirmedWalletID(walletID, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletID** | **String**|  | 
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userwalletcoindepositconfirmedall"></a>
# **v1userwalletcoindepositconfirmedall**
> WalletAddressDataResponse v1userwalletcoindepositconfirmedall(opts)

Confirmed Wallet Deposit

Gets the total confirmed transactions across all accounts and addresses

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletDataApi();

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
apiInstance.v1userwalletcoindepositconfirmedall(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userwalletcoindepositunconfirmedWalletID"></a>
# **v1userwalletcoindepositunconfirmedWalletID**
> v1userwalletcoindepositunconfirmedWalletID(walletID, authorization, opts)

Unconfirmed Transactions in Wallet

Gets the unconfirmed transactions on an account/ wallet.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletDataApi();

var walletID = "walletID_example"; // String | 

var authorization = "authorization_example"; // String | API object to be added

var opts = { 
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.v1userwalletcoindepositunconfirmedWalletID(walletID, authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletID** | **String**|  | 
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userwalletcoindepositunconfirmedall"></a>
# **v1userwalletcoindepositunconfirmedall**
> v1userwalletcoindepositunconfirmedall(opts)

All Unconfirmed Deposits

Gets the total unconfirmed transactions across all accounts and addresses

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletDataApi();

var opts = { 
  'authorization': "authorization_example", // String | API object to be added
  'accept': "accept_example" // String | JSON, XML or CSV can be returned (Optional)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.v1userwalletcoindepositunconfirmedall(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1userwalletcoinwallets"></a>
# **v1userwalletcoinwallets**
> WalletsDataResponse v1userwalletcoinwallets(opts)

Wallet Details

Gets a List of Users Wallets.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletDataApi();

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
apiInstance.v1userwalletcoinwallets(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | [optional] 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletsDataResponse**](WalletsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1walletwithdrawcancelled"></a>
# **v1walletwithdrawcancelled**
> WalletCoinWithdrawDataResponse v1walletwithdrawcancelled(authorization, opts)

Cancelled Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletDataApi();

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
apiInstance.v1walletwithdrawcancelled(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1walletwithdrawcompleted"></a>
# **v1walletwithdrawcompleted**
> WalletCoinWithdrawDataResponse v1walletwithdrawcompleted(authorization, opts)

Completed Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletDataApi();

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
apiInstance.v1walletwithdrawcompleted(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1walletwithdrawunverified"></a>
# **v1walletwithdrawunverified**
> WalletCoinWithdrawDataResponse v1walletwithdrawunverified(authorization, opts)

Unverified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletDataApi();

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
apiInstance.v1walletwithdrawunverified(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

<a name="v1walletwithdrawverified"></a>
# **v1walletwithdrawverified**
> WalletCoinWithdrawDataResponse v1walletwithdrawverified(authorization, opts)

Verified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```javascript
var CoinsecureApiDocumentation = require('coinsecure_api_documentation');

var apiInstance = new CoinsecureApiDocumentation.WalletDataApi();

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
apiInstance.v1walletwithdrawverified(authorization, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| API object to be added | 
 **accept** | **String**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

