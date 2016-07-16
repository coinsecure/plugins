#ifndef _SWG_SWGExchangeTradeDataApi_H_
#define _SWG_SWGExchangeTradeDataApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGRateDataResponse.h"
#include "SWGFailResult.h"
#include "SWGRateVolDataResponse.h"
#include "SWGLastTradeDataResponse.h"
#include "SWGRateDiffDataResponse.h"
#include "SWGStandardTickerResultData.h"
#include "SWGOrderDataResponse.h"

#include <QObject>

namespace Swagger {

class SWGExchangeTradeDataApi: public QObject {
    Q_OBJECT

public:
    SWGExchangeTradeDataApi();
    SWGExchangeTradeDataApi(QString host, QString basePath);
    ~SWGExchangeTradeDataApi();

    QString host;
    QString basePath;

    void /v1/exchange/ask/low(QString* accept);
    void /v1/exchange/ask/orders(QString* accept);
    void /v1/exchange/bid/high(QString* accept);
    void /v1/exchange/bid/orders(QString* accept);
    void /v1/exchange/lastTrade(QString* accept);
    void /v1/exchange/max24Hr(QString* accept);
    void /v1/exchange/min24Hr(QString* accept);
    void /v1/exchange/ticker(QString* accept);
    void /v1/user/exchange/ask/cancelled(QString* authorization, QString* accept);
    void /v1/user/exchange/ask/completed(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept);
    void /v1/user/exchange/ask/pending(QString* authorization, QString* accept);
    void /v1/user/exchange/bid/cancelled(QString* authorization, QString* accept);
    void /v1/user/exchange/bid/completed(QString* authorization, QString* accept);
    void /v1/user/exchange/bid/pending(QString* authorization, QString* accept);
    
private:
    void /v1/exchange/ask/lowCallback (HttpRequestWorker * worker);
    void /v1/exchange/ask/ordersCallback (HttpRequestWorker * worker);
    void /v1/exchange/bid/highCallback (HttpRequestWorker * worker);
    void /v1/exchange/bid/ordersCallback (HttpRequestWorker * worker);
    void /v1/exchange/lastTradeCallback (HttpRequestWorker * worker);
    void /v1/exchange/max24HrCallback (HttpRequestWorker * worker);
    void /v1/exchange/min24HrCallback (HttpRequestWorker * worker);
    void /v1/exchange/tickerCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/ask/cancelledCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/ask/completedCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/ask/pendingCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bid/cancelledCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bid/completedCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bid/pendingCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/exchange/ask/lowSignal(SWGRateDataResponse* summary);
    void /v1/exchange/ask/ordersSignal(SWGRateVolDataResponse* summary);
    void /v1/exchange/bid/highSignal(SWGRateDataResponse* summary);
    void /v1/exchange/bid/ordersSignal(SWGRateVolDataResponse* summary);
    void /v1/exchange/lastTradeSignal(SWGLastTradeDataResponse* summary);
    void /v1/exchange/max24HrSignal(SWGRateDiffDataResponse* summary);
    void /v1/exchange/min24HrSignal(SWGRateDiffDataResponse* summary);
    void /v1/exchange/tickerSignal(SWGStandardTickerResultData* summary);
    void /v1/user/exchange/ask/cancelledSignal(SWGOrderDataResponse* summary);
    void /v1/user/exchange/ask/completedSignal(SWGOrderDataResponse* summary);
    void /v1/user/exchange/ask/pendingSignal(SWGOrderDataResponse* summary);
    void /v1/user/exchange/bid/cancelledSignal(SWGOrderDataResponse* summary);
    void /v1/user/exchange/bid/completedSignal(SWGOrderDataResponse* summary);
    void /v1/user/exchange/bid/pendingSignal(SWGOrderDataResponse* summary);
    
};
}
#endif