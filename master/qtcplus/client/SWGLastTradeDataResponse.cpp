
#include "SWGLastTradeDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGLastTradeDataResponse::SWGLastTradeDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGLastTradeDataResponse::SWGLastTradeDataResponse() {
    init();
}

SWGLastTradeDataResponse::~SWGLastTradeDataResponse() {
    this->cleanup();
}

void
SWGLastTradeDataResponse::init() {
    success = false;
message = new SWGLastTradeData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGLastTradeDataResponse::cleanup() {
    
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

SWGLastTradeDataResponse*
SWGLastTradeDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGLastTradeDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGLastTradeData", "SWGLastTradeData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGLastTradeDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGLastTradeDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGLastTradeData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGLastTradeDataResponse::getSuccess() {
    return success;
}
void
SWGLastTradeDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGLastTradeData*
SWGLastTradeDataResponse::getMessage() {
    return message;
}
void
SWGLastTradeDataResponse::setMessage(SWGLastTradeData* message) {
    this->message = message;
}

QString*
SWGLastTradeDataResponse::getMethod() {
    return method;
}
void
SWGLastTradeDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGLastTradeDataResponse::getTitle() {
    return title;
}
void
SWGLastTradeDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGLastTradeDataResponse::getTime() {
    return time;
}
void
SWGLastTradeDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

