# swagger_client.WalletActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userwalletcoinaddressnew**](WalletActionsApi.md#v1userwalletcoinaddressnew) | **PUT** /v1/user/wallet/coin/address/new | New Bitcoin Address
[**v1userwalletcoinnew**](WalletActionsApi.md#v1userwalletcoinnew) | **PUT** /v1/user/wallet/coin/new | Create New Wallet
[**v1userwalletcoinwithdrawinitiate**](WalletActionsApi.md#v1userwalletcoinwithdrawinitiate) | **POST** /v1/user/wallet/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**v1userwalletcoinwithdrawsend_to_exchange**](WalletActionsApi.md#v1userwalletcoinwithdrawsend_to_exchange) | **PUT** /v1/user/wallet/coin/withdraw/sendToExchange | Send to Exchange
[**v1userwalletcoinwithdrawunverifiedcancel_withdraw_id**](WalletActionsApi.md#v1userwalletcoinwithdrawunverifiedcancel_withdraw_id) | **DELETE** /v1/user/wallet/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
[**v1userwalletcoinwithdrawverify**](WalletActionsApi.md#v1userwalletcoinwithdrawverify) | **PUT** /v1/user/wallet/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**v1walletcoinwithdrawnew_verifycode**](WalletActionsApi.md#v1walletcoinwithdrawnew_verifycode) | **POST** /v1/wallet/coin/withdraw/newVerifycode | Gets a Verification Code


# **v1userwalletcoinaddressnew**
> WalletAddressDataResponse v1userwalletcoinaddressnew(body, authorization=authorization, accept=accept)

New Bitcoin Address

Generates a New Bitcoin Address to store coins.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletActionsApi()
body = swagger_client.NewAddress() # NewAddress | 
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # New Bitcoin Address
    api_response = api_instance.v1userwalletcoinaddressnew(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletActionsApi->v1userwalletcoinaddressnew: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewAddress**](NewAddress.md)|  | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoinnew**
> WalletAddressDataResponse v1userwalletcoinnew(body, authorization=authorization, accept=accept)

Create New Wallet

Creates a New wallet to store addresses. This method also creates a single default address in each new wallet.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletActionsApi()
body = swagger_client.NewWallet() # NewWallet | 
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Create New Wallet
    api_response = api_instance.v1userwalletcoinnew(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletActionsApi->v1userwalletcoinnew: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewWallet**](NewWallet.md)|  | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**WalletAddressDataResponse**](WalletAddressDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoinwithdrawinitiate**
> SuccessResult v1userwalletcoinwithdrawinitiate(body, authorization=authorization, accept=accept)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletActionsApi()
body = swagger_client.SendCoinWallet() # SendCoinWallet | 
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Initiate Bitcoin Withdrawal
    api_response = api_instance.v1userwalletcoinwithdrawinitiate(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletActionsApi->v1userwalletcoinwithdrawinitiate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendCoinWallet**](SendCoinWallet.md)|  | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoinwithdrawsend_to_exchange**
> SuccessResult v1userwalletcoinwithdrawsend_to_exchange(body, authorization=authorization, accept=accept)

Send to Exchange

This function transfers funds to yout Exchange Balance without the need for any confirmations.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletActionsApi()
body = swagger_client.SendExchange() # SendExchange | 
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Send to Exchange
    api_response = api_instance.v1userwalletcoinwithdrawsend_to_exchange(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletActionsApi->v1userwalletcoinwithdrawsend_to_exchange: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendExchange**](SendExchange.md)|  | 
 **authorization** | **str**| Enter a valid Api Key. | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoinwithdrawunverifiedcancel_withdraw_id**
> SuccessResult v1userwalletcoinwithdrawunverifiedcancel_withdraw_id(withdraw_id, authorization, accept=accept)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletActionsApi()
withdraw_id = 'withdraw_id_example' # str | 
authorization = 'authorization_example' # str | Enter a valid Api Key.
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancel Bitcoin Withdrawal
    api_response = api_instance.v1userwalletcoinwithdrawunverifiedcancel_withdraw_id(withdraw_id, authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletActionsApi->v1userwalletcoinwithdrawunverifiedcancel_withdraw_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdraw_id** | **str**|  | 
 **authorization** | **str**| Enter a valid Api Key. | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1userwalletcoinwithdrawverify**
> SuccessResult v1userwalletcoinwithdrawverify(authorization, body, accept=accept)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletActionsApi()
authorization = 'authorization_example' # str | Enter a valid Api Key.
body = swagger_client.Code() # Code | 
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Verify Bitcoin Withdrawal
    api_response = api_instance.v1userwalletcoinwithdrawverify(authorization, body, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletActionsApi->v1userwalletcoinwithdrawverify: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Enter a valid Api Key. | 
 **body** | [**Code**](Code.md)|  | 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1walletcoinwithdrawnew_verifycode**
> SuccessResult v1walletcoinwithdrawnew_verifycode(body, authorization=authorization, accept=accept)

Gets a Verification Code

Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletActionsApi()
body = swagger_client.WithdrawID() # WithdrawID | You can get unverified withdraw ID's from /v1/exchange/bank/coin/withdrawVerifycode
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Gets a Verification Code
    api_response = api_instance.v1walletcoinwithdrawnew_verifycode(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletActionsApi->v1walletcoinwithdrawnew_verifycode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawID**](WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/exchange/bank/coin/withdrawVerifycode | 
 **authorization** | **str**| API object to be added | [optional] 
 **accept** | **str**| JSON, XML or CSV can be returned (Optional) | [optional] 

### Return type

[**SuccessResult**](SuccessResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

