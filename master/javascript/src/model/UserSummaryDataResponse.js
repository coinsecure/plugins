(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/UserSummaryData'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./UserSummaryData'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.UserSummaryDataResponse = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.UserSummaryData);
  }
}(this, function(ApiClient, UserSummaryData) {
  'use strict';




  /**
   * The UserSummaryDataResponse model module.
   * @module model/UserSummaryDataResponse
   * @version 1.0b
   */

  /**
   * Constructs a new <code>UserSummaryDataResponse</code>.
   * @alias module:model/UserSummaryDataResponse
   * @class
   * @param success
   * @param message
   * @param method
   * @param title
   * @param time
   */
  var exports = function(success, message, method, title, time) {
    var _this = this;

    _this['success'] = success;
    _this['message'] = message;
    _this['method'] = method;
    _this['title'] = title;
    _this['time'] = time;
  };

  /**
   * Constructs a <code>UserSummaryDataResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UserSummaryDataResponse} obj Optional instance to populate.
   * @return {module:model/UserSummaryDataResponse} The populated <code>UserSummaryDataResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('success')) {
        obj['success'] = ApiClient.convertToType(data['success'], 'Boolean');
      }
      if (data.hasOwnProperty('message')) {
        obj['message'] = UserSummaryData.constructFromObject(data['message']);
      }
      if (data.hasOwnProperty('method')) {
        obj['method'] = ApiClient.convertToType(data['method'], 'String');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], 'String');
      }
      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Date');
      }
    }
    return obj;
  }

  /**
   * true
   * @member {Boolean} success
   * @default false
   */
  exports.prototype['success'] = false;
  /**
   * @member {module:model/UserSummaryData} message
   */
  exports.prototype['message'] = undefined;
  /**
   * @member {String} method
   */
  exports.prototype['method'] = undefined;
  /**
   * @member {String} title
   */
  exports.prototype['title'] = undefined;
  /**
   * @member {Date} time
   */
  exports.prototype['time'] = undefined;




  return exports;
}));


