
#include "SWGMethodCountryMobile.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGMethodCountryMobile::SWGMethodCountryMobile(QString* json) {
    init();
    this->fromJson(*json);
}

SWGMethodCountryMobile::SWGMethodCountryMobile() {
    init();
}

SWGMethodCountryMobile::~SWGMethodCountryMobile() {
    this->cleanup();
}

void
SWGMethodCountryMobile::init() {
    method = new QString("");
countryCode = 0;
phoneNumber = 0L;
}

void
SWGMethodCountryMobile::cleanup() {
    if(method != NULL) {
        delete method;
    }


}

SWGMethodCountryMobile*
SWGMethodCountryMobile::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGMethodCountryMobile::fromJsonObject(QJsonObject &pJson) {
    setValue(&method, pJson["method"], "QString", "QString");
setValue(&countryCode, pJson["countryCode"], "qint32", "");
setValue(&phoneNumber, pJson["phoneNumber"], "qint64", "");
}

QString
SWGMethodCountryMobile::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGMethodCountryMobile::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("method"), method, obj, QString("QString"));
    
        
obj->insert("countryCode", QJsonValue(countryCode));
obj->insert("phoneNumber", QJsonValue(phoneNumber));

    return obj;
}

QString*
SWGMethodCountryMobile::getMethod() {
    return method;
}
void
SWGMethodCountryMobile::setMethod(QString* method) {
    this->method = method;
}

qint32
SWGMethodCountryMobile::getCountryCode() {
    return countryCode;
}
void
SWGMethodCountryMobile::setCountryCode(qint32 countryCode) {
    this->countryCode = countryCode;
}

qint64
SWGMethodCountryMobile::getPhoneNumber() {
    return phoneNumber;
}
void
SWGMethodCountryMobile::setPhoneNumber(qint64 phoneNumber) {
    this->phoneNumber = phoneNumber;
}



} /* namespace Swagger */

