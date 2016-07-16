
#include "SWGBankSummaryDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGBankSummaryDataResponse::SWGBankSummaryDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGBankSummaryDataResponse::SWGBankSummaryDataResponse() {
    init();
}

SWGBankSummaryDataResponse::~SWGBankSummaryDataResponse() {
    this->cleanup();
}

void
SWGBankSummaryDataResponse::init() {
    success = false;
message = new SWGBankSummaryData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGBankSummaryDataResponse::cleanup() {
    
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

SWGBankSummaryDataResponse*
SWGBankSummaryDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGBankSummaryDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGBankSummaryData", "SWGBankSummaryData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGBankSummaryDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGBankSummaryDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGBankSummaryData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGBankSummaryDataResponse::getSuccess() {
    return success;
}
void
SWGBankSummaryDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGBankSummaryData*
SWGBankSummaryDataResponse::getMessage() {
    return message;
}
void
SWGBankSummaryDataResponse::setMessage(SWGBankSummaryData* message) {
    this->message = message;
}

QString*
SWGBankSummaryDataResponse::getMethod() {
    return method;
}
void
SWGBankSummaryDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGBankSummaryDataResponse::getTitle() {
    return title;
}
void
SWGBankSummaryDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGBankSummaryDataResponse::getTime() {
    return time;
}
void
SWGBankSummaryDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

