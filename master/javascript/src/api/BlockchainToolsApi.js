(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/FailResult', 'model/ValidAddressSearchDataResponse', 'model/ConfirmDataResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/FailResult'), require('../model/ValidAddressSearchDataResponse'), require('../model/ConfirmDataResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.BlockchainToolsApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.ValidAddressSearchDataResponse, root.CoinsecureApiDocumentation.ConfirmDataResponse);
  }
}(this, function(ApiClient, FailResult, ValidAddressSearchDataResponse, ConfirmDataResponse) {
  'use strict';

  /**
   * BlockchainTools service.
   * @module api/BlockchainToolsApi
   * @version 1.0b
   */

  /**
   * Constructs a new BlockchainToolsApi. 
   * @alias module:api/BlockchainToolsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1bitcoinsearchAddress operation.
     * @callback module:api/BlockchainToolsApi~v1bitcoinsearchAddressCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ValidAddressSearchDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Search Bitcoin Blockchain
     * Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.
     * @param {String} any 
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/BlockchainToolsApi~v1bitcoinsearchAddressCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/ValidAddressSearchDataResponse}
     */
    this.v1bitcoinsearchAddress = function(any, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'any' is set
      if (any == undefined || any == null) {
        throw "Missing the required parameter 'any' when calling v1bitcoinsearchAddress";
      }


      var pathParams = {
        'any': any
      };
      var queryParams = {
      };
      var headerParams = {
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = ValidAddressSearchDataResponse;

      return this.apiClient.callApi(
        '/v1/bitcoin/search/{any}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1bitcoinsearchTxid operation.
     * @callback module:api/BlockchainToolsApi~v1bitcoinsearchTxidCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ConfirmDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Confirmations
     * Searches for a Number of Confirmations on a transaction ID.
     * @param {String} txid 
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/BlockchainToolsApi~v1bitcoinsearchTxidCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/ConfirmDataResponse}
     */
    this.v1bitcoinsearchTxid = function(txid, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'txid' is set
      if (txid == undefined || txid == null) {
        throw "Missing the required parameter 'txid' when calling v1bitcoinsearchTxid";
      }


      var pathParams = {
        'txid': txid
      };
      var queryParams = {
      };
      var headerParams = {
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = ConfirmDataResponse;

      return this.apiClient.callApi(
        '/v1/bitcoin/search/confirmation/{txid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
