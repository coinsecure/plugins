(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/TimeDataCoin'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TimeDataCoin'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.FiatDepData = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.TimeDataCoin);
  }
}(this, function(ApiClient, TimeDataCoin) {
  'use strict';




  /**
   * The FiatDepData model module.
   * @module model/FiatDepData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>FiatDepData</code>.
   * @alias module:model/FiatDepData
   * @class
   * @param timeDetails
   * @param depositID
   * @param value
   * @param account
   * @param reason
   */
  var exports = function(timeDetails, depositID, value, account, reason) {
    var _this = this;

    _this['timeDetails'] = timeDetails;
    _this['depositID'] = depositID;
    _this['value'] = value;
    _this['account'] = account;
    _this['reason'] = reason;
  };

  /**
   * Constructs a <code>FiatDepData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FiatDepData} obj Optional instance to populate.
   * @return {module:model/FiatDepData} The populated <code>FiatDepData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('timeDetails')) {
        obj['timeDetails'] = TimeDataCoin.constructFromObject(data['timeDetails']);
      }
      if (data.hasOwnProperty('depositID')) {
        obj['depositID'] = ApiClient.convertToType(data['depositID'], 'String');
      }
      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'Integer');
      }
      if (data.hasOwnProperty('account')) {
        obj['account'] = ApiClient.convertToType(data['account'], 'String');
      }
      if (data.hasOwnProperty('reason')) {
        obj['reason'] = ApiClient.convertToType(data['reason'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {module:model/TimeDataCoin} timeDetails
   */
  exports.prototype['timeDetails'] = undefined;
  /**
   * @member {String} depositID
   */
  exports.prototype['depositID'] = undefined;
  /**
   * @member {Integer} value
   */
  exports.prototype['value'] = undefined;
  /**
   * @member {String} account
   */
  exports.prototype['account'] = undefined;
  /**
   * @member {String} reason
   */
  exports.prototype['reason'] = undefined;




  return exports;
}));


