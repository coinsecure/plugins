(ns coinsecure-api-documentation.api.security-actions
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1mfaauthyinitiate-with-http-info
  "Initiate Authy Registration.
  Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register."
  ([body ] (v1mfaauthyinitiate-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/mfa/authy/initiate" :post
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1mfaauthyinitiate
  "Initiate Authy Registration.
  Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register."
  ([body ] (v1mfaauthyinitiate body nil))
  ([body optional-params]
   (:data (v1mfaauthyinitiate-with-http-info body optional-params))))

(defn v1mfagainitiate-with-http-info
  "Initiate GA Registration.
  Returns the Google Authenticator Secret and a QR code URL."
  ([] (v1mfagainitiate-with-http-info nil))
  ([{:keys [authorization accept ]}]
   (call-api "/v1/mfa/ga/initiate" :post
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1mfagainitiate
  "Initiate GA Registration.
  Returns the Google Authenticator Secret and a QR code URL."
  ([] (v1mfagainitiate nil))
  ([optional-params]
   (:data (v1mfagainitiate-with-http-info optional-params))))

(defn v1usermfaauthycall-with-http-info
  "Authy Call Code
  Calls valid phone user with a code."
  ([] (v1usermfaauthycall-with-http-info nil))
  ([{:keys [authorization accept ]}]
   (call-api "/v1/mfa/authy/call" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1usermfaauthycall
  "Authy Call Code
  Calls valid phone user with a code."
  ([] (v1usermfaauthycall nil))
  ([optional-params]
   (:data (v1usermfaauthycall-with-http-info optional-params))))

(defn v1usermfaauthydisable-code-with-http-info
  "Disable Authy
  Disables users Authy"
  ([code ] (v1usermfaauthydisable-code-with-http-info code nil))
  ([code {:keys [authorization accept ]}]
   (call-api "/v1/user/mfa/authy/disable/{code}" :delete
             {:path-params   {"code" code }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1usermfaauthydisable-code
  "Disable Authy
  Disables users Authy"
  ([code ] (v1usermfaauthydisable-code code nil))
  ([code optional-params]
   (:data (v1usermfaauthydisable-code-with-http-info code optional-params))))

(defn v1usermfaauthyinitiateenable-with-http-info
  "Verify Authy Registration
  Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate."
  ([body ] (v1usermfaauthyinitiateenable-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/mfa/authy/initiate/enable" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1usermfaauthyinitiateenable
  "Verify Authy Registration
  Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate."
  ([body ] (v1usermfaauthyinitiateenable body nil))
  ([body optional-params]
   (:data (v1usermfaauthyinitiateenable-with-http-info body optional-params))))

(defn v1usermfaauthysms-with-http-info
  "Authy Sms Code
  Disables users Authy"
  ([] (v1usermfaauthysms-with-http-info nil))
  ([{:keys [authorization accept ]}]
   (call-api "/v1/mfa/authy/sms" :get
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1usermfaauthysms
  "Authy Sms Code
  Disables users Authy"
  ([] (v1usermfaauthysms nil))
  ([optional-params]
   (:data (v1usermfaauthysms-with-http-info optional-params))))

(defn v1usermfagadisable-code-with-http-info
  "Disable Google Authenticator
  Disables users Google Authenticator 2FA"
  ([code ] (v1usermfagadisable-code-with-http-info code nil))
  ([code {:keys [authorization accept ]}]
   (call-api "/v1/user/mfa/ga/disable/{code}" :delete
             {:path-params   {"code" code }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1usermfagadisable-code
  "Disable Google Authenticator
  Disables users Google Authenticator 2FA"
  ([code ] (v1usermfagadisable-code code nil))
  ([code optional-params]
   (:data (v1usermfagadisable-code-with-http-info code optional-params))))

(defn v1usermfagainitiateenable-with-http-info
  "Enable Google Authenticator
  Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate."
  ([body ] (v1usermfagainitiateenable-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/mfa/ga/initiate/enable" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1usermfagainitiateenable
  "Enable Google Authenticator
  Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate."
  ([body ] (v1usermfagainitiateenable body nil))
  ([body optional-params]
   (:data (v1usermfagainitiateenable-with-http-info body optional-params))))

(defn v1userpasswordchange-with-http-info
  "Change Password.
  Changes an account Password."
  ([body ] (v1userpasswordchange-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/password/change" :post
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userpasswordchange
  "Change Password.
  Changes an account Password."
  ([body ] (v1userpasswordchange body nil))
  ([body optional-params]
   (:data (v1userpasswordchange-with-http-info body optional-params))))

(defn v1userpasswordreset-with-http-info
  "Reset Password.
  Resets an account Password. Use forgotPassword to generate a token."
  ([body ] (v1userpasswordreset-with-http-info body nil))
  ([body {:keys [accept ]}]
   (call-api "/v1/user/password/reset" :post
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userpasswordreset
  "Reset Password.
  Resets an account Password. Use forgotPassword to generate a token."
  ([body ] (v1userpasswordreset body nil))
  ([body optional-params]
   (:data (v1userpasswordreset-with-http-info body optional-params))))

