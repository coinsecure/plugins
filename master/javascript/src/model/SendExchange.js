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
    root.CoinsecureApiDocumentation.SendExchange = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SendExchange model module.
   * @module model/SendExchange
   * @version 1.0b
   */

  /**
   * Constructs a new <code>SendExchange</code>.
   * @alias module:model/SendExchange
   * @class
   * @param amt
   * @param walletID
   */
  var exports = function(amt, walletID) {
    var _this = this;

    _this['amt'] = amt;
    _this['walletID'] = walletID;

  };

  /**
   * Constructs a <code>SendExchange</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SendExchange} obj Optional instance to populate.
   * @return {module:model/SendExchange} The populated <code>SendExchange</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('amt')) {
        obj['amt'] = ApiClient.convertToType(data['amt'], 'Integer');
      }
      if (data.hasOwnProperty('walletID')) {
        obj['walletID'] = ApiClient.convertToType(data['walletID'], 'String');
      }
      if (data.hasOwnProperty('msg')) {
        obj['msg'] = ApiClient.convertToType(data['msg'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} amt
   */
  exports.prototype['amt'] = undefined;
  /**
   * @member {String} walletID
   */
  exports.prototype['walletID'] = undefined;
  /**
   * @member {String} msg
   */
  exports.prototype['msg'] = undefined;




  return exports;
}));


