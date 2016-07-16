
#include "SWGWalletsData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWalletsData::SWGWalletsData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWalletsData::SWGWalletsData() {
    init();
}

SWGWalletsData::~SWGWalletsData() {
    this->cleanup();
}

void
SWGWalletsData::init() {
    walletID = new QString("");
name = new QString("");
coinBalance = 0L;
time = 0L;
info = new QString("");
netki = new QString("");
}

void
SWGWalletsData::cleanup() {
    if(walletID != NULL) {
        delete walletID;
    }
if(name != NULL) {
        delete name;
    }


if(info != NULL) {
        delete info;
    }
if(netki != NULL) {
        delete netki;
    }
}

SWGWalletsData*
SWGWalletsData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWalletsData::fromJsonObject(QJsonObject &pJson) {
    setValue(&walletID, pJson["walletID"], "QString", "QString");
setValue(&name, pJson["name"], "QString", "QString");
setValue(&coinBalance, pJson["coinBalance"], "qint64", "");
setValue(&time, pJson["time"], "qint64", "");
setValue(&info, pJson["info"], "QString", "QString");
setValue(&netki, pJson["netki"], "QString", "QString");
}

QString
SWGWalletsData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWalletsData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("walletID"), walletID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("name"), name, obj, QString("QString"));
    
        
obj->insert("coinBalance", QJsonValue(coinBalance));
obj->insert("time", QJsonValue(time));

    
    toJsonValue(QString("info"), info, obj, QString("QString"));
    
        

    
    toJsonValue(QString("netki"), netki, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGWalletsData::getWalletID() {
    return walletID;
}
void
SWGWalletsData::setWalletID(QString* walletID) {
    this->walletID = walletID;
}

QString*
SWGWalletsData::getName() {
    return name;
}
void
SWGWalletsData::setName(QString* name) {
    this->name = name;
}

qint64
SWGWalletsData::getCoinBalance() {
    return coinBalance;
}
void
SWGWalletsData::setCoinBalance(qint64 coinBalance) {
    this->coinBalance = coinBalance;
}

qint64
SWGWalletsData::getTime() {
    return time;
}
void
SWGWalletsData::setTime(qint64 time) {
    this->time = time;
}

QString*
SWGWalletsData::getInfo() {
    return info;
}
void
SWGWalletsData::setInfo(QString* info) {
    this->info = info;
}

QString*
SWGWalletsData::getNetki() {
    return netki;
}
void
SWGWalletsData::setNetki(QString* netki) {
    this->netki = netki;
}



} /* namespace Swagger */

