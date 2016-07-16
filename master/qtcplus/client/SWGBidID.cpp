
#include "SWGBidID.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGBidID::SWGBidID(QString* json) {
    init();
    this->fromJson(*json);
}

SWGBidID::SWGBidID() {
    init();
}

SWGBidID::~SWGBidID() {
    this->cleanup();
}

void
SWGBidID::init() {
    bidID = new QString("");
}

void
SWGBidID::cleanup() {
    if(bidID != NULL) {
        delete bidID;
    }
}

SWGBidID*
SWGBidID::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGBidID::fromJsonObject(QJsonObject &pJson) {
    setValue(&bidID, pJson["bidID"], "QString", "QString");
}

QString
SWGBidID::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGBidID::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("bidID"), bidID, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGBidID::getBidID() {
    return bidID;
}
void
SWGBidID::setBidID(QString* bidID) {
    this->bidID = bidID;
}



} /* namespace Swagger */

