
#include "SWGStandardLoginResultData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGStandardLoginResultData::SWGStandardLoginResultData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGStandardLoginResultData::SWGStandardLoginResultData() {
    init();
}

SWGStandardLoginResultData::~SWGStandardLoginResultData() {
    this->cleanup();
}

void
SWGStandardLoginResultData::init() {
    success = false;
message = new SWGSuccessLoginResponse();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGStandardLoginResultData::cleanup() {
    
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

SWGStandardLoginResultData*
SWGStandardLoginResultData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGStandardLoginResultData::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGSuccessLoginResponse", "SWGSuccessLoginResponse");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGStandardLoginResultData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGStandardLoginResultData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGSuccessLoginResponse"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGStandardLoginResultData::getSuccess() {
    return success;
}
void
SWGStandardLoginResultData::setSuccess(bool success) {
    this->success = success;
}

SWGSuccessLoginResponse*
SWGStandardLoginResultData::getMessage() {
    return message;
}
void
SWGStandardLoginResultData::setMessage(SWGSuccessLoginResponse* message) {
    this->message = message;
}

QString*
SWGStandardLoginResultData::getMethod() {
    return method;
}
void
SWGStandardLoginResultData::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGStandardLoginResultData::getTitle() {
    return title;
}
void
SWGStandardLoginResultData::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGStandardLoginResultData::getTime() {
    return time;
}
void
SWGStandardLoginResultData::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

