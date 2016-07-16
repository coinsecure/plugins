#include "SWGSecurityActionsApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGSecurityActionsApi::SWGSecurityActionsApi() {}

SWGSecurityActionsApi::~SWGSecurityActionsApi() {}

SWGSecurityActionsApi::SWGSecurityActionsApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGSecurityActionsApi::/v1/mfa/authy/initiate(SWGMethodCountryMobile body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/mfa/authy/initiate");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGSecurityActionsApi::/v1/mfa/authy/initiateCallback);

    worker->execute(&input);
}

void
SWGSecurityActionsApi::/v1/mfa/authy/initiateCallback(HttpRequestWorker * worker) {
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

    emit /v1/mfa/authy/initiateSignal(output);
    
}
void
SWGSecurityActionsApi::/v1/mfa/ga/initiate(SWGMethodCountryMobile body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/mfa/ga/initiate");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGSecurityActionsApi::/v1/mfa/ga/initiateCallback);

    worker->execute(&input);
}

void
SWGSecurityActionsApi::/v1/mfa/ga/initiateCallback(HttpRequestWorker * worker) {
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

    emit /v1/mfa/ga/initiateSignal(output);
    
}
void
SWGSecurityActionsApi::/v1/user/mfa/authy/call(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/mfa/authy/call");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGSecurityActionsApi::/v1/user/mfa/authy/callCallback);

    worker->execute(&input);
}

void
SWGSecurityActionsApi::/v1/user/mfa/authy/callCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/mfa/authy/callSignal(output);
    
}
void
SWGSecurityActionsApi::/v1/user/mfa/authy/disable(SWGCode body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/mfa/authy/disable");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGSecurityActionsApi::/v1/user/mfa/authy/disableCallback);

    worker->execute(&input);
}

void
SWGSecurityActionsApi::/v1/user/mfa/authy/disableCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/mfa/authy/disableSignal(output);
    
}
void
SWGSecurityActionsApi::/v1/user/mfa/authy/initiate/enable(SWGCodeCountryMobile body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/mfa/authy/initiate/enable");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGSecurityActionsApi::/v1/user/mfa/authy/initiate/enableCallback);

    worker->execute(&input);
}

void
SWGSecurityActionsApi::/v1/user/mfa/authy/initiate/enableCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/mfa/authy/initiate/enableSignal(output);
    
}
void
SWGSecurityActionsApi::/v1/user/mfa/authy/sms(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/mfa/authy/sms");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGSecurityActionsApi::/v1/user/mfa/authy/smsCallback);

    worker->execute(&input);
}

void
SWGSecurityActionsApi::/v1/user/mfa/authy/smsCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/mfa/authy/smsSignal(output);
    
}
void
SWGSecurityActionsApi::/v1/user/mfa/ga/disable(SWGCode body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/mfa/ga/disable");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGSecurityActionsApi::/v1/user/mfa/ga/disableCallback);

    worker->execute(&input);
}

void
SWGSecurityActionsApi::/v1/user/mfa/ga/disableCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/mfa/ga/disableSignal(output);
    
}
void
SWGSecurityActionsApi::/v1/user/mfa/ga/initiate/enable(SWGCodeCountryMobile body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/mfa/ga/initiate/enable");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGSecurityActionsApi::/v1/user/mfa/ga/initiate/enableCallback);

    worker->execute(&input);
}

void
SWGSecurityActionsApi::/v1/user/mfa/ga/initiate/enableCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/mfa/ga/initiate/enableSignal(output);
    
}
void
SWGSecurityActionsApi::/v1/user/password/change(SWGChangePassword body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/password/change");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PATCH");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGSecurityActionsApi::/v1/user/password/changeCallback);

    worker->execute(&input);
}

void
SWGSecurityActionsApi::/v1/user/password/changeCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/password/changeSignal(output);
    
}
void
SWGSecurityActionsApi::/v1/user/password/reset(SWGResetPassword body, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/password/reset");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PATCH");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGSecurityActionsApi::/v1/user/password/resetCallback);

    worker->execute(&input);
}

void
SWGSecurityActionsApi::/v1/user/password/resetCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/password/resetSignal(output);
    
}
} /* namespace Swagger */
