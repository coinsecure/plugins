
#include "SWGRateDiffDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGRateDiffDataResponse::SWGRateDiffDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGRateDiffDataResponse::SWGRateDiffDataResponse() {
    init();
}

SWGRateDiffDataResponse::~SWGRateDiffDataResponse() {
    this->cleanup();
}

void
SWGRateDiffDataResponse::init() {
    success = false;
message = new SWGRateDiffData();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGRateDiffDataResponse::cleanup() {
    
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

SWGRateDiffDataResponse*
SWGRateDiffDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGRateDiffDataResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "SWGRateDiffData", "SWGRateDiffData");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGRateDiffDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGRateDiffDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    toJsonValue(QString("message"), message, obj, QString("SWGRateDiffData"));
    
        

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGRateDiffDataResponse::getSuccess() {
    return success;
}
void
SWGRateDiffDataResponse::setSuccess(bool success) {
    this->success = success;
}

SWGRateDiffData*
SWGRateDiffDataResponse::getMessage() {
    return message;
}
void
SWGRateDiffDataResponse::setMessage(SWGRateDiffData* message) {
    this->message = message;
}

QString*
SWGRateDiffDataResponse::getMethod() {
    return method;
}
void
SWGRateDiffDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGRateDiffDataResponse::getTitle() {
    return title;
}
void
SWGRateDiffDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGRateDiffDataResponse::getTime() {
    return time;
}
void
SWGRateDiffDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

