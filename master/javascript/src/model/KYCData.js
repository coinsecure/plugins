(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/TimeKYCData'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TimeKYCData'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.KYCData = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.TimeKYCData);
  }
}(this, function(ApiClient, TimeKYCData) {
  'use strict';




  /**
   * The KYCData model module.
   * @module model/KYCData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>KYCData</code>.
   * @alias module:model/KYCData
   * @class
   * @param timeDetails
   * @param kycID
   * @param firstName
   * @param lastName
   * @param status
   * @param userType
   * @param info
   */
  var exports = function(timeDetails, kycID, firstName, lastName, status, userType, info) {
    var _this = this;

    _this['timeDetails'] = timeDetails;
    _this['kycID'] = kycID;
    _this['firstName'] = firstName;
    _this['lastName'] = lastName;
    _this['status'] = status;
    _this['userType'] = userType;
    _this['info'] = info;
  };

  /**
   * Constructs a <code>KYCData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/KYCData} obj Optional instance to populate.
   * @return {module:model/KYCData} The populated <code>KYCData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('timeDetails')) {
        obj['timeDetails'] = TimeKYCData.constructFromObject(data['timeDetails']);
      }
      if (data.hasOwnProperty('kycID')) {
        obj['kycID'] = ApiClient.convertToType(data['kycID'], 'String');
      }
      if (data.hasOwnProperty('firstName')) {
        obj['firstName'] = ApiClient.convertToType(data['firstName'], 'String');
      }
      if (data.hasOwnProperty('lastName')) {
        obj['lastName'] = ApiClient.convertToType(data['lastName'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('userType')) {
        obj['userType'] = ApiClient.convertToType(data['userType'], 'String');
      }
      if (data.hasOwnProperty('info')) {
        obj['info'] = ApiClient.convertToType(data['info'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {module:model/TimeKYCData} timeDetails
   */
  exports.prototype['timeDetails'] = undefined;
  /**
   * @member {String} kycID
   */
  exports.prototype['kycID'] = undefined;
  /**
   * @member {String} firstName
   */
  exports.prototype['firstName'] = undefined;
  /**
   * @member {String} lastName
   */
  exports.prototype['lastName'] = undefined;
  /**
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * @member {String} userType
   */
  exports.prototype['userType'] = undefined;
  /**
   * @member {String} info
   */
  exports.prototype['info'] = undefined;




  return exports;
}));


