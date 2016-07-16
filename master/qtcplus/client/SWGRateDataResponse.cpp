
#include "SWGRateDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGRateDataResponse::SWGRateDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGRateDataResponse::SWGRateDataResponse() {
    init();
}

SWGRateDataResponse::~SWGRateDataResponse() {
    this->cleanup();
}

void
SWGRateDataResponse::init() {
    success = false;
message = new SWGRateData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGRateDataResponse::cleanup() {
    
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

SWGRateDataResponse*
SWGRateDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGRateDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGRateData", "SWGRateData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGRateDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGRateDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGRateData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGRateDataResponse::getSuccess() {
    return success;
}
void
SWGRateDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGRateData*
SWGRateDataResponse::getMessage() {
    return message;
}
void
SWGRateDataResponse::setMessage(SWGRateData* message) {
    this->message = message;
}

QString*
SWGRateDataResponse::getMethod() {
    return method;
}
void
SWGRateDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGRateDataResponse::getTitle() {
    return title;
}
void
SWGRateDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGRateDataResponse::getTime() {
    return time;
}
void
SWGRateDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

