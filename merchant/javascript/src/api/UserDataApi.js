(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/FailMerchant', 'model/SuccessMerchant'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/FailMerchant'), require('../model/SuccessMerchant'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinMerchantApiDocumentation) {
      root.CoinMerchantApiDocumentation = {};
    }
    root.CoinMerchantApiDocumentation.UserDataApi = factory(root.CoinMerchantApiDocumentation.ApiClient, root.CoinMerchantApiDocumentation.FailMerchant, root.CoinMerchantApiDocumentation.SuccessMerchant);
  }
}(this, function(ApiClient, FailMerchant, SuccessMerchant) {
  'use strict';

  /**
   * UserData service.
   * @module api/UserDataApi
   * @version 1.0B
   */

  /**
   * Constructs a new UserDataApi. 
   * @alias module:api/UserDataApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the getMerchant operation.
     * @callback module:api/UserDataApi~getMerchantCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessMerchant} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GET MERCHANT
     * Gets a Summary of Merchant Data.
     * @param {String} apiKey Enter User Key
     * @param {module:api/UserDataApi~getMerchantCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessMerchant}
     */
    this.getMerchant = function(apiKey, callback) {
      var postBody = null;

      // verify the required parameter 'apiKey' is set
      if (apiKey == undefined || apiKey == null) {
        throw "Missing the required parameter 'apiKey' when calling getMerchant";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'apiKey': apiKey
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = [];
      var returnType = SuccessMerchant;

      return this.apiClient.callApi(
        '/user/getMerchant', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
