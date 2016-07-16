
#include "SWGFiatBankDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGFiatBankDataResponse::SWGFiatBankDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGFiatBankDataResponse::SWGFiatBankDataResponse() {
    init();
}

SWGFiatBankDataResponse::~SWGFiatBankDataResponse() {
    this->cleanup();
}

void
SWGFiatBankDataResponse::init() {
    success = false;
message = new QList<SWGFiatBankData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGFiatBankDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGFiatBankData*>* arr = message;
        foreach(SWGFiatBankData* o, *arr) {
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

SWGFiatBankDataResponse*
SWGFiatBankDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGFiatBankDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGFiatBankData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGFiatBankDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGFiatBankDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGFiatBankData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGFiatBankData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGFiatBankDataResponse::getSuccess() {
    return success;
}
void
SWGFiatBankDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGFiatBankData*>*
SWGFiatBankDataResponse::getMessage() {
    return message;
}
void
SWGFiatBankDataResponse::setMessage(QList<SWGFiatBankData*>* message) {
    this->message = message;
}

QString*
SWGFiatBankDataResponse::getMethod() {
    return method;
}
void
SWGFiatBankDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGFiatBankDataResponse::getTitle() {
    return title;
}
void
SWGFiatBankDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGFiatBankDataResponse::getTime() {
    return time;
}
void
SWGFiatBankDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

