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
    root.CoinsecureApiDocumentation.LoginId = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The LoginId model module.
   * @module model/LoginId
   * @version 1.0b
   */

  /**
   * Constructs a new <code>LoginId</code>.
   * @alias module:model/LoginId
   * @class
   * @param loginID
   */
  var exports = function(loginID) {
    var _this = this;

    _this['loginID'] = loginID;
  };

  /**
   * Constructs a <code>LoginId</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LoginId} obj Optional instance to populate.
   * @return {module:model/LoginId} The populated <code>LoginId</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('loginID')) {
        obj['loginID'] = ApiClient.convertToType(data['loginID'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} loginID
   */
  exports.prototype['loginID'] = undefined;




  return exports;
}));


