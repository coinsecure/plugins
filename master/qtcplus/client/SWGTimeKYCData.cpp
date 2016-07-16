
#include "SWGTimeKYCData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTimeKYCData::SWGTimeKYCData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTimeKYCData::SWGTimeKYCData() {
    init();
}

SWGTimeKYCData::~SWGTimeKYCData() {
    this->cleanup();
}

void
SWGTimeKYCData::init() {
    time = 0L;
updateTime = 0L;
}

void
SWGTimeKYCData::cleanup() {
    

}

SWGTimeKYCData*
SWGTimeKYCData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTimeKYCData::fromJsonObject(QJsonObject &pJson) {
    setValue(&time, pJson["time"], "qint64", "");
setValue(&updateTime, pJson["updateTime"], "qint64", "");
}

QString
SWGTimeKYCData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTimeKYCData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("time", QJsonValue(time));
obj->insert("updateTime", QJsonValue(updateTime));

    return obj;
}

qint64
SWGTimeKYCData::getTime() {
    return time;
}
void
SWGTimeKYCData::setTime(qint64 time) {
    this->time = time;
}

qint64
SWGTimeKYCData::getUpdateTime() {
    return updateTime;
}
void
SWGTimeKYCData::setUpdateTime(qint64 updateTime) {
    this->updateTime = updateTime;
}



} /* namespace Swagger */

