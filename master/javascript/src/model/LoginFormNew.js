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
    root.CoinsecureApiDocumentation.LoginFormNew = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The LoginFormNew model module.
   * @module model/LoginFormNew
   * @version 1.0b
   */

  /**
   * Constructs a new <code>LoginFormNew</code>.
   * @alias module:model/LoginFormNew
   * @class
   * @param email
   * @param token
   * @param password
   */
  var exports = function(email, token, password) {
    var _this = this;

    _this['email'] = email;
    _this['token'] = token;
    _this['password'] = password;


  };

  /**
   * Constructs a <code>LoginFormNew</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LoginFormNew} obj Optional instance to populate.
   * @return {module:model/LoginFormNew} The populated <code>LoginFormNew</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('email')) {
        obj['email'] = ApiClient.convertToType(data['email'], 'String');
      }
      if (data.hasOwnProperty('token')) {
        obj['token'] = ApiClient.convertToType(data['token'], 'String');
      }
      if (data.hasOwnProperty('password')) {
        obj['password'] = ApiClient.convertToType(data['password'], 'String');
      }
      if (data.hasOwnProperty('gcmCode')) {
        obj['gcmCode'] = ApiClient.convertToType(data['gcmCode'], 'String');
      }
      if (data.hasOwnProperty('pin')) {
        obj['pin'] = ApiClient.convertToType(data['pin'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} email
   */
  exports.prototype['email'] = undefined;
  /**
   * @member {String} token
   */
  exports.prototype['token'] = undefined;
  /**
   * @member {String} password
   */
  exports.prototype['password'] = undefined;
  /**
   * @member {String} gcmCode
   */
  exports.prototype['gcmCode'] = undefined;
  /**
   * @member {String} pin
   */
  exports.prototype['pin'] = undefined;




  return exports;
}));


