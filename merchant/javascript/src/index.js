(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/ActionAnyContent', 'model/FailInvoice', 'model/FailMerchant', 'model/Invoice', 'model/InvoiceIDFull', 'model/JsValue', 'model/Merchant', 'model/NewInvoice', 'model/SuccessInvoice', 'model/SuccessInvoices', 'model/SuccessMerchant', 'api/InvoiceActionsApi', 'api/InvoiceDataApi', 'api/UserDataApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/ActionAnyContent'), require('./model/FailInvoice'), require('./model/FailMerchant'), require('./model/Invoice'), require('./model/InvoiceIDFull'), require('./model/JsValue'), require('./model/Merchant'), require('./model/NewInvoice'), require('./model/SuccessInvoice'), require('./model/SuccessInvoices'), require('./model/SuccessMerchant'), require('./api/InvoiceActionsApi'), require('./api/InvoiceDataApi'), require('./api/UserDataApi'));
  }
}(function(ApiClient, ActionAnyContent, FailInvoice, FailMerchant, Invoice, InvoiceIDFull, JsValue, Merchant, NewInvoice, SuccessInvoice, SuccessInvoices, SuccessMerchant, InvoiceActionsApi, InvoiceDataApi, UserDataApi) {
  'use strict';

  /**
   * To generate an API key, please visit &lt;a href&#x3D;&#39;https://pay.coinsecure.in/payment-tools/api&#39; target&#x3D;&#39;_new&#39; class&#x3D;&#39;homeapi&#39;&gt;https://pay.coinsecure.in/payment-tools/api&lt;/a&gt;.&lt;br&gt;Guidelines for use can be accessed at &lt;a href&#x3D;&#39;https://pay.coinsecure.in/api/guidelines&#39;&gt;https://pay.coinsecure.in/api/guidelines&lt;/a&gt;..<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var CoinMerchantApiDocumentation = require('index'); // See note below*.
   * var xxxSvc = new CoinMerchantApiDocumentation.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new CoinMerchantApiDocumentation.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new CoinMerchantApiDocumentation.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new CoinMerchantApiDocumentation.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 1.0B
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The ActionAnyContent model constructor.
     * @property {module:model/ActionAnyContent}
     */
    ActionAnyContent: ActionAnyContent,
    /**
     * The FailInvoice model constructor.
     * @property {module:model/FailInvoice}
     */
    FailInvoice: FailInvoice,
    /**
     * The FailMerchant model constructor.
     * @property {module:model/FailMerchant}
     */
    FailMerchant: FailMerchant,
    /**
     * The Invoice model constructor.
     * @property {module:model/Invoice}
     */
    Invoice: Invoice,
    /**
     * The InvoiceIDFull model constructor.
     * @property {module:model/InvoiceIDFull}
     */
    InvoiceIDFull: InvoiceIDFull,
    /**
     * The JsValue model constructor.
     * @property {module:model/JsValue}
     */
    JsValue: JsValue,
    /**
     * The Merchant model constructor.
     * @property {module:model/Merchant}
     */
    Merchant: Merchant,
    /**
     * The NewInvoice model constructor.
     * @property {module:model/NewInvoice}
     */
    NewInvoice: NewInvoice,
    /**
     * The SuccessInvoice model constructor.
     * @property {module:model/SuccessInvoice}
     */
    SuccessInvoice: SuccessInvoice,
    /**
     * The SuccessInvoices model constructor.
     * @property {module:model/SuccessInvoices}
     */
    SuccessInvoices: SuccessInvoices,
    /**
     * The SuccessMerchant model constructor.
     * @property {module:model/SuccessMerchant}
     */
    SuccessMerchant: SuccessMerchant,
    /**
     * The InvoiceActionsApi service constructor.
     * @property {module:api/InvoiceActionsApi}
     */
    InvoiceActionsApi: InvoiceActionsApi,
    /**
     * The InvoiceDataApi service constructor.
     * @property {module:api/InvoiceDataApi}
     */
    InvoiceDataApi: InvoiceDataApi,
    /**
     * The UserDataApi service constructor.
     * @property {module:api/UserDataApi}
     */
    UserDataApi: UserDataApi
  };

  return exports;
}));
