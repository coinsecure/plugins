(ns coinsecure-api-documentation.api.exchange-bank-actions
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1userexchangebankcoinwithdrawinitiate-with-http-info
  "Initiate Bitcoin Withdrawal
  The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page."
  ([body ] (v1userexchangebankcoinwithdrawinitiate-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/coin/withdraw/initiate" :post
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinwithdrawinitiate
  "Initiate Bitcoin Withdrawal
  The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page."
  ([body ] (v1userexchangebankcoinwithdrawinitiate body nil))
  ([body optional-params]
   (:data (v1userexchangebankcoinwithdrawinitiate-with-http-info body optional-params))))

(defn v1userexchangebankcoinwithdrawnew-verifycode-with-http-info
  "Gets a Verification Code.
  Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify."
  ([body ] (v1userexchangebankcoinwithdrawnew-verifycode-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/coin/withdraw/newVerifycode" :post
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinwithdrawnew-verifycode
  "Gets a Verification Code.
  Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify."
  ([body ] (v1userexchangebankcoinwithdrawnew-verifycode body nil))
  ([body optional-params]
   (:data (v1userexchangebankcoinwithdrawnew-verifycode-with-http-info body optional-params))))

(defn v1userexchangebankcoinwithdrawunverifiedcancel-withdraw-id-with-http-info
  "Cancel Bitcoin Withdrawal
  Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified."
  ([withdraw-id ] (v1userexchangebankcoinwithdrawunverifiedcancel-withdraw-id-with-http-info withdraw-id nil))
  ([withdraw-id {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/coin/withdraw/unverified/cancel/{withdrawID}" :delete
             {:path-params   {"withdrawID" withdraw-id }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinwithdrawunverifiedcancel-withdraw-id
  "Cancel Bitcoin Withdrawal
  Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified."
  ([withdraw-id ] (v1userexchangebankcoinwithdrawunverifiedcancel-withdraw-id withdraw-id nil))
  ([withdraw-id optional-params]
   (:data (v1userexchangebankcoinwithdrawunverifiedcancel-withdraw-id-with-http-info withdraw-id optional-params))))

(defn v1userexchangebankcoinwithdrawverify-with-http-info
  "Verify Bitcoin Withdrawal
  Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode."
  ([body ] (v1userexchangebankcoinwithdrawverify-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/coin/withdraw/verify" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinwithdrawverify
  "Verify Bitcoin Withdrawal
  Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode."
  ([body ] (v1userexchangebankcoinwithdrawverify body nil))
  ([body optional-params]
   (:data (v1userexchangebankcoinwithdrawverify-with-http-info body optional-params))))

(defn v1userexchangebankfiataccountnew-with-http-info
  "New Bank Link
  Submits a New Bank Link on KYC Verified Accounts."
  ([body ] (v1userexchangebankfiataccountnew-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/account/new" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiataccountnew
  "New Bank Link
  Submits a New Bank Link on KYC Verified Accounts."
  ([body ] (v1userexchangebankfiataccountnew body nil))
  ([body optional-params]
   (:data (v1userexchangebankfiataccountnew-with-http-info body optional-params))))

(defn v1userexchangebankfiatdepositcancel-deposit-id-with-http-info
  "Cancel Unverified Exchange Fiat Deposit
  Cancels an unverified Exchange Fiat Deposit."
  ([deposit-id ] (v1userexchangebankfiatdepositcancel-deposit-id-with-http-info deposit-id nil))
  ([deposit-id {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/deposit/cancel/{depositID}" :delete
             {:path-params   {"depositID" deposit-id }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatdepositcancel-deposit-id
  "Cancel Unverified Exchange Fiat Deposit
  Cancels an unverified Exchange Fiat Deposit."
  ([deposit-id ] (v1userexchangebankfiatdepositcancel-deposit-id deposit-id nil))
  ([deposit-id optional-params]
   (:data (v1userexchangebankfiatdepositcancel-deposit-id-with-http-info deposit-id optional-params))))

(defn v1userexchangebankfiatdepositnew-with-http-info
  "New Exchange Fiat Deposit
  Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment."
  ([body ] (v1userexchangebankfiatdepositnew-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/deposit/new" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatdepositnew
  "New Exchange Fiat Deposit
  Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment."
  ([body ] (v1userexchangebankfiatdepositnew body nil))
  ([body optional-params]
   (:data (v1userexchangebankfiatdepositnew-with-http-info body optional-params))))

(defn v1userexchangebankfiatwithdrawinitiate-with-http-info
  "Initiate Fiat Withdrawal
  The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page."
  ([body ] (v1userexchangebankfiatwithdrawinitiate-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/withdraw/initiate" :post
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatwithdrawinitiate
  "Initiate Fiat Withdrawal
  The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page."
  ([body ] (v1userexchangebankfiatwithdrawinitiate body nil))
  ([body optional-params]
   (:data (v1userexchangebankfiatwithdrawinitiate-with-http-info body optional-params))))

(defn v1userexchangebankfiatwithdrawnew-verifycode-with-http-info
  "Gets a Fiat Verification Code.
  Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify."
  ([body ] (v1userexchangebankfiatwithdrawnew-verifycode-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/withdraw/newVerifycode" :post
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatwithdrawnew-verifycode
  "Gets a Fiat Verification Code.
  Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify."
  ([body ] (v1userexchangebankfiatwithdrawnew-verifycode body nil))
  ([body optional-params]
   (:data (v1userexchangebankfiatwithdrawnew-verifycode-with-http-info body optional-params))))

(defn v1userexchangebankfiatwithdrawunverifiedcancel-withdraw-id-with-http-info
  "Cancel Fiat Withdrawal
  Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified."
  ([withdraw-id ] (v1userexchangebankfiatwithdrawunverifiedcancel-withdraw-id-with-http-info withdraw-id nil))
  ([withdraw-id {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/withdraw/unverified/cancel/{withdrawID}" :delete
             {:path-params   {"withdrawID" withdraw-id }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatwithdrawunverifiedcancel-withdraw-id
  "Cancel Fiat Withdrawal
  Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified."
  ([withdraw-id ] (v1userexchangebankfiatwithdrawunverifiedcancel-withdraw-id withdraw-id nil))
  ([withdraw-id optional-params]
   (:data (v1userexchangebankfiatwithdrawunverifiedcancel-withdraw-id-with-http-info withdraw-id optional-params))))

(defn v1userexchangebankfiatwithdrawverify-with-http-info
  "Verify Fiat Withdrawal
  Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode."
  ([body ] (v1userexchangebankfiatwithdrawverify-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/withdraw/verify" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatwithdrawverify
  "Verify Fiat Withdrawal
  Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode."
  ([body ] (v1userexchangebankfiatwithdrawverify body nil))
  ([body optional-params]
   (:data (v1userexchangebankfiatwithdrawverify-with-http-info body optional-params))))

