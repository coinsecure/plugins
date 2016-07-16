
#include "SWGSuccCoinRefDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccCoinRefDataResponse::SWGSuccCoinRefDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccCoinRefDataResponse::SWGSuccCoinRefDataResponse() {
    init();
}

SWGSuccCoinRefDataResponse::~SWGSuccCoinRefDataResponse() {
    this->cleanup();
}

void
SWGSuccCoinRefDataResponse::init() {
    success = false;
message = new QList<SWGSuccCoinRefData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGSuccCoinRefDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGSuccCoinRefData*>* arr = message;
        foreach(SWGSuccCoinRefData* o, *arr) {
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

SWGSuccCoinRefDataResponse*
SWGSuccCoinRefDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccCoinRefDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGSuccCoinRefData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGSuccCoinRefDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccCoinRefDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGSuccCoinRefData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGSuccCoinRefData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGSuccCoinRefDataResponse::getSuccess() {
    return success;
}
void
SWGSuccCoinRefDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGSuccCoinRefData*>*
SWGSuccCoinRefDataResponse::getMessage() {
    return message;
}
void
SWGSuccCoinRefDataResponse::setMessage(QList<SWGSuccCoinRefData*>* message) {
    this->message = message;
}

QString*
SWGSuccCoinRefDataResponse::getMethod() {
    return method;
}
void
SWGSuccCoinRefDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGSuccCoinRefDataResponse::getTitle() {
    return title;
}
void
SWGSuccCoinRefDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGSuccCoinRefDataResponse::getTime() {
    return time;
}
void
SWGSuccCoinRefDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

