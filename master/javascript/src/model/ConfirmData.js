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
    root.CoinsecureApiDocumentation.ConfirmData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ConfirmData model module.
   * @module model/ConfirmData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>ConfirmData</code>.
   * @alias module:model/ConfirmData
   * @class
   * @param confirmations
   */
  var exports = function(confirmations) {
    var _this = this;

    _this['confirmations'] = confirmations;
  };

  /**
   * Constructs a <code>ConfirmData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ConfirmData} obj Optional instance to populate.
   * @return {module:model/ConfirmData} The populated <code>ConfirmData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('confirmations')) {
        obj['confirmations'] = ApiClient.convertToType(data['confirmations'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} confirmations
   */
  exports.prototype['confirmations'] = undefined;




  return exports;
}));


