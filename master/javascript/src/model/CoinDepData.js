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
    root.CoinsecureApiDocumentation.CoinDepData = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.TimeDataCoin);
  }
}(this, function(ApiClient, TimeDataCoin) {
  'use strict';




  /**
   * The CoinDepData model module.
   * @module model/CoinDepData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>CoinDepData</code>.
   * @alias module:model/CoinDepData
   * @class
   * @param timeDetails
   * @param address
   * @param value
   * @param txHash
   * @param depositID
   * @param reason
   */
  var exports = function(timeDetails, address, value, txHash, depositID, reason) {
    var _this = this;

    _this['timeDetails'] = timeDetails;
    _this['address'] = address;
    _this['value'] = value;
    _this['txHash'] = txHash;
    _this['depositID'] = depositID;
    _this['reason'] = reason;
  };

  /**
   * Constructs a <code>CoinDepData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CoinDepData} obj Optional instance to populate.
   * @return {module:model/CoinDepData} The populated <code>CoinDepData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('timeDetails')) {
        obj['timeDetails'] = TimeDataCoin.constructFromObject(data['timeDetails']);
      }
      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'Integer');
      }
      if (data.hasOwnProperty('txHash')) {
        obj['txHash'] = ApiClient.convertToType(data['txHash'], 'String');
      }
      if (data.hasOwnProperty('depositID')) {
        obj['depositID'] = ApiClient.convertToType(data['depositID'], 'String');
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
   * @member {String} address
   */
  exports.prototype['address'] = undefined;
  /**
   * @member {Integer} value
   */
  exports.prototype['value'] = undefined;
  /**
   * @member {String} txHash
   */
  exports.prototype['txHash'] = undefined;
  /**
   * @member {String} depositID
   */
  exports.prototype['depositID'] = undefined;
  /**
   * @member {String} reason
   */
  exports.prototype['reason'] = undefined;




  return exports;
}));


