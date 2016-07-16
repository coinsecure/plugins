
#include "SWGWithdrawFiat.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWithdrawFiat::SWGWithdrawFiat(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWithdrawFiat::SWGWithdrawFiat() {
    init();
}

SWGWithdrawFiat::~SWGWithdrawFiat() {
    this->cleanup();
}

void
SWGWithdrawFiat::init() {
    fiat = 0L;
account = new QString("");
msg = new QString("");
pin = new QString("");
}

void
SWGWithdrawFiat::cleanup() {
    
if(account != NULL) {
        delete account;
    }
if(msg != NULL) {
        delete msg;
    }
if(pin != NULL) {
        delete pin;
    }
}

SWGWithdrawFiat*
SWGWithdrawFiat::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWithdrawFiat::fromJsonObject(QJsonObject &pJson) {
    setValue(&fiat, pJson["fiat"], "qint64", "");
setValue(&account, pJson["account"], "QString", "QString");
setValue(&msg, pJson["msg"], "QString", "QString");
setValue(&pin, pJson["pin"], "QString", "QString");
}

QString
SWGWithdrawFiat::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWithdrawFiat::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("fiat", QJsonValue(fiat));

    
    toJsonValue(QString("account"), account, obj, QString("QString"));
    
        

    
    toJsonValue(QString("msg"), msg, obj, QString("QString"));
    
        

    
    toJsonValue(QString("pin"), pin, obj, QString("QString"));
    
        

    return obj;
}

qint64
SWGWithdrawFiat::getFiat() {
    return fiat;
}
void
SWGWithdrawFiat::setFiat(qint64 fiat) {
    this->fiat = fiat;
}

QString*
SWGWithdrawFiat::getAccount() {
    return account;
}
void
SWGWithdrawFiat::setAccount(QString* account) {
    this->account = account;
}

QString*
SWGWithdrawFiat::getMsg() {
    return msg;
}
void
SWGWithdrawFiat::setMsg(QString* msg) {
    this->msg = msg;
}

QString*
SWGWithdrawFiat::getPin() {
    return pin;
}
void
SWGWithdrawFiat::setPin(QString* pin) {
    this->pin = pin;
}



} /* namespace Swagger */

