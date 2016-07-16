(ns coinsecure-api-documentation.api.exchange-bank-coin-data
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1userexchangebankcoinaddresses-with-http-info
  "Exchange Coin Addresses
  Gets a List of Users Exchange Bitcoin Deposit Addresses."
  ([authorization ] (v1userexchangebankcoinaddresses-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bank/coin/addresses" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinaddresses
  "Exchange Coin Addresses
  Gets a List of Users Exchange Bitcoin Deposit Addresses."
  ([authorization ] (v1userexchangebankcoinaddresses authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoinaddresses-with-http-info authorization optional-params))))

(defn v1userexchangebankcoinbalanceavailable-with-http-info
  "Available Exchange Coin Balance
  Returns balance which is in Available for Trades. The response is in satoshis."
  ([authorization ] (v1userexchangebankcoinbalanceavailable-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bank/coin/balance/total" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinbalanceavailable
  "Available Exchange Coin Balance
  Returns balance which is in Available for Trades. The response is in satoshis."
  ([authorization ] (v1userexchangebankcoinbalanceavailable authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoinbalanceavailable-with-http-info authorization optional-params))))

(defn v1userexchangebankcoinbalancepending-with-http-info
  "In Trade Coin Balance
  Returns in-trade or pending coin balance in satoshi."
  ([authorization ] (v1userexchangebankcoinbalancepending-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bank/coin/balance/pending" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinbalancepending
  "In Trade Coin Balance
  Returns in-trade or pending coin balance in satoshi."
  ([authorization ] (v1userexchangebankcoinbalancepending authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoinbalancepending-with-http-info authorization optional-params))))

(defn v1userexchangebankcoinbalancetotal-with-http-info
  "Total Exchange Coin Balance
  Returns users total coin balance in satoshis. Pending + Available"
  ([authorization ] (v1userexchangebankcoinbalancetotal-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bank/coin/balance/available" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinbalancetotal
  "Total Exchange Coin Balance
  Returns users total coin balance in satoshis. Pending + Available"
  ([authorization ] (v1userexchangebankcoinbalancetotal authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoinbalancetotal-with-http-info authorization optional-params))))

(defn v1userexchangebankcoindepositcancelled-with-http-info
  "Cancelled Exchange Coin Deposits
  Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankcoindepositcancelled-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/coin/deposit/cancelled" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoindepositcancelled
  "Cancelled Exchange Coin Deposits
  Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankcoindepositcancelled authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoindepositcancelled-with-http-info authorization optional-params))))

(defn v1userexchangebankcoindepositunverified-with-http-info
  "Unverified Exchange Coin Deposits
  Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankcoindepositunverified-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/coin/deposit/unverified" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoindepositunverified
  "Unverified Exchange Coin Deposits
  Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankcoindepositunverified authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoindepositunverified-with-http-info authorization optional-params))))

(defn v1userexchangebankcoindepositverified-with-http-info
  "Verified Exchange Coin Deposits
  Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankcoindepositverified-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/coin/deposit/verified" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoindepositverified
  "Verified Exchange Coin Deposits
  Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankcoindepositverified authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoindepositverified-with-http-info authorization optional-params))))

(defn v1userexchangebankcoinwithdrawcancelled-with-http-info
  "Cancelled Exchange Coin Withdrawals
  Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1userexchangebankcoinwithdrawcancelled-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/coin/withdraw/cancelled" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinwithdrawcancelled
  "Cancelled Exchange Coin Withdrawals
  Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1userexchangebankcoinwithdrawcancelled authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoinwithdrawcancelled-with-http-info authorization optional-params))))

(defn v1userexchangebankcoinwithdrawcompleted-with-http-info
  "Completed Exchange Coin Withdrawals
  Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1userexchangebankcoinwithdrawcompleted-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/coin/withdraw/completed" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinwithdrawcompleted
  "Completed Exchange Coin Withdrawals
  Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1userexchangebankcoinwithdrawcompleted authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoinwithdrawcompleted-with-http-info authorization optional-params))))

(defn v1userexchangebankcoinwithdrawunverified-with-http-info
  "Unverified Exchange Coin Withdrawals
  Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1userexchangebankcoinwithdrawunverified-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/coin/withdraw/unverified" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinwithdrawunverified
  "Unverified Exchange Coin Withdrawals
  Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1userexchangebankcoinwithdrawunverified authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoinwithdrawunverified-with-http-info authorization optional-params))))

(defn v1userexchangebankcoinwithdrawverified-with-http-info
  "Verified Exchange Coin Withdrawals
  Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1userexchangebankcoinwithdrawverified-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/coin/withdraw/verified" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankcoinwithdrawverified
  "Verified Exchange Coin Withdrawals
  Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis."
  ([authorization ] (v1userexchangebankcoinwithdrawverified authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankcoinwithdrawverified-with-http-info authorization optional-params))))

