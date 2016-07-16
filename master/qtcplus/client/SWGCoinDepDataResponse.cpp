
#include "SWGCoinDepDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGCoinDepDataResponse::SWGCoinDepDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGCoinDepDataResponse::SWGCoinDepDataResponse() {
    init();
}

SWGCoinDepDataResponse::~SWGCoinDepDataResponse() {
    this->cleanup();
}

void
SWGCoinDepDataResponse::init() {
    success = false;
message = new QList<SWGCoinDepData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGCoinDepDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGCoinDepData*>* arr = message;
        foreach(SWGCoinDepData* o, *arr) {
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

SWGCoinDepDataResponse*
SWGCoinDepDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGCoinDepDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGCoinDepData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGCoinDepDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGCoinDepDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGCoinDepData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGCoinDepData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGCoinDepDataResponse::getSuccess() {
    return success;
}
void
SWGCoinDepDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGCoinDepData*>*
SWGCoinDepDataResponse::getMessage() {
    return message;
}
void
SWGCoinDepDataResponse::setMessage(QList<SWGCoinDepData*>* message) {
    this->message = message;
}

QString*
SWGCoinDepDataResponse::getMethod() {
    return method;
}
void
SWGCoinDepDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGCoinDepDataResponse::getTitle() {
    return title;
}
void
SWGCoinDepDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGCoinDepDataResponse::getTime() {
    return time;
}
void
SWGCoinDepDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

