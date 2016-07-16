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
    root.CoinsecureApiDocumentation.TimeKYCData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The TimeKYCData model module.
   * @module model/TimeKYCData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>TimeKYCData</code>.
   * @alias module:model/TimeKYCData
   * @class
   * @param time
   * @param updateTime
   */
  var exports = function(time, updateTime) {
    var _this = this;

    _this['time'] = time;
    _this['updateTime'] = updateTime;
  };

  /**
   * Constructs a <code>TimeKYCData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TimeKYCData} obj Optional instance to populate.
   * @return {module:model/TimeKYCData} The populated <code>TimeKYCData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Integer');
      }
      if (data.hasOwnProperty('updateTime')) {
        obj['updateTime'] = ApiClient.convertToType(data['updateTime'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {Integer} updateTime
   */
  exports.prototype['updateTime'] = undefined;




  return exports;
}));


