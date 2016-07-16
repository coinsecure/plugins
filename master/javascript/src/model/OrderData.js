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
    root.CoinsecureApiDocumentation.OrderData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The OrderData model module.
   * @module model/OrderData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>OrderData</code>.
   * @alias module:model/OrderData
   * @class
   * @param time
   * @param rate
   * @param vol
   * @param orderID
   * @param status
   */
  var exports = function(time, rate, vol, orderID, status) {
    var _this = this;

    _this['time'] = time;
    _this['rate'] = rate;
    _this['vol'] = vol;
    _this['orderID'] = orderID;
    _this['status'] = status;
  };

  /**
   * Constructs a <code>OrderData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OrderData} obj Optional instance to populate.
   * @return {module:model/OrderData} The populated <code>OrderData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Integer');
      }
      if (data.hasOwnProperty('rate')) {
        obj['rate'] = ApiClient.convertToType(data['rate'], 'Integer');
      }
      if (data.hasOwnProperty('vol')) {
        obj['vol'] = ApiClient.convertToType(data['vol'], 'Integer');
      }
      if (data.hasOwnProperty('orderID')) {
        obj['orderID'] = ApiClient.convertToType(data['orderID'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {Integer} rate
   */
  exports.prototype['rate'] = undefined;
  /**
   * @member {Integer} vol
   */
  exports.prototype['vol'] = undefined;
  /**
   * @member {String} orderID
   */
  exports.prototype['orderID'] = undefined;
  /**
   * @member {String} status
   */
  exports.prototype['status'] = undefined;




  return exports;
}));


