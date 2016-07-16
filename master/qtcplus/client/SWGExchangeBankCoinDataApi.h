#ifndef _SWG_SWGExchangeBankCoinDataApi_H_
#define _SWG_SWGExchangeBankCoinDataApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGFailResult.h"
#include "SWGTradeAddressDataResponse.h"
#include "SWGVolDataResponse.h"
#include "SWGCoinDepDataResponse.h"
#include "SWGTradeCoinWithdrawDataResponse.h"

#include <QObject>

namespace Swagger {

class SWGExchangeBankCoinDataApi: public QObject {
    Q_OBJECT

public:
    SWGExchangeBankCoinDataApi();
    SWGExchangeBankCoinDataApi(QString host, QString basePath);
    ~SWGExchangeBankCoinDataApi();

    QString host;
    QString basePath;

    void /v1/user/exchange/bank/coin/addresses(QString* authorization, QString* accept);
    void /v1/user/exchange/bank/coin/balance/available(QString* authorization, QString* accept);
    void /v1/user/exchange/bank/coin/balance/pending(QString* authorization, QString* accept);
    void /v1/user/exchange/bank/coin/balance/total(QString* authorization, QString* accept);
    void /v1/user/exchange/bank/coin/deposit/cancelled(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/coin/deposit/unverified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/coin/deposit/verified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/coin/withdraw/cancelled(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/coin/withdraw/completed(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/coin/withdraw/unverified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/coin/withdraw/verified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    
private:
    void /v1/user/exchange/bank/coin/addressesCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/balance/availableCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/balance/pendingCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/balance/totalCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/deposit/cancelledCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/deposit/unverifiedCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/deposit/verifiedCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/withdraw/cancelledCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/withdraw/completedCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/withdraw/unverifiedCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/withdraw/verifiedCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/user/exchange/bank/coin/addressesSignal(SWGTradeAddressDataResponse* summary);
    void /v1/user/exchange/bank/coin/balance/availableSignal(SWGVolDataResponse* summary);
    void /v1/user/exchange/bank/coin/balance/pendingSignal(SWGVolDataResponse* summary);
    void /v1/user/exchange/bank/coin/balance/totalSignal(SWGVolDataResponse* summary);
    void /v1/user/exchange/bank/coin/deposit/cancelledSignal(SWGCoinDepDataResponse* summary);
    void /v1/user/exchange/bank/coin/deposit/unverifiedSignal(SWGCoinDepDataResponse* summary);
    void /v1/user/exchange/bank/coin/deposit/verifiedSignal(SWGCoinDepDataResponse* summary);
    void /v1/user/exchange/bank/coin/withdraw/cancelledSignal(SWGTradeCoinWithdrawDataResponse* summary);
    void /v1/user/exchange/bank/coin/withdraw/completedSignal(SWGTradeCoinWithdrawDataResponse* summary);
    void /v1/user/exchange/bank/coin/withdraw/unverifiedSignal(SWGTradeCoinWithdrawDataResponse* summary);
    void /v1/user/exchange/bank/coin/withdraw/verifiedSignal(SWGTradeCoinWithdrawDataResponse* summary);
    
};
}
#endif