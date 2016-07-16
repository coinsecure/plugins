
#include "SWGTradeCoinWithdrawDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTradeCoinWithdrawDataResponse::SWGTradeCoinWithdrawDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTradeCoinWithdrawDataResponse::SWGTradeCoinWithdrawDataResponse() {
    init();
}

SWGTradeCoinWithdrawDataResponse::~SWGTradeCoinWithdrawDataResponse() {
    this->cleanup();
}

void
SWGTradeCoinWithdrawDataResponse::init() {
    success = false;
message = new QList<SWGTradeCoinWithdrawData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGTradeCoinWithdrawDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGTradeCoinWithdrawData*>* arr = message;
        foreach(SWGTradeCoinWithdrawData* o, *arr) {
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

SWGTradeCoinWithdrawDataResponse*
SWGTradeCoinWithdrawDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTradeCoinWithdrawDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGTradeCoinWithdrawData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGTradeCoinWithdrawDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTradeCoinWithdrawDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGTradeCoinWithdrawData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGTradeCoinWithdrawData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGTradeCoinWithdrawDataResponse::getSuccess() {
    return success;
}
void
SWGTradeCoinWithdrawDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGTradeCoinWithdrawData*>*
SWGTradeCoinWithdrawDataResponse::getMessage() {
    return message;
}
void
SWGTradeCoinWithdrawDataResponse::setMessage(QList<SWGTradeCoinWithdrawData*>* message) {
    this->message = message;
}

QString*
SWGTradeCoinWithdrawDataResponse::getMethod() {
    return method;
}
void
SWGTradeCoinWithdrawDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGTradeCoinWithdrawDataResponse::getTitle() {
    return title;
}
void
SWGTradeCoinWithdrawDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGTradeCoinWithdrawDataResponse::getTime() {
    return time;
}
void
SWGTradeCoinWithdrawDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

