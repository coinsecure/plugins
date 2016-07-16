(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/SuccessResult', 'model/FailResult', 'model/AskID', 'model/SuccessResultList', 'model/RateVolData', 'model/BidID', 'model/MinFiat', 'model/MaxVol'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/SuccessResult'), require('../model/FailResult'), require('../model/AskID'), require('../model/SuccessResultList'), require('../model/RateVolData'), require('../model/BidID'), require('../model/MinFiat'), require('../model/MaxVol'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.ExchangeTradeActionsApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.SuccessResult, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.AskID, root.CoinsecureApiDocumentation.SuccessResultList, root.CoinsecureApiDocumentation.RateVolData, root.CoinsecureApiDocumentation.BidID, root.CoinsecureApiDocumentation.MinFiat, root.CoinsecureApiDocumentation.MaxVol);
  }
}(this, function(ApiClient, SuccessResult, FailResult, AskID, SuccessResultList, RateVolData, BidID, MinFiat, MaxVol) {
  'use strict';

  /**
   * ExchangeTradeActions service.
   * @module api/ExchangeTradeActionsApi
   * @version 1.0b
   */

  /**
   * Constructs a new ExchangeTradeActionsApi. 
   * @alias module:api/ExchangeTradeActionsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1userexchangeaskcancel operation.
     * @callback module:api/ExchangeTradeActionsApi~v1userexchangeaskcancelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel Open Sell Order
     * Cancels a BTC Sell Order. Orders can only be cancelled if they are in a pending state.
     * @param {module:model/AskID} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeActionsApi~v1userexchangeaskcancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangeaskcancel = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangeaskcancel";
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
        '/v1/user/exchange/ask/cancel', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangeasknew operation.
     * @callback module:api/ExchangeTradeActionsApi~v1userexchangeasknewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResultList} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * BTC Sell Order
     * Creates a BTC Sell Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.
     * @param {module:model/RateVolData} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeActionsApi~v1userexchangeasknewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResultList}
     */
    this.v1userexchangeasknew = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangeasknew";
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
      var returnType = SuccessResultList;

      return this.apiClient.callApi(
        '/v1/user/exchange/ask/new', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebidcancel operation.
     * @callback module:api/ExchangeTradeActionsApi~v1userexchangebidcancelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel Open Buy Order
     * Cancels a BTC Buy Order. Orders can only be cancelled if they are in a pending state.
     * @param {module:model/BidID} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeActionsApi~v1userexchangebidcancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebidcancel = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebidcancel";
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
        '/v1/user/exchange/bid/cancel', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebidnew operation.
     * @callback module:api/ExchangeTradeActionsApi~v1userexchangebidnewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResultList} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * BTC Buy Order
     * Creates a BTC Buy Order. If the order cannot be fulfilled completely, data can be found in allAsks and wil be added as a pending order.
     * @param {module:model/RateVolData} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeActionsApi~v1userexchangebidnewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResultList}
     */
    this.v1userexchangebidnew = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebidnew";
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
      var returnType = SuccessResultList;

      return this.apiClient.callApi(
        '/v1/user/exchange/bid/new', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangeinstantbuy operation.
     * @callback module:api/ExchangeTradeActionsApi~v1userexchangeinstantbuyCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResultList} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Instantly Buy BTC
     * Instantly buys BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.
     * @param {module:model/MinFiat} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeActionsApi~v1userexchangeinstantbuyCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResultList}
     */
    this.v1userexchangeinstantbuy = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangeinstantbuy";
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
      var returnType = SuccessResultList;

      return this.apiClient.callApi(
        '/v1/user/exchange/instant/buy', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangeinstantsell operation.
     * @callback module:api/ExchangeTradeActionsApi~v1userexchangeinstantsellCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResultList} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Instantly Sell BTC
     * Instantly sells BTC at the closest rate found. This tool will sell at any rate needed to complete the order. It will never exceed the amount, but may fall below.
     * @param {module:model/MaxVol} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeActionsApi~v1userexchangeinstantsellCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResultList}
     */
    this.v1userexchangeinstantsell = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangeinstantsell";
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
      var returnType = SuccessResultList;

      return this.apiClient.callApi(
        '/v1/user/exchange/instant/sell', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
