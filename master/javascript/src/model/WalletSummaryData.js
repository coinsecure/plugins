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
    root.CoinsecureApiDocumentation.WalletSummaryData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The WalletSummaryData model module.
   * @module model/WalletSummaryData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>WalletSummaryData</code>.
   * @alias module:model/WalletSummaryData
   * @class
   * @param walletConfirmedBalance
   * @param walletUncofirmedBalance
   * @param hasWalletNetki
   * @param walletNetki
   * @param walletNetkiAddress
   * @param walletNetkiWalletId
   */
  var exports = function(walletConfirmedBalance, walletUncofirmedBalance, hasWalletNetki, walletNetki, walletNetkiAddress, walletNetkiWalletId) {
    var _this = this;

    _this['walletConfirmedBalance'] = walletConfirmedBalance;
    _this['walletUncofirmedBalance'] = walletUncofirmedBalance;
    _this['hasWalletNetki'] = hasWalletNetki;
    _this['walletNetki'] = walletNetki;
    _this['walletNetkiAddress'] = walletNetkiAddress;
    _this['walletNetkiWalletId'] = walletNetkiWalletId;
  };

  /**
   * Constructs a <code>WalletSummaryData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WalletSummaryData} obj Optional instance to populate.
   * @return {module:model/WalletSummaryData} The populated <code>WalletSummaryData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('walletConfirmedBalance')) {
        obj['walletConfirmedBalance'] = ApiClient.convertToType(data['walletConfirmedBalance'], 'Integer');
      }
      if (data.hasOwnProperty('walletUncofirmedBalance')) {
        obj['walletUncofirmedBalance'] = ApiClient.convertToType(data['walletUncofirmedBalance'], 'Integer');
      }
      if (data.hasOwnProperty('hasWalletNetki')) {
        obj['hasWalletNetki'] = ApiClient.convertToType(data['hasWalletNetki'], 'Boolean');
      }
      if (data.hasOwnProperty('walletNetki')) {
        obj['walletNetki'] = ApiClient.convertToType(data['walletNetki'], 'String');
      }
      if (data.hasOwnProperty('walletNetkiAddress')) {
        obj['walletNetkiAddress'] = ApiClient.convertToType(data['walletNetkiAddress'], 'String');
      }
      if (data.hasOwnProperty('walletNetkiWalletId')) {
        obj['walletNetkiWalletId'] = ApiClient.convertToType(data['walletNetkiWalletId'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} walletConfirmedBalance
   */
  exports.prototype['walletConfirmedBalance'] = undefined;
  /**
   * @member {Integer} walletUncofirmedBalance
   */
  exports.prototype['walletUncofirmedBalance'] = undefined;
  /**
   * @member {Boolean} hasWalletNetki
   * @default false
   */
  exports.prototype['hasWalletNetki'] = false;
  /**
   * @member {String} walletNetki
   */
  exports.prototype['walletNetki'] = undefined;
  /**
   * @member {String} walletNetkiAddress
   */
  exports.prototype['walletNetkiAddress'] = undefined;
  /**
   * @member {String} walletNetkiWalletId
   */
  exports.prototype['walletNetkiWalletId'] = undefined;




  return exports;
}));


