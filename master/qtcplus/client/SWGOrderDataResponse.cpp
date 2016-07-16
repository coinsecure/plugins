
#include "SWGOrderDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGOrderDataResponse::SWGOrderDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGOrderDataResponse::SWGOrderDataResponse() {
    init();
}

SWGOrderDataResponse::~SWGOrderDataResponse() {
    this->cleanup();
}

void
SWGOrderDataResponse::init() {
    success = false;
message = new QList<SWGOrderData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGOrderDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGOrderData*>* arr = message;
        foreach(SWGOrderData* o, *arr) {
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

SWGOrderDataResponse*
SWGOrderDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGOrderDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGOrderData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGOrderDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGOrderDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGOrderData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGOrderData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGOrderDataResponse::getSuccess() {
    return success;
}
void
SWGOrderDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGOrderData*>*
SWGOrderDataResponse::getMessage() {
    return message;
}
void
SWGOrderDataResponse::setMessage(QList<SWGOrderData*>* message) {
    this->message = message;
}

QString*
SWGOrderDataResponse::getMethod() {
    return method;
}
void
SWGOrderDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGOrderDataResponse::getTitle() {
    return title;
}
void
SWGOrderDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGOrderDataResponse::getTime() {
    return time;
}
void
SWGOrderDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

