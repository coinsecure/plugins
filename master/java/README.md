# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AccountActionsApi;

import java.io.File;
import java.util.*;

public class AccountActionsApiExample {

    public static void main(String[] args) {
        
        AccountActionsApi apiInstance = new AccountActionsApi();
        LoginFormNew body = new LoginFormNew(); // LoginFormNew | Please send the form with valid inputs.
        String accept = "accept_example"; // String | JSON, XML or CSV can be returned (Optional)
        try {
            StandardLoginResultData result = apiInstance.v1login(body, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountActionsApi#v1login");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.coinsecure.in*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountActionsApi* | [**v1login**](docs/AccountActionsApi.md#v1login) | **POST** /v1/login | Creates a Login Instance and returns an API Key.
*AccountActionsApi* | [**v1logininitiate**](docs/AccountActionsApi.md#v1logininitiate) | **POST** /v1/login/initiate | Initiate Login
*AccountActionsApi* | [**v1loginpasswordforgot**](docs/AccountActionsApi.md#v1loginpasswordforgot) | **POST** /v1/login/password/forgot | Sends an email with a password reset token
*AccountActionsApi* | [**v1signup**](docs/AccountActionsApi.md#v1signup) | **POST** /v1/signup | Creates a new Unverified Account.
*AccountActionsApi* | [**v1userbankotpNumber**](docs/AccountActionsApi.md#v1userbankotpNumber) | **GET** /v1/user/bank/otp/{number} | Send OTP for Bank Link
*AccountActionsApi* | [**v1userexchangekyc**](docs/AccountActionsApi.md#v1userexchangekyc) | **PUT** /v1/user/exchange/kyc | Submits a New Bank Link and initial KYC Documents.
*AccountActionsApi* | [**v1usergcmCode**](docs/AccountActionsApi.md#v1usergcmCode) | **DELETE** /v1/user/gcm/{code} | Delete GCM Code
*AccountActionsApi* | [**v1userkycotpNumber**](docs/AccountActionsApi.md#v1userkycotpNumber) | **GET** /v1/user/kyc/otp/{number} | Send OTP for KYC Link
*AccountActionsApi* | [**v1userlogout**](docs/AccountActionsApi.md#v1userlogout) | **DELETE** /v1/user/logout | Logout User
*AccountActionsApi* | [**v1usernetkicreate**](docs/AccountActionsApi.md#v1usernetkicreate) | **PUT** /v1/user/netki/create | Create Neki Wallet Name
*AccountActionsApi* | [**v1usernetkiupdate**](docs/AccountActionsApi.md#v1usernetkiupdate) | **POST** /v1/user/netki/update | Update Netki Address
*AccountActionsApi* | [**v1userprofileimagedeleteNetkiName**](docs/AccountActionsApi.md#v1userprofileimagedeleteNetkiName) | **DELETE** /v1/user/profile/image/delete/{netkiName} | Delete Profile Image
*AccountActionsApi* | [**v1userprofileimageupdate**](docs/AccountActionsApi.md#v1userprofileimageupdate) | **POST** /v1/user/profile/image/update | Update Profile Image
*AccountActionsApi* | [**v1userprofilephone**](docs/AccountActionsApi.md#v1userprofilephone) | **PUT** /v1/user/profile/phone/new | New Profile Phone
*AccountActionsApi* | [**v1userprofilephoneNumber**](docs/AccountActionsApi.md#v1userprofilephoneNumber) | **DELETE** /v1/user/profile/phone/delete | Delete Profile Phone Number
*AccountActionsApi* | [**v1userprofilephoneotpNumber**](docs/AccountActionsApi.md#v1userprofilephoneotpNumber) | **GET** /v1/user/profile/phone/otp/{number} | Send OTP for Profile Phone
*AccountDataApi* | [**v1exchangebanksummary**](docs/AccountDataApi.md#v1exchangebanksummary) | **GET** /v1/user/exchange/bank/summary | Exchange Bank Summary
*AccountDataApi* | [**v1exchangeusercoinfee**](docs/AccountDataApi.md#v1exchangeusercoinfee) | **GET** /v1/user/exchange/coin/fee | Users Coin Fee Percentage
*AccountDataApi* | [**v1exchangeuserfiatfee**](docs/AccountDataApi.md#v1exchangeuserfiatfee) | **GET** /v1/user/exchange/fiat/fee | Users Fiat Fee Percentage
*AccountDataApi* | [**v1netkisearchNetkiName**](docs/AccountDataApi.md#v1netkisearchNetkiName) | **GET** /v1/netki/search/{netkiName} | Coinsecure.me Netki Lookup
*AccountDataApi* | [**v1userexchangekycs**](docs/AccountDataApi.md#v1userexchangekycs) | **GET** /v1/user/exchange/kycs | Gets KYC Status Details
*AccountDataApi* | [**v1userexchangereferralcoinpaid**](docs/AccountDataApi.md#v1userexchangereferralcoinpaid) | **GET** /v1/user/exchange/referral/coin/paid | Users Paid Fiat Referrals
*AccountDataApi* | [**v1userexchangereferralcoinsuccessful**](docs/AccountDataApi.md#v1userexchangereferralcoinsuccessful) | **GET** /v1/user/exchange/referral/coin/successful | Gets Users Successful Referral Links
*AccountDataApi* | [**v1userexchangereferralfiatpaid**](docs/AccountDataApi.md#v1userexchangereferralfiatpaid) | **GET** /v1/user/exchange/referral/fiat/paid | Users Paid Fiat Referrals
*AccountDataApi* | [**v1userexchangereferrals**](docs/AccountDataApi.md#v1userexchangereferrals) | **GET** /v1/user/exchange/referrals | Gets Users Referral Links
*AccountDataApi* | [**v1userexchangetradesummary**](docs/AccountDataApi.md#v1userexchangetradesummary) | **GET** /v1/user/exchange/trade/summary | Exchange Trade Summary
*AccountDataApi* | [**v1userlogintokenToken**](docs/AccountDataApi.md#v1userlogintokenToken) | **GET** /v1/user/login/token/{token} | Login Token Email
*AccountDataApi* | [**v1usersummary**](docs/AccountDataApi.md#v1usersummary) | **GET** /v1/user/summary | Exchange Bank Summary
*AccountDataApi* | [**v1userwalletsummary**](docs/AccountDataApi.md#v1userwalletsummary) | **GET** /v1/user/wallet/summary | Exchange Bank Summary
*BlockchainToolsApi* | [**v1bitcoinsearchAddress**](docs/BlockchainToolsApi.md#v1bitcoinsearchAddress) | **GET** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
*BlockchainToolsApi* | [**v1bitcoinsearchTxid**](docs/BlockchainToolsApi.md#v1bitcoinsearchTxid) | **GET** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations
*ExchangeBankActionsApi* | [**v1userexchangebankcoinwithdrawinitiate**](docs/ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawinitiate) | **POST** /v1/user/exchange/bank/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
*ExchangeBankActionsApi* | [**v1userexchangebankcoinwithdrawnewVerifycode**](docs/ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawnewVerifycode) | **POST** /v1/user/exchange/bank/coin/withdraw/newVerifycode | Gets a Verification Code.
*ExchangeBankActionsApi* | [**v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID**](docs/ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID) | **DELETE** /v1/user/exchange/bank/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
*ExchangeBankActionsApi* | [**v1userexchangebankcoinwithdrawverify**](docs/ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawverify) | **PUT** /v1/user/exchange/bank/coin/withdraw/verify | Verify Bitcoin Withdrawal
*ExchangeBankActionsApi* | [**v1userexchangebankfiataccountnew**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiataccountnew) | **PUT** /v1/user/exchange/bank/fiat/account/new | New Bank Link
*ExchangeBankActionsApi* | [**v1userexchangebankfiatdepositcancelDepositID**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatdepositcancelDepositID) | **DELETE** /v1/user/exchange/bank/fiat/deposit/cancel/{depositID} | Cancel Unverified Exchange Fiat Deposit
*ExchangeBankActionsApi* | [**v1userexchangebankfiatdepositnew**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatdepositnew) | **PUT** /v1/user/exchange/bank/fiat/deposit/new | New Exchange Fiat Deposit
*ExchangeBankActionsApi* | [**v1userexchangebankfiatwithdrawinitiate**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawinitiate) | **POST** /v1/user/exchange/bank/fiat/withdraw/initiate | Initiate Fiat Withdrawal
*ExchangeBankActionsApi* | [**v1userexchangebankfiatwithdrawnewVerifycode**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawnewVerifycode) | **POST** /v1/user/exchange/bank/fiat/withdraw/newVerifycode | Gets a Fiat Verification Code.
*ExchangeBankActionsApi* | [**v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID) | **DELETE** /v1/user/exchange/bank/fiat/withdraw/unverified/cancel/{withdrawID} | Cancel Fiat Withdrawal
*ExchangeBankActionsApi* | [**v1userexchangebankfiatwithdrawverify**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawverify) | **PUT** /v1/user/exchange/bank/fiat/withdraw/verify | Verify Fiat Withdrawal
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoinaddresses**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinaddresses) | **GET** /v1/user/exchange/bank/coin/addresses | Exchange Coin Addresses
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoinbalanceavailable**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalanceavailable) | **GET** /v1/user/exchange/bank/coin/balance/total | Available Exchange Coin Balance
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoinbalancepending**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancepending) | **GET** /v1/user/exchange/bank/coin/balance/pending | In Trade Coin Balance
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoinbalancetotal**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancetotal) | **GET** /v1/user/exchange/bank/coin/balance/available | Total Exchange Coin Balance
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoindepositcancelled**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositcancelled) | **GET** /v1/user/exchange/bank/coin/deposit/cancelled | Cancelled Exchange Coin Deposits
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoindepositunverified**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositunverified) | **GET** /v1/user/exchange/bank/coin/deposit/unverified | Unverified Exchange Coin Deposits
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoindepositverified**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositverified) | **GET** /v1/user/exchange/bank/coin/deposit/verified | Verified Exchange Coin Deposits
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoinwithdrawcancelled**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcancelled) | **GET** /v1/user/exchange/bank/coin/withdraw/cancelled | Cancelled Exchange Coin Withdrawals
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoinwithdrawcompleted**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcompleted) | **GET** /v1/user/exchange/bank/coin/withdraw/completed | Completed Exchange Coin Withdrawals
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoinwithdrawunverified**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawunverified) | **GET** /v1/user/exchange/bank/coin/withdraw/unverified | Unverified Exchange Coin Withdrawals
*ExchangeBankCoinDataApi* | [**v1userexchangebankcoinwithdrawverified**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawverified) | **GET** /v1/user/exchange/bank/coin/withdraw/verified | Verified Exchange Coin Withdrawals
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiataccounts**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiataccounts) | **GET** /v1/user/exchange/bank/fiat/accounts | Exchange Bitcoin Deposit Addresses
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiatbalanceavailable**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalanceavailable) | **GET** /v1/user/exchange/bank/fiat/balance/total | Available Exchange Fiat Balance
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiatbalancepending**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancepending) | **GET** /v1/user/exchange/bank/fiat/balance/pending | In Trade Coin Balance
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiatbalancetotal**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancetotal) | **GET** /v1/user/exchange/bank/fiat/balance/available | Total Exchange Fiat Balance
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiatdepositcancelled**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositcancelled) | **GET** /v1/user/exchange/bank/fiat/deposit/cancelled | Cancelled Exchange Fiat Deposits
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiatdepositunverified**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositunverified) | **GET** /v1/user/exchange/bank/fiat/deposit/unverified | Unverified Exchange Fiat Deposits
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiatdepositverified**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositverified) | **GET** /v1/user/exchange/bank/fiat/deposit/verified | Verified Exchange Fiat Deposits
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiatwithdrawcancelled**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcancelled) | **GET** /v1/user/exchange/bank/fiat/withdraw/cancelled | Cancelled Exchange Fiat Withdrawals
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiatwithdrawcompleted**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcompleted) | **GET** /v1/user/exchange/bank/fiat/withdraw/completed | Completed Exchange Fiat Withdrawals
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiatwithdrawunverified**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawunverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/unverified | Unverified Exchange Fiat Withdrawals
*ExchangeBankFiatDataApi* | [**v1userexchangebankfiatwithdrawverified**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/verified | Verified Exchange Fiat Withdrawals
*ExchangeTradeActionsApi* | [**v1userexchangeaskcancelOrderID**](docs/ExchangeTradeActionsApi.md#v1userexchangeaskcancelOrderID) | **DELETE** /v1/user/exchange/ask/cancel/{orderID} | Cancel Open Sell Order
*ExchangeTradeActionsApi* | [**v1userexchangeasknew**](docs/ExchangeTradeActionsApi.md#v1userexchangeasknew) | **PUT** /v1/user/exchange/ask/new | BTC Sell Order
*ExchangeTradeActionsApi* | [**v1userexchangebidcancelOrderID**](docs/ExchangeTradeActionsApi.md#v1userexchangebidcancelOrderID) | **DELETE** /v1/user/exchange/bid/cancel/{orderID} | Cancel Open Buy Order
*ExchangeTradeActionsApi* | [**v1userexchangebidnew**](docs/ExchangeTradeActionsApi.md#v1userexchangebidnew) | **PUT** /v1/user/exchange/bid/new | BTC Buy Order
*ExchangeTradeActionsApi* | [**v1userexchangeinstantbuy**](docs/ExchangeTradeActionsApi.md#v1userexchangeinstantbuy) | **PUT** /v1/user/exchange/instant/buy | Instantly Buy BTC
*ExchangeTradeActionsApi* | [**v1userexchangeinstantsell**](docs/ExchangeTradeActionsApi.md#v1userexchangeinstantsell) | **PUT** /v1/user/exchange/instant/sell | Instantly Sell BTC
*ExchangeTradeDataApi* | [**v1exchangeasklow**](docs/ExchangeTradeDataApi.md#v1exchangeasklow) | **GET** /v1/exchange/ask/low | Lowest Ask
*ExchangeTradeDataApi* | [**v1exchangeaskorders**](docs/ExchangeTradeDataApi.md#v1exchangeaskorders) | **GET** /v1/exchange/ask/orders | All Sell Orders
*ExchangeTradeDataApi* | [**v1exchangebidhigh**](docs/ExchangeTradeDataApi.md#v1exchangebidhigh) | **GET** /v1/exchange/bid/high | Returns the Highest Bid in the Order Book
*ExchangeTradeDataApi* | [**v1exchangebidorders**](docs/ExchangeTradeDataApi.md#v1exchangebidorders) | **GET** /v1/exchange/bid/orders | All Buy Orders
*ExchangeTradeDataApi* | [**v1exchangelastTrade**](docs/ExchangeTradeDataApi.md#v1exchangelastTrade) | **GET** /v1/exchange/lastTrade | Last Trade
*ExchangeTradeDataApi* | [**v1exchangemax24Hr**](docs/ExchangeTradeDataApi.md#v1exchangemax24Hr) | **GET** /v1/exchange/max24Hr | Max 24 Hour Rate
*ExchangeTradeDataApi* | [**v1exchangemin24Hr**](docs/ExchangeTradeDataApi.md#v1exchangemin24Hr) | **GET** /v1/exchange/min24Hr | Min 24 Hour Rate
*ExchangeTradeDataApi* | [**v1exchangeticker**](docs/ExchangeTradeDataApi.md#v1exchangeticker) | **GET** /v1/exchange/ticker | Exchange Ticker
*ExchangeTradeDataApi* | [**v1userexchangeaskcancelled**](docs/ExchangeTradeDataApi.md#v1userexchangeaskcancelled) | **GET** /v1/user/exchange/ask/cancelled | Cancelled User Sell Orders
*ExchangeTradeDataApi* | [**v1userexchangeaskcompleted**](docs/ExchangeTradeDataApi.md#v1userexchangeaskcompleted) | **GET** /v1/user/exchange/ask/completed | Completed User Sell Orders
*ExchangeTradeDataApi* | [**v1userexchangeaskpending**](docs/ExchangeTradeDataApi.md#v1userexchangeaskpending) | **GET** /v1/user/exchange/ask/pending | Pending User Sell Orders
*ExchangeTradeDataApi* | [**v1userexchangebidcancelled**](docs/ExchangeTradeDataApi.md#v1userexchangebidcancelled) | **GET** /v1/user/exchange/bid/cancelled | Cancelled User Buy Orders
*ExchangeTradeDataApi* | [**v1userexchangebidcompleted**](docs/ExchangeTradeDataApi.md#v1userexchangebidcompleted) | **GET** /v1/user/exchange/bid/completed | Completed User Buy Orders
*ExchangeTradeDataApi* | [**v1userexchangebidpending**](docs/ExchangeTradeDataApi.md#v1userexchangebidpending) | **GET** /v1/user/exchange/bid/pending | Pending User Buy Orders
*SecurityActionsApi* | [**v1mfaauthyinitiate**](docs/SecurityActionsApi.md#v1mfaauthyinitiate) | **POST** /v1/mfa/authy/initiate | Initiate Authy Registration.
*SecurityActionsApi* | [**v1mfagainitiate**](docs/SecurityActionsApi.md#v1mfagainitiate) | **POST** /v1/mfa/ga/initiate | Initiate GA Registration.
*SecurityActionsApi* | [**v1usermfaauthycall**](docs/SecurityActionsApi.md#v1usermfaauthycall) | **GET** /v1/mfa/authy/call | Authy Call Code
*SecurityActionsApi* | [**v1usermfaauthydisableCode**](docs/SecurityActionsApi.md#v1usermfaauthydisableCode) | **DELETE** /v1/user/mfa/authy/disable/{code} | Disable Authy
*SecurityActionsApi* | [**v1usermfaauthyinitiateenable**](docs/SecurityActionsApi.md#v1usermfaauthyinitiateenable) | **PUT** /v1/user/mfa/authy/initiate/enable | Verify Authy Registration
*SecurityActionsApi* | [**v1usermfaauthysms**](docs/SecurityActionsApi.md#v1usermfaauthysms) | **GET** /v1/mfa/authy/sms | Authy Sms Code
*SecurityActionsApi* | [**v1usermfagadisableCode**](docs/SecurityActionsApi.md#v1usermfagadisableCode) | **DELETE** /v1/user/mfa/ga/disable/{code} | Disable Google Authenticator
*SecurityActionsApi* | [**v1usermfagainitiateenable**](docs/SecurityActionsApi.md#v1usermfagainitiateenable) | **PUT** /v1/user/mfa/ga/initiate/enable | Enable Google Authenticator
*SecurityActionsApi* | [**v1userpasswordchange**](docs/SecurityActionsApi.md#v1userpasswordchange) | **POST** /v1/user/password/change | Change Password.
*SecurityActionsApi* | [**v1userpasswordreset**](docs/SecurityActionsApi.md#v1userpasswordreset) | **POST** /v1/user/password/reset | Reset Password.
*WalletActionsApi* | [**v1userwalletcoinaddressnew**](docs/WalletActionsApi.md#v1userwalletcoinaddressnew) | **PUT** /v1/user/wallet/coin/address/new | New Bitcoin Address
*WalletActionsApi* | [**v1userwalletcoinnew**](docs/WalletActionsApi.md#v1userwalletcoinnew) | **PUT** /v1/user/wallet/coin/new | Create New Wallet
*WalletActionsApi* | [**v1userwalletcoinwithdrawinitiate**](docs/WalletActionsApi.md#v1userwalletcoinwithdrawinitiate) | **POST** /v1/user/wallet/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
*WalletActionsApi* | [**v1userwalletcoinwithdrawsendToExchange**](docs/WalletActionsApi.md#v1userwalletcoinwithdrawsendToExchange) | **PUT** /v1/user/wallet/coin/withdraw/sendToExchange | Send to Exchange
*WalletActionsApi* | [**v1userwalletcoinwithdrawunverifiedcancelWithdrawID**](docs/WalletActionsApi.md#v1userwalletcoinwithdrawunverifiedcancelWithdrawID) | **DELETE** /v1/user/wallet/coin/withdraw/unverified/cancel/{withdrawID} | Cancel Bitcoin Withdrawal
*WalletActionsApi* | [**v1userwalletcoinwithdrawverify**](docs/WalletActionsApi.md#v1userwalletcoinwithdrawverify) | **PUT** /v1/user/wallet/coin/withdraw/verify | Verify Bitcoin Withdrawal
*WalletActionsApi* | [**v1walletcoinwithdrawnewVerifycode**](docs/WalletActionsApi.md#v1walletcoinwithdrawnewVerifycode) | **POST** /v1/wallet/coin/withdraw/newVerifycode | Gets a Verification Code
*WalletDataApi* | [**v1userwalletcoinaddressWalletID**](docs/WalletDataApi.md#v1userwalletcoinaddressWalletID) | **GET** /v1/user/wallet/coin/address/{walletID} | Wallet Bitcoin Addresses
*WalletDataApi* | [**v1userwalletcoindepositconfirmedWalletID**](docs/WalletDataApi.md#v1userwalletcoindepositconfirmedWalletID) | **GET** /v1/user/wallet/coin/deposit/confirmed/{walletID} | Confirmed Wallet Transactions
*WalletDataApi* | [**v1userwalletcoindepositconfirmedall**](docs/WalletDataApi.md#v1userwalletcoindepositconfirmedall) | **GET** /v1/user/wallet/coin/deposit/confirmed/all | Confirmed Wallet Deposit
*WalletDataApi* | [**v1userwalletcoindepositunconfirmedWalletID**](docs/WalletDataApi.md#v1userwalletcoindepositunconfirmedWalletID) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/{walletID} | Unconfirmed Transactions in Wallet
*WalletDataApi* | [**v1userwalletcoindepositunconfirmedall**](docs/WalletDataApi.md#v1userwalletcoindepositunconfirmedall) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/all | All Unconfirmed Deposits
*WalletDataApi* | [**v1userwalletcoinwallets**](docs/WalletDataApi.md#v1userwalletcoinwallets) | **GET** /v1/user/wallet/coin/wallets | Wallet Details
*WalletDataApi* | [**v1walletwithdrawcancelled**](docs/WalletDataApi.md#v1walletwithdrawcancelled) | **GET** /v1/wallet/coin/withdraw/cancelled | Cancelled Coin Withdrawals
*WalletDataApi* | [**v1walletwithdrawcompleted**](docs/WalletDataApi.md#v1walletwithdrawcompleted) | **GET** /v1/wallet/coin/withdraw/completed | Completed Coin Withdrawals
*WalletDataApi* | [**v1walletwithdrawunverified**](docs/WalletDataApi.md#v1walletwithdrawunverified) | **GET** /v1/wallet/coin/withdraw/unverified | Unverified Coin Withdrawals
*WalletDataApi* | [**v1walletwithdrawverified**](docs/WalletDataApi.md#v1walletwithdrawverified) | **GET** /v1/wallet/coin/withdraw/verified | Verified Coin Withdrawals


## Documentation for Models

 - [Address](docs/Address.md)
 - [AllRefData](docs/AllRefData.md)
 - [AllRefDataResponse](docs/AllRefDataResponse.md)
 - [BankSummaryData](docs/BankSummaryData.md)
 - [BankSummaryDataResponse](docs/BankSummaryDataResponse.md)
 - [ChangePassword](docs/ChangePassword.md)
 - [Code](docs/Code.md)
 - [CodeCountryMobile](docs/CodeCountryMobile.md)
 - [CoinDepData](docs/CoinDepData.md)
 - [CoinDepDataResponse](docs/CoinDepDataResponse.md)
 - [ConfirmData](docs/ConfirmData.md)
 - [ConfirmDataResponse](docs/ConfirmDataResponse.md)
 - [DoubleData](docs/DoubleData.md)
 - [DoubleDataResponse](docs/DoubleDataResponse.md)
 - [Email](docs/Email.md)
 - [FailResult](docs/FailResult.md)
 - [FiatBankData](docs/FiatBankData.md)
 - [FiatBankDataResponse](docs/FiatBankDataResponse.md)
 - [FiatDepData](docs/FiatDepData.md)
 - [FiatDepDataResponse](docs/FiatDepDataResponse.md)
 - [FiatWithData](docs/FiatWithData.md)
 - [FiatWithDataResponse](docs/FiatWithDataResponse.md)
 - [JsValue](docs/JsValue.md)
 - [KYCData](docs/KYCData.md)
 - [KYCDataResponse](docs/KYCDataResponse.md)
 - [LastTradeData](docs/LastTradeData.md)
 - [LastTradeDataResponse](docs/LastTradeDataResponse.md)
 - [LoginFormNew](docs/LoginFormNew.md)
 - [LoginId](docs/LoginId.md)
 - [MaxVol](docs/MaxVol.md)
 - [MethodCountryMobile](docs/MethodCountryMobile.md)
 - [MinFiat](docs/MinFiat.md)
 - [NetkiNameAddress](docs/NetkiNameAddress.md)
 - [NewAddress](docs/NewAddress.md)
 - [NewBankForm](docs/NewBankForm.md)
 - [NewFiatBankDeposit](docs/NewFiatBankDeposit.md)
 - [NewWallet](docs/NewWallet.md)
 - [NumberOtp](docs/NumberOtp.md)
 - [OrderData](docs/OrderData.md)
 - [OrderDataResponse](docs/OrderDataResponse.md)
 - [RateData](docs/RateData.md)
 - [RateDataResponse](docs/RateDataResponse.md)
 - [RateDiffData](docs/RateDiffData.md)
 - [RateDiffDataResponse](docs/RateDiffDataResponse.md)
 - [RateVolData](docs/RateVolData.md)
 - [RateVolDataResponse](docs/RateVolDataResponse.md)
 - [ResetPassword](docs/ResetPassword.md)
 - [SendCoin](docs/SendCoin.md)
 - [SendCoinWallet](docs/SendCoinWallet.md)
 - [SendExchange](docs/SendExchange.md)
 - [SignupForm](docs/SignupForm.md)
 - [StandardInitiateLoginResultData](docs/StandardInitiateLoginResultData.md)
 - [StandardLoginResultData](docs/StandardLoginResultData.md)
 - [StandardTickerResultData](docs/StandardTickerResultData.md)
 - [SuccCoinRefData](docs/SuccCoinRefData.md)
 - [SuccCoinRefDataResponse](docs/SuccCoinRefDataResponse.md)
 - [SuccRefData](docs/SuccRefData.md)
 - [SuccRefDataResponse](docs/SuccRefDataResponse.md)
 - [SuccessCancelData](docs/SuccessCancelData.md)
 - [SuccessCancelDataResponse](docs/SuccessCancelDataResponse.md)
 - [SuccessInitiateLoginResponse](docs/SuccessInitiateLoginResponse.md)
 - [SuccessLoginResponse](docs/SuccessLoginResponse.md)
 - [SuccessOrderData](docs/SuccessOrderData.md)
 - [SuccessOrderDataResponse](docs/SuccessOrderDataResponse.md)
 - [SuccessResult](docs/SuccessResult.md)
 - [SuccessTickerResponse](docs/SuccessTickerResponse.md)
 - [TimeData](docs/TimeData.md)
 - [TimeDataCoin](docs/TimeDataCoin.md)
 - [TimeKYCData](docs/TimeKYCData.md)
 - [TradeAddressData](docs/TradeAddressData.md)
 - [TradeAddressDataResponse](docs/TradeAddressDataResponse.md)
 - [TradeCoinWithdrawData](docs/TradeCoinWithdrawData.md)
 - [TradeCoinWithdrawDataResponse](docs/TradeCoinWithdrawDataResponse.md)
 - [TradeSummaryData](docs/TradeSummaryData.md)
 - [TradeSummaryDataResponse](docs/TradeSummaryDataResponse.md)
 - [UserSummaryData](docs/UserSummaryData.md)
 - [UserSummaryDataResponse](docs/UserSummaryDataResponse.md)
 - [ValidAddressSearchData](docs/ValidAddressSearchData.md)
 - [ValidAddressSearchDataResponse](docs/ValidAddressSearchDataResponse.md)
 - [VolData](docs/VolData.md)
 - [VolDataResponse](docs/VolDataResponse.md)
 - [WalletAddressData](docs/WalletAddressData.md)
 - [WalletAddressDataResponse](docs/WalletAddressDataResponse.md)
 - [WalletCoinWithdrawData](docs/WalletCoinWithdrawData.md)
 - [WalletCoinWithdrawDataResponse](docs/WalletCoinWithdrawDataResponse.md)
 - [WalletSummaryData](docs/WalletSummaryData.md)
 - [WalletSummaryDataResponse](docs/WalletSummaryDataResponse.md)
 - [WalletsData](docs/WalletsData.md)
 - [WalletsDataResponse](docs/WalletsDataResponse.md)
 - [WithdrawFiat](docs/WithdrawFiat.md)
 - [WithdrawID](docs/WithdrawID.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



