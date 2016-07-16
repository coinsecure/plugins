
#include "SWGSendCoinWallet.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSendCoinWallet::SWGSendCoinWallet(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSendCoinWallet::SWGSendCoinWallet() {
    init();
}

SWGSendCoinWallet::~SWGSendCoinWallet() {
    this->cleanup();
}

void
SWGSendCoinWallet::init() {
    walletID = new QString("");
amt = 0L;
toAddr = new QString("");
msg = new QString("");
pin = new QString("");
}

void
SWGSendCoinWallet::cleanup() {
    if(walletID != NULL) {
        delete walletID;
    }

if(toAddr != NULL) {
        delete toAddr;
    }
if(msg != NULL) {
        delete msg;
    }
if(pin != NULL) {
        delete pin;
    }
}

SWGSendCoinWallet*
SWGSendCoinWallet::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSendCoinWallet::fromJsonObject(QJsonObject &pJson) {
    setValue(&walletID, pJson["walletID"], "QString", "QString");
setValue(&amt, pJson["amt"], "qint64", "");
setValue(&toAddr, pJson["toAddr"], "QString", "QString");
setValue(&msg, pJson["msg"], "QString", "QString");
setValue(&pin, pJson["pin"], "QString", "QString");
}

QString
SWGSendCoinWallet::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSendCoinWallet::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("walletID"), walletID, obj, QString("QString"));
    
        
obj->insert("amt", QJsonValue(amt));

    
    toJsonValue(QString("toAddr"), toAddr, obj, QString("QString"));
    
        

    
    toJsonValue(QString("msg"), msg, obj, QString("QString"));
    
        

    
    toJsonValue(QString("pin"), pin, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGSendCoinWallet::getWalletID() {
    return walletID;
}
void
SWGSendCoinWallet::setWalletID(QString* walletID) {
    this->walletID = walletID;
}

qint64
SWGSendCoinWallet::getAmt() {
    return amt;
}
void
SWGSendCoinWallet::setAmt(qint64 amt) {
    this->amt = amt;
}

QString*
SWGSendCoinWallet::getToAddr() {
    return toAddr;
}
void
SWGSendCoinWallet::setToAddr(QString* toAddr) {
    this->toAddr = toAddr;
}

QString*
SWGSendCoinWallet::getMsg() {
    return msg;
}
void
SWGSendCoinWallet::setMsg(QString* msg) {
    this->msg = msg;
}

QString*
SWGSendCoinWallet::getPin() {
    return pin;
}
void
SWGSendCoinWallet::setPin(QString* pin) {
    this->pin = pin;
}



} /* namespace Swagger */

