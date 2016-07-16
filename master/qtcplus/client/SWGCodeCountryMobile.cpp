
#include "SWGCodeCountryMobile.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGCodeCountryMobile::SWGCodeCountryMobile(QString* json) {
    init();
    this->fromJson(*json);
}

SWGCodeCountryMobile::SWGCodeCountryMobile() {
    init();
}

SWGCodeCountryMobile::~SWGCodeCountryMobile() {
    this->cleanup();
}

void
SWGCodeCountryMobile::init() {
    code = new QString("");
countryCode = 0;
phoneNumber = 0L;
}

void
SWGCodeCountryMobile::cleanup() {
    if(code != NULL) {
        delete code;
    }


}

SWGCodeCountryMobile*
SWGCodeCountryMobile::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGCodeCountryMobile::fromJsonObject(QJsonObject &pJson) {
    setValue(&code, pJson["code"], "QString", "QString");
setValue(&countryCode, pJson["countryCode"], "qint32", "");
setValue(&phoneNumber, pJson["phoneNumber"], "qint64", "");
}

QString
SWGCodeCountryMobile::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGCodeCountryMobile::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("code"), code, obj, QString("QString"));
    
        
obj->insert("countryCode", QJsonValue(countryCode));
obj->insert("phoneNumber", QJsonValue(phoneNumber));

    return obj;
}

QString*
SWGCodeCountryMobile::getCode() {
    return code;
}
void
SWGCodeCountryMobile::setCode(QString* code) {
    this->code = code;
}

qint32
SWGCodeCountryMobile::getCountryCode() {
    return countryCode;
}
void
SWGCodeCountryMobile::setCountryCode(qint32 countryCode) {
    this->countryCode = countryCode;
}

qint64
SWGCodeCountryMobile::getPhoneNumber() {
    return phoneNumber;
}
void
SWGCodeCountryMobile::setPhoneNumber(qint64 phoneNumber) {
    this->phoneNumber = phoneNumber;
}



} /* namespace Swagger */

