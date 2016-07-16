
#include "SWGStandardInitiateLoginResultData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGStandardInitiateLoginResultData::SWGStandardInitiateLoginResultData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGStandardInitiateLoginResultData::SWGStandardInitiateLoginResultData() {
    init();
}

SWGStandardInitiateLoginResultData::~SWGStandardInitiateLoginResultData() {
    this->cleanup();
}

void
SWGStandardInitiateLoginResultData::init() {
    success = false;
message = new SWGSuccessInitiateLoginResponse();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGStandardInitiateLoginResultData::cleanup() {
    
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

SWGStandardInitiateLoginResultData*
SWGStandardInitiateLoginResultData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGStandardInitiateLoginResultData::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGSuccessInitiateLoginResponse", "SWGSuccessInitiateLoginResponse");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGStandardInitiateLoginResultData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGStandardInitiateLoginResultData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGSuccessInitiateLoginResponse"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGStandardInitiateLoginResultData::getSuccess() {
    return success;
}
void
SWGStandardInitiateLoginResultData::setSuccess(bool success) {
    this->success = success;
}

SWGSuccessInitiateLoginResponse*
SWGStandardInitiateLoginResultData::getMessage() {
    return message;
}
void
SWGStandardInitiateLoginResultData::setMessage(SWGSuccessInitiateLoginResponse* message) {
    this->message = message;
}

QString*
SWGStandardInitiateLoginResultData::getMethod() {
    return method;
}
void
SWGStandardInitiateLoginResultData::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGStandardInitiateLoginResultData::getTitle() {
    return title;
}
void
SWGStandardInitiateLoginResultData::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGStandardInitiateLoginResultData::getTime() {
    return time;
}
void
SWGStandardInitiateLoginResultData::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

