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
    root.CoinsecureApiDocumentation.UserSummaryData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The UserSummaryData model module.
   * @module model/UserSummaryData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>UserSummaryData</code>.
   * @alias module:model/UserSummaryData
   * @class
   * @param kycStatus
   * @param bankLinkStatus
   * @param tradeReady
   * @param isDisabledAccount
   * @param faSecure
   * @param hasPhone
   */
  var exports = function(kycStatus, bankLinkStatus, tradeReady, isDisabledAccount, faSecure, hasPhone) {
    var _this = this;

    _this['kycStatus'] = kycStatus;
    _this['bankLinkStatus'] = bankLinkStatus;
    _this['tradeReady'] = tradeReady;
    _this['isDisabledAccount'] = isDisabledAccount;
    _this['faSecure'] = faSecure;
    _this['hasPhone'] = hasPhone;
  };

  /**
   * Constructs a <code>UserSummaryData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UserSummaryData} obj Optional instance to populate.
   * @return {module:model/UserSummaryData} The populated <code>UserSummaryData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('kycStatus')) {
        obj['kycStatus'] = ApiClient.convertToType(data['kycStatus'], 'String');
      }
      if (data.hasOwnProperty('bankLinkStatus')) {
        obj['bankLinkStatus'] = ApiClient.convertToType(data['bankLinkStatus'], 'String');
      }
      if (data.hasOwnProperty('tradeReady')) {
        obj['tradeReady'] = ApiClient.convertToType(data['tradeReady'], 'String');
      }
      if (data.hasOwnProperty('isDisabledAccount')) {
        obj['isDisabledAccount'] = ApiClient.convertToType(data['isDisabledAccount'], 'Boolean');
      }
      if (data.hasOwnProperty('faSecure')) {
        obj['faSecure'] = ApiClient.convertToType(data['faSecure'], 'String');
      }
      if (data.hasOwnProperty('hasPhone')) {
        obj['hasPhone'] = ApiClient.convertToType(data['hasPhone'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} kycStatus
   */
  exports.prototype['kycStatus'] = undefined;
  /**
   * @member {String} bankLinkStatus
   */
  exports.prototype['bankLinkStatus'] = undefined;
  /**
   * @member {String} tradeReady
   */
  exports.prototype['tradeReady'] = undefined;
  /**
   * @member {Boolean} isDisabledAccount
   * @default false
   */
  exports.prototype['isDisabledAccount'] = false;
  /**
   * @member {String} faSecure
   */
  exports.prototype['faSecure'] = undefined;
  /**
   * @member {String} hasPhone
   */
  exports.prototype['hasPhone'] = undefined;




  return exports;
}));


