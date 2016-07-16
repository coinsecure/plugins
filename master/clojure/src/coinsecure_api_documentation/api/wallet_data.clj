(ns coinsecure-api-documentation.api.wallet-data
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1userwalletcoinaddress-wallet-id-with-http-info
  "Wallet Bitcoin Addresses
  Gets a List of Users Bitcoin Deposit Addresses."
  ([wallet-id ] (v1userwalletcoinaddress-wallet-id-with-http-info wallet-id nil))
  ([wallet-id {:keys [authorization accept ]}]
   (call-api "/v1/user/wallet/coin/address/{walletID}" :get
             {:path-params   {"walletID" wallet-id }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoinaddress-wallet-id
  "Wallet Bitcoin Addresses
  Gets a List of Users Bitcoin Deposit Addresses."
  ([wallet-id ] (v1userwalletcoinaddress-wallet-id wallet-id nil))
  ([wallet-id optional-params]
   (:data (v1userwalletcoinaddress-wallet-id-with-http-info wallet-id optional-params))))

(defn v1userwalletcoindepositconfirmed-wallet-id-with-http-info
  "Confirmed Wallet Transactions
  Gets your Confirmed Wallet Bitcoin Transactions."
  ([wallet-id ] (v1userwalletcoindepositconfirmed-wallet-id-with-http-info wallet-id nil))
  ([wallet-id {:keys [authorization accept ]}]
   (call-api "/v1/user/wallet/coin/deposit/confirmed/{walletID}" :get
             {:path-params   {"walletID" wallet-id }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoindepositconfirmed-wallet-id
  "Confirmed Wallet Transactions
  Gets your Confirmed Wallet Bitcoin Transactions."
  ([wallet-id ] (v1userwalletcoindepositconfirmed-wallet-id wallet-id nil))
  ([wallet-id optional-params]
   (:data (v1userwalletcoindepositconfirmed-wallet-id-with-http-info wallet-id optional-params))))

(defn v1userwalletcoindepositconfirmedall-with-http-info
  "Confirmed Wallet Deposit
  Gets the total confirmed transactions across all accounts and addresses"
  ([] (v1userwalletcoindepositconfirmedall-with-http-info nil))
  ([{:keys [authorization accept ]}]
   (call-api "/v1/user/wallet/coin/deposit/confirmed/all" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoindepositconfirmedall
  "Confirmed Wallet Deposit
  Gets the total confirmed transactions across all accounts and addresses"
  ([] (v1userwalletcoindepositconfirmedall nil))
  ([optional-params]
   (:data (v1userwalletcoindepositconfirmedall-with-http-info optional-params))))

(defn v1userwalletcoindepositunconfirmed-wallet-id-with-http-info
  "Unconfirmed Transactions in Wallet
  Gets the unconfirmed transactions on an account/ wallet."
  ([wallet-id authorization ] (v1userwalletcoindepositunconfirmed-wallet-id-with-http-info wallet-id authorization nil))
  ([wallet-id authorization {:keys [accept ]}]
   (call-api "/v1/user/wallet/coin/deposit/unconfirmed/{walletID}" :get
             {:path-params   {"walletID" wallet-id }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoindepositunconfirmed-wallet-id
  "Unconfirmed Transactions in Wallet
  Gets the unconfirmed transactions on an account/ wallet."
  ([wallet-id authorization ] (v1userwalletcoindepositunconfirmed-wallet-id wallet-id authorization nil))
  ([wallet-id authorization optional-params]
   (:data (v1userwalletcoindepositunconfirmed-wallet-id-with-http-info wallet-id authorization optional-params))))

(defn v1userwalletcoindepositunconfirmedall-with-http-info
  "All Unconfirmed Deposits
  Gets the total unconfirmed transactions across all accounts and addresses"
  ([] (v1userwalletcoindepositunconfirmedall-with-http-info nil))
  ([{:keys [authorization accept ]}]
   (call-api "/v1/user/wallet/coin/deposit/unconfirmed/all" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoindepositunconfirmedall
  "All Unconfirmed Deposits
  Gets the total unconfirmed transactions across all accounts and addresses"
  ([] (v1userwalletcoindepositunconfirmedall nil))
  ([optional-params]
   (:data (v1userwalletcoindepositunconfirmedall-with-http-info optional-params))))

(defn v1userwalletcoinwallets-with-http-info
  "Wallet Details
  Gets a List of Users Wallets."
  ([] (v1userwalletcoinwallets-with-http-info nil))
  ([{:keys [authorization accept ]}]
   (call-api "/v1/user/wallet/coin/wallets" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletcoinwallets
  "Wallet Details
  Gets a List of Users Wallets."
  ([] (v1userwalletcoinwallets nil))
  ([optional-params]
   (:data (v1userwalletcoinwallets-with-http-info optional-params))))

(defn v1walletwithdrawcancelled-with-http-info
  "Cancelled Coin Withdrawals
  Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1walletwithdrawcancelled-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/wallet/coin/withdraw/cancelled" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1walletwithdrawcancelled
  "Cancelled Coin Withdrawals
  Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1walletwithdrawcancelled authorization nil))
  ([authorization optional-params]
   (:data (v1walletwithdrawcancelled-with-http-info authorization optional-params))))

(defn v1walletwithdrawcompleted-with-http-info
  "Completed Coin Withdrawals
  Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1walletwithdrawcompleted-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/wallet/coin/withdraw/completed" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1walletwithdrawcompleted
  "Completed Coin Withdrawals
  Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1walletwithdrawcompleted authorization nil))
  ([authorization optional-params]
   (:data (v1walletwithdrawcompleted-with-http-info authorization optional-params))))

(defn v1walletwithdrawunverified-with-http-info
  "Unverified Coin Withdrawals
  Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1walletwithdrawunverified-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/wallet/coin/withdraw/unverified" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1walletwithdrawunverified
  "Unverified Coin Withdrawals
  Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1walletwithdrawunverified authorization nil))
  ([authorization optional-params]
   (:data (v1walletwithdrawunverified-with-http-info authorization optional-params))))

(defn v1walletwithdrawverified-with-http-info
  "Verified Coin Withdrawals
  Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1walletwithdrawverified-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/wallet/coin/withdraw/verified" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1walletwithdrawverified
  "Verified Coin Withdrawals
  Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1walletwithdrawverified authorization nil))
  ([authorization optional-params]
   (:data (v1walletwithdrawverified-with-http-info authorization optional-params))))

