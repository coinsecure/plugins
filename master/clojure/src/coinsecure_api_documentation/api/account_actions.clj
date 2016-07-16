(ns coinsecure-api-documentation.api.account-actions
  (:require [coinsecure-api-documentation.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1login-with-http-info
  "Creates a Login Instance and returns an API Key.
  Creates a Login Instance and returns an API Key"
  ([body ] (v1login-with-http-info body nil))
  ([body {:keys [accept ]}]
   (call-api "/v1/login" :post
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1login
  "Creates a Login Instance and returns an API Key.
  Creates a Login Instance and returns an API Key"
  ([body ] (v1login body nil))
  ([body optional-params]
   (:data (v1login-with-http-info body optional-params))))

(defn v1logininitiate-with-http-info
  "Initiate Login
  Sends an Email with a Verification Link."
  ([body ] (v1logininitiate-with-http-info body nil))
  ([body {:keys [accept ]}]
   (call-api "/v1/login/initiate" :post
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1logininitiate
  "Initiate Login
  Sends an Email with a Verification Link."
  ([body ] (v1logininitiate body nil))
  ([body optional-params]
   (:data (v1logininitiate-with-http-info body optional-params))))

(defn v1loginpasswordforgot-with-http-info
  "Sends an email with a password reset token
  Sends an email with a password reset token"
  ([body ] (v1loginpasswordforgot-with-http-info body nil))
  ([body {:keys [accept ]}]
   (call-api "/v1/login/password/forgot" :post
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1loginpasswordforgot
  "Sends an email with a password reset token
  Sends an email with a password reset token"
  ([body ] (v1loginpasswordforgot body nil))
  ([body optional-params]
   (:data (v1loginpasswordforgot-with-http-info body optional-params))))

(defn v1signup-with-http-info
  "Creates a new Unverified Account.
  Creates a new Unverified Account."
  ([body ] (v1signup-with-http-info body nil))
  ([body {:keys [accept ]}]
   (call-api "/v1/signup" :post
             {:path-params   {}
              :header-params {"accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1signup
  "Creates a new Unverified Account.
  Creates a new Unverified Account."
  ([body ] (v1signup body nil))
  ([body optional-params]
   (:data (v1signup-with-http-info body optional-params))))

(defn v1userbankotp-number-with-http-info
  "Send OTP for Bank Link
  Send OTP for an additional Bank Link."
  ([number ] (v1userbankotp-number-with-http-info number nil))
  ([number {:keys [authorization accept ]}]
   (call-api "/v1/user/bank/otp/{number}" :get
             {:path-params   {"number" number }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userbankotp-number
  "Send OTP for Bank Link
  Send OTP for an additional Bank Link."
  ([number ] (v1userbankotp-number number nil))
  ([number optional-params]
   (:data (v1userbankotp-number-with-http-info number optional-params))))

(defn v1userexchangekyc-with-http-info
  "Submits a New Bank Link and initial KYC Documents.
  Submits a New Bank Link and initial KYC Documents."
  ([pan-number acct-nick name ban ifsc acct-type ban-type phone otp ^File file ] (v1userexchangekyc-with-http-info pan-number acct-nick name ban ifsc acct-type ban-type phone otp file nil))
  ([pan-number acct-nick name ban ifsc acct-type ban-type phone otp ^File file {:keys [authorization message accept ]}]
   (call-api "/v1/user/exchange/kyc" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {"panNumber" pan-number "acctNick" acct-nick "name" name "ban" ban "ifsc" ifsc "acctType" acct-type "message" message "banType" ban-type "phone" phone "otp" otp "file" file }
              :content-types ["multipart/form-data"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userexchangekyc
  "Submits a New Bank Link and initial KYC Documents.
  Submits a New Bank Link and initial KYC Documents."
  ([pan-number acct-nick name ban ifsc acct-type ban-type phone otp ^File file ] (v1userexchangekyc pan-number acct-nick name ban ifsc acct-type ban-type phone otp file nil))
  ([pan-number acct-nick name ban ifsc acct-type ban-type phone otp ^File file optional-params]
   (:data (v1userexchangekyc-with-http-info pan-number acct-nick name ban ifsc acct-type ban-type phone otp file optional-params))))

(defn v1usergcm-code-with-http-info
  "Delete GCM Code
  Delete GCM Code and associated API Key."
  ([code ] (v1usergcm-code-with-http-info code nil))
  ([code {:keys [authorization accept ]}]
   (call-api "/v1/user/gcm/{code}" :delete
             {:path-params   {"code" code }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1usergcm-code
  "Delete GCM Code
  Delete GCM Code and associated API Key."
  ([code ] (v1usergcm-code code nil))
  ([code optional-params]
   (:data (v1usergcm-code-with-http-info code optional-params))))

(defn v1userkycotp-number-with-http-info
  "Send OTP for KYC Link
  Send OTP for KYC Link."
  ([number ] (v1userkycotp-number-with-http-info number nil))
  ([number {:keys [authorization accept ]}]
   (call-api "/v1/user/kyc/otp/{number}" :get
             {:path-params   {"number" number }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userkycotp-number
  "Send OTP for KYC Link
  Send OTP for KYC Link."
  ([number ] (v1userkycotp-number number nil))
  ([number optional-params]
   (:data (v1userkycotp-number-with-http-info number optional-params))))

(defn v1userlogout-with-http-info
  "Logout User
  Logs out user and Deletes the api key and associated session data."
  ([] (v1userlogout-with-http-info nil))
  ([{:keys [authorization accept ]}]
   (call-api "/v1/user/logout" :delete
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userlogout
  "Logout User
  Logs out user and Deletes the api key and associated session data."
  ([] (v1userlogout nil))
  ([optional-params]
   (:data (v1userlogout-with-http-info optional-params))))

(defn v1usernetkicreate-with-http-info
  "Create Neki Wallet Name
  Creates a new Netki Wallet Name."
  ([body ] (v1usernetkicreate-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/netki/create" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1usernetkicreate
  "Create Neki Wallet Name
  Creates a new Netki Wallet Name."
  ([body ] (v1usernetkicreate body nil))
  ([body optional-params]
   (:data (v1usernetkicreate-with-http-info body optional-params))))

(defn v1usernetkiupdate-with-http-info
  "Update Netki Address
  Updates the address on an existing wallet name."
  ([body ] (v1usernetkiupdate-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/netki/update" :patch
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1usernetkiupdate
  "Update Netki Address
  Updates the address on an existing wallet name."
  ([body ] (v1usernetkiupdate body nil))
  ([body optional-params]
   (:data (v1usernetkiupdate-with-http-info body optional-params))))

(defn v1userprofileimagedelete-with-http-info
  "Delete Profile Image
  Deletes a profile Image."
  ([body ] (v1userprofileimagedelete-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/contact" :post
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userprofileimagedelete
  "Delete Profile Image
  Deletes a profile Image."
  ([body ] (v1userprofileimagedelete body nil))
  ([body optional-params]
   (:data (v1userprofileimagedelete-with-http-info body optional-params))))

(defn v1userprofileimageupdate-with-http-info
  "Update Profile Image
  Updates Profile Image and allows public or private options for netki profile page."
  ([netki-name is-public ^File file ] (v1userprofileimageupdate-with-http-info netki-name is-public file nil))
  ([netki-name is-public ^File file {:keys [authorization accept ]}]
   (call-api "/v1/user/profile/image/update" :patch
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {"netkiName" netki-name "isPublic" is-public "file" file }
              :content-types ["multipart/form-data"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userprofileimageupdate
  "Update Profile Image
  Updates Profile Image and allows public or private options for netki profile page."
  ([netki-name is-public ^File file ] (v1userprofileimageupdate netki-name is-public file nil))
  ([netki-name is-public ^File file optional-params]
   (:data (v1userprofileimageupdate-with-http-info netki-name is-public file optional-params))))

(defn v1userprofilephone-with-http-info
  "New Profile Phone
  Set a New Profile Phone Number."
  ([body ] (v1userprofilephone-with-http-info body nil))
  ([body {:keys [authorization accept ]}]
   (call-api "/v1/user/profile/phone/new" :put
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userprofilephone
  "New Profile Phone
  Set a New Profile Phone Number."
  ([body ] (v1userprofilephone body nil))
  ([body optional-params]
   (:data (v1userprofilephone-with-http-info body optional-params))))

(defn v1userprofilephone-number-with-http-info
  "Delete Profile Phone Number
  Delete Profile Phone Number."
  ([] (v1userprofilephone-number-with-http-info nil))
  ([{:keys [authorization accept ]}]
   (call-api "/v1/user/profile/phone/delete" :delete
             {:path-params   {}
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userprofilephone-number
  "Delete Profile Phone Number
  Delete Profile Phone Number."
  ([] (v1userprofilephone-number nil))
  ([optional-params]
   (:data (v1userprofilephone-number-with-http-info optional-params))))

(defn v1userprofilephoneotp-number-with-http-info
  "Send OTP for Profile Phone
  Send OTP for Profile Phone addition or updation."
  ([number ] (v1userprofilephoneotp-number-with-http-info number nil))
  ([number {:keys [authorization accept ]}]
   (call-api "/v1/user/profile/phone/otp/{number}" :get
             {:path-params   {"number" number }
              :header-params {"Authorization" authorization "accept" accept }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json" "application/xml" "application/csv"]
              :auth-names    []})))

(defn v1userprofilephoneotp-number
  "Send OTP for Profile Phone
  Send OTP for Profile Phone addition or updation."
  ([number ] (v1userprofilephoneotp-number number nil))
  ([number optional-params]
   (:data (v1userprofilephoneotp-number-with-http-info number optional-params))))

