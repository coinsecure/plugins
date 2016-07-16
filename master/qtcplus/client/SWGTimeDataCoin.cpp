
#include "SWGTimeDataCoin.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTimeDataCoin::SWGTimeDataCoin(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTimeDataCoin::SWGTimeDataCoin() {
    init();
}

SWGTimeDataCoin::~SWGTimeDataCoin() {
    this->cleanup();
}

void
SWGTimeDataCoin::init() {
    time = 0L;
verifiedTime = 0L;
}

void
SWGTimeDataCoin::cleanup() {
    

}

SWGTimeDataCoin*
SWGTimeDataCoin::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTimeDataCoin::fromJsonObject(QJsonObject &pJson) {
    setValue(&time, pJson["time"], "qint64", "");
setValue(&verifiedTime, pJson["verifiedTime"], "qint64", "");
}

QString
SWGTimeDataCoin::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTimeDataCoin::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("time", QJsonValue(time));
obj->insert("verifiedTime", QJsonValue(verifiedTime));

    return obj;
}

qint64
SWGTimeDataCoin::getTime() {
    return time;
}
void
SWGTimeDataCoin::setTime(qint64 time) {
    this->time = time;
}

qint64
SWGTimeDataCoin::getVerifiedTime() {
    return verifiedTime;
}
void
SWGTimeDataCoin::setVerifiedTime(qint64 verifiedTime) {
    this->verifiedTime = verifiedTime;
}



} /* namespace Swagger */

