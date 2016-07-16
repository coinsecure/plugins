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
    root.CoinsecureApiDocumentation.NewWallet = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The NewWallet model module.
   * @module model/NewWallet
   * @version 1.0b
   */

  /**
   * Constructs a new <code>NewWallet</code>.
   * @alias module:model/NewWallet
   * @class
   * @param walletName
   * @param info
   */
  var exports = function(walletName, info) {
    var _this = this;

    _this['walletName'] = walletName;
    _this['info'] = info;
  };

  /**
   * Constructs a <code>NewWallet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NewWallet} obj Optional instance to populate.
   * @return {module:model/NewWallet} The populated <code>NewWallet</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('walletName')) {
        obj['walletName'] = ApiClient.convertToType(data['walletName'], 'String');
      }
      if (data.hasOwnProperty('info')) {
        obj['info'] = ApiClient.convertToType(data['info'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} walletName
   */
  exports.prototype['walletName'] = undefined;
  /**
   * @member {String} info
   */
  exports.prototype['info'] = undefined;




  return exports;
}));


