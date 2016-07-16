(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinMerchantApiDocumentation) {
      root.CoinMerchantApiDocumentation = {};
    }
    root.CoinMerchantApiDocumentation.Invoice = factory(root.CoinMerchantApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Invoice model module.
   * @module model/Invoice
   * @version 1.0B
   */

  /**
   * Constructs a new <code>Invoice</code>.
   * @alias module:model/Invoice
   * @class
   * @param address
   * @param buyerEmail
   * @param cancelURL
   * @param expireTime
   * @param succURL
   * @param invoiceID
   * @param bitpayInvoiceID
   * @param notifyEmail
   * @param status
   * @param time
   * @param fiatCents
   * @param satoshis
   * @param info
   */
  var exports = function(address, buyerEmail, cancelURL, expireTime, succURL, invoiceID, bitpayInvoiceID, notifyEmail, status, time, fiatCents, satoshis, info) {
    var _this = this;

    _this['address'] = address;
    _this['buyerEmail'] = buyerEmail;
    _this['cancelURL'] = cancelURL;
    _this['expireTime'] = expireTime;
    _this['succURL'] = succURL;
    _this['invoiceID'] = invoiceID;
    _this['bitpayInvoiceID'] = bitpayInvoiceID;
    _this['notifyEmail'] = notifyEmail;
    _this['status'] = status;
    _this['time'] = time;
    _this['fiatCents'] = fiatCents;
    _this['satoshis'] = satoshis;
    _this['info'] = info;
  };

  /**
   * Constructs a <code>Invoice</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Invoice} obj Optional instance to populate.
   * @return {module:model/Invoice} The populated <code>Invoice</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
      if (data.hasOwnProperty('buyerEmail')) {
        obj['buyerEmail'] = ApiClient.convertToType(data['buyerEmail'], 'String');
      }
      if (data.hasOwnProperty('cancelURL')) {
        obj['cancelURL'] = ApiClient.convertToType(data['cancelURL'], 'String');
      }
      if (data.hasOwnProperty('expireTime')) {
        obj['expireTime'] = ApiClient.convertToType(data['expireTime'], 'String');
      }
      if (data.hasOwnProperty('succURL')) {
        obj['succURL'] = ApiClient.convertToType(data['succURL'], 'String');
      }
      if (data.hasOwnProperty('invoiceID')) {
        obj['invoiceID'] = ApiClient.convertToType(data['invoiceID'], 'String');
      }
      if (data.hasOwnProperty('bitpayInvoiceID')) {
        obj['bitpayInvoiceID'] = ApiClient.convertToType(data['bitpayInvoiceID'], 'String');
      }
      if (data.hasOwnProperty('notifyEmail')) {
        obj['notifyEmail'] = ApiClient.convertToType(data['notifyEmail'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'String');
      }
      if (data.hasOwnProperty('fiatCents')) {
        obj['fiatCents'] = ApiClient.convertToType(data['fiatCents'], 'String');
      }
      if (data.hasOwnProperty('satoshis')) {
        obj['satoshis'] = ApiClient.convertToType(data['satoshis'], 'String');
      }
      if (data.hasOwnProperty('info')) {
        obj['info'] = ApiClient.convertToType(data['info'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} address
   */
  exports.prototype['address'] = undefined;
  /**
   * @member {String} buyerEmail
   */
  exports.prototype['buyerEmail'] = undefined;
  /**
   * @member {String} cancelURL
   */
  exports.prototype['cancelURL'] = undefined;
  /**
   * @member {String} expireTime
   */
  exports.prototype['expireTime'] = undefined;
  /**
   * @member {String} succURL
   */
  exports.prototype['succURL'] = undefined;
  /**
   * @member {String} invoiceID
   */
  exports.prototype['invoiceID'] = undefined;
  /**
   * @member {String} bitpayInvoiceID
   */
  exports.prototype['bitpayInvoiceID'] = undefined;
  /**
   * @member {String} notifyEmail
   */
  exports.prototype['notifyEmail'] = undefined;
  /**
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * @member {String} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {String} fiatCents
   */
  exports.prototype['fiatCents'] = undefined;
  /**
   * @member {String} satoshis
   */
  exports.prototype['satoshis'] = undefined;
  /**
   * @member {String} info
   */
  exports.prototype['info'] = undefined;




  return exports;
}));


