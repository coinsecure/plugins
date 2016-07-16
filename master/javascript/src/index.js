(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Address', 'model/AllRefData', 'model/AllRefDataResponse', 'model/AskID', 'model/BankSummaryData', 'model/BankSummaryDataResponse', 'model/BidID', 'model/ChangePassword', 'model/Code', 'model/CodeCountryMobile', 'model/CoinDepData', 'model/CoinDepDataResponse', 'model/ConfirmData', 'model/ConfirmDataResponse', 'model/DepositID', 'model/DoubleData', 'model/DoubleDataResponse', 'model/Email', 'model/FailResult', 'model/FiatBankData', 'model/FiatBankDataResponse', 'model/FiatDepData', 'model/FiatDepDataResponse', 'model/FiatWithData', 'model/FiatWithDataResponse', 'model/JsValue', 'model/KYCData', 'model/KYCDataResponse', 'model/LastTradeData', 'model/LastTradeDataResponse', 'model/LoginFormNew', 'model/LoginId', 'model/MaxVol', 'model/MethodCountryMobile', 'model/MinFiat', 'model/NetkiName', 'model/NetkiNameAddress', 'model/NewAddress', 'model/NewBankForm', 'model/NewFiatBankDeposit', 'model/NewWallet', 'model/NumberOtp', 'model/OrderData', 'model/OrderDataResponse', 'model/RateData', 'model/RateDataResponse', 'model/RateDiffData', 'model/RateDiffDataResponse', 'model/RateVolData', 'model/RateVolDataResponse', 'model/ResetPassword', 'model/SendCoin', 'model/SendCoinWallet', 'model/SendExchange', 'model/SignupForm', 'model/StandardInitiateLoginResultData', 'model/StandardLoginResultData', 'model/StandardTickerResultData', 'model/SuccCoinRefData', 'model/SuccCoinRefDataResponse', 'model/SuccRefData', 'model/SuccRefDataResponse', 'model/SuccessInitiateLoginResponse', 'model/SuccessLoginResponse', 'model/SuccessResult', 'model/SuccessResultList', 'model/SuccessTickerResponse', 'model/TimeData', 'model/TimeDataCoin', 'model/TimeKYCData', 'model/TradeAddressData', 'model/TradeAddressDataResponse', 'model/TradeCoinWithdrawData', 'model/TradeCoinWithdrawDataResponse', 'model/TradeSummaryData', 'model/TradeSummaryDataResponse', 'model/UserSummaryData', 'model/UserSummaryDataResponse', 'model/ValidAddressSearchData', 'model/ValidAddressSearchDataResponse', 'model/VolData', 'model/VolDataResponse', 'model/WalletAddressData', 'model/WalletAddressDataResponse', 'model/WalletCoinWithdrawData', 'model/WalletCoinWithdrawDataResponse', 'model/WalletSummaryData', 'model/WalletSummaryDataResponse', 'model/WalletsData', 'model/WalletsDataResponse', 'model/WithdrawFiat', 'model/WithdrawID', 'api/AccountActionsApi', 'api/AccountDataApi', 'api/BlockchainToolsApi', 'api/ExchangeBankActionsApi', 'api/ExchangeBankCoinDataApi', 'api/ExchangeBankFiatDataApi', 'api/ExchangeTradeActionsApi', 'api/ExchangeTradeDataApi', 'api/SecurityActionsApi', 'api/WalletActionsApi', 'api/WalletDataApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/Address'), require('./model/AllRefData'), require('./model/AllRefDataResponse'), require('./model/AskID'), require('./model/BankSummaryData'), require('./model/BankSummaryDataResponse'), require('./model/BidID'), require('./model/ChangePassword'), require('./model/Code'), require('./model/CodeCountryMobile'), require('./model/CoinDepData'), require('./model/CoinDepDataResponse'), require('./model/ConfirmData'), require('./model/ConfirmDataResponse'), require('./model/DepositID'), require('./model/DoubleData'), require('./model/DoubleDataResponse'), require('./model/Email'), require('./model/FailResult'), require('./model/FiatBankData'), require('./model/FiatBankDataResponse'), require('./model/FiatDepData'), require('./model/FiatDepDataResponse'), require('./model/FiatWithData'), require('./model/FiatWithDataResponse'), require('./model/JsValue'), require('./model/KYCData'), require('./model/KYCDataResponse'), require('./model/LastTradeData'), require('./model/LastTradeDataResponse'), require('./model/LoginFormNew'), require('./model/LoginId'), require('./model/MaxVol'), require('./model/MethodCountryMobile'), require('./model/MinFiat'), require('./model/NetkiName'), require('./model/NetkiNameAddress'), require('./model/NewAddress'), require('./model/NewBankForm'), require('./model/NewFiatBankDeposit'), require('./model/NewWallet'), require('./model/NumberOtp'), require('./model/OrderData'), require('./model/OrderDataResponse'), require('./model/RateData'), require('./model/RateDataResponse'), require('./model/RateDiffData'), require('./model/RateDiffDataResponse'), require('./model/RateVolData'), require('./model/RateVolDataResponse'), require('./model/ResetPassword'), require('./model/SendCoin'), require('./model/SendCoinWallet'), require('./model/SendExchange'), require('./model/SignupForm'), require('./model/StandardInitiateLoginResultData'), require('./model/StandardLoginResultData'), require('./model/StandardTickerResultData'), require('./model/SuccCoinRefData'), require('./model/SuccCoinRefDataResponse'), require('./model/SuccRefData'), require('./model/SuccRefDataResponse'), require('./model/SuccessInitiateLoginResponse'), require('./model/SuccessLoginResponse'), require('./model/SuccessResult'), require('./model/SuccessResultList'), require('./model/SuccessTickerResponse'), require('./model/TimeData'), require('./model/TimeDataCoin'), require('./model/TimeKYCData'), require('./model/TradeAddressData'), require('./model/TradeAddressDataResponse'), require('./model/TradeCoinWithdrawData'), require('./model/TradeCoinWithdrawDataResponse'), require('./model/TradeSummaryData'), require('./model/TradeSummaryDataResponse'), require('./model/UserSummaryData'), require('./model/UserSummaryDataResponse'), require('./model/ValidAddressSearchData'), require('./model/ValidAddressSearchDataResponse'), require('./model/VolData'), require('./model/VolDataResponse'), require('./model/WalletAddressData'), require('./model/WalletAddressDataResponse'), require('./model/WalletCoinWithdrawData'), require('./model/WalletCoinWithdrawDataResponse'), require('./model/WalletSummaryData'), require('./model/WalletSummaryDataResponse'), require('./model/WalletsData'), require('./model/WalletsDataResponse'), require('./model/WithdrawFiat'), require('./model/WithdrawID'), require('./api/AccountActionsApi'), require('./api/AccountDataApi'), require('./api/BlockchainToolsApi'), require('./api/ExchangeBankActionsApi'), require('./api/ExchangeBankCoinDataApi'), require('./api/ExchangeBankFiatDataApi'), require('./api/ExchangeTradeActionsApi'), require('./api/ExchangeTradeDataApi'), require('./api/SecurityActionsApi'), require('./api/WalletActionsApi'), require('./api/WalletDataApi'));
  }
}(function(ApiClient, Address, AllRefData, AllRefDataResponse, AskID, BankSummaryData, BankSummaryDataResponse, BidID, ChangePassword, Code, CodeCountryMobile, CoinDepData, CoinDepDataResponse, ConfirmData, ConfirmDataResponse, DepositID, DoubleData, DoubleDataResponse, Email, FailResult, FiatBankData, FiatBankDataResponse, FiatDepData, FiatDepDataResponse, FiatWithData, FiatWithDataResponse, JsValue, KYCData, KYCDataResponse, LastTradeData, LastTradeDataResponse, LoginFormNew, LoginId, MaxVol, MethodCountryMobile, MinFiat, NetkiName, NetkiNameAddress, NewAddress, NewBankForm, NewFiatBankDeposit, NewWallet, NumberOtp, OrderData, OrderDataResponse, RateData, RateDataResponse, RateDiffData, RateDiffDataResponse, RateVolData, RateVolDataResponse, ResetPassword, SendCoin, SendCoinWallet, SendExchange, SignupForm, StandardInitiateLoginResultData, StandardLoginResultData, StandardTickerResultData, SuccCoinRefData, SuccCoinRefDataResponse, SuccRefData, SuccRefDataResponse, SuccessInitiateLoginResponse, SuccessLoginResponse, SuccessResult, SuccessResultList, SuccessTickerResponse, TimeData, TimeDataCoin, TimeKYCData, TradeAddressData, TradeAddressDataResponse, TradeCoinWithdrawData, TradeCoinWithdrawDataResponse, TradeSummaryData, TradeSummaryDataResponse, UserSummaryData, UserSummaryDataResponse, ValidAddressSearchData, ValidAddressSearchDataResponse, VolData, VolDataResponse, WalletAddressData, WalletAddressDataResponse, WalletCoinWithdrawData, WalletCoinWithdrawDataResponse, WalletSummaryData, WalletSummaryDataResponse, WalletsData, WalletsDataResponse, WithdrawFiat, WithdrawID, AccountActionsApi, AccountDataApi, BlockchainToolsApi, ExchangeBankActionsApi, ExchangeBankCoinDataApi, ExchangeBankFiatDataApi, ExchangeTradeActionsApi, ExchangeTradeDataApi, SecurityActionsApi, WalletActionsApi, WalletDataApi) {
  'use strict';

  /**
   * To generate an API key, please visit &lt;a href&#x3D;&#39;https://coinsecure.in/api&#39; target&#x3D;&#39;_new&#39; class&#x3D;&#39;homeapi&#39;&gt;https://coinsecure.in/api&lt;/a&gt;.&lt;br&gt;Guidelines for use can be accessed at &lt;a href&#x3D;&#39;https://api.coinsecure.in/v1/guidelines&#39;&gt;https://api.coinsecure.in/v1/guidelines&lt;/a&gt;.&lt;br&gt;Programming Language Libraries for use can be accessed at &lt;a href&#x3D;&#39;https://api.coinsecure.in/v1/code-libraries&#39;&gt;https://api.coinsecure.in/v1/code-libraries&lt;/a&gt;..<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var CoinsecureApiDocumentation = require('index'); // See note below*.
   * var xxxSvc = new CoinsecureApiDocumentation.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new CoinsecureApiDocumentation.Yyy(); // Construct a model instance.
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
   * var xxxSvc = new CoinsecureApiDocumentation.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new CoinsecureApiDocumentation.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 1.0b
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The Address model constructor.
     * @property {module:model/Address}
     */
    Address: Address,
    /**
     * The AllRefData model constructor.
     * @property {module:model/AllRefData}
     */
    AllRefData: AllRefData,
    /**
     * The AllRefDataResponse model constructor.
     * @property {module:model/AllRefDataResponse}
     */
    AllRefDataResponse: AllRefDataResponse,
    /**
     * The AskID model constructor.
     * @property {module:model/AskID}
     */
    AskID: AskID,
    /**
     * The BankSummaryData model constructor.
     * @property {module:model/BankSummaryData}
     */
    BankSummaryData: BankSummaryData,
    /**
     * The BankSummaryDataResponse model constructor.
     * @property {module:model/BankSummaryDataResponse}
     */
    BankSummaryDataResponse: BankSummaryDataResponse,
    /**
     * The BidID model constructor.
     * @property {module:model/BidID}
     */
    BidID: BidID,
    /**
     * The ChangePassword model constructor.
     * @property {module:model/ChangePassword}
     */
    ChangePassword: ChangePassword,
    /**
     * The Code model constructor.
     * @property {module:model/Code}
     */
    Code: Code,
    /**
     * The CodeCountryMobile model constructor.
     * @property {module:model/CodeCountryMobile}
     */
    CodeCountryMobile: CodeCountryMobile,
    /**
     * The CoinDepData model constructor.
     * @property {module:model/CoinDepData}
     */
    CoinDepData: CoinDepData,
    /**
     * The CoinDepDataResponse model constructor.
     * @property {module:model/CoinDepDataResponse}
     */
    CoinDepDataResponse: CoinDepDataResponse,
    /**
     * The ConfirmData model constructor.
     * @property {module:model/ConfirmData}
     */
    ConfirmData: ConfirmData,
    /**
     * The ConfirmDataResponse model constructor.
     * @property {module:model/ConfirmDataResponse}
     */
    ConfirmDataResponse: ConfirmDataResponse,
    /**
     * The DepositID model constructor.
     * @property {module:model/DepositID}
     */
    DepositID: DepositID,
    /**
     * The DoubleData model constructor.
     * @property {module:model/DoubleData}
     */
    DoubleData: DoubleData,
    /**
     * The DoubleDataResponse model constructor.
     * @property {module:model/DoubleDataResponse}
     */
    DoubleDataResponse: DoubleDataResponse,
    /**
     * The Email model constructor.
     * @property {module:model/Email}
     */
    Email: Email,
    /**
     * The FailResult model constructor.
     * @property {module:model/FailResult}
     */
    FailResult: FailResult,
    /**
     * The FiatBankData model constructor.
     * @property {module:model/FiatBankData}
     */
    FiatBankData: FiatBankData,
    /**
     * The FiatBankDataResponse model constructor.
     * @property {module:model/FiatBankDataResponse}
     */
    FiatBankDataResponse: FiatBankDataResponse,
    /**
     * The FiatDepData model constructor.
     * @property {module:model/FiatDepData}
     */
    FiatDepData: FiatDepData,
    /**
     * The FiatDepDataResponse model constructor.
     * @property {module:model/FiatDepDataResponse}
     */
    FiatDepDataResponse: FiatDepDataResponse,
    /**
     * The FiatWithData model constructor.
     * @property {module:model/FiatWithData}
     */
    FiatWithData: FiatWithData,
    /**
     * The FiatWithDataResponse model constructor.
     * @property {module:model/FiatWithDataResponse}
     */
    FiatWithDataResponse: FiatWithDataResponse,
    /**
     * The JsValue model constructor.
     * @property {module:model/JsValue}
     */
    JsValue: JsValue,
    /**
     * The KYCData model constructor.
     * @property {module:model/KYCData}
     */
    KYCData: KYCData,
    /**
     * The KYCDataResponse model constructor.
     * @property {module:model/KYCDataResponse}
     */
    KYCDataResponse: KYCDataResponse,
    /**
     * The LastTradeData model constructor.
     * @property {module:model/LastTradeData}
     */
    LastTradeData: LastTradeData,
    /**
     * The LastTradeDataResponse model constructor.
     * @property {module:model/LastTradeDataResponse}
     */
    LastTradeDataResponse: LastTradeDataResponse,
    /**
     * The LoginFormNew model constructor.
     * @property {module:model/LoginFormNew}
     */
    LoginFormNew: LoginFormNew,
    /**
     * The LoginId model constructor.
     * @property {module:model/LoginId}
     */
    LoginId: LoginId,
    /**
     * The MaxVol model constructor.
     * @property {module:model/MaxVol}
     */
    MaxVol: MaxVol,
    /**
     * The MethodCountryMobile model constructor.
     * @property {module:model/MethodCountryMobile}
     */
    MethodCountryMobile: MethodCountryMobile,
    /**
     * The MinFiat model constructor.
     * @property {module:model/MinFiat}
     */
    MinFiat: MinFiat,
    /**
     * The NetkiName model constructor.
     * @property {module:model/NetkiName}
     */
    NetkiName: NetkiName,
    /**
     * The NetkiNameAddress model constructor.
     * @property {module:model/NetkiNameAddress}
     */
    NetkiNameAddress: NetkiNameAddress,
    /**
     * The NewAddress model constructor.
     * @property {module:model/NewAddress}
     */
    NewAddress: NewAddress,
    /**
     * The NewBankForm model constructor.
     * @property {module:model/NewBankForm}
     */
    NewBankForm: NewBankForm,
    /**
     * The NewFiatBankDeposit model constructor.
     * @property {module:model/NewFiatBankDeposit}
     */
    NewFiatBankDeposit: NewFiatBankDeposit,
    /**
     * The NewWallet model constructor.
     * @property {module:model/NewWallet}
     */
    NewWallet: NewWallet,
    /**
     * The NumberOtp model constructor.
     * @property {module:model/NumberOtp}
     */
    NumberOtp: NumberOtp,
    /**
     * The OrderData model constructor.
     * @property {module:model/OrderData}
     */
    OrderData: OrderData,
    /**
     * The OrderDataResponse model constructor.
     * @property {module:model/OrderDataResponse}
     */
    OrderDataResponse: OrderDataResponse,
    /**
     * The RateData model constructor.
     * @property {module:model/RateData}
     */
    RateData: RateData,
    /**
     * The RateDataResponse model constructor.
     * @property {module:model/RateDataResponse}
     */
    RateDataResponse: RateDataResponse,
    /**
     * The RateDiffData model constructor.
     * @property {module:model/RateDiffData}
     */
    RateDiffData: RateDiffData,
    /**
     * The RateDiffDataResponse model constructor.
     * @property {module:model/RateDiffDataResponse}
     */
    RateDiffDataResponse: RateDiffDataResponse,
    /**
     * The RateVolData model constructor.
     * @property {module:model/RateVolData}
     */
    RateVolData: RateVolData,
    /**
     * The RateVolDataResponse model constructor.
     * @property {module:model/RateVolDataResponse}
     */
    RateVolDataResponse: RateVolDataResponse,
    /**
     * The ResetPassword model constructor.
     * @property {module:model/ResetPassword}
     */
    ResetPassword: ResetPassword,
    /**
     * The SendCoin model constructor.
     * @property {module:model/SendCoin}
     */
    SendCoin: SendCoin,
    /**
     * The SendCoinWallet model constructor.
     * @property {module:model/SendCoinWallet}
     */
    SendCoinWallet: SendCoinWallet,
    /**
     * The SendExchange model constructor.
     * @property {module:model/SendExchange}
     */
    SendExchange: SendExchange,
    /**
     * The SignupForm model constructor.
     * @property {module:model/SignupForm}
     */
    SignupForm: SignupForm,
    /**
     * The StandardInitiateLoginResultData model constructor.
     * @property {module:model/StandardInitiateLoginResultData}
     */
    StandardInitiateLoginResultData: StandardInitiateLoginResultData,
    /**
     * The StandardLoginResultData model constructor.
     * @property {module:model/StandardLoginResultData}
     */
    StandardLoginResultData: StandardLoginResultData,
    /**
     * The StandardTickerResultData model constructor.
     * @property {module:model/StandardTickerResultData}
     */
    StandardTickerResultData: StandardTickerResultData,
    /**
     * The SuccCoinRefData model constructor.
     * @property {module:model/SuccCoinRefData}
     */
    SuccCoinRefData: SuccCoinRefData,
    /**
     * The SuccCoinRefDataResponse model constructor.
     * @property {module:model/SuccCoinRefDataResponse}
     */
    SuccCoinRefDataResponse: SuccCoinRefDataResponse,
    /**
     * The SuccRefData model constructor.
     * @property {module:model/SuccRefData}
     */
    SuccRefData: SuccRefData,
    /**
     * The SuccRefDataResponse model constructor.
     * @property {module:model/SuccRefDataResponse}
     */
    SuccRefDataResponse: SuccRefDataResponse,
    /**
     * The SuccessInitiateLoginResponse model constructor.
     * @property {module:model/SuccessInitiateLoginResponse}
     */
    SuccessInitiateLoginResponse: SuccessInitiateLoginResponse,
    /**
     * The SuccessLoginResponse model constructor.
     * @property {module:model/SuccessLoginResponse}
     */
    SuccessLoginResponse: SuccessLoginResponse,
    /**
     * The SuccessResult model constructor.
     * @property {module:model/SuccessResult}
     */
    SuccessResult: SuccessResult,
    /**
     * The SuccessResultList model constructor.
     * @property {module:model/SuccessResultList}
     */
    SuccessResultList: SuccessResultList,
    /**
     * The SuccessTickerResponse model constructor.
     * @property {module:model/SuccessTickerResponse}
     */
    SuccessTickerResponse: SuccessTickerResponse,
    /**
     * The TimeData model constructor.
     * @property {module:model/TimeData}
     */
    TimeData: TimeData,
    /**
     * The TimeDataCoin model constructor.
     * @property {module:model/TimeDataCoin}
     */
    TimeDataCoin: TimeDataCoin,
    /**
     * The TimeKYCData model constructor.
     * @property {module:model/TimeKYCData}
     */
    TimeKYCData: TimeKYCData,
    /**
     * The TradeAddressData model constructor.
     * @property {module:model/TradeAddressData}
     */
    TradeAddressData: TradeAddressData,
    /**
     * The TradeAddressDataResponse model constructor.
     * @property {module:model/TradeAddressDataResponse}
     */
    TradeAddressDataResponse: TradeAddressDataResponse,
    /**
     * The TradeCoinWithdrawData model constructor.
     * @property {module:model/TradeCoinWithdrawData}
     */
    TradeCoinWithdrawData: TradeCoinWithdrawData,
    /**
     * The TradeCoinWithdrawDataResponse model constructor.
     * @property {module:model/TradeCoinWithdrawDataResponse}
     */
    TradeCoinWithdrawDataResponse: TradeCoinWithdrawDataResponse,
    /**
     * The TradeSummaryData model constructor.
     * @property {module:model/TradeSummaryData}
     */
    TradeSummaryData: TradeSummaryData,
    /**
     * The TradeSummaryDataResponse model constructor.
     * @property {module:model/TradeSummaryDataResponse}
     */
    TradeSummaryDataResponse: TradeSummaryDataResponse,
    /**
     * The UserSummaryData model constructor.
     * @property {module:model/UserSummaryData}
     */
    UserSummaryData: UserSummaryData,
    /**
     * The UserSummaryDataResponse model constructor.
     * @property {module:model/UserSummaryDataResponse}
     */
    UserSummaryDataResponse: UserSummaryDataResponse,
    /**
     * The ValidAddressSearchData model constructor.
     * @property {module:model/ValidAddressSearchData}
     */
    ValidAddressSearchData: ValidAddressSearchData,
    /**
     * The ValidAddressSearchDataResponse model constructor.
     * @property {module:model/ValidAddressSearchDataResponse}
     */
    ValidAddressSearchDataResponse: ValidAddressSearchDataResponse,
    /**
     * The VolData model constructor.
     * @property {module:model/VolData}
     */
    VolData: VolData,
    /**
     * The VolDataResponse model constructor.
     * @property {module:model/VolDataResponse}
     */
    VolDataResponse: VolDataResponse,
    /**
     * The WalletAddressData model constructor.
     * @property {module:model/WalletAddressData}
     */
    WalletAddressData: WalletAddressData,
    /**
     * The WalletAddressDataResponse model constructor.
     * @property {module:model/WalletAddressDataResponse}
     */
    WalletAddressDataResponse: WalletAddressDataResponse,
    /**
     * The WalletCoinWithdrawData model constructor.
     * @property {module:model/WalletCoinWithdrawData}
     */
    WalletCoinWithdrawData: WalletCoinWithdrawData,
    /**
     * The WalletCoinWithdrawDataResponse model constructor.
     * @property {module:model/WalletCoinWithdrawDataResponse}
     */
    WalletCoinWithdrawDataResponse: WalletCoinWithdrawDataResponse,
    /**
     * The WalletSummaryData model constructor.
     * @property {module:model/WalletSummaryData}
     */
    WalletSummaryData: WalletSummaryData,
    /**
     * The WalletSummaryDataResponse model constructor.
     * @property {module:model/WalletSummaryDataResponse}
     */
    WalletSummaryDataResponse: WalletSummaryDataResponse,
    /**
     * The WalletsData model constructor.
     * @property {module:model/WalletsData}
     */
    WalletsData: WalletsData,
    /**
     * The WalletsDataResponse model constructor.
     * @property {module:model/WalletsDataResponse}
     */
    WalletsDataResponse: WalletsDataResponse,
    /**
     * The WithdrawFiat model constructor.
     * @property {module:model/WithdrawFiat}
     */
    WithdrawFiat: WithdrawFiat,
    /**
     * The WithdrawID model constructor.
     * @property {module:model/WithdrawID}
     */
    WithdrawID: WithdrawID,
    /**
     * The AccountActionsApi service constructor.
     * @property {module:api/AccountActionsApi}
     */
    AccountActionsApi: AccountActionsApi,
    /**
     * The AccountDataApi service constructor.
     * @property {module:api/AccountDataApi}
     */
    AccountDataApi: AccountDataApi,
    /**
     * The BlockchainToolsApi service constructor.
     * @property {module:api/BlockchainToolsApi}
     */
    BlockchainToolsApi: BlockchainToolsApi,
    /**
     * The ExchangeBankActionsApi service constructor.
     * @property {module:api/ExchangeBankActionsApi}
     */
    ExchangeBankActionsApi: ExchangeBankActionsApi,
    /**
     * The ExchangeBankCoinDataApi service constructor.
     * @property {module:api/ExchangeBankCoinDataApi}
     */
    ExchangeBankCoinDataApi: ExchangeBankCoinDataApi,
    /**
     * The ExchangeBankFiatDataApi service constructor.
     * @property {module:api/ExchangeBankFiatDataApi}
     */
    ExchangeBankFiatDataApi: ExchangeBankFiatDataApi,
    /**
     * The ExchangeTradeActionsApi service constructor.
     * @property {module:api/ExchangeTradeActionsApi}
     */
    ExchangeTradeActionsApi: ExchangeTradeActionsApi,
    /**
     * The ExchangeTradeDataApi service constructor.
     * @property {module:api/ExchangeTradeDataApi}
     */
    ExchangeTradeDataApi: ExchangeTradeDataApi,
    /**
     * The SecurityActionsApi service constructor.
     * @property {module:api/SecurityActionsApi}
     */
    SecurityActionsApi: SecurityActionsApi,
    /**
     * The WalletActionsApi service constructor.
     * @property {module:api/WalletActionsApi}
     */
    WalletActionsApi: WalletActionsApi,
    /**
     * The WalletDataApi service constructor.
     * @property {module:api/WalletDataApi}
     */
    WalletDataApi: WalletDataApi
  };

  return exports;
}));