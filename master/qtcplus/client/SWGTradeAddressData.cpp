
#include "SWGTradeAddressData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTradeAddressData::SWGTradeAddressData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTradeAddressData::SWGTradeAddressData() {
    init();
}

SWGTradeAddressData::~SWGTradeAddressData() {
    this->cleanup();
}

void
SWGTradeAddressData::init() {
    address = new QString("");
time = 0L;
info = new QString("");
netki = new QString("");
}

void
SWGTradeAddressData::cleanup() {
    if(address != NULL) {
        delete address;
    }

if(info != NULL) {
        delete info;
    }
if(netki != NULL) {
        delete netki;
    }
}

SWGTradeAddressData*
SWGTradeAddressData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTradeAddressData::fromJsonObject(QJsonObject &pJson) {
    setValue(&address, pJson["address"], "QString", "QString");
setValue(&time, pJson["time"], "qint64", "");
setValue(&info, pJson["info"], "QString", "QString");
setValue(&netki, pJson["netki"], "QString", "QString");
}

QString
SWGTradeAddressData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTradeAddressData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("address"), address, obj, QString("QString"));
    
        
obj->insert("time", QJsonValue(time));

    
    toJsonValue(QString("info"), info, obj, QString("QString"));
    
        

    
    toJsonValue(QString("netki"), netki, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGTradeAddressData::getAddress() {
    return address;
}
void
SWGTradeAddressData::setAddress(QString* address) {
    this->address = address;
}

qint64
SWGTradeAddressData::getTime() {
    return time;
}
void
SWGTradeAddressData::setTime(qint64 time) {
    this->time = time;
}

QString*
SWGTradeAddressData::getInfo() {
    return info;
}
void
SWGTradeAddressData::setInfo(QString* info) {
    this->info = info;
}

QString*
SWGTradeAddressData::getNetki() {
    return netki;
}
void
SWGTradeAddressData::setNetki(QString* netki) {
    this->netki = netki;
}



} /* namespace Swagger */

