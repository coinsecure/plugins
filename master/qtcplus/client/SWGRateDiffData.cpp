
#include "SWGRateDiffData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGRateDiffData::SWGRateDiffData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGRateDiffData::SWGRateDiffData() {
    init();
}

SWGRateDiffData::~SWGRateDiffData() {
    this->cleanup();
}

void
SWGRateDiffData::init() {
    rate = 0L;
difference = 0L;
}

void
SWGRateDiffData::cleanup() {
    

}

SWGRateDiffData*
SWGRateDiffData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGRateDiffData::fromJsonObject(QJsonObject &pJson) {
    setValue(&rate, pJson["rate"], "qint64", "");
setValue(&difference, pJson["difference"], "qint64", "");
}

QString
SWGRateDiffData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGRateDiffData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("rate", QJsonValue(rate));
obj->insert("difference", QJsonValue(difference));

    return obj;
}

qint64
SWGRateDiffData::getRate() {
    return rate;
}
void
SWGRateDiffData::setRate(qint64 rate) {
    this->rate = rate;
}

qint64
SWGRateDiffData::getDifference() {
    return difference;
}
void
SWGRateDiffData::setDifference(qint64 difference) {
    this->difference = difference;
}



} /* namespace Swagger */

