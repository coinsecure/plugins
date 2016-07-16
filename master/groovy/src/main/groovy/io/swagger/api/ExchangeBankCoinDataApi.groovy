package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.TradeAddressDataResponse
import io.swagger.model.FailResult
import io.swagger.model.VolDataResponse
import io.swagger.model.CoinDepDataResponse
import io.swagger.model.TradeCoinWithdrawDataResponse

import java.util.*;

@Mixin(ApiUtils)
class ExchangeBankCoinDataApi {
    String basePath = "https://api.coinsecure.in/"
    String versionPath = "/api/v1"

    def v1userexchangebankcoinaddresses ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/addresses"

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
                    TradeAddressDataResponse.class )
                    
    }
    def v1userexchangebankcoinbalanceavailable ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/balance/total"

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
                    VolDataResponse.class )
                    
    }
    def v1userexchangebankcoinbalancepending ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/balance/pending"

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
                    VolDataResponse.class )
                    
    }
    def v1userexchangebankcoinbalancetotal ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/balance/available"

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
                    VolDataResponse.class )
                    
    }
    def v1userexchangebankcoindepositcancelled ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/deposit/cancelled"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        if (!"null".equals(String.valueOf(from)))
            queryParams.put("from", String.valueOf(from))
if (!"null".equals(String.valueOf(to)))
            queryParams.put("to", String.valueOf(to))
if (!"null".equals(String.valueOf(max)))
            queryParams.put("max", String.valueOf(max))
if (!"null".equals(String.valueOf(offset)))
            queryParams.put("offset", String.valueOf(offset))

        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CoinDepDataResponse.class )
                    
    }
    def v1userexchangebankcoindepositunverified ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/deposit/unverified"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        if (!"null".equals(String.valueOf(from)))
            queryParams.put("from", String.valueOf(from))
if (!"null".equals(String.valueOf(to)))
            queryParams.put("to", String.valueOf(to))
if (!"null".equals(String.valueOf(max)))
            queryParams.put("max", String.valueOf(max))
if (!"null".equals(String.valueOf(offset)))
            queryParams.put("offset", String.valueOf(offset))

        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CoinDepDataResponse.class )
                    
    }
    def v1userexchangebankcoindepositverified ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/deposit/verified"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        if (!"null".equals(String.valueOf(from)))
            queryParams.put("from", String.valueOf(from))
if (!"null".equals(String.valueOf(to)))
            queryParams.put("to", String.valueOf(to))
if (!"null".equals(String.valueOf(max)))
            queryParams.put("max", String.valueOf(max))
if (!"null".equals(String.valueOf(offset)))
            queryParams.put("offset", String.valueOf(offset))

        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CoinDepDataResponse.class )
                    
    }
    def v1userexchangebankcoinwithdrawcancelled ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/withdraw/cancelled"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        if (!"null".equals(String.valueOf(from)))
            queryParams.put("from", String.valueOf(from))
if (!"null".equals(String.valueOf(to)))
            queryParams.put("to", String.valueOf(to))
if (!"null".equals(String.valueOf(max)))
            queryParams.put("max", String.valueOf(max))
if (!"null".equals(String.valueOf(offset)))
            queryParams.put("offset", String.valueOf(offset))

        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TradeCoinWithdrawDataResponse.class )
                    
    }
    def v1userexchangebankcoinwithdrawcompleted ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/withdraw/completed"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        if (!"null".equals(String.valueOf(from)))
            queryParams.put("from", String.valueOf(from))
if (!"null".equals(String.valueOf(to)))
            queryParams.put("to", String.valueOf(to))
if (!"null".equals(String.valueOf(max)))
            queryParams.put("max", String.valueOf(max))
if (!"null".equals(String.valueOf(offset)))
            queryParams.put("offset", String.valueOf(offset))

        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TradeCoinWithdrawDataResponse.class )
                    
    }
    def v1userexchangebankcoinwithdrawunverified ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/withdraw/unverified"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        if (!"null".equals(String.valueOf(from)))
            queryParams.put("from", String.valueOf(from))
if (!"null".equals(String.valueOf(to)))
            queryParams.put("to", String.valueOf(to))
if (!"null".equals(String.valueOf(max)))
            queryParams.put("max", String.valueOf(max))
if (!"null".equals(String.valueOf(offset)))
            queryParams.put("offset", String.valueOf(offset))

        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TradeCoinWithdrawDataResponse.class )
                    
    }
    def v1userexchangebankcoinwithdrawverified ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/withdraw/verified"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        if (!"null".equals(String.valueOf(from)))
            queryParams.put("from", String.valueOf(from))
if (!"null".equals(String.valueOf(to)))
            queryParams.put("to", String.valueOf(to))
if (!"null".equals(String.valueOf(max)))
            queryParams.put("max", String.valueOf(max))
if (!"null".equals(String.valueOf(offset)))
            queryParams.put("offset", String.valueOf(offset))

        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TradeCoinWithdrawDataResponse.class )
                    
    }
}
