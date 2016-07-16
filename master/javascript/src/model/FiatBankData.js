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
    root.CoinsecureApiDocumentation.FiatBankData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The FiatBankData model module.
   * @module model/FiatBankData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>FiatBankData</code>.
   * @alias module:model/FiatBankData
   * @class
   * @param time
   * @param status
   * @param updateTime
   * @param updateMessage
   * @param bankID
   * @param info
   * @param accountNumber
   * @param accountNick
   * @param accountType
   */
  var exports = function(time, status, updateTime, updateMessage, bankID, info, accountNumber, accountNick, accountType) {
    var _this = this;

    _this['time'] = time;
    _this['status'] = status;
    _this['updateTime'] = updateTime;
    _this['updateMessage'] = updateMessage;
    _this['bankID'] = bankID;
    _this['info'] = info;
    _this['accountNumber'] = accountNumber;
    _this['accountNick'] = accountNick;
    _this['accountType'] = accountType;
  };

  /**
   * Constructs a <code>FiatBankData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FiatBankData} obj Optional instance to populate.
   * @return {module:model/FiatBankData} The populated <code>FiatBankData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Integer');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('updateTime')) {
        obj['updateTime'] = ApiClient.convertToType(data['updateTime'], 'Integer');
      }
      if (data.hasOwnProperty('updateMessage')) {
        obj['updateMessage'] = ApiClient.convertToType(data['updateMessage'], 'String');
      }
      if (data.hasOwnProperty('bankID')) {
        obj['bankID'] = ApiClient.convertToType(data['bankID'], 'String');
      }
      if (data.hasOwnProperty('info')) {
        obj['info'] = ApiClient.convertToType(data['info'], 'String');
      }
      if (data.hasOwnProperty('accountNumber')) {
        obj['accountNumber'] = ApiClient.convertToType(data['accountNumber'], 'String');
      }
      if (data.hasOwnProperty('accountNick')) {
        obj['accountNick'] = ApiClient.convertToType(data['accountNick'], 'String');
      }
      if (data.hasOwnProperty('accountType')) {
        obj['accountType'] = ApiClient.convertToType(data['accountType'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * @member {Integer} updateTime
   */
  exports.prototype['updateTime'] = undefined;
  /**
   * @member {String} updateMessage
   */
  exports.prototype['updateMessage'] = undefined;
  /**
   * @member {String} bankID
   */
  exports.prototype['bankID'] = undefined;
  /**
   * @member {String} info
   */
  exports.prototype['info'] = undefined;
  /**
   * @member {String} accountNumber
   */
  exports.prototype['accountNumber'] = undefined;
  /**
   * @member {String} accountNick
   */
  exports.prototype['accountNick'] = undefined;
  /**
   * @member {String} accountType
   */
  exports.prototype['accountType'] = undefined;




  return exports;
}));


