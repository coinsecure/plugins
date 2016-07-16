
#include "SWGWalletCoinWithdrawData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWalletCoinWithdrawData::SWGWalletCoinWithdrawData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWalletCoinWithdrawData::SWGWalletCoinWithdrawData() {
    init();
}

SWGWalletCoinWithdrawData::~SWGWalletCoinWithdrawData() {
    this->cleanup();
}

void
SWGWalletCoinWithdrawData::init() {
    timeDetails = new SWGTimeData();
txID = new QString("");
message = new QString("");
satoshis = 0L;
walletID = new QString("");
withdrawID = new QString("");
sentTo = new QString("");
}

void
SWGWalletCoinWithdrawData::cleanup() {
    if(timeDetails != NULL) {
        delete timeDetails;
    }
if(txID != NULL) {
        delete txID;
    }
if(message != NULL) {
        delete message;
    }

if(walletID != NULL) {
        delete walletID;
    }
if(withdrawID != NULL) {
        delete withdrawID;
    }
if(sentTo != NULL) {
        delete sentTo;
    }
}

SWGWalletCoinWithdrawData*
SWGWalletCoinWithdrawData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWalletCoinWithdrawData::fromJsonObject(QJsonObject &pJson) {
    setValue(&timeDetails, pJson["timeDetails"], "SWGTimeData", "SWGTimeData");
setValue(&txID, pJson["txID"], "QString", "QString");
setValue(&message, pJson["message"], "QString", "QString");
setValue(&satoshis, pJson["satoshis"], "qint64", "");
setValue(&walletID, pJson["walletID"], "QString", "QString");
setValue(&withdrawID, pJson["withdrawID"], "QString", "QString");
setValue(&sentTo, pJson["sentTo"], "QString", "QString");
}

QString
SWGWalletCoinWithdrawData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWalletCoinWithdrawData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("timeDetails"), timeDetails, obj, QString("SWGTimeData"));
    
        

    
    toJsonValue(QString("txID"), txID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("message"), message, obj, QString("QString"));
    
        
obj->insert("satoshis", QJsonValue(satoshis));

    
    toJsonValue(QString("walletID"), walletID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("withdrawID"), withdrawID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("sentTo"), sentTo, obj, QString("QString"));
    
        

    return obj;
}

SWGTimeData*
SWGWalletCoinWithdrawData::getTimeDetails() {
    return timeDetails;
}
void
SWGWalletCoinWithdrawData::setTimeDetails(SWGTimeData* timeDetails) {
    this->timeDetails = timeDetails;
}

QString*
SWGWalletCoinWithdrawData::getTxID() {
    return txID;
}
void
SWGWalletCoinWithdrawData::setTxID(QString* txID) {
    this->txID = txID;
}

QString*
SWGWalletCoinWithdrawData::getMessage() {
    return message;
}
void
SWGWalletCoinWithdrawData::setMessage(QString* message) {
    this->message = message;
}

qint64
SWGWalletCoinWithdrawData::getSatoshis() {
    return satoshis;
}
void
SWGWalletCoinWithdrawData::setSatoshis(qint64 satoshis) {
    this->satoshis = satoshis;
}

QString*
SWGWalletCoinWithdrawData::getWalletID() {
    return walletID;
}
void
SWGWalletCoinWithdrawData::setWalletID(QString* walletID) {
    this->walletID = walletID;
}

QString*
SWGWalletCoinWithdrawData::getWithdrawID() {
    return withdrawID;
}
void
SWGWalletCoinWithdrawData::setWithdrawID(QString* withdrawID) {
    this->withdrawID = withdrawID;
}

QString*
SWGWalletCoinWithdrawData::getSentTo() {
    return sentTo;
}
void
SWGWalletCoinWithdrawData::setSentTo(QString* sentTo) {
    this->sentTo = sentTo;
}



} /* namespace Swagger */

