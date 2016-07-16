
#include "SWGAddress.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGAddress::SWGAddress(QString* json) {
    init();
    this->fromJson(*json);
}

SWGAddress::SWGAddress() {
    init();
}

SWGAddress::~SWGAddress() {
    this->cleanup();
}

void
SWGAddress::init() {
    address = new QString("");
}

void
SWGAddress::cleanup() {
    if(address != NULL) {
        delete address;
    }
}

SWGAddress*
SWGAddress::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGAddress::fromJsonObject(QJsonObject &pJson) {
    setValue(&address, pJson["address"], "QString", "QString");
}

QString
SWGAddress::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGAddress::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("address"), address, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGAddress::getAddress() {
    return address;
}
void
SWGAddress::setAddress(QString* address) {
    this->address = address;
}



} /* namespace Swagger */

