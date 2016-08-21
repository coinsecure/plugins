package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FailResult
import io.swagger.model.BankSummaryDataResponse
import io.swagger.model.DoubleDataResponse
import io.swagger.model.KYCDataResponse
import io.swagger.model.SuccCoinRefDataResponse
import io.swagger.model.SuccRefDataResponse
import io.swagger.model.AllRefDataResponse
import io.swagger.model.TradeSummaryDataResponse
import io.swagger.model.SuccessResult
import io.swagger.model.UserSummaryDataResponse
import io.swagger.model.WalletSummaryDataResponse

import java.util.*;

@Mixin(ApiUtils)
class AccountDataApi {
    String basePath = "https://api.coinsecure.in"
    String versionPath = "/api/v1"

    def v1exchangebanksummary ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/summary"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    BankSummaryDataResponse.class )
                    
    }
    def v1exchangeusercoinfee ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/coin/fee"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DoubleDataResponse.class )
                    
    }
    def v1exchangeuserfiatfee ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/fiat/fee"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DoubleDataResponse.class )
                    
    }
    def v1netkisearchNetkiName ( String netkiName, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/netki/search/{netkiName}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (netkiName == null) {
            throw new RuntimeException("missing required params netkiName")
        }

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DoubleDataResponse.class )
                    
    }
    def v1userexchangekycs ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/kycs"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    KYCDataResponse.class )
                    
    }
    def v1userexchangereferralcoinpaid ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/referral/coin/paid"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    SuccCoinRefDataResponse.class )
                    
    }
    def v1userexchangereferralcoinsuccessful ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/referral/coin/successful"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    SuccRefDataResponse.class )
                    
    }
    def v1userexchangereferralfiatpaid ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/referral/fiat/paid"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    SuccCoinRefDataResponse.class )
                    
    }
    def v1userexchangereferrals ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/referrals"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    AllRefDataResponse.class )
                    
    }
    def v1userexchangetradesummary ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/trade/summary"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TradeSummaryDataResponse.class )
                    
    }
    def v1userlogintokenToken ( String token, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/login/token/{token}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (token == null) {
            throw new RuntimeException("missing required params token")
        }

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    SuccessResult.class )
                    
    }
    def v1usersummary ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/summary"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    UserSummaryDataResponse.class )
                    
    }
    def v1userwalletsummary ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/summary"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    WalletSummaryDataResponse.class )
                    
    }
}
