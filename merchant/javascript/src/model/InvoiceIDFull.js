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
    root.CoinMerchantApiDocumentation.InvoiceIDFull = factory(root.CoinMerchantApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The InvoiceIDFull model module.
   * @module model/InvoiceIDFull
   * @version 1.0B
   */

  /**
   * Constructs a new <code>InvoiceIDFull</code>.
   * @alias module:model/InvoiceIDFull
   * @class
   * @param from
   * @param to
   * @param max
   * @param offset
   */
  var exports = function(from, to, max, offset) {
    var _this = this;

    _this['from'] = from;
    _this['to'] = to;
    _this['max'] = max;
    _this['offset'] = offset;
  };

  /**
   * Constructs a <code>InvoiceIDFull</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/InvoiceIDFull} obj Optional instance to populate.
   * @return {module:model/InvoiceIDFull} The populated <code>InvoiceIDFull</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('from')) {
        obj['from'] = ApiClient.convertToType(data['from'], 'Integer');
      }
      if (data.hasOwnProperty('to')) {
        obj['to'] = ApiClient.convertToType(data['to'], 'Integer');
      }
      if (data.hasOwnProperty('max')) {
        obj['max'] = ApiClient.convertToType(data['max'], 'Integer');
      }
      if (data.hasOwnProperty('offset')) {
        obj['offset'] = ApiClient.convertToType(data['offset'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Integer} from
   */
  exports.prototype['from'] = undefined;
  /**
   * @member {Integer} to
   */
  exports.prototype['to'] = undefined;
  /**
   * @member {Integer} max
   */
  exports.prototype['max'] = undefined;
  /**
   * @member {Integer} offset
   */
  exports.prototype['offset'] = undefined;




  return exports;
}));


