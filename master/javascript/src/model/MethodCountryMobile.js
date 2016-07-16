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
    root.CoinsecureApiDocumentation.MethodCountryMobile = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The MethodCountryMobile model module.
   * @module model/MethodCountryMobile
   * @version 1.0b
   */

  /**
   * Constructs a new <code>MethodCountryMobile</code>.
   * @alias module:model/MethodCountryMobile
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>MethodCountryMobile</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MethodCountryMobile} obj Optional instance to populate.
   * @return {module:model/MethodCountryMobile} The populated <code>MethodCountryMobile</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('method')) {
        obj['method'] = ApiClient.convertToType(data['method'], 'String');
      }
      if (data.hasOwnProperty('countryCode')) {
        obj['countryCode'] = ApiClient.convertToType(data['countryCode'], 'Integer');
      }
      if (data.hasOwnProperty('phoneNumber')) {
        obj['phoneNumber'] = ApiClient.convertToType(data['phoneNumber'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {String} method
   */
  exports.prototype['method'] = undefined;
  /**
   * @member {Integer} countryCode
   */
  exports.prototype['countryCode'] = undefined;
  /**
   * @member {Integer} phoneNumber
   */
  exports.prototype['phoneNumber'] = undefined;




  return exports;
}));


