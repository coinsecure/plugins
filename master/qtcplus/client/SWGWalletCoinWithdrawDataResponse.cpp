
#include "SWGWalletCoinWithdrawDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWalletCoinWithdrawDataResponse::SWGWalletCoinWithdrawDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWalletCoinWithdrawDataResponse::SWGWalletCoinWithdrawDataResponse() {
    init();
}

SWGWalletCoinWithdrawDataResponse::~SWGWalletCoinWithdrawDataResponse() {
    this->cleanup();
}

void
SWGWalletCoinWithdrawDataResponse::init() {
    success = false;
message = new QList<SWGWalletCoinWithdrawData*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGWalletCoinWithdrawDataResponse::cleanup() {
    
if(message != NULL) {
        QList<SWGWalletCoinWithdrawData*>* arr = message;
        foreach(SWGWalletCoinWithdrawData* o, *arr) {
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

SWGWalletCoinWithdrawDataResponse*
SWGWalletCoinWithdrawDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWalletCoinWithdrawDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "SWGWalletCoinWithdrawData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGWalletCoinWithdrawDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWalletCoinWithdrawDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<SWGWalletCoinWithdrawData*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGWalletCoinWithdrawData");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGWalletCoinWithdrawDataResponse::getSuccess() {
    return success;
}
void
SWGWalletCoinWithdrawDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGWalletCoinWithdrawData*>*
SWGWalletCoinWithdrawDataResponse::getMessage() {
    return message;
}
void
SWGWalletCoinWithdrawDataResponse::setMessage(QList<SWGWalletCoinWithdrawData*>* message) {
    this->message = message;
}

QString*
SWGWalletCoinWithdrawDataResponse::getMethod() {
    return method;
}
void
SWGWalletCoinWithdrawDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGWalletCoinWithdrawDataResponse::getTitle() {
    return title;
}
void
SWGWalletCoinWithdrawDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGWalletCoinWithdrawDataResponse::getTime() {
    return time;
}
void
SWGWalletCoinWithdrawDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

