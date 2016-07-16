
#include "SWGNumberOtp.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGNumberOtp::SWGNumberOtp(QString* json) {
    init();
    this->fromJson(*json);
}

SWGNumberOtp::SWGNumberOtp() {
    init();
}

SWGNumberOtp::~SWGNumberOtp() {
    this->cleanup();
}

void
SWGNumberOtp::init() {
    number = new QString("");
otp = new QString("");
}

void
SWGNumberOtp::cleanup() {
    if(number != NULL) {
        delete number;
    }
if(otp != NULL) {
        delete otp;
    }
}

SWGNumberOtp*
SWGNumberOtp::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGNumberOtp::fromJsonObject(QJsonObject &pJson) {
    setValue(&number, pJson["number"], "QString", "QString");
setValue(&otp, pJson["otp"], "QString", "QString");
}

QString
SWGNumberOtp::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGNumberOtp::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("number"), number, obj, QString("QString"));
    
        

    
    toJsonValue(QString("otp"), otp, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGNumberOtp::getNumber() {
    return number;
}
void
SWGNumberOtp::setNumber(QString* number) {
    this->number = number;
}

QString*
SWGNumberOtp::getOtp() {
    return otp;
}
void
SWGNumberOtp::setOtp(QString* otp) {
    this->otp = otp;
}



} /* namespace Swagger */

