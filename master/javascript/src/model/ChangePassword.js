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
    root.CoinsecureApiDocumentation.ChangePassword = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ChangePassword model module.
   * @module model/ChangePassword
   * @version 1.0b
   */

  /**
   * Constructs a new <code>ChangePassword</code>.
   * @alias module:model/ChangePassword
   * @class
   * @param password
   * @param repeatPassword
   */
  var exports = function(password, repeatPassword) {
    var _this = this;

    _this['password'] = password;
    _this['repeatPassword'] = repeatPassword;
  };

  /**
   * Constructs a <code>ChangePassword</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ChangePassword} obj Optional instance to populate.
   * @return {module:model/ChangePassword} The populated <code>ChangePassword</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('password')) {
        obj['password'] = ApiClient.convertToType(data['password'], 'String');
      }
      if (data.hasOwnProperty('repeatPassword')) {
        obj['repeatPassword'] = ApiClient.convertToType(data['repeatPassword'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} password
   */
  exports.prototype['password'] = undefined;
  /**
   * @member {String} repeatPassword
   */
  exports.prototype['repeatPassword'] = undefined;




  return exports;
}));


