
#include "SWGLoginId.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGLoginId::SWGLoginId(QString* json) {
    init();
    this->fromJson(*json);
}

SWGLoginId::SWGLoginId() {
    init();
}

SWGLoginId::~SWGLoginId() {
    this->cleanup();
}

void
SWGLoginId::init() {
    loginID = new QString("");
}

void
SWGLoginId::cleanup() {
    if(loginID != NULL) {
        delete loginID;
    }
}

SWGLoginId*
SWGLoginId::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGLoginId::fromJsonObject(QJsonObject &pJson) {
    setValue(&loginID, pJson["loginID"], "QString", "QString");
}

QString
SWGLoginId::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGLoginId::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("loginID"), loginID, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGLoginId::getLoginID() {
    return loginID;
}
void
SWGLoginId::setLoginID(QString* loginID) {
    this->loginID = loginID;
}



} /* namespace Swagger */

