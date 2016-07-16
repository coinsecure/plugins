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
    root.CoinsecureApiDocumentation.SignupForm = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SignupForm model module.
   * @module model/SignupForm
   * @version 1.0b
   */

  /**
   * Constructs a new <code>SignupForm</code>.
   * @alias module:model/SignupForm
   * @class
   * @param name
   * @param email
   * @param password
   * @param repeatPassword
   */
  var exports = function(name, email, password, repeatPassword) {
    var _this = this;

    _this['name'] = name;
    _this['email'] = email;
    _this['password'] = password;
    _this['repeatPassword'] = repeatPassword;

  };

  /**
   * Constructs a <code>SignupForm</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SignupForm} obj Optional instance to populate.
   * @return {module:model/SignupForm} The populated <code>SignupForm</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('email')) {
        obj['email'] = ApiClient.convertToType(data['email'], 'String');
      }
      if (data.hasOwnProperty('password')) {
        obj['password'] = ApiClient.convertToType(data['password'], 'String');
      }
      if (data.hasOwnProperty('repeatPassword')) {
        obj['repeatPassword'] = ApiClient.convertToType(data['repeatPassword'], 'String');
      }
      if (data.hasOwnProperty('refID')) {
        obj['refID'] = ApiClient.convertToType(data['refID'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} email
   */
  exports.prototype['email'] = undefined;
  /**
   * @member {String} password
   */
  exports.prototype['password'] = undefined;
  /**
   * @member {String} repeatPassword
   */
  exports.prototype['repeatPassword'] = undefined;
  /**
   * @member {String} refID
   */
  exports.prototype['refID'] = undefined;




  return exports;
}));


