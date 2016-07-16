
#include "SWGStandardTickerResultData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGStandardTickerResultData::SWGStandardTickerResultData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGStandardTickerResultData::SWGStandardTickerResultData() {
    init();
}

SWGStandardTickerResultData::~SWGStandardTickerResultData() {
    this->cleanup();
}

void
SWGStandardTickerResultData::init() {
    success = false;
message = new SWGSuccessTickerResponse();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGStandardTickerResultData::cleanup() {
    
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

SWGStandardTickerResultData*
SWGStandardTickerResultData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGStandardTickerResultData::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGSuccessTickerResponse", "SWGSuccessTickerResponse");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGStandardTickerResultData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGStandardTickerResultData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGSuccessTickerResponse"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGStandardTickerResultData::getSuccess() {
    return success;
}
void
SWGStandardTickerResultData::setSuccess(bool success) {
    this->success = success;
}

SWGSuccessTickerResponse*
SWGStandardTickerResultData::getMessage() {
    return message;
}
void
SWGStandardTickerResultData::setMessage(SWGSuccessTickerResponse* message) {
    this->message = message;
}

QString*
SWGStandardTickerResultData::getMethod() {
    return method;
}
void
SWGStandardTickerResultData::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGStandardTickerResultData::getTitle() {
    return title;
}
void
SWGStandardTickerResultData::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGStandardTickerResultData::getTime() {
    return time;
}
void
SWGStandardTickerResultData::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

