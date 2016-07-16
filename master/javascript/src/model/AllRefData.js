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
    root.CoinsecureApiDocumentation.AllRefData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AllRefData model module.
   * @module model/AllRefData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>AllRefData</code>.
   * @alias module:model/AllRefData
   * @class
   * @param refPercent
   * @param time
   * @param refID
   */
  var exports = function(refPercent, time, refID) {
    var _this = this;

    _this['refPercent'] = refPercent;
    _this['time'] = time;
    _this['refID'] = refID;
  };

  /**
   * Constructs a <code>AllRefData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AllRefData} obj Optional instance to populate.
   * @return {module:model/AllRefData} The populated <code>AllRefData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('refPercent')) {
        obj['refPercent'] = ApiClient.convertToType(data['refPercent'], 'Number');
      }
      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Integer');
      }
      if (data.hasOwnProperty('refID')) {
        obj['refID'] = ApiClient.convertToType(data['refID'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Number} refPercent
   */
  exports.prototype['refPercent'] = undefined;
  /**
   * @member {Integer} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {String} refID
   */
  exports.prototype['refID'] = undefined;




  return exports;
}));


