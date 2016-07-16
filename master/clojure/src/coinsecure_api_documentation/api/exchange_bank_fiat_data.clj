(ns coinsecure-api-documentation.api.exchange-bank-fiat-data
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1userexchangebankfiataccounts-with-http-info
  "Exchange Bitcoin Deposit Addresses
  Gets a List of Users Exchange Bitcoin Addresses."
  ([authorization ] (v1userexchangebankfiataccounts-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/accounts" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiataccounts
  "Exchange Bitcoin Deposit Addresses
  Gets a List of Users Exchange Bitcoin Addresses."
  ([authorization ] (v1userexchangebankfiataccounts authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiataccounts-with-http-info authorization optional-params))))

(defn v1userexchangebankfiatbalanceavailable-with-http-info
  "Available Exchange Fiat Balance
  Returns balance which is in Available for Trades. The response is in paisa."
  ([authorization ] (v1userexchangebankfiatbalanceavailable-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/balance/total" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatbalanceavailable
  "Available Exchange Fiat Balance
  Returns balance which is in Available for Trades. The response is in paisa."
  ([authorization ] (v1userexchangebankfiatbalanceavailable authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiatbalanceavailable-with-http-info authorization optional-params))))

(defn v1userexchangebankfiatbalancepending-with-http-info
  "In Trade Coin Balance
  Returns in-trade or pending fiat balance in paisa."
  ([authorization ] (v1userexchangebankfiatbalancepending-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/balance/pending" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatbalancepending
  "In Trade Coin Balance
  Returns in-trade or pending fiat balance in paisa."
  ([authorization ] (v1userexchangebankfiatbalancepending authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiatbalancepending-with-http-info authorization optional-params))))

(defn v1userexchangebankfiatbalancetotal-with-http-info
  "Total Exchange Fiat Balance
  Returns users total fiat balance in paisa. Pending + Available"
  ([authorization ] (v1userexchangebankfiatbalancetotal-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/balance/available" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatbalancetotal
  "Total Exchange Fiat Balance
  Returns users total fiat balance in paisa. Pending + Available"
  ([authorization ] (v1userexchangebankfiatbalancetotal authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiatbalancetotal-with-http-info authorization optional-params))))

(defn v1userexchangebankfiatdepositcancelled-with-http-info
  "Cancelled Exchange Fiat Deposits
  Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankfiatdepositcancelled-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/deposit/cancelled" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatdepositcancelled
  "Cancelled Exchange Fiat Deposits
  Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankfiatdepositcancelled authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiatdepositcancelled-with-http-info authorization optional-params))))

(defn v1userexchangebankfiatdepositunverified-with-http-info
  "Unverified Exchange Fiat Deposits
  Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankfiatdepositunverified-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/deposit/unverified" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatdepositunverified
  "Unverified Exchange Fiat Deposits
  Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankfiatdepositunverified authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiatdepositunverified-with-http-info authorization optional-params))))

(defn v1userexchangebankfiatdepositverified-with-http-info
  "Verified Exchange Fiat Deposits
  Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankfiatdepositverified-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/deposit/verified" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatdepositverified
  "Verified Exchange Fiat Deposits
  Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa."
  ([authorization ] (v1userexchangebankfiatdepositverified authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiatdepositverified-with-http-info authorization optional-params))))

(defn v1userexchangebankfiatwithdrawcancelled-with-http-info
  "Cancelled Exchange Fiat Withdrawals
  Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa."
  ([authorization ] (v1userexchangebankfiatwithdrawcancelled-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/withdraw/cancelled" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatwithdrawcancelled
  "Cancelled Exchange Fiat Withdrawals
  Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa."
  ([authorization ] (v1userexchangebankfiatwithdrawcancelled authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiatwithdrawcancelled-with-http-info authorization optional-params))))

(defn v1userexchangebankfiatwithdrawcompleted-with-http-info
  "Completed Exchange Fiat Withdrawals
  Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa."
  ([authorization ] (v1userexchangebankfiatwithdrawcompleted-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/withdraw/completed" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatwithdrawcompleted
  "Completed Exchange Fiat Withdrawals
  Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa."
  ([authorization ] (v1userexchangebankfiatwithdrawcompleted authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiatwithdrawcompleted-with-http-info authorization optional-params))))

(defn v1userexchangebankfiatwithdrawunverified-with-http-info
  "Unverified Exchange Fiat Withdrawals
  Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa."
  ([authorization ] (v1userexchangebankfiatwithdrawunverified-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/withdraw/unverified" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatwithdrawunverified
  "Unverified Exchange Fiat Withdrawals
  Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa."
  ([authorization ] (v1userexchangebankfiatwithdrawunverified authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiatwithdrawunverified-with-http-info authorization optional-params))))

(defn v1userexchangebankfiatwithdrawverified-with-http-info
  "Verified Exchange Fiat Withdrawals
  Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa."
  ([authorization ] (v1userexchangebankfiatwithdrawverified-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/bank/fiat/withdraw/verified" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebankfiatwithdrawverified
  "Verified Exchange Fiat Withdrawals
  Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa."
  ([authorization ] (v1userexchangebankfiatwithdrawverified authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebankfiatwithdrawverified-with-http-info authorization optional-params))))

