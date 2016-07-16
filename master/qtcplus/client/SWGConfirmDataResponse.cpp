
#include "SWGConfirmDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGConfirmDataResponse::SWGConfirmDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGConfirmDataResponse::SWGConfirmDataResponse() {
    init();
}

SWGConfirmDataResponse::~SWGConfirmDataResponse() {
    this->cleanup();
}

void
SWGConfirmDataResponse::init() {
    success = false;
message = new SWGConfirmData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGConfirmDataResponse::cleanup() {
    
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

SWGConfirmDataResponse*
SWGConfirmDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGConfirmDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGConfirmData", "SWGConfirmData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGConfirmDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGConfirmDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGConfirmData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGConfirmDataResponse::getSuccess() {
    return success;
}
void
SWGConfirmDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGConfirmData*
SWGConfirmDataResponse::getMessage() {
    return message;
}
void
SWGConfirmDataResponse::setMessage(SWGConfirmData* message) {
    this->message = message;
}

QString*
SWGConfirmDataResponse::getMethod() {
    return method;
}
void
SWGConfirmDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGConfirmDataResponse::getTitle() {
    return title;
}
void
SWGConfirmDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGConfirmDataResponse::getTime() {
    return time;
}
void
SWGConfirmDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

