
#include "SWGWalletSummaryDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWalletSummaryDataResponse::SWGWalletSummaryDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWalletSummaryDataResponse::SWGWalletSummaryDataResponse() {
    init();
}

SWGWalletSummaryDataResponse::~SWGWalletSummaryDataResponse() {
    this->cleanup();
}

void
SWGWalletSummaryDataResponse::init() {
    success = false;
message = new SWGWalletSummaryData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGWalletSummaryDataResponse::cleanup() {
    
if(message != NULL) {
        delete message;
    }
if(method != NULL) {
        delete method;
    }
if(title != NULL) {
        delete title;
    }
if(time != NULL) {
        delete time;
    }
}

SWGWalletSummaryDataResponse*
SWGWalletSummaryDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWalletSummaryDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGWalletSummaryData", "SWGWalletSummaryData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGWalletSummaryDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWalletSummaryDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGWalletSummaryData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGWalletSummaryDataResponse::getSuccess() {
    return success;
}
void
SWGWalletSummaryDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGWalletSummaryData*
SWGWalletSummaryDataResponse::getMessage() {
    return message;
}
void
SWGWalletSummaryDataResponse::setMessage(SWGWalletSummaryData* message) {
    this->message = message;
}

QString*
SWGWalletSummaryDataResponse::getMethod() {
    return method;
}
void
SWGWalletSummaryDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGWalletSummaryDataResponse::getTitle() {
    return title;
}
void
SWGWalletSummaryDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGWalletSummaryDataResponse::getTime() {
    return time;
}
void
SWGWalletSummaryDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

