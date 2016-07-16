
#include "SWGFiatBankData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGFiatBankData::SWGFiatBankData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGFiatBankData::SWGFiatBankData() {
    init();
}

SWGFiatBankData::~SWGFiatBankData() {
    this->cleanup();
}

void
SWGFiatBankData::init() {
    time = 0L;
status = new QString("");
updateTime = 0L;
updateMessage = new QString("");
bankID = new QString("");
info = new QString("");
accountNumber = new QString("");
accountNick = new QString("");
accountType = new QString("");
}

void
SWGFiatBankData::cleanup() {
    
if(status != NULL) {
        delete status;
    }

if(updateMessage != NULL) {
        delete updateMessage;
    }
if(bankID != NULL) {
        delete bankID;
    }
if(info != NULL) {
        delete info;
    }
if(accountNumber != NULL) {
        delete accountNumber;
    }
if(accountNick != NULL) {
        delete accountNick;
    }
if(accountType != NULL) {
        delete accountType;
    }
}

SWGFiatBankData*
SWGFiatBankData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGFiatBankData::fromJsonObject(QJsonObject &pJson) {
    setValue(&time, pJson["time"], "qint64", "");
setValue(&status, pJson["status"], "QString", "QString");
setValue(&updateTime, pJson["updateTime"], "qint64", "");
setValue(&updateMessage, pJson["updateMessage"], "QString", "QString");
setValue(&bankID, pJson["bankID"], "QString", "QString");
setValue(&info, pJson["info"], "QString", "QString");
setValue(&accountNumber, pJson["accountNumber"], "QString", "QString");
setValue(&accountNick, pJson["accountNick"], "QString", "QString");
setValue(&accountType, pJson["accountType"], "QString", "QString");
}

QString
SWGFiatBankData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGFiatBankData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("time", QJsonValue(time));

    
    toJsonValue(QString("status"), status, obj, QString("QString"));
    
        
obj->insert("updateTime", QJsonValue(updateTime));

    
    toJsonValue(QString("updateMessage"), updateMessage, obj, QString("QString"));
    
        

    
    toJsonValue(QString("bankID"), bankID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("info"), info, obj, QString("QString"));
    
        

    
    toJsonValue(QString("accountNumber"), accountNumber, obj, QString("QString"));
    
        

    
    toJsonValue(QString("accountNick"), accountNick, obj, QString("QString"));
    
        

    
    toJsonValue(QString("accountType"), accountType, obj, QString("QString"));
    
        

    return obj;
}

qint64
SWGFiatBankData::getTime() {
    return time;
}
void
SWGFiatBankData::setTime(qint64 time) {
    this->time = time;
}

QString*
SWGFiatBankData::getStatus() {
    return status;
}
void
SWGFiatBankData::setStatus(QString* status) {
    this->status = status;
}

qint64
SWGFiatBankData::getUpdateTime() {
    return updateTime;
}
void
SWGFiatBankData::setUpdateTime(qint64 updateTime) {
    this->updateTime = updateTime;
}

QString*
SWGFiatBankData::getUpdateMessage() {
    return updateMessage;
}
void
SWGFiatBankData::setUpdateMessage(QString* updateMessage) {
    this->updateMessage = updateMessage;
}

QString*
SWGFiatBankData::getBankID() {
    return bankID;
}
void
SWGFiatBankData::setBankID(QString* bankID) {
    this->bankID = bankID;
}

QString*
SWGFiatBankData::getInfo() {
    return info;
}
void
SWGFiatBankData::setInfo(QString* info) {
    this->info = info;
}

QString*
SWGFiatBankData::getAccountNumber() {
    return accountNumber;
}
void
SWGFiatBankData::setAccountNumber(QString* accountNumber) {
    this->accountNumber = accountNumber;
}

QString*
SWGFiatBankData::getAccountNick() {
    return accountNick;
}
void
SWGFiatBankData::setAccountNick(QString* accountNick) {
    this->accountNick = accountNick;
}

QString*
SWGFiatBankData::getAccountType() {
    return accountType;
}
void
SWGFiatBankData::setAccountType(QString* accountType) {
    this->accountType = accountType;
}



} /* namespace Swagger */

