
#include "SWGSuccessLoginResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccessLoginResponse::SWGSuccessLoginResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccessLoginResponse::SWGSuccessLoginResponse() {
    init();
}

SWGSuccessLoginResponse::~SWGSuccessLoginResponse() {
    this->cleanup();
}

void
SWGSuccessLoginResponse::init() {
    info = new QString("");
keyType = new QString("");
keyNeeded = new QString("");
}

void
SWGSuccessLoginResponse::cleanup() {
    if(info != NULL) {
        delete info;
    }
if(keyType != NULL) {
        delete keyType;
    }
if(keyNeeded != NULL) {
        delete keyNeeded;
    }
}

SWGSuccessLoginResponse*
SWGSuccessLoginResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccessLoginResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&info, pJson["info"], "QString", "QString");
setValue(&keyType, pJson["keyType"], "QString", "QString");
setValue(&keyNeeded, pJson["keyNeeded"], "QString", "QString");
}

QString
SWGSuccessLoginResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccessLoginResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("info"), info, obj, QString("QString"));
    
        

    
    toJsonValue(QString("keyType"), keyType, obj, QString("QString"));
    
        

    
    toJsonValue(QString("keyNeeded"), keyNeeded, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGSuccessLoginResponse::getInfo() {
    return info;
}
void
SWGSuccessLoginResponse::setInfo(QString* info) {
    this->info = info;
}

QString*
SWGSuccessLoginResponse::getKeyType() {
    return keyType;
}
void
SWGSuccessLoginResponse::setKeyType(QString* keyType) {
    this->keyType = keyType;
}

QString*
SWGSuccessLoginResponse::getKeyNeeded() {
    return keyNeeded;
}
void
SWGSuccessLoginResponse::setKeyNeeded(QString* keyNeeded) {
    this->keyNeeded = keyNeeded;
}



} /* namespace Swagger */

