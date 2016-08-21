package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FailResult
import io.swagger.model.LoginFormNew
import io.swagger.model.StandardLoginResultData
import io.swagger.model.LoginId
import io.swagger.model.StandardInitiateLoginResultData
import io.swagger.model.Email
import io.swagger.model.SuccessResult
import io.swagger.model.SignupForm
import io.swagger.model.File
import io.swagger.model.NetkiNameAddress
import io.swagger.model.Address
import io.swagger.model.NumberOtp

import java.util.*;

@Mixin(ApiUtils)
class AccountActionsApi {
    String basePath = "https://api.coinsecure.in"
    String versionPath = "/api/v1"

    def v1login ( LoginFormNew body, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/login"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    StandardLoginResultData.class )
                    
    }
    def v1logininitiate ( LoginId body, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/login/initiate"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    StandardInitiateLoginResultData.class )
                    
    }
    def v1loginpasswordforgot ( Email body, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/login/password/forgot"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    SuccessResult.class )
                    
    }
    def v1signup ( SignupForm body, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/signup"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    SuccessResult.class )
                    
    }
    def v1userbankotpNumber ( String number, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/bank/otp/{number}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (number == null) {
            throw new RuntimeException("missing required params number")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    StandardInitiateLoginResultData.class )
                    
    }
    def v1userexchangekyc ( String panNumber, String acctNick, String name, String ban, String ifsc, String acctType, String banType, String phone, String otp, File file, String authorization, String message, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/kyc"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (panNumber == null) {
            throw new RuntimeException("missing required params panNumber")
        }
        // verify required params are set
        if (acctNick == null) {
            throw new RuntimeException("missing required params acctNick")
        }
        // verify required params are set
        if (name == null) {
            throw new RuntimeException("missing required params name")
        }
        // verify required params are set
        if (ban == null) {
            throw new RuntimeException("missing required params ban")
        }
        // verify required params are set
        if (ifsc == null) {
            throw new RuntimeException("missing required params ifsc")
        }
        // verify required params are set
        if (acctType == null) {
            throw new RuntimeException("missing required params acctType")
        }
        // verify required params are set
        if (banType == null) {
            throw new RuntimeException("missing required params banType")
        }
        // verify required params are set
        if (phone == null) {
            throw new RuntimeException("missing required params phone")
        }
        // verify required params are set
        if (otp == null) {
            throw new RuntimeException("missing required params otp")
        }
        // verify required params are set
        if (file == null) {
            throw new RuntimeException("missing required params file")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    SuccessResult.class )
                    
    }
    def v1usergcmCode ( String code, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/gcm/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SuccessResult.class )
                    
    }
    def v1userkycotpNumber ( String number, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/kyc/otp/{number}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (number == null) {
            throw new RuntimeException("missing required params number")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    SuccessResult.class )
                    
    }
    def v1userlogout ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/logout"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SuccessResult.class )
                    
    }
    def v1usernetkicreate ( NetkiNameAddress body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/netki/create"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    SuccessResult.class )
                    
    }
    def v1usernetkiupdate ( Address body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/netki/update"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    SuccessResult.class )
                    
    }
    def v1userprofileimagedeleteNetkiName ( String netkiName, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/profile/image/delete/{netkiName}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (netkiName == null) {
            throw new RuntimeException("missing required params netkiName")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SuccessResult.class )
                    
    }
    def v1userprofileimageupdate ( String netkiName, Boolean isPublic, File file, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/profile/image/update"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (netkiName == null) {
            throw new RuntimeException("missing required params netkiName")
        }
        // verify required params are set
        if (isPublic == null) {
            throw new RuntimeException("missing required params isPublic")
        }
        // verify required params are set
        if (file == null) {
            throw new RuntimeException("missing required params file")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    SuccessResult.class )
                    
    }
    def v1userprofilephone ( NumberOtp body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/profile/phone/new"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    SuccessResult.class )
                    
    }
    def v1userprofilephoneNumber ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/profile/phone/delete"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SuccessResult.class )
                    
    }
    def v1userprofilephoneotpNumber ( String number, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/profile/phone/otp/{number}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (number == null) {
            throw new RuntimeException("missing required params number")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    SuccessResult.class )
                    
    }
}
