#include "SWGExchangeTradeDataApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGExchangeTradeDataApi::SWGExchangeTradeDataApi() {}

SWGExchangeTradeDataApi::~SWGExchangeTradeDataApi() {}

SWGExchangeTradeDataApi::SWGExchangeTradeDataApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGExchangeTradeDataApi::/v1/exchange/ask/low(QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/exchange/ask/low");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/exchange/ask/lowCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/exchange/ask/lowCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGRateDataResponse* output = static_cast<SWGRateDataResponse*>(create(json, QString("SWGRateDataResponse")));
    

    worker->deleteLater();

    emit /v1/exchange/ask/lowSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/exchange/ask/orders(QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/exchange/ask/orders");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/exchange/ask/ordersCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/exchange/ask/ordersCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGRateVolDataResponse* output = static_cast<SWGRateVolDataResponse*>(create(json, QString("SWGRateVolDataResponse")));
    

    worker->deleteLater();

    emit /v1/exchange/ask/ordersSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/exchange/bid/high(QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/exchange/bid/high");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/exchange/bid/highCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/exchange/bid/highCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGRateDataResponse* output = static_cast<SWGRateDataResponse*>(create(json, QString("SWGRateDataResponse")));
    

    worker->deleteLater();

    emit /v1/exchange/bid/highSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/exchange/bid/orders(QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/exchange/bid/orders");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/exchange/bid/ordersCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/exchange/bid/ordersCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGRateVolDataResponse* output = static_cast<SWGRateVolDataResponse*>(create(json, QString("SWGRateVolDataResponse")));
    

    worker->deleteLater();

    emit /v1/exchange/bid/ordersSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/exchange/lastTrade(QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/exchange/lastTrade");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/exchange/lastTradeCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/exchange/lastTradeCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGLastTradeDataResponse* output = static_cast<SWGLastTradeDataResponse*>(create(json, QString("SWGLastTradeDataResponse")));
    

    worker->deleteLater();

    emit /v1/exchange/lastTradeSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/exchange/max24Hr(QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/exchange/max24Hr");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/exchange/max24HrCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/exchange/max24HrCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGRateDiffDataResponse* output = static_cast<SWGRateDiffDataResponse*>(create(json, QString("SWGRateDiffDataResponse")));
    

    worker->deleteLater();

    emit /v1/exchange/max24HrSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/exchange/min24Hr(QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/exchange/min24Hr");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/exchange/min24HrCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/exchange/min24HrCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGRateDiffDataResponse* output = static_cast<SWGRateDiffDataResponse*>(create(json, QString("SWGRateDiffDataResponse")));
    

    worker->deleteLater();

    emit /v1/exchange/min24HrSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/exchange/ticker(QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/exchange/ticker");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/exchange/tickerCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/exchange/tickerCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGStandardTickerResultData* output = static_cast<SWGStandardTickerResultData*>(create(json, QString("SWGStandardTickerResultData")));
    

    worker->deleteLater();

    emit /v1/exchange/tickerSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/user/exchange/ask/cancelled(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/ask/cancelled");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/user/exchange/ask/cancelledCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/user/exchange/ask/cancelledCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGOrderDataResponse* output = static_cast<SWGOrderDataResponse*>(create(json, QString("SWGOrderDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/ask/cancelledSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/user/exchange/ask/completed(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/ask/completed");


    if (fullPath.indexOf("?") > 0) 
      fullPath.append("&");
    else 
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("from"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(from)));

    if (fullPath.indexOf("?") > 0) 
      fullPath.append("&");
    else 
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("to"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(to)));

    if (fullPath.indexOf("?") > 0) 
      fullPath.append("&");
    else 
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("max"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(max)));

    if (fullPath.indexOf("?") > 0) 
      fullPath.append("&");
    else 
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("offset"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(offset)));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/user/exchange/ask/completedCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/user/exchange/ask/completedCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGOrderDataResponse* output = static_cast<SWGOrderDataResponse*>(create(json, QString("SWGOrderDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/ask/completedSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/user/exchange/ask/pending(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/ask/pending");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/user/exchange/ask/pendingCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/user/exchange/ask/pendingCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGOrderDataResponse* output = static_cast<SWGOrderDataResponse*>(create(json, QString("SWGOrderDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/ask/pendingSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/user/exchange/bid/cancelled(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bid/cancelled");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/user/exchange/bid/cancelledCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/user/exchange/bid/cancelledCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGOrderDataResponse* output = static_cast<SWGOrderDataResponse*>(create(json, QString("SWGOrderDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bid/cancelledSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/user/exchange/bid/completed(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bid/completed");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/user/exchange/bid/completedCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/user/exchange/bid/completedCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGOrderDataResponse* output = static_cast<SWGOrderDataResponse*>(create(json, QString("SWGOrderDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bid/completedSignal(output);
    
}
void
SWGExchangeTradeDataApi::/v1/user/exchange/bid/pending(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bid/pending");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeTradeDataApi::/v1/user/exchange/bid/pendingCallback);

    worker->execute(&input);
}

void
SWGExchangeTradeDataApi::/v1/user/exchange/bid/pendingCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGOrderDataResponse* output = static_cast<SWGOrderDataResponse*>(create(json, QString("SWGOrderDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bid/pendingSignal(output);
    
}
} /* namespace Swagger */
