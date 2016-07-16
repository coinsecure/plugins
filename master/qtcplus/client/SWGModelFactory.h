#ifndef ModelFactory_H_
#define ModelFactory_H_


#include "SWGAddress.h"
#include "SWGAllRefData.h"
#include "SWGAllRefDataResponse.h"
#include "SWGAskID.h"
#include "SWGBankSummaryData.h"
#include "SWGBankSummaryDataResponse.h"
#include "SWGBidID.h"
#include "SWGChangePassword.h"
#include "SWGCode.h"
#include "SWGCodeCountryMobile.h"
#include "SWGCoinDepData.h"
#include "SWGCoinDepDataResponse.h"
#include "SWGConfirmData.h"
#include "SWGConfirmDataResponse.h"
#include "SWGDepositID.h"
#include "SWGDoubleData.h"
#include "SWGDoubleDataResponse.h"
#include "SWGEmail.h"
#include "SWGFailResult.h"
#include "SWGFiatBankData.h"
#include "SWGFiatBankDataResponse.h"
#include "SWGFiatDepData.h"
#include "SWGFiatDepDataResponse.h"
#include "SWGFiatWithData.h"
#include "SWGFiatWithDataResponse.h"
#include "SWGJsValue.h"
#include "SWGKYCData.h"
#include "SWGKYCDataResponse.h"
#include "SWGLastTradeData.h"
#include "SWGLastTradeDataResponse.h"
#include "SWGLoginFormNew.h"
#include "SWGLoginId.h"
#include "SWGMaxVol.h"
#include "SWGMethodCountryMobile.h"
#include "SWGMinFiat.h"
#include "SWGNetkiName.h"
#include "SWGNetkiNameAddress.h"
#include "SWGNewAddress.h"
#include "SWGNewBankForm.h"
#include "SWGNewFiatBankDeposit.h"
#include "SWGNewWallet.h"
#include "SWGNumberOtp.h"
#include "SWGOrderData.h"
#include "SWGOrderDataResponse.h"
#include "SWGRateData.h"
#include "SWGRateDataResponse.h"
#include "SWGRateDiffData.h"
#include "SWGRateDiffDataResponse.h"
#include "SWGRateVolData.h"
#include "SWGRateVolDataResponse.h"
#include "SWGResetPassword.h"
#include "SWGSendCoin.h"
#include "SWGSendCoinWallet.h"
#include "SWGSendExchange.h"
#include "SWGSignupForm.h"
#include "SWGStandardInitiateLoginResultData.h"
#include "SWGStandardLoginResultData.h"
#include "SWGStandardTickerResultData.h"
#include "SWGSuccCoinRefData.h"
#include "SWGSuccCoinRefDataResponse.h"
#include "SWGSuccRefData.h"
#include "SWGSuccRefDataResponse.h"
#include "SWGSuccessInitiateLoginResponse.h"
#include "SWGSuccessLoginResponse.h"
#include "SWGSuccessResult.h"
#include "SWGSuccessResultList.h"
#include "SWGSuccessTickerResponse.h"
#include "SWGTimeData.h"
#include "SWGTimeDataCoin.h"
#include "SWGTimeKYCData.h"
#include "SWGTradeAddressData.h"
#include "SWGTradeAddressDataResponse.h"
#include "SWGTradeCoinWithdrawData.h"
#include "SWGTradeCoinWithdrawDataResponse.h"
#include "SWGTradeSummaryData.h"
#include "SWGTradeSummaryDataResponse.h"
#include "SWGUserSummaryData.h"
#include "SWGUserSummaryDataResponse.h"
#include "SWGValidAddressSearchData.h"
#include "SWGValidAddressSearchDataResponse.h"
#include "SWGVolData.h"
#include "SWGVolDataResponse.h"
#include "SWGWalletAddressData.h"
#include "SWGWalletAddressDataResponse.h"
#include "SWGWalletCoinWithdrawData.h"
#include "SWGWalletCoinWithdrawDataResponse.h"
#include "SWGWalletSummaryData.h"
#include "SWGWalletSummaryDataResponse.h"
#include "SWGWalletsData.h"
#include "SWGWalletsDataResponse.h"
#include "SWGWithdrawFiat.h"
#include "SWGWithdrawID.h"

