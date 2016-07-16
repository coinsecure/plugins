#include "SWGWalletActionsApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGWalletActionsApi::SWGWalletActionsApi() {}

SWGWalletActionsApi::~SWGWalletActionsApi() {}

SWGWalletActionsApi::SWGWalletActionsApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/address/new(SWGNewAddress body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/address/new");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/address/newCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/address/newCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGWalletAddressDataResponse* output = static_cast<SWGWalletAddressDataResponse*>(create(json, QString("SWGWalletAddressDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/wallet/coin/address/newSignal(output);
    
}
void
SWGWalletActionsApi::/v1/user/wallet/coin/new(SWGNewWallet body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/new");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/newCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/newCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGWalletAddressDataResponse* output = static_cast<SWGWalletAddressDataResponse*>(create(json, QString("SWGWalletAddressDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/wallet/coin/newSignal(output);
    
}
void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/initiate(SWGSendCoinWallet body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/withdraw/initiate");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/initiateCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/initiateCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/wallet/coin/withdraw/initiateSignal(output);
    
}
void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/sendToExchange(SWGSendExchange body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/withdraw/sendToExchange");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/sendToExchangeCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/sendToExchangeCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/wallet/coin/withdraw/sendToExchangeSignal(output);
    
}
void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/unverified/cancel(QString* authorization, SWGWithdrawID body, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/withdraw/unverified/cancel");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/unverified/cancelCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/unverified/cancelCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/wallet/coin/withdraw/unverified/cancelSignal(output);
    
}
void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/verify(QString* authorization, SWGCode body, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/withdraw/verify");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/verifyCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/verifyCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/wallet/coin/withdraw/verifySignal(output);
    
}
void
SWGWalletActionsApi::/v1/wallet/coin/withdraw/newVerifycode(SWGWithdrawID body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/wallet/coin/withdraw/newVerifycode");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/wallet/coin/withdraw/newVerifycodeCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/wallet/coin/withdraw/newVerifycodeCallback(HttpRequestWorker * worker) {
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

    emit /v1/wallet/coin/withdraw/newVerifycodeSignal(output);
    
}
} /* namespace Swagger */
