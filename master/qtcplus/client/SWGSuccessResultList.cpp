
#include "SWGSuccessResultList.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccessResultList::SWGSuccessResultList(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccessResultList::SWGSuccessResultList() {
    init();
}

SWGSuccessResultList::~SWGSuccessResultList() {
    this->cleanup();
}

void
SWGSuccessResultList::init() {
    success = false;
message = new QList<QString*>();
method = new QString("");
title = new QString("");
time = NULL;
}

void
SWGSuccessResultList::cleanup() {
    
if(message != NULL) {
        QList<QString*>* arr = message;
        foreach(QString* o, *arr) {
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

SWGSuccessResultList*
SWGSuccessResultList::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccessResultList::fromJsonObject(QJsonObject &pJson) {
    setValue(&success, pJson["success"], "bool", "");
setValue(&message, pJson["message"], "QList", "QString");
setValue(&method, pJson["method"], "QString", "QString");
setValue(&title, pJson["title"], "QString", "QString");
setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGSuccessResultList::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccessResultList::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("success", QJsonValue(success));

    
    QList<QString*>* messageList = message;
    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "QString");

    obj->insert("message", messageJsonArray);
    

    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        

    
    toJsonValue(QString("title"), title, obj, QString("QString"));
    
        

    
    toJsonValue(QString("time"), time, obj, QString("QDateTime"));
    
        

    return obj;
}

bool
SWGSuccessResultList::getSuccess() {
    return success;
}
void
SWGSuccessResultList::setSuccess(bool success) {
    this->success = success;
}

QList<QString*>*
SWGSuccessResultList::getMessage() {
    return message;
}
void
SWGSuccessResultList::setMessage(QList<QString*>* message) {
    this->message = message;
}

QString*
SWGSuccessResultList::getMethod() {
    return method;
}
void
SWGSuccessResultList::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGSuccessResultList::getTitle() {
    return title;
}
void
SWGSuccessResultList::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGSuccessResultList::getTime() {
    return time;
}
void
SWGSuccessResultList::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

