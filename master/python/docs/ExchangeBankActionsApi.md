# swagger_client.ExchangeBankActionsApi

All URIs are relative to *https://api.coinsecure.in/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1userexchangebankcoinwithdrawinitiate**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawinitiate) | **POST** /v1/user/exchange/bank/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
[**v1userexchangebankcoinwithdrawnew_verifycode**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawnew_verifycode) | **POST** /v1/user/exchange/bank/coin/withdraw/newVerifycode | Gets a Verification Code.
[**v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id) | **DELETE** /v1/user/exchange/bank/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
[**v1userexchangebankcoinwithdrawverify**](ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawverify) | **PUT** /v1/user/exchange/bank/coin/withdraw/verify | Verify Bitcoin Withdrawal
[**v1userexchangebankfiataccountnew**](ExchangeBankActionsApi.md#v1userexchangebankfiataccountnew) | **PUT** /v1/user/exchange/bank/fiat/account/new | New Bank Link
[**v1userexchangebankfiatdepositcancel_deposit_id**](ExchangeBankActionsApi.md#v1userexchangebankfiatdepositcancel_deposit_id) | **DELETE** /v1/user/exchange/bank/fiat/deposit/cancel/{depositID} | Cancel Unverified Exchange Fiat Deposit
[**v1userexchangebankfiatdepositnew**](ExchangeBankActionsApi.md#v1userexchangebankfiatdepositnew) | **PUT** /v1/user/exchange/bank/fiat/deposit/new | New Exchange Fiat Deposit
[**v1userexchangebankfiatwithdrawinitiate**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawinitiate) | **POST** /v1/user/exchange/bank/fiat/withdraw/initiate | Initiate Fiat Withdrawal
[**v1userexchangebankfiatwithdrawnew_verifycode**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawnew_verifycode) | **POST** /v1/user/exchange/bank/fiat/withdraw/newVerifycode | Gets a Fiat Verification Code.
[**v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id) | **DELETE** /v1/user/exchange/bank/fiat/withdraw/unverified/cancel/{withdrawID} | Cancel Fiat Withdrawal
[**v1userexchangebankfiatwithdrawverify**](ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawverify) | **PUT** /v1/user/exchange/bank/fiat/withdraw/verify | Verify Fiat Withdrawal


# **v1userexchangebankcoinwithdrawinitiate**
> SuccessResult v1userexchangebankcoinwithdrawinitiate(body, authorization=authorization, accept=accept)

Initiate Bitcoin Withdrawal

The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
body = swagger_client.SendCoin() # SendCoin | Please send the form with valid inputs.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Initiate Bitcoin Withdrawal
    api_response = api_instance.v1userexchangebankcoinwithdrawinitiate(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawinitiate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendCoin**](SendCoin.md)| Please send the form with valid inputs. | 
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

# **v1userexchangebankcoinwithdrawnew_verifycode**
> SuccessResult v1userexchangebankcoinwithdrawnew_verifycode(body, authorization=authorization, accept=accept)

Gets a Verification Code.

Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
body = swagger_client.WithdrawID() # WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/coin/withdraw/unverified
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Gets a Verification Code.
    api_response = api_instance.v1userexchangebankcoinwithdrawnew_verifycode(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawnew_verifycode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawID**](WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified | 
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

# **v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id**
> SuccessResult v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id(withdraw_id, authorization=authorization, accept=accept)

Cancel Bitcoin Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
withdraw_id = 'withdraw_id_example' # str | 
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancel Bitcoin Withdrawal
    api_response = api_instance.v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id(withdraw_id, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawunverifiedcancel_withdraw_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdraw_id** | **str**|  | 
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

# **v1userexchangebankcoinwithdrawverify**
> SuccessResult v1userexchangebankcoinwithdrawverify(body, authorization=authorization, accept=accept)

Verify Bitcoin Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
body = swagger_client.Code() # Code | You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Verify Bitcoin Withdrawal
    api_response = api_instance.v1userexchangebankcoinwithdrawverify(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankcoinwithdrawverify: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode. | 
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

# **v1userexchangebankfiataccountnew**
> SuccessResult v1userexchangebankfiataccountnew(body, authorization=authorization, accept=accept)

New Bank Link

Submits a New Bank Link on KYC Verified Accounts.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
body = swagger_client.NewBankForm() # NewBankForm | Please send the form with valid inputs.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # New Bank Link
    api_response = api_instance.v1userexchangebankfiataccountnew(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankfiataccountnew: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewBankForm**](NewBankForm.md)| Please send the form with valid inputs. | 
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

# **v1userexchangebankfiatdepositcancel_deposit_id**
> SuccessResult v1userexchangebankfiatdepositcancel_deposit_id(deposit_id, authorization=authorization, accept=accept)

Cancel Unverified Exchange Fiat Deposit

Cancels an unverified Exchange Fiat Deposit.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
deposit_id = 'deposit_id_example' # str | 
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancel Unverified Exchange Fiat Deposit
    api_response = api_instance.v1userexchangebankfiatdepositcancel_deposit_id(deposit_id, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatdepositcancel_deposit_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit_id** | **str**|  | 
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

# **v1userexchangebankfiatdepositnew**
> SuccessResult v1userexchangebankfiatdepositnew(body, authorization=authorization, accept=accept)

New Exchange Fiat Deposit

Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
body = swagger_client.NewFiatBankDeposit() # NewFiatBankDeposit | Please send the form with valid inputs.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # New Exchange Fiat Deposit
    api_response = api_instance.v1userexchangebankfiatdepositnew(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatdepositnew: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewFiatBankDeposit**](NewFiatBankDeposit.md)| Please send the form with valid inputs. | 
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

# **v1userexchangebankfiatwithdrawinitiate**
> SuccessResult v1userexchangebankfiatwithdrawinitiate(body, authorization=authorization, accept=accept)

Initiate Fiat Withdrawal

The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
body = swagger_client.WithdrawFiat() # WithdrawFiat | Please send the form with valid inputs.
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Initiate Fiat Withdrawal
    api_response = api_instance.v1userexchangebankfiatwithdrawinitiate(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawinitiate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawFiat**](WithdrawFiat.md)| Please send the form with valid inputs. | 
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

# **v1userexchangebankfiatwithdrawnew_verifycode**
> SuccessResult v1userexchangebankfiatwithdrawnew_verifycode(body, authorization=authorization, accept=accept)

Gets a Fiat Verification Code.

Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
body = swagger_client.WithdrawID() # WithdrawID | You can get unverified withdraw ID's from /v1/user/exchange/bank/fiat/withdraw/unverified
authorization = 'authorization_example' # str | API object to be added (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Gets a Fiat Verification Code.
    api_response = api_instance.v1userexchangebankfiatwithdrawnew_verifycode(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawnew_verifycode: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WithdrawID**](WithdrawID.md)| You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified | 
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

# **v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id**
> SuccessResult v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id(withdraw_id, authorization=authorization, accept=accept)

Cancel Fiat Withdrawal

Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
withdraw_id = 'withdraw_id_example' # str | 
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Cancel Fiat Withdrawal
    api_response = api_instance.v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id(withdraw_id, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawunverifiedcancel_withdraw_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdraw_id** | **str**|  | 
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

# **v1userexchangebankfiatwithdrawverify**
> SuccessResult v1userexchangebankfiatwithdrawverify(body, authorization=authorization, accept=accept)

Verify Fiat Withdrawal

Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ExchangeBankActionsApi()
body = swagger_client.Code() # Code | You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode
authorization = 'authorization_example' # str | Enter a valid Api Key. (optional)
accept = 'accept_example' # str | JSON, XML or CSV can be returned (Optional) (optional)

try: 
    # Verify Fiat Withdrawal
    api_response = api_instance.v1userexchangebankfiatwithdrawverify(body, authorization=authorization, accept=accept)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ExchangeBankActionsApi->v1userexchangebankfiatwithdrawverify: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Code**](Code.md)| You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode | 
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

