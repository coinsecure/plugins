
#include "SWGSendCoin.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSendCoin::SWGSendCoin(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSendCoin::SWGSendCoin() {
    init();
}

SWGSendCoin::~SWGSendCoin() {
    this->cleanup();
}

void
SWGSendCoin::init() {
    satoshis = 0L;
toAddr = new QString("");
msg = new QString("");
pin = new QString("");
}

void
SWGSendCoin::cleanup() {
    
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

SWGSendCoin*
SWGSendCoin::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSendCoin::fromJsonObject(QJsonObject &pJson) {
    setValue(&satoshis, pJson["satoshis"], "qint64", "");
setValue(&toAddr, pJson["toAddr"], "QString", "QString");
setValue(&msg, pJson["msg"], "QString", "QString");
setValue(&pin, pJson["pin"], "QString", "QString");
}

QString
SWGSendCoin::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSendCoin::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("satoshis", QJsonValue(satoshis));

    
    toJsonValue(QString("toAddr"), toAddr, obj, QString("QString"));
    
        

    
    toJsonValue(QString("msg"), msg, obj, QString("QString"));
    
        

    
    toJsonValue(QString("pin"), pin, obj, QString("QString"));
    
        

    return obj;
}

qint64
SWGSendCoin::getSatoshis() {
    return satoshis;
}
void
SWGSendCoin::setSatoshis(qint64 satoshis) {
    this->satoshis = satoshis;
}

QString*
SWGSendCoin::getToAddr() {
    return toAddr;
}
void
SWGSendCoin::setToAddr(QString* toAddr) {
    this->toAddr = toAddr;
}

QString*
SWGSendCoin::getMsg() {
    return msg;
}
void
SWGSendCoin::setMsg(QString* msg) {
    this->msg = msg;
}

QString*
SWGSendCoin::getPin() {
    return pin;
}
void
SWGSendCoin::setPin(QString* pin) {
    this->pin = pin;
}



} /* namespace Swagger */

