(ns coinsecure-api-documentation.api.exchange-trade-actions
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1userexchangeaskcancel-with-http-info
  "Cancel Open Sell Order
  Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state."
  ([body ] (v1userexchangeaskcancel-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/ask/cancel" :delete
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangeaskcancel
  "Cancel Open Sell Order
  Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state."
  ([body ] (v1userexchangeaskcancel body nil))
  ([body optional-params]
   (:data (v1userexchangeaskcancel-with-http-info body optional-params))))

(defn v1userexchangeasknew-with-http-info
  "BTC Sell Order
  Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order."
  ([body ] (v1userexchangeasknew-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/ask/new" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangeasknew
  "BTC Sell Order
  Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order."
  ([body ] (v1userexchangeasknew body nil))
  ([body optional-params]
   (:data (v1userexchangeasknew-with-http-info body optional-params))))

(defn v1userexchangebidcancel-with-http-info
  "Cancel Open Buy Order
  Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state."
  ([body ] (v1userexchangebidcancel-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bid/cancel" :delete
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebidcancel
  "Cancel Open Buy Order
  Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state."
  ([body ] (v1userexchangebidcancel body nil))
  ([body optional-params]
   (:data (v1userexchangebidcancel-with-http-info body optional-params))))

(defn v1userexchangebidnew-with-http-info
  "BTC Buy Order
  Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order."
  ([body ] (v1userexchangebidnew-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/bid/new" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangebidnew
  "BTC Buy Order
  Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order."
  ([body ] (v1userexchangebidnew body nil))
  ([body optional-params]
   (:data (v1userexchangebidnew-with-http-info body optional-params))))

(defn v1userexchangeinstantbuy-with-http-info
  "Instantly Buy BTC
  Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below."
  ([body ] (v1userexchangeinstantbuy-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/instant/buy" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangeinstantbuy
  "Instantly Buy BTC
  Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below."
  ([body ] (v1userexchangeinstantbuy body nil))
  ([body optional-params]
   (:data (v1userexchangeinstantbuy-with-http-info body optional-params))))

(defn v1userexchangeinstantsell-with-http-info
  "Instantly Sell BTC
  Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below."
  ([body ] (v1userexchangeinstantsell-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/instant/sell" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangeinstantsell
  "Instantly Sell BTC
  Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below."
  ([body ] (v1userexchangeinstantsell body nil))
  ([body optional-params]
   (:data (v1userexchangeinstantsell-with-http-info body optional-params))))

