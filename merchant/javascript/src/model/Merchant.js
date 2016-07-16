(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinMerchantApiDocumentation) {
      root.CoinMerchantApiDocumentation = {};
    }
    root.CoinMerchantApiDocumentation.Merchant = factory(root.CoinMerchantApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Merchant model module.
   * @module model/Merchant
   * @version 1.0B
   */

  /**
   * Constructs a new <code>Merchant</code>.
   * @alias module:model/Merchant
   * @class
   * @param firstName
   * @param lastName
   * @param coinBalance
   * @param fiatBalance
   * @param merchantType
   * @param organization
   * @param status
   * @param website
   * @param address
   * @param adminEmail
   * @param businessType
   * @param info
   * @param minCoinSettlement
   * @param minFiatSettlement
   * @param tel
   */
  var exports = function(firstName, lastName, coinBalance, fiatBalance, merchantType, organization, status, website, address, adminEmail, businessType, info, minCoinSettlement, minFiatSettlement, tel) {
    var _this = this;

    _this['firstName'] = firstName;
    _this['lastName'] = lastName;
    _this['coinBalance'] = coinBalance;
    _this['fiatBalance'] = fiatBalance;
    _this['merchantType'] = merchantType;
    _this['organization'] = organization;
    _this['status'] = status;
    _this['website'] = website;
    _this['address'] = address;
    _this['adminEmail'] = adminEmail;
    _this['businessType'] = businessType;
    _this['info'] = info;
    _this['minCoinSettlement'] = minCoinSettlement;
    _this['minFiatSettlement'] = minFiatSettlement;
    _this['tel'] = tel;
  };

  /**
   * Constructs a <code>Merchant</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Merchant} obj Optional instance to populate.
   * @return {module:model/Merchant} The populated <code>Merchant</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('firstName')) {
        obj['firstName'] = ApiClient.convertToType(data['firstName'], 'String');
      }
      if (data.hasOwnProperty('lastName')) {
        obj['lastName'] = ApiClient.convertToType(data['lastName'], 'String');
      }
      if (data.hasOwnProperty('coinBalance')) {
        obj['coinBalance'] = ApiClient.convertToType(data['coinBalance'], 'Integer');
      }
      if (data.hasOwnProperty('fiatBalance')) {
        obj['fiatBalance'] = ApiClient.convertToType(data['fiatBalance'], 'Integer');
      }
      if (data.hasOwnProperty('merchantType')) {
        obj['merchantType'] = ApiClient.convertToType(data['merchantType'], 'String');
      }
      if (data.hasOwnProperty('organization')) {
        obj['organization'] = ApiClient.convertToType(data['organization'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('website')) {
        obj['website'] = ApiClient.convertToType(data['website'], 'String');
      }
      if (data.hasOwnProperty('address')) {
        obj['address'] = ApiClient.convertToType(data['address'], 'String');
      }
      if (data.hasOwnProperty('adminEmail')) {
        obj['adminEmail'] = ApiClient.convertToType(data['adminEmail'], 'String');
      }
      if (data.hasOwnProperty('businessType')) {
        obj['businessType'] = ApiClient.convertToType(data['businessType'], 'String');
      }
      if (data.hasOwnProperty('info')) {
        obj['info'] = ApiClient.convertToType(data['info'], 'String');
      }
      if (data.hasOwnProperty('minCoinSettlement')) {
        obj['minCoinSettlement'] = ApiClient.convertToType(data['minCoinSettlement'], 'Integer');
      }
      if (data.hasOwnProperty('minFiatSettlement')) {
        obj['minFiatSettlement'] = ApiClient.convertToType(data['minFiatSettlement'], 'Integer');
      }
      if (data.hasOwnProperty('tel')) {
        obj['tel'] = ApiClient.convertToType(data['tel'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} firstName
   */
  exports.prototype['firstName'] = undefined;
  /**
   * @member {String} lastName
   */
  exports.prototype['lastName'] = undefined;
  /**
   * @member {Integer} coinBalance
   */
  exports.prototype['coinBalance'] = undefined;
  /**
   * @member {Integer} fiatBalance
   */
  exports.prototype['fiatBalance'] = undefined;
  /**
   * @member {String} merchantType
   */
  exports.prototype['merchantType'] = undefined;
  /**
   * @member {String} organization
   */
  exports.prototype['organization'] = undefined;
  /**
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * @member {String} website
   */
  exports.prototype['website'] = undefined;
  /**
   * @member {String} address
   */
  exports.prototype['address'] = undefined;
  /**
   * @member {String} adminEmail
   */
  exports.prototype['adminEmail'] = undefined;
  /**
   * @member {String} businessType
   */
  exports.prototype['businessType'] = undefined;
  /**
   * @member {String} info
   */
  exports.prototype['info'] = undefined;
  /**
   * @member {Integer} minCoinSettlement
   */
  exports.prototype['minCoinSettlement'] = undefined;
  /**
   * @member {Integer} minFiatSettlement
   */
  exports.prototype['minFiatSettlement'] = undefined;
  /**
   * @member {String} tel
   */
  exports.prototype['tel'] = undefined;




  return exports;
}));


