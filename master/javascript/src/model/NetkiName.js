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
    root.CoinsecureApiDocumentation.NetkiName = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The NetkiName model module.
   * @module model/NetkiName
   * @version 1.0b
   */

  /**
   * Constructs a new <code>NetkiName</code>.
   * @alias module:model/NetkiName
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>NetkiName</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NetkiName} obj Optional instance to populate.
   * @return {module:model/NetkiName} The populated <code>NetkiName</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('netkiName')) {
        obj['netkiName'] = ApiClient.convertToType(data['netkiName'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} netkiName
   */
  exports.prototype['netkiName'] = undefined;




  return exports;
}));


