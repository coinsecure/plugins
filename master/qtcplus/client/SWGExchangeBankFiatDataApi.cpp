#include "SWGExchangeBankFiatDataApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGExchangeBankFiatDataApi::SWGExchangeBankFiatDataApi() {}

SWGExchangeBankFiatDataApi::~SWGExchangeBankFiatDataApi() {}

SWGExchangeBankFiatDataApi::SWGExchangeBankFiatDataApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/accounts(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/accounts");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/accountsCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/accountsCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGFiatBankDataResponse* output = static_cast<SWGFiatBankDataResponse*>(create(json, QString("SWGFiatBankDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bank/fiat/accountsSignal(output);
    
}
void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/balance/available(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/balance/total");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/balance/availableCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/balance/availableCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/fiat/balance/availableSignal(output);
    
}
void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/balance/pending(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/balance/pending");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/balance/pendingCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/balance/pendingCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/fiat/balance/pendingSignal(output);
    
}
void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/balance/total(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/balance/available");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/balance/totalCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/balance/totalCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/fiat/balance/totalSignal(output);
    
}
void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/deposit/cancelled(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/deposit/cancelled");


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
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/deposit/cancelledCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/deposit/cancelledCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGFiatDepDataResponse* output = static_cast<SWGFiatDepDataResponse*>(create(json, QString("SWGFiatDepDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bank/fiat/deposit/cancelledSignal(output);
    
}
void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/deposit/unverified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/deposit/unverified");


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
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/deposit/unverifiedCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/deposit/unverifiedCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGFiatDepDataResponse* output = static_cast<SWGFiatDepDataResponse*>(create(json, QString("SWGFiatDepDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bank/fiat/deposit/unverifiedSignal(output);
    
}
void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/deposit/verified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/deposit/verified");


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
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/deposit/verifiedCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/deposit/verifiedCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGFiatDepDataResponse* output = static_cast<SWGFiatDepDataResponse*>(create(json, QString("SWGFiatDepDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bank/fiat/deposit/verifiedSignal(output);
    
}
void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/cancelled(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/withdraw/cancelled");


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
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/cancelledCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/cancelledCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGFiatWithDataResponse* output = static_cast<SWGFiatWithDataResponse*>(create(json, QString("SWGFiatWithDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bank/fiat/withdraw/cancelledSignal(output);
    
}
void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/completed(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/withdraw/completed");


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
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/completedCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/completedCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGFiatWithDataResponse* output = static_cast<SWGFiatWithDataResponse*>(create(json, QString("SWGFiatWithDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bank/fiat/withdraw/completedSignal(output);
    
}
void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/unverified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/withdraw/unverified");


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
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/unverifiedCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/unverifiedCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGFiatWithDataResponse* output = static_cast<SWGFiatWithDataResponse*>(create(json, QString("SWGFiatWithDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bank/fiat/withdraw/unverifiedSignal(output);
    
}
void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/verified(QString* authorization, qint64 from, qint64 to, qint32 max, qint64 offset, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/withdraw/verified");


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
            &SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/verifiedCallback);

    worker->execute(&input);
}

void
SWGExchangeBankFiatDataApi::/v1/user/exchange/bank/fiat/withdraw/verifiedCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGFiatWithDataResponse* output = static_cast<SWGFiatWithDataResponse*>(create(json, QString("SWGFiatWithDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/exchange/bank/fiat/withdraw/verifiedSignal(output);
    
}
} /* namespace Swagger */
