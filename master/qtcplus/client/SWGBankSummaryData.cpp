
#include "SWGBankSummaryData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGBankSummaryData::SWGBankSummaryData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGBankSummaryData::SWGBankSummaryData() {
    init();
}

SWGBankSummaryData::~SWGBankSummaryData() {
    this->cleanup();
}

void
SWGBankSummaryData::init() {
    pendingCoinBalance = 0L;
pendingFiatBalance = 0L;
availableCoinBalance = 0L;
availableFiatBalance = 0L;
totalCoinBalance = 0L;
totalFiatBalance = 0L;
coinFeePercentage = 0.0;
fiatFeePercentage = 0.0;
bankLinkStatus = new QString("");
hasTradeNetki = false;
tradeNetkiName = new QString("");
tradeNetkiAddress = new QString("");
}

void
SWGBankSummaryData::cleanup() {
    







if(bankLinkStatus != NULL) {
        delete bankLinkStatus;
    }

if(tradeNetkiName != NULL) {
        delete tradeNetkiName;
    }
if(tradeNetkiAddress != NULL) {
        delete tradeNetkiAddress;
    }
}

SWGBankSummaryData*
SWGBankSummaryData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGBankSummaryData::fromJsonObject(QJsonObject &pJson) {
    setValue(&pendingCoinBalance, pJson["pendingCoinBalance"], "qint64", "");
setValue(&pendingFiatBalance, pJson["pendingFiatBalance"], "qint64", "");
setValue(&availableCoinBalance, pJson["availableCoinBalance"], "qint64", "");
setValue(&availableFiatBalance, pJson["availableFiatBalance"], "qint64", "");
setValue(&totalCoinBalance, pJson["totalCoinBalance"], "qint64", "");
setValue(&totalFiatBalance, pJson["totalFiatBalance"], "qint64", "");
setValue(&coinFeePercentage, pJson["coinFeePercentage"], "double", "");
setValue(&fiatFeePercentage, pJson["fiatFeePercentage"], "double", "");
setValue(&bankLinkStatus, pJson["bankLinkStatus"], "QString", "QString");
setValue(&hasTradeNetki, pJson["hasTradeNetki"], "bool", "");
setValue(&tradeNetkiName, pJson["tradeNetkiName"], "QString", "QString");
setValue(&tradeNetkiAddress, pJson["tradeNetkiAddress"], "QString", "QString");
}

QString
SWGBankSummaryData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGBankSummaryData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("pendingCoinBalance", QJsonValue(pendingCoinBalance));
obj->insert("pendingFiatBalance", QJsonValue(pendingFiatBalance));
obj->insert("availableCoinBalance", QJsonValue(availableCoinBalance));
obj->insert("availableFiatBalance", QJsonValue(availableFiatBalance));
obj->insert("totalCoinBalance", QJsonValue(totalCoinBalance));
obj->insert("totalFiatBalance", QJsonValue(totalFiatBalance));
obj->insert("coinFeePercentage", QJsonValue(coinFeePercentage));
obj->insert("fiatFeePercentage", QJsonValue(fiatFeePercentage));

    
    toJsonValue(QString("bankLinkStatus"), bankLinkStatus, obj, QString("QString"));
    
        
obj->insert("hasTradeNetki", QJsonValue(hasTradeNetki));

    
    toJsonValue(QString("tradeNetkiName"), tradeNetkiName, obj, QString("QString"));
    
        

    
    toJsonValue(QString("tradeNetkiAddress"), tradeNetkiAddress, obj, QString("QString"));
    
        

    return obj;
}

qint64
SWGBankSummaryData::getPendingCoinBalance() {
    return pendingCoinBalance;
}
void
SWGBankSummaryData::setPendingCoinBalance(qint64 pendingCoinBalance) {
    this->pendingCoinBalance = pendingCoinBalance;
}

qint64
SWGBankSummaryData::getPendingFiatBalance() {
    return pendingFiatBalance;
}
void
SWGBankSummaryData::setPendingFiatBalance(qint64 pendingFiatBalance) {
    this->pendingFiatBalance = pendingFiatBalance;
}

qint64
SWGBankSummaryData::getAvailableCoinBalance() {
    return availableCoinBalance;
}
void
SWGBankSummaryData::setAvailableCoinBalance(qint64 availableCoinBalance) {
    this->availableCoinBalance = availableCoinBalance;
}

qint64
SWGBankSummaryData::getAvailableFiatBalance() {
    return availableFiatBalance;
}
void
SWGBankSummaryData::setAvailableFiatBalance(qint64 availableFiatBalance) {
    this->availableFiatBalance = availableFiatBalance;
}

qint64
SWGBankSummaryData::getTotalCoinBalance() {
    return totalCoinBalance;
}
void
SWGBankSummaryData::setTotalCoinBalance(qint64 totalCoinBalance) {
    this->totalCoinBalance = totalCoinBalance;
}

qint64
SWGBankSummaryData::getTotalFiatBalance() {
    return totalFiatBalance;
}
void
SWGBankSummaryData::setTotalFiatBalance(qint64 totalFiatBalance) {
    this->totalFiatBalance = totalFiatBalance;
}

double
SWGBankSummaryData::getCoinFeePercentage() {
    return coinFeePercentage;
}
void
SWGBankSummaryData::setCoinFeePercentage(double coinFeePercentage) {
    this->coinFeePercentage = coinFeePercentage;
}

double
SWGBankSummaryData::getFiatFeePercentage() {
    return fiatFeePercentage;
}
void
SWGBankSummaryData::setFiatFeePercentage(double fiatFeePercentage) {
    this->fiatFeePercentage = fiatFeePercentage;
}

QString*
SWGBankSummaryData::getBankLinkStatus() {
    return bankLinkStatus;
}
void
SWGBankSummaryData::setBankLinkStatus(QString* bankLinkStatus) {
    this->bankLinkStatus = bankLinkStatus;
}

bool
SWGBankSummaryData::getHasTradeNetki() {
    return hasTradeNetki;
}
void
SWGBankSummaryData::setHasTradeNetki(bool hasTradeNetki) {
    this->hasTradeNetki = hasTradeNetki;
}

QString*
SWGBankSummaryData::getTradeNetkiName() {
    return tradeNetkiName;
}
void
SWGBankSummaryData::setTradeNetkiName(QString* tradeNetkiName) {
    this->tradeNetkiName = tradeNetkiName;
}

QString*
SWGBankSummaryData::getTradeNetkiAddress() {
    return tradeNetkiAddress;
}
void
SWGBankSummaryData::setTradeNetkiAddress(QString* tradeNetkiAddress) {
    this->tradeNetkiAddress = tradeNetkiAddress;
}



} /* namespace Swagger */

