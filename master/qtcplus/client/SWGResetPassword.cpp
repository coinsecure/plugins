
#include "SWGResetPassword.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGResetPassword::SWGResetPassword(QString* json) {
    init();
    this->fromJson(*json);
}

SWGResetPassword::SWGResetPassword() {
    init();
}

SWGResetPassword::~SWGResetPassword() {
    this->cleanup();
}

void
SWGResetPassword::init() {
    token = new QString("");
password = new QString("");
repeatPassword = new QString("");
}

void
SWGResetPassword::cleanup() {
    if(token != NULL) {
        delete token;
    }
if(password != NULL) {
        delete password;
    }
if(repeatPassword != NULL) {
        delete repeatPassword;
    }
}

SWGResetPassword*
SWGResetPassword::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGResetPassword::fromJsonObject(QJsonObject &pJson) {
    setValue(&token, pJson["token"], "QString", "QString");
setValue(&password, pJson["password"], "QString", "QString");
setValue(&repeatPassword, pJson["repeatPassword"], "QString", "QString");
}

QString
SWGResetPassword::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGResetPassword::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("token"), token, obj, QString("QString"));
    
        

    
    toJsonValue(QString("password"), password, obj, QString("QString"));
    
        

    
    toJsonValue(QString("repeatPassword"), repeatPassword, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGResetPassword::getToken() {
    return token;
}
void
SWGResetPassword::setToken(QString* token) {
    this->token = token;
}

QString*
SWGResetPassword::getPassword() {
    return password;
}
void
SWGResetPassword::setPassword(QString* password) {
    this->password = password;
}

QString*
SWGResetPassword::getRepeatPassword() {
    return repeatPassword;
}
void
SWGResetPassword::setRepeatPassword(QString* repeatPassword) {
    this->repeatPassword = repeatPassword;
}



} /* namespace Swagger */

