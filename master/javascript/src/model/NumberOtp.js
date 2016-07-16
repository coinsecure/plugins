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
    root.CoinsecureApiDocumentation.NumberOtp = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The NumberOtp model module.
   * @module model/NumberOtp
   * @version 1.0b
   */

  /**
   * Constructs a new <code>NumberOtp</code>.
   * @alias module:model/NumberOtp
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>NumberOtp</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NumberOtp} obj Optional instance to populate.
   * @return {module:model/NumberOtp} The populated <code>NumberOtp</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('number')) {
        obj['number'] = ApiClient.convertToType(data['number'], 'String');
      }
      if (data.hasOwnProperty('otp')) {
        obj['otp'] = ApiClient.convertToType(data['otp'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} number
   */
  exports.prototype['number'] = undefined;
  /**
   * @member {String} otp
   */
  exports.prototype['otp'] = undefined;




  return exports;
}));


