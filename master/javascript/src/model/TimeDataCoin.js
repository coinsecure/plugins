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
    root.CoinsecureApiDocumentation.TimeDataCoin = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The TimeDataCoin model module.
   * @module model/TimeDataCoin
   * @version 1.0b
   */

  /**
   * Constructs a new <code>TimeDataCoin</code>.
   * @alias module:model/TimeDataCoin
   * @class
   * @param time
   * @param verifiedTime
   */
  var exports = function(time, verifiedTime) {
    var _this = this;

    _this['time'] = time;
    _this['verifiedTime'] = verifiedTime;
  };

  /**
   * Constructs a <code>TimeDataCoin</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TimeDataCoin} obj Optional instance to populate.
   * @return {module:model/TimeDataCoin} The populated <code>TimeDataCoin</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Integer');
      }
      if (data.hasOwnProperty('verifiedTime')) {
        obj['verifiedTime'] = ApiClient.convertToType(data['verifiedTime'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {Integer} verifiedTime
   */
  exports.prototype['verifiedTime'] = undefined;




  return exports;
}));


