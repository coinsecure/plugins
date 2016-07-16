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
    root.CoinsecureApiDocumentation.NewFiatBankDeposit = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The NewFiatBankDeposit model module.
   * @module model/NewFiatBankDeposit
   * @version 1.0b
   */

  /**
   * Constructs a new <code>NewFiatBankDeposit</code>.
   * @alias module:model/NewFiatBankDeposit
   * @class
   * @param amount
   * @param message
   * @param bank
   * @param depType
   */
  var exports = function(amount, message, bank, depType) {
    var _this = this;

    _this['amount'] = amount;
    _this['message'] = message;
    _this['bank'] = bank;
    _this['depType'] = depType;
  };

  /**
   * Constructs a <code>NewFiatBankDeposit</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NewFiatBankDeposit} obj Optional instance to populate.
   * @return {module:model/NewFiatBankDeposit} The populated <code>NewFiatBankDeposit</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'Integer');
      }
      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
      if (data.hasOwnProperty('bank')) {
        obj['bank'] = ApiClient.convertToType(data['bank'], 'String');
      }
      if (data.hasOwnProperty('depType')) {
        obj['depType'] = ApiClient.convertToType(data['depType'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * @member {String} message
   */
  exports.prototype['message'] = undefined;
  /**
   * @member {String} bank
   */
  exports.prototype['bank'] = undefined;
  /**
   * @member {String} depType
   */
  exports.prototype['depType'] = undefined;




  return exports;
}));


