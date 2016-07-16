
#include "SWGDoubleDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGDoubleDataResponse::SWGDoubleDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGDoubleDataResponse::SWGDoubleDataResponse() {
    init();
}

SWGDoubleDataResponse::~SWGDoubleDataResponse() {
    this->cleanup();
}

void
SWGDoubleDataResponse::init() {
    success = false;
message = new SWGDoubleData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGDoubleDataResponse::cleanup() {
    
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

SWGDoubleDataResponse*
SWGDoubleDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGDoubleDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGDoubleData", "SWGDoubleData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGDoubleDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGDoubleDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGDoubleData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGDoubleDataResponse::getSuccess() {
    return success;
}
void
SWGDoubleDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGDoubleData*
SWGDoubleDataResponse::getMessage() {
    return message;
}
void
SWGDoubleDataResponse::setMessage(SWGDoubleData* message) {
    this->message = message;
}

QString*
SWGDoubleDataResponse::getMethod() {
    return method;
}
void
SWGDoubleDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGDoubleDataResponse::getTitle() {
    return title;
}
void
SWGDoubleDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGDoubleDataResponse::getTime() {
    return time;
}
void
SWGDoubleDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

