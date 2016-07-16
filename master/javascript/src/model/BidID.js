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
    root.CoinsecureApiDocumentation.BidID = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The BidID model module.
   * @module model/BidID
   * @version 1.0b
   */

  /**
   * Constructs a new <code>BidID</code>.
   * @alias module:model/BidID
   * @class
   * @param bidID
   */
  var exports = function(bidID) {
    var _this = this;

    _this['bidID'] = bidID;
  };

  /**
   * Constructs a <code>BidID</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BidID} obj Optional instance to populate.
   * @return {module:model/BidID} The populated <code>BidID</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('bidID')) {
        obj['bidID'] = ApiClient.convertToType(data['bidID'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} bidID
   */
  exports.prototype['bidID'] = undefined;




  return exports;
}));


