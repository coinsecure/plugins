(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/WalletAddressDataResponse', 'model/NewAddress', 'model/FailResult', 'model/NewWallet', 'model/SendCoinWallet', 'model/SuccessResult', 'model/SendExchange', 'model/WithdrawID', 'model/Code'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/WalletAddressDataResponse'), require('../model/NewAddress'), require('../model/FailResult'), require('../model/NewWallet'), require('../model/SendCoinWallet'), require('../model/SuccessResult'), require('../model/SendExchange'), require('../model/WithdrawID'), require('../model/Code'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.WalletActionsApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.WalletAddressDataResponse, root.CoinsecureApiDocumentation.NewAddress, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.NewWallet, root.CoinsecureApiDocumentation.SendCoinWallet, root.CoinsecureApiDocumentation.SuccessResult, root.CoinsecureApiDocumentation.SendExchange, root.CoinsecureApiDocumentation.WithdrawID, root.CoinsecureApiDocumentation.Code);
  }
}(this, function(ApiClient, WalletAddressDataResponse, NewAddress, FailResult, NewWallet, SendCoinWallet, SuccessResult, SendExchange, WithdrawID, Code) {
  'use strict';

  /**
   * WalletActions service.
   * @module api/WalletActionsApi
   * @version 1.0b
   */

  /**
   * Constructs a new WalletActionsApi. 
   * @alias module:api/WalletActionsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1userwalletcoinaddressnew operation.
     * @callback module:api/WalletActionsApi~v1userwalletcoinaddressnewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletAddressDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * New Bitcoin Address
     * Generates a New Bitcoin Address to store coins.
     * @param {module:model/NewAddress} body 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletActionsApi~v1userwalletcoinaddressnewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletAddressDataResponse}
     */
    this.v1userwalletcoinaddressnew = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userwalletcoinaddressnew";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = WalletAddressDataResponse;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/address/new', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletcoinnew operation.
     * @callback module:api/WalletActionsApi~v1userwalletcoinnewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletAddressDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create New Wallet
     * Creates a New wallet to store addresses. This method also creates a single default address in each new wallet.
     * @param {module:model/NewWallet} body 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletActionsApi~v1userwalletcoinnewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletAddressDataResponse}
     */
    this.v1userwalletcoinnew = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userwalletcoinnew";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = WalletAddressDataResponse;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/new', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletcoinwithdrawinitiate operation.
     * @callback module:api/WalletActionsApi~v1userwalletcoinwithdrawinitiateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Initiate Bitcoin Withdrawal
     * The code for verifying the withdrawal can be called from /v1/wallet/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
     * @param {module:model/SendCoinWallet} body 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletActionsApi~v1userwalletcoinwithdrawinitiateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userwalletcoinwithdrawinitiate = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userwalletcoinwithdrawinitiate";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/withdraw/initiate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletcoinwithdrawsendToExchange operation.
     * @callback module:api/WalletActionsApi~v1userwalletcoinwithdrawsendToExchangeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Send to Exchange
     * This function transfers funds to yout Exchange Balance without the need for any confirmations.
     * @param {module:model/SendExchange} body 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletActionsApi~v1userwalletcoinwithdrawsendToExchangeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userwalletcoinwithdrawsendToExchange = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userwalletcoinwithdrawsendToExchange";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/withdraw/sendToExchange', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletcoinwithdrawunverifiedcancel operation.
     * @callback module:api/WalletActionsApi~v1userwalletcoinwithdrawunverifiedcancelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel Bitcoin Withdrawal
     * Cancels an unverified withdrawal. You can get the code from /wallet/unverifiedWithdraws.
     * @param {String} authorization Enter a valid Api Key.
     * @param {module:model/WithdrawID} body 
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletActionsApi~v1userwalletcoinwithdrawunverifiedcancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userwalletcoinwithdrawunverifiedcancel = function(authorization, body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userwalletcoinwithdrawunverifiedcancel";
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userwalletcoinwithdrawunverifiedcancel";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/withdraw/unverified/cancel', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletcoinwithdrawverify operation.
     * @callback module:api/WalletActionsApi~v1userwalletcoinwithdrawverifyCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verify Bitcoin Withdrawal
     * Verifies an unverified withdrawal. You can get the code from /v1/wallet/coin/withdraw/newVerifycode.
     * @param {String} authorization Enter a valid Api Key.
     * @param {module:model/Code} body 
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletActionsApi~v1userwalletcoinwithdrawverifyCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userwalletcoinwithdrawverify = function(authorization, body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userwalletcoinwithdrawverify";
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userwalletcoinwithdrawverify";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/withdraw/verify', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1walletcoinwithdrawnewVerifycode operation.
     * @callback module:api/WalletActionsApi~v1walletcoinwithdrawnewVerifycodeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a Verification Code
     * Gets Coin Unverified Withdraws Codes to call and apply on /v1/wallet/coin/withdraw/unverified.
     * @param {module:model/WithdrawID} body You can get unverified withdraw ID&#39;s from /v1/exchange/bank/coin/withdrawVerifycode
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletActionsApi~v1walletcoinwithdrawnewVerifycodeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1walletcoinwithdrawnewVerifycode = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1walletcoinwithdrawnewVerifycode";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/wallet/coin/withdraw/newVerifycode', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
