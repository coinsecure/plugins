package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.RateDataResponse
import io.swagger.model.FailResult
import io.swagger.model.RateVolDataResponse
import io.swagger.model.LastTradeDataResponse
import io.swagger.model.RateDiffDataResponse
import io.swagger.model.StandardTickerResultData
import io.swagger.model.OrderDataResponse

import java.util.*;

@Mixin(ApiUtils)
class ExchangeTradeDataApi {
    String basePath = "https://api.coinsecure.in/"
    String versionPath = "/api/v1"

    def v1exchangeasklow ( String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/exchange/ask/low"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RateDataResponse.class )
                    
    }
    def v1exchangeaskorders ( String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/exchange/ask/orders"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RateVolDataResponse.class )
                    
    }
    def v1exchangebidhigh ( String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/exchange/bid/high"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RateDataResponse.class )
                    
    }
    def v1exchangebidorders ( String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/exchange/bid/orders"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RateVolDataResponse.class )
                    
    }
    def v1exchangelastTrade ( String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/exchange/lastTrade"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    LastTradeDataResponse.class )
                    
    }
    def v1exchangemax24Hr ( String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/exchange/max24Hr"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RateDiffDataResponse.class )
                    
    }
    def v1exchangemin24Hr ( String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/exchange/min24Hr"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RateDiffDataResponse.class )
                    
    }
    def v1exchangeticker ( String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/exchange/ticker"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    StandardTickerResultData.class )
                    
    }
    def v1userexchangeaskcancelled ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/ask/cancelled"

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
                    OrderDataResponse.class )
                    
    }
    def v1userexchangeaskcompleted ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/ask/completed"

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
                    OrderDataResponse.class )
                    
    }
    def v1userexchangeaskpending ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/ask/pending"

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
                    OrderDataResponse.class )
                    
    }
    def v1userexchangebidcancelled ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bid/cancelled"

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
                    OrderDataResponse.class )
                    
    }
    def v1userexchangebidcompleted ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bid/completed"

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
                    OrderDataResponse.class )
                    
    }
    def v1userexchangebidpending ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bid/pending"

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
                    OrderDataResponse.class )
                    
    }
}
