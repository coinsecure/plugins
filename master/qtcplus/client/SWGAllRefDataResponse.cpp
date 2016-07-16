
#include "SWGAllRefDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGAllRefDataResponse::SWGAllRefDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGAllRefDataResponse::SWGAllRefDataResponse() {
    init();
}

SWGAllRefDataResponse::~SWGAllRefDataResponse() {
    this->cleanup();
}

void
SWGAllRefDataResponse::init() {
    success = false;
message = new QList<SWGAllRefData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGAllRefDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGAllRefData*>* arr = message;
        foreach(SWGAllRefData* o, *arr) {
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

SWGAllRefDataResponse*
SWGAllRefDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGAllRefDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGAllRefData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGAllRefDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGAllRefDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGAllRefData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGAllRefData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGAllRefDataResponse::getSuccess() {
    return success;
}
void
SWGAllRefDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGAllRefData*>*
SWGAllRefDataResponse::getMessage() {
    return message;
}
void
SWGAllRefDataResponse::setMessage(QList<SWGAllRefData*>* message) {
    this->message = message;
}

QString*
SWGAllRefDataResponse::getMethod() {
    return method;
}
void
SWGAllRefDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGAllRefDataResponse::getTitle() {
    return title;
}
void
SWGAllRefDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGAllRefDataResponse::getTime() {
    return time;
}
void
SWGAllRefDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

