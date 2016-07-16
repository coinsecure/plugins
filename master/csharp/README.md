# IO.Swagger - the C# library for the Coinsecure Api Documentation

To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.

This C# SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0b
- SDK version: 1.0.0
- Build date: 2016-07-16T19:10:39.713Z
- Build package: class io.swagger.codegen.languages.CSharpClientCodegen

## Frameworks supported
- .NET 4.0 or later
- Windows Phone 7.1 (Mango)

## Dependencies
- [RestSharp] (https://www.nuget.org/packages/RestSharp) - 105.1.0 or later
- [Json.NET] (https://www.nuget.org/packages/Newtonsoft.Json/) - 7.0.0 or later

The DLLs included in the package may not be the latest version. We recommned using [NuGet] (https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742)

## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using IO.Swagger.Api;
using IO.Swagger.Client;
using Model;
```

## Getting Started

```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using Model;

namespace Example
{
    public class Example
    {
        public void main()
        {
            
            var apiInstance = new AccountActionsApi();
            var body = new LoginFormNew(); // LoginFormNew | Please send the form with valid inputs.
            var accept = accept_example;  // string | JSON, XML or CSV can be returned (Optional) (optional) 

            try
            {
                // Creates a Login Instance and returns an API Key.
                StandardLoginResultData result = apiInstance.V1login(body, accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountActionsApi.V1login: " + e.Message );
            }
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.coinsecure.in/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountActionsApi* | [**V1login**](docs/AccountActionsApi.md#v1login) | **POST** /v1/login | Creates a Login Instance and returns an API Key.
*AccountActionsApi* | [**V1logininitiate**](docs/AccountActionsApi.md#v1logininitiate) | **POST** /v1/login/initiate | Initiate Login
*AccountActionsApi* | [**V1loginpasswordforgot**](docs/AccountActionsApi.md#v1loginpasswordforgot) | **POST** /v1/login/password/forgot | Sends an email with a password reset token
*AccountActionsApi* | [**V1signup**](docs/AccountActionsApi.md#v1signup) | **POST** /v1/signup | Creates a new Unverified Account.
*AccountActionsApi* | [**V1userbankotpNumber**](docs/AccountActionsApi.md#v1userbankotpnumber) | **GET** /v1/user/bank/otp/{number} | Send OTP for Bank Link
*AccountActionsApi* | [**V1userexchangekyc**](docs/AccountActionsApi.md#v1userexchangekyc) | **PUT** /v1/user/exchange/kyc | Submits a New Bank Link and initial KYC Documents.
*AccountActionsApi* | [**V1usergcmCode**](docs/AccountActionsApi.md#v1usergcmcode) | **DELETE** /v1/user/gcm/{code} | Delete GCM Code
*AccountActionsApi* | [**V1userkycotpNumber**](docs/AccountActionsApi.md#v1userkycotpnumber) | **GET** /v1/user/kyc/otp/{number} | Send OTP for KYC Link
*AccountActionsApi* | [**V1userlogout**](docs/AccountActionsApi.md#v1userlogout) | **DELETE** /v1/user/logout | Logout User
*AccountActionsApi* | [**V1usernetkicreate**](docs/AccountActionsApi.md#v1usernetkicreate) | **PUT** /v1/user/netki/create | Create Neki Wallet Name
*AccountActionsApi* | [**V1usernetkiupdate**](docs/AccountActionsApi.md#v1usernetkiupdate) | **PATCH** /v1/user/netki/update | Update Netki Address
*AccountActionsApi* | [**V1userprofileimagedelete**](docs/AccountActionsApi.md#v1userprofileimagedelete) | **POST** /v1/user/contact | Delete Profile Image
*AccountActionsApi* | [**V1userprofileimageupdate**](docs/AccountActionsApi.md#v1userprofileimageupdate) | **PATCH** /v1/user/profile/image/update | Update Profile Image
*AccountActionsApi* | [**V1userprofilephone**](docs/AccountActionsApi.md#v1userprofilephone) | **PUT** /v1/user/profile/phone/new | New Profile Phone
*AccountActionsApi* | [**V1userprofilephoneNumber**](docs/AccountActionsApi.md#v1userprofilephonenumber) | **DELETE** /v1/user/profile/phone/delete | Delete Profile Phone Number
*AccountActionsApi* | [**V1userprofilephoneotpNumber**](docs/AccountActionsApi.md#v1userprofilephoneotpnumber) | **GET** /v1/user/profile/phone/otp/{number} | Send OTP for Profile Phone
*AccountDataApi* | [**V1exchangebanksummary**](docs/AccountDataApi.md#v1exchangebanksummary) | **GET** /v1/user/exchange/bank/summary | Exchange Bank Summary
*AccountDataApi* | [**V1exchangeusercoinfee**](docs/AccountDataApi.md#v1exchangeusercoinfee) | **GET** /v1/user/exchange/coin/fee | Users Coin Fee Percentage
*AccountDataApi* | [**V1exchangeuserfiatfee**](docs/AccountDataApi.md#v1exchangeuserfiatfee) | **GET** /v1/user/exchange/fiat/fee | Users Fiat Fee Percentage
*AccountDataApi* | [**V1netkisearchNetkiName**](docs/AccountDataApi.md#v1netkisearchnetkiname) | **GET** /v1/netki/search/{netkiName} | Coinsecure.me Netki Lookup
*AccountDataApi* | [**V1userexchangekycs**](docs/AccountDataApi.md#v1userexchangekycs) | **GET** /v1/user/exchange/kycs | Gets KYC Status Details
*AccountDataApi* | [**V1userexchangereferralcoinpaid**](docs/AccountDataApi.md#v1userexchangereferralcoinpaid) | **GET** /v1/user/exchange/referral/coin/paid | Users Paid Fiat Referrals
*AccountDataApi* | [**V1userexchangereferralcoinsuccessful**](docs/AccountDataApi.md#v1userexchangereferralcoinsuccessful) | **GET** /v1/user/exchange/referral/coin/successful | Gets Users Successful Referral Links
*AccountDataApi* | [**V1userexchangereferralfiatpaid**](docs/AccountDataApi.md#v1userexchangereferralfiatpaid) | **GET** /v1/user/exchange/referral/fiat/paid | Users Paid Fiat Referrals
*AccountDataApi* | [**V1userexchangereferrals**](docs/AccountDataApi.md#v1userexchangereferrals) | **GET** /v1/user/exchange/referrals | Gets Users Referral Links
*AccountDataApi* | [**V1userexchangetradesummary**](docs/AccountDataApi.md#v1userexchangetradesummary) | **GET** /v1/user/exchange/trade/summary | Exchange Trade Summary
*AccountDataApi* | [**V1userlogintokenToken**](docs/AccountDataApi.md#v1userlogintokentoken) | **GET** /v1/user/login/token/{token} | Login Token Email
*AccountDataApi* | [**V1usersummary**](docs/AccountDataApi.md#v1usersummary) | **GET** /v1/user/summary | Exchange Bank Summary
*AccountDataApi* | [**V1userwalletsummary**](docs/AccountDataApi.md#v1userwalletsummary) | **GET** /v1/user/wallet/summary | Exchange Bank Summary
*BlockchainToolsApi* | [**V1bitcoinsearchAddress**](docs/BlockchainToolsApi.md#v1bitcoinsearchaddress) | **GET** /v1/bitcoin/search/{any} | Search Bitcoin Blockchain
*BlockchainToolsApi* | [**V1bitcoinsearchTxid**](docs/BlockchainToolsApi.md#v1bitcoinsearchtxid) | **GET** /v1/bitcoin/search/confirmation/{txid} | Get Confirmations
*ExchangeBankActionsApi* | [**V1userexchangebankcoinwithdrawinitiate**](docs/ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawinitiate) | **POST** /v1/user/exchange/bank/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
*ExchangeBankActionsApi* | [**V1userexchangebankcoinwithdrawnewVerifycode**](docs/ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawnewverifycode) | **POST** /v1/user/exchange/bank/coin/withdraw/newVerifycode | Gets a Verification Code.
*ExchangeBankActionsApi* | [**V1userexchangebankcoinwithdrawunverifiedcancel**](docs/ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawunverifiedcancel) | **DELETE** /v1/user/exchange/bank/coin/withdraw/unverified/cancel | Cancel Bitcoin Withdrawal
*ExchangeBankActionsApi* | [**V1userexchangebankcoinwithdrawverify**](docs/ExchangeBankActionsApi.md#v1userexchangebankcoinwithdrawverify) | **PUT** /v1/user/exchange/bank/coin/withdraw/verify | Verify Bitcoin Withdrawal
*ExchangeBankActionsApi* | [**V1userexchangebankfiataccountnew**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiataccountnew) | **PUT** /v1/user/exchange/bank/fiat/account/new | New Bank Link
*ExchangeBankActionsApi* | [**V1userexchangebankfiatdepositcancel**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatdepositcancel) | **DELETE** /v1/user/exchange/bank/fiat/deposit/cancel | Cancel Unverified Exchange Fiat Deposit
*ExchangeBankActionsApi* | [**V1userexchangebankfiatdepositnew**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatdepositnew) | **PUT** /v1/user/exchange/bank/fiat/deposit/new | New Exchange Fiat Deposit
*ExchangeBankActionsApi* | [**V1userexchangebankfiatwithdrawinitiate**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawinitiate) | **POST** /v1/user/exchange/bank/fiat/withdraw/initiate | Initiate Fiat Withdrawal
*ExchangeBankActionsApi* | [**V1userexchangebankfiatwithdrawnewVerifycode**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawnewverifycode) | **POST** /v1/user/exchange/bank/fiat/withdraw/newVerifycode | Gets a Fiat Verification Code.
*ExchangeBankActionsApi* | [**V1userexchangebankfiatwithdrawunverifiedcancel**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawunverifiedcancel) | **DELETE** /v1/user/exchange/bank/fiat/withdraw/unverified/cancel | Cancel Fiat Withdrawal
*ExchangeBankActionsApi* | [**V1userexchangebankfiatwithdrawverify**](docs/ExchangeBankActionsApi.md#v1userexchangebankfiatwithdrawverify) | **PUT** /v1/user/exchange/bank/fiat/withdraw/verify | Verify Fiat Withdrawal
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoinaddresses**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinaddresses) | **GET** /v1/user/exchange/bank/coin/addresses | Exchange Coin Addresses
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoinbalanceavailable**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalanceavailable) | **GET** /v1/user/exchange/bank/coin/balance/total | Available Exchange Coin Balance
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoinbalancepending**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancepending) | **GET** /v1/user/exchange/bank/coin/balance/pending | In Trade Coin Balance
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoinbalancetotal**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinbalancetotal) | **GET** /v1/user/exchange/bank/coin/balance/available | Total Exchange Coin Balance
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoindepositcancelled**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositcancelled) | **GET** /v1/user/exchange/bank/coin/deposit/cancelled | Cancelled Exchange Coin Deposits
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoindepositunverified**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositunverified) | **GET** /v1/user/exchange/bank/coin/deposit/unverified | Unverified Exchange Coin Deposits
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoindepositverified**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoindepositverified) | **GET** /v1/user/exchange/bank/coin/deposit/verified | Verified Exchange Coin Deposits
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoinwithdrawcancelled**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcancelled) | **GET** /v1/user/exchange/bank/coin/withdraw/cancelled | Cancelled Exchange Coin Withdrawals
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoinwithdrawcompleted**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawcompleted) | **GET** /v1/user/exchange/bank/coin/withdraw/completed | Completed Exchange Coin Withdrawals
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoinwithdrawunverified**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawunverified) | **GET** /v1/user/exchange/bank/coin/withdraw/unverified | Unverified Exchange Coin Withdrawals
*ExchangeBankCoinDataApi* | [**V1userexchangebankcoinwithdrawverified**](docs/ExchangeBankCoinDataApi.md#v1userexchangebankcoinwithdrawverified) | **GET** /v1/user/exchange/bank/coin/withdraw/verified | Verified Exchange Coin Withdrawals
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiataccounts**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiataccounts) | **GET** /v1/user/exchange/bank/fiat/accounts | Exchange Bitcoin Deposit Addresses
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiatbalanceavailable**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalanceavailable) | **GET** /v1/user/exchange/bank/fiat/balance/total | Available Exchange Fiat Balance
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiatbalancepending**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancepending) | **GET** /v1/user/exchange/bank/fiat/balance/pending | In Trade Coin Balance
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiatbalancetotal**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatbalancetotal) | **GET** /v1/user/exchange/bank/fiat/balance/available | Total Exchange Fiat Balance
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiatdepositcancelled**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositcancelled) | **GET** /v1/user/exchange/bank/fiat/deposit/cancelled | Cancelled Exchange Fiat Deposits
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiatdepositunverified**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositunverified) | **GET** /v1/user/exchange/bank/fiat/deposit/unverified | Unverified Exchange Fiat Deposits
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiatdepositverified**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatdepositverified) | **GET** /v1/user/exchange/bank/fiat/deposit/verified | Verified Exchange Fiat Deposits
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiatwithdrawcancelled**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcancelled) | **GET** /v1/user/exchange/bank/fiat/withdraw/cancelled | Cancelled Exchange Fiat Withdrawals
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiatwithdrawcompleted**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawcompleted) | **GET** /v1/user/exchange/bank/fiat/withdraw/completed | Completed Exchange Fiat Withdrawals
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiatwithdrawunverified**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawunverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/unverified | Unverified Exchange Fiat Withdrawals
*ExchangeBankFiatDataApi* | [**V1userexchangebankfiatwithdrawverified**](docs/ExchangeBankFiatDataApi.md#v1userexchangebankfiatwithdrawverified) | **GET** /v1/user/exchange/bank/fiat/withdraw/verified | Verified Exchange Fiat Withdrawals
*ExchangeTradeActionsApi* | [**V1userexchangeaskcancel**](docs/ExchangeTradeActionsApi.md#v1userexchangeaskcancel) | **DELETE** /v1/user/exchange/ask/cancel | Cancel Open Sell Order
*ExchangeTradeActionsApi* | [**V1userexchangeasknew**](docs/ExchangeTradeActionsApi.md#v1userexchangeasknew) | **PUT** /v1/user/exchange/ask/new | BTC Sell Order
*ExchangeTradeActionsApi* | [**V1userexchangebidcancel**](docs/ExchangeTradeActionsApi.md#v1userexchangebidcancel) | **DELETE** /v1/user/exchange/bid/cancel | Cancel Open Buy Order
*ExchangeTradeActionsApi* | [**V1userexchangebidnew**](docs/ExchangeTradeActionsApi.md#v1userexchangebidnew) | **PUT** /v1/user/exchange/bid/new | BTC Buy Order
*ExchangeTradeActionsApi* | [**V1userexchangeinstantbuy**](docs/ExchangeTradeActionsApi.md#v1userexchangeinstantbuy) | **PUT** /v1/user/exchange/instant/buy | Instantly Buy BTC
*ExchangeTradeActionsApi* | [**V1userexchangeinstantsell**](docs/ExchangeTradeActionsApi.md#v1userexchangeinstantsell) | **PUT** /v1/user/exchange/instant/sell | Instantly Sell BTC
*ExchangeTradeDataApi* | [**V1exchangeasklow**](docs/ExchangeTradeDataApi.md#v1exchangeasklow) | **GET** /v1/exchange/ask/low | Lowest Ask
*ExchangeTradeDataApi* | [**V1exchangeaskorders**](docs/ExchangeTradeDataApi.md#v1exchangeaskorders) | **GET** /v1/exchange/ask/orders | All Sell Orders
*ExchangeTradeDataApi* | [**V1exchangebidhigh**](docs/ExchangeTradeDataApi.md#v1exchangebidhigh) | **GET** /v1/exchange/bid/high | Returns the Highest Bid in the Order Book
*ExchangeTradeDataApi* | [**V1exchangebidorders**](docs/ExchangeTradeDataApi.md#v1exchangebidorders) | **GET** /v1/exchange/bid/orders | All Buy Orders
*ExchangeTradeDataApi* | [**V1exchangelastTrade**](docs/ExchangeTradeDataApi.md#v1exchangelasttrade) | **GET** /v1/exchange/lastTrade | Last Trade
*ExchangeTradeDataApi* | [**V1exchangemax24Hr**](docs/ExchangeTradeDataApi.md#v1exchangemax24hr) | **GET** /v1/exchange/max24Hr | Max 24 Hour Rate
*ExchangeTradeDataApi* | [**V1exchangemin24Hr**](docs/ExchangeTradeDataApi.md#v1exchangemin24hr) | **GET** /v1/exchange/min24Hr | Min 24 Hour Rate
*ExchangeTradeDataApi* | [**V1exchangeticker**](docs/ExchangeTradeDataApi.md#v1exchangeticker) | **GET** /v1/exchange/ticker | Exchange Ticker
*ExchangeTradeDataApi* | [**V1userexchangeaskcancelled**](docs/ExchangeTradeDataApi.md#v1userexchangeaskcancelled) | **GET** /v1/user/exchange/ask/cancelled | Cancelled User Sell Orders
*ExchangeTradeDataApi* | [**V1userexchangeaskcompleted**](docs/ExchangeTradeDataApi.md#v1userexchangeaskcompleted) | **GET** /v1/user/exchange/ask/completed | Completed User Sell Orders
*ExchangeTradeDataApi* | [**V1userexchangeaskpending**](docs/ExchangeTradeDataApi.md#v1userexchangeaskpending) | **GET** /v1/user/exchange/ask/pending | Pending User Sell Orders
*ExchangeTradeDataApi* | [**V1userexchangebidcancelled**](docs/ExchangeTradeDataApi.md#v1userexchangebidcancelled) | **GET** /v1/user/exchange/bid/cancelled | Cancelled User Buy Orders
*ExchangeTradeDataApi* | [**V1userexchangebidcompleted**](docs/ExchangeTradeDataApi.md#v1userexchangebidcompleted) | **GET** /v1/user/exchange/bid/completed | Completed User Buy Orders
*ExchangeTradeDataApi* | [**V1userexchangebidpending**](docs/ExchangeTradeDataApi.md#v1userexchangebidpending) | **GET** /v1/user/exchange/bid/pending | Pending User Buy Orders
*SecurityActionsApi* | [**V1mfaauthyinitiate**](docs/SecurityActionsApi.md#v1mfaauthyinitiate) | **POST** /v1/mfa/authy/initiate | Initiate Authy Registration.
*SecurityActionsApi* | [**V1mfagainitiate**](docs/SecurityActionsApi.md#v1mfagainitiate) | **POST** /v1/mfa/ga/initiate | Initiate GA Registration.
*SecurityActionsApi* | [**V1usermfaauthycall**](docs/SecurityActionsApi.md#v1usermfaauthycall) | **GET** /v1/mfa/authy/call | Authy Call Code
*SecurityActionsApi* | [**V1usermfaauthydisable**](docs/SecurityActionsApi.md#v1usermfaauthydisable) | **DELETE** /v1/user/mfa/authy/disable | Disable Authy
*SecurityActionsApi* | [**V1usermfaauthyinitiateenable**](docs/SecurityActionsApi.md#v1usermfaauthyinitiateenable) | **PUT** /v1/user/mfa/authy/initiate/enable | Verify Authy Registration
*SecurityActionsApi* | [**V1usermfaauthysms**](docs/SecurityActionsApi.md#v1usermfaauthysms) | **GET** /v1/mfa/authy/sms | Authy Sms Code
*SecurityActionsApi* | [**V1usermfagadisable**](docs/SecurityActionsApi.md#v1usermfagadisable) | **DELETE** /v1/user/mfa/ga/disable | Disable Google Authenticator
*SecurityActionsApi* | [**V1usermfagainitiateenable**](docs/SecurityActionsApi.md#v1usermfagainitiateenable) | **PUT** /v1/user/mfa/ga/initiate/enable | Enable Google Authenticator
*SecurityActionsApi* | [**V1userpasswordchange**](docs/SecurityActionsApi.md#v1userpasswordchange) | **PATCH** /v1/user/password/change | Change Password.
*SecurityActionsApi* | [**V1userpasswordreset**](docs/SecurityActionsApi.md#v1userpasswordreset) | **PATCH** /v1/user/password/reset | Reset Password.
*WalletActionsApi* | [**V1userwalletcoinaddressnew**](docs/WalletActionsApi.md#v1userwalletcoinaddressnew) | **PUT** /v1/user/wallet/coin/address/new | New Bitcoin Address
*WalletActionsApi* | [**V1userwalletcoinnew**](docs/WalletActionsApi.md#v1userwalletcoinnew) | **PUT** /v1/user/wallet/coin/new | Create New Wallet
*WalletActionsApi* | [**V1userwalletcoinwithdrawinitiate**](docs/WalletActionsApi.md#v1userwalletcoinwithdrawinitiate) | **POST** /v1/user/wallet/coin/withdraw/initiate | Initiate Bitcoin Withdrawal
*WalletActionsApi* | [**V1userwalletcoinwithdrawsendToExchange**](docs/WalletActionsApi.md#v1userwalletcoinwithdrawsendtoexchange) | **PUT** /v1/user/wallet/coin/withdraw/sendToExchange | Send to Exchange
*WalletActionsApi* | [**V1userwalletcoinwithdrawunverifiedcancel**](docs/WalletActionsApi.md#v1userwalletcoinwithdrawunverifiedcancel) | **DELETE** /v1/user/wallet/coin/withdraw/unverified/cancel | Cancel Bitcoin Withdrawal
*WalletActionsApi* | [**V1userwalletcoinwithdrawverify**](docs/WalletActionsApi.md#v1userwalletcoinwithdrawverify) | **PUT** /v1/user/wallet/coin/withdraw/verify | Verify Bitcoin Withdrawal
*WalletActionsApi* | [**V1walletcoinwithdrawnewVerifycode**](docs/WalletActionsApi.md#v1walletcoinwithdrawnewverifycode) | **POST** /v1/wallet/coin/withdraw/newVerifycode | Gets a Verification Code
*WalletDataApi* | [**V1userwalletcoinaddressWalletID**](docs/WalletDataApi.md#v1userwalletcoinaddresswalletid) | **GET** /v1/user/wallet/coin/address/{walletID} | Wallet Bitcoin Addresses
*WalletDataApi* | [**V1userwalletcoindepositconfirmedWalletID**](docs/WalletDataApi.md#v1userwalletcoindepositconfirmedwalletid) | **GET** /v1/user/wallet/coin/deposit/confirmed/{walletID} | Confirmed Wallet Transactions
*WalletDataApi* | [**V1userwalletcoindepositconfirmedall**](docs/WalletDataApi.md#v1userwalletcoindepositconfirmedall) | **GET** /v1/user/wallet/coin/deposit/confirmed/all | Confirmed Wallet Deposit
*WalletDataApi* | [**V1userwalletcoindepositunconfirmedWalletID**](docs/WalletDataApi.md#v1userwalletcoindepositunconfirmedwalletid) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/{walletID} | Unconfirmed Transactions in Wallet
*WalletDataApi* | [**V1userwalletcoindepositunconfirmedall**](docs/WalletDataApi.md#v1userwalletcoindepositunconfirmedall) | **GET** /v1/user/wallet/coin/deposit/unconfirmed/all | All Unconfirmed Deposits
*WalletDataApi* | [**V1userwalletcoinwallets**](docs/WalletDataApi.md#v1userwalletcoinwallets) | **GET** /v1/user/wallet/coin/wallets | Wallet Details
*WalletDataApi* | [**V1walletwithdrawcancelled**](docs/WalletDataApi.md#v1walletwithdrawcancelled) | **GET** /v1/wallet/coin/withdraw/cancelled | Cancelled Coin Withdrawals
*WalletDataApi* | [**V1walletwithdrawcompleted**](docs/WalletDataApi.md#v1walletwithdrawcompleted) | **GET** /v1/wallet/coin/withdraw/completed | Completed Coin Withdrawals
*WalletDataApi* | [**V1walletwithdrawunverified**](docs/WalletDataApi.md#v1walletwithdrawunverified) | **GET** /v1/wallet/coin/withdraw/unverified | Unverified Coin Withdrawals
*WalletDataApi* | [**V1walletwithdrawverified**](docs/WalletDataApi.md#v1walletwithdrawverified) | **GET** /v1/wallet/coin/withdraw/verified | Verified Coin Withdrawals


## Documentation for Models

 - [Model.Address](docs/Address.md)
 - [Model.AllRefData](docs/AllRefData.md)
 - [Model.AllRefDataResponse](docs/AllRefDataResponse.md)
 - [Model.AskID](docs/AskID.md)
 - [Model.BankSummaryData](docs/BankSummaryData.md)
 - [Model.BankSummaryDataResponse](docs/BankSummaryDataResponse.md)
 - [Model.BidID](docs/BidID.md)
 - [Model.ChangePassword](docs/ChangePassword.md)
 - [Model.Code](docs/Code.md)
 - [Model.CodeCountryMobile](docs/CodeCountryMobile.md)
 - [Model.CoinDepData](docs/CoinDepData.md)
 - [Model.CoinDepDataResponse](docs/CoinDepDataResponse.md)
 - [Model.ConfirmData](docs/ConfirmData.md)
 - [Model.ConfirmDataResponse](docs/ConfirmDataResponse.md)
 - [Model.DepositID](docs/DepositID.md)
 - [Model.DoubleData](docs/DoubleData.md)
 - [Model.DoubleDataResponse](docs/DoubleDataResponse.md)
 - [Model.Email](docs/Email.md)
 - [Model.FailResult](docs/FailResult.md)
 - [Model.FiatBankData](docs/FiatBankData.md)
 - [Model.FiatBankDataResponse](docs/FiatBankDataResponse.md)
 - [Model.FiatDepData](docs/FiatDepData.md)
 - [Model.FiatDepDataResponse](docs/FiatDepDataResponse.md)
 - [Model.FiatWithData](docs/FiatWithData.md)
 - [Model.FiatWithDataResponse](docs/FiatWithDataResponse.md)
 - [Model.JsValue](docs/JsValue.md)
 - [Model.KYCData](docs/KYCData.md)
 - [Model.KYCDataResponse](docs/KYCDataResponse.md)
 - [Model.LastTradeData](docs/LastTradeData.md)
 - [Model.LastTradeDataResponse](docs/LastTradeDataResponse.md)
 - [Model.LoginFormNew](docs/LoginFormNew.md)
 - [Model.LoginId](docs/LoginId.md)
 - [Model.MaxVol](docs/MaxVol.md)
 - [Model.MethodCountryMobile](docs/MethodCountryMobile.md)
 - [Model.MinFiat](docs/MinFiat.md)
 - [Model.NetkiName](docs/NetkiName.md)
 - [Model.NetkiNameAddress](docs/NetkiNameAddress.md)
 - [Model.NewAddress](docs/NewAddress.md)
 - [Model.NewBankForm](docs/NewBankForm.md)
 - [Model.NewFiatBankDeposit](docs/NewFiatBankDeposit.md)
 - [Model.NewWallet](docs/NewWallet.md)
 - [Model.NumberOtp](docs/NumberOtp.md)
 - [Model.OrderData](docs/OrderData.md)
 - [Model.OrderDataResponse](docs/OrderDataResponse.md)
 - [Model.RateData](docs/RateData.md)
 - [Model.RateDataResponse](docs/RateDataResponse.md)
 - [Model.RateDiffData](docs/RateDiffData.md)
 - [Model.RateDiffDataResponse](docs/RateDiffDataResponse.md)
 - [Model.RateVolData](docs/RateVolData.md)
 - [Model.RateVolDataResponse](docs/RateVolDataResponse.md)
 - [Model.ResetPassword](docs/ResetPassword.md)
 - [Model.SendCoin](docs/SendCoin.md)
 - [Model.SendCoinWallet](docs/SendCoinWallet.md)
 - [Model.SendExchange](docs/SendExchange.md)
 - [Model.SignupForm](docs/SignupForm.md)
 - [Model.StandardInitiateLoginResultData](docs/StandardInitiateLoginResultData.md)
 - [Model.StandardLoginResultData](docs/StandardLoginResultData.md)
 - [Model.StandardTickerResultData](docs/StandardTickerResultData.md)
 - [Model.SuccCoinRefData](docs/SuccCoinRefData.md)
 - [Model.SuccCoinRefDataResponse](docs/SuccCoinRefDataResponse.md)
 - [Model.SuccRefData](docs/SuccRefData.md)
 - [Model.SuccRefDataResponse](docs/SuccRefDataResponse.md)
 - [Model.SuccessInitiateLoginResponse](docs/SuccessInitiateLoginResponse.md)
 - [Model.SuccessLoginResponse](docs/SuccessLoginResponse.md)
 - [Model.SuccessResult](docs/SuccessResult.md)
 - [Model.SuccessResultList](docs/SuccessResultList.md)
 - [Model.SuccessTickerResponse](docs/SuccessTickerResponse.md)
 - [Model.TimeData](docs/TimeData.md)
 - [Model.TimeDataCoin](docs/TimeDataCoin.md)
 - [Model.TimeKYCData](docs/TimeKYCData.md)
 - [Model.TradeAddressData](docs/TradeAddressData.md)
 - [Model.TradeAddressDataResponse](docs/TradeAddressDataResponse.md)
 - [Model.TradeCoinWithdrawData](docs/TradeCoinWithdrawData.md)
 - [Model.TradeCoinWithdrawDataResponse](docs/TradeCoinWithdrawDataResponse.md)
 - [Model.TradeSummaryData](docs/TradeSummaryData.md)
 - [Model.TradeSummaryDataResponse](docs/TradeSummaryDataResponse.md)
 - [Model.UserSummaryData](docs/UserSummaryData.md)
 - [Model.UserSummaryDataResponse](docs/UserSummaryDataResponse.md)
 - [Model.ValidAddressSearchData](docs/ValidAddressSearchData.md)
 - [Model.ValidAddressSearchDataResponse](docs/ValidAddressSearchDataResponse.md)
 - [Model.VolData](docs/VolData.md)
 - [Model.VolDataResponse](docs/VolDataResponse.md)
 - [Model.WalletAddressData](docs/WalletAddressData.md)
 - [Model.WalletAddressDataResponse](docs/WalletAddressDataResponse.md)
 - [Model.WalletCoinWithdrawData](docs/WalletCoinWithdrawData.md)
 - [Model.WalletCoinWithdrawDataResponse](docs/WalletCoinWithdrawDataResponse.md)
 - [Model.WalletSummaryData](docs/WalletSummaryData.md)
 - [Model.WalletSummaryDataResponse](docs/WalletSummaryDataResponse.md)
 - [Model.WalletsData](docs/WalletsData.md)
 - [Model.WalletsDataResponse](docs/WalletsDataResponse.md)
 - [Model.WithdrawFiat](docs/WithdrawFiat.md)
 - [Model.WithdrawID](docs/WithdrawID.md)


## Documentation for Authorization

 All endpoints do not require authorization.
