
#include "SWGWalletsDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWalletsDataResponse::SWGWalletsDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWalletsDataResponse::SWGWalletsDataResponse() {
    init();
}

SWGWalletsDataResponse::~SWGWalletsDataResponse() {
    this->cleanup();
}

void
SWGWalletsDataResponse::init() {
    success = false;
message = new QList<SWGWalletsData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGWalletsDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGWalletsData*>* arr = message;
        foreach(SWGWalletsData* o, *arr) {
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

SWGWalletsDataResponse*
SWGWalletsDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWalletsDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGWalletsData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGWalletsDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWalletsDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGWalletsData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGWalletsData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGWalletsDataResponse::getSuccess() {
    return success;
}
void
SWGWalletsDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGWalletsData*>*
SWGWalletsDataResponse::getMessage() {
    return message;
}
void
SWGWalletsDataResponse::setMessage(QList<SWGWalletsData*>* message) {
    this->message = message;
}

QString*
SWGWalletsDataResponse::getMethod() {
    return method;
}
void
SWGWalletsDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGWalletsDataResponse::getTitle() {
    return title;
}
void
SWGWalletsDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGWalletsDataResponse::getTime() {
    return time;
}
void
SWGWalletsDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

