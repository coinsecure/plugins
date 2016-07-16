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
    root.CoinsecureApiDocumentation.CodeCountryMobile = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CodeCountryMobile model module.
   * @module model/CodeCountryMobile
   * @version 1.0b
   */

  /**
   * Constructs a new <code>CodeCountryMobile</code>.
   * @alias module:model/CodeCountryMobile
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>CodeCountryMobile</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CodeCountryMobile} obj Optional instance to populate.
   * @return {module:model/CodeCountryMobile} The populated <code>CodeCountryMobile</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'String');
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
   * @member {String} code
   */
  exports.prototype['code'] = undefined;
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


