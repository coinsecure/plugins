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
    root.CoinsecureApiDocumentation.AskID = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AskID model module.
   * @module model/AskID
   * @version 1.0b
   */

  /**
   * Constructs a new <code>AskID</code>.
   * @alias module:model/AskID
   * @class
   * @param askID
   */
  var exports = function(askID) {
    var _this = this;

    _this['askID'] = askID;
  };

  /**
   * Constructs a <code>AskID</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AskID} obj Optional instance to populate.
   * @return {module:model/AskID} The populated <code>AskID</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('askID')) {
        obj['askID'] = ApiClient.convertToType(data['askID'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} askID
   */
  exports.prototype['askID'] = undefined;




  return exports;
}));


