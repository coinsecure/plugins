
#include "SWGFailResult.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGFailResult::SWGFailResult(QString* json) {
    init();
    this->fromJson(*json);
}

SWGFailResult::SWGFailResult() {
    init();
}

SWGFailResult::~SWGFailResult() {
    this->cleanup();
}

void
SWGFailResult::init() {
    success = false;
message = new SWGJsValue();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGFailResult::cleanup() {
    
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

SWGFailResult*
SWGFailResult::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGFailResult::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGJsValue", "SWGJsValue");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGFailResult::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGFailResult::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGJsValue"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGFailResult::getSuccess() {
    return success;
}
void
SWGFailResult::setSuccess(bool success) {
    this->success = success;
}

SWGJsValue*
SWGFailResult::getMessage() {
    return message;
}
void
SWGFailResult::setMessage(SWGJsValue* message) {
    this->message = message;
}

QString*
SWGFailResult::getMethod() {
    return method;
}
void
SWGFailResult::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGFailResult::getTitle() {
    return title;
}
void
SWGFailResult::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGFailResult::getTime() {
    return time;
}
void
SWGFailResult::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

