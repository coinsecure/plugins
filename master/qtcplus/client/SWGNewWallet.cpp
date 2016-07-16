
#include "SWGNewWallet.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGNewWallet::SWGNewWallet(QString* json) {
    init();
    this->fromJson(*json);
}

SWGNewWallet::SWGNewWallet() {
    init();
}

SWGNewWallet::~SWGNewWallet() {
    this->cleanup();
}

void
SWGNewWallet::init() {
    walletName = new QString("");
info = new QString("");
}

void
SWGNewWallet::cleanup() {
    if(walletName != NULL) {
        delete walletName;
    }
if(info != NULL) {
        delete info;
    }
}

SWGNewWallet*
SWGNewWallet::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGNewWallet::fromJsonObject(QJsonObject &pJson) {
    setValue(&walletName, pJson["walletName"], "QString", "QString");
setValue(&info, pJson["info"], "QString", "QString");
}

QString
SWGNewWallet::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGNewWallet::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("walletName"), walletName, obj, QString("QString"));
    
        

    
    toJsonValue(QString("info"), info, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGNewWallet::getWalletName() {
    return walletName;
}
void
SWGNewWallet::setWalletName(QString* walletName) {
    this->walletName = walletName;
}

QString*
SWGNewWallet::getInfo() {
    return info;
}
void
SWGNewWallet::setInfo(QString* info) {
    this->info = info;
}



} /* namespace Swagger */

