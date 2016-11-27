# WalletDataApi

All URIs are relative to *https://api.coinsecure.in/*

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
> WalletAddressDataResponse v1userwalletcoinaddressWalletID(walletID, authorization, accept)

Wallet Bitcoin Addresses

Gets a List of Users Bitcoin Deposit Addresses.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletDataApi;

WalletDataApi apiInstance = new WalletDataApi();
String walletID = "walletID_example"; // String | 
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    WalletAddressDataResponse result = apiInstance.v1userwalletcoinaddressWalletID(walletID, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletDataApi#v1userwalletcoinaddressWalletID");
    e.printStackTrace();
}
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
> WalletAddressDataResponse v1userwalletcoindepositconfirmedWalletID(walletID, authorization, accept)

Confirmed Wallet Transactions

Gets your Confirmed Wallet Bitcoin Transactions.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletDataApi;

WalletDataApi apiInstance = new WalletDataApi();
String walletID = "walletID_example"; // String | 
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    WalletAddressDataResponse result = apiInstance.v1userwalletcoindepositconfirmedWalletID(walletID, authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletDataApi#v1userwalletcoindepositconfirmedWalletID");
    e.printStackTrace();
}
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
> WalletAddressDataResponse v1userwalletcoindepositconfirmedall(authorization, accept)

Confirmed Wallet Deposit

Gets the total confirmed transactions across all accounts and addresses

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletDataApi;

WalletDataApi apiInstance = new WalletDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    WalletAddressDataResponse result = apiInstance.v1userwalletcoindepositconfirmedall(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletDataApi#v1userwalletcoindepositconfirmedall");
    e.printStackTrace();
}
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
> v1userwalletcoindepositunconfirmedWalletID(walletID, authorization, accept)

Unconfirmed Transactions in Wallet

Gets the unconfirmed transactions on an account/ wallet.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletDataApi;

WalletDataApi apiInstance = new WalletDataApi();
String walletID = "walletID_example"; // String | 
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    apiInstance.v1userwalletcoindepositunconfirmedWalletID(walletID, authorization, accept);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletDataApi#v1userwalletcoindepositunconfirmedWalletID");
    e.printStackTrace();
}
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
> v1userwalletcoindepositunconfirmedall(authorization, accept)

All Unconfirmed Deposits

Gets the total unconfirmed transactions across all accounts and addresses

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletDataApi;

WalletDataApi apiInstance = new WalletDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    apiInstance.v1userwalletcoindepositunconfirmedall(authorization, accept);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletDataApi#v1userwalletcoindepositunconfirmedall");
    e.printStackTrace();
}
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
> WalletsDataResponse v1userwalletcoinwallets(authorization, accept)

Wallet Details

Gets a List of Users Wallets.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletDataApi;

WalletDataApi apiInstance = new WalletDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    WalletsDataResponse result = apiInstance.v1userwalletcoinwallets(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletDataApi#v1userwalletcoinwallets");
    e.printStackTrace();
}
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
> WalletCoinWithdrawDataResponse v1walletwithdrawcancelled(authorization, accept)

Cancelled Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletDataApi;

WalletDataApi apiInstance = new WalletDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    WalletCoinWithdrawDataResponse result = apiInstance.v1walletwithdrawcancelled(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletDataApi#v1walletwithdrawcancelled");
    e.printStackTrace();
}
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
> WalletCoinWithdrawDataResponse v1walletwithdrawcompleted(authorization, accept)

Completed Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletDataApi;

WalletDataApi apiInstance = new WalletDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    WalletCoinWithdrawDataResponse result = apiInstance.v1walletwithdrawcompleted(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletDataApi#v1walletwithdrawcompleted");
    e.printStackTrace();
}
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
> WalletCoinWithdrawDataResponse v1walletwithdrawunverified(authorization, accept)

Unverified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletDataApi;

WalletDataApi apiInstance = new WalletDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    WalletCoinWithdrawDataResponse result = apiInstance.v1walletwithdrawunverified(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletDataApi#v1walletwithdrawunverified");
    e.printStackTrace();
}
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
> WalletCoinWithdrawDataResponse v1walletwithdrawverified(authorization, accept)

Verified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example
```java
// Import classes:
//import io.swagger.client.api.WalletDataApi;

WalletDataApi apiInstance = new WalletDataApi();
String authorization = "authorization_example"; // String | API object to be added
String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
try {
    WalletCoinWithdrawDataResponse result = apiInstance.v1walletwithdrawverified(authorization, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletDataApi#v1walletwithdrawverified");
    e.printStackTrace();
}
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

