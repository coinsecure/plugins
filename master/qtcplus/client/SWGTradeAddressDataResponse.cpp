
#include "SWGTradeAddressDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTradeAddressDataResponse::SWGTradeAddressDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTradeAddressDataResponse::SWGTradeAddressDataResponse() {
    init();
}

SWGTradeAddressDataResponse::~SWGTradeAddressDataResponse() {
    this->cleanup();
}

void
SWGTradeAddressDataResponse::init() {
    success = false;
message = new QList<SWGTradeAddressData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGTradeAddressDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGTradeAddressData*>* arr = message;
        foreach(SWGTradeAddressData* o, *arr) {
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

SWGTradeAddressDataResponse*
SWGTradeAddressDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTradeAddressDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGTradeAddressData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGTradeAddressDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTradeAddressDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGTradeAddressData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGTradeAddressData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGTradeAddressDataResponse::getSuccess() {
    return success;
}
void
SWGTradeAddressDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGTradeAddressData*>*
SWGTradeAddressDataResponse::getMessage() {
    return message;
}
void
SWGTradeAddressDataResponse::setMessage(QList<SWGTradeAddressData*>* message) {
    this->message = message;
}

QString*
SWGTradeAddressDataResponse::getMethod() {
    return method;
}
void
SWGTradeAddressDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGTradeAddressDataResponse::getTitle() {
    return title;
}
void
SWGTradeAddressDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGTradeAddressDataResponse::getTime() {
    return time;
}
void
SWGTradeAddressDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

