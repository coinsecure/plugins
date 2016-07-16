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
    root.CoinsecureApiDocumentation.RateVolData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The RateVolData model module.
   * @module model/RateVolData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>RateVolData</code>.
   * @alias module:model/RateVolData
   * @class
   * @param rate
   * @param vol
   */
  var exports = function(rate, vol) {
    var _this = this;

    _this['rate'] = rate;
    _this['vol'] = vol;
  };

  /**
   * Constructs a <code>RateVolData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RateVolData} obj Optional instance to populate.
   * @return {module:model/RateVolData} The populated <code>RateVolData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('rate')) {
        obj['rate'] = ApiClient.convertToType(data['rate'], 'Integer');
      }
      if (data.hasOwnProperty('vol')) {
        obj['vol'] = ApiClient.convertToType(data['vol'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} rate
   */
  exports.prototype['rate'] = undefined;
  /**
   * @member {Integer} vol
   */
  exports.prototype['vol'] = undefined;




  return exports;
}));


