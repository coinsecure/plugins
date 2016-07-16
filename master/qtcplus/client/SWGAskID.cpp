
#include "SWGAskID.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGAskID::SWGAskID(QString* json) {
    init();
    this->fromJson(*json);
}

SWGAskID::SWGAskID() {
    init();
}

SWGAskID::~SWGAskID() {
    this->cleanup();
}

void
SWGAskID::init() {
    askID = new QString("");
}

void
SWGAskID::cleanup() {
    if(askID != NULL) {
        delete askID;
    }
}

SWGAskID*
SWGAskID::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGAskID::fromJsonObject(QJsonObject &pJson) {
    setValue(&askID, pJson["askID"], "QString", "QString");
}

QString
SWGAskID::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGAskID::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("askID"), askID, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGAskID::getAskID() {
    return askID;
}
void
SWGAskID::setAskID(QString* askID) {
    this->askID = askID;
}



} /* namespace Swagger */

