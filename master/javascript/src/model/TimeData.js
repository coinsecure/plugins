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
    root.CoinsecureApiDocumentation.TimeData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The TimeData model module.
   * @module model/TimeData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>TimeData</code>.
   * @alias module:model/TimeData
   * @class
   * @param time
   * @param verifiedTime
   * @param completedTime
   */
  var exports = function(time, verifiedTime, completedTime) {
    var _this = this;

    _this['time'] = time;
    _this['verifiedTime'] = verifiedTime;
    _this['completedTime'] = completedTime;
  };

  /**
   * Constructs a <code>TimeData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TimeData} obj Optional instance to populate.
   * @return {module:model/TimeData} The populated <code>TimeData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Integer');
      }
      if (data.hasOwnProperty('verifiedTime')) {
        obj['verifiedTime'] = ApiClient.convertToType(data['verifiedTime'], 'Integer');
      }
      if (data.hasOwnProperty('completedTime')) {
        obj['completedTime'] = ApiClient.convertToType(data['completedTime'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {Integer} verifiedTime
   */
  exports.prototype['verifiedTime'] = undefined;
  /**
   * @member {Integer} completedTime
   */
  exports.prototype['completedTime'] = undefined;




  return exports;
}));


