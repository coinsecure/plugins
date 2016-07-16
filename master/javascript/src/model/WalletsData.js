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
    root.CoinsecureApiDocumentation.WalletsData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The WalletsData model module.
   * @module model/WalletsData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>WalletsData</code>.
   * @alias module:model/WalletsData
   * @class
   * @param walletID
   * @param name
   * @param coinBalance
   * @param time
   * @param info
   * @param netki
   */
  var exports = function(walletID, name, coinBalance, time, info, netki) {
    var _this = this;

    _this['walletID'] = walletID;
    _this['name'] = name;
    _this['coinBalance'] = coinBalance;
    _this['time'] = time;
    _this['info'] = info;
    _this['netki'] = netki;
  };

  /**
   * Constructs a <code>WalletsData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WalletsData} obj Optional instance to populate.
   * @return {module:model/WalletsData} The populated <code>WalletsData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('walletID')) {
        obj['walletID'] = ApiClient.convertToType(data['walletID'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('coinBalance')) {
        obj['coinBalance'] = ApiClient.convertToType(data['coinBalance'], 'Integer');
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
   * @member {String} walletID
   */
  exports.prototype['walletID'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {Integer} coinBalance
   */
  exports.prototype['coinBalance'] = undefined;
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


