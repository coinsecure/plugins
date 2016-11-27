package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.SendCoin
import io.swagger.model.SuccessResult
import io.swagger.model.FailResult
import io.swagger.model.WithdrawID
import io.swagger.model.Code
import io.swagger.model.NewBankForm
import io.swagger.model.NewFiatBankDeposit
import io.swagger.model.WithdrawFiat

import java.util.*;

@Mixin(ApiUtils)
class ExchangeBankActionsApi {
    String basePath = "https://api.coinsecure.in/"
    String versionPath = "/api/v1"

    def v1userexchangebankcoinwithdrawinitiate ( SendCoin body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/withdraw/initiate"

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
    def v1userexchangebankcoinwithdrawnewVerifycode ( WithdrawID body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/withdraw/newVerifycode"

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
    def v1userexchangebankcoinwithdrawunverifiedcancelWithdrawID ( String withdrawID, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/withdraw/unverified/cancel/{withdrawID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (withdrawID == null) {
            throw new RuntimeException("missing required params withdrawID")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SuccessResult.class )
                    
    }
    def v1userexchangebankcoinwithdrawverify ( Code body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/coin/withdraw/verify"

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
    def v1userexchangebankfiataccountnew ( NewBankForm body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/account/new"

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
    def v1userexchangebankfiatdepositcancelDepositID ( String depositID, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/deposit/cancel/{depositID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (depositID == null) {
            throw new RuntimeException("missing required params depositID")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SuccessResult.class )
                    
    }
    def v1userexchangebankfiatdepositnew ( NewFiatBankDeposit body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/deposit/new"

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
    def v1userexchangebankfiatwithdrawinitiate ( WithdrawFiat body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/withdraw/initiate"

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
    def v1userexchangebankfiatwithdrawnewVerifycode ( WithdrawID body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/withdraw/newVerifycode"

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
    def v1userexchangebankfiatwithdrawunverifiedcancelWithdrawID ( String withdrawID, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/withdraw/unverified/cancel/{withdrawID}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (withdrawID == null) {
            throw new RuntimeException("missing required params withdrawID")
        }

        
        headerParams.put("authorization", authorization)
        headerParams.put("accept", accept)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SuccessResult.class )
                    
    }
    def v1userexchangebankfiatwithdrawverify ( Code body, String authorization, String accept, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/v1/user/exchange/bank/fiat/withdraw/verify"

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
}
