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
    root.CoinsecureApiDocumentation.SuccessLoginResponse = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SuccessLoginResponse model module.
   * @module model/SuccessLoginResponse
   * @version 1.0b
   */

  /**
   * Constructs a new <code>SuccessLoginResponse</code>.
   * @alias module:model/SuccessLoginResponse
   * @class
   * @param info
   * @param keyType
   * @param keyNeeded
   */
  var exports = function(info, keyType, keyNeeded) {
    var _this = this;

    _this['info'] = info;
    _this['keyType'] = keyType;
    _this['keyNeeded'] = keyNeeded;
  };

  /**
   * Constructs a <code>SuccessLoginResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SuccessLoginResponse} obj Optional instance to populate.
   * @return {module:model/SuccessLoginResponse} The populated <code>SuccessLoginResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('info')) {
        obj['info'] = ApiClient.convertToType(data['info'], 'String');
      }
      if (data.hasOwnProperty('keyType')) {
        obj['keyType'] = ApiClient.convertToType(data['keyType'], 'String');
      }
      if (data.hasOwnProperty('keyNeeded')) {
        obj['keyNeeded'] = ApiClient.convertToType(data['keyNeeded'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} info
   */
  exports.prototype['info'] = undefined;
  /**
   * @member {String} keyType
   */
  exports.prototype['keyType'] = undefined;
  /**
   * @member {String} keyNeeded
   */
  exports.prototype['keyNeeded'] = undefined;




  return exports;
}));


