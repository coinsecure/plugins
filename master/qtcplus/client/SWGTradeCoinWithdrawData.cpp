
#include "SWGTradeCoinWithdrawData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTradeCoinWithdrawData::SWGTradeCoinWithdrawData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTradeCoinWithdrawData::SWGTradeCoinWithdrawData() {
    init();
}

SWGTradeCoinWithdrawData::~SWGTradeCoinWithdrawData() {
    this->cleanup();
}

void
SWGTradeCoinWithdrawData::init() {
    timeDetails = new SWGTimeData();
address = new QString("");
value = 0L;
fees = 0L;
withdrawID = new QString("");
txHash = new QString("");
}

void
SWGTradeCoinWithdrawData::cleanup() {
    if(timeDetails != NULL) {
        delete timeDetails;
    }
if(address != NULL) {
        delete address;
    }


if(withdrawID != NULL) {
        delete withdrawID;
    }
if(txHash != NULL) {
        delete txHash;
    }
}

SWGTradeCoinWithdrawData*
SWGTradeCoinWithdrawData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTradeCoinWithdrawData::fromJsonObject(QJsonObject &pJson) {
    setValue(&timeDetails, pJson["timeDetails"], "SWGTimeData", "SWGTimeData");
setValue(&address, pJson["address"], "QString", "QString");
setValue(&value, pJson["value"], "qint64", "");
setValue(&fees, pJson["fees"], "qint64", "");
setValue(&withdrawID, pJson["withdrawID"], "QString", "QString");
setValue(&txHash, pJson["txHash"], "QString", "QString");
}

QString
SWGTradeCoinWithdrawData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTradeCoinWithdrawData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("timeDetails"), timeDetails, obj, QString("SWGTimeData"));
    
        

    
    toJsonValue(QString("address"), address, obj, QString("QString"));
    
        
obj->insert("value", QJsonValue(value));
obj->insert("fees", QJsonValue(fees));

    
    toJsonValue(QString("withdrawID"), withdrawID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("txHash"), txHash, obj, QString("QString"));
    
        

    return obj;
}

SWGTimeData*
SWGTradeCoinWithdrawData::getTimeDetails() {
    return timeDetails;
}
void
SWGTradeCoinWithdrawData::setTimeDetails(SWGTimeData* timeDetails) {
    this->timeDetails = timeDetails;
}

QString*
SWGTradeCoinWithdrawData::getAddress() {
    return address;
}
void
SWGTradeCoinWithdrawData::setAddress(QString* address) {
    this->address = address;
}

qint64
SWGTradeCoinWithdrawData::getValue() {
    return value;
}
void
SWGTradeCoinWithdrawData::setValue(qint64 value) {
    this->value = value;
}

qint64
SWGTradeCoinWithdrawData::getFees() {
    return fees;
}
void
SWGTradeCoinWithdrawData::setFees(qint64 fees) {
    this->fees = fees;
}

QString*
SWGTradeCoinWithdrawData::getWithdrawID() {
    return withdrawID;
}
void
SWGTradeCoinWithdrawData::setWithdrawID(QString* withdrawID) {
    this->withdrawID = withdrawID;
}

QString*
SWGTradeCoinWithdrawData::getTxHash() {
    return txHash;
}
void
SWGTradeCoinWithdrawData::setTxHash(QString* txHash) {
    this->txHash = txHash;
}



} /* namespace Swagger */

