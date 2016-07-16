(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinMerchantApiDocumentation) {
      root.CoinMerchantApiDocumentation = {};
    }
    root.CoinMerchantApiDocumentation.ActionAnyContent = factory(root.CoinMerchantApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ActionAnyContent model module.
   * @module model/ActionAnyContent
   * @version 1.0B
   */

  /**
   * Constructs a new <code>ActionAnyContent</code>.
   * @alias module:model/ActionAnyContent
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>ActionAnyContent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ActionAnyContent} obj Optional instance to populate.
   * @return {module:model/ActionAnyContent} The populated <code>ActionAnyContent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

    }
    return obj;
  }





  return exports;
}));


