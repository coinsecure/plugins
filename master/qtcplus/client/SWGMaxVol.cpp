
#include "SWGMaxVol.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGMaxVol::SWGMaxVol(QString* json) {
    init();
    this->fromJson(*json);
}

SWGMaxVol::SWGMaxVol() {
    init();
}

SWGMaxVol::~SWGMaxVol() {
    this->cleanup();
}

void
SWGMaxVol::init() {
    maxVol = 0L;
}

void
SWGMaxVol::cleanup() {
    
}

SWGMaxVol*
SWGMaxVol::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGMaxVol::fromJsonObject(QJsonObject &pJson) {
    setValue(&maxVol, pJson["maxVol"], "qint64", "");
}

QString
SWGMaxVol::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGMaxVol::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("maxVol", QJsonValue(maxVol));

    return obj;
}

qint64
SWGMaxVol::getMaxVol() {
    return maxVol;
}
void
SWGMaxVol::setMaxVol(qint64 maxVol) {
    this->maxVol = maxVol;
}



} /* namespace Swagger */

