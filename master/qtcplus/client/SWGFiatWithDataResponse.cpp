
#include "SWGFiatWithDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGFiatWithDataResponse::SWGFiatWithDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGFiatWithDataResponse::SWGFiatWithDataResponse() {
    init();
}

SWGFiatWithDataResponse::~SWGFiatWithDataResponse() {
    this->cleanup();
}

void
SWGFiatWithDataResponse::init() {
    success = false;
message = new QList<SWGFiatWithData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGFiatWithDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGFiatWithData*>* arr = message;
        foreach(SWGFiatWithData* o, *arr) {
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

SWGFiatWithDataResponse*
SWGFiatWithDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGFiatWithDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGFiatWithData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGFiatWithDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGFiatWithDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGFiatWithData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGFiatWithData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGFiatWithDataResponse::getSuccess() {
    return success;
}
void
SWGFiatWithDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGFiatWithData*>*
SWGFiatWithDataResponse::getMessage() {
    return message;
}
void
SWGFiatWithDataResponse::setMessage(QList<SWGFiatWithData*>* message) {
    this->message = message;
}

QString*
SWGFiatWithDataResponse::getMethod() {
    return method;
}
void
SWGFiatWithDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGFiatWithDataResponse::getTitle() {
    return title;
}
void
SWGFiatWithDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGFiatWithDataResponse::getTime() {
    return time;
}
void
SWGFiatWithDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

