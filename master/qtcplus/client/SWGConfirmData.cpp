
#include "SWGConfirmData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGConfirmData::SWGConfirmData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGConfirmData::SWGConfirmData() {
    init();
}

SWGConfirmData::~SWGConfirmData() {
    this->cleanup();
}

void
SWGConfirmData::init() {
    confirmations = 0L;
}

void
SWGConfirmData::cleanup() {
    
}

SWGConfirmData*
SWGConfirmData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGConfirmData::fromJsonObject(QJsonObject &pJson) {
    setValue(&confirmations, pJson["confirmations"], "qint64", "");
}

QString
SWGConfirmData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGConfirmData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("confirmations", QJsonValue(confirmations));

    return obj;
}

qint64
SWGConfirmData::getConfirmations() {
    return confirmations;
}
void
SWGConfirmData::setConfirmations(qint64 confirmations) {
    this->confirmations = confirmations;
}



} /* namespace Swagger */

