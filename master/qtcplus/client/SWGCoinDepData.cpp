
#include "SWGCoinDepData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGCoinDepData::SWGCoinDepData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGCoinDepData::SWGCoinDepData() {
    init();
}

SWGCoinDepData::~SWGCoinDepData() {
    this->cleanup();
}

void
SWGCoinDepData::init() {
    timeDetails = new SWGTimeDataCoin();
address = new QString("");
value = 0L;
txHash = new QString("");
depositID = new QString("");
reason = new QString("");
}

void
SWGCoinDepData::cleanup() {
    if(timeDetails != NULL) {
        delete timeDetails;
    }
if(address != NULL) {
        delete address;
    }

if(txHash != NULL) {
        delete txHash;
    }
if(depositID != NULL) {
        delete depositID;
    }
if(reason != NULL) {
        delete reason;
    }
}

SWGCoinDepData*
SWGCoinDepData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGCoinDepData::fromJsonObject(QJsonObject &pJson) {
    setValue(&timeDetails, pJson["timeDetails"], "SWGTimeDataCoin", "SWGTimeDataCoin");
setValue(&address, pJson["address"], "QString", "QString");
setValue(&value, pJson["value"], "qint64", "");
setValue(&txHash, pJson["txHash"], "QString", "QString");
setValue(&depositID, pJson["depositID"], "QString", "QString");
setValue(&reason, pJson["reason"], "QString", "QString");
}

QString
SWGCoinDepData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGCoinDepData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("timeDetails"), timeDetails, obj, QString("SWGTimeDataCoin"));
    
        

    
    toJsonValue(QString("address"), address, obj, QString("QString"));
    
        
obj->insert("value", QJsonValue(value));

    
    toJsonValue(QString("txHash"), txHash, obj, QString("QString"));
    
        

    
    toJsonValue(QString("depositID"), depositID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("reason"), reason, obj, QString("QString"));
    
        

    return obj;
}

SWGTimeDataCoin*
SWGCoinDepData::getTimeDetails() {
    return timeDetails;
}
void
SWGCoinDepData::setTimeDetails(SWGTimeDataCoin* timeDetails) {
    this->timeDetails = timeDetails;
}

QString*
SWGCoinDepData::getAddress() {
    return address;
}
void
SWGCoinDepData::setAddress(QString* address) {
    this->address = address;
}

qint64
SWGCoinDepData::getValue() {
    return value;
}
void
SWGCoinDepData::setValue(qint64 value) {
    this->value = value;
}

QString*
SWGCoinDepData::getTxHash() {
    return txHash;
}
void
SWGCoinDepData::setTxHash(QString* txHash) {
    this->txHash = txHash;
}

QString*
SWGCoinDepData::getDepositID() {
    return depositID;
}
void
SWGCoinDepData::setDepositID(QString* depositID) {
    this->depositID = depositID;
}

QString*
SWGCoinDepData::getReason() {
    return reason;
}
void
SWGCoinDepData::setReason(QString* reason) {
    this->reason = reason;
}



} /* namespace Swagger */

