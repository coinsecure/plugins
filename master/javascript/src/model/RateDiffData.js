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
    root.CoinsecureApiDocumentation.RateDiffData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The RateDiffData model module.
   * @module model/RateDiffData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>RateDiffData</code>.
   * @alias module:model/RateDiffData
   * @class
   * @param rate
   * @param difference
   */
  var exports = function(rate, difference) {
    var _this = this;

    _this['rate'] = rate;
    _this['difference'] = difference;
  };

  /**
   * Constructs a <code>RateDiffData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RateDiffData} obj Optional instance to populate.
   * @return {module:model/RateDiffData} The populated <code>RateDiffData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('rate')) {
        obj['rate'] = ApiClient.convertToType(data['rate'], 'Integer');
      }
      if (data.hasOwnProperty('difference')) {
        obj['difference'] = ApiClient.convertToType(data['difference'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} rate
   */
  exports.prototype['rate'] = undefined;
  /**
   * @member {Integer} difference
   */
  exports.prototype['difference'] = undefined;




  return exports;
}));


