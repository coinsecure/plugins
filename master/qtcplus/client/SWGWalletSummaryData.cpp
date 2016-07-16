
#include "SWGWalletSummaryData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWalletSummaryData::SWGWalletSummaryData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWalletSummaryData::SWGWalletSummaryData() {
    init();
}

SWGWalletSummaryData::~SWGWalletSummaryData() {
    this->cleanup();
}

void
SWGWalletSummaryData::init() {
    walletConfirmedBalance = 0L;
walletUncofirmedBalance = 0L;
hasWalletNetki = false;
walletNetki = new QString("");
walletNetkiAddress = new QString("");
walletNetkiWalletId = new QString("");
}

void
SWGWalletSummaryData::cleanup() {
    


if(walletNetki != NULL) {
        delete walletNetki;
    }
if(walletNetkiAddress != NULL) {
        delete walletNetkiAddress;
    }
if(walletNetkiWalletId != NULL) {
        delete walletNetkiWalletId;
    }
}

SWGWalletSummaryData*
SWGWalletSummaryData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWalletSummaryData::fromJsonObject(QJsonObject &pJson) {
    setValue(&walletConfirmedBalance, pJson["walletConfirmedBalance"], "qint64", "");
setValue(&walletUncofirmedBalance, pJson["walletUncofirmedBalance"], "qint64", "");
setValue(&hasWalletNetki, pJson["hasWalletNetki"], "bool", "");
setValue(&walletNetki, pJson["walletNetki"], "QString", "QString");
setValue(&walletNetkiAddress, pJson["walletNetkiAddress"], "QString", "QString");
setValue(&walletNetkiWalletId, pJson["walletNetkiWalletId"], "QString", "QString");
}

QString
SWGWalletSummaryData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWalletSummaryData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("walletConfirmedBalance", QJsonValue(walletConfirmedBalance));
obj->insert("walletUncofirmedBalance", QJsonValue(walletUncofirmedBalance));
obj->insert("hasWalletNetki", QJsonValue(hasWalletNetki));

    
    toJsonValue(QString("walletNetki"), walletNetki, obj, QString("QString"));
    
        

    
    toJsonValue(QString("walletNetkiAddress"), walletNetkiAddress, obj, QString("QString"));
    
        

    
    toJsonValue(QString("walletNetkiWalletId"), walletNetkiWalletId, obj, QString("QString"));
    
        

    return obj;
}

qint64
SWGWalletSummaryData::getWalletConfirmedBalance() {
    return walletConfirmedBalance;
}
void
SWGWalletSummaryData::setWalletConfirmedBalance(qint64 walletConfirmedBalance) {
    this->walletConfirmedBalance = walletConfirmedBalance;
}

qint64
SWGWalletSummaryData::getWalletUncofirmedBalance() {
    return walletUncofirmedBalance;
}
void
SWGWalletSummaryData::setWalletUncofirmedBalance(qint64 walletUncofirmedBalance) {
    this->walletUncofirmedBalance = walletUncofirmedBalance;
}

bool
SWGWalletSummaryData::getHasWalletNetki() {
    return hasWalletNetki;
}
void
SWGWalletSummaryData::setHasWalletNetki(bool hasWalletNetki) {
    this->hasWalletNetki = hasWalletNetki;
}

QString*
SWGWalletSummaryData::getWalletNetki() {
    return walletNetki;
}
void
SWGWalletSummaryData::setWalletNetki(QString* walletNetki) {
    this->walletNetki = walletNetki;
}

QString*
SWGWalletSummaryData::getWalletNetkiAddress() {
    return walletNetkiAddress;
}
void
SWGWalletSummaryData::setWalletNetkiAddress(QString* walletNetkiAddress) {
    this->walletNetkiAddress = walletNetkiAddress;
}

QString*
SWGWalletSummaryData::getWalletNetkiWalletId() {
    return walletNetkiWalletId;
}
void
SWGWalletSummaryData::setWalletNetkiWalletId(QString* walletNetkiWalletId) {
    this->walletNetkiWalletId = walletNetkiWalletId;
}



} /* namespace Swagger */

