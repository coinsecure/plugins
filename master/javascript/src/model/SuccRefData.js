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
    root.CoinsecureApiDocumentation.SuccRefData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SuccRefData model module.
   * @module model/SuccRefData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>SuccRefData</code>.
   * @alias module:model/SuccRefData
   * @class
   * @param refPercent
   * @param time
   * @param refID
   * @param emailVerified
   * @param kycComplete
   * @param btcEarned
   * @param fiatEarned
   */
  var exports = function(refPercent, time, refID, emailVerified, kycComplete, btcEarned, fiatEarned) {
    var _this = this;

    _this['refPercent'] = refPercent;
    _this['time'] = time;
    _this['refID'] = refID;
    _this['emailVerified'] = emailVerified;
    _this['kycComplete'] = kycComplete;
    _this['btcEarned'] = btcEarned;
    _this['fiatEarned'] = fiatEarned;
  };

  /**
   * Constructs a <code>SuccRefData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SuccRefData} obj Optional instance to populate.
   * @return {module:model/SuccRefData} The populated <code>SuccRefData</code> instance.
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
      if (data.hasOwnProperty('emailVerified')) {
        obj['emailVerified'] = ApiClient.convertToType(data['emailVerified'], 'Boolean');
      }
      if (data.hasOwnProperty('kycComplete')) {
        obj['kycComplete'] = ApiClient.convertToType(data['kycComplete'], 'Boolean');
      }
      if (data.hasOwnProperty('btcEarned')) {
        obj['btcEarned'] = ApiClient.convertToType(data['btcEarned'], 'Integer');
      }
      if (data.hasOwnProperty('fiatEarned')) {
        obj['fiatEarned'] = ApiClient.convertToType(data['fiatEarned'], 'Integer');
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
  /**
   * @member {Boolean} emailVerified
   * @default false
   */
  exports.prototype['emailVerified'] = false;
  /**
   * @member {Boolean} kycComplete
   * @default false
   */
  exports.prototype['kycComplete'] = false;
  /**
   * @member {Integer} btcEarned
   */
  exports.prototype['btcEarned'] = undefined;
  /**
   * @member {Integer} fiatEarned
   */
  exports.prototype['fiatEarned'] = undefined;




  return exports;
}));


