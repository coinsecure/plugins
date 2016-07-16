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
    root.CoinsecureApiDocumentation.MaxVol = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The MaxVol model module.
   * @module model/MaxVol
   * @version 1.0b
   */

  /**
   * Constructs a new <code>MaxVol</code>.
   * @alias module:model/MaxVol
   * @class
   * @param maxVol
   */
  var exports = function(maxVol) {
    var _this = this;

    _this['maxVol'] = maxVol;
  };

  /**
   * Constructs a <code>MaxVol</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MaxVol} obj Optional instance to populate.
   * @return {module:model/MaxVol} The populated <code>MaxVol</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('maxVol')) {
        obj['maxVol'] = ApiClient.convertToType(data['maxVol'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} maxVol
   */
  exports.prototype['maxVol'] = undefined;




  return exports;
}));


