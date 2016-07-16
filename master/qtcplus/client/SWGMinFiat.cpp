
#include "SWGMinFiat.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGMinFiat::SWGMinFiat(QString* json) {
    init();
    this->fromJson(*json);
}

SWGMinFiat::SWGMinFiat() {
    init();
}

SWGMinFiat::~SWGMinFiat() {
    this->cleanup();
}

void
SWGMinFiat::init() {
    minFiat = 0L;
}

void
SWGMinFiat::cleanup() {
    
}

SWGMinFiat*
SWGMinFiat::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGMinFiat::fromJsonObject(QJsonObject &pJson) {
    setValue(&minFiat, pJson["minFiat"], "qint64", "");
}

QString
SWGMinFiat::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGMinFiat::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("minFiat", QJsonValue(minFiat));

    return obj;
}

qint64
SWGMinFiat::getMinFiat() {
    return minFiat;
}
void
SWGMinFiat::setMinFiat(qint64 minFiat) {
    this->minFiat = minFiat;
}



} /* namespace Swagger */

