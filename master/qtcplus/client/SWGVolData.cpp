
#include "SWGVolData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGVolData::SWGVolData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGVolData::SWGVolData() {
    init();
}

SWGVolData::~SWGVolData() {
    this->cleanup();
}

void
SWGVolData::init() {
    vol = 0L;
}

void
SWGVolData::cleanup() {
    
}

SWGVolData*
SWGVolData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGVolData::fromJsonObject(QJsonObject &pJson) {
    setValue(&vol, pJson["vol"], "qint64", "");
}

QString
SWGVolData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGVolData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("vol", QJsonValue(vol));

    return obj;
}

qint64
SWGVolData::getVol() {
    return vol;
}
void
SWGVolData::setVol(qint64 vol) {
    this->vol = vol;
}



} /* namespace Swagger */

