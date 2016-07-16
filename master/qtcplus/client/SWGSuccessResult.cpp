
#include "SWGSuccessResult.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccessResult::SWGSuccessResult(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccessResult::SWGSuccessResult() {
    init();
}

SWGSuccessResult::~SWGSuccessResult() {
    this->cleanup();
}

void
SWGSuccessResult::init() {
    success = false;
message = new SWGJsValue();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGSuccessResult::cleanup() {
    
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

SWGSuccessResult*
SWGSuccessResult::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccessResult::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGJsValue", "SWGJsValue");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGSuccessResult::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccessResult::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGJsValue"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGSuccessResult::getSuccess() {
    return success;
}
void
SWGSuccessResult::setSuccess(bool success) {
    this->success = success;
}

SWGJsValue*
SWGSuccessResult::getMessage() {
    return message;
}
void
SWGSuccessResult::setMessage(SWGJsValue* message) {
    this->message = message;
}

QString*
SWGSuccessResult::getMethod() {
    return method;
}
void
SWGSuccessResult::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGSuccessResult::getTitle() {
    return title;
}
void
SWGSuccessResult::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGSuccessResult::getTime() {
    return time;
}
void
SWGSuccessResult::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

