
#include "SWGTradeSummaryDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTradeSummaryDataResponse::SWGTradeSummaryDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTradeSummaryDataResponse::SWGTradeSummaryDataResponse() {
    init();
}

SWGTradeSummaryDataResponse::~SWGTradeSummaryDataResponse() {
    this->cleanup();
}

void
SWGTradeSummaryDataResponse::init() {
    success = false;
message = new SWGTradeSummaryData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGTradeSummaryDataResponse::cleanup() {
    
if(message != NULL) {
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

SWGTradeSummaryDataResponse*
SWGTradeSummaryDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTradeSummaryDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGTradeSummaryData", "SWGTradeSummaryData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGTradeSummaryDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTradeSummaryDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGTradeSummaryData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGTradeSummaryDataResponse::getSuccess() {
    return success;
}
void
SWGTradeSummaryDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGTradeSummaryData*
SWGTradeSummaryDataResponse::getMessage() {
    return message;
}
void
SWGTradeSummaryDataResponse::setMessage(SWGTradeSummaryData* message) {
    this->message = message;
}

QString*
SWGTradeSummaryDataResponse::getMethod() {
    return method;
}
void
SWGTradeSummaryDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGTradeSummaryDataResponse::getTitle() {
    return title;
}
void
SWGTradeSummaryDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGTradeSummaryDataResponse::getTime() {
    return time;
}
void
SWGTradeSummaryDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

