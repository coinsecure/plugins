
#include "SWGNetkiNameAddress.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGNetkiNameAddress::SWGNetkiNameAddress(QString* json) {
    init();
    this->fromJson(*json);
}

SWGNetkiNameAddress::SWGNetkiNameAddress() {
    init();
}

SWGNetkiNameAddress::~SWGNetkiNameAddress() {
    this->cleanup();
}

void
SWGNetkiNameAddress::init() {
    netkiName = new QString("");
address = new QString("");
}

void
SWGNetkiNameAddress::cleanup() {
    if(netkiName != NULL) {
        delete netkiName;
    }
if(address != NULL) {
        delete address;
    }
}

SWGNetkiNameAddress*
SWGNetkiNameAddress::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGNetkiNameAddress::fromJsonObject(QJsonObject &pJson) {
    setValue(&netkiName, pJson["netkiName"], "QString", "QString");
setValue(&address, pJson["address"], "QString", "QString");
}

QString
SWGNetkiNameAddress::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGNetkiNameAddress::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("netkiName"), netkiName, obj, QString("QString"));
    
        

    
    toJsonValue(QString("address"), address, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGNetkiNameAddress::getNetkiName() {
    return netkiName;
}
void
SWGNetkiNameAddress::setNetkiName(QString* netkiName) {
    this->netkiName = netkiName;
}

QString*
SWGNetkiNameAddress::getAddress() {
    return address;
}
void
SWGNetkiNameAddress::setAddress(QString* address) {
    this->address = address;
}



} /* namespace Swagger */

