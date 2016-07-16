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
    root.CoinsecureApiDocumentation.VolData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The VolData model module.
   * @module model/VolData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>VolData</code>.
   * @alias module:model/VolData
   * @class
   * @param vol
   */
  var exports = function(vol) {
    var _this = this;

    _this['vol'] = vol;
  };

  /**
   * Constructs a <code>VolData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/VolData} obj Optional instance to populate.
   * @return {module:model/VolData} The populated <code>VolData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('vol')) {
        obj['vol'] = ApiClient.convertToType(data['vol'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} vol
   */
  exports.prototype['vol'] = undefined;




  return exports;
}));


