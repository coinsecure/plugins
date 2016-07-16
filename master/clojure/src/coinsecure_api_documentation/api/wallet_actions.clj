(ns coinsecure-api-documentation.api.wallet-actions
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1userwalletcoinaddressnew-with-http-info
  "New Bitcoin Address
  Generates a New Bitcoin Address to store coins."
  ([body ] (v1userwalletcoinaddressnew-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/wallet/coin/address/new" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoinaddressnew
  "New Bitcoin Address
  Generates a New Bitcoin Address to store coins."
  ([body ] (v1userwalletcoinaddressnew body nil))
  ([body optional-params]
   (:data (v1userwalletcoinaddressnew-with-http-info body optional-params))))

(defn v1userwalletcoinnew-with-http-info
  "Create New Wallet
  Creates a New wallet to store addresses. This method also creates a single default address in each new wallet."
  ([body ] (v1userwalletcoinnew-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/wallet/coin/new" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoinnew
  "Create New Wallet
  Creates a New wallet to store addresses. This method also creates a single default address in each new wallet."
  ([body ] (v1userwalletcoinnew body nil))
  ([body optional-params]
   (:data (v1userwalletcoinnew-with-http-info body optional-params))))

(defn v1userwalletcoinwithdrawinitiate-with-http-info
  "Initiate Bitcoin Withdrawal
  The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page."
  ([body ] (v1userwalletcoinwithdrawinitiate-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/wallet/coin/withdraw/initiate" :post
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoinwithdrawinitiate
  "Initiate Bitcoin Withdrawal
  The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page."
  ([body ] (v1userwalletcoinwithdrawinitiate body nil))
  ([body optional-params]
   (:data (v1userwalletcoinwithdrawinitiate-with-http-info body optional-params))))

(defn v1userwalletcoinwithdrawsend-to-exchange-with-http-info
  "Send to Exchange
  This function transfers funds to yout Exchange Balance without the need for any confirmations."
  ([body ] (v1userwalletcoinwithdrawsend-to-exchange-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/wallet/coin/withdraw/sendToExchange" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoinwithdrawsend-to-exchange
  "Send to Exchange
  This function transfers funds to yout Exchange Balance without the need for any confirmations."
  ([body ] (v1userwalletcoinwithdrawsend-to-exchange body nil))
  ([body optional-params]
   (:data (v1userwalletcoinwithdrawsend-to-exchange-with-http-info body optional-params))))

(defn v1userwalletcoinwithdrawunverifiedcancel-with-http-info
  "Cancel Bitcoin Withdrawal
  Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws."
  ([authorization body ] (v1userwalletcoinwithdrawunverifiedcancel-with-http-info authorization body nil))
  ([authorization body {:keys [accept ]}]
   (call-api "/v1/user/wallet/coin/withdraw/unverified/cancel" :delete
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoinwithdrawunverifiedcancel
  "Cancel Bitcoin Withdrawal
  Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws."
  ([authorization body ] (v1userwalletcoinwithdrawunverifiedcancel authorization body nil))
  ([authorization body optional-params]
   (:data (v1userwalletcoinwithdrawunverifiedcancel-with-http-info authorization body optional-params))))

(defn v1userwalletcoinwithdrawverify-with-http-info
  "Verify Bitcoin Withdrawal
  Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode."
  ([authorization body ] (v1userwalletcoinwithdrawverify-with-http-info authorization body nil))
  ([authorization body {:keys [accept ]}]
   (call-api "/v1/user/wallet/coin/withdraw/verify" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoinwithdrawverify
  "Verify Bitcoin Withdrawal
  Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode."
  ([authorization body ] (v1userwalletcoinwithdrawverify authorization body nil))
  ([authorization body optional-params]
   (:data (v1userwalletcoinwithdrawverify-with-http-info authorization body optional-params))))

(defn v1walletcoinwithdrawnew-verifycode-with-http-info
  "Gets a Verification Code
  Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified."
  ([body ] (v1walletcoinwithdrawnew-verifycode-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/wallet/coin/withdraw/newVerifycode" :post
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1walletcoinwithdrawnew-verifycode
  "Gets a Verification Code
  Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified."
  ([body ] (v1walletcoinwithdrawnew-verifycode body nil))
  ([body optional-params]
   (:data (v1walletcoinwithdrawnew-verifycode-with-http-info body optional-params))))

