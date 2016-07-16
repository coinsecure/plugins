
#include "SWGChangePassword.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGChangePassword::SWGChangePassword(QString* json) {
    init();
    this->fromJson(*json);
}

SWGChangePassword::SWGChangePassword() {
    init();
}

SWGChangePassword::~SWGChangePassword() {
    this->cleanup();
}

void
SWGChangePassword::init() {
    password = new QString("");
repeatPassword = new QString("");
}

void
SWGChangePassword::cleanup() {
    if(password != NULL) {
        delete password;
    }
if(repeatPassword != NULL) {
        delete repeatPassword;
    }
}

SWGChangePassword*
SWGChangePassword::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGChangePassword::fromJsonObject(QJsonObject &pJson) {
    setValue(&password, pJson["password"], "QString", "QString");
setValue(&repeatPassword, pJson["repeatPassword"], "QString", "QString");
}

QString
SWGChangePassword::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGChangePassword::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("password"), password, obj, QString("QString"));
    
        

    
    toJsonValue(QString("repeatPassword"), repeatPassword, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGChangePassword::getPassword() {
    return password;
}
void
SWGChangePassword::setPassword(QString* password) {
    this->password = password;
}

QString*
SWGChangePassword::getRepeatPassword() {
    return repeatPassword;
}
void
SWGChangePassword::setRepeatPassword(QString* repeatPassword) {
    this->repeatPassword = repeatPassword;
}



} /* namespace Swagger */

