(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/TimeData'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TimeData'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.WalletCoinWithdrawData = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.TimeData);
  }
}(this, function(ApiClient, TimeData) {
  'use strict';




  /**
   * The WalletCoinWithdrawData model module.
   * @module model/WalletCoinWithdrawData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>WalletCoinWithdrawData</code>.
   * @alias module:model/WalletCoinWithdrawData
   * @class
   * @param timeDetails
   * @param txID
   * @param message
   * @param satoshis
   * @param walletID
   * @param withdrawID
   * @param sentTo
   */
  var exports = function(timeDetails, txID, message, satoshis, walletID, withdrawID, sentTo) {
    var _this = this;

    _this['timeDetails'] = timeDetails;
    _this['txID'] = txID;
    _this['message'] = message;
    _this['satoshis'] = satoshis;
    _this['walletID'] = walletID;
    _this['withdrawID'] = withdrawID;
    _this['sentTo'] = sentTo;
  };

  /**
   * Constructs a <code>WalletCoinWithdrawData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WalletCoinWithdrawData} obj Optional instance to populate.
   * @return {module:model/WalletCoinWithdrawData} The populated <code>WalletCoinWithdrawData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('timeDetails')) {
        obj['timeDetails'] = TimeData.constructFromObject(data['timeDetails']);
      }
      if (data.hasOwnProperty('txID')) {
        obj['txID'] = ApiClient.convertToType(data['txID'], 'String');
      }
      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
      if (data.hasOwnProperty('satoshis')) {
        obj['satoshis'] = ApiClient.convertToType(data['satoshis'], 'Integer');
      }
      if (data.hasOwnProperty('walletID')) {
        obj['walletID'] = ApiClient.convertToType(data['walletID'], 'String');
      }
      if (data.hasOwnProperty('withdrawID')) {
        obj['withdrawID'] = ApiClient.convertToType(data['withdrawID'], 'String');
      }
      if (data.hasOwnProperty('sentTo')) {
        obj['sentTo'] = ApiClient.convertToType(data['sentTo'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {module:model/TimeData} timeDetails
   */
  exports.prototype['timeDetails'] = undefined;
  /**
   * @member {String} txID
   */
  exports.prototype['txID'] = undefined;
  /**
   * @member {String} message
   */
  exports.prototype['message'] = undefined;
  /**
   * @member {Integer} satoshis
   */
  exports.prototype['satoshis'] = undefined;
  /**
   * @member {String} walletID
   */
  exports.prototype['walletID'] = undefined;
  /**
   * @member {String} withdrawID
   */
  exports.prototype['withdrawID'] = undefined;
  /**
   * @member {String} sentTo
   */
  exports.prototype['sentTo'] = undefined;




  return exports;
}));


