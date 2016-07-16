
#include "SWGSuccRefDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccRefDataResponse::SWGSuccRefDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccRefDataResponse::SWGSuccRefDataResponse() {
    init();
}

SWGSuccRefDataResponse::~SWGSuccRefDataResponse() {
    this->cleanup();
}

void
SWGSuccRefDataResponse::init() {
    success = false;
message = new QList<SWGSuccRefData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGSuccRefDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGSuccRefData*>* arr = message;
        foreach(SWGSuccRefData* o, *arr) {
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

SWGSuccRefDataResponse*
SWGSuccRefDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccRefDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGSuccRefData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGSuccRefDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccRefDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGSuccRefData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGSuccRefData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGSuccRefDataResponse::getSuccess() {
    return success;
}
void
SWGSuccRefDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGSuccRefData*>*
SWGSuccRefDataResponse::getMessage() {
    return message;
}
void
SWGSuccRefDataResponse::setMessage(QList<SWGSuccRefData*>* message) {
    this->message = message;
}

QString*
SWGSuccRefDataResponse::getMethod() {
    return method;
}
void
SWGSuccRefDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGSuccRefDataResponse::getTitle() {
    return title;
}
void
SWGSuccRefDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGSuccRefDataResponse::getTime() {
    return time;
}
void
SWGSuccRefDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

