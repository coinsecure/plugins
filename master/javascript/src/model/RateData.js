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
    root.CoinsecureApiDocumentation.RateData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The RateData model module.
   * @module model/RateData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>RateData</code>.
   * @alias module:model/RateData
   * @class
   * @param rate
   */
  var exports = function(rate) {
    var _this = this;

    _this['rate'] = rate;
  };

  /**
   * Constructs a <code>RateData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RateData} obj Optional instance to populate.
   * @return {module:model/RateData} The populated <code>RateData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('rate')) {
        obj['rate'] = ApiClient.convertToType(data['rate'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} rate
   */
  exports.prototype['rate'] = undefined;




  return exports;
}));


