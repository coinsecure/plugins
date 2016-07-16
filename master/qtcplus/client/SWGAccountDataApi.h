#ifndef _SWG_SWGAccountDataApi_H_
#define _SWG_SWGAccountDataApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGFailResult.h"
#include "SWGBankSummaryDataResponse.h"
#include "SWGDoubleDataResponse.h"
#include "SWGKYCDataResponse.h"
#include "SWGSuccCoinRefDataResponse.h"
#include "SWGSuccRefDataResponse.h"
#include "SWGAllRefDataResponse.h"
#include "SWGTradeSummaryDataResponse.h"
#include "SWGSuccessResult.h"
#include "SWGUserSummaryDataResponse.h"
#include "SWGWalletSummaryDataResponse.h"

#include <QObject>

namespace Swagger {

class SWGAccountDataApi: public QObject {
    Q_OBJECT

public:
    SWGAccountDataApi();
    SWGAccountDataApi(QString host, QString basePath);
    ~SWGAccountDataApi();

    QString host;
    QString basePath;

    void /v1/exchange/bank/summary(QString* authorization, QString* accept);
    void /v1/exchange/user/coin/fee(QString* authorization, QString* accept);
    void /v1/exchange/user/fiat/fee(QString* authorization, QString* accept);
    void /v1/netki/search/NetkiName(QString* netkiName, QString* accept);
    void /v1/user/exchange/kycs(QString* authorization, QString* accept);
    void /v1/user/exchange/referral/coin/paid(QString* authorization, QString* accept);
    void /v1/user/exchange/referral/coin/successful(QString* authorization, QString* accept);
    void /v1/user/exchange/referral/fiat/paid(QString* authorization, QString* accept);
    void /v1/user/exchange/referrals(QString* authorization, QString* accept);
    void /v1/user/exchange/trade/summary(QString* authorization, QString* accept);
    void /v1/user/login/token/Token(QString* token, QString* accept);
    void /v1/user/summary(QString* authorization, QString* accept);
    void /v1/user/wallet/summary(QString* authorization, QString* accept);
    
private:
    void /v1/exchange/bank/summaryCallback (HttpRequestWorker * worker);
    void /v1/exchange/user/coin/feeCallback (HttpRequestWorker * worker);
    void /v1/exchange/user/fiat/feeCallback (HttpRequestWorker * worker);
    void /v1/netki/search/NetkiNameCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/kycsCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/referral/coin/paidCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/referral/coin/successfulCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/referral/fiat/paidCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/referralsCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/trade/summaryCallback (HttpRequestWorker * worker);
    void /v1/user/login/token/TokenCallback (HttpRequestWorker * worker);
    void /v1/user/summaryCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/summaryCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/exchange/bank/summarySignal(SWGBankSummaryDataResponse* summary);
    void /v1/exchange/user/coin/feeSignal(SWGDoubleDataResponse* summary);
    void /v1/exchange/user/fiat/feeSignal(SWGDoubleDataResponse* summary);
    void /v1/netki/search/NetkiNameSignal(SWGDoubleDataResponse* summary);
    void /v1/user/exchange/kycsSignal(SWGKYCDataResponse* summary);
    void /v1/user/exchange/referral/coin/paidSignal(SWGSuccCoinRefDataResponse* summary);
    void /v1/user/exchange/referral/coin/successfulSignal(SWGSuccRefDataResponse* summary);
    void /v1/user/exchange/referral/fiat/paidSignal(SWGSuccCoinRefDataResponse* summary);
    void /v1/user/exchange/referralsSignal(SWGAllRefDataResponse* summary);
    void /v1/user/exchange/trade/summarySignal(SWGTradeSummaryDataResponse* summary);
    void /v1/user/login/token/TokenSignal(SWGSuccessResult* summary);
    void /v1/user/summarySignal(SWGUserSummaryDataResponse* summary);
    void /v1/user/wallet/summarySignal(SWGWalletSummaryDataResponse* summary);
    
};
}
#endif