
#include "SWGNewFiatBankDeposit.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGNewFiatBankDeposit::SWGNewFiatBankDeposit(QString* json) {
    init();
    this->fromJson(*json);
}

SWGNewFiatBankDeposit::SWGNewFiatBankDeposit() {
    init();
}

SWGNewFiatBankDeposit::~SWGNewFiatBankDeposit() {
    this->cleanup();
}

void
SWGNewFiatBankDeposit::init() {
    amount = 0L;
message = new QString("");
bank = new QString("");
depType = new QString("");
}

void
SWGNewFiatBankDeposit::cleanup() {
    
if(message != NULL) {
        delete message;
    }
if(bank != NULL) {
        delete bank;
    }
if(depType != NULL) {
        delete depType;
    }
}

SWGNewFiatBankDeposit*
SWGNewFiatBankDeposit::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGNewFiatBankDeposit::fromJsonObject(QJsonObject &pJson) {
    setValue(&amount, pJson["amount"], "qint64", "");
setValue(&message, pJson["message"], "QString", "QString");
setValue(&bank, pJson["bank"], "QString", "QString");
setValue(&depType, pJson["depType"], "QString", "QString");
}

QString
SWGNewFiatBankDeposit::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGNewFiatBankDeposit::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("amount", QJsonValue(amount));

    
    toJsonValue(QString("message"), message, obj, QString("QString"));
    
        

    
    toJsonValue(QString("bank"), bank, obj, QString("QString"));
    
        

    
    toJsonValue(QString("depType"), depType, obj, QString("QString"));
    
        

    return obj;
}

qint64
SWGNewFiatBankDeposit::getAmount() {
    return amount;
}
void
SWGNewFiatBankDeposit::setAmount(qint64 amount) {
    this->amount = amount;
}

QString*
SWGNewFiatBankDeposit::getMessage() {
    return message;
}
void
SWGNewFiatBankDeposit::setMessage(QString* message) {
    this->message = message;
}

QString*
SWGNewFiatBankDeposit::getBank() {
    return bank;
}
void
SWGNewFiatBankDeposit::setBank(QString* bank) {
    this->bank = bank;
}

QString*
SWGNewFiatBankDeposit::getDepType() {
    return depType;
}
void
SWGNewFiatBankDeposit::setDepType(QString* depType) {
    this->depType = depType;
}



} /* namespace Swagger */

