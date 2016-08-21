package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FailResult
import io.swagger.model.ValidAddressSearchDataResponse
import io.swagger.model.ConfirmDataResponse

import java.util.*;

@Mixin(ApiUtils)
class BlockchainToolsApi {
    String basePath = "https://api.coinsecure.in"
    String versionPath = "/api/v1"

    def v1bitcoinsearchAddress ( String any, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/bitcoin/search/{any}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (any == null) {
            throw new RuntimeException("missing required params any")
        }

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ValidAddressSearchDataResponse.class )
                    
    }
    def v1bitcoinsearchTxid ( String txid, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/bitcoin/search/confirmation/{txid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (txid == null) {
            throw new RuntimeException("missing required params txid")
        }

        
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ConfirmDataResponse.class )
                    
    }
}
