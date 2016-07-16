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
    root.CoinsecureApiDocumentation.MinFiat = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The MinFiat model module.
   * @module model/MinFiat
   * @version 1.0b
   */

  /**
   * Constructs a new <code>MinFiat</code>.
   * @alias module:model/MinFiat
   * @class
   * @param minFiat
   */
  var exports = function(minFiat) {
    var _this = this;

    _this['minFiat'] = minFiat;
  };

  /**
   * Constructs a <code>MinFiat</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MinFiat} obj Optional instance to populate.
   * @return {module:model/MinFiat} The populated <code>MinFiat</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('minFiat')) {
        obj['minFiat'] = ApiClient.convertToType(data['minFiat'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} minFiat
   */
  exports.prototype['minFiat'] = undefined;




  return exports;
}));


