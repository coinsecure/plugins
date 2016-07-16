
#include "SWGNewAddress.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGNewAddress::SWGNewAddress(QString* json) {
    init();
    this->fromJson(*json);
}

SWGNewAddress::SWGNewAddress() {
    init();
}

SWGNewAddress::~SWGNewAddress() {
    this->cleanup();
}

void
SWGNewAddress::init() {
    walletID = new QString("");
info = new QString("");
}

void
SWGNewAddress::cleanup() {
    if(walletID != NULL) {
        delete walletID;
    }
if(info != NULL) {
        delete info;
    }
}

SWGNewAddress*
SWGNewAddress::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGNewAddress::fromJsonObject(QJsonObject &pJson) {
    setValue(&walletID, pJson["walletID"], "QString", "QString");
setValue(&info, pJson["info"], "QString", "QString");
}

QString
SWGNewAddress::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGNewAddress::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("walletID"), walletID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("info"), info, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGNewAddress::getWalletID() {
    return walletID;
}
void
SWGNewAddress::setWalletID(QString* walletID) {
    this->walletID = walletID;
}

QString*
SWGNewAddress::getInfo() {
    return info;
}
void
SWGNewAddress::setInfo(QString* info) {
    this->info = info;
}



} /* namespace Swagger */

