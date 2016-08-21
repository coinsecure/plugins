package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FiatBankDataResponse
import io.swagger.model.FailResult
import io.swagger.model.RateDataResponse
import io.swagger.model.FiatDepDataResponse
import io.swagger.model.FiatWithDataResponse

import java.util.*;

@Mixin(ApiUtils)
class ExchangeBankFiatDataApi {
    String basePath = "https://api.coinsecure.in"
    String versionPath = "/api/v1"

    def v1userexchangebankfiataccounts ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/accounts"

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
                    FiatBankDataResponse.class )
                    
    }
    def v1userexchangebankfiatbalanceavailable ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/balance/total"

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
                    RateDataResponse.class )
                    
    }
    def v1userexchangebankfiatbalancepending ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/balance/pending"

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
                    RateDataResponse.class )
                    
    }
    def v1userexchangebankfiatbalancetotal ( String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/balance/available"

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
                    RateDataResponse.class )
                    
    }
    def v1userexchangebankfiatdepositcancelled ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/deposit/cancelled"

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
                    FiatDepDataResponse.class )
                    
    }
    def v1userexchangebankfiatdepositunverified ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/deposit/unverified"

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
                    FiatDepDataResponse.class )
                    
    }
    def v1userexchangebankfiatdepositverified ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/deposit/verified"

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
                    FiatDepDataResponse.class )
                    
    }
    def v1userexchangebankfiatwithdrawcancelled ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/withdraw/cancelled"

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
                    FiatWithDataResponse.class )
                    
    }
    def v1userexchangebankfiatwithdrawcompleted ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/withdraw/completed"

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
                    FiatWithDataResponse.class )
                    
    }
    def v1userexchangebankfiatwithdrawunverified ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/withdraw/unverified"

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
                    FiatWithDataResponse.class )
                    
    }
    def v1userexchangebankfiatwithdrawverified ( String authorization, Long from, Long to, Integer max, Long offset, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/withdraw/verified"

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
                    FiatWithDataResponse.class )
                    
    }
}
