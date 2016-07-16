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
    root.CoinsecureApiDocumentation.NewBankForm = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The NewBankForm model module.
   * @module model/NewBankForm
   * @version 1.0b
   */

  /**
   * Constructs a new <code>NewBankForm</code>.
   * @alias module:model/NewBankForm
   * @class
   * @param acctNick
   * @param name
   * @param ban
   * @param ifsc
   * @param banType
   * @param phone
   * @param otp
   */
  var exports = function(acctNick, name, ban, ifsc, banType, phone, otp) {
    var _this = this;

    _this['acct_nick'] = acctNick;
    _this['name'] = name;
    _this['ban'] = ban;
    _this['ifsc'] = ifsc;

    _this['banType'] = banType;
    _this['phone'] = phone;
    _this['otp'] = otp;
  };

  /**
   * Constructs a <code>NewBankForm</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NewBankForm} obj Optional instance to populate.
   * @return {module:model/NewBankForm} The populated <code>NewBankForm</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('acct_nick')) {
        obj['acct_nick'] = ApiClient.convertToType(data['acct_nick'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('ban')) {
        obj['ban'] = ApiClient.convertToType(data['ban'], 'String');
      }
      if (data.hasOwnProperty('ifsc')) {
        obj['ifsc'] = ApiClient.convertToType(data['ifsc'], 'String');
      }
      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
      if (data.hasOwnProperty('banType')) {
        obj['banType'] = ApiClient.convertToType(data['banType'], 'String');
      }
      if (data.hasOwnProperty('phone')) {
        obj['phone'] = ApiClient.convertToType(data['phone'], 'String');
      }
      if (data.hasOwnProperty('otp')) {
        obj['otp'] = ApiClient.convertToType(data['otp'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} acct_nick
   */
  exports.prototype['acct_nick'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} ban
   */
  exports.prototype['ban'] = undefined;
  /**
   * @member {String} ifsc
   */
  exports.prototype['ifsc'] = undefined;
  /**
   * @member {String} message
   */
  exports.prototype['message'] = undefined;
  /**
   * @member {String} banType
   */
  exports.prototype['banType'] = undefined;
  /**
   * @member {String} phone
   */
  exports.prototype['phone'] = undefined;
  /**
   * @member {String} otp
   */
  exports.prototype['otp'] = undefined;




  return exports;
}));


