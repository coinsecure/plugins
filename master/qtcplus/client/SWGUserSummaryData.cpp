
#include "SWGUserSummaryData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGUserSummaryData::SWGUserSummaryData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGUserSummaryData::SWGUserSummaryData() {
    init();
}

SWGUserSummaryData::~SWGUserSummaryData() {
    this->cleanup();
}

void
SWGUserSummaryData::init() {
    kycStatus = new QString("");
bankLinkStatus = new QString("");
tradeReady = new QString("");
isDisabledAccount = false;
faSecure = new QString("");
hasPhone = new QString("");
}

void
SWGUserSummaryData::cleanup() {
    if(kycStatus != NULL) {
        delete kycStatus;
    }
if(bankLinkStatus != NULL) {
        delete bankLinkStatus;
    }
if(tradeReady != NULL) {
        delete tradeReady;
    }

if(faSecure != NULL) {
        delete faSecure;
    }
if(hasPhone != NULL) {
        delete hasPhone;
    }
}

SWGUserSummaryData*
SWGUserSummaryData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGUserSummaryData::fromJsonObject(QJsonObject &pJson) {
    setValue(&kycStatus, pJson["kycStatus"], "QString", "QString");
setValue(&bankLinkStatus, pJson["bankLinkStatus"], "QString", "QString");
setValue(&tradeReady, pJson["tradeReady"], "QString", "QString");
setValue(&isDisabledAccount, pJson["isDisabledAccount"], "bool", "");
setValue(&faSecure, pJson["faSecure"], "QString", "QString");
setValue(&hasPhone, pJson["hasPhone"], "QString", "QString");
}

QString
SWGUserSummaryData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGUserSummaryData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("kycStatus"), kycStatus, obj, QString("QString"));
    
        

    
    toJsonValue(QString("bankLinkStatus"), bankLinkStatus, obj, QString("QString"));
    
        

    
    toJsonValue(QString("tradeReady"), tradeReady, obj, QString("QString"));
    
        
obj->insert("isDisabledAccount", QJsonValue(isDisabledAccount));

    
    toJsonValue(QString("faSecure"), faSecure, obj, QString("QString"));
    
        

    
    toJsonValue(QString("hasPhone"), hasPhone, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGUserSummaryData::getKycStatus() {
    return kycStatus;
}
void
SWGUserSummaryData::setKycStatus(QString* kycStatus) {
    this->kycStatus = kycStatus;
}

QString*
SWGUserSummaryData::getBankLinkStatus() {
    return bankLinkStatus;
}
void
SWGUserSummaryData::setBankLinkStatus(QString* bankLinkStatus) {
    this->bankLinkStatus = bankLinkStatus;
}

QString*
SWGUserSummaryData::getTradeReady() {
    return tradeReady;
}
void
SWGUserSummaryData::setTradeReady(QString* tradeReady) {
    this->tradeReady = tradeReady;
}

bool
SWGUserSummaryData::getIsDisabledAccount() {
    return isDisabledAccount;
}
void
SWGUserSummaryData::setIsDisabledAccount(bool isDisabledAccount) {
    this->isDisabledAccount = isDisabledAccount;
}

QString*
SWGUserSummaryData::getFaSecure() {
    return faSecure;
}
void
SWGUserSummaryData::setFaSecure(QString* faSecure) {
    this->faSecure = faSecure;
}

QString*
SWGUserSummaryData::getHasPhone() {
    return hasPhone;
}
void
SWGUserSummaryData::setHasPhone(QString* hasPhone) {
    this->hasPhone = hasPhone;
}



} /* namespace Swagger */

