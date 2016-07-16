(ns coinsecure-api-documentation.api.blockchain-tools
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1bitcoinsearch-address-with-http-info
  "Search Bitcoin Blockchain
  Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID."
  ([any ] (v1bitcoinsearch-address-with-http-info any nil))
  ([any {:keys [accept ]}]
   (call-api "/v1/bitcoin/search/{any}" :get
             {:path-params   {"any" any }
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1bitcoinsearch-address
  "Search Bitcoin Blockchain
  Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID."
  ([any ] (v1bitcoinsearch-address any nil))
  ([any optional-params]
   (:data (v1bitcoinsearch-address-with-http-info any optional-params))))

(defn v1bitcoinsearch-txid-with-http-info
  "Get Confirmations
  Searches for a Number of Confirmations on a transaction ID."
  ([txid ] (v1bitcoinsearch-txid-with-http-info txid nil))
  ([txid {:keys [accept ]}]
   (call-api "/v1/bitcoin/search/confirmation/{txid}" :get
             {:path-params   {"txid" txid }
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1bitcoinsearch-txid
  "Get Confirmations
  Searches for a Number of Confirmations on a transaction ID."
  ([txid ] (v1bitcoinsearch-txid txid nil))
  ([txid optional-params]
   (:data (v1bitcoinsearch-txid-with-http-info txid optional-params))))

