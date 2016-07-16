
#include "SWGAllRefData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGAllRefData::SWGAllRefData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGAllRefData::SWGAllRefData() {
    init();
}

SWGAllRefData::~SWGAllRefData() {
    this->cleanup();
}

void
SWGAllRefData::init() {
    refPercent = 0.0;
time = 0L;
refID = new QString("");
}

void
SWGAllRefData::cleanup() {
    

if(refID != NULL) {
        delete refID;
    }
}

SWGAllRefData*
SWGAllRefData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGAllRefData::fromJsonObject(QJsonObject &pJson) {
    setValue(&refPercent, pJson["refPercent"], "double", "");
setValue(&time, pJson["time"], "qint64", "");
setValue(&refID, pJson["refID"], "QString", "QString");
}

QString
SWGAllRefData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGAllRefData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("refPercent", QJsonValue(refPercent));
obj->insert("time", QJsonValue(time));

    
    toJsonValue(QString("refID"), refID, obj, QString("QString"));
    
        

    return obj;
}

double
SWGAllRefData::getRefPercent() {
    return refPercent;
}
void
SWGAllRefData::setRefPercent(double refPercent) {
    this->refPercent = refPercent;
}

qint64
SWGAllRefData::getTime() {
    return time;
}
void
SWGAllRefData::setTime(qint64 time) {
    this->time = time;
}

QString*
SWGAllRefData::getRefID() {
    return refID;
}
void
SWGAllRefData::setRefID(QString* refID) {
    this->refID = refID;
}



} /* namespace Swagger */

