package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Address".equalsIgnoreCase(className)) {
      return new TypeToken<List<Address>>(){}.getType();
    }
    
    if ("AllRefData".equalsIgnoreCase(className)) {
      return new TypeToken<List<AllRefData>>(){}.getType();
    }
    
    if ("AllRefDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<AllRefDataResponse>>(){}.getType();
    }
    
    if ("AskID".equalsIgnoreCase(className)) {
      return new TypeToken<List<AskID>>(){}.getType();
    }
    
    if ("BankSummaryData".equalsIgnoreCase(className)) {
      return new TypeToken<List<BankSummaryData>>(){}.getType();
    }
    
    if ("BankSummaryDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<BankSummaryDataResponse>>(){}.getType();
    }
    
    if ("BidID".equalsIgnoreCase(className)) {
      return new TypeToken<List<BidID>>(){}.getType();
    }
    
    if ("ChangePassword".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChangePassword>>(){}.getType();
    }
    
    if ("Code".equalsIgnoreCase(className)) {
      return new TypeToken<List<Code>>(){}.getType();
    }
    
    if ("CodeCountryMobile".equalsIgnoreCase(className)) {
      return new TypeToken<List<CodeCountryMobile>>(){}.getType();
    }
    
    if ("CoinDepData".equalsIgnoreCase(className)) {
      return new TypeToken<List<CoinDepData>>(){}.getType();
    }
    
    if ("CoinDepDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<CoinDepDataResponse>>(){}.getType();
    }
    
    if ("ConfirmData".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfirmData>>(){}.getType();
    }
    
    if ("ConfirmDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ConfirmDataResponse>>(){}.getType();
    }
    
    if ("DepositID".equalsIgnoreCase(className)) {
      return new TypeToken<List<DepositID>>(){}.getType();
    }
    
    if ("DoubleData".equalsIgnoreCase(className)) {
      return new TypeToken<List<DoubleData>>(){}.getType();
    }
    
    if ("DoubleDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DoubleDataResponse>>(){}.getType();
    }
    
    if ("Email".equalsIgnoreCase(className)) {
      return new TypeToken<List<Email>>(){}.getType();
    }
    
    if ("FailResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<FailResult>>(){}.getType();
    }
    
    if ("FiatBankData".equalsIgnoreCase(className)) {
      return new TypeToken<List<FiatBankData>>(){}.getType();
    }
    
    if ("FiatBankDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FiatBankDataResponse>>(){}.getType();
    }
    
    if ("FiatDepData".equalsIgnoreCase(className)) {
      return new TypeToken<List<FiatDepData>>(){}.getType();
    }
    
    if ("FiatDepDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FiatDepDataResponse>>(){}.getType();
    }
    
    if ("FiatWithData".equalsIgnoreCase(className)) {
      return new TypeToken<List<FiatWithData>>(){}.getType();
    }
    
    if ("FiatWithDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FiatWithDataResponse>>(){}.getType();
    }
    
    if ("JsValue".equalsIgnoreCase(className)) {
      return new TypeToken<List<JsValue>>(){}.getType();
    }
    
    if ("KYCData".equalsIgnoreCase(className)) {
      return new TypeToken<List<KYCData>>(){}.getType();
    }
    
    if ("KYCDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<KYCDataResponse>>(){}.getType();
    }
    
    if ("LastTradeData".equalsIgnoreCase(className)) {
      return new TypeToken<List<LastTradeData>>(){}.getType();
    }
    
    if ("LastTradeDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LastTradeDataResponse>>(){}.getType();
    }
    
    if ("LoginFormNew".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginFormNew>>(){}.getType();
    }
    
    if ("LoginId".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginId>>(){}.getType();
    }
    
    if ("MaxVol".equalsIgnoreCase(className)) {
      return new TypeToken<List<MaxVol>>(){}.getType();
    }
    
    if ("MethodCountryMobile".equalsIgnoreCase(className)) {
      return new TypeToken<List<MethodCountryMobile>>(){}.getType();
    }
    
    if ("MinFiat".equalsIgnoreCase(className)) {
      return new TypeToken<List<MinFiat>>(){}.getType();
    }
    
    if ("NetkiName".equalsIgnoreCase(className)) {
      return new TypeToken<List<NetkiName>>(){}.getType();
    }
    
    if ("NetkiNameAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<NetkiNameAddress>>(){}.getType();
    }
    
    if ("NewAddress".equalsIgnoreCase(className)) {
      return new TypeToken<List<NewAddress>>(){}.getType();
    }
    
    if ("NewBankForm".equalsIgnoreCase(className)) {
      return new TypeToken<List<NewBankForm>>(){}.getType();
    }
    
    if ("NewFiatBankDeposit".equalsIgnoreCase(className)) {
      return new TypeToken<List<NewFiatBankDeposit>>(){}.getType();
    }
    
    if ("NewWallet".equalsIgnoreCase(className)) {
      return new TypeToken<List<NewWallet>>(){}.getType();
    }
    
    if ("NumberOtp".equalsIgnoreCase(className)) {
      return new TypeToken<List<NumberOtp>>(){}.getType();
    }
    
    if ("OrderData".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderData>>(){}.getType();
    }
    
    if ("OrderDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderDataResponse>>(){}.getType();
    }
    
    if ("RateData".equalsIgnoreCase(className)) {
      return new TypeToken<List<RateData>>(){}.getType();
    }
    
    if ("RateDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<RateDataResponse>>(){}.getType();
    }
    
    if ("RateDiffData".equalsIgnoreCase(className)) {
      return new TypeToken<List<RateDiffData>>(){}.getType();
    }
    
    if ("RateDiffDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<RateDiffDataResponse>>(){}.getType();
    }
    
    if ("RateVolData".equalsIgnoreCase(className)) {
      return new TypeToken<List<RateVolData>>(){}.getType();
    }
    
    if ("RateVolDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<RateVolDataResponse>>(){}.getType();
    }
    
    if ("ResetPassword".equalsIgnoreCase(className)) {
      return new TypeToken<List<ResetPassword>>(){}.getType();
    }
    
    if ("SendCoin".equalsIgnoreCase(className)) {
      return new TypeToken<List<SendCoin>>(){}.getType();
    }
    
    if ("SendCoinWallet".equalsIgnoreCase(className)) {
      return new TypeToken<List<SendCoinWallet>>(){}.getType();
    }
    
    if ("SendExchange".equalsIgnoreCase(className)) {
      return new TypeToken<List<SendExchange>>(){}.getType();
    }
    
    if ("SignupForm".equalsIgnoreCase(className)) {
      return new TypeToken<List<SignupForm>>(){}.getType();
    }
    
    if ("StandardInitiateLoginResultData".equalsIgnoreCase(className)) {
      return new TypeToken<List<StandardInitiateLoginResultData>>(){}.getType();
    }
    
    if ("StandardLoginResultData".equalsIgnoreCase(className)) {
      return new TypeToken<List<StandardLoginResultData>>(){}.getType();
    }
    
    if ("StandardTickerResultData".equalsIgnoreCase(className)) {
      return new TypeToken<List<StandardTickerResultData>>(){}.getType();
    }
    
    if ("SuccCoinRefData".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccCoinRefData>>(){}.getType();
    }
    
    if ("SuccCoinRefDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccCoinRefDataResponse>>(){}.getType();
    }
    
    if ("SuccRefData".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccRefData>>(){}.getType();
    }
    
    if ("SuccRefDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccRefDataResponse>>(){}.getType();
    }
    
    if ("SuccessInitiateLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccessInitiateLoginResponse>>(){}.getType();
    }
    
    if ("SuccessLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccessLoginResponse>>(){}.getType();
    }
    
    if ("SuccessResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccessResult>>(){}.getType();
    }
    
    if ("SuccessResultList".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccessResultList>>(){}.getType();
    }
    
    if ("SuccessTickerResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccessTickerResponse>>(){}.getType();
    }
    
    if ("TimeData".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimeData>>(){}.getType();
    }
    
    if ("TimeDataCoin".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimeDataCoin>>(){}.getType();
    }
    
    if ("TimeKYCData".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimeKYCData>>(){}.getType();
    }
    
    if ("TradeAddressData".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradeAddressData>>(){}.getType();
    }
    
    if ("TradeAddressDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradeAddressDataResponse>>(){}.getType();
    }
    
    if ("TradeCoinWithdrawData".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradeCoinWithdrawData>>(){}.getType();
    }
    
    if ("TradeCoinWithdrawDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradeCoinWithdrawDataResponse>>(){}.getType();
    }
    
    if ("TradeSummaryData".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradeSummaryData>>(){}.getType();
    }
    
    if ("TradeSummaryDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<TradeSummaryDataResponse>>(){}.getType();
    }
    
    if ("UserSummaryData".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserSummaryData>>(){}.getType();
    }
    
    if ("UserSummaryDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserSummaryDataResponse>>(){}.getType();
    }
    
    if ("ValidAddressSearchData".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidAddressSearchData>>(){}.getType();
    }
    
    if ("ValidAddressSearchDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ValidAddressSearchDataResponse>>(){}.getType();
    }
    
    if ("VolData".equalsIgnoreCase(className)) {
      return new TypeToken<List<VolData>>(){}.getType();
    }
    
    if ("VolDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<VolDataResponse>>(){}.getType();
    }
    
    if ("WalletAddressData".equalsIgnoreCase(className)) {
      return new TypeToken<List<WalletAddressData>>(){}.getType();
    }
    
    if ("WalletAddressDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WalletAddressDataResponse>>(){}.getType();
    }
    
    if ("WalletCoinWithdrawData".equalsIgnoreCase(className)) {
      return new TypeToken<List<WalletCoinWithdrawData>>(){}.getType();
    }
    
    if ("WalletCoinWithdrawDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WalletCoinWithdrawDataResponse>>(){}.getType();
    }
    
    if ("WalletSummaryData".equalsIgnoreCase(className)) {
      return new TypeToken<List<WalletSummaryData>>(){}.getType();
    }
    
    if ("WalletSummaryDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WalletSummaryDataResponse>>(){}.getType();
    }
    
    if ("WalletsData".equalsIgnoreCase(className)) {
      return new TypeToken<List<WalletsData>>(){}.getType();
    }
    
    if ("WalletsDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<WalletsDataResponse>>(){}.getType();
    }
    
    if ("WithdrawFiat".equalsIgnoreCase(className)) {
      return new TypeToken<List<WithdrawFiat>>(){}.getType();
    }
    
    if ("WithdrawID".equalsIgnoreCase(className)) {
      return new TypeToken<List<WithdrawID>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Address".equalsIgnoreCase(className)) {
      return new TypeToken<Address>(){}.getType();
    }
    
    if ("AllRefData".equalsIgnoreCase(className)) {
      return new TypeToken<AllRefData>(){}.getType();
    }
    
    if ("AllRefDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<AllRefDataResponse>(){}.getType();
    }
    
    if ("AskID".equalsIgnoreCase(className)) {
      return new TypeToken<AskID>(){}.getType();
    }
    
    if ("BankSummaryData".equalsIgnoreCase(className)) {
      return new TypeToken<BankSummaryData>(){}.getType();
    }
    
    if ("BankSummaryDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<BankSummaryDataResponse>(){}.getType();
    }
    
    if ("BidID".equalsIgnoreCase(className)) {
      return new TypeToken<BidID>(){}.getType();
    }
    
    if ("ChangePassword".equalsIgnoreCase(className)) {
      return new TypeToken<ChangePassword>(){}.getType();
    }
    
    if ("Code".equalsIgnoreCase(className)) {
      return new TypeToken<Code>(){}.getType();
    }
    
    if ("CodeCountryMobile".equalsIgnoreCase(className)) {
      return new TypeToken<CodeCountryMobile>(){}.getType();
    }
    
    if ("CoinDepData".equalsIgnoreCase(className)) {
      return new TypeToken<CoinDepData>(){}.getType();
    }
    
    if ("CoinDepDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<CoinDepDataResponse>(){}.getType();
    }
    
    if ("ConfirmData".equalsIgnoreCase(className)) {
      return new TypeToken<ConfirmData>(){}.getType();
    }
    
    if ("ConfirmDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ConfirmDataResponse>(){}.getType();
    }
    
    if ("DepositID".equalsIgnoreCase(className)) {
      return new TypeToken<DepositID>(){}.getType();
    }
    
    if ("DoubleData".equalsIgnoreCase(className)) {
      return new TypeToken<DoubleData>(){}.getType();
    }
    
    if ("DoubleDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DoubleDataResponse>(){}.getType();
    }
    
    if ("Email".equalsIgnoreCase(className)) {
      return new TypeToken<Email>(){}.getType();
    }
    
    if ("FailResult".equalsIgnoreCase(className)) {
      return new TypeToken<FailResult>(){}.getType();
    }
    
    if ("FiatBankData".equalsIgnoreCase(className)) {
      return new TypeToken<FiatBankData>(){}.getType();
    }
    
    if ("FiatBankDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FiatBankDataResponse>(){}.getType();
    }
    
    if ("FiatDepData".equalsIgnoreCase(className)) {
      return new TypeToken<FiatDepData>(){}.getType();
    }
    
    if ("FiatDepDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FiatDepDataResponse>(){}.getType();
    }
    
    if ("FiatWithData".equalsIgnoreCase(className)) {
      return new TypeToken<FiatWithData>(){}.getType();
    }
    
    if ("FiatWithDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FiatWithDataResponse>(){}.getType();
    }
    
    if ("JsValue".equalsIgnoreCase(className)) {
      return new TypeToken<JsValue>(){}.getType();
    }
    
    if ("KYCData".equalsIgnoreCase(className)) {
      return new TypeToken<KYCData>(){}.getType();
    }
    
    if ("KYCDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<KYCDataResponse>(){}.getType();
    }
    
    if ("LastTradeData".equalsIgnoreCase(className)) {
      return new TypeToken<LastTradeData>(){}.getType();
    }
    
    if ("LastTradeDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LastTradeDataResponse>(){}.getType();
    }
    
    if ("LoginFormNew".equalsIgnoreCase(className)) {
      return new TypeToken<LoginFormNew>(){}.getType();
    }
    
    if ("LoginId".equalsIgnoreCase(className)) {
      return new TypeToken<LoginId>(){}.getType();
    }
    
    if ("MaxVol".equalsIgnoreCase(className)) {
      return new TypeToken<MaxVol>(){}.getType();
    }
    
    if ("MethodCountryMobile".equalsIgnoreCase(className)) {
      return new TypeToken<MethodCountryMobile>(){}.getType();
    }
    
    if ("MinFiat".equalsIgnoreCase(className)) {
      return new TypeToken<MinFiat>(){}.getType();
    }
    
    if ("NetkiName".equalsIgnoreCase(className)) {
      return new TypeToken<NetkiName>(){}.getType();
    }
    
    if ("NetkiNameAddress".equalsIgnoreCase(className)) {
      return new TypeToken<NetkiNameAddress>(){}.getType();
    }
    
    if ("NewAddress".equalsIgnoreCase(className)) {
      return new TypeToken<NewAddress>(){}.getType();
    }
    
    if ("NewBankForm".equalsIgnoreCase(className)) {
      return new TypeToken<NewBankForm>(){}.getType();
    }
    
    if ("NewFiatBankDeposit".equalsIgnoreCase(className)) {
      return new TypeToken<NewFiatBankDeposit>(){}.getType();
    }
    
    if ("NewWallet".equalsIgnoreCase(className)) {
      return new TypeToken<NewWallet>(){}.getType();
    }
    
    if ("NumberOtp".equalsIgnoreCase(className)) {
      return new TypeToken<NumberOtp>(){}.getType();
    }
    
    if ("OrderData".equalsIgnoreCase(className)) {
      return new TypeToken<OrderData>(){}.getType();
    }
    
    if ("OrderDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<OrderDataResponse>(){}.getType();
    }
    
    if ("RateData".equalsIgnoreCase(className)) {
      return new TypeToken<RateData>(){}.getType();
    }
    
    if ("RateDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<RateDataResponse>(){}.getType();
    }
    
    if ("RateDiffData".equalsIgnoreCase(className)) {
      return new TypeToken<RateDiffData>(){}.getType();
    }
    
    if ("RateDiffDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<RateDiffDataResponse>(){}.getType();
    }
    
    if ("RateVolData".equalsIgnoreCase(className)) {
      return new TypeToken<RateVolData>(){}.getType();
    }
    
    if ("RateVolDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<RateVolDataResponse>(){}.getType();
    }
    
    if ("ResetPassword".equalsIgnoreCase(className)) {
      return new TypeToken<ResetPassword>(){}.getType();
    }
    
    if ("SendCoin".equalsIgnoreCase(className)) {
      return new TypeToken<SendCoin>(){}.getType();
    }
    
    if ("SendCoinWallet".equalsIgnoreCase(className)) {
      return new TypeToken<SendCoinWallet>(){}.getType();
    }
    
    if ("SendExchange".equalsIgnoreCase(className)) {
      return new TypeToken<SendExchange>(){}.getType();
    }
    
    if ("SignupForm".equalsIgnoreCase(className)) {
      return new TypeToken<SignupForm>(){}.getType();
    }
    
    if ("StandardInitiateLoginResultData".equalsIgnoreCase(className)) {
      return new TypeToken<StandardInitiateLoginResultData>(){}.getType();
    }
    
    if ("StandardLoginResultData".equalsIgnoreCase(className)) {
      return new TypeToken<StandardLoginResultData>(){}.getType();
    }
    
    if ("StandardTickerResultData".equalsIgnoreCase(className)) {
      return new TypeToken<StandardTickerResultData>(){}.getType();
    }
    
    if ("SuccCoinRefData".equalsIgnoreCase(className)) {
      return new TypeToken<SuccCoinRefData>(){}.getType();
    }
    
    if ("SuccCoinRefDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SuccCoinRefDataResponse>(){}.getType();
    }
    
    if ("SuccRefData".equalsIgnoreCase(className)) {
      return new TypeToken<SuccRefData>(){}.getType();
    }
    
    if ("SuccRefDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SuccRefDataResponse>(){}.getType();
    }
    
    if ("SuccessInitiateLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SuccessInitiateLoginResponse>(){}.getType();
    }
    
    if ("SuccessLoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SuccessLoginResponse>(){}.getType();
    }
    
    if ("SuccessResult".equalsIgnoreCase(className)) {
      return new TypeToken<SuccessResult>(){}.getType();
    }
    
    if ("SuccessResultList".equalsIgnoreCase(className)) {
      return new TypeToken<SuccessResultList>(){}.getType();
    }
    
    if ("SuccessTickerResponse".equalsIgnoreCase(className)) {
      return new TypeToken<SuccessTickerResponse>(){}.getType();
    }
    
    if ("TimeData".equalsIgnoreCase(className)) {
      return new TypeToken<TimeData>(){}.getType();
    }
    
    if ("TimeDataCoin".equalsIgnoreCase(className)) {
      return new TypeToken<TimeDataCoin>(){}.getType();
    }
    
    if ("TimeKYCData".equalsIgnoreCase(className)) {
      return new TypeToken<TimeKYCData>(){}.getType();
    }
    
    if ("TradeAddressData".equalsIgnoreCase(className)) {
      return new TypeToken<TradeAddressData>(){}.getType();
    }
    
    if ("TradeAddressDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TradeAddressDataResponse>(){}.getType();
    }
    
    if ("TradeCoinWithdrawData".equalsIgnoreCase(className)) {
      return new TypeToken<TradeCoinWithdrawData>(){}.getType();
    }
    
    if ("TradeCoinWithdrawDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TradeCoinWithdrawDataResponse>(){}.getType();
    }
    
    if ("TradeSummaryData".equalsIgnoreCase(className)) {
      return new TypeToken<TradeSummaryData>(){}.getType();
    }
    
    if ("TradeSummaryDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<TradeSummaryDataResponse>(){}.getType();
    }
    
    if ("UserSummaryData".equalsIgnoreCase(className)) {
      return new TypeToken<UserSummaryData>(){}.getType();
    }
    
    if ("UserSummaryDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<UserSummaryDataResponse>(){}.getType();
    }
    
    if ("ValidAddressSearchData".equalsIgnoreCase(className)) {
      return new TypeToken<ValidAddressSearchData>(){}.getType();
    }
    
    if ("ValidAddressSearchDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ValidAddressSearchDataResponse>(){}.getType();
    }
    
    if ("VolData".equalsIgnoreCase(className)) {
      return new TypeToken<VolData>(){}.getType();
    }
    
    if ("VolDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<VolDataResponse>(){}.getType();
    }
    
    if ("WalletAddressData".equalsIgnoreCase(className)) {
      return new TypeToken<WalletAddressData>(){}.getType();
    }
    
    if ("WalletAddressDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WalletAddressDataResponse>(){}.getType();
    }
    
    if ("WalletCoinWithdrawData".equalsIgnoreCase(className)) {
      return new TypeToken<WalletCoinWithdrawData>(){}.getType();
    }
    
    if ("WalletCoinWithdrawDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WalletCoinWithdrawDataResponse>(){}.getType();
    }
    
    if ("WalletSummaryData".equalsIgnoreCase(className)) {
      return new TypeToken<WalletSummaryData>(){}.getType();
    }
    
    if ("WalletSummaryDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WalletSummaryDataResponse>(){}.getType();
    }
    
    if ("WalletsData".equalsIgnoreCase(className)) {
      return new TypeToken<WalletsData>(){}.getType();
    }
    
    if ("WalletsDataResponse".equalsIgnoreCase(className)) {
      return new TypeToken<WalletsDataResponse>(){}.getType();
    }
    
    if ("WithdrawFiat".equalsIgnoreCase(className)) {
      return new TypeToken<WithdrawFiat>(){}.getType();
    }
    
    if ("WithdrawID".equalsIgnoreCase(className)) {
      return new TypeToken<WithdrawID>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
