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
    root.CoinsecureApiDocumentation.WithdrawID = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The WithdrawID model module.
   * @module model/WithdrawID
   * @version 1.0b
   */

  /**
   * Constructs a new <code>WithdrawID</code>.
   * @alias module:model/WithdrawID
   * @class
   * @param withdrawID
   */
  var exports = function(withdrawID) {
    var _this = this;

    _this['withdrawID'] = withdrawID;
  };

  /**
   * Constructs a <code>WithdrawID</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WithdrawID} obj Optional instance to populate.
   * @return {module:model/WithdrawID} The populated <code>WithdrawID</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('withdrawID')) {
        obj['withdrawID'] = ApiClient.convertToType(data['withdrawID'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} withdrawID
   */
  exports.prototype['withdrawID'] = undefined;




  return exports;
}));


