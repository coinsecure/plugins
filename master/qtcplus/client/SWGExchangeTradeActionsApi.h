#ifndef _SWG_SWGExchangeTradeActionsApi_H_
#define _SWG_SWGExchangeTradeActionsApi_H_

#include "SWGHttpRequest.h"

#include "SWGAskID.h"
#include <QString>
#include "SWGSuccessResult.h"
#include "SWGFailResult.h"
#include "SWGRateVolData.h"
#include "SWGSuccessResultList.h"
#include "SWGBidID.h"
#include "SWGMinFiat.h"
#include "SWGMaxVol.h"

#include <QObject>

namespace Swagger {

class SWGExchangeTradeActionsApi: public QObject {
    Q_OBJECT

public:
    SWGExchangeTradeActionsApi();
    SWGExchangeTradeActionsApi(QString host, QString basePath);
    ~SWGExchangeTradeActionsApi();

    QString host;
    QString basePath;

    void /v1/user/exchange/ask/cancel(SWGAskID body, QString* authorization, QString* accept);
    void /v1/user/exchange/ask/new(SWGRateVolData body, QString* authorization, QString* accept);
    void /v1/user/exchange/bid/cancel(SWGBidID body, QString* authorization, QString* accept);
    void /v1/user/exchange/bid/new(SWGRateVolData body, QString* authorization, QString* accept);
    void /v1/user/exchange/instant/buy(SWGMinFiat body, QString* authorization, QString* accept);
    void /v1/user/exchange/instant/sell(SWGMaxVol body, QString* authorization, QString* accept);
    
private:
    void /v1/user/exchange/ask/cancelCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/ask/newCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bid/cancelCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bid/newCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/instant/buyCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/instant/sellCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/user/exchange/ask/cancelSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/ask/newSignal(SWGSuccessResultList* summary);
    void /v1/user/exchange/bid/cancelSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bid/newSignal(SWGSuccessResultList* summary);
    void /v1/user/exchange/instant/buySignal(SWGSuccessResultList* summary);
    void /v1/user/exchange/instant/sellSignal(SWGSuccessResultList* summary);
    
};
}
#endif