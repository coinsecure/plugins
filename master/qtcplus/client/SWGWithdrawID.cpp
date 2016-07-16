
#include "SWGWithdrawID.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWithdrawID::SWGWithdrawID(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWithdrawID::SWGWithdrawID() {
    init();
}

SWGWithdrawID::~SWGWithdrawID() {
    this->cleanup();
}

void
SWGWithdrawID::init() {
    withdrawID = new QString("");
}

void
SWGWithdrawID::cleanup() {
    if(withdrawID != NULL) {
        delete withdrawID;
    }
}

SWGWithdrawID*
SWGWithdrawID::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWithdrawID::fromJsonObject(QJsonObject &pJson) {
    setValue(&withdrawID, pJson["withdrawID"], "QString", "QString");
}

QString
SWGWithdrawID::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWithdrawID::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("withdrawID"), withdrawID, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGWithdrawID::getWithdrawID() {
    return withdrawID;
}
void
SWGWithdrawID::setWithdrawID(QString* withdrawID) {
    this->withdrawID = withdrawID;
}



} /* namespace Swagger */

