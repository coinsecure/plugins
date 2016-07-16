
#include "SWGTimeData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTimeData::SWGTimeData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTimeData::SWGTimeData() {
    init();
}

SWGTimeData::~SWGTimeData() {
    this->cleanup();
}

void
SWGTimeData::init() {
    time = 0L;
verifiedTime = 0L;
completedTime = 0L;
}

void
SWGTimeData::cleanup() {
    


}

SWGTimeData*
SWGTimeData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTimeData::fromJsonObject(QJsonObject &pJson) {
    setValue(&time, pJson["time"], "qint64", "");
setValue(&verifiedTime, pJson["verifiedTime"], "qint64", "");
setValue(&completedTime, pJson["completedTime"], "qint64", "");
}

QString
SWGTimeData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTimeData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("time", QJsonValue(time));
obj->insert("verifiedTime", QJsonValue(verifiedTime));
obj->insert("completedTime", QJsonValue(completedTime));

    return obj;
}

qint64
SWGTimeData::getTime() {
    return time;
}
void
SWGTimeData::setTime(qint64 time) {
    this->time = time;
}

qint64
SWGTimeData::getVerifiedTime() {
    return verifiedTime;
}
void
SWGTimeData::setVerifiedTime(qint64 verifiedTime) {
    this->verifiedTime = verifiedTime;
}

qint64
SWGTimeData::getCompletedTime() {
    return completedTime;
}
void
SWGTimeData::setCompletedTime(qint64 completedTime) {
    this->completedTime = completedTime;
}



} /* namespace Swagger */

