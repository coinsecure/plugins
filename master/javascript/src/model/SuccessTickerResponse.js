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
    root.CoinsecureApiDocumentation.SuccessTickerResponse = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SuccessTickerResponse model module.
   * @module model/SuccessTickerResponse
   * @version 1.0b
   */

  /**
   * Constructs a new <code>SuccessTickerResponse</code>.
   * @alias module:model/SuccessTickerResponse
   * @class
   * @param lastPrice
   * @param timestamp
   * @param bid
   * @param ask
   * @param fiatVolume
   * @param coinVolume
   * @param open
   * @param high
   * @param low
   */
  var exports = function(lastPrice, timestamp, bid, ask, fiatVolume, coinVolume, open, high, low) {
    var _this = this;

    _this['lastPrice'] = lastPrice;
    _this['timestamp'] = timestamp;
    _this['bid'] = bid;
    _this['ask'] = ask;
    _this['fiatVolume'] = fiatVolume;
    _this['coinVolume'] = coinVolume;
    _this['open'] = open;
    _this['high'] = high;
    _this['low'] = low;
  };

  /**
   * Constructs a <code>SuccessTickerResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SuccessTickerResponse} obj Optional instance to populate.
   * @return {module:model/SuccessTickerResponse} The populated <code>SuccessTickerResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('lastPrice')) {
        obj['lastPrice'] = ApiClient.convertToType(data['lastPrice'], 'Integer');
      }
      if (data.hasOwnProperty('timestamp')) {
        obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Integer');
      }
      if (data.hasOwnProperty('bid')) {
        obj['bid'] = ApiClient.convertToType(data['bid'], 'Integer');
      }
      if (data.hasOwnProperty('ask')) {
        obj['ask'] = ApiClient.convertToType(data['ask'], 'Integer');
      }
      if (data.hasOwnProperty('fiatVolume')) {
        obj['fiatVolume'] = ApiClient.convertToType(data['fiatVolume'], 'Integer');
      }
      if (data.hasOwnProperty('coinVolume')) {
        obj['coinVolume'] = ApiClient.convertToType(data['coinVolume'], 'Integer');
      }
      if (data.hasOwnProperty('open')) {
        obj['open'] = ApiClient.convertToType(data['open'], 'Integer');
      }
      if (data.hasOwnProperty('high')) {
        obj['high'] = ApiClient.convertToType(data['high'], 'Integer');
      }
      if (data.hasOwnProperty('low')) {
        obj['low'] = ApiClient.convertToType(data['low'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} lastPrice
   */
  exports.prototype['lastPrice'] = undefined;
  /**
   * @member {Integer} timestamp
   */
  exports.prototype['timestamp'] = undefined;
  /**
   * @member {Integer} bid
   */
  exports.prototype['bid'] = undefined;
  /**
   * @member {Integer} ask
   */
  exports.prototype['ask'] = undefined;
  /**
   * @member {Integer} fiatVolume
   */
  exports.prototype['fiatVolume'] = undefined;
  /**
   * @member {Integer} coinVolume
   */
  exports.prototype['coinVolume'] = undefined;
  /**
   * @member {Integer} open
   */
  exports.prototype['open'] = undefined;
  /**
   * @member {Integer} high
   */
  exports.prototype['high'] = undefined;
  /**
   * @member {Integer} low
   */
  exports.prototype['low'] = undefined;




  return exports;
}));


