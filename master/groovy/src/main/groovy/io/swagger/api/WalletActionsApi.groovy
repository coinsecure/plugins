package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.WalletAddressDataResponse
import io.swagger.model.NewAddress
import io.swagger.model.FailResult
import io.swagger.model.NewWallet
import io.swagger.model.SendCoinWallet
import io.swagger.model.SuccessResult
import io.swagger.model.SendExchange
import io.swagger.model.Code
import io.swagger.model.WithdrawID

import java.util.*;

@Mixin(ApiUtils)
class WalletActionsApi {
    String basePath = "https://api.coinsecure.in/"
    String versionPath = "/api/v1"

    def v1userwalletcoinaddressnew ( NewAddress body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/address/new"

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
                    WalletAddressDataResponse.class )
                    
    }
    def v1userwalletcoinnew ( NewWallet body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/new"

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
                    WalletAddressDataResponse.class )
                    
    }
    def v1userwalletcoinwithdrawinitiate ( SendCoinWallet body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/withdraw/initiate"

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
    def v1userwalletcoinwithdrawsendToExchange ( SendExchange body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/withdraw/sendToExchange"

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
    def v1userwalletcoinwithdrawunverifiedcancelWithdrawID ( String withdrawID, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/withdraw/unverified/cancel/{withdrawID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (withdrawID == null) {
            throw new RuntimeException("missing required params withdrawID")
        }
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SuccessResult.class )
                    
    }
    def v1userwalletcoinwithdrawverify ( String authorization, Code body, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/withdraw/verify"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }
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
    def v1walletcoinwithdrawnewVerifycode ( WithdrawID body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/wallet/coin/withdraw/newVerifycode"

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
}
