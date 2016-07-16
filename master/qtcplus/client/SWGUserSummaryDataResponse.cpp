
#include "SWGUserSummaryDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGUserSummaryDataResponse::SWGUserSummaryDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGUserSummaryDataResponse::SWGUserSummaryDataResponse() {
    init();
}

SWGUserSummaryDataResponse::~SWGUserSummaryDataResponse() {
    this->cleanup();
}

void
SWGUserSummaryDataResponse::init() {
    success = false;
message = new SWGUserSummaryData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGUserSummaryDataResponse::cleanup() {
    
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

SWGUserSummaryDataResponse*
SWGUserSummaryDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGUserSummaryDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGUserSummaryData", "SWGUserSummaryData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGUserSummaryDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGUserSummaryDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGUserSummaryData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGUserSummaryDataResponse::getSuccess() {
    return success;
}
void
SWGUserSummaryDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGUserSummaryData*
SWGUserSummaryDataResponse::getMessage() {
    return message;
}
void
SWGUserSummaryDataResponse::setMessage(SWGUserSummaryData* message) {
    this->message = message;
}

QString*
SWGUserSummaryDataResponse::getMethod() {
    return method;
}
void
SWGUserSummaryDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGUserSummaryDataResponse::getTitle() {
    return title;
}
void
SWGUserSummaryDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGUserSummaryDataResponse::getTime() {
    return time;
}
void
SWGUserSummaryDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

