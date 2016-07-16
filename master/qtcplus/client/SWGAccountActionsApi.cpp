#include "SWGAccountActionsApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGAccountActionsApi::SWGAccountActionsApi() {}

SWGAccountActionsApi::~SWGAccountActionsApi() {}

SWGAccountActionsApi::SWGAccountActionsApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGAccountActionsApi::/v1/login(SWGLoginFormNew body, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/login");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/loginCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/loginCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGStandardLoginResultData* output = static_cast<SWGStandardLoginResultData*>(create(json, QString("SWGStandardLoginResultData")));
    

    worker->deleteLater();

    emit /v1/loginSignal(output);
    
}
void
SWGAccountActionsApi::/v1/login/initiate(SWGLoginId body, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/login/initiate");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/login/initiateCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/login/initiateCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGStandardInitiateLoginResultData* output = static_cast<SWGStandardInitiateLoginResultData*>(create(json, QString("SWGStandardInitiateLoginResultData")));
    

    worker->deleteLater();

    emit /v1/login/initiateSignal(output);
    
}
void
SWGAccountActionsApi::/v1/login/password/forgot(SWGEmail body, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/login/password/forgot");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/login/password/forgotCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/login/password/forgotCallback(HttpRequestWorker * worker) {
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

    emit /v1/login/password/forgotSignal(output);
    
}
void
SWGAccountActionsApi::/v1/signup(SWGSignupForm body, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/signup");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/signupCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/signupCallback(HttpRequestWorker * worker) {
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

    emit /v1/signupSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/bank/otp/Number(QString* number, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/bank/otp/{number}");

    QString numberPathParam("{"); numberPathParam.append("number").append("}");
    fullPath.replace(numberPathParam, stringValue(number));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/bank/otp/NumberCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/bank/otp/NumberCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGStandardInitiateLoginResultData* output = static_cast<SWGStandardInitiateLoginResultData*>(create(json, QString("SWGStandardInitiateLoginResultData")));
    

    worker->deleteLater();

    emit /v1/user/bank/otp/NumberSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/exchange/kyc(QString* panNumber, QString* acctNick, QString* name, QString* ban, QString* ifsc, QString* acctType, QString* banType, QString* phone, QString* otp, SWGHttpRequestInputFileElement* file, QString* authorization, QString* message, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/exchange/kyc");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    if (panNumber != NULL) {
        input.add_var("panNumber", *panNumber);
    }
if (acctNick != NULL) {
        input.add_var("acctNick", *acctNick);
    }
if (name != NULL) {
        input.add_var("name", *name);
    }
if (ban != NULL) {
        input.add_var("ban", *ban);
    }
if (ifsc != NULL) {
        input.add_var("ifsc", *ifsc);
    }
if (acctType != NULL) {
        input.add_var("acctType", *acctType);
    }
if (message != NULL) {
        input.add_var("message", *message);
    }
if (banType != NULL) {
        input.add_var("banType", *banType);
    }
if (phone != NULL) {
        input.add_var("phone", *phone);
    }
if (otp != NULL) {
        input.add_var("otp", *otp);
    }
if (file != NULL) {
        input.add_file("file", *file.local_filename, *file.request_filename, *file.mime_type);
    }



    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/exchange/kycCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/exchange/kycCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/exchange/kycSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/gcm/Code(QString* code, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/gcm/{code}");

    QString codePathParam("{"); codePathParam.append("code").append("}");
    fullPath.replace(codePathParam, stringValue(code));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/gcm/CodeCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/gcm/CodeCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/gcm/CodeSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/kyc/otp/Number(QString* number, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/kyc/otp/{number}");

    QString numberPathParam("{"); numberPathParam.append("number").append("}");
    fullPath.replace(numberPathParam, stringValue(number));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/kyc/otp/NumberCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/kyc/otp/NumberCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/kyc/otp/NumberSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/logout(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/logout");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/logoutCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/logoutCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/logoutSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/netki/create(SWGNetkiNameAddress body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/netki/create");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/netki/createCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/netki/createCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/netki/createSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/netki/update(SWGAddress body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/netki/update");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PATCH");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/netki/updateCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/netki/updateCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/netki/updateSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/profile/image/delete(SWGNetkiName body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/contact");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/profile/image/deleteCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/profile/image/deleteCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/profile/image/deleteSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/profile/image/update(QString* netkiName, bool isPublic, SWGHttpRequestInputFileElement* file, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/profile/image/update");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PATCH");

    if (netkiName != NULL) {
        input.add_var("netkiName", *netkiName);
    }
if (isPublic != NULL) {
        input.add_var("isPublic", *isPublic);
    }
if (file != NULL) {
        input.add_file("file", *file.local_filename, *file.request_filename, *file.mime_type);
    }



    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/profile/image/updateCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/profile/image/updateCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/profile/image/updateSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/profile/phone(SWGNumberOtp body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/profile/phone/new");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/profile/phoneCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/profile/phoneCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/profile/phoneSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/profile/phone/Number(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/profile/phone/delete");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/profile/phone/NumberCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/profile/phone/NumberCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/profile/phone/NumberSignal(output);
    
}
void
SWGAccountActionsApi::/v1/user/profile/phone/otp/Number(QString* number, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/profile/phone/otp/{number}");

    QString numberPathParam("{"); numberPathParam.append("number").append("}");
    fullPath.replace(numberPathParam, stringValue(number));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGAccountActionsApi::/v1/user/profile/phone/otp/NumberCallback);

    worker->execute(&input);
}

void
SWGAccountActionsApi::/v1/user/profile/phone/otp/NumberCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/profile/phone/otp/NumberSignal(output);
    
}
} /* namespace Swagger */
