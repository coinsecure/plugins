(ns coinsecure-api-documentation.api.account-data
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1exchangebanksummary-with-http-info
  "Exchange Bank Summary
  Gets a Summary of Exchange Bank Data and Balances."
  ([authorization ] (v1exchangebanksummary-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/bank/summary" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangebanksummary
  "Exchange Bank Summary
  Gets a Summary of Exchange Bank Data and Balances."
  ([authorization ] (v1exchangebanksummary authorization nil))
  ([authorization optional-params]
   (:data (v1exchangebanksummary-with-http-info authorization optional-params))))

(defn v1exchangeusercoinfee-with-http-info
  "Users Coin Fee Percentage
  Returns the users coin fee percentage. The response is in percentage."
  ([] (v1exchangeusercoinfee-with-http-info nil))
  ([{:keys [authorization accept ]}]
   (call-api "/v1/user/exchange/coin/fee" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangeusercoinfee
  "Users Coin Fee Percentage
  Returns the users coin fee percentage. The response is in percentage."
  ([] (v1exchangeusercoinfee nil))
  ([optional-params]
   (:data (v1exchangeusercoinfee-with-http-info optional-params))))

(defn v1exchangeuserfiatfee-with-http-info
  "Users Fiat Fee Percentage
  Returns the users fiat fee percentage. The response is in percentage."
  ([authorization ] (v1exchangeuserfiatfee-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/fiat/fee" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1exchangeuserfiatfee
  "Users Fiat Fee Percentage
  Returns the users fiat fee percentage. The response is in percentage."
  ([authorization ] (v1exchangeuserfiatfee authorization nil))
  ([authorization optional-params]
   (:data (v1exchangeuserfiatfee-with-http-info authorization optional-params))))

(defn v1netkisearch-netki-name-with-http-info
  "Coinsecure.me Netki Lookup
  Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output."
  ([netki-name ] (v1netkisearch-netki-name-with-http-info netki-name nil))
  ([netki-name {:keys [accept ]}]
   (call-api "/v1/netki/search/{netkiName}" :get
             {:path-params   {"netkiName" netki-name }
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1netkisearch-netki-name
  "Coinsecure.me Netki Lookup
  Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output."
  ([netki-name ] (v1netkisearch-netki-name netki-name nil))
  ([netki-name optional-params]
   (:data (v1netkisearch-netki-name-with-http-info netki-name optional-params))))

(defn v1userexchangekycs-with-http-info
  "Gets KYC Status Details
  Gets Users KYC Status Details."
  ([authorization ] (v1userexchangekycs-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/kycs" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangekycs
  "Gets KYC Status Details
  Gets Users KYC Status Details."
  ([authorization ] (v1userexchangekycs authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangekycs-with-http-info authorization optional-params))))

(defn v1userexchangereferralcoinpaid-with-http-info
  "Users Paid Fiat Referrals
  Returns the Users Paid Coin Referrals."
  ([authorization ] (v1userexchangereferralcoinpaid-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/referral/coin/paid" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangereferralcoinpaid
  "Users Paid Fiat Referrals
  Returns the Users Paid Coin Referrals."
  ([authorization ] (v1userexchangereferralcoinpaid authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangereferralcoinpaid-with-http-info authorization optional-params))))

(defn v1userexchangereferralcoinsuccessful-with-http-info
  "Gets Users Successful Referral Links
  Gets Users Successful Referral Links that can be used during signup."
  ([authorization ] (v1userexchangereferralcoinsuccessful-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/referral/coin/successful" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangereferralcoinsuccessful
  "Gets Users Successful Referral Links
  Gets Users Successful Referral Links that can be used during signup."
  ([authorization ] (v1userexchangereferralcoinsuccessful authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangereferralcoinsuccessful-with-http-info authorization optional-params))))

(defn v1userexchangereferralfiatpaid-with-http-info
  "Users Paid Fiat Referrals
  Returns the Users Paid Fiat Referrals."
  ([authorization ] (v1userexchangereferralfiatpaid-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/referral/fiat/paid" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangereferralfiatpaid
  "Users Paid Fiat Referrals
  Returns the Users Paid Fiat Referrals."
  ([authorization ] (v1userexchangereferralfiatpaid authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangereferralfiatpaid-with-http-info authorization optional-params))))

(defn v1userexchangereferrals-with-http-info
  "Gets Users Referral Links
  Gets Users Referral Links that can be used during signup."
  ([authorization ] (v1userexchangereferrals-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/referrals" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangereferrals
  "Gets Users Referral Links
  Gets Users Referral Links that can be used during signup."
  ([authorization ] (v1userexchangereferrals authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangereferrals-with-http-info authorization optional-params))))

(defn v1userexchangetradesummary-with-http-info
  "Exchange Trade Summary
  Gets a Summary of Exchange Trade Data."
  ([authorization ] (v1userexchangetradesummary-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/exchange/trade/summary" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangetradesummary
  "Exchange Trade Summary
  Gets a Summary of Exchange Trade Data."
  ([authorization ] (v1userexchangetradesummary authorization nil))
  ([authorization optional-params]
   (:data (v1userexchangetradesummary-with-http-info authorization optional-params))))

(defn v1userlogintoken-token-with-http-info
  "Login Token Email
  Retrieves details of a Login Token"
  ([token ] (v1userlogintoken-token-with-http-info token nil))
  ([token {:keys [accept ]}]
   (call-api "/v1/user/login/token/{token}" :get
             {:path-params   {"token" token }
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userlogintoken-token
  "Login Token Email
  Retrieves details of a Login Token"
  ([token ] (v1userlogintoken-token token nil))
  ([token optional-params]
   (:data (v1userlogintoken-token-with-http-info token optional-params))))

(defn v1usersummary-with-http-info
  "Exchange Bank Summary
  Gets a Summary of Exchange Bank Data and Balances."
  ([authorization ] (v1usersummary-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/summary" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1usersummary
  "Exchange Bank Summary
  Gets a Summary of Exchange Bank Data and Balances."
  ([authorization ] (v1usersummary authorization nil))
  ([authorization optional-params]
   (:data (v1usersummary-with-http-info authorization optional-params))))

(defn v1userwalletsummary-with-http-info
  "Exchange Bank Summary
  Gets a Summary of Exchange Bank Data and Balances."
  ([authorization ] (v1userwalletsummary-with-http-info authorization nil))
  ([authorization {:keys [accept ]}]
   (call-api "/v1/user/wallet/summary" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userwalletsummary
  "Exchange Bank Summary
  Gets a Summary of Exchange Bank Data and Balances."
  ([authorization ] (v1userwalletsummary authorization nil))
  ([authorization optional-params]
   (:data (v1userwalletsummary-with-http-info authorization optional-params))))

