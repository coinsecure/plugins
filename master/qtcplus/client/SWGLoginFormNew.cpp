
#include "SWGLoginFormNew.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGLoginFormNew::SWGLoginFormNew(QString* json) {
    init();
    this->fromJson(*json);
}

SWGLoginFormNew::SWGLoginFormNew() {
    init();
}

SWGLoginFormNew::~SWGLoginFormNew() {
    this->cleanup();
}

void
SWGLoginFormNew::init() {
    email = new QString("");
token = new QString("");
password = new QString("");
gcmCode = new QString("");
pin = new QString("");
}

void
SWGLoginFormNew::cleanup() {
    if(email != NULL) {
        delete email;
    }
if(token != NULL) {
        delete token;
    }
if(password != NULL) {
        delete password;
    }
if(gcmCode != NULL) {
        delete gcmCode;
    }
if(pin != NULL) {
        delete pin;
    }
}

SWGLoginFormNew*
SWGLoginFormNew::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGLoginFormNew::fromJsonObject(QJsonObject &pJson) {
    setValue(&email, pJson["email"], "QString", "QString");
setValue(&token, pJson["token"], "QString", "QString");
setValue(&password, pJson["password"], "QString", "QString");
setValue(&gcmCode, pJson["gcmCode"], "QString", "QString");
setValue(&pin, pJson["pin"], "QString", "QString");
}

QString
SWGLoginFormNew::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGLoginFormNew::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("email"), email, obj, QString("QString"));
    
        

    
    toJsonValue(QString("token"), token, obj, QString("QString"));
    
        

    
    toJsonValue(QString("password"), password, obj, QString("QString"));
    
        

    
    toJsonValue(QString("gcmCode"), gcmCode, obj, QString("QString"));
    
        

    
    toJsonValue(QString("pin"), pin, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGLoginFormNew::getEmail() {
    return email;
}
void
SWGLoginFormNew::setEmail(QString* email) {
    this->email = email;
}

QString*
SWGLoginFormNew::getToken() {
    return token;
}
void
SWGLoginFormNew::setToken(QString* token) {
    this->token = token;
}

QString*
SWGLoginFormNew::getPassword() {
    return password;
}
void
SWGLoginFormNew::setPassword(QString* password) {
    this->password = password;
}

QString*
SWGLoginFormNew::getGcmCode() {
    return gcmCode;
}
void
SWGLoginFormNew::setGcmCode(QString* gcmCode) {
    this->gcmCode = gcmCode;
}

QString*
SWGLoginFormNew::getPin() {
    return pin;
}
void
SWGLoginFormNew::setPin(QString* pin) {
    this->pin = pin;
}



} /* namespace Swagger */

