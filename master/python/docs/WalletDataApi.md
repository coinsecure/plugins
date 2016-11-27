# swagger_client.WalletDataApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userwalletcoinaddress_wallet_id**](WalletDataApi.md#v1userwalletcoinaddress_wallet_id) | **GET** /v1/user/wallet/coin/address/{walletID} | Wallet Bitcoin Addresses
[**v1userwalletcoindepositconfirmed_wallet_id**](WalletDataApi.md#v1userwalletcoindepositconfirmed_wallet_id) | **GET** /v1/user/wallet/coin/deposit/confirmed/{walletID} | Confirmed Wallet Transactions
[**v1userwalletcoindepositconfirmedall**](WalletDataApi.md#v1userwalletcoindepositconfirmedall) | **GET** /v1/user/wallet/coin/deposit/confirmed/all | Confirmed Wallet Deposit
[**v1userwalletcoindepositunconfirmed_wallet_id**](WalletDataApi.md#v1userwalletcoindepositunconfirmed_wallet_id) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/{walletID} | Unconfirmed Transactions in Wallet
[**v1userwalletcoindepositunconfirmedall**](WalletDataApi.md#v1userwalletcoindepositunconfirmedall) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/all | All Unconfirmed Deposits
[**v1userwalletcoinwallets**](WalletDataApi.md#v1userwalletcoinwallets) | **GET** /v1/user/wallet/coin/wallets | Wallet Details
[**v1walletwithdrawcancelled**](WalletDataApi.md#v1walletwithdrawcancelled) | **GET** /v1/wallet/coin/withdraw/cancelled | Cancelled Coin Withdrawals
[**v1walletwithdrawcompleted**](WalletDataApi.md#v1walletwithdrawcompleted) | **GET** /v1/wallet/coin/withdraw/completed | Completed Coin Withdrawals
[**v1walletwithdrawunverified**](WalletDataApi.md#v1walletwithdrawunverified) | **GET** /v1/wallet/coin/withdraw/unverified | Unverified Coin Withdrawals
[**v1walletwithdrawverified**](WalletDataApi.md#v1walletwithdrawverified) | **GET** /v1/wallet/coin/withdraw/verified | Verified Coin Withdrawals


# **v1userwalletcoinaddress_wallet_id**
> WalletAddressDataResponse v1userwalletcoinaddress_wallet_id(wallet_id, authorization=authorization, accept=accept)

Wallet Bitcoin Addresses

Gets a List of Users Bitcoin Deposit Addresses.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletDataApi()
wallet_id = 'wallet_id_example' # str | 
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Wallet Bitcoin Addresses
    api_response = api_instance.v1userwalletcoinaddress_wallet_id(wallet_id, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletDataApi->v1userwalletcoinaddress_wallet_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | **str**|  | 
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoindepositconfirmed_wallet_id**
> WalletAddressDataResponse v1userwalletcoindepositconfirmed_wallet_id(wallet_id, authorization=authorization, accept=accept)

Confirmed Wallet Transactions

Gets your Confirmed Wallet Bitcoin Transactions.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletDataApi()
wallet_id = 'wallet_id_example' # str | 
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Confirmed Wallet Transactions
    api_response = api_instance.v1userwalletcoindepositconfirmed_wallet_id(wallet_id, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletDataApi->v1userwalletcoindepositconfirmed_wallet_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | **str**|  | 
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoindepositconfirmedall**
> WalletAddressDataResponse v1userwalletcoindepositconfirmedall(authorization=authorization, accept=accept)

Confirmed Wallet Deposit

Gets the total confirmed transactions across all accounts and addresses

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletDataApi()
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Confirmed Wallet Deposit
    api_response = api_instance.v1userwalletcoindepositconfirmedall(authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletDataApi->v1userwalletcoindepositconfirmedall: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoindepositunconfirmed_wallet_id**
> v1userwalletcoindepositunconfirmed_wallet_id(wallet_id, authorization, accept=accept)

Unconfirmed Transactions in Wallet

Gets the unconfirmed transactions on an account/ wallet.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletDataApi()
wallet_id = 'wallet_id_example' # str | 
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Unconfirmed Transactions in Wallet
    api_instance.v1userwalletcoindepositunconfirmed_wallet_id(wallet_id, authorization, accept=accept)
except ApiException as e:
    print("Exception when calling WalletDataApi->v1userwalletcoindepositunconfirmed_wallet_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | **str**|  | 
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoindepositunconfirmedall**
> v1userwalletcoindepositunconfirmedall(authorization=authorization, accept=accept)

All Unconfirmed Deposits

Gets the total unconfirmed transactions across all accounts and addresses

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletDataApi()
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # All Unconfirmed Deposits
    api_instance.v1userwalletcoindepositunconfirmedall(authorization=authorization, accept=accept)
except ApiException as e:
    print("Exception when calling WalletDataApi->v1userwalletcoindepositunconfirmedall: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoinwallets**
> WalletsDataResponse v1userwalletcoinwallets(authorization=authorization, accept=accept)

Wallet Details

Gets a List of Users Wallets.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletDataApi()
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Wallet Details
    api_response = api_instance.v1userwalletcoinwallets(authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletDataApi->v1userwalletcoinwallets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletsDataResponse**](WalletsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1walletwithdrawcancelled**
> WalletCoinWithdrawDataResponse v1walletwithdrawcancelled(authorization, accept=accept)

Cancelled Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancelled Coin Withdrawals
    api_response = api_instance.v1walletwithdrawcancelled(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletDataApi->v1walletwithdrawcancelled: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1walletwithdrawcompleted**
> WalletCoinWithdrawDataResponse v1walletwithdrawcompleted(authorization, accept=accept)

Completed Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Completed Coin Withdrawals
    api_response = api_instance.v1walletwithdrawcompleted(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletDataApi->v1walletwithdrawcompleted: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1walletwithdrawunverified**
> WalletCoinWithdrawDataResponse v1walletwithdrawunverified(authorization, accept=accept)

Unverified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Unverified Coin Withdrawals
    api_response = api_instance.v1walletwithdrawunverified(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletDataApi->v1walletwithdrawunverified: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1walletwithdrawverified**
> WalletCoinWithdrawDataResponse v1walletwithdrawverified(authorization, accept=accept)

Verified Coin Withdrawals

Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletDataApi()
authorization = 'authorization_example' # str | API object to be added
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Verified Coin Withdrawals
    api_response = api_instance.v1walletwithdrawverified(authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletDataApi->v1walletwithdrawverified: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| API object to be added | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletCoinWithdrawDataResponse**](WalletCoinWithdrawDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

