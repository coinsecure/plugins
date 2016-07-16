(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/JsValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./JsValue'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinMerchantApiDocumentation) {
      root.CoinMerchantApiDocumentation = {};
    }
    root.CoinMerchantApiDocumentation.FailMerchant = factory(root.CoinMerchantApiDocumentation.ApiClient, root.CoinMerchantApiDocumentation.JsValue);
  }
}(this, function(ApiClient, JsValue) {
  'use strict';




  /**
   * The FailMerchant model module.
   * @module model/FailMerchant
   * @version 1.0B
   */

  /**
   * Constructs a new <code>FailMerchant</code>.
   * @alias module:model/FailMerchant
   * @class
   * @param success
   * @param message
   */
  var exports = function(success, message) {
    var _this = this;

    _this['success'] = success;
    _this['message'] = message;



  };

  /**
   * Constructs a <code>FailMerchant</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FailMerchant} obj Optional instance to populate.
   * @return {module:model/FailMerchant} The populated <code>FailMerchant</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('success')) {
        obj['success'] = ApiClient.convertToType(data['success'], 'Boolean');
      }
      if (data.hasOwnProperty('message')) {
        obj['message'] = JsValue.constructFromObject(data['message']);
      }
      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Date');
      }
      if (data.hasOwnProperty('method')) {
        obj['method'] = ApiClient.convertToType(data['method'], 'String');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Boolean} success
   * @default false
   */
  exports.prototype['success'] = false;
  /**
   * @member {module:model/JsValue} message
   */
  exports.prototype['message'] = undefined;
  /**
   * @member {Date} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {String} method
   */
  exports.prototype['method'] = undefined;
  /**
   * @member {String} title
   */
  exports.prototype['title'] = undefined;




  return exports;
}));


