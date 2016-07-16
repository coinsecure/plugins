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
    root.CoinsecureApiDocumentation.ValidAddressSearchData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ValidAddressSearchData model module.
   * @module model/ValidAddressSearchData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>ValidAddressSearchData</code>.
   * @alias module:model/ValidAddressSearchData
   * @class
   * @param address
   * @param balance
   * @param totalReceived
   * @param unconfirmedBalance
   * @param unconfirmedTxApperances
   * @param txApperances
   * @param transactions
   */
  var exports = function(address, balance, totalReceived, unconfirmedBalance, unconfirmedTxApperances, txApperances, transactions) {
    var _this = this;

    _this['address'] = address;
    _this['balance'] = balance;
    _this['totalReceived'] = totalReceived;
    _this['unconfirmedBalance'] = unconfirmedBalance;
    _this['unconfirmedTxApperances'] = unconfirmedTxApperances;
    _this['txApperances'] = txApperances;
    _this['transactions'] = transactions;
  };

  /**
   * Constructs a <code>ValidAddressSearchData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ValidAddressSearchData} obj Optional instance to populate.
   * @return {module:model/ValidAddressSearchData} The populated <code>ValidAddressSearchData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
      if (data.hasOwnProperty('balance')) {
        obj['balance'] = ApiClient.convertToType(data['balance'], 'Integer');
      }
      if (data.hasOwnProperty('totalReceived')) {
        obj['totalReceived'] = ApiClient.convertToType(data['totalReceived'], 'Integer');
      }
      if (data.hasOwnProperty('unconfirmedBalance')) {
        obj['unconfirmedBalance'] = ApiClient.convertToType(data['unconfirmedBalance'], 'Integer');
      }
      if (data.hasOwnProperty('unconfirmedTxApperances')) {
        obj['unconfirmedTxApperances'] = ApiClient.convertToType(data['unconfirmedTxApperances'], 'Integer');
      }
      if (data.hasOwnProperty('txApperances')) {
        obj['txApperances'] = ApiClient.convertToType(data['txApperances'], 'Integer');
      }
      if (data.hasOwnProperty('transactions')) {
        obj['transactions'] = ApiClient.convertToType(data['transactions'], ['String']);
      }
    }
    return obj;
  }

  /**
   * @member {String} address
   */
  exports.prototype['address'] = undefined;
  /**
   * @member {Integer} balance
   */
  exports.prototype['balance'] = undefined;
  /**
   * @member {Integer} totalReceived
   */
  exports.prototype['totalReceived'] = undefined;
  /**
   * @member {Integer} unconfirmedBalance
   */
  exports.prototype['unconfirmedBalance'] = undefined;
  /**
   * @member {Integer} unconfirmedTxApperances
   */
  exports.prototype['unconfirmedTxApperances'] = undefined;
  /**
   * @member {Integer} txApperances
   */
  exports.prototype['txApperances'] = undefined;
  /**
   * @member {Array.<String>} transactions
   */
  exports.prototype['transactions'] = undefined;




  return exports;
}));


