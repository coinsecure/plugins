
#include "SWGSuccessInitiateLoginResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccessInitiateLoginResponse::SWGSuccessInitiateLoginResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccessInitiateLoginResponse::SWGSuccessInitiateLoginResponse() {
    init();
}

SWGSuccessInitiateLoginResponse::~SWGSuccessInitiateLoginResponse() {
    this->cleanup();
}

void
SWGSuccessInitiateLoginResponse::init() {
    info = new QString("");
validTill = 0L;
mfa = new QString("");
token = new QString("");
}

void
SWGSuccessInitiateLoginResponse::cleanup() {
    if(info != NULL) {
        delete info;
    }

if(mfa != NULL) {
        delete mfa;
    }
if(token != NULL) {
        delete token;
    }
}

SWGSuccessInitiateLoginResponse*
SWGSuccessInitiateLoginResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccessInitiateLoginResponse::fromJsonObject(QJsonObject &pJson) {
    setValue(&info, pJson["info"], "QString", "QString");
setValue(&validTill, pJson["validTill"], "qint64", "");
setValue(&mfa, pJson["mfa"], "QString", "QString");
setValue(&token, pJson["token"], "QString", "QString");
}

QString
SWGSuccessInitiateLoginResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccessInitiateLoginResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("info"), info, obj, QString("QString"));
    
        
obj->insert("validTill", QJsonValue(validTill));

    
    toJsonValue(QString("mfa"), mfa, obj, QString("QString"));
    
        

    
    toJsonValue(QString("token"), token, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGSuccessInitiateLoginResponse::getInfo() {
    return info;
}
void
SWGSuccessInitiateLoginResponse::setInfo(QString* info) {
    this->info = info;
}

qint64
SWGSuccessInitiateLoginResponse::getValidTill() {
    return validTill;
}
void
SWGSuccessInitiateLoginResponse::setValidTill(qint64 validTill) {
    this->validTill = validTill;
}

QString*
SWGSuccessInitiateLoginResponse::getMfa() {
    return mfa;
}
void
SWGSuccessInitiateLoginResponse::setMfa(QString* mfa) {
    this->mfa = mfa;
}

QString*
SWGSuccessInitiateLoginResponse::getToken() {
    return token;
}
void
SWGSuccessInitiateLoginResponse::setToken(QString* token) {
    this->token = token;
}



} /* namespace Swagger */

