
#include "SWGSendExchange.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSendExchange::SWGSendExchange(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSendExchange::SWGSendExchange() {
    init();
}

SWGSendExchange::~SWGSendExchange() {
    this->cleanup();
}

void
SWGSendExchange::init() {
    amt = 0L;
walletID = new QString("");
msg = new QString("");
}

void
SWGSendExchange::cleanup() {
    
if(walletID != NULL) {
        delete walletID;
    }
if(msg != NULL) {
        delete msg;
    }
}

SWGSendExchange*
SWGSendExchange::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSendExchange::fromJsonObject(QJsonObject &pJson) {
    setValue(&amt, pJson["amt"], "qint64", "");
setValue(&walletID, pJson["walletID"], "QString", "QString");
setValue(&msg, pJson["msg"], "QString", "QString");
}

QString
SWGSendExchange::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSendExchange::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("amt", QJsonValue(amt));

    
    toJsonValue(QString("walletID"), walletID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("msg"), msg, obj, QString("QString"));
    
        

    return obj;
}

qint64
SWGSendExchange::getAmt() {
    return amt;
}
void
SWGSendExchange::setAmt(qint64 amt) {
    this->amt = amt;
}

QString*
SWGSendExchange::getWalletID() {
    return walletID;
}
void
SWGSendExchange::setWalletID(QString* walletID) {
    this->walletID = walletID;
}

QString*
SWGSendExchange::getMsg() {
    return msg;
}
void
SWGSendExchange::setMsg(QString* msg) {
    this->msg = msg;
}



} /* namespace Swagger */

