
#include "SWGLastTradeData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGLastTradeData::SWGLastTradeData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGLastTradeData::SWGLastTradeData() {
    init();
}

SWGLastTradeData::~SWGLastTradeData() {
    this->cleanup();
}

void
SWGLastTradeData::init() {
    time = 0L;
avgRate = 0L;
vol = 0L;
ordType = new QString("");
}

void
SWGLastTradeData::cleanup() {
    


if(ordType != NULL) {
        delete ordType;
    }
}

SWGLastTradeData*
SWGLastTradeData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGLastTradeData::fromJsonObject(QJsonObject &pJson) {
    setValue(&time, pJson["time"], "qint64", "");
setValue(&avgRate, pJson["avgRate"], "qint64", "");
setValue(&vol, pJson["vol"], "qint64", "");
setValue(&ordType, pJson["ordType"], "QString", "QString");
}

QString
SWGLastTradeData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGLastTradeData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("time", QJsonValue(time));
obj->insert("avgRate", QJsonValue(avgRate));
obj->insert("vol", QJsonValue(vol));

    
    toJsonValue(QString("ordType"), ordType, obj, QString("QString"));
    
        

    return obj;
}

qint64
SWGLastTradeData::getTime() {
    return time;
}
void
SWGLastTradeData::setTime(qint64 time) {
    this->time = time;
}

qint64
SWGLastTradeData::getAvgRate() {
    return avgRate;
}
void
SWGLastTradeData::setAvgRate(qint64 avgRate) {
    this->avgRate = avgRate;
}

qint64
SWGLastTradeData::getVol() {
    return vol;
}
void
SWGLastTradeData::setVol(qint64 vol) {
    this->vol = vol;
}

QString*
SWGLastTradeData::getOrdType() {
    return ordType;
}
void
SWGLastTradeData::setOrdType(QString* ordType) {
    this->ordType = ordType;
}



} /* namespace Swagger */

