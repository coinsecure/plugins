
#include "SWGNetkiName.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGNetkiName::SWGNetkiName(QString* json) {
    init();
    this->fromJson(*json);
}

SWGNetkiName::SWGNetkiName() {
    init();
}

SWGNetkiName::~SWGNetkiName() {
    this->cleanup();
}

void
SWGNetkiName::init() {
    netkiName = new QString("");
}

void
SWGNetkiName::cleanup() {
    if(netkiName != NULL) {
        delete netkiName;
    }
}

SWGNetkiName*
SWGNetkiName::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGNetkiName::fromJsonObject(QJsonObject &pJson) {
    setValue(&netkiName, pJson["netkiName"], "QString", "QString");
}

QString
SWGNetkiName::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGNetkiName::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("netkiName"), netkiName, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGNetkiName::getNetkiName() {
    return netkiName;
}
void
SWGNetkiName::setNetkiName(QString* netkiName) {
    this->netkiName = netkiName;
}



} /* namespace Swagger */

