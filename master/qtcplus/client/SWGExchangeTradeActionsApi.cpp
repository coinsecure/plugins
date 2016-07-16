#include "SWGExchangeTradeActionsApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGExchangeTradeActionsApi::SWGExchangeTradeActionsApi() {}

SWGExchangeTradeActionsApi::~SWGExchangeTradeActionsApi() {}

SWGExchangeTradeActionsApi::SWGExchangeTradeActionsApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGExchangeTradeActionsApi::/v1/user/exchange/ask/cancel(SWGAskID body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/ask/cancel");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeActionsApi::/v1/user/exchange/ask/cancelCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeActionsApi::/v1/user/exchange/ask/cancelCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResult* output = static_cast<SWGSuccessResult*>(create(json, QString("SWGSuccessResult")));
    

    worker->deleteLater();

    emit /v1/user/exchange/ask/cancelSignal(output);
    
}
void
SWGExchangeTradeActionsApi::/v1/user/exchange/ask/new(SWGRateVolData body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/ask/new");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeActionsApi::/v1/user/exchange/ask/newCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeActionsApi::/v1/user/exchange/ask/newCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResultList* output = static_cast<SWGSuccessResultList*>(create(json, QString("SWGSuccessResultList")));
    

    worker->deleteLater();

    emit /v1/user/exchange/ask/newSignal(output);
    
}
void
SWGExchangeTradeActionsApi::/v1/user/exchange/bid/cancel(SWGBidID body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bid/cancel");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeActionsApi::/v1/user/exchange/bid/cancelCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeActionsApi::/v1/user/exchange/bid/cancelCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResult* output = static_cast<SWGSuccessResult*>(create(json, QString("SWGSuccessResult")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bid/cancelSignal(output);
    
}
void
SWGExchangeTradeActionsApi::/v1/user/exchange/bid/new(SWGRateVolData body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bid/new");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeActionsApi::/v1/user/exchange/bid/newCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeActionsApi::/v1/user/exchange/bid/newCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResultList* output = static_cast<SWGSuccessResultList*>(create(json, QString("SWGSuccessResultList")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bid/newSignal(output);
    
}
void
SWGExchangeTradeActionsApi::/v1/user/exchange/instant/buy(SWGMinFiat body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/instant/buy");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeActionsApi::/v1/user/exchange/instant/buyCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeActionsApi::/v1/user/exchange/instant/buyCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResultList* output = static_cast<SWGSuccessResultList*>(create(json, QString("SWGSuccessResultList")));
    

    worker->deleteLater();

    emit /v1/user/exchange/instant/buySignal(output);
    
}
void
SWGExchangeTradeActionsApi::/v1/user/exchange/instant/sell(SWGMaxVol body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/instant/sell");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeActionsApi::/v1/user/exchange/instant/sellCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeActionsApi::/v1/user/exchange/instant/sellCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResultList* output = static_cast<SWGSuccessResultList*>(create(json, QString("SWGSuccessResultList")));
    

    worker->deleteLater();

    emit /v1/user/exchange/instant/sellSignal(output);
    
}
} /* namespace Swagger */
