#ifndef _SWG_SWGExchangeBankFiatDataApi_H_
#define _SWG_SWGExchangeBankFiatDataApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGFiatBankDataResponse.h"
#include "SWGFailResult.h"
#include "SWGRateDataResponse.h"
#include "SWGFiatDepDataResponse.h"
#include "SWGFiatWithDataResponse.h"

#include <QObject>

namespace Swagger {

class SWGExchangeBankFiatDataApi: public QObject {
    Q_OBJECT

public:
    SWGExchangeBankFiatDataApi();
    SWGExchangeBankFiatDataApi(QString host, QString basePath);
    ~SWGExchangeBankFiatDataApi();

    QString host;
    QString basePath;

    void /v1/user/exchange/bank/fiat/accounts(QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/balance/available(QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/balance/pending(QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/balance/total(QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/deposit/cancelled(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/fiat/deposit/unverified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/fiat/deposit/verified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/cancelled(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/completed(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/unverified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/verified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    
private:
    void /v1/user/exchange/bank/fiat/accountsCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/balance/availableCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/balance/pendingCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/balance/totalCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/deposit/cancelledCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/deposit/unverifiedCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/deposit/verifiedCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/cancelledCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/completedCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/unverifiedCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/verifiedCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/user/exchange/bank/fiat/accountsSignal(SWGFiatBankDataResponse* summary);
    void /v1/user/exchange/bank/fiat/balance/availableSignal(SWGRateDataResponse* summary);
    void /v1/user/exchange/bank/fiat/balance/pendingSignal(SWGRateDataResponse* summary);
    void /v1/user/exchange/bank/fiat/balance/totalSignal(SWGRateDataResponse* summary);
    void /v1/user/exchange/bank/fiat/deposit/cancelledSignal(SWGFiatDepDataResponse* summary);
    void /v1/user/exchange/bank/fiat/deposit/unverifiedSignal(SWGFiatDepDataResponse* summary);
    void /v1/user/exchange/bank/fiat/deposit/verifiedSignal(SWGFiatDepDataResponse* summary);
    void /v1/user/exchange/bank/fiat/withdraw/cancelledSignal(SWGFiatWithDataResponse* summary);
    void /v1/user/exchange/bank/fiat/withdraw/completedSignal(SWGFiatWithDataResponse* summary);
    void /v1/user/exchange/bank/fiat/withdraw/unverifiedSignal(SWGFiatWithDataResponse* summary);
    void /v1/user/exchange/bank/fiat/withdraw/verifiedSignal(SWGFiatWithDataResponse* summary);
    
};
}
#endif