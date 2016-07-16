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
    root.CoinsecureApiDocumentation.NetkiNameAddress = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The NetkiNameAddress model module.
   * @module model/NetkiNameAddress
   * @version 1.0b
   */

  /**
   * Constructs a new <code>NetkiNameAddress</code>.
   * @alias module:model/NetkiNameAddress
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>NetkiNameAddress</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NetkiNameAddress} obj Optional instance to populate.
   * @return {module:model/NetkiNameAddress} The populated <code>NetkiNameAddress</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('netkiName')) {
        obj['netkiName'] = ApiClient.convertToType(data['netkiName'], 'String');
      }
      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} netkiName
   */
  exports.prototype['netkiName'] = undefined;
  /**
   * @member {String} address
   */
  exports.prototype['address'] = undefined;




  return exports;
}));


