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
    root.CoinsecureApiDocumentation.LastTradeData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The LastTradeData model module.
   * @module model/LastTradeData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>LastTradeData</code>.
   * @alias module:model/LastTradeData
   * @class
   * @param time
   * @param avgRate
   * @param vol
   * @param ordType
   */
  var exports = function(time, avgRate, vol, ordType) {
    var _this = this;

    _this['time'] = time;
    _this['avgRate'] = avgRate;
    _this['vol'] = vol;
    _this['ordType'] = ordType;
  };

  /**
   * Constructs a <code>LastTradeData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LastTradeData} obj Optional instance to populate.
   * @return {module:model/LastTradeData} The populated <code>LastTradeData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Integer');
      }
      if (data.hasOwnProperty('avgRate')) {
        obj['avgRate'] = ApiClient.convertToType(data['avgRate'], 'Integer');
      }
      if (data.hasOwnProperty('vol')) {
        obj['vol'] = ApiClient.convertToType(data['vol'], 'Integer');
      }
      if (data.hasOwnProperty('ordType')) {
        obj['ordType'] = ApiClient.convertToType(data['ordType'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {Integer} avgRate
   */
  exports.prototype['avgRate'] = undefined;
  /**
   * @member {Integer} vol
   */
  exports.prototype['vol'] = undefined;
  /**
   * @member {String} ordType
   */
  exports.prototype['ordType'] = undefined;




  return exports;
}));


