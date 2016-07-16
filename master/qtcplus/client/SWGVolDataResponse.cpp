
#include "SWGVolDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGVolDataResponse::SWGVolDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGVolDataResponse::SWGVolDataResponse() {
    init();
}

SWGVolDataResponse::~SWGVolDataResponse() {
    this->cleanup();
}

void
SWGVolDataResponse::init() {
    success = false;
message = new SWGVolData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGVolDataResponse::cleanup() {
    
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

SWGVolDataResponse*
SWGVolDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGVolDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGVolData", "SWGVolData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGVolDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGVolDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGVolData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGVolDataResponse::getSuccess() {
    return success;
}
void
SWGVolDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGVolData*
SWGVolDataResponse::getMessage() {
    return message;
}
void
SWGVolDataResponse::setMessage(SWGVolData* message) {
    this->message = message;
}

QString*
SWGVolDataResponse::getMethod() {
    return method;
}
void
SWGVolDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGVolDataResponse::getTitle() {
    return title;
}
void
SWGVolDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGVolDataResponse::getTime() {
    return time;
}
void
SWGVolDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

