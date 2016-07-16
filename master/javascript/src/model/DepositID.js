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
    root.CoinsecureApiDocumentation.DepositID = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The DepositID model module.
   * @module model/DepositID
   * @version 1.0b
   */

  /**
   * Constructs a new <code>DepositID</code>.
   * @alias module:model/DepositID
   * @class
   * @param depositID
   */
  var exports = function(depositID) {
    var _this = this;

    _this['depositID'] = depositID;
  };

  /**
   * Constructs a <code>DepositID</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DepositID} obj Optional instance to populate.
   * @return {module:model/DepositID} The populated <code>DepositID</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('depositID')) {
        obj['depositID'] = ApiClient.convertToType(data['depositID'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} depositID
   */
  exports.prototype['depositID'] = undefined;




  return exports;
}));


