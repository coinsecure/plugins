#include "SWGExchangeBankActionsApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGExchangeBankActionsApi::SWGExchangeBankActionsApi() {}

SWGExchangeBankActionsApi::~SWGExchangeBankActionsApi() {}

SWGExchangeBankActionsApi::SWGExchangeBankActionsApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/initiate(SWGSendCoin body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/coin/withdraw/initiate");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/initiateCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/initiateCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/coin/withdraw/initiateSignal(output);
    
}
void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/newVerifycode(SWGWithdrawID body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/coin/withdraw/newVerifycode");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/newVerifycodeCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/newVerifycodeCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/coin/withdraw/newVerifycodeSignal(output);
    
}
void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/unverified/cancel(SWGWithdrawID body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/coin/withdraw/unverified/cancel");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/unverified/cancelCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/unverified/cancelCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/coin/withdraw/unverified/cancelSignal(output);
    
}
void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/verify(SWGCode body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/coin/withdraw/verify");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/verifyCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/coin/withdraw/verifyCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/coin/withdraw/verifySignal(output);
    
}
void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/account/new(SWGNewBankForm body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/account/new");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/account/newCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/account/newCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/fiat/account/newSignal(output);
    
}
void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/deposit/cancel(SWGDepositID body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/deposit/cancel");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/deposit/cancelCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/deposit/cancelCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/fiat/deposit/cancelSignal(output);
    
}
void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/deposit/new(SWGNewFiatBankDeposit body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/deposit/new");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/deposit/newCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/deposit/newCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/fiat/deposit/newSignal(output);
    
}
void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/initiate(SWGWithdrawFiat body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/withdraw/initiate");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/initiateCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/initiateCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/fiat/withdraw/initiateSignal(output);
    
}
void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/newVerifycode(SWGWithdrawID body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/withdraw/newVerifycode");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/newVerifycodeCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/newVerifycodeCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/fiat/withdraw/newVerifycodeSignal(output);
    
}
void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/unverified/cancel(SWGWithdrawID body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/withdraw/unverified/cancel");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/unverified/cancelCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/unverified/cancelCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/fiat/withdraw/unverified/cancelSignal(output);
    
}
void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/verify(SWGCode body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/bank/fiat/withdraw/verify");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/verifyCallback);

    worker->execute(&input);
}

void
SWGExchangeBankActionsApi::/v1/user/exchange/bank/fiat/withdraw/verifyCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/bank/fiat/withdraw/verifySignal(output);
    
}
} /* namespace Swagger */
