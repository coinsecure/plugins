
#include "SWGRateVolData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGRateVolData::SWGRateVolData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGRateVolData::SWGRateVolData() {
    init();
}

SWGRateVolData::~SWGRateVolData() {
    this->cleanup();
}

void
SWGRateVolData::init() {
    rate = 0L;
vol = 0L;
}

void
SWGRateVolData::cleanup() {
    

}

SWGRateVolData*
SWGRateVolData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGRateVolData::fromJsonObject(QJsonObject &pJson) {
    setValue(&rate, pJson["rate"], "qint64", "");
setValue(&vol, pJson["vol"], "qint64", "");
}

QString
SWGRateVolData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGRateVolData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("rate", QJsonValue(rate));
obj->insert("vol", QJsonValue(vol));

    return obj;
}

qint64
SWGRateVolData::getRate() {
    return rate;
}
void
SWGRateVolData::setRate(qint64 rate) {
    this->rate = rate;
}

qint64
SWGRateVolData::getVol() {
    return vol;
}
void
SWGRateVolData::setVol(qint64 vol) {
    this->vol = vol;
}



} /* namespace Swagger */

