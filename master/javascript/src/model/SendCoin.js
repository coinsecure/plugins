(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.SendCoin = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SendCoin model module.
   * @module model/SendCoin
   * @version 1.0b
   */

  /**
   * Constructs a new <code>SendCoin</code>.
   * @alias module:model/SendCoin
   * @class
   * @param satoshis
   * @param toAddr
   */
  var exports = function(satoshis, toAddr) {
    var _this = this;

    _this['satoshis'] = satoshis;
    _this['toAddr'] = toAddr;


  };

  /**
   * Constructs a <code>SendCoin</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SendCoin} obj Optional instance to populate.
   * @return {module:model/SendCoin} The populated <code>SendCoin</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('satoshis')) {
        obj['satoshis'] = ApiClient.convertToType(data['satoshis'], 'Integer');
      }
      if (data.hasOwnProperty('toAddr')) {
        obj['toAddr'] = ApiClient.convertToType(data['toAddr'], 'String');
      }
      if (data.hasOwnProperty('msg')) {
        obj['msg'] = ApiClient.convertToType(data['msg'], 'String');
      }
      if (data.hasOwnProperty('pin')) {
        obj['pin'] = ApiClient.convertToType(data['pin'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} satoshis
   */
  exports.prototype['satoshis'] = undefined;
  /**
   * @member {String} toAddr
   */
  exports.prototype['toAddr'] = undefined;
  /**
   * @member {String} msg
   */
  exports.prototype['msg'] = undefined;
  /**
   * @member {String} pin
   */
  exports.prototype['pin'] = undefined;




  return exports;
}));


