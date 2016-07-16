(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Invoice'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Invoice'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinMerchantApiDocumentation) {
      root.CoinMerchantApiDocumentation = {};
    }
    root.CoinMerchantApiDocumentation.SuccessInvoice = factory(root.CoinMerchantApiDocumentation.ApiClient, root.CoinMerchantApiDocumentation.Invoice);
  }
}(this, function(ApiClient, Invoice) {
  'use strict';




  /**
   * The SuccessInvoice model module.
   * @module model/SuccessInvoice
   * @version 1.0B
   */

  /**
   * Constructs a new <code>SuccessInvoice</code>.
   * @alias module:model/SuccessInvoice
   * @class
   * @param success
   * @param message
   * @param time
   * @param method
   */
  var exports = function(success, message, time, method) {
    var _this = this;

    _this['success'] = success;
    _this['message'] = message;
    _this['time'] = time;
    _this['method'] = method;

  };

  /**
   * Constructs a <code>SuccessInvoice</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SuccessInvoice} obj Optional instance to populate.
   * @return {module:model/SuccessInvoice} The populated <code>SuccessInvoice</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('success')) {
        obj['success'] = ApiClient.convertToType(data['success'], 'Boolean');
      }
      if (data.hasOwnProperty('message')) {
        obj['message'] = Invoice.constructFromObject(data['message']);
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
   * @member {module:model/Invoice} message
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