namespace Swagger {
  inline void* create(QString type) {
    if(QString("SWGAddress").compare(type) == 0) {
      return new SWGAddress();
    }
    if(QString("SWGAllRefData").compare(type) == 0) {
      return new SWGAllRefData();
    }
    if(QString("SWGAllRefDataResponse").compare(type) == 0) {
      return new SWGAllRefDataResponse();
    }
    if(QString("SWGAskID").compare(type) == 0) {
      return new SWGAskID();
    }
    if(QString("SWGBankSummaryData").compare(type) == 0) {
      return new SWGBankSummaryData();
    }
    if(QString("SWGBankSummaryDataResponse").compare(type) == 0) {
      return new SWGBankSummaryDataResponse();
    }
    if(QString("SWGBidID").compare(type) == 0) {
      return new SWGBidID();
    }
    if(QString("SWGChangePassword").compare(type) == 0) {
      return new SWGChangePassword();
    }
    if(QString("SWGCode").compare(type) == 0) {
      return new SWGCode();
    }
    if(QString("SWGCodeCountryMobile").compare(type) == 0) {
      return new SWGCodeCountryMobile();
    }
    if(QString("SWGCoinDepData").compare(type) == 0) {
      return new SWGCoinDepData();
    }
    if(QString("SWGCoinDepDataResponse").compare(type) == 0) {
      return new SWGCoinDepDataResponse();
    }
    if(QString("SWGConfirmData").compare(type) == 0) {
      return new SWGConfirmData();
    }
    if(QString("SWGConfirmDataResponse").compare(type) == 0) {
      return new SWGConfirmDataResponse();
    }
    if(QString("SWGDepositID").compare(type) == 0) {
      return new SWGDepositID();
    }
    if(QString("SWGDoubleData").compare(type) == 0) {
      return new SWGDoubleData();
    }
    if(QString("SWGDoubleDataResponse").compare(type) == 0) {
      return new SWGDoubleDataResponse();
    }
    if(QString("SWGEmail").compare(type) == 0) {
      return new SWGEmail();
    }
    if(QString("SWGFailResult").compare(type) == 0) {
      return new SWGFailResult();
    }
    if(QString("SWGFiatBankData").compare(type) == 0) {
      return new SWGFiatBankData();
    }
    if(QString("SWGFiatBankDataResponse").compare(type) == 0) {
      return new SWGFiatBankDataResponse();
    }
    if(QString("SWGFiatDepData").compare(type) == 0) {
      return new SWGFiatDepData();
    }
    if(QString("SWGFiatDepDataResponse").compare(type) == 0) {
      return new SWGFiatDepDataResponse();
    }
    if(QString("SWGFiatWithData").compare(type) == 0) {
      return new SWGFiatWithData();
    }
    if(QString("SWGFiatWithDataResponse").compare(type) == 0) {
      return new SWGFiatWithDataResponse();
    }
    if(QString("SWGJsValue").compare(type) == 0) {
      return new SWGJsValue();
    }
    if(QString("SWGKYCData").compare(type) == 0) {
      return new SWGKYCData();
    }
    if(QString("SWGKYCDataResponse").compare(type) == 0) {
      return new SWGKYCDataResponse();
    }
    if(QString("SWGLastTradeData").compare(type) == 0) {
      return new SWGLastTradeData();
    }
    if(QString("SWGLastTradeDataResponse").compare(type) == 0) {
      return new SWGLastTradeDataResponse();
    }
    if(QString("SWGLoginFormNew").compare(type) == 0) {
      return new SWGLoginFormNew();
    }
    if(QString("SWGLoginId").compare(type) == 0) {
      return new SWGLoginId();
    }
    if(QString("SWGMaxVol").compare(type) == 0) {
      return new SWGMaxVol();
    }
    if(QString("SWGMethodCountryMobile").compare(type) == 0) {
      return new SWGMethodCountryMobile();
    }
    if(QString("SWGMinFiat").compare(type) == 0) {
      return new SWGMinFiat();
    }
    if(QString("SWGNetkiName").compare(type) == 0) {
      return new SWGNetkiName();
    }
    if(QString("SWGNetkiNameAddress").compare(type) == 0) {
      return new SWGNetkiNameAddress();
    }
    if(QString("SWGNewAddress").compare(type) == 0) {
      return new SWGNewAddress();
    }
    if(QString("SWGNewBankForm").compare(type) == 0) {
      return new SWGNewBankForm();
    }
    if(QString("SWGNewFiatBankDeposit").compare(type) == 0) {
      return new SWGNewFiatBankDeposit();
    }
    if(QString("SWGNewWallet").compare(type) == 0) {
      return new SWGNewWallet();
    }
    if(QString("SWGNumberOtp").compare(type) == 0) {
      return new SWGNumberOtp();
    }
    if(QString("SWGOrderData").compare(type) == 0) {
      return new SWGOrderData();
    }
    if(QString("SWGOrderDataResponse").compare(type) == 0) {
      return new SWGOrderDataResponse();
    }
    if(QString("SWGRateData").compare(type) == 0) {
      return new SWGRateData();
    }
    if(QString("SWGRateDataResponse").compare(type) == 0) {
      return new SWGRateDataResponse();
    }
    if(QString("SWGRateDiffData").compare(type) == 0) {
      return new SWGRateDiffData();
    }
    if(QString("SWGRateDiffDataResponse").compare(type) == 0) {
      return new SWGRateDiffDataResponse();
    }
    if(QString("SWGRateVolData").compare(type) == 0) {
      return new SWGRateVolData();
    }
    if(QString("SWGRateVolDataResponse").compare(type) == 0) {
      return new SWGRateVolDataResponse();
    }
    if(QString("SWGResetPassword").compare(type) == 0) {
      return new SWGResetPassword();
    }
    if(QString("SWGSendCoin").compare(type) == 0) {
      return new SWGSendCoin();
    }
    if(QString("SWGSendCoinWallet").compare(type) == 0) {
      return new SWGSendCoinWallet();
    }
    if(QString("SWGSendExchange").compare(type) == 0) {
      return new SWGSendExchange();
    }
    if(QString("SWGSignupForm").compare(type) == 0) {
      return new SWGSignupForm();
    }
    if(QString("SWGStandardInitiateLoginResultData").compare(type) == 0) {
      return new SWGStandardInitiateLoginResultData();
    }
    if(QString("SWGStandardLoginResultData").compare(type) == 0) {
      return new SWGStandardLoginResultData();
    }
    if(QString("SWGStandardTickerResultData").compare(type) == 0) {
      return new SWGStandardTickerResultData();
    }
    if(QString("SWGSuccCoinRefData").compare(type) == 0) {
      return new SWGSuccCoinRefData();
    }
    if(QString("SWGSuccCoinRefDataResponse").compare(type) == 0) {
      return new SWGSuccCoinRefDataResponse();
    }
    if(QString("SWGSuccRefData").compare(type) == 0) {
      return new SWGSuccRefData();
    }
    if(QString("SWGSuccRefDataResponse").compare(type) == 0) {
      return new SWGSuccRefDataResponse();
    }
    if(QString("SWGSuccessInitiateLoginResponse").compare(type) == 0) {
      return new SWGSuccessInitiateLoginResponse();
    }
    if(QString("SWGSuccessLoginResponse").compare(type) == 0) {
      return new SWGSuccessLoginResponse();
    }
    if(QString("SWGSuccessResult").compare(type) == 0) {
      return new SWGSuccessResult();
    }
    if(QString("SWGSuccessResultList").compare(type) == 0) {
      return new SWGSuccessResultList();
    }
    if(QString("SWGSuccessTickerResponse").compare(type) == 0) {
      return new SWGSuccessTickerResponse();
    }
    if(QString("SWGTimeData").compare(type) == 0) {
      return new SWGTimeData();
    }
    if(QString("SWGTimeDataCoin").compare(type) == 0) {
      return new SWGTimeDataCoin();
    }
    if(QString("SWGTimeKYCData").compare(type) == 0) {
      return new SWGTimeKYCData();
    }
    if(QString("SWGTradeAddressData").compare(type) == 0) {
      return new SWGTradeAddressData();
    }
    if(QString("SWGTradeAddressDataResponse").compare(type) == 0) {
      return new SWGTradeAddressDataResponse();
    }
    if(QString("SWGTradeCoinWithdrawData").compare(type) == 0) {
      return new SWGTradeCoinWithdrawData();
    }
    if(QString("SWGTradeCoinWithdrawDataResponse").compare(type) == 0) {
      return new SWGTradeCoinWithdrawDataResponse();
    }
    if(QString("SWGTradeSummaryData").compare(type) == 0) {
      return new SWGTradeSummaryData();
    }
    if(QString("SWGTradeSummaryDataResponse").compare(type) == 0) {
      return new SWGTradeSummaryDataResponse();
    }
    if(QString("SWGUserSummaryData").compare(type) == 0) {
      return new SWGUserSummaryData();
    }
    if(QString("SWGUserSummaryDataResponse").compare(type) == 0) {
      return new SWGUserSummaryDataResponse();
    }
    if(QString("SWGValidAddressSearchData").compare(type) == 0) {
      return new SWGValidAddressSearchData();
    }
    if(QString("SWGValidAddressSearchDataResponse").compare(type) == 0) {
      return new SWGValidAddressSearchDataResponse();
    }
    if(QString("SWGVolData").compare(type) == 0) {
      return new SWGVolData();
    }
    if(QString("SWGVolDataResponse").compare(type) == 0) {
      return new SWGVolDataResponse();
    }
    if(QString("SWGWalletAddressData").compare(type) == 0) {
      return new SWGWalletAddressData();
    }
    if(QString("SWGWalletAddressDataResponse").compare(type) == 0) {
      return new SWGWalletAddressDataResponse();
    }
    if(QString("SWGWalletCoinWithdrawData").compare(type) == 0) {
      return new SWGWalletCoinWithdrawData();
    }
    if(QString("SWGWalletCoinWithdrawDataResponse").compare(type) == 0) {
      return new SWGWalletCoinWithdrawDataResponse();
    }
    if(QString("SWGWalletSummaryData").compare(type) == 0) {
      return new SWGWalletSummaryData();
    }
    if(QString("SWGWalletSummaryDataResponse").compare(type) == 0) {
      return new SWGWalletSummaryDataResponse();
    }
    if(QString("SWGWalletsData").compare(type) == 0) {
      return new SWGWalletsData();
    }
    if(QString("SWGWalletsDataResponse").compare(type) == 0) {
      return new SWGWalletsDataResponse();
    }
    if(QString("SWGWithdrawFiat").compare(type) == 0) {
      return new SWGWithdrawFiat();
    }
    if(QString("SWGWithdrawID").compare(type) == 0) {
      return new SWGWithdrawID();
    }
    
    return NULL;
  }

  inline void* create(QString json, QString type) {
    void* val = create(type);
    if(val != NULL) {
      SWGObject* obj = static_cast<SWGObject*>(val);
      return obj->fromJson(json);
    }
    if(type.startsWith("QString")) {
      return new QString();
    }
    return NULL;
  }
} /* namespace Swagger */

#endif /* ModelFactory_H_ */
