
#include "SWGFiatWithData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGFiatWithData::SWGFiatWithData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGFiatWithData::SWGFiatWithData() {
    init();
}

SWGFiatWithData::~SWGFiatWithData() {
    this->cleanup();
}

void
SWGFiatWithData::init() {
    timeDetails = new SWGTimeDataCoin();
withdrawID = new QString("");
value = 0L;
account = new QString("");
reason = new QString("");
}

void
SWGFiatWithData::cleanup() {
    if(timeDetails != NULL) {
        delete timeDetails;
    }
if(withdrawID != NULL) {
        delete withdrawID;
    }

if(account != NULL) {
        delete account;
    }
if(reason != NULL) {
        delete reason;
    }
}

SWGFiatWithData*
SWGFiatWithData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGFiatWithData::fromJsonObject(QJsonObject &pJson) {
    setValue(&timeDetails, pJson["timeDetails"], "SWGTimeDataCoin", "SWGTimeDataCoin");
setValue(&withdrawID, pJson["withdrawID"], "QString", "QString");
setValue(&value, pJson["value"], "qint64", "");
setValue(&account, pJson["account"], "QString", "QString");
setValue(&reason, pJson["reason"], "QString", "QString");
}

QString
SWGFiatWithData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGFiatWithData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("timeDetails"), timeDetails, obj, QString("SWGTimeDataCoin"));
    
        

    
    toJsonValue(QString("withdrawID"), withdrawID, obj, QString("QString"));
    
        
obj->insert("value", QJsonValue(value));

    
    toJsonValue(QString("account"), account, obj, QString("QString"));
    
        

    
    toJsonValue(QString("reason"), reason, obj, QString("QString"));
    
        

    return obj;
}

SWGTimeDataCoin*
SWGFiatWithData::getTimeDetails() {
    return timeDetails;
}
void
SWGFiatWithData::setTimeDetails(SWGTimeDataCoin* timeDetails) {
    this->timeDetails = timeDetails;
}

QString*
SWGFiatWithData::getWithdrawID() {
    return withdrawID;
}
void
SWGFiatWithData::setWithdrawID(QString* withdrawID) {
    this->withdrawID = withdrawID;
}

qint64
SWGFiatWithData::getValue() {
    return value;
}
void
SWGFiatWithData::setValue(qint64 value) {
    this->value = value;
}

QString*
SWGFiatWithData::getAccount() {
    return account;
}
void
SWGFiatWithData::setAccount(QString* account) {
    this->account = account;
}

QString*
SWGFiatWithData::getReason() {
    return reason;
}
void
SWGFiatWithData::setReason(QString* reason) {
    this->reason = reason;
}



} /* namespace Swagger */

