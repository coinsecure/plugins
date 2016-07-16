
#include "SWGDepositID.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGDepositID::SWGDepositID(QString* json) {
    init();
    this->fromJson(*json);
}

SWGDepositID::SWGDepositID() {
    init();
}

SWGDepositID::~SWGDepositID() {
    this->cleanup();
}

void
SWGDepositID::init() {
    depositID = new QString("");
}

void
SWGDepositID::cleanup() {
    if(depositID != NULL) {
        delete depositID;
    }
}

SWGDepositID*
SWGDepositID::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGDepositID::fromJsonObject(QJsonObject &pJson) {
    setValue(&depositID, pJson["depositID"], "QString", "QString");
}

QString
SWGDepositID::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGDepositID::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("depositID"), depositID, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGDepositID::getDepositID() {
    return depositID;
}
void
SWGDepositID::setDepositID(QString* depositID) {
    this->depositID = depositID;
}



} /* namespace Swagger */

