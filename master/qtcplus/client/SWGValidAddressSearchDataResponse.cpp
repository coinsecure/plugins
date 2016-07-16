
#include "SWGValidAddressSearchDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGValidAddressSearchDataResponse::SWGValidAddressSearchDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGValidAddressSearchDataResponse::SWGValidAddressSearchDataResponse() {
    init();
}

SWGValidAddressSearchDataResponse::~SWGValidAddressSearchDataResponse() {
    this->cleanup();
}

void
SWGValidAddressSearchDataResponse::init() {
    success = false;
message = new SWGValidAddressSearchData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGValidAddressSearchDataResponse::cleanup() {
    
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

SWGValidAddressSearchDataResponse*
SWGValidAddressSearchDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGValidAddressSearchDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGValidAddressSearchData", "SWGValidAddressSearchData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGValidAddressSearchDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGValidAddressSearchDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGValidAddressSearchData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGValidAddressSearchDataResponse::getSuccess() {
    return success;
}
void
SWGValidAddressSearchDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGValidAddressSearchData*
SWGValidAddressSearchDataResponse::getMessage() {
    return message;
}
void
SWGValidAddressSearchDataResponse::setMessage(SWGValidAddressSearchData* message) {
    this->message = message;
}

QString*
SWGValidAddressSearchDataResponse::getMethod() {
    return method;
}
void
SWGValidAddressSearchDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGValidAddressSearchDataResponse::getTitle() {
    return title;
}
void
SWGValidAddressSearchDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGValidAddressSearchDataResponse::getTime() {
    return time;
}
void
SWGValidAddressSearchDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

