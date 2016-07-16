
#include "SWGFiatDepData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGFiatDepData::SWGFiatDepData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGFiatDepData::SWGFiatDepData() {
    init();
}

SWGFiatDepData::~SWGFiatDepData() {
    this->cleanup();
}

void
SWGFiatDepData::init() {
    timeDetails = new SWGTimeDataCoin();
depositID = new QString("");
value = 0L;
account = new QString("");
reason = new QString("");
}

void
SWGFiatDepData::cleanup() {
    if(timeDetails != NULL) {
        delete timeDetails;
    }
if(depositID != NULL) {
        delete depositID;
    }

if(account != NULL) {
        delete account;
    }
if(reason != NULL) {
        delete reason;
    }
}

SWGFiatDepData*
SWGFiatDepData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGFiatDepData::fromJsonObject(QJsonObject &pJson) {
    setValue(&timeDetails, pJson["timeDetails"], "SWGTimeDataCoin", "SWGTimeDataCoin");
setValue(&depositID, pJson["depositID"], "QString", "QString");
setValue(&value, pJson["value"], "qint64", "");
setValue(&account, pJson["account"], "QString", "QString");
setValue(&reason, pJson["reason"], "QString", "QString");
}

QString
SWGFiatDepData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGFiatDepData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("timeDetails"), timeDetails, obj, QString("SWGTimeDataCoin"));
    
        

    
    toJsonValue(QString("depositID"), depositID, obj, QString("QString"));
    
        
obj->insert("value", QJsonValue(value));

    
    toJsonValue(QString("account"), account, obj, QString("QString"));
    
        

    
    toJsonValue(QString("reason"), reason, obj, QString("QString"));
    
        

    return obj;
}

SWGTimeDataCoin*
SWGFiatDepData::getTimeDetails() {
    return timeDetails;
}
void
SWGFiatDepData::setTimeDetails(SWGTimeDataCoin* timeDetails) {
    this->timeDetails = timeDetails;
}

QString*
SWGFiatDepData::getDepositID() {
    return depositID;
}
void
SWGFiatDepData::setDepositID(QString* depositID) {
    this->depositID = depositID;
}

qint64
SWGFiatDepData::getValue() {
    return value;
}
void
SWGFiatDepData::setValue(qint64 value) {
    this->value = value;
}

QString*
SWGFiatDepData::getAccount() {
    return account;
}
void
SWGFiatDepData::setAccount(QString* account) {
    this->account = account;
}

QString*
SWGFiatDepData::getReason() {
    return reason;
}
void
SWGFiatDepData::setReason(QString* reason) {
    this->reason = reason;
}



} /* namespace Swagger */

