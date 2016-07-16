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
    root.CoinsecureApiDocumentation.BankSummaryData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The BankSummaryData model module.
   * @module model/BankSummaryData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>BankSummaryData</code>.
   * @alias module:model/BankSummaryData
   * @class
   * @param pendingCoinBalance
   * @param pendingFiatBalance
   * @param availableCoinBalance
   * @param availableFiatBalance
   * @param totalCoinBalance
   * @param totalFiatBalance
   * @param coinFeePercentage
   * @param fiatFeePercentage
   * @param bankLinkStatus
   * @param hasTradeNetki
   * @param tradeNetkiName
   * @param tradeNetkiAddress
   */
  var exports = function(pendingCoinBalance, pendingFiatBalance, availableCoinBalance, availableFiatBalance, totalCoinBalance, totalFiatBalance, coinFeePercentage, fiatFeePercentage, bankLinkStatus, hasTradeNetki, tradeNetkiName, tradeNetkiAddress) {
    var _this = this;

    _this['pendingCoinBalance'] = pendingCoinBalance;
    _this['pendingFiatBalance'] = pendingFiatBalance;
    _this['availableCoinBalance'] = availableCoinBalance;
    _this['availableFiatBalance'] = availableFiatBalance;
    _this['totalCoinBalance'] = totalCoinBalance;
    _this['totalFiatBalance'] = totalFiatBalance;
    _this['coinFeePercentage'] = coinFeePercentage;
    _this['fiatFeePercentage'] = fiatFeePercentage;
    _this['bankLinkStatus'] = bankLinkStatus;
    _this['hasTradeNetki'] = hasTradeNetki;
    _this['tradeNetkiName'] = tradeNetkiName;
    _this['tradeNetkiAddress'] = tradeNetkiAddress;
  };

  /**
   * Constructs a <code>BankSummaryData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BankSummaryData} obj Optional instance to populate.
   * @return {module:model/BankSummaryData} The populated <code>BankSummaryData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('pendingCoinBalance')) {
        obj['pendingCoinBalance'] = ApiClient.convertToType(data['pendingCoinBalance'], 'Integer');
      }
      if (data.hasOwnProperty('pendingFiatBalance')) {
        obj['pendingFiatBalance'] = ApiClient.convertToType(data['pendingFiatBalance'], 'Integer');
      }
      if (data.hasOwnProperty('availableCoinBalance')) {
        obj['availableCoinBalance'] = ApiClient.convertToType(data['availableCoinBalance'], 'Integer');
      }
      if (data.hasOwnProperty('availableFiatBalance')) {
        obj['availableFiatBalance'] = ApiClient.convertToType(data['availableFiatBalance'], 'Integer');
      }
      if (data.hasOwnProperty('totalCoinBalance')) {
        obj['totalCoinBalance'] = ApiClient.convertToType(data['totalCoinBalance'], 'Integer');
      }
      if (data.hasOwnProperty('totalFiatBalance')) {
        obj['totalFiatBalance'] = ApiClient.convertToType(data['totalFiatBalance'], 'Integer');
      }
      if (data.hasOwnProperty('coinFeePercentage')) {
        obj['coinFeePercentage'] = ApiClient.convertToType(data['coinFeePercentage'], 'Number');
      }
      if (data.hasOwnProperty('fiatFeePercentage')) {
        obj['fiatFeePercentage'] = ApiClient.convertToType(data['fiatFeePercentage'], 'Number');
      }
      if (data.hasOwnProperty('bankLinkStatus')) {
        obj['bankLinkStatus'] = ApiClient.convertToType(data['bankLinkStatus'], 'String');
      }
      if (data.hasOwnProperty('hasTradeNetki')) {
        obj['hasTradeNetki'] = ApiClient.convertToType(data['hasTradeNetki'], 'Boolean');
      }
      if (data.hasOwnProperty('tradeNetkiName')) {
        obj['tradeNetkiName'] = ApiClient.convertToType(data['tradeNetkiName'], 'String');
      }
      if (data.hasOwnProperty('tradeNetkiAddress')) {
        obj['tradeNetkiAddress'] = ApiClient.convertToType(data['tradeNetkiAddress'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} pendingCoinBalance
   */
  exports.prototype['pendingCoinBalance'] = undefined;
  /**
   * @member {Integer} pendingFiatBalance
   */
  exports.prototype['pendingFiatBalance'] = undefined;
  /**
   * @member {Integer} availableCoinBalance
   */
  exports.prototype['availableCoinBalance'] = undefined;
  /**
   * @member {Integer} availableFiatBalance
   */
  exports.prototype['availableFiatBalance'] = undefined;
  /**
   * @member {Integer} totalCoinBalance
   */
  exports.prototype['totalCoinBalance'] = undefined;
  /**
   * @member {Integer} totalFiatBalance
   */
  exports.prototype['totalFiatBalance'] = undefined;
  /**
   * @member {Number} coinFeePercentage
   */
  exports.prototype['coinFeePercentage'] = undefined;
  /**
   * @member {Number} fiatFeePercentage
   */
  exports.prototype['fiatFeePercentage'] = undefined;
  /**
   * @member {String} bankLinkStatus
   */
  exports.prototype['bankLinkStatus'] = undefined;
  /**
   * @member {Boolean} hasTradeNetki
   * @default false
   */
  exports.prototype['hasTradeNetki'] = false;
  /**
   * @member {String} tradeNetkiName
   */
  exports.prototype['tradeNetkiName'] = undefined;
  /**
   * @member {String} tradeNetkiAddress
   */
  exports.prototype['tradeNetkiAddress'] = undefined;




  return exports;
}));


