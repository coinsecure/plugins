(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/SuccessResult', 'model/FailResult', 'model/MethodCountryMobile', 'model/Code', 'model/CodeCountryMobile', 'model/ChangePassword', 'model/ResetPassword'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/SuccessResult'), require('../model/FailResult'), require('../model/MethodCountryMobile'), require('../model/Code'), require('../model/CodeCountryMobile'), require('../model/ChangePassword'), require('../model/ResetPassword'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.SecurityActionsApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.SuccessResult, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.MethodCountryMobile, root.CoinsecureApiDocumentation.Code, root.CoinsecureApiDocumentation.CodeCountryMobile, root.CoinsecureApiDocumentation.ChangePassword, root.CoinsecureApiDocumentation.ResetPassword);
  }
}(this, function(ApiClient, SuccessResult, FailResult, MethodCountryMobile, Code, CodeCountryMobile, ChangePassword, ResetPassword) {
  'use strict';

  /**
   * SecurityActions service.
   * @module api/SecurityActionsApi
   * @version 1.0b
   */

  /**
   * Constructs a new SecurityActionsApi. 
   * @alias module:api/SecurityActionsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1mfaauthyinitiate operation.
     * @callback module:api/SecurityActionsApi~v1mfaauthyinitiateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Initiate Authy Registration.
     * Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.
     * @param {module:model/MethodCountryMobile} body Please Send Valid Json as below.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/SecurityActionsApi~v1mfaauthyinitiateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1mfaauthyinitiate = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1mfaauthyinitiate";
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
        '/v1/mfa/authy/initiate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1mfagainitiate operation.
     * @callback module:api/SecurityActionsApi~v1mfagainitiateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Initiate GA Registration.
     * Returns the Google Authenticator Secret and a QR code URL.
     * @param {module:model/MethodCountryMobile} body Please Send Valid Json as below.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/SecurityActionsApi~v1mfagainitiateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1mfagainitiate = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1mfagainitiate";
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
        '/v1/mfa/ga/initiate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1usermfaauthycall operation.
     * @callback module:api/SecurityActionsApi~v1usermfaauthycallCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authy Call Code
     * Calls valid phone user with a code.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Login Token or any Apikey to be added as Authorization in header
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/SecurityActionsApi~v1usermfaauthycallCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1usermfaauthycall = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


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
        '/v1/mfa/authy/call', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1usermfaauthydisable operation.
     * @callback module:api/SecurityActionsApi~v1usermfaauthydisableCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Disable Authy
     * Disables users Authy
     * @param {module:model/Code} body Please Send Valid Json as below.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/SecurityActionsApi~v1usermfaauthydisableCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1usermfaauthydisable = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1usermfaauthydisable";
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
        '/v1/user/mfa/authy/disable', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1usermfaauthyinitiateenable operation.
     * @callback module:api/SecurityActionsApi~v1usermfaauthyinitiateenableCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verify Authy Registration
     * Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.
     * @param {module:model/CodeCountryMobile} body Please Send Valid Json as below.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/SecurityActionsApi~v1usermfaauthyinitiateenableCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1usermfaauthyinitiateenable = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1usermfaauthyinitiateenable";
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
        '/v1/user/mfa/authy/initiate/enable', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1usermfaauthysms operation.
     * @callback module:api/SecurityActionsApi~v1usermfaauthysmsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authy Sms Code
     * Disables users Authy
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Login Token or any Apikey to be added as Authorization in header
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/SecurityActionsApi~v1usermfaauthysmsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1usermfaauthysms = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


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
        '/v1/mfa/authy/sms', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1usermfagadisable operation.
     * @callback module:api/SecurityActionsApi~v1usermfagadisableCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Disable Google Authenticator
     * Disables users Google Authenticator 2FA
     * @param {module:model/Code} body Please Send Valid Json as below.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/SecurityActionsApi~v1usermfagadisableCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1usermfagadisable = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1usermfagadisable";
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
        '/v1/user/mfa/ga/disable', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1usermfagainitiateenable operation.
     * @callback module:api/SecurityActionsApi~v1usermfagainitiateenableCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Enable Google Authenticator
     * Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.
     * @param {module:model/CodeCountryMobile} body Please Send Valid Json as below.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/SecurityActionsApi~v1usermfagainitiateenableCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1usermfagainitiateenable = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1usermfagainitiateenable";
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
        '/v1/user/mfa/ga/initiate/enable', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userpasswordchange operation.
     * @callback module:api/SecurityActionsApi~v1userpasswordchangeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Change Password.
     * Changes an account Password.
     * @param {module:model/ChangePassword} body 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/SecurityActionsApi~v1userpasswordchangeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userpasswordchange = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userpasswordchange";
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
        '/v1/user/password/change', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userpasswordreset operation.
     * @callback module:api/SecurityActionsApi~v1userpasswordresetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Reset Password.
     * Resets an account Password. Use forgotPassword to generate a token.
     * @param {module:model/ResetPassword} body Please Send Valid Json as below.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/SecurityActionsApi~v1userpasswordresetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userpasswordreset = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userpasswordreset";
      }


      var pathParams = {
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
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/password/reset', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
