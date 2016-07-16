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
    root.CoinsecureApiDocumentation.SuccessInitiateLoginResponse = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SuccessInitiateLoginResponse model module.
   * @module model/SuccessInitiateLoginResponse
   * @version 1.0b
   */

  /**
   * Constructs a new <code>SuccessInitiateLoginResponse</code>.
   * @alias module:model/SuccessInitiateLoginResponse
   * @class
   * @param info
   * @param validTill
   * @param mfa
   * @param token
   */
  var exports = function(info, validTill, mfa, token) {
    var _this = this;

    _this['info'] = info;
    _this['validTill'] = validTill;
    _this['mfa'] = mfa;
    _this['token'] = token;
  };

  /**
   * Constructs a <code>SuccessInitiateLoginResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SuccessInitiateLoginResponse} obj Optional instance to populate.
   * @return {module:model/SuccessInitiateLoginResponse} The populated <code>SuccessInitiateLoginResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('info')) {
        obj['info'] = ApiClient.convertToType(data['info'], 'String');
      }
      if (data.hasOwnProperty('validTill')) {
        obj['validTill'] = ApiClient.convertToType(data['validTill'], 'Integer');
      }
      if (data.hasOwnProperty('mfa')) {
        obj['mfa'] = ApiClient.convertToType(data['mfa'], 'String');
      }
      if (data.hasOwnProperty('token')) {
        obj['token'] = ApiClient.convertToType(data['token'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} info
   */
  exports.prototype['info'] = undefined;
  /**
   * @member {Integer} validTill
   */
  exports.prototype['validTill'] = undefined;
  /**
   * @member {String} mfa
   */
  exports.prototype['mfa'] = undefined;
  /**
   * @member {String} token
   */
  exports.prototype['token'] = undefined;




  return exports;
}));


