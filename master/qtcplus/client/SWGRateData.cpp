
#include "SWGRateData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGRateData::SWGRateData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGRateData::SWGRateData() {
    init();
}

SWGRateData::~SWGRateData() {
    this->cleanup();
}

void
SWGRateData::init() {
    rate = 0L;
}

void
SWGRateData::cleanup() {
    
}

SWGRateData*
SWGRateData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGRateData::fromJsonObject(QJsonObject &pJson) {
    setValue(&rate, pJson["rate"], "qint64", "");
}

QString
SWGRateData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGRateData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("rate", QJsonValue(rate));

    return obj;
}

qint64
SWGRateData::getRate() {
    return rate;
}
void
SWGRateData::setRate(qint64 rate) {
    this->rate = rate;
}



} /* namespace Swagger */

