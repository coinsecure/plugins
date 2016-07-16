
#include "SWGRateVolDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGRateVolDataResponse::SWGRateVolDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGRateVolDataResponse::SWGRateVolDataResponse() {
    init();
}

SWGRateVolDataResponse::~SWGRateVolDataResponse() {
    this->cleanup();
}

void
SWGRateVolDataResponse::init() {
    success = false;
message = new QList<SWGRateVolData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGRateVolDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGRateVolData*>* arr = message;
        foreach(SWGRateVolData* o, *arr) {
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

SWGRateVolDataResponse*
SWGRateVolDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGRateVolDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGRateVolData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGRateVolDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGRateVolDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGRateVolData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGRateVolData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGRateVolDataResponse::getSuccess() {
    return success;
}
void
SWGRateVolDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGRateVolData*>*
SWGRateVolDataResponse::getMessage() {
    return message;
}
void
SWGRateVolDataResponse::setMessage(QList<SWGRateVolData*>* message) {
    this->message = message;
}

QString*
SWGRateVolDataResponse::getMethod() {
    return method;
}
void
SWGRateVolDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGRateVolDataResponse::getTitle() {
    return title;
}
void
SWGRateVolDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGRateVolDataResponse::getTime() {
    return time;
}
void
SWGRateVolDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

