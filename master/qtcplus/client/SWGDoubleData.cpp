
#include "SWGDoubleData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGDoubleData::SWGDoubleData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGDoubleData::SWGDoubleData() {
    init();
}

SWGDoubleData::~SWGDoubleData() {
    this->cleanup();
}

void
SWGDoubleData::init() {
    percent = 0.0;
}

void
SWGDoubleData::cleanup() {
    
}

SWGDoubleData*
SWGDoubleData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGDoubleData::fromJsonObject(QJsonObject &pJson) {
    setValue(&percent, pJson["percent"], "double", "");
}

QString
SWGDoubleData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGDoubleData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("percent", QJsonValue(percent));

    return obj;
}

double
SWGDoubleData::getPercent() {
    return percent;
}
void
SWGDoubleData::setPercent(double percent) {
    this->percent = percent;
}



} /* namespace Swagger */

