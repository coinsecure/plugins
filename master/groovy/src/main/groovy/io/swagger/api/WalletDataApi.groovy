package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.WalletAddressDataResponse
import io.swagger.model.FailResult
import io.swagger.model.WalletsDataResponse
import io.swagger.model.WalletCoinWithdrawDataResponse

import java.util.*;

@Mixin(ApiUtils)
class WalletDataApi {
    String basePath = "https://api.coinsecure.in/"
    String versionPath = "/api/v1"

    def v1userwalletcoinaddressWalletID ( String walletID, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/address/{walletID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (walletID == null) {
            throw new RuntimeException("missing required params walletID")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    WalletAddressDataResponse.class )
                    
    }
    def v1userwalletcoindepositconfirmedWalletID ( String walletID, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/deposit/confirmed/{walletID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (walletID == null) {
            throw new RuntimeException("missing required params walletID")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    WalletAddressDataResponse.class )
                    
    }
    def v1userwalletcoindepositconfirmedall ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/deposit/confirmed/all"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    WalletAddressDataResponse.class )
                    
    }
    def v1userwalletcoindepositunconfirmedWalletID ( String walletID, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/deposit/unconfirmed/{walletID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (walletID == null) {
            throw new RuntimeException("missing required params walletID")
        }
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def v1userwalletcoindepositunconfirmedall ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/deposit/unconfirmed/all"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def v1userwalletcoinwallets ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/wallet/coin/wallets"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    WalletsDataResponse.class )
                    
    }
    def v1walletwithdrawcancelled ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/wallet/coin/withdraw/cancelled"

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
                    WalletCoinWithdrawDataResponse.class )
                    
    }
    def v1walletwithdrawcompleted ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/wallet/coin/withdraw/completed"

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
                    WalletCoinWithdrawDataResponse.class )
                    
    }
    def v1walletwithdrawunverified ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/wallet/coin/withdraw/unverified"

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
                    WalletCoinWithdrawDataResponse.class )
                    
    }
    def v1walletwithdrawverified ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/wallet/coin/withdraw/verified"

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
                    WalletCoinWithdrawDataResponse.class )
                    
    }
}
