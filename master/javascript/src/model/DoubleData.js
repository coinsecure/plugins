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
    root.CoinsecureApiDocumentation.DoubleData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The DoubleData model module.
   * @module model/DoubleData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>DoubleData</code>.
   * @alias module:model/DoubleData
   * @class
   * @param percent
   */
  var exports = function(percent) {
    var _this = this;

    _this['percent'] = percent;
  };

  /**
   * Constructs a <code>DoubleData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DoubleData} obj Optional instance to populate.
   * @return {module:model/DoubleData} The populated <code>DoubleData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('percent')) {
        obj['percent'] = ApiClient.convertToType(data['percent'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {Number} percent
   */
  exports.prototype['percent'] = undefined;




  return exports;
}));


