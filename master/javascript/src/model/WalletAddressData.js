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
    root.CoinsecureApiDocumentation.WalletAddressData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The WalletAddressData model module.
   * @module model/WalletAddressData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>WalletAddressData</code>.
   * @alias module:model/WalletAddressData
   * @class
   * @param walletID
   * @param address
   * @param time
   * @param info
   * @param minConf
   * @param netki
   */
  var exports = function(walletID, address, time, info, minConf, netki) {
    var _this = this;

    _this['walletID'] = walletID;
    _this['address'] = address;
    _this['time'] = time;
    _this['info'] = info;
    _this['minConf'] = minConf;
    _this['netki'] = netki;
  };

  /**
   * Constructs a <code>WalletAddressData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WalletAddressData} obj Optional instance to populate.
   * @return {module:model/WalletAddressData} The populated <code>WalletAddressData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('walletID')) {
        obj['walletID'] = ApiClient.convertToType(data['walletID'], 'String');
      }
      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Integer');
      }
      if (data.hasOwnProperty('info')) {
        obj['info'] = ApiClient.convertToType(data['info'], 'String');
      }
      if (data.hasOwnProperty('minConf')) {
        obj['minConf'] = ApiClient.convertToType(data['minConf'], 'Integer');
      }
      if (data.hasOwnProperty('netki')) {
        obj['netki'] = ApiClient.convertToType(data['netki'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} walletID
   */
  exports.prototype['walletID'] = undefined;
  /**
   * @member {String} address
   */
  exports.prototype['address'] = undefined;
  /**
   * @member {Integer} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {String} info
   */
  exports.prototype['info'] = undefined;
  /**
   * @member {Integer} minConf
   */
  exports.prototype['minConf'] = undefined;
  /**
   * @member {String} netki
   */
  exports.prototype['netki'] = undefined;




  return exports;
}));


