(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/SendCoin', 'model/SuccessResult', 'model/FailResult', 'model/WithdrawID', 'model/Code', 'model/NewBankForm', 'model/DepositID', 'model/NewFiatBankDeposit', 'model/WithdrawFiat'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/SendCoin'), require('../model/SuccessResult'), require('../model/FailResult'), require('../model/WithdrawID'), require('../model/Code'), require('../model/NewBankForm'), require('../model/DepositID'), require('../model/NewFiatBankDeposit'), require('../model/WithdrawFiat'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.ExchangeBankActionsApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.SendCoin, root.CoinsecureApiDocumentation.SuccessResult, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.WithdrawID, root.CoinsecureApiDocumentation.Code, root.CoinsecureApiDocumentation.NewBankForm, root.CoinsecureApiDocumentation.DepositID, root.CoinsecureApiDocumentation.NewFiatBankDeposit, root.CoinsecureApiDocumentation.WithdrawFiat);
  }
}(this, function(ApiClient, SendCoin, SuccessResult, FailResult, WithdrawID, Code, NewBankForm, DepositID, NewFiatBankDeposit, WithdrawFiat) {
  'use strict';

  /**
   * ExchangeBankActions service.
   * @module api/ExchangeBankActionsApi
   * @version 1.0b
   */

  /**
   * Constructs a new ExchangeBankActionsApi. 
   * @alias module:api/ExchangeBankActionsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1userexchangebankcoinwithdrawinitiate operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankcoinwithdrawinitiateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Initiate Bitcoin Withdrawal
     * The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
     * @param {module:model/SendCoin} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankcoinwithdrawinitiateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankcoinwithdrawinitiate = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankcoinwithdrawinitiate";
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
        '/v1/user/exchange/bank/coin/withdraw/initiate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoinwithdrawnewVerifycode operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankcoinwithdrawnewVerifycodeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a Verification Code.
     * Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.
     * @param {module:model/WithdrawID} body You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankcoinwithdrawnewVerifycodeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankcoinwithdrawnewVerifycode = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankcoinwithdrawnewVerifycode";
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
        '/v1/user/exchange/bank/coin/withdraw/newVerifycode', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoinwithdrawunverifiedcancel operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankcoinwithdrawunverifiedcancelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel Bitcoin Withdrawal
     * Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.
     * @param {module:model/WithdrawID} body You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankcoinwithdrawunverifiedcancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankcoinwithdrawunverifiedcancel = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankcoinwithdrawunverifiedcancel";
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
        '/v1/user/exchange/bank/coin/withdraw/unverified/cancel', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoinwithdrawverify operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankcoinwithdrawverifyCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verify Bitcoin Withdrawal
     * Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
     * @param {module:model/Code} body You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankcoinwithdrawverifyCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankcoinwithdrawverify = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankcoinwithdrawverify";
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
        '/v1/user/exchange/bank/coin/withdraw/verify', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiataccountnew operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankfiataccountnewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * New Bank Link
     * Submits a New Bank Link on KYC Verified Accounts.
     * @param {module:model/NewBankForm} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankfiataccountnewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankfiataccountnew = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankfiataccountnew";
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
        '/v1/user/exchange/bank/fiat/account/new', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatdepositcancel operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankfiatdepositcancelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel Unverified Exchange Fiat Deposit
     * Cancels an unverified Exchange Fiat Deposit.
     * @param {module:model/DepositID} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankfiatdepositcancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankfiatdepositcancel = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankfiatdepositcancel";
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
        '/v1/user/exchange/bank/fiat/deposit/cancel', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatdepositnew operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankfiatdepositnewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * New Exchange Fiat Deposit
     * Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.
     * @param {module:model/NewFiatBankDeposit} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankfiatdepositnewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankfiatdepositnew = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankfiatdepositnew";
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
        '/v1/user/exchange/bank/fiat/deposit/new', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatwithdrawinitiate operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankfiatwithdrawinitiateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Initiate Fiat Withdrawal
     * The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
     * @param {module:model/WithdrawFiat} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankfiatwithdrawinitiateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankfiatwithdrawinitiate = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankfiatwithdrawinitiate";
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
        '/v1/user/exchange/bank/fiat/withdraw/initiate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatwithdrawnewVerifycode operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankfiatwithdrawnewVerifycodeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a Fiat Verification Code.
     * Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.
     * @param {module:model/WithdrawID} body You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankfiatwithdrawnewVerifycodeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankfiatwithdrawnewVerifycode = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankfiatwithdrawnewVerifycode";
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
        '/v1/user/exchange/bank/fiat/withdraw/newVerifycode', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatwithdrawunverifiedcancel operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankfiatwithdrawunverifiedcancelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel Fiat Withdrawal
     * Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.
     * @param {module:model/WithdrawID} body You can get the code from /v1/user/exchange/bank/fiat/withdraw/unverified.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankfiatwithdrawunverifiedcancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankfiatwithdrawunverifiedcancel = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankfiatwithdrawunverifiedcancel";
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
        '/v1/user/exchange/bank/fiat/withdraw/unverified/cancel', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatwithdrawverify operation.
     * @callback module:api/ExchangeBankActionsApi~v1userexchangebankfiatwithdrawverifyCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verify Fiat Withdrawal
     * Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.
     * @param {module:model/Code} body You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankActionsApi~v1userexchangebankfiatwithdrawverifyCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangebankfiatwithdrawverify = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userexchangebankfiatwithdrawverify";
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
        '/v1/user/exchange/bank/fiat/withdraw/verify', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
