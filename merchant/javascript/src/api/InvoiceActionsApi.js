(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/SuccessInvoice', 'model/FailInvoice', 'model/NewInvoice', 'model/ActionAnyContent'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/SuccessInvoice'), require('../model/FailInvoice'), require('../model/NewInvoice'), require('../model/ActionAnyContent'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinMerchantApiDocumentation) {
      root.CoinMerchantApiDocumentation = {};
    }
    root.CoinMerchantApiDocumentation.InvoiceActionsApi = factory(root.CoinMerchantApiDocumentation.ApiClient, root.CoinMerchantApiDocumentation.SuccessInvoice, root.CoinMerchantApiDocumentation.FailInvoice, root.CoinMerchantApiDocumentation.NewInvoice, root.CoinMerchantApiDocumentation.ActionAnyContent);
  }
}(this, function(ApiClient, SuccessInvoice, FailInvoice, NewInvoice, ActionAnyContent) {
  'use strict';

  /**
   * InvoiceActions service.
   * @module api/InvoiceActionsApi
   * @version 1.0B
   */

  /**
   * Constructs a new InvoiceActionsApi. 
   * @alias module:api/InvoiceActionsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createNewInvoice operation.
     * @callback module:api/InvoiceActionsApi~createNewInvoiceCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessInvoice} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * NEW INVOICE
     * Allows user to create a new Invoice.
     * @param {String} apikey Enter User Key
     * @param {module:model/NewInvoice} body Enter details to create an Invoice
     * @param {module:api/InvoiceActionsApi~createNewInvoiceCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessInvoice}
     */
    this.createNewInvoice = function(apikey, body, callback) {
      var postBody = body;

      // verify the required parameter 'apikey' is set
      if (apikey == undefined || apikey == null) {
        throw "Missing the required parameter 'apikey' when calling createNewInvoice";
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling createNewInvoice";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'apikey': apikey
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = [];
      var returnType = SuccessInvoice;

      return this.apiClient.callApi(
        '/invoice/createNewInvoice', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the loadInvoice operation.
     * @callback module:api/InvoiceActionsApi~loadInvoiceCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ActionAnyContent} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} invoiceID 
     * @param {module:api/InvoiceActionsApi~loadInvoiceCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/ActionAnyContent}
     */
    this.loadInvoice = function(invoiceID, callback) {
      var postBody = null;

      // verify the required parameter 'invoiceID' is set
      if (invoiceID == undefined || invoiceID == null) {
        throw "Missing the required parameter 'invoiceID' when calling loadInvoice";
      }


      var pathParams = {
        'invoiceID': invoiceID
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = [];
      var returnType = ActionAnyContent;

      return this.apiClient.callApi(
        '/invoice/{invoiceID}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
