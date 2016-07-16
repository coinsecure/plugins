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
    root.CoinMerchantApiDocumentation.NewInvoice = factory(root.CoinMerchantApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The NewInvoice model module.
   * @module model/NewInvoice
   * @version 1.0B
   */

  /**
   * Constructs a new <code>NewInvoice</code>.
   * @alias module:model/NewInvoice
   * @class
   * @param orderID
   * @param fiat
   * @param succURL
   * @param cancelURL
   * @param buyerEmail
   * @param notifyEmail
   * @param info
   */
  var exports = function(orderID, fiat, succURL, cancelURL, buyerEmail, notifyEmail, info) {
    var _this = this;

    _this['orderID'] = orderID;
    _this['fiat'] = fiat;
    _this['succURL'] = succURL;
    _this['cancelURL'] = cancelURL;
    _this['buyerEmail'] = buyerEmail;
    _this['notifyEmail'] = notifyEmail;
    _this['info'] = info;
  };

  /**
   * Constructs a <code>NewInvoice</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NewInvoice} obj Optional instance to populate.
   * @return {module:model/NewInvoice} The populated <code>NewInvoice</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('orderID')) {
        obj['orderID'] = ApiClient.convertToType(data['orderID'], 'String');
      }
      if (data.hasOwnProperty('fiat')) {
        obj['fiat'] = ApiClient.convertToType(data['fiat'], 'Integer');
      }
      if (data.hasOwnProperty('succURL')) {
        obj['succURL'] = ApiClient.convertToType(data['succURL'], 'String');
      }
      if (data.hasOwnProperty('cancelURL')) {
        obj['cancelURL'] = ApiClient.convertToType(data['cancelURL'], 'String');
      }
      if (data.hasOwnProperty('buyerEmail')) {
        obj['buyerEmail'] = ApiClient.convertToType(data['buyerEmail'], 'String');
      }
      if (data.hasOwnProperty('notifyEmail')) {
        obj['notifyEmail'] = ApiClient.convertToType(data['notifyEmail'], 'String');
      }
      if (data.hasOwnProperty('info')) {
        obj['info'] = ApiClient.convertToType(data['info'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} orderID
   */
  exports.prototype['orderID'] = undefined;
  /**
   * @member {Integer} fiat
   */
  exports.prototype['fiat'] = undefined;
  /**
   * @member {String} succURL
   */
  exports.prototype['succURL'] = undefined;
  /**
   * @member {String} cancelURL
   */
  exports.prototype['cancelURL'] = undefined;
  /**
   * @member {String} buyerEmail
   */
  exports.prototype['buyerEmail'] = undefined;
  /**
   * @member {String} notifyEmail
   */
  exports.prototype['notifyEmail'] = undefined;
  /**
   * @member {String} info
   */
  exports.prototype['info'] = undefined;




  return exports;
}));


