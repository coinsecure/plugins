
#include "SWGOrderData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGOrderData::SWGOrderData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGOrderData::SWGOrderData() {
    init();
}

SWGOrderData::~SWGOrderData() {
    this->cleanup();
}

void
SWGOrderData::init() {
    time = 0L;
rate = 0L;
vol = 0L;
orderID = new QString("");
status = new QString("");
}

void
SWGOrderData::cleanup() {
    


if(orderID != NULL) {
        delete orderID;
    }
if(status != NULL) {
        delete status;
    }
}

SWGOrderData*
SWGOrderData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGOrderData::fromJsonObject(QJsonObject &pJson) {
    setValue(&time, pJson["time"], "qint64", "");
setValue(&rate, pJson["rate"], "qint64", "");
setValue(&vol, pJson["vol"], "qint64", "");
setValue(&orderID, pJson["orderID"], "QString", "QString");
setValue(&status, pJson["status"], "QString", "QString");
}

QString
SWGOrderData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGOrderData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("time", QJsonValue(time));
obj->insert("rate", QJsonValue(rate));
obj->insert("vol", QJsonValue(vol));

    
    toJsonValue(QString("orderID"), orderID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("status"), status, obj, QString("QString"));
    
        

    return obj;
}

qint64
SWGOrderData::getTime() {
    return time;
}
void
SWGOrderData::setTime(qint64 time) {
    this->time = time;
}

qint64
SWGOrderData::getRate() {
    return rate;
}
void
SWGOrderData::setRate(qint64 rate) {
    this->rate = rate;
}

qint64
SWGOrderData::getVol() {
    return vol;
}
void
SWGOrderData::setVol(qint64 vol) {
    this->vol = vol;
}

QString*
SWGOrderData::getOrderID() {
    return orderID;
}
void
SWGOrderData::setOrderID(QString* orderID) {
    this->orderID = orderID;
}

QString*
SWGOrderData::getStatus() {
    return status;
}
void
SWGOrderData::setStatus(QString* status) {
    this->status = status;
}



} /* namespace Swagger */

