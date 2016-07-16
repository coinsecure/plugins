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
    root.CoinsecureApiDocumentation.SendCoinWallet = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SendCoinWallet model module.
   * @module model/SendCoinWallet
   * @version 1.0b
   */

  /**
   * Constructs a new <code>SendCoinWallet</code>.
   * @alias module:model/SendCoinWallet
   * @class
   * @param walletID
   * @param amt
   * @param toAddr
   */
  var exports = function(walletID, amt, toAddr) {
    var _this = this;

    _this['walletID'] = walletID;
    _this['amt'] = amt;
    _this['toAddr'] = toAddr;


  };

  /**
   * Constructs a <code>SendCoinWallet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SendCoinWallet} obj Optional instance to populate.
   * @return {module:model/SendCoinWallet} The populated <code>SendCoinWallet</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('walletID')) {
        obj['walletID'] = ApiClient.convertToType(data['walletID'], 'String');
      }
      if (data.hasOwnProperty('amt')) {
        obj['amt'] = ApiClient.convertToType(data['amt'], 'Integer');
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
   * @member {String} walletID
   */
  exports.prototype['walletID'] = undefined;
  /**
   * @member {Integer} amt
   */
  exports.prototype['amt'] = undefined;
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


