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
    root.CoinsecureApiDocumentation.TradeAddressData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The TradeAddressData model module.
   * @module model/TradeAddressData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>TradeAddressData</code>.
   * @alias module:model/TradeAddressData
   * @class
   * @param address
   * @param time
   * @param info
   * @param netki
   */
  var exports = function(address, time, info, netki) {
    var _this = this;

    _this['address'] = address;
    _this['time'] = time;
    _this['info'] = info;
    _this['netki'] = netki;
  };

  /**
   * Constructs a <code>TradeAddressData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TradeAddressData} obj Optional instance to populate.
   * @return {module:model/TradeAddressData} The populated <code>TradeAddressData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Integer');
      }
      if (data.hasOwnProperty('info')) {
        obj['info'] = ApiClient.convertToType(data['info'], 'String');
      }
      if (data.hasOwnProperty('netki')) {
        obj['netki'] = ApiClient.convertToType(data['netki'], 'String');
      }
    }
    return obj;
  }

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
   * @member {String} netki
   */
  exports.prototype['netki'] = undefined;




  return exports;
}));


