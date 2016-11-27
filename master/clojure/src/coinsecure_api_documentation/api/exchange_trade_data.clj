(ns coinsecure-api-documentation.api.exchange-trade-data
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1exchangeasklow-with-http-info
  "Lowest Ask
  Returns the Lowest Ask Rate in Json. The Amount is in Paisa."
  ([] (v1exchangeasklow-with-http-info nil))
  ([{:keys [accept ]}]
   (call-api "/v1/exchange/ask/low" :get
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangeasklow
  "Lowest Ask
  Returns the Lowest Ask Rate in Json. The Amount is in Paisa."
  ([] (v1exchangeasklow nil))
  ([optional-params]
   (:data (v1exchangeasklow-with-http-info optional-params))))

(defn v1exchangeaskorders-with-http-info
  "All Sell Orders
  Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([] (v1exchangeaskorders-with-http-info nil))
  ([{:keys [accept ]}]
   (call-api "/v1/exchange/ask/orders" :get
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangeaskorders
  "All Sell Orders
  Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([] (v1exchangeaskorders nil))
  ([optional-params]
   (:data (v1exchangeaskorders-with-http-info optional-params))))

(defn v1exchangebidhigh-with-http-info
  "Returns the Highest Bid in the Order Book
  Highest Bid."
  ([] (v1exchangebidhigh-with-http-info nil))
  ([{:keys [accept ]}]
   (call-api "/v1/exchange/bid/high" :get
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangebidhigh
  "Returns the Highest Bid in the Order Book
  Highest Bid."
  ([] (v1exchangebidhigh nil))
  ([optional-params]
   (:data (v1exchangebidhigh-with-http-info optional-params))))

(defn v1exchangebidorders-with-http-info
  "All Buy Orders
  Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([] (v1exchangebidorders-with-http-info nil))
  ([{:keys [accept ]}]
   (call-api "/v1/exchange/bid/orders" :get
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangebidorders
  "All Buy Orders
  Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([] (v1exchangebidorders nil))
  ([optional-params]
   (:data (v1exchangebidorders-with-http-info optional-params))))

(defn v1exchangelast-trade-with-http-info
  "Last Trade
  Returns a summary of data from the Exchange."
  ([] (v1exchangelast-trade-with-http-info nil))
  ([{:keys [accept ]}]
   (call-api "/v1/exchange/lastTrade" :get
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangelast-trade
  "Last Trade
  Returns a summary of data from the Exchange."
  ([] (v1exchangelast-trade nil))
  ([optional-params]
   (:data (v1exchangelast-trade-with-http-info optional-params))))

(defn v1exchangemax24-hr-with-http-info
  "Max 24 Hour Rate
  Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa."
  ([] (v1exchangemax24-hr-with-http-info nil))
  ([{:keys [accept ]}]
   (call-api "/v1/exchange/max24Hr" :get
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangemax24-hr
  "Max 24 Hour Rate
  Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa."
  ([] (v1exchangemax24-hr nil))
  ([optional-params]
   (:data (v1exchangemax24-hr-with-http-info optional-params))))

(defn v1exchangemin24-hr-with-http-info
  "Min 24 Hour Rate
  Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa."
  ([] (v1exchangemin24-hr-with-http-info nil))
  ([{:keys [accept ]}]
   (call-api "/v1/exchange/min24Hr" :get
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangemin24-hr
  "Min 24 Hour Rate
  Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa."
  ([] (v1exchangemin24-hr nil))
  ([optional-params]
   (:data (v1exchangemin24-hr-with-http-info optional-params))))

(defn v1exchangeticker-with-http-info
  "Exchange Ticker
  Returns a summary of data from the Exchange."
  ([] (v1exchangeticker-with-http-info nil))
  ([{:keys [accept ]}]
   (call-api "/v1/exchange/ticker" :get
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangeticker
  "Exchange Ticker
  Returns a summary of data from the Exchange."
  ([] (v1exchangeticker nil))
  ([optional-params]
   (:data (v1exchangeticker-with-http-info optional-params))))

(defn v1userexchangeaskcancelled-with-http-info
  "Cancelled User Sell Orders
  Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangeaskcancelled-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/ask/cancelled" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangeaskcancelled
  "Cancelled User Sell Orders
  Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangeaskcancelled authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangeaskcancelled-with-http-info authorization optional-params))))

(defn v1userexchangeaskcompleted-with-http-info
  "Completed User Sell Orders
  Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangeaskcompleted-with-http-info authorization nil))
  ([authorization {:keys [from to max offset accept ]}]
   (call-api "/v1/user/exchange/ask/completed" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangeaskcompleted
  "Completed User Sell Orders
  Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangeaskcompleted authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangeaskcompleted-with-http-info authorization optional-params))))

(defn v1userexchangeaskpending-with-http-info
  "Pending User Sell Orders
  Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangeaskpending-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/ask/pending" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangeaskpending
  "Pending User Sell Orders
  Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangeaskpending authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangeaskpending-with-http-info authorization optional-params))))

(defn v1userexchangebidcancelled-with-http-info
  "Cancelled User Buy Orders
  Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangebidcancelled-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bid/cancelled" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebidcancelled
  "Cancelled User Buy Orders
  Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangebidcancelled authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebidcancelled-with-http-info authorization optional-params))))

(defn v1userexchangebidcompleted-with-http-info
  "Completed User Buy Orders
  Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangebidcompleted-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bid/completed" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebidcompleted
  "Completed User Buy Orders
  Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangebidcompleted authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebidcompleted-with-http-info authorization optional-params))))

(defn v1userexchangebidpending-with-http-info
  "Pending User Buy Orders
  Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangebidpending-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bid/pending" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebidpending
  "Pending User Buy Orders
  Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([authorization ] (v1userexchangebidpending authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangebidpending-with-http-info authorization optional-params))))

(defn v1userexchangetrades-with-http-info
  "Completed Exchange Trades
  Returns all completed Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([] (v1userexchangetrades-with-http-info nil))
  ([{:keys [from to max offset accept ]}]
   (call-api "/v1/exchange/trades" :get
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {"from" from "to" to "max" max "offset" offset }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangetrades
  "Completed Exchange Trades
  Returns all completed Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis."
  ([] (v1userexchangetrades nil))
  ([optional-params]
   (:data (v1userexchangetrades-with-http-info optional-params))))

