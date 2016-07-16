
#include "SWGWalletAddressDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWalletAddressDataResponse::SWGWalletAddressDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWalletAddressDataResponse::SWGWalletAddressDataResponse() {
    init();
}

SWGWalletAddressDataResponse::~SWGWalletAddressDataResponse() {
    this->cleanup();
}

void
SWGWalletAddressDataResponse::init() {
    success = false;
message = new QList<SWGWalletAddressData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGWalletAddressDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGWalletAddressData*>* arr = message;
        foreach(SWGWalletAddressData* o, *arr) {
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

SWGWalletAddressDataResponse*
SWGWalletAddressDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWalletAddressDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGWalletAddressData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGWalletAddressDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWalletAddressDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGWalletAddressData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGWalletAddressData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGWalletAddressDataResponse::getSuccess() {
    return success;
}
void
SWGWalletAddressDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGWalletAddressData*>*
SWGWalletAddressDataResponse::getMessage() {
    return message;
}
void
SWGWalletAddressDataResponse::setMessage(QList<SWGWalletAddressData*>* message) {
    this->message = message;
}

QString*
SWGWalletAddressDataResponse::getMethod() {
    return method;
}
void
SWGWalletAddressDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGWalletAddressDataResponse::getTitle() {
    return title;
}
void
SWGWalletAddressDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGWalletAddressDataResponse::getTime() {
    return time;
}
void
SWGWalletAddressDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

