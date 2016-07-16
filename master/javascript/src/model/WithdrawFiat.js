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
    root.CoinsecureApiDocumentation.WithdrawFiat = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The WithdrawFiat model module.
   * @module model/WithdrawFiat
   * @version 1.0b
   */

  /**
   * Constructs a new <code>WithdrawFiat</code>.
   * @alias module:model/WithdrawFiat
   * @class
   * @param fiat
   * @param account
   */
  var exports = function(fiat, account) {
    var _this = this;

    _this['fiat'] = fiat;
    _this['account'] = account;


  };

  /**
   * Constructs a <code>WithdrawFiat</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WithdrawFiat} obj Optional instance to populate.
   * @return {module:model/WithdrawFiat} The populated <code>WithdrawFiat</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('fiat')) {
        obj['fiat'] = ApiClient.convertToType(data['fiat'], 'Integer');
      }
      if (data.hasOwnProperty('account')) {
        obj['account'] = ApiClient.convertToType(data['account'], 'String');
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
   * @member {Integer} fiat
   */
  exports.prototype['fiat'] = undefined;
  /**
   * @member {String} account
   */
  exports.prototype['account'] = undefined;
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


