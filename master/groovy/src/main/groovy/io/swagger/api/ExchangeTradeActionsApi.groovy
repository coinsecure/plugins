package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FailResult
import io.swagger.model.SuccessCancelDataResponse
import io.swagger.model.SuccessOrderDataResponse
import io.swagger.model.RateVolData
import io.swagger.model.MinFiat
import io.swagger.model.MaxVol

import java.util.*;

@Mixin(ApiUtils)
class ExchangeTradeActionsApi {
    String basePath = "https://api.coinsecure.in/"
    String versionPath = "/api/v1"

    def v1userexchangeaskcancelOrderID ( String orderID, String authorization, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/ask/cancel/{orderID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SuccessCancelDataResponse.class )
                    
    }
    def v1userexchangeasknew ( RateVolData body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/ask/new"

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
                    SuccessOrderDataResponse.class )
                    
    }
    def v1userexchangebidcancelOrderID ( String orderID, String authorization, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bid/cancel/{orderID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (orderID == null) {
            throw new RuntimeException("missing required params orderID")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SuccessCancelDataResponse.class )
                    
    }
    def v1userexchangebidnew ( RateVolData body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bid/new"

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
                    SuccessOrderDataResponse.class )
                    
    }
    def v1userexchangeinstantbuy ( MinFiat body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/instant/buy"

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
                    SuccessOrderDataResponse.class )
                    
    }
    def v1userexchangeinstantsell ( MaxVol body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/instant/sell"

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
                    SuccessOrderDataResponse.class )
                    
    }
}
