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
    root.CoinsecureApiDocumentation.TradeSummaryData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The TradeSummaryData model module.
   * @module model/TradeSummaryData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>TradeSummaryData</code>.
   * @alias module:model/TradeSummaryData
   * @class
   * @param completedAsksSum
   * @param completedBidsSum
   * @param completedAsksCount
   * @param completedBidsCount
   * @param pendingAsksCount
   * @param pendingBidsCount
   */
  var exports = function(completedAsksSum, completedBidsSum, completedAsksCount, completedBidsCount, pendingAsksCount, pendingBidsCount) {
    var _this = this;

    _this['completedAsksSum'] = completedAsksSum;
    _this['completedBidsSum'] = completedBidsSum;
    _this['completedAsksCount'] = completedAsksCount;
    _this['completedBidsCount'] = completedBidsCount;
    _this['pendingAsksCount'] = pendingAsksCount;
    _this['pendingBidsCount'] = pendingBidsCount;
  };

  /**
   * Constructs a <code>TradeSummaryData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TradeSummaryData} obj Optional instance to populate.
   * @return {module:model/TradeSummaryData} The populated <code>TradeSummaryData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('completedAsksSum')) {
        obj['completedAsksSum'] = ApiClient.convertToType(data['completedAsksSum'], 'Integer');
      }
      if (data.hasOwnProperty('completedBidsSum')) {
        obj['completedBidsSum'] = ApiClient.convertToType(data['completedBidsSum'], 'Integer');
      }
      if (data.hasOwnProperty('completedAsksCount')) {
        obj['completedAsksCount'] = ApiClient.convertToType(data['completedAsksCount'], 'Integer');
      }
      if (data.hasOwnProperty('completedBidsCount')) {
        obj['completedBidsCount'] = ApiClient.convertToType(data['completedBidsCount'], 'Integer');
      }
      if (data.hasOwnProperty('pendingAsksCount')) {
        obj['pendingAsksCount'] = ApiClient.convertToType(data['pendingAsksCount'], 'Integer');
      }
      if (data.hasOwnProperty('pendingBidsCount')) {
        obj['pendingBidsCount'] = ApiClient.convertToType(data['pendingBidsCount'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} completedAsksSum
   */
  exports.prototype['completedAsksSum'] = undefined;
  /**
   * @member {Integer} completedBidsSum
   */
  exports.prototype['completedBidsSum'] = undefined;
  /**
   * @member {Integer} completedAsksCount
   */
  exports.prototype['completedAsksCount'] = undefined;
  /**
   * @member {Integer} completedBidsCount
   */
  exports.prototype['completedBidsCount'] = undefined;
  /**
   * @member {Integer} pendingAsksCount
   */
  exports.prototype['pendingAsksCount'] = undefined;
  /**
   * @member {Integer} pendingBidsCount
   */
  exports.prototype['pendingBidsCount'] = undefined;




  return exports;
}));


