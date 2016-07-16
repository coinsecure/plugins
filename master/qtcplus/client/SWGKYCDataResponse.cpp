
#include "SWGKYCDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGKYCDataResponse::SWGKYCDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGKYCDataResponse::SWGKYCDataResponse() {
    init();
}

SWGKYCDataResponse::~SWGKYCDataResponse() {
    this->cleanup();
}

void
SWGKYCDataResponse::init() {
    success = false;
message = new QList<SWGKYCData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGKYCDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGKYCData*>* arr = message;
        foreach(SWGKYCData* o, *arr) {
            delete o;
        }
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

SWGKYCDataResponse*
SWGKYCDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGKYCDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGKYCData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGKYCDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGKYCDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGKYCData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGKYCData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGKYCDataResponse::getSuccess() {
    return success;
}
void
SWGKYCDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGKYCData*>*
SWGKYCDataResponse::getMessage() {
    return message;
}
void
SWGKYCDataResponse::setMessage(QList<SWGKYCData*>* message) {
    this->message = message;
}

QString*
SWGKYCDataResponse::getMethod() {
    return method;
}
void
SWGKYCDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGKYCDataResponse::getTitle() {
    return title;
}
void
SWGKYCDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGKYCDataResponse::getTime() {
    return time;
}
void
SWGKYCDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

