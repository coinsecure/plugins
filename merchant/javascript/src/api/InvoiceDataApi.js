(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/FailInvoice', 'model/InvoiceIDFull', 'model/SuccessInvoices', 'model/SuccessInvoice'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/FailInvoice'), require('../model/InvoiceIDFull'), require('../model/SuccessInvoices'), require('../model/SuccessInvoice'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinMerchantApiDocumentation) {
      root.CoinMerchantApiDocumentation = {};
    }
    root.CoinMerchantApiDocumentation.InvoiceDataApi = factory(root.CoinMerchantApiDocumentation.ApiClient, root.CoinMerchantApiDocumentation.FailInvoice, root.CoinMerchantApiDocumentation.InvoiceIDFull, root.CoinMerchantApiDocumentation.SuccessInvoices, root.CoinMerchantApiDocumentation.SuccessInvoice);
  }
}(this, function(ApiClient, FailInvoice, InvoiceIDFull, SuccessInvoices, SuccessInvoice) {
  'use strict';

  /**
   * InvoiceData service.
   * @module api/InvoiceDataApi
   * @version 1.0B
   */

  /**
   * Constructs a new InvoiceDataApi. 
   * @alias module:api/InvoiceDataApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the getCancInvoices operation.
     * @callback module:api/InvoiceDataApi~getCancInvoicesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessInvoices} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GET ALL CANCELLED INVOICES
     * Gets All Cancelled Invoice Details.
     * @param {String} apikey Enter User Key
     * @param {module:model/InvoiceIDFull} body Enter details to query Invoices
     * @param {module:api/InvoiceDataApi~getCancInvoicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessInvoices}
     */
    this.getCancInvoices = function(apikey, body, callback) {
      var postBody = body;

      // verify the required parameter 'apikey' is set
      if (apikey == undefined || apikey == null) {
        throw "Missing the required parameter 'apikey' when calling getCancInvoices";
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling getCancInvoices";
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
      var returnType = SuccessInvoices;

      return this.apiClient.callApi(
        '/invoice/getCancInvoices', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getCompleteInvoices operation.
     * @callback module:api/InvoiceDataApi~getCompleteInvoicesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessInvoices} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GET ALL COMPLETED INVOICES
     * Gets All Completed Invoice Details.
     * @param {String} apikey Enter User Key
     * @param {module:model/InvoiceIDFull} body Enter details to query Invoices
     * @param {module:api/InvoiceDataApi~getCompleteInvoicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessInvoices}
     */
    this.getCompleteInvoices = function(apikey, body, callback) {
      var postBody = body;

      // verify the required parameter 'apikey' is set
      if (apikey == undefined || apikey == null) {
        throw "Missing the required parameter 'apikey' when calling getCompleteInvoices";
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling getCompleteInvoices";
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
      var returnType = SuccessInvoices;

      return this.apiClient.callApi(
        '/invoice/getCompleteInvoices', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getConfInvoices operation.
     * @callback module:api/InvoiceDataApi~getConfInvoicesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessInvoices} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GET ALL CONFIRMED INVOICES
     * Gets All Confirmed Invoice Details.
     * @param {String} apikey Enter User Key
     * @param {module:model/InvoiceIDFull} body Enter details to query Invoices
     * @param {module:api/InvoiceDataApi~getConfInvoicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessInvoices}
     */
    this.getConfInvoices = function(apikey, body, callback) {
      var postBody = body;

      // verify the required parameter 'apikey' is set
      if (apikey == undefined || apikey == null) {
        throw "Missing the required parameter 'apikey' when calling getConfInvoices";
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling getConfInvoices";
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
      var returnType = SuccessInvoices;

      return this.apiClient.callApi(
        '/invoice/getConfInvoices', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getInvoiceFromID operation.
     * @callback module:api/InvoiceDataApi~getInvoiceFromIDCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessInvoice} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GET INVOICE FROM ID
     * Gets Details of an Invoice ID.
     * @param {String} invoiceID 
     * @param {String} apikey Enter User Key
     * @param {module:api/InvoiceDataApi~getInvoiceFromIDCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessInvoice}
     */
    this.getInvoiceFromID = function(invoiceID, apikey, callback) {
      var postBody = null;

      // verify the required parameter 'invoiceID' is set
      if (invoiceID == undefined || invoiceID == null) {
        throw "Missing the required parameter 'invoiceID' when calling getInvoiceFromID";
      }

      // verify the required parameter 'apikey' is set
      if (apikey == undefined || apikey == null) {
        throw "Missing the required parameter 'apikey' when calling getInvoiceFromID";
      }


      var pathParams = {
        'invoiceID': invoiceID
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
        '/invoice/getInvoiceFromID/{invoiceID}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getPaidInvoices operation.
     * @callback module:api/InvoiceDataApi~getPaidInvoicesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessInvoices} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GET ALL PAID INVOICES
     * Gets All Paid Invoice Details.
     * @param {String} apikey Enter User Key
     * @param {module:model/InvoiceIDFull} body Enter details to query Invoices
     * @param {module:api/InvoiceDataApi~getPaidInvoicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessInvoices}
     */
    this.getPaidInvoices = function(apikey, body, callback) {
      var postBody = body;

      // verify the required parameter 'apikey' is set
      if (apikey == undefined || apikey == null) {
        throw "Missing the required parameter 'apikey' when calling getPaidInvoices";
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling getPaidInvoices";
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
      var returnType = SuccessInvoices;

      return this.apiClient.callApi(
        '/invoice/getPaidInvoices', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getRefundInvoices operation.
     * @callback module:api/InvoiceDataApi~getRefundInvoicesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessInvoices} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GET ALL REFUND INVOICES
     * Gets All Refund Invoice Details.
     * @param {String} apikey Enter User Key
     * @param {module:model/InvoiceIDFull} body Enter details to query Invoices
     * @param {module:api/InvoiceDataApi~getRefundInvoicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessInvoices}
     */
    this.getRefundInvoices = function(apikey, body, callback) {
      var postBody = body;

      // verify the required parameter 'apikey' is set
      if (apikey == undefined || apikey == null) {
        throw "Missing the required parameter 'apikey' when calling getRefundInvoices";
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling getRefundInvoices";
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
      var returnType = SuccessInvoices;

      return this.apiClient.callApi(
        '/invoice/getRefundInvoices', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getUnprocessedInvoices operation.
     * @callback module:api/InvoiceDataApi~getUnprocessedInvoicesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessInvoices} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GET ALL UNPROCESSED INVOICES
     * Gets All Unprocessed Invoice Details.
     * @param {String} apikey Enter User Key
     * @param {module:model/InvoiceIDFull} body Enter details to query Invoices
     * @param {module:api/InvoiceDataApi~getUnprocessedInvoicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessInvoices}
     */
    this.getUnprocessedInvoices = function(apikey, body, callback) {
      var postBody = body;

      // verify the required parameter 'apikey' is set
      if (apikey == undefined || apikey == null) {
        throw "Missing the required parameter 'apikey' when calling getUnprocessedInvoices";
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling getUnprocessedInvoices";
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
      var returnType = SuccessInvoices;

      return this.apiClient.callApi(
        '/invoice/getUnprocessedInvoices', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
